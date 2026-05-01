package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.TrafficCone: ImageVector
    get() {
        if (_trafficCone != null) return _trafficCone!!
        _trafficCone = phosphorBoldIcon(
            name = "TrafficCone",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(232.0f, 204.0f),
                    PathNode.LineTo(216.53f, 204.0f),
                    PathNode.LineTo(157.2f, 33.43f),
                    PathNode.CurveTo(154.4034f, 25.38921f, 146.82324f, 20.000034f, 138.31f, 20.0f),
                    PathNode.LineTo(117.69f, 20.0f),
                    PathNode.CurveTo(109.17676f, 20.000034f, 101.5966f, 25.38921f, 98.8f, 33.43f),
                    PathNode.LineTo(39.47f, 204.0f),
                    PathNode.LineTo(24.0f, 204.0f),
                    PathNode.CurveTo(17.372583f, 204.0f, 12.0f, 209.37259f, 12.0f, 216.0f),
                    PathNode.CurveTo(12.0f, 222.62741f, 17.372583f, 228.0f, 24.0f, 228.0f),
                    PathNode.LineTo(232.0f, 228.0f),
                    PathNode.CurveTo(238.62741f, 228.0f, 244.0f, 222.62741f, 244.0f, 216.0f),
                    PathNode.CurveTo(244.0f, 209.37259f, 238.62741f, 204.0f, 232.0f, 204.0f),
                    PathNode.Close,
                    PathNode.MoveTo(98.27f, 108.0f),
                    PathNode.LineTo(157.73f, 108.0f),
                    PathNode.LineTo(171.64f, 148.0f),
                    PathNode.LineTo(84.36f, 148.0f),
                    PathNode.Close,
                    PathNode.MoveTo(120.53f, 44.0f),
                    PathNode.LineTo(135.47f, 44.0f),
                    PathNode.LineTo(149.38f, 84.0f),
                    PathNode.LineTo(106.62f, 84.0f),
                    PathNode.Close,
                    PathNode.MoveTo(76.0f, 172.0f),
                    PathNode.LineTo(180.0f, 172.0f),
                    PathNode.LineTo(191.13f, 204.0f),
                    PathNode.LineTo(64.88f, 204.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 24.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _trafficCone!!
    }

private var _trafficCone: ImageVector? = null
