package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Hockey: ImageVector
    get() {
        if (_hockey != null) return _hockey!!
        _hockey = phosphorFillIcon(
            name = "Hockey",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 149.900 122.820 L 217.900 42.820 C 220.761 39.451 225.811 39.039 229.180 41.900 C 232.549 44.761 232.961 49.811 230.100 53.180 L 162.100 133.180 C 159.239 136.549 154.189 136.961 150.820 134.100 C 147.451 131.239 147.039 126.189 149.900 122.820 ZM 240.000 168.000 L 240.000 200.000 C 240.000 208.837 232.837 216.000 224.000 216.000 L 171.700 216.000 C 167.006 215.999 162.549 213.937 159.510 210.360 L 25.900 53.180 L 25.900 53.180 C 23.039 49.811 23.451 44.761 26.820 41.900 C 30.189 39.039 35.239 39.451 38.100 42.820 L 130.900 152.000 L 224.000 152.000 C 232.837 152.000 240.000 159.163 240.000 168.000 ZM 224.000 168.000 L 208.000 168.000 L 208.000 200.000 L 224.000 200.000 ZM 115.300 183.060 C 116.569 184.554 116.569 186.746 115.300 188.240 L 96.490 210.360 C 93.451 213.937 88.994 215.999 84.300 216.000 L 32.000 216.000 C 23.163 216.000 16.000 208.837 16.000 200.000 L 16.000 168.000 C 16.000 159.163 23.163 152.000 32.000 152.000 L 87.050 152.000 C 88.207 152.014 89.301 152.528 90.050 153.410 ZM 48.000 168.000 L 32.000 168.000 L 32.000 200.000 L 48.000 200.000 Z"),
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
        return _hockey!!
    }

private var _hockey: ImageVector? = null
