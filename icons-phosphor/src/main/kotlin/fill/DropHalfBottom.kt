package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.DropHalfBottom: ImageVector
    get() {
        if (_dropHalfBottom != null) return _dropHalfBottom!!
        _dropHalfBottom = phosphorFillIcon(
            name = "DropHalfBottom",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 174.000 47.750 C 161.648 33.484 147.745 20.639 132.550 9.450 C 129.794 7.520 126.126 7.520 123.370 9.450 C 108.203 20.643 94.327 33.489 82.000 47.750 C 54.510 79.320 40.000 112.600 40.000 144.000 C 40.000 192.601 79.399 232.000 128.000 232.000 C 176.601 232.000 216.000 192.601 216.000 144.000 C 216.000 112.600 201.490 79.320 174.000 47.750 ZM 128.000 26.000 C 142.160 37.100 184.860 73.740 196.840 120.000 L 59.160 120.000 C 71.140 73.760 113.840 37.120 128.000 26.000 Z"),
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
        return _dropHalfBottom!!
    }

private var _dropHalfBottom: ImageVector? = null
