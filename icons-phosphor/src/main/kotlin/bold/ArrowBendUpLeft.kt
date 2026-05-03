package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.ArrowBendUpLeft: ImageVector
    get() {
        if (_arrowBendUpLeft != null) return _arrowBendUpLeft!!
        _arrowBendUpLeft = phosphorBoldIcon(
            name = "ArrowBendUpLeft",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 236.000 200.000 C 236.000 206.627 230.627 212.000 224.000 212.000 C 217.373 212.000 212.000 206.627 212.000 200.000 C 211.950 153.629 174.371 116.050 128.000 116.000 L 61.000 116.000 L 88.520 143.510 C 93.214 148.204 93.214 155.816 88.520 160.510 C 83.826 165.204 76.214 165.204 71.520 160.510 L 23.520 112.510 C 21.261 110.258 19.991 107.200 19.991 104.010 C 19.991 100.820 21.261 97.762 23.520 95.510 L 71.520 47.510 C 76.214 42.816 83.826 42.816 88.520 47.510 C 93.214 52.204 93.214 59.816 88.520 64.510 L 61.000 92.000 L 128.000 92.000 C 187.619 92.066 235.934 140.381 236.000 200.000 Z"),
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
        return _arrowBendUpLeft!!
    }

private var _arrowBendUpLeft: ImageVector? = null
