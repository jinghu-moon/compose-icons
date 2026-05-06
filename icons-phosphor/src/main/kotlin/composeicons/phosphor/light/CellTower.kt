package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.CellTower: ImageVector
    get() {
        if (_cellTower != null) return _cellTower!!
        _cellTower = phosphorLightIcon(
            name = "CellTower",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M133.37 85.32C132.355 83.284 130.275 81.996 128 81.996c-2.275 0-4.355 1.287-5.37 3.324L50.63 229.32c-1.483 2.966-.281 6.572 2.685 8.055 2.966 1.483 6.572 .281 8.055-2.685L75.71 206h104.58l14.34 28.68c1.016 2.035 3.095 3.321 5.37 3.32 .931 .002 1.85-.217 2.68-.64 1.425-.71 2.508-1.958 3.013-3.468 .505-1.51 .388-3.158-.323-4.582ZM128 101.42 158.29 162h-60.58ZM81.71 194l10-20h72.58l10 20ZM161.45 94.1c.369-2.012 .553-4.054 .55-6.1C162 69.222 146.778 54 128 54 109.222 54 94 69.222 94 88c-.003 2.046 .181 4.088 .55 6.1 .588 3.261-1.579 6.382-4.84 6.97-3.261 .588-6.382-1.579-6.97-4.84C79.45 78.108 87.286 59.77 102.658 49.623c15.371-10.147 35.314-10.147 50.685 0 15.371 10.147 23.208 28.485 19.918 46.607-.512 2.853-2.991 4.932-5.89 4.94-.362 .001-.724-.032-1.08-.1-1.566-.282-2.956-1.175-3.864-2.483-.908-1.307-1.259-2.921-.976-4.487ZM65.75 135C45.283 107.891 44.712 70.653 64.339 42.93 83.967 15.207 119.279 3.374 151.648 13.672 184.017 23.97 206 54.032 206 88c.049 16.97-5.485 33.486-15.75 47-1.999 2.643-5.762 3.164-8.405 1.165-2.643-1.999-3.164-5.762-1.165-8.405C189.362 116.327 194.043 102.356 194 88 194 51.549 164.451 22 128 22 91.549 22 62 51.549 62 88c-.043 14.356 4.638 28.327 13.32 39.76 1.999 2.643 1.478 6.406-1.165 8.405-2.643 1.999-6.406 1.478-8.405-1.165Z"),
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
        return _cellTower!!
    }

private var _cellTower: ImageVector? = null
