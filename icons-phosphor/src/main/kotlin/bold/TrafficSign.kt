package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.TrafficSign: ImageVector
    get() {
        if (_trafficSign != null) return _trafficSign!!
        _trafficSign = phosphorBoldIcon(
            name = "TrafficSign",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 246.000 113.460 L 142.540 10.000 C 134.508 1.974 121.492 1.974 113.460 10.000 L 10.000 113.460 C 1.974 121.492 1.974 134.508 10.000 142.540 L 113.460 246.000 L 113.460 246.000 C 121.492 254.026 134.508 254.026 142.540 246.000 L 246.000 142.540 C 254.026 134.508 254.026 121.492 246.000 113.460 ZM 128.000 226.570 L 29.430 128.000 L 128.000 29.430 L 226.570 128.000 ZM 135.510 104.490 C 130.816 99.796 130.816 92.184 135.510 87.490 C 140.204 82.796 147.816 82.796 152.510 87.490 L 176.510 111.490 C 178.769 113.742 180.039 116.800 180.039 119.990 C 180.039 123.180 178.769 126.238 176.510 128.490 L 152.510 152.490 C 147.816 157.184 140.204 157.184 135.510 152.490 C 130.816 147.796 130.816 140.184 135.510 135.490 L 139.000 132.000 L 112.000 132.000 C 105.373 132.000 100.000 137.373 100.000 144.000 L 100.000 148.000 C 100.000 154.627 94.627 160.000 88.000 160.000 C 81.373 160.000 76.000 154.627 76.000 148.000 L 76.000 144.000 C 76.000 124.118 92.118 108.000 112.000 108.000 L 139.000 108.000 Z"),
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
        return _trafficSign!!
    }

private var _trafficSign: ImageVector? = null
