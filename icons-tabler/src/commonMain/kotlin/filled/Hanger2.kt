package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.Hanger2: ImageVector
    get() {
        if (_hanger2 != null) return _hanger2!!
        _hanger2 = tablerFilledIcon(
            name = "Hanger2",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(12.0f, 2.0f),
                    PathNode.CurveTo(13.656855f, 2.0f, 15.0f, 3.343146f, 15.0f, 5.0f),
                    PathNode.CurveTo(14.999413f, 5.529094f, 14.586789f, 5.966165f, 14.058605f, 5.997172f),
                    PathNode.CurveTo(13.530421f, 6.028179f, 13.06949f, 5.642391f, 13.007f, 5.117f),
                    PathNode.LineTo(13.0f, 5.0f),
                    PathNode.CurveTo(13.001104f, 4.447716f, 12.554285f, 3.999105f, 12.002f, 3.998f),
                    PathNode.CurveTo(11.449716f, 3.996896f, 11.001104f, 4.443715f, 11.0f, 4.996f),
                    PathNode.CurveTo(11.006f, 6.512f, 11.495f, 7.575f, 12.486f, 8.126001f),
                    PathNode.LineTo(20.456f, 12.554f),
                    PathNode.CurveTo(21.40892f, 13.082958f, 22.000004f, 14.087113f, 22.0f, 15.177f),
                    PathNode.LineTo(22.0f, 16.0f),
                    PathNode.CurveTo(22.000088f, 17.588558f, 20.761822f, 18.901804f, 19.176f, 18.995f),
                    PathNode.LineTo(19.0f, 19.0f),
                    PathNode.CurveTo(19.0f, 20.656855f, 17.656855f, 22.0f, 16.0f, 22.0f),
                    PathNode.LineTo(8.0f, 22.0f),
                    PathNode.CurveTo(6.343146f, 22.0f, 5.0f, 20.656855f, 5.0f, 19.0f),
                    PathNode.CurveTo(3.343146f, 19.0f, 2.0f, 17.656855f, 2.0f, 16.0f),
                    PathNode.LineTo(2.0f, 15.177f),
                    PathNode.CurveTo(1.999794f, 14.087324f, 2.590467f, 13.08322f, 3.543f, 12.554f),
                    PathNode.LineTo(10.238f, 8.834f),
                    PathNode.CurveTo(9.406f, 7.858f, 9.006f, 6.538f, 9.0f, 5.0f),
                    PathNode.CurveTo(9.0f, 3.343146f, 10.343145f, 2.0f, 12.0f, 2.0f),
                    PathNode.MoveTo(12.0f, 10.144f),
                    PathNode.LineTo(4.514f, 14.302f),
                    PathNode.CurveTo(4.196409f, 14.478609f, 3.999622f, 14.813606f, 4.0f, 15.177f),
                    PathNode.LineTo(4.0f, 16.0f),
                    PathNode.CurveTo(4.0f, 16.552284f, 4.447716f, 17.0f, 5.0f, 17.0f),
                    PathNode.LineTo(5.17f, 17.0f),
                    PathNode.CurveTo(5.593975f, 15.800817f, 6.728074f, 14.999333f, 8.0f, 15.0f),
                    PathNode.LineTo(16.0f, 15.0f),
                    PathNode.CurveTo(17.306f, 15.0f, 18.418f, 15.835f, 18.83f, 17.0f),
                    PathNode.LineTo(19.0f, 17.0f),
                    PathNode.CurveTo(19.552284f, 17.0f, 20.0f, 16.552284f, 20.0f, 16.0f),
                    PathNode.LineTo(20.0f, 15.177f),
                    PathNode.CurveTo(20.000177f, 14.813396f, 19.802977f, 14.478348f, 19.485f, 14.302f),
                    PathNode.Close
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
        return _hanger2!!
    }

private var _hanger2: ImageVector? = null
