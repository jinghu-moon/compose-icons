package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.Badge4K: ImageVector
    get() {
        if (_badge4K != null) return _badge4K!!
        _badge4K = tablerFilledIcon(
            name = "Badge4K",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(19.0f, 4.0f),
                    PathNode.CurveTo(20.656855f, 4.0f, 22.0f, 5.343146f, 22.0f, 7.0f),
                    PathNode.LineTo(22.0f, 17.0f),
                    PathNode.CurveTo(22.0f, 18.656855f, 20.656855f, 20.0f, 19.0f, 20.0f),
                    PathNode.LineTo(5.0f, 20.0f),
                    PathNode.CurveTo(3.343146f, 20.0f, 2.0f, 18.656855f, 2.0f, 17.0f),
                    PathNode.LineTo(2.0f, 7.0f),
                    PathNode.CurveTo(2.0f, 5.343146f, 3.343146f, 4.0f, 5.0f, 4.0f),
                    PathNode.Close,
                    PathNode.MoveTo(10.0f, 8.0f),
                    PathNode.CurveTo(9.447715f, 8.0f, 9.0f, 8.447715f, 9.0f, 9.0f),
                    PathNode.LineTo(9.0f, 11.0f),
                    PathNode.LineTo(8.0f, 11.0f),
                    PathNode.LineTo(8.0f, 9.0f),
                    PathNode.CurveTo(8.0f, 8.447715f, 7.552285f, 8.0f, 7.0f, 8.0f),
                    PathNode.CurveTo(6.447716f, 8.0f, 6.0f, 8.447715f, 6.0f, 9.0f),
                    PathNode.LineTo(6.0f, 11.0f),
                    PathNode.CurveTo(6.0f, 12.104569f, 6.895431f, 13.0f, 8.0f, 13.0f),
                    PathNode.LineTo(9.0f, 13.0f),
                    PathNode.LineTo(9.0f, 15.0f),
                    PathNode.CurveTo(9.0f, 15.552285f, 9.447715f, 16.0f, 10.0f, 16.0f),
                    PathNode.CurveTo(10.552285f, 16.0f, 11.0f, 15.552285f, 11.0f, 15.0f),
                    PathNode.LineTo(11.0f, 9.0f),
                    PathNode.CurveTo(11.0f, 8.447715f, 10.552285f, 8.0f, 10.0f, 8.0f),
                    PathNode.MoveTo(17.555f, 8.168f),
                    PathNode.CurveTo(17.33435f, 8.020772f, 17.064243f, 7.967243f, 16.804123f, 8.019193f),
                    PathNode.CurveTo(16.543999f, 8.071142f, 16.315174f, 8.224313f, 16.168f, 8.445f),
                    PathNode.LineTo(15.0f, 10.196f),
                    PathNode.LineTo(15.0f, 9.0f),
                    PathNode.CurveTo(14.999933f, 8.493025f, 14.620493f, 8.066316f, 14.117f, 8.007f),
                    PathNode.LineTo(14.0f, 8.0f),
                    PathNode.CurveTo(13.447715f, 8.0f, 13.0f, 8.447715f, 13.0f, 9.0f),
                    PathNode.LineTo(13.0f, 15.0f),
                    PathNode.CurveTo(13.0f, 15.552285f, 13.447715f, 16.0f, 14.0f, 16.0f),
                    PathNode.CurveTo(14.552285f, 16.0f, 15.0f, 15.552285f, 15.0f, 15.0f),
                    PathNode.LineTo(15.0f, 13.804f),
                    PathNode.LineTo(16.168f, 15.554f),
                    PathNode.CurveTo(16.449137f, 15.976258f, 17.001907f, 16.121113f, 17.454f, 15.891f),
                    PathNode.LineTo(17.554f, 15.832f),
                    PathNode.LineTo(17.648f, 15.762f),
                    PathNode.CurveTo(18.03462f, 15.433282f, 18.113724f, 14.867094f, 17.832f, 14.445f),
                    PathNode.LineTo(16.202f, 12.0f),
                    PathNode.LineTo(17.832f, 9.555f),
                    PathNode.CurveTo(17.979227f, 9.33435f, 18.032757f, 9.064244f, 17.980808f, 8.804121f),
                    PathNode.CurveTo(17.928858f, 8.543999f, 17.775686f, 8.315173f, 17.555f, 8.168f)
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
        return _badge4K!!
    }

private var _badge4K: ImageVector? = null
