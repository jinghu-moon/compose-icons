package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.ArrowCircleDown: ImageVector
    get() {
        if (_arrowCircleDown != null) return _arrowCircleDown!!
        _arrowCircleDown = phosphorBoldIcon(
            name = "ArrowCircleDown",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 128.000 20.000 C 68.353 20.000 20.000 68.353 20.000 128.000 C 20.000 187.647 68.353 236.000 128.000 236.000 C 187.647 236.000 236.000 187.647 236.000 128.000 C 235.934 68.381 187.619 20.066 128.000 20.000 ZM 128.000 212.000 C 81.608 212.000 44.000 174.392 44.000 128.000 C 44.000 81.608 81.608 44.000 128.000 44.000 C 174.392 44.000 212.000 81.608 212.000 128.000 C 211.950 174.371 174.371 211.950 128.000 212.000 ZM 168.490 127.510 C 170.749 129.762 172.019 132.820 172.019 136.010 C 172.019 139.200 170.749 142.258 168.490 144.510 L 136.490 176.510 C 134.238 178.769 131.180 180.039 127.990 180.039 C 124.800 180.039 121.742 178.769 119.490 176.510 L 87.490 144.510 C 82.796 139.816 82.796 132.204 87.490 127.510 C 92.184 122.816 99.796 122.816 104.490 127.510 L 116.000 139.000 L 116.000 88.000 C 116.000 81.373 121.373 76.000 128.000 76.000 C 134.627 76.000 140.000 81.373 140.000 88.000 L 140.000 139.000 L 151.510 127.480 C 153.765 125.231 156.821 123.970 160.006 123.976 C 163.191 123.981 166.243 125.253 168.490 127.510 Z"),
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
        return _arrowCircleDown!!
    }

private var _arrowCircleDown: ImageVector? = null
