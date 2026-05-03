package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.GasPump: ImageVector
    get() {
        if (_gasPump != null) return _gasPump!!
        _gasPump = phosphorLightIcon(
            name = "GasPump",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(239.56f, 71.07f),
                    PathNode.LineTo(220.24f, 51.76f),
                    PathNode.CurveTo(217.87592f, 49.55713f, 214.19193f, 49.622128f, 211.90703f, 51.907024f),
                    PathNode.CurveTo(209.62213f, 54.19192f, 209.55713f, 57.875923f, 211.76f, 60.24f),
                    PathNode.LineTo(231.07f, 79.56f),
                    PathNode.CurveTo(232.95206f, 81.430534f, 234.00719f, 83.97652f, 234.0f, 86.63f),
                    PathNode.LineTo(234.0f, 168.0f),
                    PathNode.CurveTo(234.0f, 173.52284f, 229.52284f, 178.0f, 224.0f, 178.0f),
                    PathNode.CurveTo(218.47716f, 178.0f, 214.0f, 173.52284f, 214.0f, 168.0f),
                    PathNode.LineTo(214.0f, 128.0f),
                    PathNode.CurveTo(214.0f, 115.84974f, 204.15027f, 106.0f, 192.0f, 106.0f),
                    PathNode.LineTo(174.0f, 106.0f),
                    PathNode.LineTo(174.0f, 56.0f),
                    PathNode.CurveTo(174.0f, 43.849735f, 164.15027f, 34.0f, 152.0f, 34.0f),
                    PathNode.LineTo(72.0f, 34.0f),
                    PathNode.CurveTo(59.849735f, 34.0f, 50.0f, 43.849735f, 50.0f, 56.0f),
                    PathNode.LineTo(50.0f, 210.0f),
                    PathNode.LineTo(32.0f, 210.0f),
                    PathNode.CurveTo(28.68629f, 210.0f, 26.0f, 212.6863f, 26.0f, 216.0f),
                    PathNode.CurveTo(26.0f, 219.3137f, 28.68629f, 222.0f, 32.0f, 222.0f),
                    PathNode.LineTo(192.0f, 222.0f),
                    PathNode.CurveTo(195.3137f, 222.0f, 198.0f, 219.3137f, 198.0f, 216.0f),
                    PathNode.CurveTo(198.0f, 212.6863f, 195.3137f, 210.0f, 192.0f, 210.0f),
                    PathNode.LineTo(174.0f, 210.0f),
                    PathNode.LineTo(174.0f, 118.0f),
                    PathNode.LineTo(192.0f, 118.0f),
                    PathNode.CurveTo(197.52284f, 118.0f, 202.0f, 122.47715f, 202.0f, 128.0f),
                    PathNode.LineTo(202.0f, 168.0f),
                    PathNode.CurveTo(202.0f, 180.15027f, 211.84973f, 190.0f, 224.0f, 190.0f),
                    PathNode.CurveTo(236.15027f, 190.0f, 246.0f, 180.15027f, 246.0f, 168.0f),
                    PathNode.LineTo(246.0f, 86.63f),
                    PathNode.CurveTo(246.01521f, 80.79187f, 243.69661f, 75.18977f, 239.56f, 71.07f),
                    PathNode.Close,
                    PathNode.MoveTo(62.0f, 210.0f),
                    PathNode.LineTo(62.0f, 56.0f),
                    PathNode.CurveTo(62.0f, 50.477154f, 66.47715f, 46.0f, 72.0f, 46.0f),
                    PathNode.LineTo(152.0f, 46.0f),
                    PathNode.CurveTo(157.52284f, 46.0f, 162.0f, 50.477154f, 162.0f, 56.0f),
                    PathNode.LineTo(162.0f, 210.0f),
                    PathNode.Close,
                    PathNode.MoveTo(142.0f, 112.0f),
                    PathNode.CurveTo(142.0f, 115.313705f, 139.3137f, 118.0f, 136.0f, 118.0f),
                    PathNode.LineTo(88.0f, 118.0f),
                    PathNode.CurveTo(84.686295f, 118.0f, 82.0f, 115.313705f, 82.0f, 112.0f),
                    PathNode.CurveTo(82.0f, 108.686295f, 84.686295f, 106.0f, 88.0f, 106.0f),
                    PathNode.LineTo(136.0f, 106.0f),
                    PathNode.CurveTo(139.3137f, 106.0f, 142.0f, 108.686295f, 142.0f, 112.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 12.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _gasPump!!
    }

private var _gasPump: ImageVector? = null
