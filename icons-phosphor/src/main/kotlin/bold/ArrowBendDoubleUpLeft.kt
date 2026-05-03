package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.ArrowBendDoubleUpLeft: ImageVector
    get() {
        if (_arrowBendDoubleUpLeft != null) return _arrowBendDoubleUpLeft!!
        _arrowBendDoubleUpLeft = phosphorBoldIcon(
            name = "ArrowBendDoubleUpLeft",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 88.490 143.510 C 93.184 148.204 93.184 155.816 88.490 160.510 C 83.796 165.204 76.184 165.204 71.490 160.510 L 23.490 112.510 C 21.231 110.258 19.961 107.200 19.961 104.010 C 19.961 100.820 21.231 97.762 23.490 95.510 L 71.490 47.510 C 76.184 42.816 83.796 42.816 88.490 47.510 C 93.184 52.204 93.184 59.816 88.490 64.510 L 49.000 104.000 ZM 128.000 92.000 L 117.000 92.000 L 144.520 64.480 C 149.214 59.786 149.214 52.174 144.520 47.480 C 139.826 42.786 132.214 42.786 127.520 47.480 L 79.520 95.480 C 77.261 97.732 75.991 100.790 75.991 103.980 C 75.991 107.170 77.261 110.228 79.520 112.480 L 127.520 160.480 C 132.214 165.174 139.826 165.174 144.520 160.480 C 149.214 155.786 149.214 148.174 144.520 143.480 L 117.000 116.000 L 128.000 116.000 C 174.371 116.050 211.950 153.629 212.000 200.000 C 212.000 206.627 217.373 212.000 224.000 212.000 C 230.627 212.000 236.000 206.627 236.000 200.000 C 235.934 140.381 187.619 92.066 128.000 92.000 Z"),
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
        return _arrowBendDoubleUpLeft!!
    }

private var _arrowBendDoubleUpLeft: ImageVector? = null
