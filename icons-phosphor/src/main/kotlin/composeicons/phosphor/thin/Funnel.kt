package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Funnel: ImageVector
    get() {
        if (_funnel != null) return _funnel!!
        _funnel = phosphorThinIcon(
            name = "Funnel",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M227 51.15C225.108 46.769 220.772 43.951 216 44h-176c-4.749 0-9.051 2.802-10.973 7.145-1.922 4.343-1.101 9.411 2.093 12.925l.05 .05L100 137.59v78.41c-.007 4.43 2.428 8.502 6.332 10.595 3.904 2.092 8.644 1.864 12.328-.595l32-21.33c3.345-2.227 5.354-5.981 5.35-10v-57.08L224.87 64.07c3.241-3.488 4.08-8.576 2.13-12.92ZM219 58.65l-69.9 74.62c-.7 .737-1.094 1.713-1.1 2.73v58.65c.001 1.338-.667 2.588-1.78 3.33l-32 21.33c-1.225 .817-2.799 .895-4.099 .204-1.3-.692-2.114-2.041-2.121-3.514v-80c.002-1.017-.385-1.997-1.08-2.74L37.05 58.67c-1.05-1.171-1.316-2.849-.68-4.288C37.006 52.943 38.427 52.011 40 52h176c1.574-.001 3.003 .92 3.65 2.355 .647 1.435 .393 3.116-.65 4.295Z"),
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
        return _funnel!!
    }

private var _funnel: ImageVector? = null
