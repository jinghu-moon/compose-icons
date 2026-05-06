package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.CurrencyNgn: ImageVector
    get() {
        if (_currencyNgn != null) return _currencyNgn!!
        _currencyNgn = phosphorLightIcon(
            name = "CurrencyNgn",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M216 138h-18v-20h18c3.314 0 6-2.686 6-6 0-3.314-2.686-6-6-6h-18v-60c0-3.314-2.686-6-6-6-3.314 0-6 2.686-6 6v60h-67.56L68.73 42.31C67.154 40.291 64.471 39.495 62.049 40.328 59.627 41.161 58.001 43.439 58 46v60h-18c-3.314 0-6 2.686-6 6 0 3.314 2.686 6 6 6h18v20h-18c-3.314 0-6 2.686-6 6 0 3.314 2.686 6 6 6h18v60c0 3.314 2.686 6 6 6 3.314 0 6-2.686 6-6v-60h67.56l49.71 63.69c1.576 2.019 4.259 2.815 6.681 1.982 2.422-.833 4.048-3.111 4.049-5.672v-60h18c3.314 0 6-2.686 6-6 0-3.314-2.686-6-6-6ZM186 118v20h-42.58L127.81 118ZM70 63.44 103.22 106h-33.22ZM70 138v-20h42.58l15.61 20ZM186 192.56 152.78 150h33.22Z"),
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
        return _currencyNgn!!
    }

private var _currencyNgn: ImageVector? = null
