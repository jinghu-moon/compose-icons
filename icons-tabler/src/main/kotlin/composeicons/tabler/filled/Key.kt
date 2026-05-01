package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.Key: ImageVector
    get() {
        if (_key != null) return _key!!
        _key = tablerFilledIcon(
            name = "Key",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(14.52f, 2.0f),
                    PathNode.CurveTo(15.549f, 2.0f, 16.535f, 2.409f, 17.262f, 3.136f),
                    PathNode.LineTo(20.864f, 6.738f),
                    PathNode.CurveTo(21.591106f, 7.465082f, 21.999594f, 8.451233f, 21.999594f, 9.4795f),
                    PathNode.CurveTo(21.999594f, 10.507768f, 21.591106f, 11.493917f, 20.864f, 12.221f),
                    PathNode.LineTo(18.221f, 14.864f),
                    PathNode.CurveTo(16.89811f, 16.185638f, 14.820732f, 16.375675f, 13.28f, 15.316f),
                    PathNode.LineTo(13.175f, 15.238f),
                    PathNode.LineTo(7.293f, 21.121f),
                    PathNode.CurveTo(6.837761f, 21.574709f, 6.248844f, 21.870218f, 5.613f, 21.964f),
                    PathNode.LineTo(5.393f, 21.991f),
                    PathNode.LineTo(5.172f, 22.0f),
                    PathNode.LineTo(4.0f, 22.0f),
                    PathNode.CurveTo(2.986f, 22.0f, 2.133f, 21.241f, 2.009f, 20.177f),
                    PathNode.LineTo(2.0f, 20.0f),
                    PathNode.LineTo(2.0f, 18.828f),
                    PathNode.CurveTo(2.0f, 18.124f, 2.248f, 17.442f, 2.73f, 16.868f),
                    PathNode.LineTo(2.879f, 16.707f),
                    PathNode.LineTo(3.293f, 16.293f),
                    PathNode.CurveTo(3.480493f, 16.10545f, 3.734805f, 16.000057f, 4.0f, 16.0f),
                    PathNode.LineTo(5.0f, 16.0f),
                    PathNode.LineTo(5.0f, 15.0f),
                    PathNode.CurveTo(5.000067f, 14.493025f, 5.379507f, 14.066316f, 5.883f, 14.007f),
                    PathNode.LineTo(6.0f, 14.0f),
                    PathNode.LineTo(7.0f, 14.0f),
                    PathNode.LineTo(7.0f, 13.0f),
                    PathNode.CurveTo(6.999982f, 12.780202f, 7.072381f, 12.56652f, 7.206f, 12.392f),
                    PathNode.LineTo(7.293f, 12.292f),
                    PathNode.LineTo(8.761f, 10.823f),
                    PathNode.LineTo(8.685f, 10.72f),
                    PathNode.CurveTo(8.285733f, 10.138973f, 8.051424f, 9.460586f, 8.007f, 8.757f),
                    PathNode.LineTo(8.0f, 8.521f),
                    PathNode.CurveTo(8.0f, 7.492f, 8.409f, 6.506f, 9.136f, 5.779f),
                    PathNode.LineTo(11.779f, 3.136f),
                    PathNode.CurveTo(12.50608f, 2.409145f, 13.491913f, 2.000569f, 14.52f, 2.0f),
                    PathNode.MoveTo(15.015f, 7.0f),
                    PathNode.LineTo(14.995f, 7.0f),
                    PathNode.CurveTo(13.89043f, 7.0f, 12.995f, 7.895431f, 12.995f, 9.0f),
                    PathNode.CurveTo(12.995f, 10.104569f, 13.89043f, 11.0f, 14.995f, 11.0f),
                    PathNode.LineTo(15.015f, 11.0f),
                    PathNode.CurveTo(16.11957f, 11.0f, 17.015f, 10.104569f, 17.015f, 9.0f),
                    PathNode.CurveTo(17.015f, 7.895431f, 16.11957f, 7.0f, 15.015f, 7.0f)
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
        return _key!!
    }

private var _key: ImageVector? = null
