package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Guitar: ImageVector
    get() {
        if (_guitar != null) return _guitar!!
        _guitar = phosphorThinIcon(
            name = "Guitar",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M246.83 49.17l-40-40c-1.563-1.563-4.097-1.563-5.66 0-1.563 1.563-1.563 4.097 0 5.66L206.34 20 141.25 85.1C119.34 72.56 94.36 72.79 79.58 87.57c-3.696 3.704-6.589 8.129-8.5 13-1.909 4.468-6.281 7.384-11.14 7.43-13.55 .46-25.29 5.28-34 13.94C14.82 133.14 10.1 149.31 12.7 167.51c2.54 17.77 11.8 35.42 26.08 49.71 14.28 14.29 31.94 23.54 49.71 26.08 3.176 .461 6.381 .695 9.59 .7 14.25 0 26.79-4.82 36-14 8.66-8.67 13.48-20.41 13.94-34 .049-4.864 2.974-9.237 7.45-11.14 4.871-1.911 9.296-4.804 13-8.5 14.78-14.78 15-39.76 2.47-61.67L236 49.66l5.17 5.17c1.563 1.563 4.097 1.563 5.66 0 1.563-1.563 1.563-4.097 0-5.66ZM162.77 170.76c-2.931 2.929-6.439 5.217-10.3 6.72-7.423 3.087-12.316 10.273-12.47 18.31-.38 11.49-4.39 21.37-11.6 28.57-9.34 9.34-23.1 13.26-38.75 11C73.58 233.07 57.54 224.61 44.47 211.54 31.4 198.47 22.94 182.43 20.65 166.36c-2.24-15.65 1.68-29.41 11-38.75 7.2-7.21 17.08-11.22 28.57-11.6h0c8.045-.159 15.232-5.066 18.31-12.5 1.503-3.861 3.791-7.369 6.72-10.3 11.8-11.8 31.84-12 50.14-2.27l-25.09 25.09c-14.982 .94-26.557 13.528-26.24 28.536 .317 15.008 12.413 27.096 27.421 27.403 15.008 .307 27.588-11.277 28.519-26.259l25-25.09c9.81 18.3 9.57 38.38-2.23 50.14ZM112 124c11.046 0 20 8.954 20 20h0c0 11.046-8.954 20-20 20-11.046 0-20-8.954-20-20 0-11.046 8.954-20 20-20ZM138.71 135.63c-2.752-8.741-9.599-15.588-18.34-18.34l22-22c7.143 4.996 13.354 11.207 18.35 18.35ZM158 98c-3.069-3.074-6.379-5.896-9.9-8.44L176 61.65 194.34 80l-27.87 27.87C163.916 104.358 161.083 101.058 158 98ZM200 74.37 181.66 56 212 25.66 230.34 44ZM90.84 197.16c1.563 1.563 1.563 4.097 0 5.66-1.563 1.563-4.097 1.563-5.66 0l-32-32c-1.563-1.563-1.563-4.097 0-5.66 1.563-1.563 4.097-1.563 5.66 0Z"),
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
        return _guitar!!
    }

private var _guitar: ImageVector? = null
