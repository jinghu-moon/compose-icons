package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.CodaLogo: ImageVector
    get() {
        if (_codaLogo != null) return _codaLogo!!
        _codaLogo = phosphorDuotoneIcon(
            name = "CodaLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    group(
        groupAlpha = 0.20000000298023224f,
    ) {
        addPath(
            pathData = parseSvgPathData("M 128.000 128.000 C 128.000 154.510 149.490 176.000 176.000 176.000 C 186.270 176.410 193.900 173.750 201.880 168.630 C 203.110 167.861 204.659 167.819 205.929 168.518 C 207.200 169.218 207.992 170.550 208.000 172.000 L 208.000 208.000 C 208.000 212.418 204.418 216.000 200.000 216.000 L 56.000 216.000 C 51.582 216.000 48.000 212.418 48.000 208.000 L 48.000 48.000 C 48.000 43.582 51.582 40.000 56.000 40.000 L 200.000 40.000 C 204.418 40.000 208.000 43.582 208.000 48.000 L 208.000 84.000 C 207.995 85.458 207.197 86.798 205.918 87.497 C 204.638 88.196 203.080 88.144 201.850 87.360 C 187.018 78.068 168.316 77.539 152.982 85.977 C 137.648 94.415 128.087 110.498 128.000 128.000 Z"),
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
        pathData = parseSvgPathData("M 176.000 88.000 C 183.612 87.932 191.085 90.049 197.530 94.100 C 201.223 96.464 205.911 96.626 209.757 94.522 C 213.604 92.419 215.998 88.384 216.000 84.000 L 216.000 48.000 C 216.000 39.163 208.837 32.000 200.000 32.000 L 56.000 32.000 C 47.163 32.000 40.000 39.163 40.000 48.000 L 40.000 208.000 C 40.000 216.837 47.163 224.000 56.000 224.000 L 200.000 224.000 C 208.837 224.000 216.000 216.837 216.000 208.000 L 216.000 172.000 C 215.994 167.624 213.607 163.597 209.769 161.493 C 205.931 159.389 201.253 159.541 197.560 161.890 C 190.310 166.540 184.150 168.300 176.320 168.000 L 176.000 168.000 C 153.909 168.000 136.000 150.091 136.000 128.000 C 136.000 105.909 153.909 88.000 176.000 88.000 ZM 120.000 128.000 C 120.038 158.850 144.991 183.873 175.840 184.000 C 184.200 184.414 192.524 182.654 200.000 178.890 L 200.000 208.000 L 56.000 208.000 L 56.000 48.000 L 200.000 48.000 L 200.000 77.230 C 182.613 69.161 162.316 70.492 146.132 80.763 C 129.948 91.033 120.102 108.832 120.000 128.000 Z"),
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
        return _codaLogo!!
    }

private var _codaLogo: ImageVector? = null
