package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Broom: ImageVector
    get() {
        if (_broom != null) return _broom!!
        _broom = phosphorFillIcon(
            name = "Broom",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M235.29 216.7C212.86 205.69 200 182.12 200 152v-17.31c.017-6.561-3.987-12.462-10.09-14.87L161.26 108.36c-4.086-1.636-6.084-6.265-4.47-10.36L179.11 41.33C184 28.79 178 14.21 165.34 9.51 153.08 4.951 139.428 11.048 134.64 23.22L112.25 80.08c-.78 1.981-2.316 3.569-4.27 4.413-1.954 .845-4.163 .876-6.14 .087L73.11 73.08C67.111 70.652 60.24 72.099 55.73 76.74 34.68 98.4 24 123.71 24 152c-.055 28.903 11.113 56.699 31.15 77.53 1.53 1.589 3.644 2.482 5.85 2.47h171c4.234 .008 7.741-3.284 8-7.51 .145-3.309-1.712-6.381-4.71-7.79ZM115.11 216C103.275 204.645 94.869 190.192 90.85 174.29c-1.005-4.153-5.028-6.841-9.25-6.18-2.192 .396-4.12 1.688-5.32 3.565-1.2 1.877-1.562 4.169-1 6.325 3.494 13.776 9.739 26.702 18.36 38h-29.2C48.668 198.417 39.963 175.62 40 152c-.099-12.519 2.54-24.908 7.73-36.3l137.8 55.13c3 18.06 10.55 33.5 21.89 45.19Z"),
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
        return _broom!!
    }

private var _broom: ImageVector? = null
