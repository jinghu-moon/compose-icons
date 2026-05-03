package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.Rewind: ImageVector
    get() {
        if (_rewind != null) return _rewind!!
        _rewind = phosphorDuotoneIcon(
            name = "Rewind",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    group(
        groupAlpha = 0.20000000298023224f,
    ) {
        addPath(
            pathData = parseSvgPathData("M 224.000 71.850 L 224.000 184.150 C 223.975 187.030 222.387 189.668 219.854 191.039 C 217.322 192.409 214.244 192.295 211.820 190.740 L 123.630 134.590 C 121.372 133.160 120.003 130.673 120.003 128.000 C 120.003 125.327 121.372 122.840 123.630 121.410 L 211.820 65.260 C 214.244 63.705 217.322 63.591 219.854 64.961 C 222.387 66.332 223.975 68.970 224.000 71.850 ZM 107.820 65.260 L 19.630 121.410 C 17.372 122.840 16.003 125.327 16.003 128.000 C 16.003 130.673 17.372 133.160 19.630 134.590 L 107.820 190.740 C 110.244 192.295 113.322 192.409 115.854 191.039 C 118.387 189.668 119.975 187.030 120.000 184.150 L 120.000 71.850 C 119.975 68.970 118.387 66.332 115.854 64.961 C 113.322 63.591 110.244 63.705 107.820 65.260 Z"),
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
        pathData = parseSvgPathData("M 223.770 58.000 C 218.660 55.206 212.437 55.409 207.520 58.530 L 128.000 109.140 L 128.000 71.840 C 127.976 66.039 124.797 60.710 119.703 57.934 C 114.609 55.158 108.408 55.375 103.520 58.500 L 15.330 114.660 C 10.763 117.558 7.997 122.591 7.997 128.000 C 7.997 133.409 10.763 138.442 15.330 141.340 L 103.520 197.500 C 108.408 200.625 114.609 200.842 119.703 198.066 C 124.797 195.290 127.976 189.961 128.000 184.160 L 128.000 146.860 L 207.520 197.500 C 212.408 200.625 218.609 200.842 223.703 198.066 C 228.797 195.290 231.976 189.961 232.000 184.160 L 232.000 71.840 C 231.983 66.072 228.830 60.769 223.770 58.000 ZM 112.000 183.930 L 24.180 128.000 L 112.000 72.060 ZM 216.000 183.930 L 128.180 128.000 L 216.000 72.060 Z"),
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
        return _rewind!!
    }

private var _rewind: ImageVector? = null
