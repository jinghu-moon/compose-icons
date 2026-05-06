package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.CurrencyEur: ImageVector
    get() {
        if (_currencyEur != null) return _currencyEur!!
        _currencyEur = phosphorThinIcon(
            name = "CurrencyEur",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M187 195c.708 .79 1.074 1.83 1.016 2.889-.058 1.06-.535 2.053-1.326 2.761-21.799 19.51-52.861 24.776-79.872 13.541C79.807 202.956 61.642 177.214 60.11 148h-20.11c-2.209 0-4-1.791-4-4 0-2.209 1.791-4 4-4h20v-24h-20c-2.209 0-4-1.791-4-4 0-2.209 1.791-4 4-4h20.11C61.649 78.794 79.81 53.062 106.813 41.828c27.003-11.234 58.057-5.975 79.857 13.522 1.657 1.475 1.805 4.013 .33 5.67-1.475 1.657-4.013 1.805-5.67 .33C161.886 43.968 134.214 39.238 110.1 49.175 85.987 59.112 69.682 81.966 68.13 108h67.87c2.209 0 4 1.791 4 4 0 2.209-1.791 4-4 4h-68v24h52c2.209 0 4 1.791 4 4 0 2.209-1.791 4-4 4h-51.87c1.537 26.042 17.837 48.908 41.954 58.855 24.116 9.947 51.797 5.22 71.246-12.165 .791-.715 1.835-1.084 2.9-1.026 1.065 .058 2.062 .539 2.77 1.336Z"),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color(0xFF000000)),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
            )
        }
        return _currencyEur!!
    }

private var _currencyEur: ImageVector? = null
