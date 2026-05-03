package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.Pulse: ImageVector
    get() {
        if (_pulse != null) return _pulse!!
        _pulse = phosphorDuotoneIcon(
            name = "Pulse",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    group(
        groupAlpha = 0.20000000298023224f,
    ) {
        addPath(
            pathData = parseSvgPathData("M 96.000 40.000 L 129.520 128.000 L 56.000 128.000 ZM 200.000 128.000 L 129.520 128.000 L 160.000 208.000 Z"),
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
        pathData = parseSvgPathData("M 240.000 128.000 C 240.000 132.418 236.418 136.000 232.000 136.000 L 204.940 136.000 L 167.160 211.580 C 165.803 214.291 163.031 216.002 160.000 216.000 L 159.600 216.000 C 156.429 215.843 153.651 213.826 152.520 210.860 L 95.350 60.760 L 63.280 131.310 C 61.982 134.165 59.136 135.999 56.000 136.000 L 24.000 136.000 C 19.582 136.000 16.000 132.418 16.000 128.000 C 16.000 123.582 19.582 120.000 24.000 120.000 L 50.850 120.000 L 88.720 36.690 C 90.055 33.750 93.026 31.901 96.253 32.002 C 99.480 32.102 102.331 34.133 103.480 37.150 L 160.990 188.150 L 192.840 124.440 C 194.191 121.721 196.964 120.002 200.000 120.000 L 232.000 120.000 C 236.418 120.000 240.000 123.582 240.000 128.000 Z"),
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
        return _pulse!!
    }

private var _pulse: ImageVector? = null
