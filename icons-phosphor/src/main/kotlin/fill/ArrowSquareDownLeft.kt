package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.ArrowSquareDownLeft: ImageVector
    get() {
        if (_arrowSquareDownLeft != null) return _arrowSquareDownLeft!!
        _arrowSquareDownLeft = phosphorFillIcon(
            name = "ArrowSquareDownLeft",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 208.000 32.000 L 48.000 32.000 C 39.163 32.000 32.000 39.163 32.000 48.000 L 32.000 208.000 C 32.000 216.837 39.163 224.000 48.000 224.000 L 208.000 224.000 C 216.837 224.000 224.000 216.837 224.000 208.000 L 224.000 48.000 C 224.000 39.163 216.837 32.000 208.000 32.000 ZM 165.660 101.660 L 115.310 152.000 L 144.000 152.000 C 148.418 152.000 152.000 155.582 152.000 160.000 C 152.000 164.418 148.418 168.000 144.000 168.000 L 96.000 168.000 C 91.582 168.000 88.000 164.418 88.000 160.000 L 88.000 112.000 C 88.000 107.582 91.582 104.000 96.000 104.000 C 100.418 104.000 104.000 107.582 104.000 112.000 L 104.000 140.690 L 154.340 90.340 C 157.466 87.214 162.534 87.214 165.660 90.340 C 168.786 93.466 168.786 98.534 165.660 101.660 Z"),
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
        return _arrowSquareDownLeft!!
    }

private var _arrowSquareDownLeft: ImageVector? = null
