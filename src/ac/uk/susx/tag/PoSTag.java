

/* First created by JCasGen Wed Mar 20 15:51:19 GMT 2013 */
package ac.uk.susx.tag;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.apache.uima.jcas.tcas.Annotation;


/** 
 * Updated by JCasGen Wed Mar 20 15:51:19 GMT 2013
 * XML source: /Users/jackpay/Documents/workspace/PoSTagAnnotator/desc/PoSTagAnnotatorDescriptor.xml
 * @generated */
public class PoSTag extends Annotation {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(PoSTag.class);
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int type = typeIndexID;
  /** @generated  */
  @Override
  public              int getTypeIndexID() {return typeIndexID;}
 
  /** Never called.  Disable default constructor
   * @generated */
  protected PoSTag() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated */
  public PoSTag(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated */
  public PoSTag(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated */  
  public PoSTag(JCas jcas, int begin, int end) {
    super(jcas);
    setBegin(begin);
    setEnd(end);
    readObject();
  }   

  /** <!-- begin-user-doc -->
    * Write your own initialization here
    * <!-- end-user-doc -->
  @generated modifiable */
  private void readObject() {/*default - does nothing empty block */}
     
 
    
  //*--------------*
  //* Feature: postag

  /** getter for postag - gets 
   * @generated */
  public String getPostag() {
    if (PoSTag_Type.featOkTst && ((PoSTag_Type)jcasType).casFeat_postag == null)
      jcasType.jcas.throwFeatMissing("postag", "ac.uk.susx.tag.PoSTag");
    return jcasType.ll_cas.ll_getStringValue(addr, ((PoSTag_Type)jcasType).casFeatCode_postag);}
    
  /** setter for postag - sets  
   * @generated */
  public void setPostag(String v) {
    if (PoSTag_Type.featOkTst && ((PoSTag_Type)jcasType).casFeat_postag == null)
      jcasType.jcas.throwFeatMissing("postag", "ac.uk.susx.tag.PoSTag");
    jcasType.ll_cas.ll_setStringValue(addr, ((PoSTag_Type)jcasType).casFeatCode_postag, v);}    
  }

    