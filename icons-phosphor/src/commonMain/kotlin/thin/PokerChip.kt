package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.PokerChip: ImageVector
    get() {
        if (_pokerChip != null) return _pokerChip!!
        _pokerChip = phosphorThinIcon(
            name = "PokerChip",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(128.0f, 28.0f),
                    PathNode.CurveTo(72.77152f, 28.0f, 28.0f, 72.77152f, 28.0f, 128.0f),
                    PathNode.CurveTo(28.0f, 183.22847f, 72.77152f, 228.0f, 128.0f, 228.0f),
                    PathNode.CurveTo(183.22847f, 228.0f, 228.0f, 183.22847f, 228.0f, 128.0f),
                    PathNode.CurveTo(227.93938f, 72.79665f, 183.20334f, 28.060623f, 128.0f, 28.0f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 180.0f),
                    PathNode.CurveTo(99.2812f, 180.0f, 76.0f, 156.71881f, 76.0f, 128.0f),
                    PathNode.CurveTo(76.0f, 99.2812f, 99.2812f, 76.0f, 128.0f, 76.0f),
                    PathNode.CurveTo(156.71881f, 76.0f, 180.0f, 99.2812f, 180.0f, 128.0f),
                    PathNode.CurveTo(179.96693f, 156.7051f, 156.7051f, 179.96693f, 128.0f, 180.0f),
                    PathNode.Close,
                    PathNode.MoveTo(167.47f, 82.87f),
                    PathNode.CurveTo(157.59059f, 74.190674f, 145.12186f, 69.016174f, 132.0f, 68.15f),
                    PathNode.LineTo(132.0f, 36.09f),
                    PathNode.CurveTo(153.61647f, 37.01563f, 174.20828f, 45.55983f, 190.13f, 60.21f),
                    PathNode.Close,
                    PathNode.MoveTo(124.0f, 68.15f),
                    PathNode.CurveTo(110.878136f, 69.016174f, 98.40942f, 74.190674f, 88.53f, 82.87f),
                    PathNode.LineTo(65.87f, 60.21f),
                    PathNode.CurveTo(81.79172f, 45.55983f, 102.38353f, 37.01563f, 124.0f, 36.09f),
                    PathNode.Close,
                    PathNode.MoveTo(82.87f, 88.53f),
                    PathNode.CurveTo(74.190674f, 98.40942f, 69.016174f, 110.878136f, 68.15f, 124.0f),
                    PathNode.LineTo(36.09f, 124.0f),
                    PathNode.CurveTo(37.01563f, 102.38353f, 45.55983f, 81.79172f, 60.21f, 65.87f),
                    PathNode.Close,
                    PathNode.MoveTo(68.15f, 132.0f),
                    PathNode.CurveTo(69.016174f, 145.12186f, 74.190674f, 157.59059f, 82.87f, 167.47f),
                    PathNode.LineTo(60.21f, 190.13f),
                    PathNode.CurveTo(45.55983f, 174.20828f, 37.01563f, 153.61647f, 36.09f, 132.0f),
                    PathNode.Close,
                    PathNode.MoveTo(88.53f, 173.13f),
                    PathNode.CurveTo(98.40942f, 181.80933f, 110.878136f, 186.98383f, 124.0f, 187.85f),
                    PathNode.LineTo(124.0f, 219.91f),
                    PathNode.CurveTo(102.38353f, 218.98438f, 81.79172f, 210.44017f, 65.87f, 195.79f),
                    PathNode.Close,
                    PathNode.MoveTo(132.0f, 187.85f),
                    PathNode.CurveTo(145.12186f, 186.98383f, 157.59059f, 181.80933f, 167.47f, 173.13f),
                    PathNode.LineTo(190.13f, 195.79f),
                    PathNode.CurveTo(174.20828f, 210.44017f, 153.61647f, 218.98438f, 132.0f, 219.91f),
                    PathNode.Close,
                    PathNode.MoveTo(173.13f, 167.47f),
                    PathNode.CurveTo(181.80933f, 157.59059f, 186.98383f, 145.12186f, 187.85f, 132.0f),
                    PathNode.LineTo(219.91f, 132.0f),
                    PathNode.CurveTo(218.98438f, 153.61647f, 210.44017f, 174.20828f, 195.79f, 190.13f),
                    PathNode.Close,
                    PathNode.MoveTo(187.85f, 124.0f),
                    PathNode.CurveTo(186.98383f, 110.878136f, 181.80933f, 98.40942f, 173.13f, 88.53f),
                    PathNode.LineTo(195.79f, 65.87f),
                    PathNode.CurveTo(210.44017f, 81.79172f, 218.98438f, 102.38353f, 219.91f, 124.0f),
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
        return _pokerChip!!
    }

private var _pokerChip: ImageVector? = null
