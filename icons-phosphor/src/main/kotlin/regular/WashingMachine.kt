package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.WashingMachine: ImageVector
    get() {
        if (_washingMachine != null) return _washingMachine!!
        _washingMachine = phosphorRegularIcon(
            name = "WashingMachine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 208.000 32.000 L 48.000 32.000 C 39.163 32.000 32.000 39.163 32.000 48.000 L 32.000 208.000 C 32.000 216.837 39.163 224.000 48.000 224.000 L 208.000 224.000 C 216.837 224.000 224.000 216.837 224.000 208.000 L 224.000 48.000 C 224.000 39.163 216.837 32.000 208.000 32.000 ZM 208.000 208.000 L 48.000 208.000 L 48.000 48.000 L 208.000 48.000 L 208.000 208.000 ZM 128.000 64.000 C 92.654 64.000 64.000 92.654 64.000 128.000 C 64.000 163.346 92.654 192.000 128.000 192.000 C 163.346 192.000 192.000 163.346 192.000 128.000 C 191.961 92.670 163.330 64.039 128.000 64.000 ZM 128.000 176.000 C 101.490 176.000 80.000 154.510 80.000 128.000 C 80.000 101.490 101.490 80.000 128.000 80.000 C 154.510 80.000 176.000 101.490 176.000 128.000 C 175.972 154.498 154.498 175.972 128.000 176.000 ZM 200.000 68.000 C 200.000 74.627 194.627 80.000 188.000 80.000 C 181.373 80.000 176.000 74.627 176.000 68.000 C 176.000 61.373 181.373 56.000 188.000 56.000 C 194.627 56.000 200.000 61.373 200.000 68.000 ZM 125.660 117.660 L 109.660 133.660 C 106.534 136.786 101.466 136.786 98.340 133.660 C 95.214 130.534 95.214 125.466 98.340 122.340 L 114.340 106.340 C 117.466 103.214 122.534 103.214 125.660 106.340 C 128.786 109.466 128.786 114.534 125.660 117.660 ZM 157.660 114.340 C 159.162 115.841 160.006 117.877 160.006 120.000 C 160.006 122.123 159.162 124.159 157.660 125.660 L 125.660 157.660 C 122.534 160.786 117.466 160.786 114.340 157.660 C 111.214 154.534 111.214 149.466 114.340 146.340 L 146.340 114.340 C 147.841 112.838 149.877 111.994 152.000 111.994 C 154.123 111.994 156.159 112.838 157.660 114.340 Z"),
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
        return _washingMachine!!
    }

private var _washingMachine: ImageVector? = null
