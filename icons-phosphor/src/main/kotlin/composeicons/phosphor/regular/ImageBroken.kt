package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.ImageBroken: ImageVector
    get() {
        if (_imageBroken != null) return _imageBroken!!
        _imageBroken = phosphorRegularIcon(
            name = "ImageBroken",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M216 40h-176C31.163 40 24 47.163 24 56v144c0 8.837 7.163 16 16 16h64c3.444 0 6.501-2.203 7.59-5.47l14.83-44.48L163 151.43c2.03-.82 3.64-2.43 4.46-4.46l14.62-36.55L226.56 95.59C229.815 94.491 232.005 91.436 232 88v-32c0-8.837-7.163-16-16-16ZM112.41 157.47 98.23 200h-58.23v-28L92 120l30.42 30.42L117 152.57c-2.175 .881-3.853 2.673-4.59 4.9ZM216 82.23 173.47 96.41c-2.234 .744-4.026 2.434-4.9 4.62l-14.72 36.82L138.58 144 103.31 108.73c-6.248-6.243-16.372-6.243-22.62 0L40 149.37v-93.37h176ZM228.68 115.23c-2.087-1.505-4.77-1.914-7.21-1.1l-23.8 7.94c-2.231 .742-4.024 2.428-4.9 4.61l-14.31 35.77-35.77 14.31c-2.182 .876-3.868 2.669-4.61 4.9l-7.94 23.8c-.817 2.441-.41 5.126 1.094 7.215 1.504 2.089 3.922 3.326 6.496 3.325h78.27c8.837 0 16-7.163 16-16v-78.27c.001-2.571-1.235-4.986-3.32-6.49ZM216 200h-67.17l3.25-9.75 35.51-14.2c2.03-.82 3.64-2.43 4.46-4.46l14.2-35.51L216 132.83Z"),
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
        return _imageBroken!!
    }

private var _imageBroken: ImageVector? = null
