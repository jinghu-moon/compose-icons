package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.Balloon: ImageVector
    get() {
        if (_balloon != null) return _balloon!!
        _balloon = tablerFilledIcon(
            name = "Balloon",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(12.0f, 1.0f),
                    PathNode.CurveTo(15.865993f, 1.0f, 19.0f, 4.134007f, 19.0f, 8.0f),
                    PathNode.CurveTo(19.0f, 13.457f, 15.972f, 18.0f, 12.0f, 18.0f),
                    PathNode.CurveTo(8.100001f, 18.0f, 5.11f, 13.621f, 5.003f, 8.297f),
                    PathNode.LineTo(5.0f, 8.0f),
                    PathNode.LineTo(5.004f, 7.76f),
                    PathNode.CurveTo(5.133347f, 3.989595f, 8.227377f, 0.999938f, 12.0f, 1.0f),
                    PathNode.Close,
                    PathNode.MoveTo(12.0f, 5.0f),
                    PathNode.CurveTo(11.447715f, 5.0f, 11.0f, 5.447716f, 11.0f, 6.0f),
                    PathNode.CurveTo(11.0f, 6.552285f, 11.447715f, 7.0f, 12.0f, 7.0f),
                    PathNode.LineTo(12.117f, 7.007f),
                    PathNode.CurveTo(12.620493f, 7.066316f, 12.999933f, 7.493026f, 13.0f, 8.0f),
                    PathNode.LineTo(13.007f, 8.117f),
                    PathNode.CurveTo(13.06949f, 8.64239f, 13.530421f, 9.028179f, 14.058605f, 8.997172f),
                    PathNode.CurveTo(14.586789f, 8.966165f, 14.999413f, 8.529094f, 15.0f, 8.0f),
                    PathNode.CurveTo(15.0f, 6.343146f, 13.656855f, 5.0f, 12.0f, 5.0f),
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
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(12.0f, 16.0f),
                    PathNode.CurveTo(12.506975f, 16.000067f, 12.933684f, 16.379507f, 12.993f, 16.883f),
                    PathNode.LineTo(13.0f, 17.0f),
                    PathNode.LineTo(13.0f, 18.0f),
                    PathNode.CurveTo(13.000089f, 19.588558f, 11.761822f, 20.901804f, 10.176f, 20.995f),
                    PathNode.LineTo(10.0f, 21.0f),
                    PathNode.LineTo(7.0f, 21.0f),
                    PathNode.CurveTo(6.493026f, 21.000067f, 6.066316f, 21.379507f, 6.007f, 21.883f),
                    PathNode.LineTo(6.0f, 22.0f),
                    PathNode.CurveTo(6.0f, 22.552284f, 5.552285f, 23.0f, 5.0f, 23.0f),
                    PathNode.CurveTo(4.447716f, 23.0f, 4.0f, 22.552284f, 4.0f, 22.0f),
                    PathNode.CurveTo(3.999912f, 20.411442f, 5.238179f, 19.098196f, 6.824f, 19.005f),
                    PathNode.LineTo(7.0f, 19.0f),
                    PathNode.LineTo(10.0f, 19.0f),
                    PathNode.CurveTo(10.506975f, 18.999933f, 10.933684f, 18.620493f, 10.993f, 18.117f),
                    PathNode.LineTo(11.0f, 18.0f),
                    PathNode.LineTo(11.0f, 17.0f),
                    PathNode.CurveTo(11.0f, 16.447716f, 11.447715f, 16.0f, 12.0f, 16.0f),
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
        return _balloon!!
    }

private var _balloon: ImageVector? = null
