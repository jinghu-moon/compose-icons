package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.TrayArrowDown: ImageVector
    get() {
        if (_trayArrowDown != null) return _trayArrowDown!!
        _trayArrowDown = phosphorRegularIcon(
            name = "TrayArrowDown",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 208.000 32.000 L 48.000 32.000 C 39.163 32.000 32.000 39.163 32.000 48.000 L 32.000 208.000 C 32.000 216.837 39.163 224.000 48.000 224.000 L 208.000 224.000 C 216.837 224.000 224.000 216.837 224.000 208.000 L 224.000 48.000 C 224.000 39.163 216.837 32.000 208.000 32.000 ZM 208.000 48.000 L 208.000 152.000 L 179.300 152.000 C 175.058 151.989 170.988 153.678 168.000 156.690 L 148.690 176.000 L 107.310 176.000 L 88.000 156.690 C 85.010 153.676 80.936 151.986 76.690 152.000 L 48.000 152.000 L 48.000 48.000 ZM 208.000 208.000 L 48.000 208.000 L 48.000 168.000 L 76.690 168.000 L 96.000 187.310 C 98.990 190.324 103.064 192.014 107.310 192.000 L 148.690 192.000 C 152.936 192.014 157.010 190.324 160.000 187.310 L 179.310 168.000 L 208.000 168.000 L 208.000 208.000 ZM 90.340 125.660 C 87.214 122.534 87.214 117.466 90.340 114.340 C 93.466 111.214 98.534 111.214 101.660 114.340 L 120.000 132.690 L 120.000 72.000 C 120.000 67.582 123.582 64.000 128.000 64.000 C 132.418 64.000 136.000 67.582 136.000 72.000 L 136.000 132.690 L 154.340 114.340 C 157.466 111.214 162.534 111.214 165.660 114.340 C 168.786 117.466 168.786 122.534 165.660 125.660 L 133.660 157.660 C 132.159 159.162 130.123 160.006 128.000 160.006 C 125.877 160.006 123.841 159.162 122.340 157.660 Z"),
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
        return _trayArrowDown!!
    }

private var _trayArrowDown: ImageVector? = null
