package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.GraduationCap: ImageVector
    get() {
        if (_graduationCap != null) return _graduationCap!!
        _graduationCap = phosphorBoldIcon(
            name = "GraduationCap",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M249.8 85.49l-116-64c-3.61-1.993-7.99-1.993-11.6 0L6.2 85.49C2.38 87.603 .009 91.625 .009 95.99c0 4.365 2.371 8.387 6.191 10.5l21.8 12v47.76c-.008 4.916 1.805 9.662 5.09 13.32C46.63 194.7 77 220 128 220c13.544 .073 27.025-1.865 40-5.75v25.75c0 6.627 5.373 12 12 12 6.627 0 12-5.373 12-12v-35.88c11.59-6.402 22.035-14.684 30.91-24.51 3.285-3.658 5.098-8.404 5.09-13.32v-47.76l21.8-12c3.82-2.113 6.191-6.135 6.191-10.5 0-4.365-2.371-8.387-6.191-10.5ZM128 45.71 219.16 96 186 114.3c-.062-.037-.122-.077-.18-.12l-52-28.69c-5.773-2.984-12.872-.83-16.014 4.858-3.142 5.688-1.185 12.844 4.414 16.142l39 21.49L128 146.3 36.84 96ZM128 196C87.58 196 63.35 176.93 52 164.73v-33l70.2 38.74c3.61 1.993 7.99 1.993 11.6 0L168 151.64v37.23c-12.778 4.83-26.34 7.247-40 7.13ZM204 164.73c-3.68 3.944-7.695 7.561-12 10.81v-37.15l12-6.62Z"),
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
