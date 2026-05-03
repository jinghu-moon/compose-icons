package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.TrayArrowUp: ImageVector
    get() {
        if (_trayArrowUp != null) return _trayArrowUp!!
        _trayArrowUp = phosphorFillIcon(
            name = "TrayArrowUp",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 208.000 32.000 L 48.000 32.000 C 39.163 32.000 32.000 39.163 32.000 48.000 L 32.000 208.000 C 32.000 216.837 39.163 224.000 48.000 224.000 L 208.000 224.000 C 216.837 224.000 224.000 216.837 224.000 208.000 L 224.000 48.000 C 224.000 39.163 216.837 32.000 208.000 32.000 ZM 90.340 98.340 L 122.340 66.340 C 123.841 64.838 125.877 63.994 128.000 63.994 C 130.123 63.994 132.159 64.838 133.660 66.340 L 165.660 98.340 C 168.786 101.466 168.786 106.534 165.660 109.660 C 162.534 112.786 157.466 112.786 154.340 109.660 L 136.000 91.310 L 136.000 152.000 C 136.000 156.418 132.418 160.000 128.000 160.000 C 123.582 160.000 120.000 156.418 120.000 152.000 L 120.000 91.310 L 101.660 109.660 C 98.534 112.786 93.466 112.786 90.340 109.660 C 87.214 106.534 87.214 101.466 90.340 98.340 ZM 208.000 208.000 L 48.000 208.000 L 48.000 168.000 L 76.690 168.000 L 96.000 187.310 C 98.990 190.324 103.064 192.014 107.310 192.000 L 148.690 192.000 C 152.936 192.014 157.010 190.324 160.000 187.310 L 179.310 168.000 L 208.000 168.000 L 208.000 208.000 Z"),
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
        return _trayArrowUp!!
    }

private var _trayArrowUp: ImageVector? = null
