package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.ChatCircleDots: ImageVector
    get() {
        if (_chatCircleDots != null) return _chatCircleDots!!
        _chatCircleDots = phosphorBoldIcon(
            name = "ChatCircleDots",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M120 128c0 8.837-7.163 16-16 16-8.837 0-16-7.163-16-16 0-8.837 7.163-16 16-16 8.837 0 16 7.163 16 16ZM152 112c-8.837 0-16 7.163-16 16 0 8.837 7.163 16 16 16 8.837 0 16-7.163 16-16 0-8.837-7.163-16-16-16ZM236 128c.008 37.62-19.561 72.534-51.656 92.16-32.095 19.627-72.09 21.138-105.574 3.99L46.34 235c-7.201 2.427-15.156 .563-20.53-4.81C20.437 224.816 18.573 216.861 21 209.66L31.81 177.23C11.481 137.41 17.789 89.182 47.675 55.93 77.561 22.678 124.845 11.278 166.601 27.257 208.356 43.236 235.949 83.291 236 128ZM212 128C211.987 92.687 189.888 61.152 156.699 49.087 123.511 37.022 86.32 47.002 63.632 74.063c-22.689 27.06-26.03 65.422-8.362 95.997 1.724 2.976 2.088 6.548 1 9.81l-9.93 29.79 29.79-9.93c1.225-.408 2.508-.617 3.8-.62 2.108 .004 4.177 .562 6 1.62 25.992 15.04 58.035 15.06 84.046 .055C195.987 185.779 212.009 158.029 212 128Z"),
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
        return _chatCircleDots!!
    }

private var _chatCircleDots: ImageVector? = null
