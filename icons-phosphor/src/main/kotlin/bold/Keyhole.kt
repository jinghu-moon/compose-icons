package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Keyhole: ImageVector
    get() {
        if (_keyhole != null) return _keyhole!!
        _keyhole = phosphorBoldIcon(
            name = "Keyhole",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 128.000 20.000 C 68.353 20.000 20.000 68.353 20.000 128.000 C 20.000 187.647 68.353 236.000 128.000 236.000 C 187.647 236.000 236.000 187.647 236.000 128.000 C 235.934 68.381 187.619 20.066 128.000 20.000 ZM 128.000 212.000 C 81.608 212.000 44.000 174.392 44.000 128.000 C 44.000 81.608 81.608 44.000 128.000 44.000 C 174.392 44.000 212.000 81.608 212.000 128.000 C 211.950 174.371 174.371 211.950 128.000 212.000 ZM 128.000 68.000 C 110.868 67.996 95.291 77.936 88.078 93.475 C 80.866 109.015 83.328 127.328 94.390 140.410 L 84.530 172.470 C 83.410 176.110 84.084 180.066 86.346 183.129 C 88.609 186.193 92.192 188.000 96.000 188.000 L 160.000 188.000 C 163.809 188.000 167.391 186.193 169.654 183.129 C 171.916 180.066 172.590 176.110 171.470 172.470 L 161.610 140.410 C 172.672 127.328 175.134 109.015 167.922 93.475 C 160.709 77.936 145.132 67.996 128.000 68.000 ZM 136.530 140.510 L 143.750 164.000 L 112.250 164.000 L 119.470 140.510 C 120.908 135.800 119.322 130.689 115.470 127.620 C 108.841 122.312 106.286 113.397 109.099 105.384 C 111.911 97.371 119.478 92.008 127.970 92.008 C 136.462 92.008 144.029 97.371 146.841 105.384 C 149.654 113.397 147.099 122.312 140.470 127.620 C 136.640 130.704 135.078 135.812 136.530 140.510 Z"),
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
        return _keyhole!!
    }

private var _keyhole: ImageVector? = null
