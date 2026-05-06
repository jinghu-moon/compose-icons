package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.NotSubsetOf: ImageVector
    get() {
        if (_notSubsetOf != null) return _notSubsetOf!!
        _notSubsetOf = phosphorRegularIcon(
            name = "NotSubsetOf",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M213.38 34.08c-3.27-2.971-8.329-2.729-11.3 .54L197.19 40h-69.19C93.121 40.024 61.549 60.645 47.507 92.572c-14.042 31.927-7.902 69.134 15.653 94.858L42.08 210.62c-1.963 2.109-2.641 5.11-1.774 7.858 .867 2.748 3.144 4.817 5.961 5.418 2.818 .601 5.741-.36 7.653-2.515L75 198.2c15.245 11.57 33.862 17.822 53 17.8h72c4.418 0 8-3.582 8-8 0-4.418-3.582-8-8-8h-72c-15.155 .01-29.923-4.786-42.18-13.7L213.92 45.38c2.971-3.27 2.729-8.329-.54-11.3ZM56 128C56.044 88.254 88.254 56.044 128 56h54.64L74 175.53C62.397 162.417 55.994 145.51 56 128Z"),
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
        return _notSubsetOf!!
    }

private var _notSubsetOf: ImageVector? = null
