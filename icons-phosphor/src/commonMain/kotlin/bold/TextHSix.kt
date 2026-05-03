package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.TextHSix: ImageVector
    get() {
        if (_textHSix != null) return _textHSix!!
        _textHSix = phosphorBoldIcon(
            name = "TextHSix",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(217.06f, 140.33f),
                    PathNode.LineTo(230.3f, 118.15f),
                    PathNode.CurveTo(232.62556f, 114.46469f, 232.77048f, 109.80829f, 230.67857f, 105.9855f),
                    PathNode.CurveTo(228.58669f, 102.162704f, 224.58678f, 99.77442f, 220.22916f, 99.74628f),
                    PathNode.CurveTo(215.87152f, 99.71814f, 211.84111f, 102.05455f, 209.7f, 105.85f),
                    PathNode.LineTo(177.45f, 159.85f),
                    PathNode.CurveTo(177.36f, 160.0f, 177.28f, 160.16f, 177.2f, 160.32f),
                    PathNode.CurveTo(168.53902f, 175.644f, 170.91344f, 194.82886f, 183.04901f, 207.57898f),
                    PathNode.CurveTo(195.18459f, 220.32909f, 214.22885f, 223.64755f, 229.96167f, 215.75352f),
                    PathNode.CurveTo(245.69449f, 207.85948f, 254.41788f, 190.60841f, 251.4504f, 173.25815f),
                    PathNode.CurveTo(248.48291f, 155.90788f, 234.52208f, 142.53659f, 217.06f, 140.32f),
                    PathNode.Close,
                    PathNode.MoveTo(212.0f, 196.0f),
                    PathNode.CurveTo(203.16344f, 196.0f, 196.0f, 188.83656f, 196.0f, 180.0f),
                    PathNode.CurveTo(196.0f, 171.16344f, 203.16344f, 164.0f, 212.0f, 164.0f),
                    PathNode.CurveTo(220.83656f, 164.0f, 228.0f, 171.16344f, 228.0f, 180.0f),
                    PathNode.CurveTo(228.0f, 188.83656f, 220.83656f, 196.0f, 212.0f, 196.0f),
                    PathNode.Close,
                    PathNode.MoveTo(156.0f, 56.0f),
                    PathNode.LineTo(156.0f, 176.0f),
                    PathNode.CurveTo(156.0f, 182.62741f, 150.62741f, 188.0f, 144.0f, 188.0f),
                    PathNode.CurveTo(137.37259f, 188.0f, 132.0f, 182.62741f, 132.0f, 176.0f),
                    PathNode.LineTo(132.0f, 128.0f),
                    PathNode.LineTo(52.0f, 128.0f),
                    PathNode.LineTo(52.0f, 176.0f),
                    PathNode.CurveTo(52.0f, 182.62741f, 46.62742f, 188.0f, 40.0f, 188.0f),
                    PathNode.CurveTo(33.37258f, 188.0f, 28.0f, 182.62741f, 28.0f, 176.0f),
                    PathNode.LineTo(28.0f, 56.0f),
                    PathNode.CurveTo(28.0f, 49.37258f, 33.37258f, 44.0f, 40.0f, 44.0f),
                    PathNode.CurveTo(46.62742f, 44.0f, 52.0f, 49.37258f, 52.0f, 56.0f),
                    PathNode.LineTo(52.0f, 104.0f),
                    PathNode.LineTo(132.0f, 104.0f),
                    PathNode.LineTo(132.0f, 56.0f),
                    PathNode.CurveTo(132.0f, 49.37258f, 137.37259f, 44.0f, 144.0f, 44.0f),
                    PathNode.CurveTo(150.62741f, 44.0f, 156.0f, 49.37258f, 156.0f, 56.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 24.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _textHSix!!
    }

private var _textHSix: ImageVector? = null
