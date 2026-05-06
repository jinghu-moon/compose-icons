package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Tram: ImageVector
    get() {
        if (_tram != null) return _tram!!
        _tram = phosphorLightIcon(
            name = "Tram",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M184 50h-50v-28h34c3.314 0 6-2.686 6-6 0-3.314-2.686-6-6-6h-80c-3.314 0-6 2.686-6 6 0 3.314 2.686 6 6 6h34v28h-50C55.431 50 42 63.431 42 80v104c0 16.569 13.431 30 30 30h12L67.2 236.4c-1.988 2.651-1.451 6.412 1.2 8.4 2.651 1.988 6.412 1.451 8.4-1.2L99 214h58l22.2 29.6c1.988 2.651 5.749 3.188 8.4 1.2 2.651-1.988 3.188-5.749 1.2-8.4L172 214h12c16.569 0 30-13.431 30-30v-104C214 63.431 200.569 50 184 50ZM72 62h112c9.941 0 18 8.059 18 18v42h-148v-42C54 70.059 62.059 62 72 62ZM184 202h-112c-9.941 0-18-8.059-18-18v-50h148v50c0 9.941-8.059 18-18 18ZM94 172c0 5.523-4.477 10-10 10-5.523 0-10-4.477-10-10 0-5.523 4.477-10 10-10 5.523 0 10 4.477 10 10ZM182 172c0 5.523-4.477 10-10 10-5.523 0-10-4.477-10-10 0-5.523 4.477-10 10-10 5.523 0 10 4.477 10 10Z"),
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
        return _tram!!
    }

private var _tram: ImageVector? = null
