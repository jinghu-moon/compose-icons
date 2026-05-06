package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.CurrencyBtc: ImageVector
    get() {
        if (_currencyBtc != null) return _currencyBtc!!
        _currencyBtc = phosphorFillIcon(
            name = "CurrencyBtc",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M176 152c0 8.837-7.163 16-16 16h-48v-32h48c8.837 0 16 7.163 16 16ZM240 128c0 57.438-46.562 104-104 104C78.562 232 32 185.438 32 128 32 70.562 78.562 24 136 24c57.412 .061 103.939 46.588 104 104ZM192 152c-.001-11.228-5.887-21.634-15.51-27.42 7.076-8.413 9.337-19.87 5.99-30.341C179.132 83.768 170.644 75.749 160 73v-9c0-4.418-3.582-8-8-8-4.418 0-8 3.582-8 8v8h-16v-8c0-4.418-3.582-8-8-8-4.418 0-8 3.582-8 8v8h-16c-4.418 0-8 3.582-8 8 0 4.418 3.582 8 8 8v80c-4.418 0-8 3.582-8 8 0 4.418 3.582 8 8 8h16v8c0 4.418 3.582 8 8 8 4.418 0 8-3.582 8-8v-8h16v8c0 4.418 3.582 8 8 8 4.418 0 8-3.582 8-8v-8c17.673 0 32-14.327 32-32ZM168 104c0-8.837-7.163-16-16-16h-40v32h40c8.837 0 16-7.163 16-16Z"),
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
        return _currencyBtc!!
    }

private var _currencyBtc: ImageVector? = null
