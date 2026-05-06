package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.ChalkboardTeacher: ImageVector
    get() {
        if (_chalkboardTeacher != null) return _chalkboardTeacher!!
        _chalkboardTeacher = phosphorFillIcon(
            name = "ChalkboardTeacher",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M216 40h-176C31.163 40 24 47.163 24 56v144c0 8.837 7.163 16 16 16h13.39c3.09 .001 5.905-1.778 7.23-4.57C68.561 194.665 85.45 183.977 104 183.977c18.55 0 35.439 10.689 43.38 27.453 1.325 2.792 4.14 4.571 7.23 4.57h61.39c8.837 0 16-7.163 16-16v-144c0-8.837-7.163-16-16-16ZM104 168C86.327 168 72 153.673 72 136c0-17.673 14.327-32 32-32 17.673 0 32 14.327 32 32 0 17.673-14.327 32-32 32ZM216 200h-56.57c-3.488-6.013-7.933-11.418-13.16-16h45.73c4.418 0 8-3.582 8-8v-96c0-4.418-3.582-8-8-8h-128c-4.418 0-8 3.582-8 8v96c-.002 3.649 2.466 6.838 6 7.75C56.652 188.383 52.113 193.875 48.57 200h-8.57v-144h176Z"),
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
