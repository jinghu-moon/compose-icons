package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.PhoneCall: ImageVector
    get() {
        if (_phoneCall != null) return _phoneCall!!
        _phoneCall = phosphorThinIcon(
            name = "PhoneCall",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M148.14 47c.554-2.131 2.726-3.414 4.86-2.87 28.836 7.511 51.354 30.032 58.86 58.87 .566 2.131-.7 4.319-2.83 4.89-.325 .093-.662 .14-1 .14-1.819-.006-3.405-1.239-3.86-3C197.376 78.99 177.04 58.654 151 51.86c-2.127-.558-3.405-2.729-2.86-4.86ZM143 83.86C158 87.89 168.11 98 172.14 113c.455 1.761 2.041 2.994 3.86 3 .338-0 .675-.047 1-.14 2.13-.571 3.396-2.759 2.83-4.89-4.8-18-16.85-30-34.83-34.84-2.074-.401-4.103 .88-4.632 2.925-.529 2.045 .623 4.149 2.632 4.805ZM219.94 182.58C216.506 208.624 194.269 228.07 168 228 90.8 228 28 165.2 28 88 27.946 61.742 47.387 39.522 73.42 36.09c5.296-.644 10.381 2.286 12.48 7.19L107 90.42c1.602 3.713 1.226 7.984-1 11.36-.09 .13-.18 .26-.28 .38L84.52 127.37c-.676 1.122-.743 2.508-.18 3.69 7.84 16.05 24.65 32.73 40.89 40.57 1.191 .552 2.579 .474 3.7-.21l24.87-21.12 .38-.29c3.381-2.233 7.661-2.609 11.38-1l47.22 21.16c4.853 2.112 7.75 7.154 7.13 12.41ZM209.59 177.46 162.35 156.3c-1.164-.489-2.492-.388-3.57 .27L134 177.69l-.37 .28c-3.505 2.34-7.98 2.67-11.79 .87-18-8.69-35.91-26.48-44.6-44.27-1.818-3.78-1.53-8.235 .76-11.75 .09-.14 .19-.26 .29-.39L99.48 97.23c.644-1.095 .729-2.432 .23-3.6L78.57 46.49C77.961 44.996 76.514 44.014 74.9 44c-.16-.01-.32-.01-.48 0C52.372 46.921 35.923 65.76 36 88c0 72.78 59.22 132 132 132 22.24 .077 41.079-16.372 44-38.42 .189-1.762-.804-3.439-2.44-4.12Z"),
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
        return _phoneCall!!
    }

private var _phoneCall: ImageVector? = null
