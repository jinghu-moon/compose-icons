package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.Notches: ImageVector
    get() {
        if (_notches != null) return _notches!!
        _notches = phosphorRegularIcon(
            name = "Notches",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 213.660 133.660 L 133.660 213.660 C 130.534 216.786 125.466 216.786 122.340 213.660 C 119.214 210.534 119.214 205.466 122.340 202.340 L 202.340 122.340 C 205.466 119.214 210.534 119.214 213.660 122.340 C 216.786 125.466 216.786 130.534 213.660 133.660 ZM 197.660 34.340 C 196.159 32.838 194.123 31.994 192.000 31.994 C 189.877 31.994 187.841 32.838 186.340 34.340 L 34.340 186.340 C 31.214 189.466 31.214 194.534 34.340 197.660 C 37.466 200.786 42.534 200.786 45.660 197.660 L 197.660 45.660 C 199.162 44.159 200.006 42.123 200.006 40.000 C 200.006 37.877 199.162 35.841 197.660 34.340 Z"),
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
        return _notches!!
    }

private var _notches: ImageVector? = null
