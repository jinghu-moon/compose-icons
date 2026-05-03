package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.ThermometerSimple: ImageVector
    get() {
        if (_thermometerSimple != null) return _thermometerSimple!!
        _thermometerSimple = phosphorRegularIcon(
            name = "ThermometerSimple",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 136.000 153.000 L 136.000 88.000 C 136.000 83.582 132.418 80.000 128.000 80.000 C 123.582 80.000 120.000 83.582 120.000 88.000 L 120.000 153.000 C 104.398 157.029 94.225 172.030 96.255 188.016 C 98.285 204.002 111.886 215.984 128.000 215.984 C 144.114 215.984 157.714 204.002 159.745 188.016 C 161.775 172.030 151.602 157.029 136.000 153.000 ZM 128.000 200.000 C 119.163 200.000 112.000 192.837 112.000 184.000 C 112.000 175.163 119.163 168.000 128.000 168.000 C 136.837 168.000 144.000 175.163 144.000 184.000 C 144.000 192.837 136.837 200.000 128.000 200.000 ZM 168.000 134.000 L 168.000 48.000 C 168.000 25.909 150.091 8.000 128.000 8.000 C 105.909 8.000 88.000 25.909 88.000 48.000 L 88.000 134.000 C 66.786 150.985 58.612 179.514 67.612 205.156 C 76.612 230.798 100.825 247.960 128.000 247.960 C 155.175 247.960 179.388 230.798 188.388 205.156 C 197.388 179.514 189.214 150.985 168.000 134.000 ZM 128.000 232.000 C 107.024 232.002 88.476 218.383 82.197 198.369 C 75.918 178.354 83.362 156.581 100.580 144.600 C 102.735 143.095 104.013 140.628 104.000 138.000 L 104.000 48.000 C 104.000 34.745 114.745 24.000 128.000 24.000 C 141.255 24.000 152.000 34.745 152.000 48.000 L 152.000 138.000 C 152.000 140.614 153.277 143.063 155.420 144.560 C 172.675 156.529 180.146 178.325 173.862 198.363 C 167.579 218.400 149.000 232.027 128.000 232.000 Z"),
        pathFillType = PathFillType.NonZero,
        fill = SolidColor(Color(0xFF000000)),
        fillAlpha = 1.0f,
        stroke = null,
        strokeAlpha = 1.0f,
        strokeLineWidth = 0.0f,
        strokeLineCap = StrokeCap.Butt,
        strokeLineJoin = StrokeJoin.Miter,
    )
        }
        return _thermometerSimple!!
    }

private var _thermometerSimple: ImageVector? = null
