package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.ArrowBendDoubleUpLeft: ImageVector
    get() {
        if (_arrowBendDoubleUpLeft != null) return _arrowBendDoubleUpLeft!!
        _arrowBendDoubleUpLeft = phosphorBoldIcon(
            name = "ArrowBendDoubleUpLeft",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(88.49f, 143.51f),
                    PathNode.CurveTo(93.18442f, 148.20442f, 93.18442f, 155.81558f, 88.49f, 160.51f),
                    PathNode.CurveTo(83.79558f, 165.20442f, 76.18442f, 165.20442f, 71.49f, 160.51f),
                    PathNode.LineTo(23.49f, 112.51f),
                    PathNode.CurveTo(21.230547f, 110.25838f, 19.960535f, 107.19982f, 19.960535f, 104.01f),
                    PathNode.CurveTo(19.960535f, 100.82018f, 21.230547f, 97.76162f, 23.49f, 95.51f),
                    PathNode.LineTo(71.49f, 47.51f),
                    PathNode.CurveTo(76.18442f, 42.81558f, 83.79558f, 42.81558f, 88.49f, 47.51f),
                    PathNode.CurveTo(93.18442f, 52.20442f, 93.18442f, 59.81558f, 88.49f, 64.51f),
                    PathNode.LineTo(49.0f, 104.0f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 92.0f),
                    PathNode.LineTo(117.0f, 92.0f),
                    PathNode.LineTo(144.52f, 64.48f),
                    PathNode.CurveTo(149.21442f, 59.78558f, 149.21442f, 52.17442f, 144.52f, 47.48f),
                    PathNode.CurveTo(139.82558f, 42.78558f, 132.21442f, 42.78558f, 127.52f, 47.48f),
                    PathNode.LineTo(79.52f, 95.48f),
                    PathNode.CurveTo(77.260544f, 97.73162f, 75.99054f, 100.790184f, 75.99054f, 103.98f),
                    PathNode.CurveTo(75.99054f, 107.169815f, 77.260544f, 110.22838f, 79.52f, 112.48f),
                    PathNode.LineTo(127.52f, 160.48f),
                    PathNode.CurveTo(132.21442f, 165.17442f, 139.82558f, 165.17442f, 144.52f, 160.48f),
                    PathNode.CurveTo(149.21442f, 155.78558f, 149.21442f, 148.17442f, 144.52f, 143.48f),
                    PathNode.LineTo(117.0f, 116.0f),
                    PathNode.LineTo(128.0f, 116.0f),
                    PathNode.CurveTo(174.37135f, 116.04961f, 211.9504f, 153.62865f, 212.0f, 200.0f),
                    PathNode.CurveTo(212.0f, 206.62741f, 217.37259f, 212.0f, 224.0f, 212.0f),
                    PathNode.CurveTo(230.62741f, 212.0f, 236.0f, 206.62741f, 236.0f, 200.0f),
                    PathNode.CurveTo(235.93387f, 140.38066f, 187.61934f, 92.06613f, 128.0f, 92.0f),
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
        return _arrowBendDoubleUpLeft!!
    }

private var _arrowBendDoubleUpLeft: ImageVector? = null
