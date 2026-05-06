package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.PaintBucket: ImageVector
    get() {
        if (_paintBucket != null) return _paintBucket!!
        _paintBucket = phosphorDuotoneIcon(
            name = "PaintBucket",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M248 208c0 8.837-7.163 16-16 16-8.837 0-16-7.163-16-16 0-16 16-40 16-40 0 0 16 24 16 40ZM232 131.48l-24 8-79.83 79.83c-3.001 3.001-7.071 4.688-11.315 4.688-4.244 0-8.314-1.686-11.315-4.688L20.69 134.46c-3.001-3.001-4.688-7.071-4.688-11.315 0-4.244 1.686-8.314 4.688-11.315L116.52 16ZM138.14 101.86c-5.719-5.721-14.322-7.433-21.797-4.338-7.474 3.095-12.348 10.388-12.348 18.478 0 8.09 4.873 15.383 12.348 18.478 7.474 3.095 16.077 1.383 21.797-4.338 7.808-7.81 7.808-20.47 0-28.28Z"),
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
                pathData = parseSvgPathData("M238.66 163.56c-1.483-2.229-3.983-3.568-6.66-3.568-2.677 0-5.177 1.339-6.66 3.568C223.57 166.23 208 190.09 208 208c0 13.255 10.745 24 24 24 13.255 0 24-10.745 24-24 0-17.91-15.57-41.77-17.34-44.44ZM232 216c-4.418 0-8-3.582-8-8 0-6.8 4-16.32 8-24.08 4 7.76 8 17.34 8 24.08 0 4.418-3.582 8-8 8ZM234.53 139.07c2.628-.877 4.616-3.052 5.253-5.748 .637-2.696-.166-5.531-2.123-7.492L122.17 10.34c-3.124-3.122-8.186-3.122-11.31 0L70.25 51 45.65 26.34c-3.126-3.123-8.192-3.121-11.315 .005-3.123 3.126-3.121 8.192 .005 11.315L58.94 62.26 15 106.17c-9.372 9.372-9.372 24.568 0 33.94L99.89 225c9.372 9.372 24.568 9.372 33.94 0l78.49-78.49ZM202.34 133.83l-79.83 79.83c-3.124 3.122-8.186 3.122-11.31 0L26.34 128.8c-3.122-3.124-3.122-8.186 0-11.31L70.25 73.57l29.12 29.12c-6.606 12.233-3.237 27.46 7.914 35.763 11.151 8.303 26.705 7.167 36.531-2.667 9.826-9.835 10.948-25.39 2.635-36.533C138.137 88.109 122.907 84.753 110.68 91.37L81.57 62.26l35-34.95L217.19 128l-11.72 3.9c-1.178 .395-2.249 1.055-3.13 1.93ZM115.51 107.52h0c4.7-5.606 13.052-6.347 18.665-1.655 5.613 4.692 6.366 13.043 1.683 18.663-4.683 5.62-13.034 6.385-18.66 1.71-5.627-4.675-6.405-13.024-1.738-18.658 0 0 .05-.05 .05-.06Z"),
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
        return _paintBucket!!
    }

private var _paintBucket: ImageVector? = null
