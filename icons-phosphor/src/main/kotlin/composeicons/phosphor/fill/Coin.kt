package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Coin: ImageVector
    get() {
        if (_coin != null) return _coin!!
        _coin = phosphorFillIcon(
            name = "Coin",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M207.58 63.84C186.85 53.48 159.33 48 128 48 96.67 48 69.15 53.48 48.42 63.84 27.69 74.2 16 88.78 16 104v48c0 15.22 11.82 29.85 32.42 40.16C69.02 202.47 96.67 208 128 208c31.33 0 58.85-5.48 79.58-15.84C228.31 181.8 240 167.22 240 152v-48C240 88.78 228.18 74.15 207.58 63.84ZM120 159.84v32c-19-.62-35-3.42-48-7.49v-31.3c15.671 4.175 31.786 6.461 48 6.81ZM136 159.84c16.214-.349 32.329-2.635 48-6.81v31.31c-13 4.07-29 6.87-48 7.49ZM32 152v-18.47c5.035 4.179 10.546 7.747 16.42 10.63 2.43 1.21 5 2.35 7.58 3.43v30.41C40.17 170.16 32 160.29 32 152ZM200 178v-30.41c2.61-1.08 5.15-2.22 7.58-3.43 5.874-2.883 11.385-6.451 16.42-10.63v18.47c0 8.29-8.17 18.16-24 26Z"),
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
        return _coin!!
    }

private var _coin: ImageVector? = null
