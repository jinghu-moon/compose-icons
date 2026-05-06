package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.GraduationCap: ImageVector
    get() {
        if (_graduationCap != null) return _graduationCap!!
        _graduationCap = phosphorRegularIcon(
            name = "GraduationCap",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M251.76 88.94l-120-64c-2.35-1.252-5.17-1.252-7.52 0L4.24 88.94C1.632 90.33 .002 93.045 .002 96c0 2.955 1.629 5.67 4.238 7.06L32 117.87v48.42c-.008 3.93 1.438 7.723 4.06 10.65C49.16 191.53 78.51 216 128 216c16.409 .136 32.696-2.837 48-8.76v32.76c0 4.418 3.582 8 8 8 4.418 0 8-3.582 8-8v-40.49c10.432-6.022 19.859-13.637 27.94-22.57 2.622-2.927 4.068-6.72 4.06-10.65v-48.42l27.76-14.81c2.608-1.39 4.238-4.105 4.238-7.06 0-2.955-1.629-5.67-4.238-7.06ZM128 200C84.73 200 59.28 178.86 48 166.29v-39.89l76.24 40.66c2.35 1.252 5.17 1.252 7.52 0L176 143.47v46.34C163.4 195.69 147.52 200 128 200ZM208 166.25c-4.796 5.321-10.161 10.1-16 14.25v-45.57l16-8.53ZM188 118.94l-.22-.13-56-29.87c-3.887-1.985-8.648-.489-10.7 3.364-2.052 3.853-.637 8.639 3.18 10.756L171 128l-43 22.93L25 96 128 41.07 231 96Z"),
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
