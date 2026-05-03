package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.CookingPot: ImageVector
    get() {
        if (_cookingPot != null) return _cookingPot!!
        _cookingPot = phosphorLightIcon(
            name = "CookingPot",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 90.000 48.000 L 90.000 16.000 C 90.000 12.686 92.686 10.000 96.000 10.000 C 99.314 10.000 102.000 12.686 102.000 16.000 L 102.000 48.000 C 102.000 51.314 99.314 54.000 96.000 54.000 C 92.686 54.000 90.000 51.314 90.000 48.000 ZM 128.000 54.000 C 131.314 54.000 134.000 51.314 134.000 48.000 L 134.000 16.000 C 134.000 12.686 131.314 10.000 128.000 10.000 C 124.686 10.000 122.000 12.686 122.000 16.000 L 122.000 48.000 C 122.000 51.314 124.686 54.000 128.000 54.000 ZM 160.000 54.000 C 163.314 54.000 166.000 51.314 166.000 48.000 L 166.000 16.000 C 166.000 12.686 163.314 10.000 160.000 10.000 C 156.686 10.000 154.000 12.686 154.000 16.000 L 154.000 48.000 C 154.000 51.314 156.686 54.000 160.000 54.000 ZM 251.600 100.800 L 222.000 123.000 L 222.000 184.000 C 222.000 200.569 208.569 214.000 192.000 214.000 L 64.000 214.000 C 47.431 214.000 34.000 200.569 34.000 184.000 L 34.000 123.000 L 4.400 100.800 C 1.749 98.812 1.212 95.051 3.200 92.400 C 5.188 89.749 8.949 89.212 11.600 91.200 L 34.000 108.000 L 34.000 80.000 C 34.000 76.686 36.686 74.000 40.000 74.000 L 216.000 74.000 C 219.314 74.000 222.000 76.686 222.000 80.000 L 222.000 108.000 L 244.400 91.200 C 247.051 89.212 250.812 89.749 252.800 92.400 C 254.788 95.051 254.251 98.812 251.600 100.800 ZM 210.000 86.000 L 46.000 86.000 L 46.000 184.000 C 46.000 193.941 54.059 202.000 64.000 202.000 L 192.000 202.000 C 201.941 202.000 210.000 193.941 210.000 184.000 Z"),
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
        return _cookingPot!!
    }

private var _cookingPot: ImageVector? = null
