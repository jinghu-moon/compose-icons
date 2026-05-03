package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Microscope: ImageVector
    get() {
        if (_microscope != null) return _microscope!!
        _microscope = phosphorThinIcon(
            name = "Microscope",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 224.000 212.000 L 194.800 212.000 C 210.998 196.251 220.095 174.592 220.000 152.000 C 219.947 107.185 184.761 70.285 140.000 68.100 L 140.000 32.000 C 140.000 25.373 134.627 20.000 128.000 20.000 L 80.000 20.000 C 73.373 20.000 68.000 25.373 68.000 32.000 L 68.000 136.000 C 68.000 142.627 73.373 148.000 80.000 148.000 L 128.000 148.000 C 134.627 148.000 140.000 142.627 140.000 136.000 L 140.000 76.110 C 171.689 77.785 199.001 98.973 208.501 129.250 C 218.002 159.528 207.691 192.521 182.640 212.000 L 32.000 212.000 C 29.791 212.000 28.000 213.791 28.000 216.000 C 28.000 218.209 29.791 220.000 32.000 220.000 L 224.000 220.000 C 226.209 220.000 228.000 218.209 228.000 216.000 C 228.000 213.791 226.209 212.000 224.000 212.000 ZM 132.000 136.000 C 132.000 138.209 130.209 140.000 128.000 140.000 L 80.000 140.000 C 77.791 140.000 76.000 138.209 76.000 136.000 L 76.000 32.000 C 76.000 29.791 77.791 28.000 80.000 28.000 L 128.000 28.000 C 130.209 28.000 132.000 29.791 132.000 32.000 ZM 72.000 180.000 C 69.791 180.000 68.000 178.209 68.000 176.000 C 68.000 173.791 69.791 172.000 72.000 172.000 L 136.000 172.000 C 138.209 172.000 140.000 173.791 140.000 176.000 C 140.000 178.209 138.209 180.000 136.000 180.000 Z"),
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
        return _microscope!!
    }

private var _microscope: ImageVector? = null
