package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.TextHFour: ImageVector
    get() {
        if (_textHFour != null) return _textHFour!!
        _textHFour = phosphorThinIcon(
            name = "TextHFour",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(148.0f, 56.0f),
                    PathNode.LineTo(148.0f, 176.0f),
                    PathNode.CurveTo(148.0f, 178.20914f, 146.20914f, 180.0f, 144.0f, 180.0f),
                    PathNode.CurveTo(141.79086f, 180.0f, 140.0f, 178.20914f, 140.0f, 176.0f),
                    PathNode.LineTo(140.0f, 120.0f),
                    PathNode.LineTo(44.0f, 120.0f),
                    PathNode.LineTo(44.0f, 176.0f),
                    PathNode.CurveTo(44.0f, 178.20914f, 42.20914f, 180.0f, 40.0f, 180.0f),
                    PathNode.CurveTo(37.79086f, 180.0f, 36.0f, 178.20914f, 36.0f, 176.0f),
                    PathNode.LineTo(36.0f, 56.0f),
                    PathNode.CurveTo(36.0f, 53.79086f, 37.79086f, 52.0f, 40.0f, 52.0f),
                    PathNode.CurveTo(42.20914f, 52.0f, 44.0f, 53.79086f, 44.0f, 56.0f),
                    PathNode.LineTo(44.0f, 112.0f),
                    PathNode.LineTo(140.0f, 112.0f),
                    PathNode.LineTo(140.0f, 56.0f),
                    PathNode.CurveTo(140.0f, 53.79086f, 141.79086f, 52.0f, 144.0f, 52.0f),
                    PathNode.CurveTo(146.20914f, 52.0f, 148.0f, 53.79086f, 148.0f, 56.0f),
                    PathNode.Close,
                    PathNode.MoveTo(252.0f, 184.0f),
                    PathNode.CurveTo(252.0f, 186.20914f, 250.20914f, 188.0f, 248.0f, 188.0f),
                    PathNode.LineTo(236.0f, 188.0f),
                    PathNode.LineTo(236.0f, 208.0f),
                    PathNode.CurveTo(236.0f, 210.20914f, 234.20914f, 212.0f, 232.0f, 212.0f),
                    PathNode.CurveTo(229.79086f, 212.0f, 228.0f, 210.20914f, 228.0f, 208.0f),
                    PathNode.LineTo(228.0f, 188.0f),
                    PathNode.LineTo(176.0f, 188.0f),
                    PathNode.CurveTo(174.47023f, 188.00226f, 173.07315f, 187.1318f, 172.40096f, 185.75764f),
                    PathNode.CurveTo(171.72874f, 184.38347f, 171.89919f, 182.74626f, 172.84f, 181.54f),
                    PathNode.LineTo(228.84f, 109.54f),
                    PathNode.CurveTo(229.88902f, 108.18832f, 231.6816f, 107.65351f, 233.29973f, 108.209465f),
                    PathNode.CurveTo(234.91788f, 108.76543f, 236.00325f, 110.28902f, 236.0f, 112.0f),
                    PathNode.LineTo(236.0f, 180.0f),
                    PathNode.LineTo(248.0f, 180.0f),
                    PathNode.CurveTo(250.20914f, 180.0f, 252.0f, 181.79086f, 252.0f, 184.0f),
                    PathNode.Close,
                    PathNode.MoveTo(228.0f, 123.66f),
                    PathNode.LineTo(184.18f, 180.0f),
                    PathNode.LineTo(228.0f, 180.0f),
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
        return _textHFour!!
    }

private var _textHFour: ImageVector? = null
