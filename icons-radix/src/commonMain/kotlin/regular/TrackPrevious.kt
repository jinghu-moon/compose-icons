package composeicons.radix.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.radix.RadixIcons
import composeicons.radix.radixIcon

val RadixIcons.Regular.TrackPrevious: ImageVector
    get() {
        if (_trackPrevious != null) return _trackPrevious!!
        _trackPrevious = radixIcon(
            name = "TrackPrevious",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 15f, height = 15f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 2.500 2.200 C 2.196 2.200 1.950 2.446 1.950 2.750 L 1.950 12.250 C 1.950 12.553 2.196 12.800 2.500 12.800 C 2.804 12.799 3.050 12.553 3.050 12.250 L 3.050 7.715 C 3.095 7.811 3.170 7.891 3.267 7.942 L 12.267 12.692 C 12.422 12.774 12.608 12.768 12.758 12.677 C 12.908 12.587 13.000 12.425 13.000 12.250 L 13.000 2.750 C 13.000 2.575 12.908 2.412 12.758 2.322 C 12.608 2.232 12.422 2.226 12.267 2.307 L 3.267 7.057 C 3.170 7.108 3.095 7.189 3.050 7.284 L 3.050 2.750 C 3.050 2.446 2.804 2.200 2.500 2.200 ZM 12.000 11.420 L 4.572 7.500 L 12.000 3.579 L 12.000 11.420 Z"),
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
        return _trackPrevious!!
    }

private var _trackPrevious: ImageVector? = null
