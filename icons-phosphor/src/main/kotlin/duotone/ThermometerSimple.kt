package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.ThermometerSimple: ImageVector
    get() {
        if (_thermometerSimple != null) return _thermometerSimple!!
        _thermometerSimple = phosphorDuotoneIcon(
            name = "ThermometerSimple",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            group(
                groupAlpha = 0.2f,
            ) {
                addPath(
                    pathData = parseSvgPathData("M 160.000 138.000 L 160.000 48.000 C 160.000 30.327 145.673 16.000 128.000 16.000 C 110.327 16.000 96.000 30.327 96.000 48.000 L 96.000 138.000 C 75.920 151.982 67.243 177.381 74.570 200.726 C 81.897 224.071 103.532 239.956 128.000 239.956 C 152.468 239.956 174.103 224.071 181.430 200.726 C 188.757 177.381 180.080 151.982 160.000 138.000 ZM 128.000 208.000 C 114.745 208.000 104.000 197.255 104.000 184.000 C 104.000 170.745 114.745 160.000 128.000 160.000 C 141.255 160.000 152.000 170.745 152.000 184.000 C 152.000 197.255 141.255 208.000 128.000 208.000 Z"),
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
            addPath(
                pathData = parseSvgPathData("M 136.000 153.000 L 136.000 88.000 C 136.000 83.582 132.418 80.000 128.000 80.000 C 123.582 80.000 120.000 83.582 120.000 88.000 L 120.000 153.000 C 104.398 157.029 94.225 172.030 96.255 188.016 C 98.285 204.002 111.886 215.984 128.000 215.984 C 144.114 215.984 157.714 204.002 159.745 188.016 C 161.775 172.030 151.602 157.029 136.000 153.000 ZM 128.000 200.000 C 119.163 200.000 112.000 192.837 112.000 184.000 C 112.000 175.163 119.163 168.000 128.000 168.000 C 136.837 168.000 144.000 175.163 144.000 184.000 C 144.000 192.837 136.837 200.000 128.000 200.000 ZM 168.000 134.000 L 168.000 48.000 C 168.000 25.909 150.091 8.000 128.000 8.000 C 105.909 8.000 88.000 25.909 88.000 48.000 L 88.000 134.000 C 66.786 150.985 58.612 179.514 67.612 205.156 C 76.612 230.798 100.825 247.960 128.000 247.960 C 155.175 247.960 179.388 230.798 188.388 205.156 C 197.388 179.514 189.214 150.985 168.000 134.000 ZM 128.000 232.000 C 107.024 232.002 88.476 218.383 82.197 198.369 C 75.918 178.354 83.362 156.581 100.580 144.600 C 102.735 143.095 104.013 140.628 104.000 138.000 L 104.000 48.000 C 104.000 34.745 114.745 24.000 128.000 24.000 C 141.255 24.000 152.000 34.745 152.000 48.000 L 152.000 138.000 C 152.000 140.614 153.277 143.063 155.420 144.560 C 172.675 156.529 180.146 178.325 173.862 198.363 C 167.579 218.400 149.000 232.027 128.000 232.000 Z"),
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
        return _thermometerSimple!!
    }

private var _thermometerSimple: ImageVector? = null
