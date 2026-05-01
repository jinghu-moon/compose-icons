package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.TelegramLogo: ImageVector
    get() {
        if (_telegramLogo != null) return _telegramLogo!!
        _telegramLogo = phosphorLightIcon(
            name = "TelegramLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(227.57f, 27.7f),
                    PathNode.CurveTo(225.6039f, 26.0017f, 222.85892f, 25.532013f, 220.44f, 26.48f),
                    PathNode.LineTo(17.78f, 105.79f),
                    PathNode.CurveTo(12.71662f, 107.77124f, 9.56923f, 112.85738f, 10.055436f, 118.2728f),
                    PathNode.CurveTo(10.541643f, 123.68821f, 14.544683f, 128.13237f, 19.88f, 129.18f),
                    PathNode.LineTo(74.0f, 139.81f),
                    PathNode.LineTo(74.0f, 200.0f),
                    PathNode.CurveTo(74.0023f, 205.70837f, 77.47014f, 210.84367f, 82.76429f, 212.97849f),
                    PathNode.CurveTo(88.05845f, 215.1133f, 94.11854f, 213.82002f, 98.08f, 209.71f),
                    PathNode.LineTo(124.72f, 182.08f),
                    PathNode.LineTo(166.3f, 218.53f),
                    PathNode.CurveTo(168.83856f, 220.77617f, 172.11038f, 222.01732f, 175.5f, 222.02f),
                    PathNode.CurveTo(176.98026f, 222.01657f, 178.45103f, 221.78381f, 179.86f, 221.33f),
                    PathNode.CurveTo(184.56058f, 219.84251f, 188.11713f, 215.96994f, 189.2f, 211.16f),
                    PathNode.LineTo(229.82f, 34.57f),
                    PathNode.CurveTo(230.402f, 32.039944f, 229.53593f, 29.395584f, 227.57f, 27.7f),
                    PathNode.Close,
                    PathNode.MoveTo(22.05f, 117.37f),
                    PathNode.LineTo(22.05f, 117.37f),
                    PathNode.CurveTo(22.011703f, 117.26677f, 22.011703f, 117.15323f, 22.05f, 117.05f),
                    PathNode.CurveTo(22.095173f, 117.01513f, 22.145876f, 116.98809f, 22.2f, 116.97f),
                    PathNode.LineTo(181.91f, 54.45f),
                    PathNode.LineTo(78.61f, 128.45f),
                    PathNode.LineTo(22.2f, 117.41f),
                    PathNode.Close,
                    PathNode.MoveTo(89.44f, 201.37f),
                    PathNode.CurveTo(88.87625f, 201.95496f, 88.01468f, 202.14078f, 87.25993f, 201.84021f),
                    PathNode.CurveTo(86.50518f, 201.53963f, 86.007256f, 200.81236f, 86.0f, 200.0f),
                    PathNode.LineTo(86.0f, 148.11f),
                    PathNode.LineTo(115.69f, 174.11f),
                    PathNode.Close,
                    PathNode.MoveTo(177.51f, 208.45f),
                    PathNode.CurveTo(177.3598f, 209.13869f, 176.84612f, 209.6907f, 176.17f, 209.89f),
                    PathNode.CurveTo(175.48033f, 210.13216f, 174.71349f, 209.97879f, 174.17f, 209.49f),
                    PathNode.LineTo(89.64f, 135.34f),
                    PathNode.LineTo(215.0f, 45.5f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 12.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _telegramLogo!!
    }

private var _telegramLogo: ImageVector? = null
