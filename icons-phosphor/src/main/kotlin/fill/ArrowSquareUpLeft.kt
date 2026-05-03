package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.ArrowSquareUpLeft: ImageVector
    get() {
        if (_arrowSquareUpLeft != null) return _arrowSquareUpLeft!!
        _arrowSquareUpLeft = phosphorFillIcon(
            name = "ArrowSquareUpLeft",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 208.000 32.000 L 48.000 32.000 C 39.163 32.000 32.000 39.163 32.000 48.000 L 32.000 208.000 C 32.000 216.837 39.163 224.000 48.000 224.000 L 208.000 224.000 C 216.837 224.000 224.000 216.837 224.000 208.000 L 224.000 48.000 C 224.000 39.163 216.837 32.000 208.000 32.000 ZM 165.660 165.660 C 164.159 167.162 162.123 168.006 160.000 168.006 C 157.877 168.006 155.841 167.162 154.340 165.660 L 104.000 115.310 L 104.000 144.000 C 104.000 148.418 100.418 152.000 96.000 152.000 C 91.582 152.000 88.000 148.418 88.000 144.000 L 88.000 96.000 C 88.000 91.582 91.582 88.000 96.000 88.000 L 144.000 88.000 C 148.418 88.000 152.000 91.582 152.000 96.000 C 152.000 100.418 148.418 104.000 144.000 104.000 L 115.310 104.000 L 165.660 154.340 C 167.162 155.841 168.006 157.877 168.006 160.000 C 168.006 162.123 167.162 164.159 165.660 165.660 Z"),
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
        return _arrowSquareUpLeft!!
    }

private var _arrowSquareUpLeft: ImageVector? = null
