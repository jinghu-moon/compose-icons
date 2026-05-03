package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.DropHalf: ImageVector
    get() {
        if (_dropHalf != null) return _dropHalf!!
        _dropHalf = phosphorRegularIcon(
            name = "DropHalf",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 174.000 47.750 C 161.648 33.484 147.745 20.639 132.550 9.450 C 129.794 7.520 126.126 7.520 123.370 9.450 C 108.203 20.643 94.327 33.489 82.000 47.750 C 54.510 79.320 40.000 112.600 40.000 144.000 C 40.000 192.601 79.399 232.000 128.000 232.000 C 176.601 232.000 216.000 192.601 216.000 144.000 C 216.000 112.600 201.490 79.320 174.000 47.750 ZM 200.000 144.000 C 199.998 146.673 199.845 149.344 199.540 152.000 L 136.000 152.000 L 136.000 136.000 L 199.640 136.000 Q 200.000 140.000 200.000 144.000 ZM 183.390 88.000 L 136.000 88.000 L 136.000 72.000 L 172.890 72.000 C 176.678 77.139 180.183 82.480 183.390 88.000 ZM 136.000 200.000 L 173.190 200.000 C 162.535 208.631 149.628 214.024 136.000 215.540 ZM 136.000 184.000 L 136.000 168.000 L 195.870 168.000 C 193.879 173.645 191.191 179.020 187.870 184.000 ZM 136.000 120.000 L 136.000 104.000 L 191.390 104.000 C 193.591 109.195 195.412 114.542 196.840 120.000 ZM 159.890 56.000 L 136.000 56.000 L 136.000 32.600 C 144.462 39.874 152.443 47.690 159.890 56.000 ZM 56.000 144.000 C 56.000 94.000 98.260 51.290 120.000 32.600 L 120.000 215.540 C 83.582 211.432 56.044 180.649 56.000 144.000 Z"),
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
        return _dropHalf!!
    }

private var _dropHalf: ImageVector? = null
