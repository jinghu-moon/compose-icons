package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.NumberNine: ImageVector
    get() {
        if (_numberNine != null) return _numberNine!!
        _numberNine = phosphorThinIcon(
            name = "NumberNine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 128.000 44.000 C 106.312 43.994 86.898 57.450 79.290 77.760 C 71.682 98.070 77.479 120.969 93.834 135.213 C 110.189 149.457 133.667 152.054 152.740 141.730 L 116.510 206.000 C 115.428 207.933 116.117 210.378 118.050 211.460 C 119.983 212.542 122.428 211.853 123.510 209.920 L 173.000 122.000 C 182.286 105.916 182.289 86.101 173.008 70.014 C 163.728 53.928 146.572 44.012 128.000 44.000 ZM 128.000 140.000 C 103.699 140.000 84.000 120.301 84.000 96.000 C 84.000 71.699 103.699 52.000 128.000 52.000 C 152.301 52.000 172.000 71.699 172.000 96.000 C 171.972 120.289 152.289 139.972 128.000 140.000 Z"),
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
        return _numberNine!!
    }

private var _numberNine: ImageVector? = null
