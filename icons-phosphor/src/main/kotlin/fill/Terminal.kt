package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Terminal: ImageVector
    get() {
        if (_terminal != null) return _terminal!!
        _terminal = phosphorFillIcon(
            name = "Terminal",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 216.000 40.000 L 40.000 40.000 C 31.163 40.000 24.000 47.163 24.000 56.000 L 24.000 200.000 C 24.000 208.837 31.163 216.000 40.000 216.000 L 216.000 216.000 C 224.837 216.000 232.000 208.837 232.000 200.000 L 232.000 56.000 C 232.000 47.163 224.837 40.000 216.000 40.000 ZM 77.660 173.660 C 74.534 176.786 69.466 176.786 66.340 173.660 C 63.214 170.534 63.214 165.466 66.340 162.340 L 100.690 128.000 L 66.340 93.660 C 63.214 90.534 63.214 85.466 66.340 82.340 C 69.466 79.214 74.534 79.214 77.660 82.340 L 117.660 122.340 C 119.162 123.841 120.006 125.877 120.006 128.000 C 120.006 130.123 119.162 132.159 117.660 133.660 ZM 192.000 176.000 L 128.000 176.000 C 123.582 176.000 120.000 172.418 120.000 168.000 C 120.000 163.582 123.582 160.000 128.000 160.000 L 192.000 160.000 C 196.418 160.000 200.000 163.582 200.000 168.000 C 200.000 172.418 196.418 176.000 192.000 176.000 Z"),
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
        return _terminal!!
    }

private var _terminal: ImageVector? = null
