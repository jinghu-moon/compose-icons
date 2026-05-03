package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.CircleNumber6: ImageVector
    get() {
        if (_circleNumber6 != null) return _circleNumber6!!
        _circleNumber6 = tablerFilledIcon(
            name = "CircleNumber6",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(12.0f, 2.0f),
                    PathNode.CurveTo(17.523f, 2.0f, 22.0f, 6.477f, 22.0f, 12.0f),
                    PathNode.CurveTo(22.0f, 17.523f, 17.523f, 22.0f, 12.0f, 22.0f),
                    PathNode.CurveTo(6.477f, 22.0f, 2.0f, 17.523f, 2.0f, 12.0f),
                    PathNode.CurveTo(2.0f, 6.477f, 6.477f, 2.0f, 12.0f, 2.0f),
                    PathNode.Close,
                    PathNode.MoveTo(13.0f, 7.0f),
                    PathNode.LineTo(11.0f, 7.0f),
                    PathNode.LineTo(10.85f, 7.005f),
                    PathNode.CurveTo(9.866108f, 7.07894f, 9.083146f, 7.859354f, 9.006f, 8.843f),
                    PathNode.LineTo(9.0f, 9.0f),
                    PathNode.LineTo(9.0f, 15.0f),
                    PathNode.LineTo(9.005f, 15.15f),
                    PathNode.CurveTo(9.078939f, 16.133892f, 9.859354f, 16.916855f, 10.843f, 16.994f),
                    PathNode.LineTo(11.0f, 17.0f),
                    PathNode.LineTo(13.0f, 17.0f),
                    PathNode.LineTo(13.15f, 16.995f),
                    PathNode.CurveTo(14.133892f, 16.92106f, 14.916854f, 16.140646f, 14.994f, 15.157f),
                    PathNode.LineTo(15.0f, 15.0f),
                    PathNode.LineTo(15.0f, 13.0f),
                    PathNode.LineTo(14.995f, 12.85f),
                    PathNode.CurveTo(14.921061f, 11.866108f, 14.140646f, 11.083146f, 13.157f, 11.006f),
                    PathNode.LineTo(13.0f, 11.0f),
                    PathNode.LineTo(11.0f, 11.0f),
                    PathNode.LineTo(11.0f, 9.0f),
                    PathNode.LineTo(13.0f, 9.0f),
                    PathNode.LineTo(13.007f, 9.117f),
                    PathNode.CurveTo(13.06949f, 9.64239f, 13.530421f, 10.028179f, 14.058605f, 9.997172f),
                    PathNode.CurveTo(14.586789f, 9.966165f, 14.999413f, 9.529094f, 15.0f, 9.0f),
                    PathNode.CurveTo(15.000331f, 7.953376f, 14.193677f, 7.083497f, 13.15f, 7.005f),
                    PathNode.LineTo(13.0f, 7.0f),
                    PathNode.Close,
                    PathNode.MoveTo(13.0f, 13.0f),
                    PathNode.LineTo(13.0f, 15.0f),
                    PathNode.LineTo(11.0f, 15.0f),
                    PathNode.LineTo(11.0f, 13.0f),
                    PathNode.LineTo(13.0f, 13.0f),
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
        return _circleNumber6!!
    }

private var _circleNumber6: ImageVector? = null
