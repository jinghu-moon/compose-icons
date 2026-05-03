package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.Boules: ImageVector
    get() {
        if (_boules != null) return _boules!!
        _boules = phosphorDuotoneIcon(
            name = "Boules",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    group(
        groupAlpha = 0.20000000298023224f,
    ) {
        addPath(
            pathData = parseSvgPathData("M 215.520 88.480 L 88.520 215.480 C 67.233 205.824 50.176 188.767 40.520 167.480 L 167.520 40.480 C 188.807 50.136 205.864 67.193 215.520 88.480 Z"),
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
        pathData = parseSvgPathData("M 128.000 24.000 C 70.562 24.000 24.000 70.562 24.000 128.000 C 24.000 185.438 70.562 232.000 128.000 232.000 C 185.438 232.000 232.000 185.438 232.000 128.000 C 231.939 70.588 185.412 24.061 128.000 24.000 ZM 184.280 60.410 L 60.400 184.280 C 56.487 179.586 53.072 174.499 50.210 169.100 L 169.100 50.210 C 174.501 53.072 179.589 56.491 184.280 60.410 ZM 195.590 71.720 C 199.509 76.411 202.928 81.499 205.790 86.900 L 86.900 205.790 C 81.499 202.928 76.411 199.509 71.720 195.590 ZM 128.000 40.000 C 136.482 39.997 144.920 41.223 153.050 43.640 L 43.640 153.050 C 35.734 126.425 40.861 97.630 57.472 75.371 C 74.082 53.111 100.226 40.000 128.000 40.000 ZM 128.000 216.000 C 119.535 215.998 111.114 214.772 103.000 212.360 L 212.360 103.000 C 220.247 129.618 215.111 158.398 198.502 180.644 C 181.894 202.891 155.762 215.996 128.000 216.000 Z"),
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
        return _boules!!
    }

private var _boules: ImageVector? = null
