package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Acorn: ImageVector
    get() {
        if (_acorn != null) return _acorn!!
        _acorn = phosphorFillIcon(
            name = "Acorn",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M232 104C231.967 73.086 206.914 48.033 176 48h-40c0-13.255 10.745-24 24-24 4.418 0 8-3.582 8-8 0-4.418-3.582-8-8-8C137.909 8 120 25.909 120 48h-40C49.086 48.033 24.033 73.086 24 104c.006 5.71 3.055 10.985 8 13.84v10.16c0 35.53 33.12 62.12 59.74 83.49C103.66 221.07 120 234.18 120 240c0 4.418 3.582 8 8 8 4.418 0 8-3.582 8-8 0-5.82 16.34-18.93 28.26-28.51C190.88 190.12 224 163.53 224 128v-10.16c4.945-2.855 7.994-8.13 8-13.84ZM154.25 199c-10.62 8.52-20 16-26.25 23.37C121.75 215.05 112.37 207.52 101.75 199 77.8 179.79 48 155.86 48 128v-8h160v8c0 27.86-29.8 51.79-53.75 71Z"),
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
        return _acorn!!
    }

private var _acorn: ImageVector? = null
