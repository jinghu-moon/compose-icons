package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.Battery: ImageVector
    get() {
        if (_battery != null) return _battery!!
        _battery = tablerFilledIcon(
            name = "Battery",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(17.0f, 6.0f),
                    PathNode.CurveTo(18.588558f, 5.999912f, 19.901804f, 7.238179f, 19.995f, 8.824f),
                    PathNode.LineTo(20.0f, 9.0f),
                    PathNode.LineTo(20.0f, 9.086f),
                    PathNode.LineTo(20.052f, 9.105f),
                    PathNode.CurveTo(20.57534f, 9.312124f, 20.93869f, 9.794788f, 20.993f, 10.355f),
                    PathNode.LineTo(21.0f, 10.5f),
                    PathNode.LineTo(21.0f, 13.5f),
                    PathNode.CurveTo(21.000107f, 14.115449f, 20.62426f, 14.668515f, 20.052f, 14.895f),
                    PathNode.LineTo(20.0f, 14.913f),
                    PathNode.LineTo(20.0f, 15.0f),
                    PathNode.CurveTo(20.000088f, 16.588558f, 18.761822f, 17.901804f, 17.176f, 17.995f),
                    PathNode.LineTo(17.0f, 18.0f),
                    PathNode.LineTo(6.0f, 18.0f),
                    PathNode.CurveTo(4.411443f, 18.000088f, 3.098195f, 16.761822f, 3.005f, 15.176f),
                    PathNode.LineTo(3.0f, 15.0f),
                    PathNode.LineTo(3.0f, 9.0f),
                    PathNode.CurveTo(2.999912f, 7.411443f, 4.238179f, 6.098196f, 5.824f, 6.005f),
                    PathNode.LineTo(6.0f, 6.0f),
                    PathNode.LineTo(17.0f, 6.0f),
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
        return _battery!!
    }

private var _battery: ImageVector? = null
