package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.GraduationCap: ImageVector
    get() {
        if (_graduationCap != null) return _graduationCap!!
        _graduationCap = phosphorFillIcon(
            name = "GraduationCap",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M176 207.24c5.519-2.174 10.867-4.758 16-7.73v40.49c0 4.418-3.582 8-8 8-4.418 0-8-3.582-8-8ZM187.76 118.81l-56-29.87c-3.887-1.985-8.648-.489-10.7 3.364-2.052 3.853-.637 8.639 3.18 10.756L171 128l17-9.06ZM251.76 88.94l-120-64c-2.35-1.252-5.17-1.252-7.52 0L4.24 88.94C1.632 90.33 .002 93.045 .002 96c0 2.955 1.629 5.67 4.238 7.06L32 117.87v48.42c-.008 3.93 1.438 7.723 4.06 10.65C49.16 191.53 78.51 216 128 216c16.409 .136 32.696-2.837 48-8.76v-76.57L171 128l-43 22.93L43.83 106h0L25 96 128 41.07 231 96l-18.78 10h-.06L188 118.94c2.476 1.429 4.001 4.071 4 6.93v73.64c10.432-6.022 19.859-13.637 27.94-22.57 2.622-2.927 4.068-6.72 4.06-10.65v-48.42l27.76-14.81c2.608-1.39 4.238-4.105 4.238-7.06 0-2.955-1.629-5.67-4.238-7.06Z"),
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
        return _graduationCap!!
    }

private var _graduationCap: ImageVector? = null
