package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.BookOpenUser: ImageVector
    get() {
        if (_bookOpenUser != null) return _bookOpenUser!!
        _bookOpenUser = phosphorDuotoneIcon(
            name = "BookOpenUser",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M232 80v120h-72c-17.673 0-32 14.327-32 32 0-17.673-14.327-32-32-32h-72v-120h72c17.673 0 32 14.327 32 32 0-17.673 14.327-32 32-32Z"),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color(0xFF000000)),
                fillAlpha = 0.2f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
            )
            addPath(
                pathData = parseSvgPathData("M232 72h-72c-12.59 0-24.446 5.928-32 16C120.446 77.928 108.59 72 96 72h-72c-4.418 0-8 3.582-8 8v120c0 4.418 3.582 8 8 8h72c13.255 0 24 10.745 24 24 0 4.418 3.582 8 8 8 4.418 0 8-3.582 8-8 0-13.255 10.745-24 24-24h72c4.418 0 8-3.582 8-8v-120c0-4.418-3.582-8-8-8ZM96 192h-64v-104h64c13.255 0 24 10.745 24 24v88c-6.917-5.205-15.343-8.014-24-8ZM224 192h-64c-8.657-.014-17.083 2.795-24 8v-88c0-13.255 10.745-24 24-24h64ZM89.6 43.19C98.665 31.103 112.892 23.99 128 23.99c15.108 0 29.335 7.113 38.4 19.2 2.656 3.532 1.947 8.549-1.585 11.205-3.532 2.656-8.549 1.947-11.205-1.585C147.567 44.744 138.078 39.997 128 39.997c-10.078 0-19.567 4.748-25.61 12.813-2.656 3.532-7.673 4.241-11.205 1.585C87.653 51.739 86.944 46.722 89.6 43.19Z"),
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
        return _bookOpenUser!!
    }

private var _bookOpenUser: ImageVector? = null
