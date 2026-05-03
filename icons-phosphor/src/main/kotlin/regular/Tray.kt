package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.Tray: ImageVector
    get() {
        if (_tray != null) return _tray!!
        _tray = phosphorRegularIcon(
            name = "Tray",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 208.000 32.000 L 48.000 32.000 C 39.163 32.000 32.000 39.163 32.000 48.000 L 32.000 208.000 C 32.000 216.837 39.163 224.000 48.000 224.000 L 208.000 224.000 C 216.837 224.000 224.000 216.837 224.000 208.000 L 224.000 48.000 C 224.000 39.163 216.837 32.000 208.000 32.000 ZM 208.000 48.000 L 208.000 152.000 L 179.300 152.000 C 175.058 151.989 170.988 153.678 168.000 156.690 L 148.690 176.000 L 107.310 176.000 L 88.000 156.690 C 85.010 153.676 80.936 151.986 76.690 152.000 L 48.000 152.000 L 48.000 48.000 ZM 208.000 208.000 L 48.000 208.000 L 48.000 168.000 L 76.690 168.000 L 96.000 187.310 C 98.990 190.324 103.064 192.014 107.310 192.000 L 148.690 192.000 C 152.936 192.014 157.010 190.324 160.000 187.310 L 179.310 168.000 L 208.000 168.000 L 208.000 208.000 Z"),
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
        return _tray!!
    }

private var _tray: ImageVector? = null
