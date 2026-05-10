package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.ThreadsLogo: ImageVector
    get() {
        if (_threadsLogo != null) return _threadsLogo!!
        _threadsLogo = phosphorFillIcon(
            name = "ThreadsLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M138.62 128c4.417 .001 8.817 .548 13.1 1.63-.57 8.21-3.34 15-8.11 19.61-4.449 4.325-10.406 6.749-16.61 6.76-11.87 0-15-7.58-15-12.07C112 133 125.8 128 138.62 128ZM224 128c0 65.12-35.89 104-96 104C67.89 232 32 193.12 32 128 32 62.88 67.89 24 128 24c60.11 0 96 38.88 96 104ZM72 128C72 84.93 90.32 64 128 64c26.34 0 43 10.08 50.81 30.83 1.563 4.142 6.188 6.233 10.33 4.67 4.142-1.563 6.233-6.188 4.67-10.33C180.9 55.14 150.9 48 128 48 101.9 48 82.48 56.7 70.28 73.86 60.8 87.19 56 105.4 56 128c0 22.6 4.8 40.81 14.28 54.14C82.48 199.3 101.9 208 128 208c24.45 0 39.82-8.8 48.41-16.18 10.76-9.25 17.19-21.89 17.19-33.82 0-14.3-6.59-26.79-18.56-35.17-2.461-1.712-5.06-3.218-7.77-4.5-2.09-14.65-10-25.75-22.34-31.07C130.43 81 112 83.93 101.21 94.19c-3.209 3.038-3.348 8.101-.31 11.31 3.038 3.209 8.101 3.348 11.31 .31 5.43-5.14 16.79-8 26.4-3.85 4.895 2.069 8.769 5.996 10.77 10.92-3.559-.564-7.157-.849-10.76-.85C113.53 112 96 125.15 96 143.93 96 160.2 109 172 127 172c10.363-.026 20.312-4.074 27.75-11.29 4.7-4.59 10.11-12.2 12.17-24 6.852 4.902 10.848 12.867 10.68 21.29 0 13.71-15.76 34-49.6 34C90.32 192 72 171.07 72 128Z"),
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
        return _threadsLogo!!
    }

private var _threadsLogo: ImageVector? = null
