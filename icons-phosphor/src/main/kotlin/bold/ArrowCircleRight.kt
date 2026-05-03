package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.ArrowCircleRight: ImageVector
    get() {
        if (_arrowCircleRight != null) return _arrowCircleRight!!
        _arrowCircleRight = phosphorBoldIcon(
            name = "ArrowCircleRight",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 128.000 20.000 C 68.353 20.000 20.000 68.353 20.000 128.000 C 20.000 187.647 68.353 236.000 128.000 236.000 C 187.647 236.000 236.000 187.647 236.000 128.000 C 235.934 68.381 187.619 20.066 128.000 20.000 ZM 128.000 212.000 C 81.608 212.000 44.000 174.392 44.000 128.000 C 44.000 81.608 81.608 44.000 128.000 44.000 C 174.392 44.000 212.000 81.608 212.000 128.000 C 211.950 174.371 174.371 211.950 128.000 212.000 ZM 176.490 119.510 C 178.749 121.762 180.019 124.820 180.019 128.010 C 180.019 131.200 178.749 134.258 176.490 136.510 L 144.490 168.510 C 139.796 173.204 132.184 173.204 127.490 168.510 C 122.796 163.816 122.796 156.204 127.490 151.510 L 139.000 140.000 L 88.000 140.000 C 81.373 140.000 76.000 134.627 76.000 128.000 C 76.000 121.373 81.373 116.000 88.000 116.000 L 139.000 116.000 L 127.480 104.490 C 122.786 99.796 122.786 92.184 127.480 87.490 C 132.174 82.796 139.786 82.796 144.480 87.490 Z"),
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
        return _arrowCircleRight!!
    }

private var _arrowCircleRight: ImageVector? = null
