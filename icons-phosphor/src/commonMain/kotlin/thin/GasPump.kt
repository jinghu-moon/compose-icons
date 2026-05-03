package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.GasPump: ImageVector
    get() {
        if (_gasPump != null) return _gasPump!!
        _gasPump = phosphorThinIcon(
            name = "GasPump",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(238.14f, 72.49f),
                    PathNode.LineTo(218.83f, 53.17f),
                    PathNode.CurveTo(217.26703f, 51.607033f, 214.73297f, 51.607033f, 213.17f, 53.17f),
                    PathNode.CurveTo(211.60704f, 54.732967f, 211.60704f, 57.267033f, 213.17f, 58.83f),
                    PathNode.LineTo(232.49f, 78.14f),
                    PathNode.CurveTo(234.73987f, 80.392365f, 236.0025f, 83.44644f, 236.0f, 86.63f),
                    PathNode.LineTo(236.0f, 168.0f),
                    PathNode.CurveTo(236.0f, 174.62741f, 230.62741f, 180.0f, 224.0f, 180.0f),
                    PathNode.CurveTo(217.37259f, 180.0f, 212.0f, 174.62741f, 212.0f, 168.0f),
                    PathNode.LineTo(212.0f, 128.0f),
                    PathNode.CurveTo(212.0f, 116.95431f, 203.0457f, 108.0f, 192.0f, 108.0f),
                    PathNode.LineTo(172.0f, 108.0f),
                    PathNode.LineTo(172.0f, 56.0f),
                    PathNode.CurveTo(172.0f, 44.954304f, 163.0457f, 36.0f, 152.0f, 36.0f),
                    PathNode.LineTo(72.0f, 36.0f),
                    PathNode.CurveTo(60.954304f, 36.0f, 52.0f, 44.954304f, 52.0f, 56.0f),
                    PathNode.LineTo(52.0f, 212.0f),
                    PathNode.LineTo(32.0f, 212.0f),
                    PathNode.CurveTo(29.790861f, 212.0f, 28.0f, 213.79086f, 28.0f, 216.0f),
                    PathNode.CurveTo(28.0f, 218.20914f, 29.790861f, 220.0f, 32.0f, 220.0f),
                    PathNode.LineTo(192.0f, 220.0f),
                    PathNode.CurveTo(194.20914f, 220.0f, 196.0f, 218.20914f, 196.0f, 216.0f),
                    PathNode.CurveTo(196.0f, 213.79086f, 194.20914f, 212.0f, 192.0f, 212.0f),
                    PathNode.LineTo(172.0f, 212.0f),
                    PathNode.LineTo(172.0f, 116.0f),
                    PathNode.LineTo(192.0f, 116.0f),
                    PathNode.CurveTo(198.62741f, 116.0f, 204.0f, 121.37258f, 204.0f, 128.0f),
                    PathNode.LineTo(204.0f, 168.0f),
                    PathNode.CurveTo(204.0f, 179.0457f, 212.9543f, 188.0f, 224.0f, 188.0f),
                    PathNode.CurveTo(235.0457f, 188.0f, 244.0f, 179.0457f, 244.0f, 168.0f),
                    PathNode.LineTo(244.0f, 86.63f),
                    PathNode.CurveTo(244.01549f, 81.32281f, 241.90506f, 76.23043f, 238.14f, 72.49f),
                    PathNode.Close,
                    PathNode.MoveTo(60.0f, 212.0f),
                    PathNode.LineTo(60.0f, 56.0f),
                    PathNode.CurveTo(60.0f, 49.37258f, 65.37258f, 44.0f, 72.0f, 44.0f),
                    PathNode.LineTo(152.0f, 44.0f),
                    PathNode.CurveTo(158.62741f, 44.0f, 164.0f, 49.37258f, 164.0f, 56.0f),
                    PathNode.LineTo(164.0f, 212.0f),
                    PathNode.Close,
                    PathNode.MoveTo(140.0f, 112.0f),
                    PathNode.CurveTo(140.0f, 114.20914f, 138.20914f, 116.0f, 136.0f, 116.0f),
                    PathNode.LineTo(88.0f, 116.0f),
                    PathNode.CurveTo(85.79086f, 116.0f, 84.0f, 114.20914f, 84.0f, 112.0f),
                    PathNode.CurveTo(84.0f, 109.79086f, 85.79086f, 108.0f, 88.0f, 108.0f),
                    PathNode.LineTo(136.0f, 108.0f),
                    PathNode.CurveTo(138.20914f, 108.0f, 140.0f, 109.79086f, 140.0f, 112.0f),
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
        return _gasPump!!
    }

private var _gasPump: ImageVector? = null
