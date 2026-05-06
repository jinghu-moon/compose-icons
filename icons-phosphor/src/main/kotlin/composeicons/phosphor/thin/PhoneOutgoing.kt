package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.PhoneOutgoing: ImageVector
    get() {
        if (_phoneOutgoing != null) return _phoneOutgoing!!
        _phoneOutgoing = phosphorThinIcon(
            name = "PhoneOutgoing",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M149.17 106.83c-.751-.75-1.173-1.768-1.173-2.83 0-1.062 .422-2.08 1.173-2.83L190.34 60h-30.34c-2.209 0-4-1.791-4-4 0-2.209 1.791-4 4-4h40c2.209 0 4 1.791 4 4v40c0 2.209-1.791 4-4 4-2.209 0-4-1.791-4-4v-30.34l-41.17 41.17c-.75 .751-1.768 1.173-2.83 1.173-1.062 0-2.08-.422-2.83-1.173ZM219.91 182.58C216.478 208.613 194.258 228.054 168 228 90.8 228 28 165.2 28 88 27.946 61.742 47.387 39.522 73.42 36.09c5.296-.644 10.381 2.286 12.48 7.19L107 90.42c1.602 3.713 1.226 7.984-1 11.36-.09 .13-.18 .26-.28 .38L84.52 127.37c-.676 1.122-.743 2.508-.18 3.69 7.84 16.05 24.65 32.73 40.89 40.57 1.19 .558 2.581 .479 3.7-.21l24.87-21.12c.12-.102 .247-.196 .38-.28 3.378-2.24 7.658-2.624 11.38-1.02l47.22 21.16c4.857 2.113 7.755 7.16 7.13 12.42ZM209.56 177.46 162.35 156.3c-1.164-.489-2.492-.388-3.57 .27L134 177.69l-.37 .28c-3.505 2.34-7.98 2.67-11.79 .87-18-8.69-35.91-26.48-44.6-44.27-1.818-3.78-1.53-8.235 .76-11.75 .09-.14 .19-.26 .29-.39L99.48 97.23c.644-1.095 .729-2.432 .23-3.6L78.57 46.49C77.961 44.996 76.514 44.014 74.9 44c-.16-.01-.32-.01-.48 0C52.372 46.921 35.923 65.76 36 88c0 72.78 59.22 132 132 132 22.24 .077 41.079-16.372 44-38.42 .189-1.762-.804-3.439-2.44-4.12Z"),
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
        return _phoneOutgoing!!
    }

private var _phoneOutgoing: ImageVector? = null
