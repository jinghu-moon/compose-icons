package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.GlobeSimpleX: ImageVector
    get() {
        if (_globeSimpleX != null) return _globeSimpleX!!
        _globeSimpleX = phosphorBoldIcon(
            name = "GlobeSimpleX",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(224.49f, 176.49f),
                    PathNode.LineTo(209.0f, 192.0f),
                    PathNode.LineTo(224.52f, 207.51f),
                    PathNode.CurveTo(229.21442f, 212.20442f, 229.21442f, 219.81558f, 224.52f, 224.51f),
                    PathNode.CurveTo(219.82558f, 229.20442f, 212.21442f, 229.20442f, 207.52f, 224.51f),
                    PathNode.LineTo(192.0f, 209.0f),
                    PathNode.LineTo(176.49f, 224.52f),
                    PathNode.CurveTo(171.79558f, 229.21442f, 164.18442f, 229.21442f, 159.49f, 224.52f),
                    PathNode.CurveTo(154.79558f, 219.82558f, 154.79558f, 212.21442f, 159.49f, 207.52f),
                    PathNode.LineTo(175.0f, 192.0f),
                    PathNode.LineTo(159.48f, 176.49f),
                    PathNode.CurveTo(154.78558f, 171.79558f, 154.78558f, 164.18442f, 159.48f, 159.49f),
                    PathNode.CurveTo(164.17442f, 154.79558f, 171.78558f, 154.79558f, 176.48f, 159.49f),
                    PathNode.LineTo(192.0f, 175.0f),
                    PathNode.LineTo(207.51f, 159.48f),
                    PathNode.CurveTo(212.20442f, 154.78558f, 219.81558f, 154.78558f, 224.51f, 159.48f),
                    PathNode.CurveTo(229.20442f, 164.17442f, 229.20442f, 171.78558f, 224.51f, 176.48f),
                    PathNode.Close,
                    PathNode.MoveTo(236.0f, 128.0f),
                    PathNode.CurveTo(236.0f, 134.62741f, 230.62741f, 140.0f, 224.0f, 140.0f),
                    PathNode.LineTo(100.54f, 140.0f),
                    PathNode.CurveTo(104.91f, 189.56f, 135.17f, 214.37f, 135.54f, 214.63f),
                    PathNode.LineTo(135.54f, 214.63f),
                    PathNode.CurveTo(139.52548f, 217.81866f, 141.05777f, 223.17953f, 139.3595f, 227.99281f),
                    PathNode.CurveTo(137.66124f, 232.80609f, 133.10406f, 236.01839f, 128.0f, 236.0f),
                    PathNode.CurveTo(68.35325f, 236.0f, 20.0f, 187.64676f, 20.0f, 128.0f),
                    PathNode.CurveTo(20.0f, 68.35325f, 68.35325f, 20.0f, 128.0f, 20.0f),
                    PathNode.CurveTo(187.64676f, 20.0f, 236.0f, 68.35325f, 236.0f, 128.0f),
                    PathNode.Close,
                    PathNode.MoveTo(158.21f, 49.64f),
                    PathNode.CurveTo(170.64299f, 69.68276f, 177.97356f, 92.46758f, 179.56f, 116.0f),
                    PathNode.LineTo(211.13f, 116.0f),
                    PathNode.CurveTo(206.7406f, 85.95834f, 186.52165f, 60.604424f, 158.21f, 49.64f),
                    PathNode.Close,
                    PathNode.MoveTo(117.64f, 63.23f),
                    PathNode.CurveTo(107.884476f, 79.23811f, 102.02387f, 97.31315f, 100.53f, 116.0f),
                    PathNode.LineTo(155.47f, 116.0f),
                    PathNode.CurveTo(152.47f, 82.1f, 137.38f, 59.78f, 128.02f, 49.0f),
                    PathNode.CurveTo(124.17746f, 53.452114f, 120.705864f, 58.21134f, 117.64f, 63.23f),
                    PathNode.Close,
                    PathNode.MoveTo(44.87f, 116.0f),
                    PathNode.LineTo(76.44f, 116.0f),
                    PathNode.CurveTo(78.02645f, 92.46758f, 85.35701f, 69.68276f, 97.79f, 49.64f),
                    PathNode.CurveTo(69.47835f, 60.604424f, 49.259403f, 85.95834f, 44.87f, 116.0f),
                    PathNode.Close,
                    PathNode.MoveTo(76.44f, 140.0f),
                    PathNode.LineTo(44.87f, 140.0f),
                    PathNode.CurveTo(49.259403f, 170.04166f, 69.47835f, 195.39557f, 97.79f, 206.36f),
                    PathNode.CurveTo(85.35701f, 186.31725f, 78.02645f, 163.53241f, 76.44f, 140.0f),
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
        return _globeSimpleX!!
    }

private var _globeSimpleX: ImageVector? = null
