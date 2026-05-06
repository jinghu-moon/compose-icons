package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Eye: ImageVector
    get() {
        if (_eye != null) return _eye!!
        _eye = phosphorLightIcon(
            name = "Eye",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M245.48 125.57c-.34-.78-8.66-19.23-27.24-37.81C201 70.54 171.38 50 128 50 84.62 50 55 70.54 37.76 87.76c-18.58 18.58-26.9 37-27.24 37.81-.691 1.553-.691 3.327 0 4.88 .34 .77 8.66 19.22 27.24 37.8C55 185.47 84.62 206 128 206c43.38 0 73-20.53 90.24-37.75 18.58-18.58 26.9-37 27.24-37.8 .691-1.553 .691-3.327 0-4.88ZM128 194C96.62 194 69.22 182.58 46.55 160.07 37.047 150.625 29.005 139.817 22.69 128 29.003 116.185 37.045 105.379 46.55 95.94 69.22 73.42 96.62 62 128 62c31.38 0 58.78 11.42 81.45 33.94 9.505 9.439 17.547 20.245 23.86 32.06C226.94 140.21 195 194 128 194ZM128 82c-25.405 0-46 20.595-46 46 0 25.405 20.595 46 46 46 25.405 0 46-20.595 46-46C173.967 102.609 153.391 82.033 128 82ZM128 162C109.222 162 94 146.778 94 128c0-18.778 15.222-34 34-34 18.778 0 34 15.222 34 34 0 18.778-15.222 34-34 34Z"),
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
        return _eye!!
    }

private var _eye: ImageVector? = null
