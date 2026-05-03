package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Percent: ImageVector
    get() {
        if (_percent != null) return _percent!!
        _percent = phosphorThinIcon(
            name = "Percent",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 202.830 58.810 L 58.830 202.810 C 57.267 204.373 54.733 204.373 53.170 202.810 C 51.607 201.247 51.607 198.713 53.170 197.150 L 197.170 53.150 C 198.170 52.095 199.664 51.666 201.071 52.029 C 202.479 52.392 203.578 53.490 203.944 54.897 C 204.309 56.304 203.883 57.798 202.830 58.800 ZM 53.370 98.620 C 42.579 87.822 40.918 70.905 49.403 58.214 C 57.888 45.524 74.155 40.593 88.258 46.439 C 102.360 52.284 110.370 67.277 107.389 82.249 C 104.408 97.221 91.266 108.002 76.000 108.000 C 67.507 108.019 59.359 104.641 53.370 98.620 ZM 52.000 76.000 C 52.028 87.448 60.138 97.283 71.371 99.491 C 82.604 101.698 93.833 95.665 98.192 85.079 C 102.551 74.493 98.826 62.302 89.295 55.960 C 79.764 49.618 67.081 50.891 59.000 59.000 C 54.489 63.504 51.968 69.626 52.000 76.000 ZM 212.000 180.000 C 211.998 195.266 201.212 208.405 186.238 211.381 C 171.265 214.357 156.274 206.342 150.434 192.237 C 144.594 178.132 149.531 161.865 162.225 153.386 C 174.920 144.906 191.836 146.574 202.630 157.370 C 208.648 163.361 212.021 171.509 212.000 180.000 ZM 204.000 180.000 C 203.972 168.552 195.862 158.717 184.629 156.509 C 173.396 154.302 162.167 160.335 157.808 170.921 C 153.449 181.507 157.174 193.698 166.705 200.040 C 176.236 206.382 188.919 205.109 197.000 197.000 C 201.508 192.494 204.028 186.374 204.000 180.000 Z"),
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
        return _percent!!
    }

private var _percent: ImageVector? = null
