package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.TextAa: ImageVector
    get() {
        if (_textAa != null) return _textAa!!
        _textAa = phosphorFillIcon(
            name = "TextAa",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M200 156c0 6.5-7.33 12-16 12-8.67 0-16-5.5-16-12 0-6.5 7.33-12 16-12 8.67 0 16 5.5 16 12ZM232 56v144c0 8.837-7.163 16-16 16h-176c-8.837 0-16-7.163-16-16v-144C24 47.163 31.163 40 40 40h176c8.837 0 16 7.163 16 16ZM143.37 172.88 99.37 68.88C98.119 65.917 95.216 63.992 92 63.992c-3.216 0-6.119 1.926-7.37 4.888L40.63 172.88c-1.723 4.07 .18 8.767 4.25 10.49 4.07 1.723 8.767-.18 10.49-4.25L66.84 152h50.32l11.47 27.12c1.723 4.07 6.42 5.973 10.49 4.25 4.07-1.723 5.973-6.42 4.25-10.49ZM216 124C216 108.56 201.64 96 184 96c-7.463-.055-14.747 2.286-20.78 6.68-3.543 2.64-4.275 7.652-1.635 11.195 2.64 3.543 7.652 4.275 11.195 1.635 3.27-2.337 7.201-3.567 11.22-3.51 8.56 0 15.8 5.36 16 11.76v8c-4.962-2.497-10.445-3.785-16-3.76-17.64 0-32 12.56-32 28 0 15.44 14.36 28 32 28 5.912 .027 11.735-1.438 16.93-4.26 1.72 3.248 5.43 4.906 8.997 4.021 3.567-.885 6.071-4.086 6.073-7.761ZM73.61 136h36.78L92 92.53Z"),
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
        return _textAa!!
    }

private var _textAa: ImageVector? = null
