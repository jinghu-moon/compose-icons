package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.ThreadsLogo: ImageVector
    get() {
        if (_threadsLogo != null) return _threadsLogo!!
        _threadsLogo = phosphorBoldIcon(
            name = "ThreadsLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M188.84 120.46c-3.147-2.361-6.493-4.446-10-6.23C175.12 92.55 162.43 76.82 143.32 71.03 121.94 64.55 97.29 72.42 86 89.34c-3.678 5.523-2.183 12.982 3.34 16.66 5.523 3.678 12.982 2.183 16.66-3.34C111.47 94.46 125.11 90.58 136.41 94c6.411 1.9 11.78 6.315 14.88 12.24-2.944-.301-5.901-.451-8.86-.45C108.56 105.79 84 125.22 84 152c0 22.9 17.54 39.52 41.71 39.52 14.063-.08 27.494-5.852 37.23-16 6-6.23 12.88-16.46 15.72-32.07 6.2 6.42 9.34 14.67 9.34 24.59 0 17.74-19.07 44-60 44-45.76 0-68-27.48-68-84C60 71.52 82.24 44.04 128 44.04c31.08 0 51 12.42 60.8 38 2.38 6.186 9.324 9.27 15.51 6.89 6.186-2.38 9.27-9.324 6.89-15.51C197.77 38.44 169 20 128 20 68.67 20 36 58.35 36 128c0 69.65 32.67 108 92 108 31.36 0 51.08-12.05 62.11-22.15C203.81 201.28 212 184.14 212 168c0-19.64-8-36.08-23.16-47.54ZM145.64 158.85c-5.198 5.465-12.388 8.593-19.93 8.67C117.54 167.52 108 163.46 108 152c0-15.26 17.84-22.21 34.41-22.21 4.546-.005 9.078 .505 13.51 1.52-.56 11.62-4.08 21.1-10.28 27.54Z"),
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
