package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Asclepius: ImageVector
    get() {
        if (_asclepius != null) return _asclepius!!
        _asclepius = phosphorLightIcon(
            name = "Asclepius",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 214.000 79.000 L 214.000 80.000 C 214.000 100.987 196.987 118.000 176.000 118.000 L 134.000 118.000 L 134.000 202.000 L 144.000 202.000 C 151.465 202.002 158.156 197.396 160.819 190.422 C 163.483 183.449 161.565 175.555 156.000 170.580 C 154.345 169.166 153.585 166.967 154.015 164.834 C 154.445 162.700 155.996 160.966 158.069 160.303 C 160.142 159.640 162.412 160.152 164.000 161.640 C 173.271 169.932 176.463 183.085 172.024 194.705 C 167.586 206.324 156.438 214.000 144.000 214.000 L 134.000 214.000 L 134.000 232.000 C 134.000 235.314 131.314 238.000 128.000 238.000 C 124.686 238.000 122.000 235.314 122.000 232.000 L 122.000 214.000 L 96.000 214.000 C 92.686 214.000 90.000 211.314 90.000 208.000 C 90.000 204.686 92.686 202.000 96.000 202.000 L 122.000 202.000 L 122.000 118.000 L 96.000 118.000 C 86.059 118.000 78.000 126.059 78.000 136.000 C 78.000 145.941 86.059 154.000 96.000 154.000 C 99.314 154.000 102.000 156.686 102.000 160.000 C 102.000 163.314 99.314 166.000 96.000 166.000 C 79.431 166.000 66.000 152.569 66.000 136.000 C 66.000 119.431 79.431 106.000 96.000 106.000 L 122.000 106.000 L 122.000 24.000 C 122.000 20.686 124.686 18.000 128.000 18.000 C 131.314 18.000 134.000 20.686 134.000 24.000 L 134.000 106.000 L 176.000 106.000 C 190.359 106.000 202.000 94.359 202.000 80.000 L 202.000 79.000 C 202.000 65.193 190.807 54.000 177.000 54.000 L 160.000 54.000 C 156.686 54.000 154.000 51.314 154.000 48.000 C 154.000 44.686 156.686 42.000 160.000 42.000 L 177.000 42.000 C 197.435 42.000 214.000 58.565 214.000 79.000 ZM 56.000 94.000 L 32.000 94.000 C 28.686 94.000 26.000 91.314 26.000 88.000 L 26.000 80.000 C 26.000 59.013 43.013 42.000 64.000 42.000 L 96.000 42.000 C 99.314 42.000 102.000 44.686 102.000 48.000 C 102.000 51.314 99.314 54.000 96.000 54.000 L 94.000 54.000 L 94.000 56.000 C 94.000 76.987 76.987 94.000 56.000 94.000 ZM 82.000 54.000 L 64.000 54.000 C 49.641 54.000 38.000 65.641 38.000 80.000 L 38.000 82.000 L 56.000 82.000 C 70.359 82.000 82.000 70.359 82.000 56.000 Z"),
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
        return _asclepius!!
    }

private var _asclepius: ImageVector? = null
