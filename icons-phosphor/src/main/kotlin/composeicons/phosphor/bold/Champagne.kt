package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Champagne: ImageVector
    get() {
        if (_champagne != null) return _champagne!!
        _champagne = phosphorBoldIcon(
            name = "Champagne",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M153.7 12.29C152.093 7.347 147.487 4.001 142.29 4h-44.6c-5.197 .001-9.803 3.347-11.41 8.29C80.125 32.036 75.327 52.18 71.92 72.58c-7.44 45.34-4.28 77.86 9.37 96.66 6.409 8.957 15.937 15.192 26.71 17.48v41.28h-12c-6.627 0-12 5.373-12 12 0 6.627 5.373 12 12 12h48c6.627 0 12-5.373 12-12 0-6.627-5.373-12-12-12h-12v-41.28c10.77-2.29 20.294-8.525 26.7-17.48 13.66-18.8 16.81-51.32 9.37-96.66C164.659 52.179 159.858 32.036 153.7 12.29ZM133.36 28c2.08 7.25 5.14 18.7 7.92 32h-42.58c2.78-13.3 5.84-24.75 7.92-32ZM139.27 155.14c-4.4 6-10.52 8.86-19.28 8.86-8.76 0-14.88-2.82-19.28-8.86C91.88 143 89.71 117.88 94.46 84h51.06c4.75 33.88 2.58 59-6.25 71.14ZM240 56c0 8.837-7.163 16-16 16-8.837 0-16-7.163-16-16 0-8.837 7.163-16 16-16 8.837 0 16 7.163 16 16ZM180 20c0-8.837 7.163-16 16-16 8.837 0 16 7.163 16 16 0 8.837-7.163 16-16 16-8.837 0-16-7.163-16-16ZM216 104c0 8.837-7.163 16-16 16-8.837 0-16-7.163-16-16 0-8.837 7.163-16 16-16 8.837 0 16 7.163 16 16Z"),
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
        return _champagne!!
    }

private var _champagne: ImageVector? = null
