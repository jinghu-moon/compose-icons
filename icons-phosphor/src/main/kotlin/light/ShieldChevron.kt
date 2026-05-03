package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.ShieldChevron: ImageVector
    get() {
        if (_shieldChevron != null) return _shieldChevron!!
        _shieldChevron = phosphorLightIcon(
            name = "ShieldChevron",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 208.000 42.000 L 48.000 42.000 C 40.268 42.000 34.000 48.268 34.000 56.000 L 34.000 112.000 C 34.000 163.940 59.120 195.400 80.200 212.640 C 102.930 231.240 125.470 237.530 126.420 237.790 C 127.454 238.072 128.546 238.072 129.580 237.790 C 130.530 237.530 153.070 231.240 175.800 212.640 C 196.880 195.400 222.000 163.940 222.000 112.000 L 222.000 56.000 C 222.000 48.268 215.732 42.000 208.000 42.000 ZM 168.560 203.060 C 156.496 212.967 142.761 220.640 128.000 225.720 C 113.237 220.645 99.501 212.971 87.440 203.060 C 77.279 194.797 68.630 184.833 61.880 173.610 L 128.000 127.320 L 194.120 173.610 C 187.370 184.833 178.721 194.797 168.560 203.060 ZM 210.000 112.000 C 210.000 130.750 206.560 147.750 199.720 162.880 L 131.440 115.080 C 129.374 113.635 126.626 113.635 124.560 115.080 L 56.280 162.880 C 49.440 147.750 46.000 130.750 46.000 112.000 L 46.000 56.000 C 46.000 54.895 46.895 54.000 48.000 54.000 L 208.000 54.000 C 209.105 54.000 210.000 54.895 210.000 56.000 Z"),
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
        return _shieldChevron!!
    }

private var _shieldChevron: ImageVector? = null
