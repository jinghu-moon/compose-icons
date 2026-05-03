package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.MapPinSimpleArea: ImageVector
    get() {
        if (_mapPinSimpleArea != null) return _mapPinSimpleArea!!
        _mapPinSimpleArea = phosphorThinIcon(
            name = "MapPinSimpleArea",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(124.0f, 99.77f),
                    PathNode.LineTo(124.0f, 176.0f),
                    PathNode.CurveTo(124.0f, 178.20914f, 125.79086f, 180.0f, 128.0f, 180.0f),
                    PathNode.CurveTo(130.20914f, 180.0f, 132.0f, 178.20914f, 132.0f, 176.0f),
                    PathNode.LineTo(132.0f, 99.77f),
                    PathNode.CurveTo(150.98573f, 97.64733f, 165.00722f, 81.06423f, 163.94423f, 61.98981f),
                    PathNode.CurveTo(162.88124f, 42.915382f, 147.10402f, 27.992912f, 128.0f, 27.992912f),
                    PathNode.CurveTo(108.89598f, 27.992912f, 93.11875f, 42.915382f, 92.05577f, 61.98981f),
                    PathNode.CurveTo(90.99279f, 81.06423f, 105.01427f, 97.64733f, 124.0f, 99.77f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 36.0f),
                    PathNode.CurveTo(143.46397f, 36.0f, 156.0f, 48.53603f, 156.0f, 64.0f),
                    PathNode.CurveTo(156.0f, 79.463974f, 143.46397f, 92.0f, 128.0f, 92.0f),
                    PathNode.CurveTo(112.536026f, 92.0f, 100.0f, 79.463974f, 100.0f, 64.0f),
                    PathNode.CurveTo(100.0f, 48.53603f, 112.536026f, 36.0f, 128.0f, 36.0f),
                    PathNode.Close,
                    PathNode.MoveTo(236.0f, 176.0f),
                    PathNode.CurveTo(236.0f, 188.46f, 224.27f, 199.83f, 203.0f, 208.0f),
                    PathNode.CurveTo(182.91f, 215.73f, 156.28f, 220.0f, 128.0f, 220.0f),
                    PathNode.CurveTo(99.72f, 220.0f, 73.11f, 215.75f, 53.0f, 208.0f),
                    PathNode.CurveTo(31.71f, 199.81f, 20.0f, 188.44f, 20.0f, 176.0f),
                    PathNode.CurveTo(20.0f, 157.45f, 45.81f, 141.78f, 87.37f, 135.12f),
                    PathNode.CurveTo(88.827385f, 134.78015f, 90.352585f, 135.28221f, 91.32313f, 136.4213f),
                    PathNode.CurveTo(92.29367f, 137.5604f, 92.547195f, 139.14597f, 91.98025f, 140.5309f),
                    PathNode.CurveTo(91.413284f, 141.91583f, 90.1207f, 142.86847f, 88.63f, 143.0f),
                    PathNode.CurveTo(52.93f, 148.74f, 28.0f, 162.3f, 28.0f, 176.0f),
                    PathNode.CurveTo(28.0f, 193.39f, 68.18f, 212.0f, 128.0f, 212.0f),
                    PathNode.CurveTo(187.82f, 212.0f, 228.0f, 193.39f, 228.0f, 176.0f),
                    PathNode.CurveTo(228.0f, 162.3f, 203.07f, 148.74f, 167.37f, 143.0f),
                    PathNode.CurveTo(165.90178f, 142.84038f, 164.64098f, 141.88474f, 164.09053f, 140.51428f),
                    PathNode.CurveTo(163.54008f, 139.14381f, 163.78957f, 137.58156f, 164.73947f, 136.4507f),
                    PathNode.CurveTo(165.68936f, 135.31984f, 167.18509f, 134.8044f, 168.63f, 135.11f),
                    PathNode.CurveTo(210.19f, 141.78f, 236.0f, 157.45f, 236.0f, 176.0f),
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
        return _mapPinSimpleArea!!
    }

private var _mapPinSimpleArea: ImageVector? = null
