package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.CoatHanger: ImageVector
    get() {
        if (_coatHanger != null) return _coatHanger!!
        _coatHanger = phosphorBoldIcon(
            name = "CoatHanger",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 244.000 168.000 L 148.000 96.000 L 167.200 81.600 C 170.222 79.334 172.000 75.777 172.000 72.000 C 172.011 48.757 153.943 29.515 130.745 28.065 C 107.548 26.615 87.224 43.457 84.340 66.520 C 83.512 73.098 88.172 79.102 94.750 79.930 C 101.328 80.758 107.332 76.098 108.160 69.520 C 109.354 60.085 117.028 52.796 126.512 52.087 C 135.996 51.379 144.667 57.447 147.250 66.600 L 121.000 86.240 C 120.850 86.340 120.710 86.450 120.570 86.560 L 12.000 168.000 C 5.113 173.165 2.304 182.158 5.026 190.325 C 7.749 198.491 15.391 204.000 24.000 204.000 L 232.000 204.000 C 240.609 204.000 248.251 198.491 250.974 190.325 C 253.696 182.158 250.887 173.165 244.000 168.000 ZM 36.000 180.000 L 128.000 111.000 L 220.000 180.000 Z"),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color(0xFF000000)),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
            )
        }
        return _coatHanger!!
    }

private var _coatHanger: ImageVector? = null
