package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.FunnelX: ImageVector
    get() {
        if (_funnelX != null) return _funnelX!!
        _funnelX = phosphorThinIcon(
            name = "FunnelX",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M227 51.15C225.105 46.771 220.771 43.954 216 44h-176c-4.749 0-9.051 2.802-10.973 7.145-1.922 4.343-1.101 9.411 2.093 12.925l.05 .05L100 137.59v78.41c-.004 4.426 2.429 8.495 6.329 10.587 3.901 2.092 8.636 1.866 12.321-.587l32-21.33c3.342-2.229 5.346-5.983 5.34-10v-57.08L224.85 64.07c3.253-3.481 4.1-8.573 2.15-12.92ZM219 58.65l-69.91 74.62c-.697 .739-1.086 1.715-1.09 2.73v58.65c.001 1.338-.667 2.588-1.78 3.33l-32 21.33c-1.225 .817-2.799 .895-4.099 .204-1.3-.692-2.114-2.041-2.121-3.514v-80c-.001-1.019-.391-1.999-1.09-2.74L37.05 58.67c-1.05-1.171-1.316-2.849-.68-4.288C37.006 52.943 38.427 52.011 40 52h176c1.574-.001 3.003 .92 3.65 2.355 .647 1.435 .393 3.116-.65 4.295ZM242.84 213.18c1.563 1.563 1.563 4.097 0 5.66-1.563 1.563-4.097 1.563-5.66 0L216 197.67l-21.17 21.17c-1.563 1.563-4.097 1.563-5.66 0-1.563-1.563-1.563-4.097 0-5.66L210.34 192 189.17 170.83c-1.563-1.563-1.563-4.097 0-5.66 1.563-1.563 4.097-1.563 5.66 0L216 186.35l21.17-21.17c1.563-1.563 4.097-1.563 5.66 0 1.563 1.563 1.563 4.097 0 5.66L221.66 192Z"),
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
        return _funnelX!!
    }

private var _funnelX: ImageVector? = null
