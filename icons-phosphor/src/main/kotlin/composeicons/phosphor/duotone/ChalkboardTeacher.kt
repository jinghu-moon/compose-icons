package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.ChalkboardTeacher: ImageVector
    get() {
        if (_chalkboardTeacher != null) return _chalkboardTeacher!!
        _chalkboardTeacher = phosphorDuotoneIcon(
            name = "ChalkboardTeacher",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M192 80v96h-88c17.673 0 32-14.327 32-32 0-17.673-14.327-32-32-32-17.673 0-32 14.327-32 32h-8v-64Z"),
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
                pathData = parseSvgPathData("M216 40h-176C31.163 40 24 47.163 24 56v144c0 8.837 7.163 16 16 16h13.39c3.09 .001 5.905-1.778 7.23-4.57C68.561 194.665 85.45 183.977 104 183.977c18.55 0 35.439 10.689 43.38 27.453 1.325 2.792 4.14 4.571 7.23 4.57h61.39c8.837 0 16-7.163 16-16v-144c0-8.837-7.163-16-16-16ZM80 144c0-13.255 10.745-24 24-24 13.255 0 24 10.745 24 24 0 13.255-10.745 24-24 24C90.745 168 80 157.255 80 144ZM216 200h-56.57c-6.681-11.486-16.751-20.624-28.83-26.16 12.398-11.04 16.689-28.59 10.783-44.105C135.477 114.22 120.601 103.966 104 103.966c-16.601 0-31.477 10.254-37.383 25.769-5.906 15.515-1.616 33.065 10.783 44.105C65.321 179.376 55.251 188.514 48.57 200h-8.57v-144h176ZM56 96v-16c0-4.418 3.582-8 8-8h128c4.418 0 8 3.582 8 8v96c0 4.418-3.582 8-8 8h-16c-4.418 0-8-3.582-8-8 0-4.418 3.582-8 8-8h8v-80h-112v8c0 4.418-3.582 8-8 8-4.418 0-8-3.582-8-8Z"),
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
        return _chalkboardTeacher!!
    }

private var _chalkboardTeacher: ImageVector? = null
