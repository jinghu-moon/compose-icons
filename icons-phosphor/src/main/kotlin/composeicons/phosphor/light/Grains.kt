package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Grains: ImageVector
    get() {
        if (_grains != null) return _grains!!
        _grains = phosphorLightIcon(
            name = "Grains",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M208 58c-11.27-.01-22.431 2.21-32.84 6.53C161.45 34.31 132 19.3 130.68 18.63c-1.687-.842-3.673-.842-5.36 0-1.33 .67-30.77 15.68-44.48 45.9C70.431 60.21 59.27 57.991 48 58c-3.314 0-6 2.686-6 6v80c0 47.496 38.504 86 86 86 47.496 0 86-38.504 86-86v-80c0-3.314-2.686-6-6-6ZM122 217.76C83.605 214.589 54.046 182.525 54 144v-17.76c38.395 3.171 67.954 35.235 68 73.76ZM122 156.25c-14.402-24.31-39.815-40.006-68-42v-44c38.388 3.176 67.944 35.23 68 73.75ZM91.58 69.91C101.24 48.31 120.85 35.13 128 30.91c7.16 4.25 26.76 17.43 36.41 39C147.884 79.674 135.075 94.657 128 112.5 120.924 94.654 108.111 79.67 91.58 69.91ZM202 144c-.046 38.525-29.605 70.589-68 73.76v-17.76c.046-38.525 29.605-70.589 68-73.76ZM202 114.23c-28.185 1.994-53.598 17.69-68 42v-12.23c.051-38.523 29.608-70.584 68-73.76Z"),
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
        return _grains!!
    }

private var _grains: ImageVector? = null
