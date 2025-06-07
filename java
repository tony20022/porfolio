
export default async function render(
  parentNode: FrameNode | PageNode,
  startX: number,
  startY: number
): Promise<FrameNode> {

  // FRAME
  const node_0 = figma.createFrame();
  
  // append
  parentNode.appendChild(node_0);
  
  // layout
  node_0.resize(1730, 3636);
  
  node_0.x = startX;
  node_0.y = startY;
  node_0.constrainProportions = false;
  node_0.constraints = {"horizontal":"MIN","vertical":"MIN"};
  node_0.layoutAlign = 'INHERIT';
  node_0.layoutGrow = 0;
  node_0.layoutPositioning = 'AUTO';
  node_0.rotation = 0;// before frame
  
  // frame
  node_0.layoutMode = 'NONE';
  node_0.primaryAxisSizingMode = 'AUTO';
  node_0.primaryAxisAlignItems = 'MIN';
  node_0.counterAxisAlignItems = 'MIN';
  node_0.counterAxisSizingMode = 'FIXED';
  node_0.paddingLeft = 0;
  node_0.paddingRight = 0;
  node_0.paddingTop = 0;
  node_0.paddingBottom = 0;
  node_0.itemSpacing = 0;
  
  node_0.clipsContent = true;
  
  
  // base
  node_0.name = 'Desktop - 1';
  // scene
  
  // blend
  node_0.blendMode = 'PASS_THROUGH';
  node_0.effects = [];
  node_0.isMask = false;
  // geometry
node_0.fills = [{"type":"SOLID","visible":true,"opacity":1,"blendMode":"NORMAL","color":{"r":0.4787120819091797,"g":0.5341600775718689,"b":0.7163461446762085},"boundVariables":{}}]
node_0.strokeWeight = 0;
  
  // ELLIPSE
  const node_1 = figma.createEllipse();
  
  // append
  node_0.appendChild(node_1);
  node_1.arcData = {"startingAngle":0,"endingAngle":6.2831854820251465,"innerRadius":0};
  
  // base
  node_1.name = 'Ellipse 3';
  // scene
  
  // layout
  node_1.resize(149, 149);
  
  node_1.x = 291;
  node_1.y = 168;
  node_1.constrainProportions = false;
  node_1.constraints = {"horizontal":"MIN","vertical":"MIN"};
  node_1.layoutAlign = 'INHERIT';
  node_1.layoutGrow = 0;
  node_1.layoutPositioning = 'AUTO';
  node_1.rotation = 0;
  
  // blend
  node_1.blendMode = 'PASS_THROUGH';
  node_1.effects = [];
  node_1.isMask = false;
  // geometry
node_1.fills = [{"type":"SOLID","visible":true,"opacity":1,"blendMode":"NORMAL","color":{"r":0.879807710647583,"g":0.2788172662258148,"b":0.22418177127838135},"boundVariables":{}}]
node_1.strokeWeight = 0;

  // ELLIPSE
  const node_2 = figma.createEllipse();
  
  // append
  node_0.appendChild(node_2);
  node_2.arcData = {"startingAngle":0,"endingAngle":6.2831854820251465,"innerRadius":0};
  
  // base
  node_2.name = 'Ellipse 1';
  // scene
  
  // layout
  node_2.resize(296, 296);
  
  node_2.x = 1398;
  node_2.y = 76;
  node_2.constrainProportions = false;
  node_2.constraints = {"horizontal":"MIN","vertical":"MIN"};
  node_2.layoutAlign = 'INHERIT';
  node_2.layoutGrow = 0;
  node_2.layoutPositioning = 'AUTO';
  node_2.rotation = 0;
  
  // blend
  node_2.blendMode = 'PASS_THROUGH';
  node_2.effects = [];
  node_2.isMask = false;
  // geometry
node_2.fills = [{"type":"GRADIENT_LINEAR","visible":true,"opacity":1,"blendMode":"NORMAL","gradientStops":[{"color":{"r":0.05228365212678909,"g":0.06361177563667297,"b":0.2788461446762085,"a":1},"position":0,"boundVariables":{}},{"color":{"r":0.6778846383094788,"g":0.09125369787216187,"b":0.6387758851051331,"a":1},"position":1,"boundVariables":{}}],"gradientTransform":[[6.123234262925839e-17,1,0],[-1,6.123234262925839e-17,1]]}]
node_2.strokeWeight = 0;

  // ELLIPSE
  const node_3 = figma.createEllipse();
  
  // append
  node_0.appendChild(node_3);
  node_3.arcData = {"startingAngle":0,"endingAngle":6.2831854820251465,"innerRadius":0};
  
  // base
  node_3.name = 'Ellipse 13';
  // scene
  
  // layout
  node_3.resize(296, 296);
  
  node_3.x = 1409;
  node_3.y = 3289;
  node_3.constrainProportions = false;
  node_3.constraints = {"horizontal":"MIN","vertical":"MIN"};
  node_3.layoutAlign = 'INHERIT';
  node_3.layoutGrow = 0;
  node_3.layoutPositioning = 'AUTO';
  node_3.rotation = 0;
  
  // blend
  node_3.blendMode = 'PASS_THROUGH';
  node_3.effects = [];
  node_3.isMask = false;
  // geometry
node_3.fills = [{"type":"GRADIENT_LINEAR","visible":true,"opacity":1,"blendMode":"NORMAL","gradientStops":[{"color":{"r":0.05228365212678909,"g":0.06361177563667297,"b":0.2788461446762085,"a":1},"position":0,"boundVariables":{}},{"color":{"r":0.6778846383094788,"g":0.09125369787216187,"b":0.6387758851051331,"a":1},"position":1,"boundVariables":{}}],"gradientTransform":[[6.123234262925839e-17,1,0],[-1,6.123234262925839e-17,1]]}]
node_3.strokeWeight = 0;

  // ELLIPSE
  const node_4 = figma.createEllipse();
  
  // append
  node_0.appendChild(node_4);
  node_4.arcData = {"startingAngle":0,"endingAngle":6.2831854820251465,"innerRadius":0};
  
  // base
  node_4.name = 'Ellipse 12';
  // scene
  
  // layout
  node_4.resize(149, 149);
  
  node_4.x = 238;
  node_4.y = 3451;
  node_4.constrainProportions = false;
  node_4.constraints = {"horizontal":"MIN","vertical":"MIN"};
  node_4.layoutAlign = 'INHERIT';
  node_4.layoutGrow = 0;
  node_4.layoutPositioning = 'AUTO';
  node_4.rotation = 0;
  
  // blend
  node_4.blendMode = 'PASS_THROUGH';
  node_4.effects = [];
  node_4.isMask = false;
  // geometry
node_4.fills = [{"type":"SOLID","visible":true,"opacity":1,"blendMode":"NORMAL","color":{"r":0.879807710647583,"g":0.2788172662258148,"b":0.22418177127838135},"boundVariables":{}}]
node_4.strokeWeight = 0;

  // ELLIPSE
  const node_5 = figma.createEllipse();
  
  // append
  node_0.appendChild(node_5);
  node_5.arcData = {"startingAngle":0,"endingAngle":6.2831854820251465,"innerRadius":0};
  
  // base
  node_5.name = 'Ellipse 15';
  // scene
  
  // layout
  node_5.resize(108, 108);
  
  node_5.x = 763;
  node_5.y = 3007;
  node_5.constrainProportions = false;
  node_5.constraints = {"horizontal":"MIN","vertical":"MIN"};
  node_5.layoutAlign = 'INHERIT';
  node_5.layoutGrow = 0;
  node_5.layoutPositioning = 'AUTO';
  node_5.rotation = 0;
  
  // blend
  node_5.blendMode = 'PASS_THROUGH';
  node_5.effects = [];
  node_5.isMask = false;
  // geometry
node_5.fills = [{"type":"SOLID","visible":true,"opacity":1,"blendMode":"NORMAL","color":{"r":0.879807710647583,"g":0.2788172662258148,"b":0.22418177127838135},"boundVariables":{}}]
node_5.strokeWeight = 0;

  // ELLIPSE
  const node_6 = figma.createEllipse();
  
  // append
  node_0.appendChild(node_6);
  node_6.arcData = {"startingAngle":0,"endingAngle":6.2831854820251465,"innerRadius":0};
  
  // base
  node_6.name = 'Ellipse 9';
  // scene
  
  // layout
  node_6.resize(207, 207);
  
  node_6.x = 1115;
  node_6.y = 2115;
  node_6.constrainProportions = false;
  node_6.constraints = {"horizontal":"MIN","vertical":"MIN"};
  node_6.layoutAlign = 'INHERIT';
  node_6.layoutGrow = 0;
  node_6.layoutPositioning = 'AUTO';
  node_6.rotation = 0;
  
  // blend
  node_6.blendMode = 'PASS_THROUGH';
  node_6.effects = [];
  node_6.isMask = false;
  // geometry
node_6.fills = [{"type":"GRADIENT_LINEAR","visible":true,"opacity":1,"blendMode":"NORMAL","gradientStops":[{"color":{"r":0.05228365212678909,"g":0.06361177563667297,"b":0.2788461446762085,"a":1},"position":0,"boundVariables":{}},{"color":{"r":0.6778846383094788,"g":0.09125369787216187,"b":0.6387758851051331,"a":1},"position":1,"boundVariables":{}}],"gradientTransform":[[6.123234262925839e-17,1,0],[-1,6.123234262925839e-17,1]]}]
node_6.strokeWeight = 0;

  // ELLIPSE
  const node_7 = figma.createEllipse();
  
  // append
  node_0.appendChild(node_7);
  node_7.arcData = {"startingAngle":0,"endingAngle":6.2831854820251465,"innerRadius":0};
  
  // base
  node_7.name = 'Ellipse 4';
  // scene
  
  // layout
  node_7.resize(296, 296);
  
  node_7.x = 1240;
  node_7.y = 1349;
  node_7.constrainProportions = false;
  node_7.constraints = {"horizontal":"MIN","vertical":"MIN"};
  node_7.layoutAlign = 'INHERIT';
  node_7.layoutGrow = 0;
  node_7.layoutPositioning = 'AUTO';
  node_7.rotation = 0;
  
  // blend
  node_7.blendMode = 'PASS_THROUGH';
  node_7.effects = [];
  node_7.isMask = false;
  // geometry
node_7.fills = [{"type":"GRADIENT_LINEAR","visible":true,"opacity":1,"blendMode":"NORMAL","gradientStops":[{"color":{"r":0.05228365212678909,"g":0.06361177563667297,"b":0.2788461446762085,"a":1},"position":0,"boundVariables":{}},{"color":{"r":0.6778846383094788,"g":0.09125369787216187,"b":0.6387758851051331,"a":1},"position":1,"boundVariables":{}}],"gradientTransform":[[6.123234262925839e-17,1,0],[-1,6.123234262925839e-17,1]]}]
node_7.strokeWeight = 0;

  // ELLIPSE
  const node_8 = figma.createEllipse();
  
  // append
  node_0.appendChild(node_8);
  node_8.arcData = {"startingAngle":0,"endingAngle":6.2831854820251465,"innerRadius":0};
  
  // base
  node_8.name = 'Ellipse 2';
  // scene
  
  // layout
  node_8.resize(204, 204);
  
  node_8.x = 79;
  node_8.y = 865;
  node_8.constrainProportions = false;
  node_8.constraints = {"horizontal":"MIN","vertical":"MIN"};
  node_8.layoutAlign = 'INHERIT';
  node_8.layoutGrow = 0;
  node_8.layoutPositioning = 'AUTO';
  node_8.rotation = 0;
  
  // blend
  node_8.blendMode = 'PASS_THROUGH';
  node_8.effects = [];
  node_8.isMask = false;
  // geometry
node_8.fills = [{"type":"SOLID","visible":true,"opacity":1,"blendMode":"NORMAL","color":{"r":0.1830621361732483,"g":0.22150518000125885,"b":0.9519230723381042},"boundVariables":{}}]
node_8.strokeWeight = 0;

  // ELLIPSE
  const node_9 = figma.createEllipse();
  
  // append
  node_0.appendChild(node_9);
  node_9.arcData = {"startingAngle":0,"endingAngle":6.2831854820251465,"innerRadius":0};
  
  // base
  node_9.name = 'Ellipse 10';
  // scene
  
  // layout
  node_9.resize(165, 165);
  
  node_9.x = 118;
  node_9.y = 2097;
  node_9.constrainProportions = false;
  node_9.constraints = {"horizontal":"MIN","vertical":"MIN"};
  node_9.layoutAlign = 'INHERIT';
  node_9.layoutGrow = 0;
  node_9.layoutPositioning = 'AUTO';
  node_9.rotation = 0;
  
  // blend
  node_9.blendMode = 'PASS_THROUGH';
  node_9.effects = [];
  node_9.isMask = false;
  // geometry
node_9.fills = [{"type":"SOLID","visible":true,"opacity":1,"blendMode":"NORMAL","color":{"r":0.1830621361732483,"g":0.22150518000125885,"b":0.9519230723381042},"boundVariables":{}}]
node_9.strokeWeight = 0;

  // ELLIPSE
  const node_10 = figma.createEllipse();
  
  // append
  node_0.appendChild(node_10);
  node_10.arcData = {"startingAngle":0,"endingAngle":6.2831854820251465,"innerRadius":0};
  
  // base
  node_10.name = 'Ellipse 11';
  // scene
  
  // layout
  node_10.resize(165, 165);
  
  node_10.x = 93;
  node_10.y = 3062;
  node_10.constrainProportions = false;
  node_10.constraints = {"horizontal":"MIN","vertical":"MIN"};
  node_10.layoutAlign = 'INHERIT';
  node_10.layoutGrow = 0;
  node_10.layoutPositioning = 'AUTO';
  node_10.rotation = 0;
  
  // blend
  node_10.blendMode = 'PASS_THROUGH';
  node_10.effects = [];
  node_10.isMask = false;
  // geometry
node_10.fills = [{"type":"SOLID","visible":true,"opacity":1,"blendMode":"NORMAL","color":{"r":0.1830621361732483,"g":0.22150518000125885,"b":0.9519230723381042},"boundVariables":{}}]
node_10.strokeWeight = 0;

  // ELLIPSE
  const node_11 = figma.createEllipse();
  
  // append
  node_0.appendChild(node_11);
  node_11.arcData = {"startingAngle":0,"endingAngle":6.2831854820251465,"innerRadius":0};
  
  // base
  node_11.name = 'Ellipse 14';
  // scene
  
  // layout
  node_11.resize(165, 165);
  
  node_11.x = 968;
  node_11.y = 3289;
  node_11.constrainProportions = false;
  node_11.constraints = {"horizontal":"MIN","vertical":"MIN"};
  node_11.layoutAlign = 'INHERIT';
  node_11.layoutGrow = 0;
  node_11.layoutPositioning = 'AUTO';
  node_11.rotation = 0;
  
  // blend
  node_11.blendMode = 'PASS_THROUGH';
  node_11.effects = [];
  node_11.isMask = false;
  // geometry
node_11.fills = [{"type":"SOLID","visible":true,"opacity":1,"blendMode":"NORMAL","color":{"r":0.1830621361732483,"g":0.22150518000125885,"b":0.9519230723381042},"boundVariables":{}}]
node_11.strokeWeight = 0;

  // ELLIPSE
  const node_12 = figma.createEllipse();
  
  // append
  node_0.appendChild(node_12);
  node_12.arcData = {"startingAngle":0,"endingAngle":6.2831854820251465,"innerRadius":0};
  
  // base
  node_12.name = 'Ellipse 8';
  // scene
  
  // layout
  node_12.resize(131, 131);
  
  node_12.x = 156;
  node_12.y = 1780;
  node_12.constrainProportions = false;
  node_12.constraints = {"horizontal":"MIN","vertical":"MIN"};
  node_12.layoutAlign = 'INHERIT';
  node_12.layoutGrow = 0;
  node_12.layoutPositioning = 'AUTO';
  node_12.rotation = 0;
  
  // blend
  node_12.blendMode = 'PASS_THROUGH';
  node_12.effects = [];
  node_12.isMask = false;
  // geometry
node_12.fills = [{"type":"SOLID","visible":true,"opacity":1,"blendMode":"NORMAL","color":{"r":0.1830621361732483,"g":0.22150518000125885,"b":0.9519230723381042},"boundVariables":{}}]
node_12.strokeWeight = 0;

  // ELLIPSE
  const node_13 = figma.createEllipse();
  
  // append
  node_0.appendChild(node_13);
  node_13.arcData = {"startingAngle":0,"endingAngle":6.2831854820251465,"innerRadius":0};
  
  // base
  node_13.name = 'Ellipse 7';
  // scene
  
  // layout
  node_13.resize(204, 204);
  
  node_13.x = 844;
  node_13.y = 1617;
  node_13.constrainProportions = false;
  node_13.constraints = {"horizontal":"MIN","vertical":"MIN"};
  node_13.layoutAlign = 'INHERIT';
  node_13.layoutGrow = 0;
  node_13.layoutPositioning = 'AUTO';
  node_13.rotation = 0;
  
  // blend
  node_13.blendMode = 'PASS_THROUGH';
  node_13.effects = [];
  node_13.isMask = false;
  // geometry
node_13.fills = [{"type":"SOLID","visible":true,"opacity":1,"blendMode":"NORMAL","color":{"r":0.1830621361732483,"g":0.22150518000125885,"b":0.9519230723381042},"boundVariables":{}}]
node_13.strokeWeight = 0;

  // ELLIPSE
  const node_14 = figma.createEllipse();
  
  // append
  node_0.appendChild(node_14);
  node_14.arcData = {"startingAngle":0,"endingAngle":6.2831854820251465,"innerRadius":0};
  
  // base
  node_14.name = 'Ellipse 6';
  // scene
  
  // layout
  node_14.resize(149, 149);
  
  node_14.x = 903;
  node_14.y = 1124;
  node_14.constrainProportions = false;
  node_14.constraints = {"horizontal":"MIN","vertical":"MIN"};
  node_14.layoutAlign = 'INHERIT';
  node_14.layoutGrow = 0;
  node_14.layoutPositioning = 'AUTO';
  node_14.rotation = 0;
  
  // blend
  node_14.blendMode = 'PASS_THROUGH';
  node_14.effects = [];
  node_14.isMask = false;
  // geometry
node_14.fills = [{"type":"SOLID","visible":true,"opacity":1,"blendMode":"NORMAL","color":{"r":0.879807710647583,"g":0.2788172662258148,"b":0.22418177127838135},"boundVariables":{}}]
node_14.strokeWeight = 0;

  // RECTANGLE
  const node_15 = figma.createRectangle();
  
  // append
  node_0.appendChild(node_15);
  
  // base
  node_15.name = 'Rectangle 2';
  // scene
  
  // layout
  node_15.resize(1431, 2484);
  
  node_15.x = 156;
  node_15.y = 240;
  node_15.constrainProportions = false;
  node_15.constraints = {"horizontal":"MIN","vertical":"MIN"};
  node_15.layoutAlign = 'INHERIT';
  node_15.layoutGrow = 0;
  node_15.layoutPositioning = 'AUTO';
  node_15.rotation = 0;
  
  // blend
  node_15.blendMode = 'PASS_THROUGH';
  node_15.effects = [{"type":"BACKGROUND_BLUR","visible":true,"radius":13.800000190734863,"boundVariables":{},"blurType":"NORMAL"},{"type":"DROP_SHADOW","visible":true,"radius":16.200000762939453,"boundVariables":{},"color":{"r":0,"g":0,"b":0,"a":0.25},"offset":{"x":19,"y":9},"spread":0,"blendMode":"NORMAL","showShadowBehindNode":false}];
  node_15.isMask = false;
  // geometry
node_15.fills = [{"type":"GRADIENT_LINEAR","visible":true,"opacity":0.7400000095367432,"blendMode":"NORMAL","gradientStops":[{"color":{"r":0.09377041459083557,"g":0.06409485638141632,"b":0.22596153616905212,"a":0.5},"position":0,"boundVariables":{}},{"color":{"r":0.24552834033966064,"g":0.1678258776664734,"b":0.5916574001312256,"a":0.20000000298023224},"position":0.3031386733055115,"boundVariables":{}},{"color":{"r":0.24857592582702637,"g":0.16990900039672852,"b":0.5990012884140015,"a":0.30000001192092896},"position":0.6186913251876831,"boundVariables":{}},{"color":{"r":0.25976401567459106,"g":0.17755639553070068,"b":0.6259615421295166,"a":0.5},"position":1,"boundVariables":{}}],"gradientTransform":[[0.766806960105896,0.524161696434021,-0.1363748162984848],[-0.524161696434021,0.3252659738063812,0.5932209491729736]]}]
node_15.strokeWeight = 0;

  // TEXT 
  const node_16 = figma.createText();
  
  // append
  node_0.appendChild(node_16);
  await figma.loadFontAsync({"family":"Instrument Sans","style":"Regular"});
  node_16.autoRename = true;
  node_16.fontName = {"family":"Instrument Sans","style":"Regular"};
  node_16.fontSize = 28;
  node_16.characters = '💡 Always learning  🎯 Focused on quality  🚀 Ready to grow and take on new challenges';
  node_16.fills = [{"type":"SOLID","visible":true,"opacity":1,"blendMode":"NORMAL","color":{"r":1,"g":1,"b":1},"boundVariables":{}}];
  node_16.textCase = 'ORIGINAL';
  node_16.textDecoration = 'NONE';
  node_16.letterSpacing = {"unit":"PERCENT","value":-3};
  node_16.lineHeight = {"unit":"PIXELS","value":44};
  node_16.hyperlink = null;
  node_16.textAlignHorizontal = 'LEFT';
  node_16.textAlignVertical = 'TOP';
  node_16.textAutoResize = 'WIDTH_AND_HEIGHT';
  node_16.paragraphIndent = 0;
  node_16.paragraphSpacing = 0;
  
  // base
  node_16.name = '💡 Always learning  🎯 Focused on quality  🚀 Ready to grow and take on new challenges';
  // scene
  
  // layout
  node_16.resize(545, 132);
  
  node_16.x = 270;
  node_16.y = 1472;
  node_16.constrainProportions = false;
  node_16.constraints = {"horizontal":"MIN","vertical":"MIN"};
  node_16.layoutAlign = 'INHERIT';
  node_16.layoutGrow = 0;
  node_16.layoutPositioning = 'AUTO';
  node_16.rotation = 0;
  
  // blend
  node_16.blendMode = 'PASS_THROUGH';
  node_16.effects = [];
  node_16.isMask = false;
  // geometry
node_16.fills = [{"type":"SOLID","visible":true,"opacity":1,"blendMode":"NORMAL","color":{"r":1,"g":1,"b":1},"boundVariables":{}}]
node_16.strokeWeight = 0;

  // TEXT 
  const node_17 = figma.createText();
  
  // append
  node_0.appendChild(node_17);
  await figma.loadFontAsync({"family":"Instrument Sans","style":"SemiBold"});
  node_17.autoRename = true;
  node_17.fontName = {"family":"Instrument Sans","style":"SemiBold"};
  node_17.fontSize = 90;
  node_17.characters = 'SACHIN GRAPHIXX';
  node_17.fills = [{"type":"SOLID","visible":true,"opacity":1,"blendMode":"NORMAL","color":{"r":1,"g":1,"b":1},"boundVariables":{}}];
  node_17.textCase = 'ORIGINAL';
  node_17.textDecoration = 'NONE';
  node_17.letterSpacing = {"unit":"PERCENT","value":-3};
  node_17.lineHeight = {"unit":"PIXELS","value":61};
  node_17.hyperlink = null;
  node_17.textAlignHorizontal = 'LEFT';
  node_17.textAlignVertical = 'TOP';
  node_17.textAutoResize = 'WIDTH_AND_HEIGHT';
  node_17.paragraphIndent = 0;
  node_17.paragraphSpacing = 0;
  
  // base
  node_17.name = 'SACHIN GRAPHIXX';
  // scene
  
  // layout
  node_17.resize(787, 61);
  
  node_17.x = 226;
  node_17.y = 440;
  node_17.constrainProportions = false;
  node_17.constraints = {"horizontal":"MIN","vertical":"MIN"};
  node_17.layoutAlign = 'INHERIT';
  node_17.layoutGrow = 0;
  node_17.layoutPositioning = 'AUTO';
  node_17.rotation = 0;
  
  // blend
  node_17.blendMode = 'PASS_THROUGH';
  node_17.effects = [];
  node_17.isMask = false;
  // geometry
node_17.fills = [{"type":"SOLID","visible":true,"opacity":1,"blendMode":"NORMAL","color":{"r":1,"g":1,"b":1},"boundVariables":{}}]
node_17.strokeWeight = 0;

  // GROUP
  const node_18 = figma.createFrame();
  
  // append
  node_0.appendChild(node_18);
  
  // layout
  node_18.resize(274, 402.7248229980469);
  
  node_18.x = 1124;
  node_18.y = 352;
  node_18.constrainProportions = false;
  
  node_18.layoutAlign = 'INHERIT';
  node_18.layoutGrow = 0;
  node_18.layoutPositioning = 'AUTO';
  node_18.rotation = 0;
  
  // base
  node_18.name = 'Mask group';
  
  // blend
  node_18.blendMode = 'PASS_THROUGH';
  node_18.effects = [{"type":"DROP_SHADOW","visible":true,"radius":9.399999618530273,"boundVariables":{},"color":{"r":0,"g":0,"b":0,"a":0.25},"offset":{"x":10,"y":3},"spread":0,"blendMode":"NORMAL","showShadowBehindNode":false}];
  node_18.isMask = false;
  // scene
  
  // RECTANGLE
  const node_19 = figma.createRectangle();
  
  // append
  node_18.appendChild(node_19);
  
  // base
  node_19.name = 'Rectangle 1';
  // scene
  
  // layout
  node_19.resize(274, 402.7248229980469);
  
  node_19.x = 1123.9999879096504;
  node_19.y = 352.00000005960464;
  node_19.constrainProportions = false;
  node_19.constraints = {"horizontal":"MIN","vertical":"MIN"};
  node_19.layoutAlign = 'INHERIT';
  node_19.layoutGrow = 0;
  node_19.layoutPositioning = 'AUTO';
  node_19.rotation = 0;
  
  // blend
  node_19.blendMode = 'PASS_THROUGH';
  node_19.effects = [];
  node_19.isMask = true;
  // geometry
node_19.fills = [{"type":"IMAGE","visible":true,"opacity":1,"blendMode":"NORMAL","scaleMode":"FILL","imageTransform":[[1,0,0],[0,1,0]],"scalingFactor":0.5,"rotation":0,"filters":{"exposure":0,"contrast":0,"saturation":0,"temperature":0,"tint":0,"highlights":0,"shadows":0},"imageHash":"7f12ea1300756f144a0fb5daaf68dbfc01103a46"}]
node_19.strokeWeight = 0;

  // RECTANGLE
  const node_20 = figma.createRectangle();
  
  // append
  node_18.appendChild(node_20);
  
  // base
  node_20.name = 'Untitled-1 1';
  // scene
  
  // layout
  node_20.resize(461.57049560546875, 461.57049560546875);
  
  node_20.x = 1029.295295715332;
  node_20.y = 352.00000005960464;
  node_20.constrainProportions = true;
  node_20.constraints = {"horizontal":"MIN","vertical":"MIN"};
  node_20.layoutAlign = 'INHERIT';
  node_20.layoutGrow = 0;
  node_20.layoutPositioning = 'AUTO';
  node_20.rotation = 0;
  
  // blend
  node_20.blendMode = 'PASS_THROUGH';
  node_20.effects = [];
  node_20.isMask = false;
  // geometry
node_20.fills = [{"type":"IMAGE","visible":true,"opacity":1,"blendMode":"NORMAL","scaleMode":"FILL","imageTransform":[[1,0,0],[0,1,0]],"scalingFactor":0.5,"rotation":0,"filters":{"exposure":0,"contrast":0,"saturation":0,"temperature":0,"tint":0,"highlights":0,"shadows":0},"imageHash":"976ed9e1f89bb8bf5adfe99d63c5fb9c0d29a8af"}]
node_20.strokeWeight = 0;

  // TEXT 
  const node_21 = figma.createText();
  
  // append
  node_0.appendChild(node_21);
  await figma.loadFontAsync({"family":"Instrument Sans","style":"SemiBold"});
  node_21.autoRename = true;
  node_21.fontName = {"family":"Instrument Sans","style":"SemiBold"};
  node_21.fontSize = 22;
  node_21.characters = 'Hi, I'm Sachin Kumar, a passionate Graphic Designer turning ideas into impactful visuals. From branding to digital design — I bring creativity, clarity, and confidence to every pixel.';
  node_21.fills = [{"type":"SOLID","visible":true,"opacity":1,"blendMode":"NORMAL","color":{"r":1,"g":1,"b":1},"boundVariables":{}}];
  node_21.textCase = 'ORIGINAL';
  node_21.textDecoration = 'NONE';
  node_21.letterSpacing = {"unit":"PERCENT","value":-3};
  node_21.lineHeight = {"unit":"PIXELS","value":25};
  node_21.hyperlink = null;
  node_21.textAlignHorizontal = 'LEFT';
  node_21.textAlignVertical = 'TOP';
  node_21.textAutoResize = 'HEIGHT';
  node_21.paragraphIndent = 0;
  node_21.paragraphSpacing = 0;
  
  // base
  node_21.name = 'Hi, I'm Sachin Kumar, a passionate Graphic Designer turning ideas into impactful visuals. From branding to digital design — I bring creativity, clarity, and confidence to every pixel.';
  // scene
  
  // layout
  node_21.resize(793, 75);
  
  node_21.x = 233;
  node_21.y = 768;
  node_21.constrainProportions = false;
  node_21.constraints = {"horizontal":"MIN","vertical":"MIN"};
  node_21.layoutAlign = 'INHERIT';
  node_21.layoutGrow = 0;
  node_21.layoutPositioning = 'AUTO';
  node_21.rotation = 0;
  
  // blend
  node_21.blendMode = 'PASS_THROUGH';
  node_21.effects = [];
  node_21.isMask = false;
  // geometry
node_21.fills = [{"type":"SOLID","visible":true,"opacity":1,"blendMode":"NORMAL","color":{"r":1,"g":1,"b":1},"boundVariables":{}}]
node_21.strokeWeight = 0;

  // TEXT 
  const node_22 = figma.createText();
  
  // append
  node_0.appendChild(node_22);
  await figma.loadFontAsync({"family":"Instrument Sans","style":"SemiBold"});
  node_22.autoRename = true;
  node_22.fontName = {"family":"Instrument Sans","style":"SemiBold"};
  node_22.fontSize = 90;
  node_22.characters = 'ABOUT ME';
  node_22.fills = [{"type":"SOLID","visible":true,"opacity":1,"blendMode":"NORMAL","color":{"r":1,"g":1,"b":1},"boundVariables":{}}];
  node_22.textCase = 'ORIGINAL';
  node_22.textDecoration = 'NONE';
  node_22.letterSpacing = {"unit":"PERCENT","value":-3};
  node_22.lineHeight = {"unit":"PIXELS","value":61};
  node_22.hyperlink = null;
  node_22.textAlignHorizontal = 'LEFT';
  node_22.textAlignVertical = 'TOP';
  node_22.textAutoResize = 'WIDTH_AND_HEIGHT';
  node_22.paragraphIndent = 0;
  node_22.paragraphSpacing = 0;
  
  // base
  node_22.name = 'ABOUT ME';
  // scene
  
  // layout
  node_22.resize(454, 61);
  
  node_22.x = 270;
  node_22.y = 1167;
  node_22.constrainProportions = false;
  node_22.constraints = {"horizontal":"MIN","vertical":"MIN"};
  node_22.layoutAlign = 'INHERIT';
  node_22.layoutGrow = 0;
  node_22.layoutPositioning = 'AUTO';
  node_22.rotation = 0;
  
  // blend
  node_22.blendMode = 'PASS_THROUGH';
  node_22.effects = [];
  node_22.isMask = false;
  // geometry
node_22.fills = [{"type":"SOLID","visible":true,"opacity":1,"blendMode":"NORMAL","color":{"r":1,"g":1,"b":1},"boundVariables":{}}]
node_22.strokeWeight = 0;

  // TEXT 
  const node_23 = figma.createText();
  
  // append
  node_0.appendChild(node_23);
  await figma.loadFontAsync({"family":"Instrument Sans","style":"SemiBold"});
  node_23.autoRename = true;
  node_23.fontName = {"family":"Instrument Sans","style":"SemiBold"};
  node_23.fontSize = 28;
  node_23.characters = 'I’m a self-driven and creative-minded fresher graphic designer skilled in Adobe Photoshop, Illustrator, and Canva. I focus on clean, creative visuals for digital and print media.';
  node_23.fills = [{"type":"SOLID","visible":true,"opacity":1,"blendMode":"NORMAL","color":{"r":1,"g":1,"b":1},"boundVariables":{}}];
  node_23.textCase = 'ORIGINAL';
  node_23.textDecoration = 'NONE';
  node_23.letterSpacing = {"unit":"PERCENT","value":-3};
  node_23.lineHeight = {"unit":"PIXELS","value":44};
  node_23.hyperlink = null;
  node_23.textAlignHorizontal = 'LEFT';
  node_23.textAlignVertical = 'TOP';
  node_23.textAutoResize = 'HEIGHT';
  node_23.paragraphIndent = 0;
  node_23.paragraphSpacing = 0;
  
  // base
  node_23.name = 'I’m a self-driven and creative-minded fresher graphic designer skilled in Adobe Photoshop, Illustrator, and Canva. I focus on clean, creative visuals for digital and print media.';
  // scene
  
  // layout
  node_23.resize(955, 132);
  
  node_23.x = 270;
  node_23.y = 1301;
  node_23.constrainProportions = false;
  node_23.constraints = {"horizontal":"MIN","vertical":"MIN"};
  node_23.layoutAlign = 'INHERIT';
  node_23.layoutGrow = 0;
  node_23.layoutPositioning = 'AUTO';
  node_23.rotation = 0;
  
  // blend
  node_23.blendMode = 'PASS_THROUGH';
  node_23.effects = [];
  node_23.isMask = false;
  // geometry
node_23.fills = [{"type":"SOLID","visible":true,"opacity":1,"blendMode":"NORMAL","color":{"r":1,"g":1,"b":1},"boundVariables":{}}]
node_23.strokeWeight = 0;

  // TEXT 
  const node_24 = figma.createText();
  
  // append
  node_0.appendChild(node_24);
  await figma.loadFontAsync({"family":"Inter","style":"Medium"});
  node_24.autoRename = true;
  node_24.fontName = {"family":"Inter","style":"Medium"};
  node_24.fontSize = 20;
  node_24.characters = 'FGGG';
  node_24.fills = [{"type":"SOLID","visible":true,"opacity":0,"blendMode":"NORMAL","color":{"r":1,"g":1,"b":1},"boundVariables":{}}];
  node_24.textCase = 'ORIGINAL';
  node_24.textDecoration = 'NONE';
  node_24.letterSpacing = {"unit":"PERCENT","value":-3};
  node_24.lineHeight = {"unit":"PIXELS","value":41};
  node_24.hyperlink = null;
  node_24.textAlignHorizontal = 'LEFT';
  node_24.textAlignVertical = 'TOP';
  node_24.textAutoResize = 'WIDTH_AND_HEIGHT';
  node_24.paragraphIndent = 0;
  node_24.paragraphSpacing = 0;
  
  // base
  node_24.name = 'FGGG';
  // scene
  
  // layout
  node_24.resize(55, 41);
  
  node_24.x = 807;
  node_24.y = 1705;
  node_24.constrainProportions = false;
  node_24.constraints = {"horizontal":"MIN","vertical":"MIN"};
  node_24.layoutAlign = 'INHERIT';
  node_24.layoutGrow = 0;
  node_24.layoutPositioning = 'AUTO';
  node_24.rotation = 0;
  
  // blend
  node_24.blendMode = 'PASS_THROUGH';
  node_24.effects = [];
  node_24.isMask = false;
  // geometry
node_24.fills = [{"type":"SOLID","visible":true,"opacity":0,"blendMode":"NORMAL","color":{"r":1,"g":1,"b":1},"boundVariables":{}}]
node_24.strokeWeight = 0;

  // TEXT 
  const node_25 = figma.createText();
  
  // append
  node_0.appendChild(node_25);
  await figma.loadFontAsync({"family":"Instrument Sans","style":"SemiBold"});
  node_25.autoRename = true;
  node_25.fontName = {"family":"Instrument Sans","style":"SemiBold"};
  node_25.fontSize = 90;
  node_25.characters = 'PORTFOLIO';
  node_25.fills = [{"type":"SOLID","visible":true,"opacity":1,"blendMode":"NORMAL","color":{"r":1,"g":1,"b":1},"boundVariables":{}}];
  node_25.textCase = 'ORIGINAL';
  node_25.textDecoration = 'NONE';
  node_25.letterSpacing = {"unit":"PERCENT","value":-3};
  node_25.lineHeight = {"unit":"PIXELS","value":61};
  node_25.hyperlink = null;
  node_25.textAlignHorizontal = 'LEFT';
  node_25.textAlignVertical = 'TOP';
  node_25.textAutoResize = 'WIDTH_AND_HEIGHT';
  node_25.paragraphIndent = 0;
  node_25.paragraphSpacing = 0;
  
  // base
  node_25.name = 'PORTFOLIO';
  // scene
  
  // layout
  node_25.resize(497, 61);
  
  node_25.x = 616;
  node_25.y = 2156;
  node_25.constrainProportions = false;
  node_25.constraints = {"horizontal":"CENTER","vertical":"MIN"};
  node_25.layoutAlign = 'INHERIT';
  node_25.layoutGrow = 0;
  node_25.layoutPositioning = 'AUTO';
  node_25.rotation = 0;
  
  // blend
  node_25.blendMode = 'PASS_THROUGH';
  node_25.effects = [];
  node_25.isMask = false;
  // geometry
node_25.fills = [{"type":"SOLID","visible":true,"opacity":1,"blendMode":"NORMAL","color":{"r":1,"g":1,"b":1},"boundVariables":{}}]
node_25.strokeWeight = 0;

  // RECTANGLE
  const node_26 = figma.createRectangle();
  
  // append
  node_0.appendChild(node_26);
  
  // base
  node_26.name = 'Rectangle 7';
  // scene
  
  // layout
  node_26.resize(1431, 599);
  
  node_26.x = 133;
  node_26.y = 2927;
  node_26.constrainProportions = false;
  node_26.constraints = {"horizontal":"MIN","vertical":"MIN"};
  node_26.layoutAlign = 'INHERIT';
  node_26.layoutGrow = 0;
  node_26.layoutPositioning = 'AUTO';
  node_26.rotation = 0;
  
  // blend
  node_26.blendMode = 'PASS_THROUGH';
  node_26.effects = [{"type":"BACKGROUND_BLUR","visible":true,"radius":8.699999809265137,"boundVariables":{},"blurType":"NORMAL"}];
  node_26.isMask = false;
  // geometry
node_26.fills = [{"type":"SOLID","visible":true,"opacity":0.6200000047683716,"blendMode":"NORMAL","color":{"r":0.3960784375667572,"g":0.4000000059604645,"b":0.6823529601097107},"boundVariables":{}}]
node_26.strokeWeight = 0;

  // TEXT 
  const node_27 = figma.createText();
  
  // append
  node_0.appendChild(node_27);
  await figma.loadFontAsync({"family":"Instrument Sans","style":"SemiBold"});
  node_27.autoRename = true;
  node_27.fontName = {"family":"Instrument Sans","style":"SemiBold"};
  node_27.fontSize = 90;
  node_27.characters = 'CONTACT';
  node_27.fills = [{"type":"SOLID","visible":true,"opacity":1,"blendMode":"NORMAL","color":{"r":1,"g":1,"b":1},"boundVariables":{}}];
  node_27.textCase = 'ORIGINAL';
  node_27.textDecoration = 'NONE';
  node_27.letterSpacing = {"unit":"PERCENT","value":-3};
  node_27.lineHeight = {"unit":"PIXELS","value":61};
  node_27.hyperlink = null;
  node_27.textAlignHorizontal = 'LEFT';
  node_27.textAlignVertical = 'TOP';
  node_27.textAutoResize = 'WIDTH_AND_HEIGHT';
  node_27.paragraphIndent = 0;
  node_27.paragraphSpacing = 0;
  
  // base
  node_27.name = 'CONTACT';
  // scene
  
  // layout
  node_27.resize(422, 61);
  
  node_27.x = 654;
  node_27.y = 2956;
  node_27.constrainProportions = false;
  node_27.constraints = {"horizontal":"CENTER","vertical":"MIN"};
  node_27.layoutAlign = 'INHERIT';
  node_27.layoutGrow = 0;
  node_27.layoutPositioning = 'AUTO';
  node_27.rotation = 0;
  
  // blend
  node_27.blendMode = 'PASS_THROUGH';
  node_27.effects = [];
  node_27.isMask = false;
  // geometry
node_27.fills = [{"type":"SOLID","visible":true,"opacity":1,"blendMode":"NORMAL","color":{"r":1,"g":1,"b":1},"boundVariables":{}}]
node_27.strokeWeight = 0;

  // TEXT 
  const node_28 = figma.createText();
  
  // append
  node_0.appendChild(node_28);
  await figma.loadFontAsync({"family":"Instrument Sans","style":"SemiBold"});
  node_28.autoRename = true;
  node_28.fontName = {"family":"Instrument Sans","style":"SemiBold"};
  node_28.fontSize = 29;
  node_28.characters = '+91 9267934029';
  node_28.fills = [{"type":"SOLID","visible":true,"opacity":1,"blendMode":"NORMAL","color":{"r":1,"g":1,"b":1},"boundVariables":{}}];
  node_28.textCase = 'ORIGINAL';
  node_28.textDecoration = 'NONE';
  node_28.letterSpacing = {"unit":"PERCENT","value":-3};
  node_28.lineHeight = {"unit":"PIXELS","value":61};
  node_28.hyperlink = null;
  node_28.textAlignHorizontal = 'LEFT';
  node_28.textAlignVertical = 'TOP';
  node_28.textAutoResize = 'WIDTH_AND_HEIGHT';
  node_28.paragraphIndent = 0;
  node_28.paragraphSpacing = 0;
  
  // base
  node_28.name = '+91 9267934029';
  // scene
  
  // layout
  node_28.resize(213, 61);
  
  node_28.x = 294;
  node_28.y = 3418;
  node_28.constrainProportions = false;
  node_28.constraints = {"horizontal":"MIN","vertical":"MIN"};
  node_28.layoutAlign = 'INHERIT';
  node_28.layoutGrow = 0;
  node_28.layoutPositioning = 'AUTO';
  node_28.rotation = 0;
  
  // blend
  node_28.blendMode = 'PASS_THROUGH';
  node_28.effects = [];
  node_28.isMask = false;
  // geometry
node_28.fills = [{"type":"SOLID","visible":true,"opacity":1,"blendMode":"NORMAL","color":{"r":1,"g":1,"b":1},"boundVariables":{}}]
node_28.strokeWeight = 0;

  // TEXT 
  const node_29 = figma.createText();
  
  // append
  node_0.appendChild(node_29);
  await figma.loadFontAsync({"family":"Instrument Sans","style":"SemiBold"});
  node_29.autoRename = true;
  node_29.fontName = {"family":"Instrument Sans","style":"SemiBold"};
  node_29.fontSize = 29;
  node_29.characters = 'sachinkr424@gmail.com';
  node_29.fills = [{"type":"SOLID","visible":true,"opacity":1,"blendMode":"NORMAL","color":{"r":1,"g":1,"b":1},"boundVariables":{}}];
  node_29.textCase = 'ORIGINAL';
  node_29.textDecoration = 'NONE';
  node_29.letterSpacing = {"unit":"PERCENT","value":-3};
  node_29.lineHeight = {"unit":"PIXELS","value":61};
  node_29.hyperlink = null;
  node_29.textAlignHorizontal = 'LEFT';
  node_29.textAlignVertical = 'TOP';
  node_29.textAutoResize = 'WIDTH_AND_HEIGHT';
  node_29.paragraphIndent = 0;
  node_29.paragraphSpacing = 0;
  
  // base
  node_29.name = 'sachinkr424@gmail.com';
  // scene
  
  // layout
  node_29.resize(318, 61);
  
  node_29.x = 1158;
  node_29.y = 3413;
  node_29.constrainProportions = false;
  node_29.constraints = {"horizontal":"MIN","vertical":"MIN"};
  node_29.layoutAlign = 'INHERIT';
  node_29.layoutGrow = 0;
  node_29.layoutPositioning = 'AUTO';
  node_29.rotation = 0;
  
  // blend
  node_29.blendMode = 'PASS_THROUGH';
  node_29.effects = [];
  node_29.isMask = false;
  // geometry
node_29.fills = [{"type":"SOLID","visible":true,"opacity":1,"blendMode":"NORMAL","color":{"r":1,"g":1,"b":1},"boundVariables":{}}]
node_29.strokeWeight = 0;

  // TEXT 
  const node_30 = figma.createText();
  
  // append
  node_0.appendChild(node_30);
  await figma.loadFontAsync({"family":"Instrument Sans","style":"Regular"});
  node_30.autoRename = true;
  node_30.fontName = {"family":"Instrument Sans","style":"Regular"};
  node_30.fontSize = 32;
  node_30.characters = '💬 Let's Collaborate
Looking for freelance opportunities, internships, or junior designer roles.  I’m open to feedback and eager to contribute creatively.';
  node_30.fills = [{"type":"SOLID","visible":true,"opacity":1,"blendMode":"NORMAL","color":{"r":1,"g":1,"b":1},"boundVariables":{}}];
  node_30.textCase = 'ORIGINAL';
  node_30.textDecoration = 'NONE';
  node_30.letterSpacing = {"unit":"PERCENT","value":-3};
  node_30.lineHeight = {"unit":"PIXELS","value":46};
  node_30.hyperlink = null;
  node_30.textAlignHorizontal = 'CENTER';
  node_30.textAlignVertical = 'TOP';
  node_30.textAutoResize = 'HEIGHT';
  node_30.paragraphIndent = 0;
  node_30.paragraphSpacing = 0;
  
  // base
  node_30.name = '💬 Let's Collaborate Looking for freelance opportunities, internships, or junior designer roles.  I’m open to feedback and eager to contribute creatively.';
  // scene
  
  // layout
  node_30.resize(1333, 138);
  
  node_30.x = 205;
  node_30.y = 3099;
  node_30.constrainProportions = false;
  node_30.constraints = {"horizontal":"MIN","vertical":"MIN"};
  node_30.layoutAlign = 'INHERIT';
  node_30.layoutGrow = 0;
  node_30.layoutPositioning = 'AUTO';
  node_30.rotation = 0;
  
  // blend
  node_30.blendMode = 'PASS_THROUGH';
  node_30.effects = [];
  node_30.isMask = false;
  // geometry
node_30.fills = [{"type":"SOLID","visible":true,"opacity":1,"blendMode":"NORMAL","color":{"r":1,"g":1,"b":1},"boundVariables":{}}]
node_30.strokeWeight = 0;

  // TEXT 
  const node_31 = figma.createText();
  
  // append
  node_0.appendChild(node_31);
  await figma.loadFontAsync({"family":"Inter","style":"Medium"});
  node_31.autoRename = true;
  node_31.fontName = {"family":"Inter","style":"Medium"};
  node_31.fontSize = 32;
  node_31.characters = 'FC';
  node_31.fills = [{"type":"SOLID","visible":true,"opacity":0,"blendMode":"NORMAL","color":{"r":1,"g":1,"b":1},"boundVariables":{}}];
  node_31.textCase = 'ORIGINAL';
  node_31.textDecoration = 'NONE';
  node_31.letterSpacing = {"unit":"PERCENT","value":-3};
  node_31.lineHeight = {"unit":"PIXELS","value":41};
  node_31.hyperlink = null;
  node_31.textAlignHorizontal = 'LEFT';
  node_31.textAlignVertical = 'TOP';
  node_31.textAutoResize = 'WIDTH_AND_HEIGHT';
  node_31.paragraphIndent = 0;
  node_31.paragraphSpacing = 0;
  
  // base
  node_31.name = 'FC';
  // scene
  
  // layout
  node_31.resize(42, 41);
  
  node_31.x = 813;
  node_31.y = 1816;
  node_31.constrainProportions = false;
  node_31.constraints = {"horizontal":"MIN","vertical":"MIN"};
  node_31.layoutAlign = 'INHERIT';
  node_31.layoutGrow = 0;
  node_31.layoutPositioning = 'AUTO';
  node_31.rotation = 0;
  
  // blend
  node_31.blendMode = 'PASS_THROUGH';
  node_31.effects = [];
  node_31.isMask = false;
  // geometry
node_31.fills = [{"type":"SOLID","visible":true,"opacity":0,"blendMode":"NORMAL","color":{"r":1,"g":1,"b":1},"boundVariables":{}}]
node_31.strokeWeight = 0;

  // FRAME
  const node_32 = figma.createFrame();
  
  // append
  node_0.appendChild(node_32);
  
  // layout
  node_32.resize(226, 41);
  
  node_32.x = 497;
  node_32.y = 3321;
  node_32.constrainProportions = false;
  node_32.constraints = {"horizontal":"MIN","vertical":"MIN"};
  node_32.layoutAlign = 'INHERIT';
  node_32.layoutGrow = 0;
  node_32.layoutPositioning = 'AUTO';
  node_32.rotation = 0;// before frame
  
  // frame
  node_32.layoutMode = 'HORIZONTAL';
  node_32.primaryAxisSizingMode = 'AUTO';
  node_32.primaryAxisAlignItems = 'CENTER';
  node_32.counterAxisAlignItems = 'CENTER';
  node_32.counterAxisSizingMode = 'AUTO';
  node_32.paddingLeft = 0;
  node_32.paddingRight = 0;
  node_32.paddingTop = 0;
  node_32.paddingBottom = 0;
  node_32.itemSpacing = 10;
  
  node_32.itemReverseZIndex = false;
  node_32.strokesIncludedInLayout = false;
  node_32.clipsContent = false;
  
  
  // base
  node_32.name = 'BIG BANG';
  // scene
  
  // blend
  node_32.blendMode = 'PASS_THROUGH';
  node_32.effects = [];
  node_32.isMask = false;
  // geometry
node_32.fills = [{"type":"SOLID","visible":false,"opacity":1,"blendMode":"NORMAL","color":{"r":1,"g":1,"b":1},"boundVariables":{}}]
node_32.strokeWeight = 0;
  
  // TEXT 
  const node_33 = figma.createText();
  
  // append
  node_32.appendChild(node_33);
  await figma.loadFontAsync({"family":"Inter","style":"Medium"});
  node_33.autoRename = true;
  node_33.fontName = {"family":"Inter","style":"Medium"};
  node_33.fontSize = 40;
  node_33.characters = 'INSTAGRAM';
  node_33.fills = [{"type":"SOLID","visible":true,"opacity":1,"blendMode":"NORMAL","color":{"r":1,"g":1,"b":1},"boundVariables":{}}];
  node_33.textCase = 'ORIGINAL';
  node_33.textDecoration = 'NONE';
  node_33.letterSpacing = {"unit":"PERCENT","value":-3};
  node_33.lineHeight = {"unit":"PIXELS","value":41};
  node_33.hyperlink = null;
  node_33.textAlignHorizontal = 'LEFT';
  node_33.textAlignVertical = 'TOP';
  node_33.textAutoResize = 'WIDTH_AND_HEIGHT';
  node_33.paragraphIndent = 0;
  node_33.paragraphSpacing = 0;
  
  // base
  node_33.name = 'BIG BANG';
  // scene
  node_33.setPluginData('componentPropertyReferences', '{}');
  
  // layout
  node_33.resize(226, 41);
  
  node_33.x = 0;
  node_33.y = 0;
  node_33.constrainProportions = false;
  node_33.constraints = {"horizontal":"MIN","vertical":"MIN"};
  node_33.layoutAlign = 'INHERIT';
  node_33.layoutGrow = 0;
  node_33.layoutPositioning = 'AUTO';
  node_33.rotation = 0;
  
  // blend
  node_33.blendMode = 'PASS_THROUGH';
  node_33.effects = [];
  node_33.isMask = false;
  // geometry
node_33.fills = [{"type":"SOLID","visible":true,"opacity":1,"blendMode":"NORMAL","color":{"r":1,"g":1,"b":1},"boundVariables":{}}]
node_33.strokeWeight = 0;

  // FRAME
  const node_34 = figma.createFrame();
  
  // append
  node_0.appendChild(node_34);
  
  // layout
  node_34.resize(176, 41);
  
  node_34.x = 1037;
  node_34.y = 3321;
  node_34.constrainProportions = false;
  node_34.constraints = {"horizontal":"MIN","vertical":"MIN"};
  node_34.layoutAlign = 'INHERIT';
  node_34.layoutGrow = 0;
  node_34.layoutPositioning = 'AUTO';
  node_34.rotation = 0;// before frame
  
  // frame
  node_34.layoutMode = 'HORIZONTAL';
  node_34.primaryAxisSizingMode = 'AUTO';
  node_34.primaryAxisAlignItems = 'CENTER';
  node_34.counterAxisAlignItems = 'CENTER';
  node_34.counterAxisSizingMode = 'AUTO';
  node_34.paddingLeft = 0;
  node_34.paddingRight = 0;
  node_34.paddingTop = 0;
  node_34.paddingBottom = 0;
  node_34.itemSpacing = 10;
  
  node_34.itemReverseZIndex = false;
  node_34.strokesIncludedInLayout = false;
  node_34.clipsContent = false;
  
  
  // base
  node_34.name = 'BIG BANG';
  // scene
  
  // blend
  node_34.blendMode = 'PASS_THROUGH';
  node_34.effects = [];
  node_34.isMask = false;
  // geometry
node_34.fills = [{"type":"SOLID","visible":false,"opacity":1,"blendMode":"NORMAL","color":{"r":1,"g":1,"b":1},"boundVariables":{}}]
node_34.strokeWeight = 0;
  
  // TEXT 
  const node_35 = figma.createText();
  
  // append
  node_34.appendChild(node_35);
  await figma.loadFontAsync({"family":"Inter","style":"Medium"});
  node_35.autoRename = true;
  node_35.fontName = {"family":"Inter","style":"Medium"};
  node_35.fontSize = 40;
  node_35.characters = 'LINKEDIN';
  node_35.fills = [{"type":"SOLID","visible":true,"opacity":1,"blendMode":"NORMAL","color":{"r":1,"g":1,"b":1},"boundVariables":{}}];
  node_35.textCase = 'ORIGINAL';
  node_35.textDecoration = 'NONE';
  node_35.letterSpacing = {"unit":"PERCENT","value":-3};
  node_35.lineHeight = {"unit":"PIXELS","value":41};
  node_35.hyperlink = null;
  node_35.textAlignHorizontal = 'LEFT';
  node_35.textAlignVertical = 'TOP';
  node_35.textAutoResize = 'WIDTH_AND_HEIGHT';
  node_35.paragraphIndent = 0;
  node_35.paragraphSpacing = 0;
  
  // base
  node_35.name = 'BIG BANG';
  // scene
  node_35.setPluginData('componentPropertyReferences', '{}');
  
  // layout
  node_35.resize(176, 41);
  
  node_35.x = 0;
  node_35.y = 0;
  node_35.constrainProportions = false;
  node_35.constraints = {"horizontal":"MIN","vertical":"MIN"};
  node_35.layoutAlign = 'INHERIT';
  node_35.layoutGrow = 0;
  node_35.layoutPositioning = 'AUTO';
  node_35.rotation = 0;
  
  // blend
  node_35.blendMode = 'PASS_THROUGH';
  node_35.effects = [];
  node_35.isMask = false;
  // geometry
node_35.fills = [{"type":"SOLID","visible":true,"opacity":1,"blendMode":"NORMAL","color":{"r":1,"g":1,"b":1},"boundVariables":{}}]
node_35.strokeWeight = 0;

  // FRAME
  const node_36 = figma.createFrame();
  
  // append
  node_0.appendChild(node_36);
  
  // layout
  node_36.resize(368, 416);
  
  node_36.x = 395;
  node_36.y = 2263;
  node_36.constrainProportions = false;
  node_36.constraints = {"horizontal":"MIN","vertical":"MIN"};
  node_36.layoutAlign = 'INHERIT';
  node_36.layoutGrow = 0;
  node_36.layoutPositioning = 'AUTO';
  node_36.rotation = 0;// before frame
  
  // frame
  node_36.layoutMode = 'VERTICAL';
  node_36.primaryAxisSizingMode = 'FIXED';
  node_36.primaryAxisAlignItems = 'MIN';
  node_36.counterAxisAlignItems = 'MIN';
  node_36.counterAxisSizingMode = 'FIXED';
  node_36.paddingLeft = 0;
  node_36.paddingRight = 0;
  node_36.paddingTop = 0;
  node_36.paddingBottom = 0;
  node_36.itemSpacing = 0;
  
  node_36.itemReverseZIndex = false;
  node_36.strokesIncludedInLayout = false;
  node_36.clipsContent = false;
  
  
  // base
  node_36.name = 'Frame 6';
  // scene
  
  // blend
  node_36.blendMode = 'PASS_THROUGH';
  node_36.effects = [];
  node_36.isMask = false;
  // geometry
node_36.fills = []
node_36.strokeWeight = 0;
  
  // VECTOR
  const node_37 = figma.createVector();
  
  // append
  node_36.appendChild(node_37);
  node_37.vectorNetwork = {"vertices":[{"x":38,"y":416,"strokeCap":"NONE","strokeJoin":"MITER","cornerRadius":0,"handleMirroring":"NONE"},{"x":0,"y":378,"strokeCap":"NONE","strokeJoin":"MITER","cornerRadius":0,"handleMirroring":"NONE"},{"x":368,"y":378,"strokeCap":"NONE","strokeJoin":"MITER","cornerRadius":0,"handleMirroring":"NONE"},{"x":330,"y":416,"strokeCap":"NONE","strokeJoin":"MITER","cornerRadius":0,"handleMirroring":"NONE"},{"x":330,"y":0,"strokeCap":"NONE","strokeJoin":"MITER","cornerRadius":0,"handleMirroring":"NONE"},{"x":368,"y":38,"strokeCap":"NONE","strokeJoin":"MITER","cornerRadius":0,"handleMirroring":"NONE"},{"x":38,"y":0,"strokeCap":"NONE","strokeJoin":"MITER","cornerRadius":0,"handleMirroring":"NONE"},{"x":0,"y":37.999996185302734,"strokeCap":"NONE","strokeJoin":"MITER","cornerRadius":0,"handleMirroring":"NONE"}],"segments":[{"start":6,"end":4,"tangentStart":{"x":0,"y":0},"tangentEnd":{"x":0,"y":0}},{"start":5,"end":2,"tangentStart":{"x":0,"y":0},"tangentEnd":{"x":0,"y":0}},{"start":3,"end":0,"tangentStart":{"x":0,"y":0},"tangentEnd":{"x":0,"y":0}},{"start":1,"end":7,"tangentStart":{"x":0,"y":0},"tangentEnd":{"x":0,"y":0}},{"start":0,"end":1,"tangentStart":{"x":-20.986820220947266,"y":0},"tangentEnd":{"x":0,"y":20.986820220947266}},{"start":2,"end":3,"tangentStart":{"x":0,"y":20.986820220947266},"tangentEnd":{"x":20.986820220947266,"y":0}},{"start":4,"end":5,"tangentStart":{"x":20.986820220947266,"y":0},"tangentEnd":{"x":0,"y":-20.986820220947266}},{"start":6,"end":7,"tangentStart":{"x":-20.986820220947266,"y":0},"tangentEnd":{"x":0,"y":-20.986820220947266}}],"regions":[{"windingRule":"NONZERO","loops":[[7,0,6,1,5,2,4,3]],"fillStyleId":"","fills":[{"type":"SOLID","visible":true,"opacity":1,"blendMode":"NORMAL","color":{"r":0.8509804010391235,"g":0.8509804010391235,"b":0.8509804010391235},"boundVariables":{}}]}]};
  
  // base
  node_37.name = 'Rectangle 21';
  
  // corner 
  node_37.cornerRadius = 0;
  // scene
  node_37.setPluginData('componentPropertyReferences', '{}');
  
  // layout
  node_37.resize(368, 416);
  
  node_37.x = 0;
  node_37.y = 0;
  node_37.constrainProportions = false;
  node_37.constraints = {"horizontal":"MIN","vertical":"MIN"};
  node_37.layoutAlign = 'INHERIT';
  node_37.layoutGrow = 0;
  node_37.layoutPositioning = 'AUTO';
  node_37.rotation = 0;
  
  // blend
  node_37.blendMode = 'PASS_THROUGH';
  node_37.effects = [];
  node_37.isMask = false;
  // geometry
node_37.fills = [{"type":"SOLID","visible":true,"opacity":1,"blendMode":"NORMAL","color":{"r":0.8509804010391235,"g":0.8509804010391235,"b":0.8509804010391235},"boundVariables":{}}]
node_37.strokeWeight = 0;

  // RECTANGLE
  const node_38 = figma.createRectangle();
  
  // append
  node_36.appendChild(node_38);
  
  // base
  node_38.name = 'Rectangle 25';
  // scene
  node_38.setPluginData('componentPropertyReferences', '{}');
  
  // layout
  node_38.resize(317, 200);
  
  node_38.x = 25;
  node_38.y = 178;
  node_38.constrainProportions = false;
  node_38.constraints = {"horizontal":"MIN","vertical":"MIN"};
  node_38.layoutAlign = 'INHERIT';
  node_38.layoutGrow = 0;
  node_38.layoutPositioning = 'ABSOLUTE';
  node_38.rotation = 0;
  
  // blend
  node_38.blendMode = 'PASS_THROUGH';
  node_38.effects = [];
  node_38.isMask = false;
  // geometry
node_38.fills = [{"type":"IMAGE","visible":true,"opacity":1,"blendMode":"NORMAL","scaleMode":"FILL","imageTransform":[[1,0,0],[0,1,0]],"scalingFactor":1,"rotation":0,"filters":{"exposure":0,"contrast":0,"saturation":0,"temperature":0,"tint":0,"highlights":0,"shadows":0},"imageHash":"42c7e6a5a3f3785bbeaf4390586f670e19bd84c0"}]
node_38.strokeWeight = 0;

  // TEXT 
  const node_39 = figma.createText();
  
  // append
  node_36.appendChild(node_39);
  await figma.loadFontAsync({"family":"Italiana","style":"Regular"});
  node_39.autoRename = true;
  node_39.fontName = {"family":"Italiana","style":"Regular"};
  node_39.fontSize = 48;
  node_39.characters = 'Graphic design
project and designs';
  node_39.fills = [{"type":"SOLID","visible":true,"opacity":1,"blendMode":"NORMAL","color":{"r":0,"g":0,"b":0},"boundVariables":{}}];
  node_39.textCase = 'ORIGINAL';
  node_39.textDecoration = 'NONE';
  node_39.letterSpacing = {"unit":"PERCENT","value":-3};
  node_39.lineHeight = {"unit":"PIXELS","value":39};
  node_39.hyperlink = null;
  node_39.textAlignHorizontal = 'LEFT';
  node_39.textAlignVertical = 'TOP';
  node_39.textAutoResize = 'NONE';
  node_39.paragraphIndent = 0;
  node_39.paragraphSpacing = 0;
  
  // base
  node_39.name = 'Graphic design project and designs';
  // scene
  node_39.setPluginData('componentPropertyReferences', '{}');
  
  // layout
  node_39.resize(345, 78);
  
  node_39.x = 40;
  node_39.y = 35;
  node_39.constrainProportions = false;
  node_39.constraints = {"horizontal":"MIN","vertical":"MIN"};
  node_39.layoutAlign = 'INHERIT';
  node_39.layoutGrow = 0;
  node_39.layoutPositioning = 'ABSOLUTE';
  node_39.rotation = 0;
  
  // blend
  node_39.blendMode = 'PASS_THROUGH';
  node_39.effects = [];
  node_39.isMask = false;
  // geometry
node_39.fills = [{"type":"SOLID","visible":true,"opacity":1,"blendMode":"NORMAL","color":{"r":0,"g":0,"b":0},"boundVariables":{}}]
node_39.strokeWeight = 0;

  // FRAME
  const node_40 = figma.createFrame();
  
  // append
  node_0.appendChild(node_40);
  
  // layout
  node_40.resize(368, 416);
  
  node_40.x = 978;
  node_40.y = 2263;
  node_40.constrainProportions = false;
  node_40.constraints = {"horizontal":"MIN","vertical":"MIN"};
  node_40.layoutAlign = 'INHERIT';
  node_40.layoutGrow = 0;
  node_40.layoutPositioning = 'AUTO';
  node_40.rotation = 0;// before frame
  
  // frame
  node_40.layoutMode = 'VERTICAL';
  node_40.primaryAxisSizingMode = 'FIXED';
  node_40.primaryAxisAlignItems = 'MIN';
  node_40.counterAxisAlignItems = 'MIN';
  node_40.counterAxisSizingMode = 'FIXED';
  node_40.paddingLeft = 0;
  node_40.paddingRight = 0;
  node_40.paddingTop = 0;
  node_40.paddingBottom = 0;
  node_40.itemSpacing = 0;
  
  node_40.itemReverseZIndex = false;
  node_40.strokesIncludedInLayout = false;
  node_40.clipsContent = false;
  
  
  // base
  node_40.name = 'Frame 7';
  // scene
  
  // blend
  node_40.blendMode = 'PASS_THROUGH';
  node_40.effects = [];
  node_40.isMask = false;
  // geometry
node_40.fills = []
node_40.strokeWeight = 0;
  
  // VECTOR
  const node_41 = figma.createVector();
  
  // append
  node_40.appendChild(node_41);
  node_41.vectorNetwork = {"vertices":[{"x":38,"y":416,"strokeCap":"NONE","strokeJoin":"MITER","cornerRadius":0,"handleMirroring":"NONE"},{"x":0,"y":378,"strokeCap":"NONE","strokeJoin":"MITER","cornerRadius":0,"handleMirroring":"NONE"},{"x":368,"y":378,"strokeCap":"NONE","strokeJoin":"MITER","cornerRadius":0,"handleMirroring":"NONE"},{"x":330,"y":416,"strokeCap":"NONE","strokeJoin":"MITER","cornerRadius":0,"handleMirroring":"NONE"},{"x":330,"y":0,"strokeCap":"NONE","strokeJoin":"MITER","cornerRadius":0,"handleMirroring":"NONE"},{"x":368,"y":38,"strokeCap":"NONE","strokeJoin":"MITER","cornerRadius":0,"handleMirroring":"NONE"},{"x":38,"y":0,"strokeCap":"NONE","strokeJoin":"MITER","cornerRadius":0,"handleMirroring":"NONE"},{"x":0,"y":37.999996185302734,"strokeCap":"NONE","strokeJoin":"MITER","cornerRadius":0,"handleMirroring":"NONE"}],"segments":[{"start":6,"end":4,"tangentStart":{"x":0,"y":0},"tangentEnd":{"x":0,"y":0}},{"start":5,"end":2,"tangentStart":{"x":0,"y":0},"tangentEnd":{"x":0,"y":0}},{"start":3,"end":0,"tangentStart":{"x":0,"y":0},"tangentEnd":{"x":0,"y":0}},{"start":1,"end":7,"tangentStart":{"x":0,"y":0},"tangentEnd":{"x":0,"y":0}},{"start":0,"end":1,"tangentStart":{"x":-20.986820220947266,"y":0},"tangentEnd":{"x":0,"y":20.986820220947266}},{"start":2,"end":3,"tangentStart":{"x":0,"y":20.986820220947266},"tangentEnd":{"x":20.986820220947266,"y":0}},{"start":4,"end":5,"tangentStart":{"x":20.986820220947266,"y":0},"tangentEnd":{"x":0,"y":-20.986820220947266}},{"start":6,"end":7,"tangentStart":{"x":-20.986820220947266,"y":0},"tangentEnd":{"x":0,"y":-20.986820220947266}}],"regions":[{"windingRule":"NONZERO","loops":[[7,0,6,1,5,2,4,3]],"fillStyleId":"","fills":[{"type":"SOLID","visible":true,"opacity":1,"blendMode":"NORMAL","color":{"r":0.8509804010391235,"g":0.8509804010391235,"b":0.8509804010391235},"boundVariables":{}}]}]};
  
  // base
  node_41.name = 'Rectangle 21';
  
  // corner 
  node_41.cornerRadius = 0;
  // scene
  node_41.setPluginData('componentPropertyReferences', '{}');
  
  // layout
  node_41.resize(368, 416);
  
  node_41.x = 0;
  node_41.y = 0;
  node_41.constrainProportions = false;
  node_41.constraints = {"horizontal":"MIN","vertical":"MIN"};
  node_41.layoutAlign = 'INHERIT';
  node_41.layoutGrow = 0;
  node_41.layoutPositioning = 'AUTO';
  node_41.rotation = 0;
  
  // blend
  node_41.blendMode = 'PASS_THROUGH';
  node_41.effects = [];
  node_41.isMask = false;
  // geometry
node_41.fills = [{"type":"SOLID","visible":true,"opacity":1,"blendMode":"NORMAL","color":{"r":0.8509804010391235,"g":0.8509804010391235,"b":0.8509804010391235},"boundVariables":{}}]
node_41.strokeWeight = 0;

  // RECTANGLE
  const node_42 = figma.createRectangle();
  
  // append
  node_40.appendChild(node_42);
  
  // base
  node_42.name = 'Rectangle 25';
  // scene
  node_42.setPluginData('componentPropertyReferences', '{}');
  
  // layout
  node_42.resize(317, 200);
  
  node_42.x = 25;
  node_42.y = 178;
  node_42.constrainProportions = false;
  node_42.constraints = {"horizontal":"MIN","vertical":"MIN"};
  node_42.layoutAlign = 'INHERIT';
  node_42.layoutGrow = 0;
  node_42.layoutPositioning = 'ABSOLUTE';
  node_42.rotation = 0;
  
  // blend
  node_42.blendMode = 'PASS_THROUGH';
  node_42.effects = [];
  node_42.isMask = false;
  // geometry
node_42.fills = [{"type":"IMAGE","visible":true,"opacity":1,"blendMode":"NORMAL","scaleMode":"FILL","imageTransform":[[1,0,0],[0,1,0]],"scalingFactor":1,"rotation":0,"filters":{"exposure":0,"contrast":0,"saturation":0,"temperature":0,"tint":0,"highlights":0,"shadows":0},"imageHash":"42c7e6a5a3f3785bbeaf4390586f670e19bd84c0"}]
node_42.strokeWeight = 0;

  // TEXT 
  const node_43 = figma.createText();
  
  // append
  node_40.appendChild(node_43);
  await figma.loadFontAsync({"family":"Italiana","style":"Regular"});
  node_43.autoRename = true;
  node_43.fontName = {"family":"Italiana","style":"Regular"};
  node_43.fontSize = 48;
  node_43.characters = 'Graphic design
project and designs';
  node_43.fills = [{"type":"SOLID","visible":true,"opacity":1,"blendMode":"NORMAL","color":{"r":0,"g":0,"b":0},"boundVariables":{}}];
  node_43.textCase = 'ORIGINAL';
  node_43.textDecoration = 'NONE';
  node_43.letterSpacing = {"unit":"PERCENT","value":-3};
  node_43.lineHeight = {"unit":"PIXELS","value":39};
  node_43.hyperlink = null;
  node_43.textAlignHorizontal = 'LEFT';
  node_43.textAlignVertical = 'TOP';
  node_43.textAutoResize = 'NONE';
  node_43.paragraphIndent = 0;
  node_43.paragraphSpacing = 0;
  
  // base
  node_43.name = 'Graphic design project and designs';
  // scene
  node_43.setPluginData('componentPropertyReferences', '{}');
  node_43.visible = false;
  
  // layout
  node_43.resize(345, 78);
  
  node_43.x = 40;
  node_43.y = 35;
  node_43.constrainProportions = false;
  node_43.constraints = {"horizontal":"MIN","vertical":"MIN"};
  node_43.layoutAlign = 'INHERIT';
  node_43.layoutGrow = 0;
  node_43.layoutPositioning = 'ABSOLUTE';
  node_43.rotation = 0;
  
  // blend
  node_43.blendMode = 'PASS_THROUGH';
  node_43.effects = [];
  node_43.isMask = false;
  // geometry
node_43.fills = [{"type":"SOLID","visible":true,"opacity":1,"blendMode":"NORMAL","color":{"r":0,"g":0,"b":0},"boundVariables":{}}]
node_43.strokeWeight = 0;

  // FRAME
  const node_44 = figma.createFrame();
  
  // append
  node_0.appendChild(node_44);
  
  // layout
  node_44.resize(1431, 55);
  
  node_44.x = 156;
  node_44.y = 130;
  node_44.constrainProportions = false;
  node_44.constraints = {"horizontal":"MIN","vertical":"MIN"};
  node_44.layoutAlign = 'INHERIT';
  node_44.layoutGrow = 0;
  node_44.layoutPositioning = 'AUTO';
  node_44.rotation = 0;// before frame
  
  // frame
  node_44.layoutMode = 'HORIZONTAL';
  node_44.primaryAxisSizingMode = 'FIXED';
  node_44.primaryAxisAlignItems = 'CENTER';
  node_44.counterAxisAlignItems = 'CENTER';
  node_44.counterAxisSizingMode = 'FIXED';
  node_44.paddingLeft = 422;
  node_44.paddingRight = 422;
  node_44.paddingTop = 7;
  node_44.paddingBottom = 7;
  node_44.itemSpacing = 152;
  
  node_44.itemReverseZIndex = false;
  node_44.strokesIncludedInLayout = false;
  node_44.clipsContent = false;
  
  // corner 
  node_44.topLeftRadius = 43;
  node_44.topRightRadius = 43;
  node_44.bottomLeftRadius = 43;
  node_44.bottomRightRadius = 43;
  node_44.clipsContent = true;
  
  // base
  node_44.name = 'Frame 3';
  // scene
  
  // blend
  node_44.blendMode = 'PASS_THROUGH';
  node_44.effects = [{"type":"BACKGROUND_BLUR","visible":true,"radius":6.300000190734863,"boundVariables":{},"blurType":"NORMAL"}];
  node_44.isMask = false;
  // geometry
node_44.fills = [{"type":"GRADIENT_LINEAR","visible":true,"opacity":1,"blendMode":"NORMAL","gradientStops":[{"color":{"r":0.09911242872476578,"g":0.11026257276535034,"b":0.32211539149284363,"a":0.5},"position":0,"boundVariables":{}},{"color":{"r":0.20994484424591064,"g":0.23356366157531738,"b":0.6823208332061768,"a":0.20000000298023224},"position":0.2507758140563965,"boundVariables":{}},{"color":{"r":0.2153192162513733,"g":0.2395426332950592,"b":0.6997874975204468,"a":0.30000001192092896},"position":0.6100006699562073,"boundVariables":{}},{"color":{"r":0.22218935191631317,"g":0.24718564748764038,"b":0.7221153974533081,"a":0.5},"position":1,"boundVariables":{}}],"gradientTransform":[[1.2446283102035522,0.010646641254425049,-0.0934993252158165],[-1.5657696723937988,1.2446283102035522,0.6176242232322693]]}]
node_44.strokeWeight = 0;
  
  // FRAME
  const node_45 = figma.createFrame();
  
  // append
  node_44.appendChild(node_45);
  
  // layout
  node_45.resize(191, 41);
  
  node_45.x = 105.5;
  node_45.y = 7;
  node_45.constrainProportions = false;
  node_45.constraints = {"horizontal":"MIN","vertical":"MIN"};
  node_45.layoutAlign = 'INHERIT';
  node_45.layoutGrow = 0;
  node_45.layoutPositioning = 'AUTO';
  node_45.rotation = 0;// before frame
  
  // frame
  node_45.layoutMode = 'NONE';
  node_45.primaryAxisSizingMode = 'AUTO';
  node_45.primaryAxisAlignItems = 'MIN';
  node_45.counterAxisAlignItems = 'MIN';
  node_45.counterAxisSizingMode = 'FIXED';
  node_45.paddingLeft = 0;
  node_45.paddingRight = 0;
  node_45.paddingTop = 0;
  node_45.paddingBottom = 0;
  node_45.itemSpacing = 0;
  
  node_45.clipsContent = false;
  
  
  // base
  node_45.name = 'menu item';
  // scene
  
  // blend
  node_45.blendMode = 'PASS_THROUGH';
  node_45.effects = [];
  node_45.isMask = false;
  // geometry
node_45.fills = [{"type":"SOLID","visible":false,"opacity":1,"blendMode":"NORMAL","color":{"r":1,"g":1,"b":1},"boundVariables":{}}]
node_45.strokeWeight = 0;
  
  // TEXT 
  const node_46 = figma.createText();
  
  // append
  node_45.appendChild(node_46);
  await figma.loadFontAsync({"family":"Inter","style":"Medium"});
  node_46.autoRename = true;
  node_46.fontName = {"family":"Inter","style":"Medium"};
  node_46.fontSize = 40;
  node_46.characters = 'HOME';
  node_46.fills = [{"type":"SOLID","visible":true,"opacity":0.5400000214576721,"blendMode":"NORMAL","color":{"r":0,"g":0,"b":0},"boundVariables":{}}];
  node_46.textCase = 'ORIGINAL';
  node_46.textDecoration = 'NONE';
  node_46.letterSpacing = {"unit":"PERCENT","value":-3};
  node_46.lineHeight = {"unit":"PIXELS","value":41};
  node_46.hyperlink = null;
  node_46.textAlignHorizontal = 'LEFT';
  node_46.textAlignVertical = 'TOP';
  node_46.textAutoResize = 'NONE';
  node_46.paragraphIndent = 0;
  node_46.paragraphSpacing = 0;
  
  // base
  node_46.name = 'menu item';
  // scene
  node_46.setPluginData('componentPropertyReferences', '{}');
  
  // layout
  node_46.resize(191, 41);
  
  node_46.x = 0;
  node_46.y = 0;
  node_46.constrainProportions = false;
  node_46.constraints = {"horizontal":"SCALE","vertical":"SCALE"};
  node_46.layoutAlign = 'INHERIT';
  node_46.layoutGrow = 0;
  node_46.layoutPositioning = 'AUTO';
  node_46.rotation = 0;
  
  // blend
  node_46.blendMode = 'PASS_THROUGH';
  node_46.effects = [];
  node_46.isMask = false;
  // geometry
node_46.fills = [{"type":"SOLID","visible":true,"opacity":0.5400000214576721,"blendMode":"NORMAL","color":{"r":0,"g":0,"b":0},"boundVariables":{}}]
node_46.strokeWeight = 0;

  // FRAME
  const node_47 = figma.createFrame();
  
  // append
  node_44.appendChild(node_47);
  
  // layout
  node_47.resize(191, 41);
  
  node_47.x = 448.5;
  node_47.y = 7;
  node_47.constrainProportions = false;
  node_47.constraints = {"horizontal":"MIN","vertical":"MIN"};
  node_47.layoutAlign = 'INHERIT';
  node_47.layoutGrow = 0;
  node_47.layoutPositioning = 'AUTO';
  node_47.rotation = 0;// before frame
  
  // frame
  node_47.layoutMode = 'NONE';
  node_47.primaryAxisSizingMode = 'AUTO';
  node_47.primaryAxisAlignItems = 'MIN';
  node_47.counterAxisAlignItems = 'MIN';
  node_47.counterAxisSizingMode = 'FIXED';
  node_47.paddingLeft = 0;
  node_47.paddingRight = 0;
  node_47.paddingTop = 0;
  node_47.paddingBottom = 0;
  node_47.itemSpacing = 0;
  
  node_47.clipsContent = false;
  
  
  // base
  node_47.name = 'menu item';
  // scene
  
  // blend
  node_47.blendMode = 'PASS_THROUGH';
  node_47.effects = [];
  node_47.isMask = false;
  // geometry
node_47.fills = [{"type":"SOLID","visible":false,"opacity":1,"blendMode":"NORMAL","color":{"r":1,"g":1,"b":1},"boundVariables":{}}]
node_47.strokeWeight = 0;
  
  // TEXT 
  const node_48 = figma.createText();
  
  // append
  node_47.appendChild(node_48);
  await figma.loadFontAsync({"family":"Inter","style":"Medium"});
  node_48.autoRename = true;
  node_48.fontName = {"family":"Inter","style":"Medium"};
  node_48.fontSize = 40;
  node_48.characters = 'ABOUT';
  node_48.fills = [{"type":"SOLID","visible":true,"opacity":0.5400000214576721,"blendMode":"NORMAL","color":{"r":0,"g":0,"b":0},"boundVariables":{}}];
  node_48.textCase = 'ORIGINAL';
  node_48.textDecoration = 'NONE';
  node_48.letterSpacing = {"unit":"PERCENT","value":-3};
  node_48.lineHeight = {"unit":"PIXELS","value":41};
  node_48.hyperlink = null;
  node_48.textAlignHorizontal = 'LEFT';
  node_48.textAlignVertical = 'TOP';
  node_48.textAutoResize = 'NONE';
  node_48.paragraphIndent = 0;
  node_48.paragraphSpacing = 0;
  
  // base
  node_48.name = 'menu item';
  // scene
  node_48.setPluginData('componentPropertyReferences', '{}');
  
  // layout
  node_48.resize(191, 41);
  
  node_48.x = 0;
  node_48.y = 0;
  node_48.constrainProportions = false;
  node_48.constraints = {"horizontal":"SCALE","vertical":"SCALE"};
  node_48.layoutAlign = 'INHERIT';
  node_48.layoutGrow = 0;
  node_48.layoutPositioning = 'AUTO';
  node_48.rotation = 0;
  
  // blend
  node_48.blendMode = 'PASS_THROUGH';
  node_48.effects = [];
  node_48.isMask = false;
  // geometry
node_48.fills = [{"type":"SOLID","visible":true,"opacity":0.5400000214576721,"blendMode":"NORMAL","color":{"r":0,"g":0,"b":0},"boundVariables":{}}]
node_48.strokeWeight = 0;

  // FRAME
  const node_49 = figma.createFrame();
  
  // append
  node_44.appendChild(node_49);
  
  // layout
  node_49.resize(191, 41);
  
  node_49.x = 791.5;
  node_49.y = 7;
  node_49.constrainProportions = false;
  node_49.constraints = {"horizontal":"MIN","vertical":"MIN"};
  node_49.layoutAlign = 'INHERIT';
  node_49.layoutGrow = 0;
  node_49.layoutPositioning = 'AUTO';
  node_49.rotation = 0;// before frame
  
  // frame
  node_49.layoutMode = 'NONE';
  node_49.primaryAxisSizingMode = 'AUTO';
  node_49.primaryAxisAlignItems = 'MIN';
  node_49.counterAxisAlignItems = 'MIN';
  node_49.counterAxisSizingMode = 'FIXED';
  node_49.paddingLeft = 0;
  node_49.paddingRight = 0;
  node_49.paddingTop = 0;
  node_49.paddingBottom = 0;
  node_49.itemSpacing = 0;
  
  node_49.clipsContent = false;
  
  
  // base
  node_49.name = 'menu item';
  // scene
  
  // blend
  node_49.blendMode = 'PASS_THROUGH';
  node_49.effects = [];
  node_49.isMask = false;
  // geometry
node_49.fills = [{"type":"SOLID","visible":false,"opacity":1,"blendMode":"NORMAL","color":{"r":1,"g":1,"b":1},"boundVariables":{}}]
node_49.strokeWeight = 0;
  
  // TEXT 
  const node_50 = figma.createText();
  
  // append
  node_49.appendChild(node_50);
  await figma.loadFontAsync({"family":"Inter","style":"Medium"});
  node_50.autoRename = true;
  node_50.fontName = {"family":"Inter","style":"Medium"};
  node_50.fontSize = 40;
  node_50.characters = 'PORTFOLIO';
  node_50.fills = [{"type":"SOLID","visible":true,"opacity":0.5400000214576721,"blendMode":"NORMAL","color":{"r":0,"g":0,"b":0},"boundVariables":{}}];
  node_50.textCase = 'ORIGINAL';
  node_50.textDecoration = 'NONE';
  node_50.letterSpacing = {"unit":"PERCENT","value":-3};
  node_50.lineHeight = {"unit":"PIXELS","value":41};
  node_50.hyperlink = null;
  node_50.textAlignHorizontal = 'LEFT';
  node_50.textAlignVertical = 'TOP';
  node_50.textAutoResize = 'WIDTH_AND_HEIGHT';
  node_50.paragraphIndent = 0;
  node_50.paragraphSpacing = 0;
  
  // base
  node_50.name = 'menu item';
  // scene
  node_50.setPluginData('componentPropertyReferences', '{}');
  
  // layout
  node_50.resize(217, 41);
  
  node_50.x = 0;
  node_50.y = 0;
  node_50.constrainProportions = false;
  node_50.constraints = {"horizontal":"SCALE","vertical":"SCALE"};
  node_50.layoutAlign = 'INHERIT';
  node_50.layoutGrow = 0;
  node_50.layoutPositioning = 'AUTO';
  node_50.rotation = 0;
  
  // blend
  node_50.blendMode = 'PASS_THROUGH';
  node_50.effects = [];
  node_50.isMask = false;
  // geometry
node_50.fills = [{"type":"SOLID","visible":true,"opacity":0.5400000214576721,"blendMode":"NORMAL","color":{"r":0,"g":0,"b":0},"boundVariables":{}}]
node_50.strokeWeight = 0;

  // FRAME
  const node_51 = figma.createFrame();
  
  // append
  node_44.appendChild(node_51);
  
  // layout
  node_51.resize(191, 41);
  
  node_51.x = 1134.5;
  node_51.y = 7;
  node_51.constrainProportions = false;
  node_51.constraints = {"horizontal":"MIN","vertical":"MIN"};
  node_51.layoutAlign = 'INHERIT';
  node_51.layoutGrow = 0;
  node_51.layoutPositioning = 'AUTO';
  node_51.rotation = 0;// before frame
  
  // frame
  node_51.layoutMode = 'HORIZONTAL';
  node_51.primaryAxisSizingMode = 'AUTO';
  node_51.primaryAxisAlignItems = 'MIN';
  node_51.counterAxisAlignItems = 'CENTER';
  node_51.counterAxisSizingMode = 'AUTO';
  node_51.paddingLeft = 0;
  node_51.paddingRight = 0;
  node_51.paddingTop = 0;
  node_51.paddingBottom = 0;
  node_51.itemSpacing = 152;
  
  node_51.itemReverseZIndex = false;
  node_51.strokesIncludedInLayout = false;
  node_51.clipsContent = false;
  
  
  // base
  node_51.name = 'Frame 4';
  // scene
  
  // blend
  node_51.blendMode = 'PASS_THROUGH';
  node_51.effects = [];
  node_51.isMask = false;
  // geometry
node_51.fills = []
node_51.strokeWeight = 0;
  
  // FRAME
  const node_52 = figma.createFrame();
  
  // append
  node_51.appendChild(node_52);
  
  // layout
  node_52.resize(191, 41);
  
  node_52.x = 0;
  node_52.y = 0;
  node_52.constrainProportions = false;
  node_52.constraints = {"horizontal":"MIN","vertical":"MIN"};
  node_52.layoutAlign = 'INHERIT';
  node_52.layoutGrow = 0;
  node_52.layoutPositioning = 'AUTO';
  node_52.rotation = 0;// before frame
  
  // frame
  node_52.layoutMode = 'NONE';
  node_52.primaryAxisSizingMode = 'AUTO';
  node_52.primaryAxisAlignItems = 'MIN';
  node_52.counterAxisAlignItems = 'MIN';
  node_52.counterAxisSizingMode = 'FIXED';
  node_52.paddingLeft = 0;
  node_52.paddingRight = 0;
  node_52.paddingTop = 0;
  node_52.paddingBottom = 0;
  node_52.itemSpacing = 0;
  
  node_52.clipsContent = false;
  
  
  // base
  node_52.name = 'menu item';
  // scene
  
  // blend
  node_52.blendMode = 'PASS_THROUGH';
  node_52.effects = [];
  node_52.isMask = false;
  // geometry
node_52.fills = [{"type":"SOLID","visible":false,"opacity":1,"blendMode":"NORMAL","color":{"r":1,"g":1,"b":1},"boundVariables":{}}]
node_52.strokeWeight = 0;
  
  // TEXT 
  const node_53 = figma.createText();
  
  // append
  node_52.appendChild(node_53);
  await figma.loadFontAsync({"family":"Inter","style":"Medium"});
  node_53.autoRename = true;
  node_53.fontName = {"family":"Inter","style":"Medium"};
  node_53.fontSize = 32;
  node_53.characters = 'CONTACT';
  node_53.fills = [{"type":"SOLID","visible":true,"opacity":0.5400000214576721,"blendMode":"NORMAL","color":{"r":0,"g":0,"b":0},"boundVariables":{}}];
  node_53.textCase = 'ORIGINAL';
  node_53.textDecoration = 'NONE';
  node_53.letterSpacing = {"unit":"PERCENT","value":-3};
  node_53.lineHeight = {"unit":"PIXELS","value":41};
  node_53.hyperlink = null;
  node_53.textAlignHorizontal = 'LEFT';
  node_53.textAlignVertical = 'TOP';
  node_53.textAutoResize = 'NONE';
  node_53.paragraphIndent = 0;
  node_53.paragraphSpacing = 0;
  
  // base
  node_53.name = 'menu item';
  // scene
  node_53.setPluginData('componentPropertyReferences', '{}');
  
  // layout
  node_53.resize(191, 41);
  
  node_53.x = 0;
  node_53.y = 0;
  node_53.constrainProportions = false;
  node_53.constraints = {"horizontal":"SCALE","vertical":"SCALE"};
  node_53.layoutAlign = 'INHERIT';
  node_53.layoutGrow = 0;
  node_53.layoutPositioning = 'AUTO';
  node_53.rotation = 0;
  
  // blend
  node_53.blendMode = 'PASS_THROUGH';
  node_53.effects = [];
  node_53.isMask = false;
  // geometry
node_53.fills = [{"type":"SOLID","visible":true,"opacity":0.5400000214576721,"blendMode":"NORMAL","color":{"r":0,"g":0,"b":0},"boundVariables":{}}]
node_53.strokeWeight = 0;
  return node_0;// return root
}
