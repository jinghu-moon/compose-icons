package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.CurrencyInr: ImageVector
    get() {
        if (_currencyInr != null) return _currencyInr!!
        _currencyInr = phosphorFillIcon(
            name = "CurrencyInr",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M128 24C70.562 24 24 70.562 24 128c0 57.438 46.562 104 104 104 57.438 0 104-46.562 104-104C231.939 70.588 185.412 24.061 128 24ZM166.32 96h9.68c4.418 0 8 3.582 8 8 0 4.418-3.582 8-8 8h-8.19c-2.095 22.64-21.073 39.968-43.81 40h-12.68l53.59 41.69c2.368 1.715 3.612 4.585 3.244 7.486-.368 2.901-2.289 5.369-5.01 6.439-2.721 1.069-5.809 .569-8.053-1.305l-72-56c-2.693-2.099-3.757-5.676-2.649-8.906C81.549 138.174 84.585 136.003 88 136h36c13.918-.001 25.722-10.225 27.71-24h-63.71c-4.418 0-8-3.582-8-8 0-4.418 3.582-8 8-8h61.29C144.656 86.231 134.812 80.003 124 80h-36c-4.418 0-8-3.582-8-8 0-4.418 3.582-8 8-8h88c4.418 0 8 3.582 8 8 0 4.418-3.582 8-8 8h-18.08c3.88 4.693 6.741 10.142 8.4 16Z"),
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
        return _currencyInr!!
    }

private var _currencyInr: ImageVector? = null
