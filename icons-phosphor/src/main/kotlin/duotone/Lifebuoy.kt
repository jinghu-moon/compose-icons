package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.Lifebuoy: ImageVector
    get() {
        if (_lifebuoy != null) return _lifebuoy!!
        _lifebuoy = phosphorDuotoneIcon(
            name = "Lifebuoy",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    group(
        groupAlpha = 0.20000000298023224f,
    ) {
        addPath(
            pathData = parseSvgPathData("M 195.880 195.880 L 156.280 156.280 C 171.895 140.660 171.895 115.340 156.280 99.720 L 195.880 60.120 C 233.367 97.610 233.367 158.390 195.880 195.880 ZM 60.120 60.120 C 22.633 97.610 22.633 158.390 60.120 195.880 L 99.720 156.280 C 84.105 140.660 84.105 115.340 99.720 99.720 Z"),
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
        pathData = parseSvgPathData("M 128.000 24.000 C 70.562 24.000 24.000 70.562 24.000 128.000 C 24.000 185.438 70.562 232.000 128.000 232.000 C 185.438 232.000 232.000 185.438 232.000 128.000 C 231.939 70.588 185.412 24.061 128.000 24.000 ZM 167.100 155.790 C 178.966 139.163 178.966 116.837 167.100 100.210 L 195.600 71.720 C 222.801 104.310 222.801 151.690 195.600 184.280 ZM 96.000 128.000 C 96.000 110.327 110.327 96.000 128.000 96.000 C 145.673 96.000 160.000 110.327 160.000 128.000 C 160.000 145.673 145.673 160.000 128.000 160.000 C 110.327 160.000 96.000 145.673 96.000 128.000 ZM 184.280 60.400 L 155.790 88.900 C 139.163 77.034 116.837 77.034 100.210 88.900 L 71.720 60.400 C 104.310 33.199 151.690 33.199 184.280 60.400 ZM 60.400 71.720 L 88.900 100.210 C 77.034 116.837 77.034 139.163 88.900 155.790 L 60.400 184.280 C 33.199 151.690 33.199 104.310 60.400 71.720 ZM 71.720 195.600 L 100.210 167.100 C 116.837 178.966 139.163 178.966 155.790 167.100 L 184.280 195.600 C 151.690 222.801 104.310 222.801 71.720 195.600 Z"),
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
        return _lifebuoy!!
    }

private var _lifebuoy: ImageVector? = null
