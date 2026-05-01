package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.CurrencyCircleDollar: ImageVector
    get() {
        if (_currencyCircleDollar != null) return _currencyCircleDollar!!
        _currencyCircleDollar = phosphorThinIcon(
            name = "CurrencyCircleDollar",
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
                    PathNode.MoveTo(128.0f, 220.0f),
                    PathNode.CurveTo(77.18981f, 220.0f, 36.0f, 178.8102f, 36.0f, 128.0f),
                    PathNode.CurveTo(36.0f, 77.18981f, 77.18981f, 36.0f, 128.0f, 36.0f),
                    PathNode.CurveTo(178.8102f, 36.0f, 220.0f, 77.18981f, 220.0f, 128.0f),
                    PathNode.CurveTo(219.94489f, 178.78735f, 178.78735f, 219.94489f, 128.0f, 220.0f),
                    PathNode.Close,
                    PathNode.MoveTo(164.0f, 148.0f),
                    PathNode.CurveTo(164.0f, 161.25484f, 153.25484f, 172.0f, 140.0f, 172.0f),
                    PathNode.LineTo(132.0f, 172.0f),
                    PathNode.LineTo(132.0f, 184.0f),
                    PathNode.CurveTo(132.0f, 186.20914f, 130.20914f, 188.0f, 128.0f, 188.0f),
                    PathNode.CurveTo(125.79086f, 188.0f, 124.0f, 186.20914f, 124.0f, 184.0f),
                    PathNode.LineTo(124.0f, 172.0f),
                    PathNode.LineTo(104.0f, 172.0f),
                    PathNode.CurveTo(101.79086f, 172.0f, 100.0f, 170.20914f, 100.0f, 168.0f),
                    PathNode.CurveTo(100.0f, 165.79086f, 101.79086f, 164.0f, 104.0f, 164.0f),
                    PathNode.LineTo(140.0f, 164.0f),
                    PathNode.CurveTo(148.83656f, 164.0f, 156.0f, 156.83656f, 156.0f, 148.0f),
                    PathNode.CurveTo(156.0f, 139.16344f, 148.83656f, 132.0f, 140.0f, 132.0f),
                    PathNode.LineTo(116.0f, 132.0f),
                    PathNode.CurveTo(102.74516f, 132.0f, 92.0f, 121.25484f, 92.0f, 108.0f),
                    PathNode.CurveTo(92.0f, 94.74516f, 102.74516f, 84.0f, 116.0f, 84.0f),
                    PathNode.LineTo(124.0f, 84.0f),
                    PathNode.LineTo(124.0f, 72.0f),
                    PathNode.CurveTo(124.0f, 69.79086f, 125.79086f, 68.0f, 128.0f, 68.0f),
                    PathNode.CurveTo(130.20914f, 68.0f, 132.0f, 69.79086f, 132.0f, 72.0f),
                    PathNode.LineTo(132.0f, 84.0f),
                    PathNode.LineTo(152.0f, 84.0f),
                    PathNode.CurveTo(154.20914f, 84.0f, 156.0f, 85.79086f, 156.0f, 88.0f),
                    PathNode.CurveTo(156.0f, 90.20914f, 154.20914f, 92.0f, 152.0f, 92.0f),
                    PathNode.LineTo(116.0f, 92.0f),
                    PathNode.CurveTo(107.163445f, 92.0f, 100.0f, 99.163445f, 100.0f, 108.0f),
                    PathNode.CurveTo(100.0f, 116.836555f, 107.163445f, 124.0f, 116.0f, 124.0f),
                    PathNode.LineTo(140.0f, 124.0f),
                    PathNode.CurveTo(153.25484f, 124.0f, 164.0f, 134.74516f, 164.0f, 148.0f),
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
        return _currencyCircleDollar!!
    }

private var _currencyCircleDollar: ImageVector? = null
