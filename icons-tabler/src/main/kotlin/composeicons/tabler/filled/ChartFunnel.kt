package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.ChartFunnel: ImageVector
    get() {
        if (_chartFunnel != null) return _chartFunnel!!
        _chartFunnel = tablerFilledIcon(
            name = "ChartFunnel",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(17.72f, 16.0f),
                    PathNode.LineTo(16.405f, 19.948f),
                    PathNode.CurveTo(15.996784f, 21.173628f, 14.849822f, 22.00031f, 13.558f, 22.0f),
                    PathNode.LineTo(10.442f, 22.0f),
                    PathNode.CurveTo(9.150178f, 22.00031f, 8.003216f, 21.173628f, 7.595f, 19.948f),
                    PathNode.LineTo(6.28f, 16.0f),
                    PathNode.Close,
                    PathNode.MoveTo(19.72f, 10.0f),
                    PathNode.LineTo(18.387f, 14.0f),
                    PathNode.LineTo(5.613f, 14.0f),
                    PathNode.LineTo(4.28f, 10.0f),
                    PathNode.Close,
                    PathNode.MoveTo(19.614f, 2.0f),
                    PathNode.CurveTo(20.256535f, 2.000488f, 20.859709f, 2.309651f, 21.23527f, 2.831f),
                    PathNode.CurveTo(21.61083f, 3.352349f, 21.713041f, 4.02239f, 21.51f, 4.632f),
                    PathNode.LineTo(20.387f, 8.0f),
                    PathNode.LineTo(3.613f, 8.0f),
                    PathNode.LineTo(2.49f, 4.632f),
                    PathNode.CurveTo(2.296794f, 4.051811f, 2.379635f, 3.415114f, 2.714872f, 2.903682f),
                    PathNode.CurveTo(3.05011f, 2.392249f, 3.600902f, 2.062288f, 4.21f, 2.008f),
                    PathNode.LineTo(4.387f, 2.0f),
                    PathNode.Close
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
        return _chartFunnel!!
    }

private var _chartFunnel: ImageVector? = null
