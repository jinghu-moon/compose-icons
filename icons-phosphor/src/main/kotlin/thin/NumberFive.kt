package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.NumberFive: ImageVector
    get() {
        if (_numberFive != null) return _numberFive!!
        _numberFive = phosphorThinIcon(
            name = "NumberFive",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(172.0f, 160.0f),
                    PathNode.CurveTo(172.00177f, 180.50789f, 159.94997f, 199.10146f, 141.22891f, 207.47375f),
                    PathNode.CurveTo(122.50786f, 215.84607f, 100.6145f, 212.43324f, 85.33f, 198.76f),
                    PathNode.CurveTo(83.67315f, 197.2854f, 83.5254f, 194.74686f, 85.0f, 193.09f),
                    PathNode.CurveTo(86.4746f, 191.43315f, 89.013145f, 191.2854f, 90.67f, 192.76f),
                    PathNode.CurveTo(108.2026f, 208.43816f, 134.96509f, 207.55559f, 151.42665f, 190.75638f),
                    PathNode.CurveTo(167.88821f, 173.95717f, 168.2273f, 147.18227f, 152.19643f, 129.97157f),
                    PathNode.CurveTo(136.16556f, 112.76087f, 109.434006f, 111.20086f, 91.51f, 126.43f),
                    PathNode.CurveTo(90.21769f, 127.51885f, 88.38052f, 127.67812f, 86.92011f, 126.8279f),
                    PathNode.CurveTo(85.4597f, 125.97768f, 84.691154f, 124.301414f, 85.0f, 122.64f),
                    PathNode.LineTo(100.09f, 47.22f),
                    PathNode.CurveTo(100.46117f, 45.35306f, 102.096535f, 44.00629f, 104.0f, 44.0f),
                    PathNode.LineTo(168.0f, 44.0f),
                    PathNode.CurveTo(170.20914f, 44.0f, 172.0f, 45.79086f, 172.0f, 48.0f),
                    PathNode.CurveTo(172.0f, 50.20914f, 170.20914f, 52.0f, 168.0f, 52.0f),
                    PathNode.LineTo(107.28f, 52.0f),
                    PathNode.LineTo(94.77f, 114.53f),
                    PathNode.CurveTo(110.87657f, 105.592766f, 130.50937f, 105.8434f, 146.38254f, 115.1889f),
                    PathNode.CurveTo(162.2557f, 124.53441f, 172.00029f, 141.58002f, 172.0f, 160.0f),
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
        return _numberFive!!
    }

private var _numberFive: ImageVector? = null
