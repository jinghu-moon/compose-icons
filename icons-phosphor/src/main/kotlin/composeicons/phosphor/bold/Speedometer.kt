package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Speedometer: ImageVector
    get() {
        if (_speedometer != null) return _speedometer!!
        _speedometer = phosphorBoldIcon(
            name = "Speedometer",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M119.51 143.51 207.51 55.51c4.694-4.694 12.306-4.694 17 0 4.694 4.694 4.694 12.306 0 17l-88 88c-4.694 4.694-12.306 4.694-17 0-4.694-4.694-4.694-12.306 0-17ZM133.74 100.31c4.316 .576 8.605-1.23 11.208-4.721 2.603-3.49 3.111-8.116 1.328-12.088-1.783-3.972-5.578-6.667-9.916-7.041C133.584 76.151 130.793 75.998 128 76c-41.955 .044-75.956 34.045-76 76 0 6.627 5.373 12 12 12 6.627 0 12-5.373 12-12 .033-28.705 23.295-51.967 52-52 1.917 .003 3.833 .106 5.74 .31ZM235.28 107.81c-2.538-6.128-9.562-9.038-15.69-6.5-6.128 2.538-9.038 9.562-6.5 15.69 8.214 20.049 9.127 42.346 2.58 63h-175.33C31.507 152.024 36.509 121.515 53.815 97.825 71.12 74.136 98.663 60.092 128 60h.84c11.738 .087 23.349 2.433 34.2 6.91 6.108 2.441 13.043-.491 15.548-6.573 2.505-6.082-.353-13.048-6.408-15.617C129.877 27.339 81.311 36.42 48.146 67.912 14.981 99.403 3.401 147.435 18.57 190.58c2.823 8.02 10.388 13.394 18.89 13.42h181.07c8.491-.015 16.053-5.374 18.88-13.38 9.469-26.93 8.711-56.402-2.13-82.81Z"),
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
        return _speedometer!!
    }

private var _speedometer: ImageVector? = null
