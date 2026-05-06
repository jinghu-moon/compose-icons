package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Stethoscope: ImageVector
    get() {
        if (_stethoscope != null) return _stethoscope!!
        _stethoscope = phosphorFillIcon(
            name = "Stethoscope",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M240 160c.001-16.639-12.75-30.502-29.331-31.89-16.581-1.388-31.459 10.163-34.224 26.57-2.765 16.408 7.505 32.197 23.625 36.32-.044 .332-.068 .666-.07 1 0 17.673-14.327 32-32 32h-24c-17.673 0-32-14.327-32-32v-40.52c31.47-4 56-31.47 56-64.31v-47.17c0-4.418-3.582-8-8-8h-24c-4.418 0-8 3.582-8 8 0 4.418 3.582 8 8 8h16v39.17c0 26.58-21.25 48.49-47.36 48.83-12.841 .171-25.215-4.81-34.356-13.831C61.144 113.149 55.999 100.842 56 88v-40h16c4.418 0 8-3.582 8-8 0-4.418-3.582-8-8-8h-24c-4.418 0-8 3.582-8 8v48c.004 32.25 24.003 59.459 56 63.49v40.51c.028 26.498 21.502 47.972 48 48h24c26.498-.028 47.972-21.502 48-48-.002-.334-.026-.668-.07-1 14.162-3.623 24.069-16.382 24.07-31ZM208 168c-4.418 0-8-3.582-8-8 0-4.418 3.582-8 8-8 4.418 0 8 3.582 8 8 0 4.418-3.582 8-8 8Z"),
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
        return _stethoscope!!
    }

private var _stethoscope: ImageVector? = null
