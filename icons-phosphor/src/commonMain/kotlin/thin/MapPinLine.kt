package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.MapPinLine: ImageVector
    get() {
        if (_mapPinLine != null) return _mapPinLine!!
        _mapPinLine = phosphorThinIcon(
            name = "MapPinLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(200.0f, 228.0f),
                    PathNode.LineTo(139.72f, 228.0f),
                    PathNode.CurveTo(150.9676f, 218.75438f, 161.43004f, 208.59297f, 171.0f, 197.62f),
                    PathNode.CurveTo(197.81f, 166.79f, 212.0f, 134.42f, 212.0f, 104.0f),
                    PathNode.CurveTo(212.0f, 57.60808f, 174.39192f, 20.0f, 128.0f, 20.0f),
                    PathNode.CurveTo(81.60808f, 20.0f, 44.0f, 57.60808f, 44.0f, 104.0f),
                    PathNode.CurveTo(44.0f, 134.42f, 58.17f, 166.79f, 85.0f, 197.62f),
                    PathNode.CurveTo(94.569954f, 208.59297f, 105.032394f, 218.75438f, 116.28f, 228.0f),
                    PathNode.LineTo(56.0f, 228.0f),
                    PathNode.CurveTo(53.79086f, 228.0f, 52.0f, 229.79086f, 52.0f, 232.0f),
                    PathNode.CurveTo(52.0f, 234.20914f, 53.79086f, 236.0f, 56.0f, 236.0f),
                    PathNode.LineTo(200.0f, 236.0f),
                    PathNode.CurveTo(202.20914f, 236.0f, 204.0f, 234.20914f, 204.0f, 232.0f),
                    PathNode.CurveTo(204.0f, 229.79086f, 202.20914f, 228.0f, 200.0f, 228.0f),
                    PathNode.Close,
                    PathNode.MoveTo(90.9f, 192.23f),
                    PathNode.CurveTo(73.15f, 171.8f, 52.0f, 139.9f, 52.0f, 104.0f),
                    PathNode.CurveTo(52.0f, 62.02636f, 86.02636f, 28.0f, 128.0f, 28.0f),
                    PathNode.CurveTo(169.97365f, 28.0f, 204.0f, 62.02636f, 204.0f, 104.0f),
                    PathNode.CurveTo(204.0f, 139.9f, 182.85f, 171.8f, 165.1f, 192.23f),
                    PathNode.CurveTo(153.92444f, 205.02884f, 141.49582f, 216.67691f, 128.0f, 227.0f),
                    PathNode.CurveTo(114.50417f, 216.67691f, 102.075554f, 205.02884f, 90.9f, 192.23f),
                    PathNode.Close,
                    PathNode.MoveTo(164.0f, 104.0f),
                    PathNode.CurveTo(164.0f, 84.11775f, 147.88223f, 68.0f, 128.0f, 68.0f),
                    PathNode.CurveTo(108.11775f, 68.0f, 92.0f, 84.11775f, 92.0f, 104.0f),
                    PathNode.CurveTo(92.0f, 123.88225f, 108.11775f, 140.0f, 128.0f, 140.0f),
                    PathNode.CurveTo(147.88223f, 140.0f, 164.0f, 123.88225f, 164.0f, 104.0f),
                    PathNode.Close,
                    PathNode.MoveTo(100.0f, 104.0f),
                    PathNode.CurveTo(100.0f, 88.536026f, 112.536026f, 76.0f, 128.0f, 76.0f),
                    PathNode.CurveTo(143.46397f, 76.0f, 156.0f, 88.536026f, 156.0f, 104.0f),
                    PathNode.CurveTo(156.0f, 119.463974f, 143.46397f, 132.0f, 128.0f, 132.0f),
                    PathNode.CurveTo(112.536026f, 132.0f, 100.0f, 119.463974f, 100.0f, 104.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 8.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _mapPinLine!!
    }

private var _mapPinLine: ImageVector? = null
