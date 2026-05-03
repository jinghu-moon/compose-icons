package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.Cursor: ImageVector
    get() {
        if (_cursor != null) return _cursor!!
        _cursor = phosphorDuotoneIcon(
            name = "Cursor",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    group(
        groupAlpha = 0.20000000298023224f,
    ) {
        addPath(
            pathData = parseSvgPathData("M 213.660 201.000 L 201.000 213.660 C 197.876 216.782 192.814 216.782 189.690 213.660 L 138.380 162.350 C 136.509 160.475 133.832 159.647 131.229 160.140 C 128.626 160.632 126.436 162.381 125.380 164.810 L 107.560 211.220 C 106.205 214.203 103.167 216.059 99.894 215.902 C 96.621 215.746 93.774 213.609 92.710 210.510 L 40.410 50.440 C 39.538 47.607 40.303 44.525 42.399 42.429 C 44.495 40.333 47.577 39.568 50.410 40.440 L 210.510 92.680 C 213.609 93.744 215.746 96.591 215.902 99.864 C 216.059 103.137 214.203 106.175 211.220 107.530 L 164.810 125.350 C 162.381 126.406 160.632 128.596 160.140 131.199 C 159.647 133.802 160.475 136.479 162.350 138.350 L 213.660 189.660 C 215.168 191.161 216.016 193.202 216.016 195.330 C 216.016 197.458 215.168 199.499 213.660 201.000 Z"),
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
        pathData = parseSvgPathData("M 168.000 132.690 L 214.080 115.000 L 214.410 114.870 C 220.446 112.193 224.218 106.083 223.906 99.487 C 223.594 92.891 219.262 87.165 213.000 85.070 L 52.920 32.800 C 47.208 30.931 40.930 32.431 36.680 36.680 C 32.431 40.930 30.931 47.208 32.800 52.920 L 85.070 213.000 C 87.088 219.328 92.844 223.722 99.480 224.000 L 100.260 224.000 C 106.612 224.022 112.364 220.247 114.870 214.410 L 115.000 214.080 L 132.690 168.000 L 184.000 219.310 C 187.001 222.311 191.071 223.998 195.315 223.998 C 199.559 223.998 203.629 222.311 206.630 219.310 L 219.310 206.630 C 222.311 203.629 223.998 199.559 223.998 195.315 C 223.998 191.071 222.311 187.001 219.310 184.000 ZM 195.310 208.000 L 144.000 156.690 C 140.257 152.940 134.901 151.286 129.695 152.273 C 124.490 153.260 120.110 156.760 118.000 161.620 C 118.000 161.730 117.910 161.840 117.870 161.940 L 100.220 207.940 L 48.000 48.000 L 207.850 100.200 L 161.900 117.840 L 161.580 117.970 C 156.720 120.080 153.220 124.460 152.233 129.665 C 151.246 134.871 152.900 140.227 156.650 143.970 L 156.650 143.970 L 208.000 195.310 Z"),
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
        return _cursor!!
    }

private var _cursor: ImageVector? = null
