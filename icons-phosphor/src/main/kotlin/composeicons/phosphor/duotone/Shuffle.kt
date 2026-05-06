package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.Shuffle: ImageVector
    get() {
        if (_shuffle != null) return _shuffle!!
        _shuffle = phosphorDuotoneIcon(
            name = "Shuffle",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M107.14 98.8 128 128l-20.86 29.2C95.126 174.019 75.729 184.001 55.06 184h-23.06v-112h23.06c20.669-.001 40.066 9.981 52.08 26.8ZM200.94 72c-20.669-.001-40.066 9.981-52.08 26.8L128 128l20.86 29.2c12.014 16.819 31.411 26.801 52.08 26.8h31.06v-112Z"),
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
                pathData = parseSvgPathData("M237.66 178.34c1.502 1.501 2.346 3.537 2.346 5.66 0 2.123-.844 4.159-2.346 5.66l-24 24c-3.126 3.126-8.194 3.126-11.32 0-3.126-3.126-3.126-8.194 0-11.32L212.69 192h-11.75c-23.248-.019-45.061-11.244-58.59-30.15L100.63 103.45C90.107 88.746 73.141 80.016 55.06 80h-23.06c-4.418 0-8-3.582-8-8 0-4.418 3.582-8 8-8h23.06c23.248 .019 45.061 11.244 58.59 30.15l41.72 58.4c10.523 14.704 27.489 23.434 45.57 23.45h11.75L202.34 165.66c-3.126-3.126-3.126-8.194 0-11.32 3.126-3.126 8.194-3.126 11.32 0ZM143 107c1.727 1.233 3.872 1.73 5.965 1.381 2.093-.349 3.962-1.515 5.195-3.241l1.2-1.67C165.881 88.756 182.851 80.018 200.94 80h11.75L202.34 90.34c-3.126 3.126-3.126 8.194 0 11.32 3.126 3.126 8.194 3.126 11.32 0l24-24c1.502-1.501 2.346-3.537 2.346-5.66 0-2.123-.844-4.159-2.346-5.66l-24-24c-3.126-3.126-8.194-3.126-11.32 0-3.126 3.126-3.126 8.194 0 11.32L212.69 64h-11.75c-23.248 .019-45.061 11.244-58.59 30.15l-1.2 1.67c-1.241 1.727-1.743 3.876-1.396 5.974 .347 2.098 1.515 3.971 3.246 5.206ZM113 149c-1.727-1.233-3.872-1.73-5.965-1.381-2.093 .349-3.962 1.515-5.195 3.241l-1.2 1.67C90.119 167.244 73.149 175.982 55.06 176h-23.06c-4.418 0-8 3.582-8 8 0 4.418 3.582 8 8 8h23.06c23.248-.019 45.061-11.244 58.59-30.15l1.2-1.67c1.241-1.727 1.743-3.876 1.396-5.974-.347-2.098-1.515-3.971-3.246-5.206Z"),
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
        return _shuffle!!
    }

private var _shuffle: ImageVector? = null
