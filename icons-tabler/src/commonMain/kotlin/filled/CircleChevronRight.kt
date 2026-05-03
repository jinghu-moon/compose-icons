package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.CircleChevronRight: ImageVector
    get() {
        if (_circleChevronRight != null) return _circleChevronRight!!
        _circleChevronRight = tablerFilledIcon(
            name = "CircleChevronRight",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(12.0f, 2.0f),
                    PathNode.CurveTo(17.523f, 2.0f, 22.0f, 6.477f, 22.0f, 12.0f),
                    PathNode.CurveTo(22.0f, 17.522848f, 17.522848f, 22.0f, 12.0f, 22.0f),
                    PathNode.CurveTo(6.477153f, 22.0f, 2.0f, 17.522848f, 2.0f, 12.0f),
                    PathNode.CurveTo(2.0f, 6.477f, 6.477f, 2.0f, 12.0f, 2.0f),
                    PathNode.MoveTo(11.707f, 8.293f),
                    PathNode.CurveTo(11.3165f, 7.902618f, 10.6835f, 7.902618f, 10.293f, 8.293f),
                    PathNode.LineTo(10.21f, 8.387f),
                    PathNode.CurveTo(9.901197f, 8.785086f, 9.936765f, 9.350732f, 10.293f, 9.707f),
                    PathNode.LineTo(12.585f, 12.0f),
                    PathNode.LineTo(10.293f, 14.293f),
                    PathNode.CurveTo(9.914028f, 14.685379f, 9.919448f, 15.309085f, 10.305182f, 15.694818f),
                    PathNode.CurveTo(10.690915f, 16.080553f, 11.314621f, 16.085972f, 11.707f, 15.707f),
                    PathNode.LineTo(14.707f, 12.707f),
                    PathNode.CurveTo(15.097382f, 12.3165f, 15.097382f, 11.6835f, 14.707f, 11.293f),
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
        return _circleChevronRight!!
    }

private var _circleChevronRight: ImageVector? = null
