package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.WhatsappLogo: ImageVector
    get() {
        if (_whatsappLogo != null) return _whatsappLogo!!
        _whatsappLogo = phosphorBoldIcon(
            name = "WhatsappLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M187.3 159.06C183.903 175.868 169.148 187.965 152 188 105.629 187.95 68.05 150.371 68 104 68.035 86.852 80.132 72.097 96.94 68.7c5.297-1.048 10.643 1.571 13.06 6.4l11.48 23c1.916 3.846 1.63 8.423-.75 12l-8.52 12.78c4.387 9.147 11.763 16.523 20.91 20.91l12.78-8.52c3.577-2.38 8.154-2.666 12-.75l23 11.48c4.829 2.417 7.448 7.763 6.4 13.06ZM236 128c.008 37.62-19.561 72.534-51.656 92.16-32.095 19.627-72.09 21.138-105.574 3.99L46.34 235c-7.201 2.427-15.156 .563-20.53-4.81C20.437 224.816 18.573 216.861 21 209.66L31.81 177.23C11.481 137.41 17.789 89.182 47.675 55.93 77.561 22.678 124.845 11.278 166.601 27.257 208.356 43.236 235.949 83.291 236 128ZM212 128C211.987 92.687 189.888 61.152 156.699 49.087 123.511 37.022 86.32 47.002 63.632 74.063c-22.689 27.06-26.03 65.422-8.362 95.997 1.724 2.976 2.088 6.548 1 9.81l-9.93 29.79 29.79-9.93c1.225-.408 2.508-.617 3.8-.62 2.108 .004 4.177 .562 6 1.62 25.992 15.04 58.035 15.06 84.046 .055C195.987 185.779 212.009 158.029 212 128Z"),
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
        return _whatsappLogo!!
    }

private var _whatsappLogo: ImageVector? = null
