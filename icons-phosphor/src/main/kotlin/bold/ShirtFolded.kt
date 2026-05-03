package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.ShirtFolded: ImageVector
    get() {
        if (_shirtFolded != null) return _shirtFolded!!
        _shirtFolded = phosphorBoldIcon(
            name = "ShirtFolded",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 200.000 36.000 L 177.000 36.000 L 164.490 23.510 L 164.490 23.510 C 162.238 21.260 159.184 19.997 156.000 20.000 L 100.000 20.000 C 96.816 19.997 93.762 21.260 91.510 23.510 L 91.510 23.510 L 79.000 36.000 L 56.000 36.000 C 44.954 36.000 36.000 44.954 36.000 56.000 L 36.000 208.000 C 36.000 219.046 44.954 228.000 56.000 228.000 L 200.000 228.000 C 211.046 228.000 220.000 219.046 220.000 208.000 L 220.000 56.000 C 220.000 44.954 211.046 36.000 200.000 36.000 ZM 96.000 53.000 L 103.330 45.670 L 118.820 72.200 L 96.000 94.480 ZM 137.180 72.200 L 152.670 45.640 L 160.000 53.000 L 160.000 94.480 ZM 60.000 60.000 L 72.000 60.000 L 72.000 104.000 C 71.998 112.074 76.851 119.358 84.303 122.466 C 91.756 125.573 100.346 123.894 106.080 118.210 L 116.000 108.500 L 116.000 204.000 L 60.000 204.000 ZM 196.000 204.000 L 140.000 204.000 L 140.000 108.500 L 149.920 118.190 C 155.652 123.872 164.237 125.552 171.688 122.449 C 179.138 119.347 183.994 112.071 184.000 104.000 L 184.000 60.000 L 196.000 60.000 Z"),
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
        return _shirtFolded!!
    }

private var _shirtFolded: ImageVector? = null
