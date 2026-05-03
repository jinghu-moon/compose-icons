package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.DropHalfBottom: ImageVector
    get() {
        if (_dropHalfBottom != null) return _dropHalfBottom!!
        _dropHalfBottom = phosphorRegularIcon(
            name = "DropHalfBottom",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 174.000 47.750 C 161.648 33.484 147.745 20.639 132.550 9.450 C 129.794 7.520 126.126 7.520 123.370 9.450 C 108.203 20.643 94.327 33.489 82.000 47.750 C 54.510 79.320 40.000 112.600 40.000 144.000 C 40.000 192.601 79.399 232.000 128.000 232.000 C 176.601 232.000 216.000 192.601 216.000 144.000 C 216.000 112.600 201.490 79.320 174.000 47.750 ZM 187.830 184.000 L 68.170 184.000 C 64.849 179.020 62.161 173.645 60.170 168.000 L 195.870 168.000 C 193.866 173.647 191.165 179.022 187.830 184.000 ZM 200.000 144.000 C 199.998 146.673 199.845 149.344 199.540 152.000 L 56.460 152.000 C 56.155 149.344 56.002 146.673 56.000 144.000 Q 56.000 140.000 56.360 136.000 L 199.640 136.000 Q 200.000 140.000 200.000 144.000 ZM 128.000 26.000 C 142.160 37.100 184.860 73.740 196.840 120.000 L 59.160 120.000 C 71.140 73.760 113.840 37.120 128.000 26.000 ZM 82.810 200.000 L 173.190 200.000 C 146.840 221.332 109.160 221.332 82.810 200.000 Z"),
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
