package composeicons.radix.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.radix.RadixIcons
import composeicons.radix.radixIcon

val RadixIcons.Regular.Resume: ImageVector
    get() {
        if (_resume != null) return _resume!!
        _resume = radixIcon(
            name = "Resume",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 15.0f, height = 15.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 2.500 2.200 C 2.803 2.200 3.049 2.446 3.050 2.750 L 3.050 12.250 C 3.050 12.554 2.804 12.800 2.500 12.800 C 2.196 12.800 1.950 12.553 1.950 12.250 L 1.950 2.750 C 1.950 2.446 2.196 2.200 2.500 2.200 ZM 5.242 2.322 C 5.392 2.232 5.578 2.226 5.733 2.307 L 14.733 7.057 C 14.897 7.144 15.000 7.314 15.000 7.500 C 15.000 7.685 14.897 7.856 14.733 7.942 L 5.733 12.692 C 5.578 12.774 5.392 12.768 5.242 12.677 C 5.092 12.587 5.000 12.425 5.000 12.250 L 5.000 2.750 C 5.000 2.575 5.092 2.412 5.242 2.322 ZM 6.000 11.420 L 13.427 7.500 L 6.000 3.579 L 6.000 11.420 Z"),
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
        return _resume!!
    }

private var _resume: ImageVector? = null
