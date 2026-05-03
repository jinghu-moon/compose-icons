package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.Paint: ImageVector
    get() {
        if (_paint != null) return _paint!!
        _paint = tablerFilledIcon(
            name = "Paint",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(17.0f, 2.0f),
                    PathNode.CurveTo(18.588558f, 1.999912f, 19.901804f, 3.238179f, 19.995f, 4.824f),
                    PathNode.LineTo(20.0f, 5.0f),
                    PathNode.CurveTo(21.656855f, 5.0f, 23.0f, 6.343146f, 23.0f, 8.0f),
                    PathNode.CurveTo(23.000118f, 11.226243f, 20.448973f, 13.875016f, 17.225f, 13.996f),
                    PathNode.LineTo(17.0f, 14.0f),
                    PathNode.LineTo(13.0f, 14.0f),
                    PathNode.LineTo(13.15f, 14.005f),
                    PathNode.CurveTo(14.133892f, 14.078939f, 14.916854f, 14.859354f, 14.994f, 15.843f),
                    PathNode.LineTo(15.0f, 16.0f),
                    PathNode.LineTo(15.0f, 20.0f),
                    PathNode.CurveTo(15.000331f, 21.046625f, 14.193677f, 21.916504f, 13.15f, 21.995f),
                    PathNode.LineTo(13.0f, 22.0f),
                    PathNode.LineTo(11.0f, 22.0f),
                    PathNode.CurveTo(9.953375f, 22.000332f, 9.083497f, 21.193678f, 9.005f, 20.15f),
                    PathNode.LineTo(9.0f, 20.0f),
                    PathNode.LineTo(9.0f, 16.0f),
                    PathNode.CurveTo(8.999669f, 14.953375f, 9.806323f, 14.083497f, 10.85f, 14.005f),
                    PathNode.LineTo(11.0f, 14.0f),
                    PathNode.LineTo(11.0f, 13.0f),
                    PathNode.CurveTo(11.000067f, 12.493025f, 11.379507f, 12.066316f, 11.883f, 12.007f),
                    PathNode.LineTo(12.0f, 12.0f),
                    PathNode.LineTo(17.0f, 12.0f),
                    PathNode.CurveTo(19.209139f, 12.0f, 21.0f, 10.209139f, 21.0f, 8.0f),
                    PathNode.CurveTo(20.999933f, 7.493026f, 20.620493f, 7.066316f, 20.117f, 7.007f),
                    PathNode.LineTo(20.0f, 7.0f),
                    PathNode.LineTo(19.995f, 7.176f),
                    PathNode.CurveTo(19.905846f, 8.694429f, 18.69443f, 9.905846f, 17.176f, 9.995f),
                    PathNode.LineTo(17.0f, 10.0f),
                    PathNode.LineTo(7.0f, 10.0f),
                    PathNode.CurveTo(5.411443f, 10.000089f, 4.098196f, 8.761822f, 4.005f, 7.176f),
                    PathNode.LineTo(4.0f, 7.0f),
                    PathNode.LineTo(4.0f, 5.0f),
                    PathNode.CurveTo(3.999912f, 3.411442f, 5.238179f, 2.098195f, 6.824f, 2.005f),
                    PathNode.LineTo(7.0f, 2.0f),
                    PathNode.LineTo(17.0f, 2.0f),
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
        return _paint!!
    }

private var _paint: ImageVector? = null
