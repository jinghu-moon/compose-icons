package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.XLogo: ImageVector
    get() {
        if (_xLogo != null) return _xLogo!!
        _xLogo = phosphorBoldIcon(
            name = "XLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M218.12 209.56l-61-95.8L216.84 48.07c4.361-4.916 3.957-12.425-.906-16.844-4.863-4.42-12.376-4.106-16.854 .704L143.81 92.77 106.12 33.56C103.919 30.099 100.102 28.002 96 28h-48c-4.378 .002-8.408 2.388-10.514 6.227-2.106 3.838-1.955 8.519 .394 12.213l61 95.8L39.12 207.93c-2.945 3.163-3.961 7.665-2.661 11.786 1.3 4.121 4.716 7.225 8.942 8.126 4.226 .901 8.611-.54 11.479-3.773l55.31-60.84 37.69 59.21c2.201 3.461 6.018 5.558 10.12 5.56h48c4.378-.002 8.408-2.388 10.514-6.227 2.106-3.838 1.955-8.519-.394-12.213ZM166.59 204 69.86 52h19.55l96.73 152Z"),
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
        return _xLogo!!
    }

private var _xLogo: ImageVector? = null
