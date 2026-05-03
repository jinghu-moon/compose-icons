package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Visor: ImageVector
    get() {
        if (_visor != null) return _visor!!
        _visor = phosphorThinIcon(
            name = "Visor",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(183.05f, 60.0f),
                    PathNode.LineTo(72.0f, 60.0f),
                    PathNode.CurveTo(53.407234f, 59.998413f, 35.6247f, 67.61001f, 22.791115f, 81.06326f),
                    PathNode.CurveTo(9.957531f, 94.51652f, 3.192312f, 112.63796f, 4.07f, 131.21f),
                    PathNode.CurveTo(5.67f, 165.87f, 34.07f, 194.29f, 68.72f, 195.92f),
                    PathNode.CurveTo(83.49f, 196.64f, 98.72f, 190.28f, 115.35f, 176.54f),
                    PathNode.CurveTo(122.706924f, 170.46169f, 133.34308f, 170.46169f, 140.7f, 176.54f),
                    PathNode.CurveTo(150.79f, 184.92f, 166.25f, 196.0f, 184.0f, 196.0f),
                    PathNode.CurveTo(202.19174f, 196.00159f, 219.62561f, 188.71391f, 232.40428f, 175.76613f),
                    PathNode.CurveTo(245.18294f, 162.81833f, 252.24077f, 145.29015f, 252.0f, 127.1f),
                    PathNode.CurveTo(251.51f, 90.1f, 220.58f, 60.0f, 183.05f, 60.0f),
                    PathNode.Close,
                    PathNode.MoveTo(226.7f, 170.15f),
                    PathNode.CurveTo(215.4542f, 181.61182f, 200.05739f, 188.0482f, 184.0f, 188.0f),
                    PathNode.CurveTo(168.83f, 188.0f, 154.93f, 178.0f, 145.8f, 170.42f),
                    PathNode.CurveTo(135.48676f, 161.88522f, 120.56324f, 161.88522f, 110.25f, 170.42f),
                    PathNode.CurveTo(95.25f, 182.83f, 81.8f, 188.56f, 69.1f, 187.97f),
                    PathNode.CurveTo(38.30737f, 186.29163f, 13.729791f, 161.67525f, 12.1f, 130.88f),
                    PathNode.CurveTo(11.312442f, 114.49149f, 17.270615f, 98.49539f, 28.587494f, 86.61551f),
                    PathNode.CurveTo(39.90437f, 74.73562f, 55.592583f, 68.00843f, 72.0f, 68.0f),
                    PathNode.LineTo(183.05f, 68.0f),
                    PathNode.CurveTo(216.23f, 68.0f, 243.57f, 94.56f, 243.99f, 127.2f),
                    PathNode.CurveTo(244.2514f, 143.26192f, 238.01689f, 158.74905f, 226.7f, 170.15f),
                    PathNode.Close,
                    PathNode.MoveTo(180.0f, 96.0f),
                    PathNode.CurveTo(180.0f, 98.20914f, 178.20914f, 100.0f, 176.0f, 100.0f),
                    PathNode.LineTo(80.0f, 100.0f),
                    PathNode.CurveTo(77.79086f, 100.0f, 76.0f, 98.20914f, 76.0f, 96.0f),
                    PathNode.CurveTo(76.0f, 93.79086f, 77.79086f, 92.0f, 80.0f, 92.0f),
                    PathNode.LineTo(176.0f, 92.0f),
                    PathNode.CurveTo(178.20914f, 92.0f, 180.0f, 93.79086f, 180.0f, 96.0f),
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
        return _visor!!
    }

private var _visor: ImageVector? = null
