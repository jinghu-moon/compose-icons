package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.Asset: ImageVector
    get() {
        if (_asset != null) return _asset!!
        _asset = tablerFilledIcon(
            name = "Asset",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(19.0f, 2.0f),
                    PathNode.CurveTo(19.957396f, 1.99957f, 20.8575f, 2.456124f, 21.422726f, 3.228863f),
                    PathNode.CurveTo(21.987951f, 4.001603f, 22.15041f, 4.997713f, 21.86f, 5.91f),
                    PathNode.LineTo(21.753f, 6.201f),
                    PathNode.LineTo(21.707f, 6.294f),
                    PathNode.QuadTo(21.646f, 6.422f, 21.573f, 6.544f),
                    PathNode.LineTo(15.097f, 18.453f),
                    PathNode.CurveTo(15.077158f, 18.48899f, 15.055116f, 18.523722f, 15.031f, 18.557f),
                    PathNode.CurveTo(13.428189f, 21.277327f, 10.202649f, 22.587927f, 7.156687f, 21.756487f),
                    PathNode.CurveTo(4.110724f, 20.925047f, 1.9984f, 18.1574f, 2.0f, 15.0f),
                    PathNode.LineTo(2.004f, 14.76f),
                    PathNode.CurveTo(2.084196f, 12.409188f, 3.339705f, 10.255815f, 5.346f, 9.028f),
                    PathNode.LineTo(5.602f, 8.878f),
                    PathNode.LineTo(17.307f, 2.523f),
                    PathNode.QuadTo(17.487f, 2.4f, 17.685f, 2.303f),
                    PathNode.LineTo(17.9f, 2.207f),
                    PathNode.LineTo(18.036f, 2.159f),
                    PathNode.CurveTo(18.338f, 2.056f, 18.663f, 2.0f, 19.0f, 2.0f),
                    PathNode.MoveTo(9.0f, 12.0f),
                    PathNode.CurveTo(7.411443f, 11.999911f, 6.098196f, 13.238178f, 6.005f, 14.824f),
                    PathNode.LineTo(6.0f, 15.0f),
                    PathNode.CurveTo(6.0f, 16.656855f, 7.343146f, 18.0f, 9.0f, 18.0f),
                    PathNode.CurveTo(10.656855f, 18.0f, 12.0f, 16.656855f, 12.0f, 15.0f),
                    PathNode.CurveTo(12.0f, 13.343145f, 10.656855f, 12.0f, 9.0f, 12.0f),
                    PathNode.MoveTo(16.04f, 5.488f),
                    PathNode.LineTo(10.92f, 8.266f),
                    PathNode.CurveTo(13.251699f, 8.932688f, 15.073183f, 10.757196f, 15.736f, 13.09f),
                    PathNode.LineTo(18.524f, 7.962f),
                    PathNode.CurveTo(17.249765f, 7.757661f, 16.248991f, 6.761316f, 16.039f, 5.488f),
                    PathNode.MoveTo(19.0f, 4.0f),
                    PathNode.CurveTo(18.892277f, 3.999815f, 18.78523f, 4.017037f, 18.683f, 4.051f),
                    PathNode.LineTo(18.373f, 4.221f),
                    PathNode.CurveTo(18.06542f, 4.468835f, 17.93255f, 4.874502f, 18.033909f, 5.256279f),
                    PathNode.CurveTo(18.135267f, 5.638056f, 18.45186f, 5.924394f, 18.841866f, 5.987026f),
                    PathNode.CurveTo(19.231873f, 6.049658f, 19.6222f, 5.876844f, 19.838f, 5.546f),
                    PathNode.LineTo(19.91f, 5.416f),
                    PathNode.CurveTo(20.051664f, 5.106325f, 20.026f, 4.745844f, 19.84189f, 4.459363f),
                    PathNode.CurveTo(19.657782f, 4.172881f, 19.34054f, 3.999784f, 19.0f, 4.0f)
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 4f,
            )
        }
        return _asset!!
    }

private var _asset: ImageVector? = null
