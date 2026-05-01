package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.BrandPinterest: ImageVector
    get() {
        if (_brandPinterest != null) return _brandPinterest!!
        _brandPinterest = tablerFilledIcon(
            name = "BrandPinterest",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(17.0f, 3.34f),
                    PathNode.CurveTo(21.505798f, 5.942311f, 23.26307f, 11.565092f, 21.040989f, 16.270046f),
                    PathNode.CurveTo(18.818907f, 20.975f, 13.360093f, 23.189732f, 8.488f, 21.363f),
                    PathNode.LineTo(10.852f, 16.048f),
                    PathNode.CurveTo(11.500938f, 16.659122f, 12.358602f, 16.999613f, 13.25f, 17.0f),
                    PathNode.CurveTo(15.958f, 17.0f, 18.0f, 14.911f, 18.0f, 12.0f),
                    PathNode.CurveTo(18.00241f, 9.604882f, 16.580147f, 7.43777f, 14.381832f, 6.486976f),
                    PathNode.CurveTo(12.183517f, 5.536182f, 9.630326f, 5.983868f, 7.886642f, 7.625867f),
                    PathNode.CurveTo(6.142957f, 9.267865f, 5.54285f, 11.789587f, 6.36f, 14.041f),
                    PathNode.CurveTo(6.479024f, 14.380612f, 6.771345f, 14.63008f, 7.125446f, 14.694236f),
                    PathNode.CurveTo(7.479546f, 14.75839f, 7.840809f, 14.627337f, 8.071416f, 14.351069f),
                    PathNode.CurveTo(8.302023f, 14.074802f, 8.366405f, 13.695934f, 8.24f, 13.359f),
                    PathNode.CurveTo(7.695207f, 11.857983f, 8.095349f, 10.176749f, 9.257924f, 9.082093f),
                    PathNode.CurveTo(10.4205f, 7.987438f, 12.12275f, 7.689105f, 13.588296f, 8.323162f),
                    PathNode.CurveTo(15.053843f, 8.957219f, 16.001873f, 10.402175f, 16.0f, 11.999f),
                    PathNode.CurveTo(16.0f, 13.817f, 14.844f, 15.0f, 13.25f, 15.0f),
                    PathNode.CurveTo(12.641f, 15.0f, 12.097f, 14.639f, 11.772f, 13.978f),
                    PathNode.LineTo(12.914f, 11.406f),
                    PathNode.CurveTo(13.138227f, 10.901212f, 12.910789f, 10.310227f, 12.406f, 10.086f),
                    PathNode.CurveTo(11.901212f, 9.861773f, 11.310227f, 10.089211f, 11.086f, 10.594f),
                    PathNode.LineTo(6.694f, 20.476f),
                    PathNode.CurveTo(3.773687f, 18.647924f, 2.000077f, 15.4453f, 2.0f, 12.0f),
                    PathNode.LineTo(2.005f, 11.676f),
                    PathNode.CurveTo(2.118919f, 8.162982f, 4.068822f, 4.967704f, 7.140892f, 3.259883f),
                    PathNode.CurveTo(10.212963f, 1.552061f, 13.95609f, 1.582479f, 17.0f, 3.34f)
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 4f,
            )
        }
        return _brandPinterest!!
    }

private var _brandPinterest: ImageVector? = null
