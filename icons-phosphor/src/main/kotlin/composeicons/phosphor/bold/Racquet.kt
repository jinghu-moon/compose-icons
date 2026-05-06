package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Racquet: ImageVector
    get() {
        if (_racquet != null) return _racquet!!
        _racquet = phosphorBoldIcon(
            name = "Racquet",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M232.7 23.3C218.05 8.66 197.43 2 174.62 4.53 152.81 6.95 131.47 17.61 114.53 34.53 97.59 51.45 86.94 72.8 84.53 94.62c-2 18.33 1.89 35.24 11.1 48.78L75.33 163.71l-1.86-1.86c-7.81-7.808-20.47-7.808-28.28 0L13.86 193.18c-3.752 3.751-5.861 8.839-5.861 14.145 0 5.306 2.108 10.394 5.861 14.145l20.68 20.68c3.751 3.752 8.839 5.861 14.145 5.861 5.306 0 10.394-2.108 14.145-5.861h0L94.14 210.84c3.752-3.751 5.861-8.839 5.861-14.145 0-5.306-2.108-10.394-5.861-14.145l-1.86-1.85 20.31-20.31C123.78 168 137.28 172 152 172c3.134 0 6.266-.177 9.38-.53 21.81-2.42 43.15-13.08 60.08-30 16.93-16.92 27.6-38.27 30-60.09C254 58.57 247.34 38 232.7 23.3ZM48.7 222.3l-15-15L59.35 181.65l15 15ZM128 141.76C122.337 138.397 117.609 133.666 114.25 128h13.75ZM108 104.01c.151-11.189 3.028-22.173 8.38-32h11.62v32ZM152 72h32v32h-32ZM208 104v-32h20c-.141 11.189-3.015 22.174-8.37 32ZM221.75 48h-13.75v-13.74c5.653 3.363 10.377 8.087 13.74 13.74ZM183.82 28h.18v20h-32v-11.66C162.47 30.82 173.48 28 183.82 28ZM152 148.06v-20.06h32v11.67c-9.824 5.361-20.809 8.242-32 8.39Z"),
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
        return _racquet!!
    }

private var _racquet: ImageVector? = null
