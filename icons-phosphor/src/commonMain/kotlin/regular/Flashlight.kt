package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.Flashlight: ImageVector
    get() {
        if (_flashlight != null) return _flashlight!!
        _flashlight = phosphorRegularIcon(
            name = "Flashlight",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(184.0f, 16.0f),
                    PathNode.LineTo(72.0f, 16.0f),
                    PathNode.CurveTo(63.163445f, 16.0f, 56.0f, 23.163445f, 56.0f, 32.0f),
                    PathNode.LineTo(56.0f, 77.33f),
                    PathNode.CurveTo(56.008583f, 80.79053f, 57.13055f, 84.15643f, 59.2f, 86.93f),
                    PathNode.LineTo(80.0f, 114.67f),
                    PathNode.LineTo(80.0f, 224.0f),
                    PathNode.CurveTo(80.0f, 232.83656f, 87.163445f, 240.0f, 96.0f, 240.0f),
                    PathNode.LineTo(160.0f, 240.0f),
                    PathNode.CurveTo(168.83656f, 240.0f, 176.0f, 232.83656f, 176.0f, 224.0f),
                    PathNode.LineTo(176.0f, 114.67f),
                    PathNode.LineTo(196.8f, 86.93f),
                    PathNode.CurveTo(198.86945f, 84.15643f, 199.99141f, 80.79053f, 200.0f, 77.33f),
                    PathNode.LineTo(200.0f, 32.0f),
                    PathNode.CurveTo(200.0f, 23.163445f, 192.83656f, 16.0f, 184.0f, 16.0f),
                    PathNode.Close,
                    PathNode.MoveTo(72.0f, 32.0f),
                    PathNode.LineTo(184.0f, 32.0f),
                    PathNode.LineTo(184.0f, 56.0f),
                    PathNode.LineTo(72.0f, 56.0f),
                    PathNode.LineTo(72.0f, 32.0f),
                    PathNode.Close,
                    PathNode.MoveTo(163.2f, 105.07f),
                    PathNode.CurveTo(161.13055f, 107.84357f, 160.00859f, 111.20947f, 160.0f, 114.67f),
                    PathNode.LineTo(160.0f, 224.0f),
                    PathNode.LineTo(96.0f, 224.0f),
                    PathNode.LineTo(96.0f, 114.67f),
                    PathNode.CurveTo(95.99142f, 111.20947f, 94.869446f, 107.84357f, 92.8f, 105.07f),
                    PathNode.LineTo(72.0f, 77.33f),
                    PathNode.LineTo(72.0f, 72.0f),
                    PathNode.LineTo(184.0f, 72.0f),
                    PathNode.LineTo(184.0f, 77.33f),
                    PathNode.Close,
                    PathNode.MoveTo(136.0f, 120.0f),
                    PathNode.LineTo(136.0f, 152.0f),
                    PathNode.CurveTo(136.0f, 156.41827f, 132.41827f, 160.0f, 128.0f, 160.0f),
                    PathNode.CurveTo(123.58172f, 160.0f, 120.0f, 156.41827f, 120.0f, 152.0f),
                    PathNode.LineTo(120.0f, 120.0f),
                    PathNode.CurveTo(120.0f, 115.58172f, 123.58172f, 112.0f, 128.0f, 112.0f),
                    PathNode.CurveTo(132.41827f, 112.0f, 136.0f, 115.58172f, 136.0f, 120.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 16.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _flashlight!!
    }

private var _flashlight: ImageVector? = null
