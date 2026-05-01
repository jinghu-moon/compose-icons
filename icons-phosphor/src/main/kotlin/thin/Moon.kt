package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Moon: ImageVector
    get() {
        if (_moon != null) return _moon!!
        _moon = phosphorThinIcon(
            name = "Moon",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(230.72f, 145.06f),
                    PathNode.CurveTo(229.6744f, 144.01222f, 228.13565f, 143.62753f, 226.72f, 144.06f),
                    PathNode.CurveTo(194.22769f, 153.88055f, 158.96748f, 145.02855f, 134.9665f, 121.0255f),
                    PathNode.CurveTo(110.965546f, 97.02244f, 102.11662f, 61.76145f, 111.94f, 29.27f),
                    PathNode.CurveTo(112.37611f, 27.85369f, 111.99344f, 26.312332f, 110.94555f, 25.264448f),
                    PathNode.CurveTo(109.89767f, 24.216564f, 108.3563f, 23.833895f, 106.94f, 24.27f),
                    PathNode.CurveTo(86.66165f, 30.49191f, 68.863434f, 42.953465f, 56.08f, 59.88f),
                    PathNode.CurveTo(26.220978f, 99.69203f, 30.180126f, 155.40149f, 65.36932f, 190.59068f),
                    PathNode.CurveTo(100.55852f, 225.77988f, 156.26797f, 229.73903f, 196.08f, 199.88f),
                    PathNode.CurveTo(213.00081f, 187.09096f, 225.4553f, 169.28934f, 231.67f, 149.01f),
                    PathNode.CurveTo(232.0953f, 147.61855f, 231.7315f, 146.10588f, 230.72f, 145.06f),
                    PathNode.Close,
                    PathNode.MoveTo(191.3f, 193.53f),
                    PathNode.CurveTo(154.67224f, 221.09479f, 103.34013f, 217.48903f, 70.92556f, 185.07445f),
                    PathNode.CurveTo(38.51098f, 152.65987f, 34.905216f, 101.32776f, 62.47f, 64.7f),
                    PathNode.CurveTo(72.73574f, 51.124733f, 86.52995f, 40.626884f, 102.35f, 34.35f),
                    PathNode.CurveTo(94.99077f, 67.713135f, 105.15772f, 102.525475f, 129.31612f, 126.68388f),
                    PathNode.CurveTo(153.47452f, 150.84229f, 188.28687f, 161.00923f, 221.65f, 153.65f),
                    PathNode.CurveTo(215.37311f, 169.47005f, 204.87526f, 183.26425f, 191.3f, 193.53f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 8.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _moon!!
    }

private var _moon: ImageVector? = null
