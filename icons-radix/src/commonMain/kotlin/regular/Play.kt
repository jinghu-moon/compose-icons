package composeicons.radix.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.radix.RadixIcons
import composeicons.radix.radixIcon

val RadixIcons.Regular.Play: ImageVector
    get() {
        if (_play != null) return _play!!
        _play = radixIcon(
            name = "Play",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 15f, height = 15f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 3.242 2.322 C 3.392 2.232 3.578 2.226 3.733 2.307 L 12.733 7.057 C 12.897 7.144 13.000 7.314 13.000 7.500 C 13.000 7.685 12.897 7.856 12.733 7.942 L 3.733 12.692 C 3.578 12.774 3.392 12.768 3.242 12.678 C 3.092 12.587 3.000 12.425 3.000 12.250 L 3.000 2.750 C 3.000 2.575 3.092 2.413 3.242 2.322 ZM 4.000 11.420 L 11.428 7.500 L 4.000 3.579 L 4.000 11.420 Z"),
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
        return _play!!
    }

private var _play: ImageVector? = null
