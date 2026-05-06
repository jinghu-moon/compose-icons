package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.MessengerLogo: ImageVector
    get() {
        if (_messengerLogo != null) return _messengerLogo!!
        _messengerLogo = phosphorBoldIcon(
            name = "MessengerLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M184.49 120.49l-32 32c-2.252 2.259-5.31 3.529-8.5 3.529-3.19 0-6.248-1.27-8.5-3.529L112 129 88.49 152.49c-4.694 4.694-12.306 4.694-17 0-4.694-4.694-4.694-12.306 0-17l32-32c2.252-2.259 5.31-3.529 8.5-3.529 3.19 0 6.248 1.27 8.5 3.529L144 127l23.51-23.52c4.694-4.694 12.306-4.694 17 0 4.694 4.694 4.694 12.306 0 17ZM236 128c.008 37.62-19.561 72.534-51.656 92.16-32.095 19.627-72.09 21.138-105.574 3.99L46.34 235c-7.201 2.427-15.156 .563-20.53-4.81C20.437 224.816 18.573 216.861 21 209.66L31.81 177.23C11.481 137.41 17.789 89.182 47.675 55.93 77.561 22.678 124.845 11.278 166.601 27.257 208.356 43.236 235.949 83.291 236 128ZM212 128C211.991 92.685 189.894 61.147 156.706 49.079 123.517 37.011 86.324 46.99 63.634 74.05c-22.691 27.06-26.033 65.423-8.364 96 1.726 2.978 2.091 6.555 1 9.82l-9.93 29.79 29.79-9.93c1.225-.408 2.508-.617 3.8-.62 2.108 .004 4.177 .562 6 1.62 25.992 15.04 58.035 15.06 84.046 .055C195.987 185.779 212.009 158.029 212 128Z"),
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
        return _messengerLogo!!
    }

private var _messengerLogo: ImageVector? = null
