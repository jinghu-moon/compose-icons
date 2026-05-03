package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.HeartHalf: ImageVector
    get() {
        if (_heartHalf != null) return _heartHalf!!
        _heartHalf = phosphorDuotoneIcon(
            name = "HeartHalf",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    group(
        groupAlpha = 0.20000000298023224f,
    ) {
        addPath(
            pathData = parseSvgPathData("M 128.000 80.000 L 128.000 224.000 C 128.000 224.000 24.000 168.000 24.000 102.000 C 24.000 72.177 48.177 48.000 78.000 48.000 C 100.590 48.000 119.940 60.310 128.000 80.000 Z"),
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
        pathData = parseSvgPathData("M 178.000 40.000 C 157.350 40.000 139.270 48.880 128.000 63.890 C 116.730 48.880 98.650 40.000 78.000 40.000 C 43.774 40.039 16.039 67.774 16.000 102.000 C 16.000 172.000 119.790 228.670 124.210 231.000 C 126.576 232.273 129.424 232.273 131.790 231.000 C 136.210 228.670 240.000 172.000 240.000 102.000 C 239.961 67.774 212.226 40.039 178.000 40.000 ZM 32.000 102.000 C 32.033 76.609 52.609 56.033 78.000 56.000 C 96.910 56.000 112.860 65.790 120.000 81.650 L 120.000 210.000 C 93.590 193.440 32.000 149.780 32.000 102.000 ZM 136.000 210.000 L 136.000 81.650 C 143.140 65.790 159.090 56.000 178.000 56.000 C 203.391 56.033 223.967 76.609 224.000 102.000 C 224.000 149.710 162.420 193.410 136.000 210.000 Z"),
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
        return _heartHalf!!
    }

private var _heartHalf: ImageVector? = null
