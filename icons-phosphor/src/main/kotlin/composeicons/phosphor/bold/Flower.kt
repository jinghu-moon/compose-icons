package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Flower: ImageVector
    get() {
        if (_flower != null) return _flower!!
        _flower = phosphorBoldIcon(
            name = "Flower",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M215.64 128c18.606-13.113 24.14-38.252 12.758-57.965C217.017 50.321 192.479 42.543 171.82 52.1 169.763 29.433 150.76 12.076 128 12.076c-22.76 0-41.763 17.357-43.82 40.024C63.521 42.543 38.983 50.321 27.602 70.035 16.22 89.748 21.754 114.887 40.36 128 21.784 141.123 16.271 166.242 27.644 185.939c11.373 19.697 35.884 27.479 56.536 17.951 2.057 22.667 21.06 40.024 43.82 40.024 22.76 0 41.763-17.357 43.82-40.024 20.653 9.528 45.163 1.745 56.536-17.951C239.729 166.242 234.216 141.123 215.64 128ZM108 128c0-11.046 8.954-20 20-20 11.046 0 20 8.954 20 20 0 11.046-8.954 20-20 20-11.046 0-20-8.954-20-20ZM180.35 74.68c6.191-3.63 13.853-3.664 20.076-.089 6.223 3.575 10.054 10.21 10.038 17.387-.016 7.177-3.876 13.795-10.115 17.342-2.65 1.53-10.52 4.88-30.1 6.42-1.991-6.819-5.6-13.056-10.52-18.18C170.86 81.36 177.7 76.21 180.35 74.68ZM128 36c11.046 0 20 8.954 20 20 0 3.06-1 11.55-9.49 29.28-6.896-1.703-14.104-1.703-21 0C109 67.55 108 59.06 108 56c0-11.046 8.954-20 20-20ZM48.33 82C53.853 72.435 66.084 69.157 75.65 74.68c2.65 1.53 9.49 6.68 20.62 22.88-4.92 5.124-8.529 11.361-10.52 18.18C66.17 114.2 58.3 110.85 55.65 109.32 46.085 103.797 42.807 91.566 48.33 82ZM75.65 181.32c-6.191 3.63-13.853 3.664-20.076 .089C49.35 177.834 45.519 171.199 45.535 164.022c.016-7.177 3.876-13.795 10.115-17.342 2.65-1.53 10.52-4.88 30.1-6.42 1.991 6.819 5.6 13.056 10.52 18.18C85.14 174.64 78.3 179.79 75.65 181.32ZM128 220c-11.046 0-20-8.954-20-20 0-3.06 1-11.55 9.49-29.28 6.896 1.703 14.104 1.703 21 0C147 188.45 148 196.94 148 200c0 11.046-8.954 20-20 20ZM207.67 174c-5.523 9.565-17.754 12.843-27.32 7.32-2.65-1.53-9.49-6.68-20.62-22.88 4.92-5.124 8.529-11.361 10.52-18.18 19.58 1.54 27.45 4.89 30.1 6.42 9.565 5.523 12.843 17.754 7.32 27.32Z"),
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
        return _flower!!
    }

private var _flower: ImageVector? = null
