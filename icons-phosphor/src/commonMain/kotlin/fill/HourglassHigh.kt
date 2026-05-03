package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.HourglassHigh: ImageVector
    get() {
        if (_hourglassHigh != null) return _hourglassHigh!!
        _hourglassHigh = phosphorFillIcon(
            name = "HourglassHigh",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(200.0f, 75.64f),
                    PathNode.LineTo(200.0f, 40.0f),
                    PathNode.CurveTo(200.0f, 31.163445f, 192.83656f, 24.0f, 184.0f, 24.0f),
                    PathNode.LineTo(72.0f, 24.0f),
                    PathNode.CurveTo(63.163445f, 24.0f, 56.0f, 31.163445f, 56.0f, 40.0f),
                    PathNode.LineTo(56.0f, 76.0f),
                    PathNode.CurveTo(56.010956f, 81.03352f, 58.379753f, 85.77112f, 62.4f, 88.8f),
                    PathNode.LineTo(114.67f, 128.0f),
                    PathNode.LineTo(62.4f, 167.2f),
                    PathNode.CurveTo(58.379753f, 170.22888f, 56.010956f, 174.96648f, 56.0f, 180.0f),
                    PathNode.LineTo(56.0f, 216.0f),
                    PathNode.CurveTo(56.0f, 224.83656f, 63.163445f, 232.0f, 72.0f, 232.0f),
                    PathNode.LineTo(184.0f, 232.0f),
                    PathNode.CurveTo(192.83656f, 232.0f, 200.0f, 224.83656f, 200.0f, 216.0f),
                    PathNode.LineTo(200.0f, 180.36f),
                    PathNode.CurveTo(199.98845f, 175.3465f, 197.64058f, 170.6249f, 193.65f, 167.59f),
                    PathNode.LineTo(141.27f, 128.0f),
                    PathNode.LineTo(193.65f, 88.41f),
                    PathNode.CurveTo(197.64058f, 85.37511f, 199.98845f, 80.6535f, 200.0f, 75.64f),
                    PathNode.Close,
                    PathNode.MoveTo(184.0f, 40.0f),
                    PathNode.LineTo(184.0f, 64.0f),
                    PathNode.LineTo(72.0f, 64.0f),
                    PathNode.LineTo(72.0f, 40.0f),
                    PathNode.Close,
                    PathNode.MoveTo(184.0f, 216.0f),
                    PathNode.LineTo(72.0f, 216.0f),
                    PathNode.LineTo(72.0f, 180.0f),
                    PathNode.LineTo(128.0f, 138.0f),
                    PathNode.LineTo(184.0f, 180.35f),
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
        return _hourglassHigh!!
    }

private var _hourglassHigh: ImageVector? = null
