package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.PaintBucket: ImageVector
    get() {
        if (_paintBucket != null) return _paintBucket!!
        _paintBucket = phosphorThinIcon(
            name = "PaintBucket",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M235.33 165.78c-.742-1.114-1.991-1.784-3.33-1.784-1.339 0-2.588 .67-3.33 1.784C228 166.8 212 191 212 208c0 11.046 8.954 20 20 20 11.046 0 20-8.954 20-20 0-17-16-41.2-16.67-42.22ZM232 220c-6.627 0-12-5.373-12-12 0-10.25 7.49-24.64 12-32.37 4.51 7.73 12 22.1 12 32.37 0 6.627-5.373 12-12 12ZM235.89 132.4c.317-1.346-.084-2.76-1.06-3.74L119.34 13.17c-1.561-1.558-4.089-1.558-5.65 0L70.25 56.6 42.82 29.17c-1.574-1.493-4.051-1.459-5.583 .076-1.533 1.535-1.562 4.012-.067 5.584L64.6 62.26 17.86 109c-3.752 3.751-5.861 8.839-5.861 14.145 0 5.306 2.108 10.394 5.861 14.145l84.85 84.85c3.751 3.752 8.839 5.861 14.145 5.861 5.306 0 10.394-2.108 14.145-5.861L210.16 143l23.1-7.7c1.322-.442 2.319-1.541 2.63-2.9ZM206.74 135.69c-.594 .207-1.131 .55-1.57 1l-79.83 79.82c-2.252 2.259-5.31 3.529-8.5 3.529-3.19 0-6.248-1.27-8.5-3.529L23.51 131.63c-2.259-2.252-3.529-5.31-3.529-8.5 0-3.19 1.27-6.248 3.529-8.5L70.25 67.92l34.2 34.2c-7.293 10.172-5.545 24.24 4.016 32.317 9.561 8.077 23.723 7.452 32.534-1.437h0c8.723-8.837 9.265-22.869 1.249-32.353C134.233 91.164 120.307 89.361 110.14 96.49L75.94 62.29 116.55 21.69 224.59 129.74ZM112.69 104.69h0c6.25-6.243 16.378-6.24 22.623 .008 6.246 6.248 6.246 16.375 0 22.623-6.246 6.248-16.373 6.252-22.623 .008-3.004-3.001-4.693-7.073-4.693-11.32 0-4.247 1.688-8.319 4.693-11.32Z"),
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
