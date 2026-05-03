package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.TerminalWindow: ImageVector
    get() {
        if (_terminalWindow != null) return _terminalWindow!!
        _terminalWindow = phosphorLightIcon(
            name = "TerminalWindow",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 126.000 128.000 C 126.002 129.824 125.174 131.550 123.750 132.690 L 83.750 164.690 C 81.160 166.761 77.381 166.340 75.310 163.750 C 73.239 161.160 73.660 157.381 76.250 155.310 L 110.400 128.000 L 76.250 100.690 C 73.660 98.619 73.239 94.840 75.310 92.250 C 77.381 89.660 81.160 89.239 83.750 91.310 L 123.750 123.310 C 125.174 124.450 126.002 126.176 126.000 128.000 ZM 176.000 154.000 L 136.000 154.000 C 132.686 154.000 130.000 156.686 130.000 160.000 C 130.000 163.314 132.686 166.000 136.000 166.000 L 176.000 166.000 C 179.314 166.000 182.000 163.314 182.000 160.000 C 182.000 156.686 179.314 154.000 176.000 154.000 ZM 230.000 56.000 L 230.000 200.000 C 230.000 207.732 223.732 214.000 216.000 214.000 L 40.000 214.000 C 32.268 214.000 26.000 207.732 26.000 200.000 L 26.000 56.000 C 26.000 48.268 32.268 42.000 40.000 42.000 L 216.000 42.000 C 223.732 42.000 230.000 48.268 230.000 56.000 ZM 218.000 56.000 C 218.000 54.895 217.105 54.000 216.000 54.000 L 40.000 54.000 C 38.895 54.000 38.000 54.895 38.000 56.000 L 38.000 200.000 C 38.000 201.105 38.895 202.000 40.000 202.000 L 216.000 202.000 C 217.105 202.000 218.000 201.105 218.000 200.000 Z"),
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
        return _terminalWindow!!
    }

private var _terminalWindow: ImageVector? = null
