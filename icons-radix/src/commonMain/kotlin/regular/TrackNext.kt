package composeicons.radix.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.radix.RadixIcons
import composeicons.radix.radixIcon

val RadixIcons.Regular.TrackNext: ImageVector
    get() {
        if (_trackNext != null) return _trackNext!!
        _trackNext = radixIcon(
            name = "TrackNext",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 15f, height = 15f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 12.500 2.200 C 12.804 2.200 13.050 2.446 13.050 2.750 L 13.050 12.250 C 13.050 12.553 12.804 12.800 12.500 12.800 C 12.196 12.799 11.950 12.553 11.950 12.250 L 11.950 7.715 C 11.905 7.811 11.830 7.891 11.733 7.942 L 2.733 12.692 C 2.578 12.774 2.392 12.768 2.242 12.677 C 2.092 12.587 2.000 12.425 2.000 12.250 L 2.000 2.750 C 2.000 2.575 2.092 2.412 2.242 2.322 C 2.392 2.232 2.578 2.226 2.733 2.307 L 11.733 7.057 C 11.830 7.108 11.905 7.189 11.950 7.284 L 11.950 2.750 C 11.950 2.446 12.196 2.200 12.500 2.200 ZM 3.000 11.420 L 10.428 7.500 L 3.000 3.579 L 3.000 11.420 Z"),
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
        return _trackNext!!
    }

private var _trackNext: ImageVector? = null
