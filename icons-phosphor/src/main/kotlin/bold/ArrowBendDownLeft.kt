package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.ArrowBendDownLeft: ImageVector
    get() {
        if (_arrowBendDownLeft != null) return _arrowBendDownLeft!!
        _arrowBendDownLeft = phosphorBoldIcon(
            name = "ArrowBendDownLeft",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 236.000 56.000 C 235.934 115.619 187.619 163.934 128.000 164.000 L 61.000 164.000 L 88.520 191.510 C 93.214 196.204 93.214 203.816 88.520 208.510 C 83.826 213.204 76.214 213.204 71.520 208.510 L 23.520 160.510 C 21.261 158.258 19.991 155.200 19.991 152.010 C 19.991 148.820 21.261 145.762 23.520 143.510 L 71.520 95.510 C 76.214 90.816 83.826 90.816 88.520 95.510 C 93.214 100.204 93.214 107.816 88.520 112.510 L 61.000 140.000 L 128.000 140.000 C 174.371 139.950 211.950 102.371 212.000 56.000 C 212.000 49.373 217.373 44.000 224.000 44.000 C 230.627 44.000 236.000 49.373 236.000 56.000 Z"),
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
        return _arrowBendDownLeft!!
    }

private var _arrowBendDownLeft: ImageVector? = null
