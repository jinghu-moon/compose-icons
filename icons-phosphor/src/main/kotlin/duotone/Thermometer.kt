package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.Thermometer: ImageVector
    get() {
        if (_thermometer != null) return _thermometer!!
        _thermometer = phosphorDuotoneIcon(
            name = "Thermometer",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    group(
        groupAlpha = 0.20000000298023224f,
    ) {
        addPath(
            pathData = parseSvgPathData("M 152.000 138.000 L 152.000 48.000 C 152.000 30.327 137.673 16.000 120.000 16.000 C 102.327 16.000 88.000 30.327 88.000 48.000 L 88.000 138.000 C 67.920 151.982 59.243 177.381 66.570 200.726 C 73.897 224.071 95.532 239.956 120.000 239.956 C 144.468 239.956 166.103 224.071 173.430 200.726 C 180.757 177.381 172.080 151.982 152.000 138.000 ZM 120.000 208.000 C 106.745 208.000 96.000 197.255 96.000 184.000 C 96.000 170.745 106.745 160.000 120.000 160.000 C 133.255 160.000 144.000 170.745 144.000 184.000 C 144.000 197.255 133.255 208.000 120.000 208.000 Z"),
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
    addPath(
        pathData = parseSvgPathData("M 212.000 56.000 C 196.536 56.000 184.000 68.536 184.000 84.000 C 184.000 99.464 196.536 112.000 212.000 112.000 C 227.464 112.000 240.000 99.464 240.000 84.000 C 240.000 68.536 227.464 56.000 212.000 56.000 ZM 212.000 96.000 C 205.373 96.000 200.000 90.627 200.000 84.000 C 200.000 77.373 205.373 72.000 212.000 72.000 C 218.627 72.000 224.000 77.373 224.000 84.000 C 224.000 90.627 218.627 96.000 212.000 96.000 ZM 128.000 153.000 L 128.000 88.000 C 128.000 83.582 124.418 80.000 120.000 80.000 C 115.582 80.000 112.000 83.582 112.000 88.000 L 112.000 153.000 C 96.398 157.029 86.225 172.030 88.255 188.016 C 90.285 204.002 103.886 215.984 120.000 215.984 C 136.114 215.984 149.714 204.002 151.745 188.016 C 153.775 172.030 143.602 157.029 128.000 153.000 ZM 120.000 200.000 C 111.163 200.000 104.000 192.837 104.000 184.000 C 104.000 175.163 111.163 168.000 120.000 168.000 C 128.837 168.000 136.000 175.163 136.000 184.000 C 136.000 192.837 128.837 200.000 120.000 200.000 ZM 160.000 134.000 L 160.000 48.000 C 160.000 25.909 142.091 8.000 120.000 8.000 C 97.909 8.000 80.000 25.909 80.000 48.000 L 80.000 134.000 C 58.786 150.985 50.612 179.514 59.612 205.156 C 68.612 230.798 92.825 247.960 120.000 247.960 C 147.175 247.960 171.388 230.798 180.388 205.156 C 189.388 179.514 181.214 150.985 160.000 134.000 ZM 120.000 232.000 C 99.024 232.002 80.476 218.383 74.197 198.369 C 67.918 178.354 75.362 156.581 92.580 144.600 C 94.735 143.095 96.013 140.628 96.000 138.000 L 96.000 48.000 C 96.000 34.745 106.745 24.000 120.000 24.000 C 133.255 24.000 144.000 34.745 144.000 48.000 L 144.000 138.000 C 144.000 140.614 145.277 143.063 147.420 144.560 C 164.675 156.529 172.146 178.325 165.862 198.363 C 159.579 218.400 141.000 232.027 120.000 232.000 Z"),
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
        return _thermometer!!
    }

private var _thermometer: ImageVector? = null
