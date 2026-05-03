package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.PlaneDeparture: ImageVector
    get() {
        if (_planeDeparture != null) return _planeDeparture!!
        _planeDeparture = tablerFilledIcon(
            name = "PlaneDeparture",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(9.674f, 3.827f),
                    PathNode.LineTo(14.941f, 9.142f),
                    PathNode.LineTo(19.191f, 8.003001f),
                    PathNode.CurveTo(20.22994f, 7.708117f, 21.347198f, 7.994419f, 22.116283f, 8.752617f),
                    PathNode.CurveTo(22.885368f, 9.510815f, 23.187567f, 10.623878f, 22.907524f, 11.666918f),
                    PathNode.CurveTo(22.62748f, 12.709956f, 21.808418f, 13.521975f, 20.763f, 13.793f),
                    PathNode.LineTo(6.273f, 17.676f),
                    PathNode.CurveTo(5.907347f, 17.773483f, 5.51799f, 17.656212f, 5.267f, 17.373f),
                    PathNode.LineTo(0.817f, 12.353f),
                    PathNode.CurveTo(0.587259f, 12.093601f, 0.508177f, 11.733757f, 0.607989f, 11.401935f),
                    PathNode.CurveTo(0.707801f, 11.070111f, 0.972278f, 10.813609f, 1.307f, 10.724f),
                    PathNode.LineTo(4.203f, 9.948f),
                    PathNode.CurveTo(4.459249f, 9.879336f, 4.732281f, 9.915309f, 4.962f, 10.048f),
                    PathNode.LineTo(7.053f, 11.255f),
                    PathNode.LineTo(8.270001f, 10.929f),
                    PathNode.LineTo(5.208f, 5.822f),
                    PathNode.CurveTo(5.046705f, 5.552863f, 5.021083f, 5.223626f, 5.138799f, 4.932776f),
                    PathNode.CurveTo(5.256515f, 4.641926f, 5.503918f, 4.42319f, 5.807f, 4.342f),
                    PathNode.LineTo(8.705f, 3.565f),
                    PathNode.CurveTo(9.051922f, 3.471767f, 9.422196f, 3.571779f, 9.675f, 3.827f)
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
                    PathNode.MoveTo(22.0f, 21.0f),
                    PathNode.CurveTo(22.0f, 21.552284f, 21.552284f, 22.0f, 21.0f, 22.0f),
                    PathNode.LineTo(3.0f, 22.0f),
                    PathNode.CurveTo(2.447715f, 22.0f, 2.0f, 21.552284f, 2.0f, 21.0f),
                    PathNode.CurveTo(2.0f, 20.447716f, 2.447715f, 20.0f, 3.0f, 20.0f),
                    PathNode.LineTo(21.0f, 20.0f),
                    PathNode.CurveTo(21.552284f, 20.0f, 22.0f, 20.447716f, 22.0f, 21.0f)
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
        return _planeDeparture!!
    }

private var _planeDeparture: ImageVector? = null
