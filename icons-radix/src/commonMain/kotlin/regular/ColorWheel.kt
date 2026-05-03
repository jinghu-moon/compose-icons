package composeicons.radix.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.radix.RadixIcons
import composeicons.radix.radixIcon

val RadixIcons.Regular.ColorWheel: ImageVector
    get() {
        if (_colorWheel != null) return _colorWheel!!
        _colorWheel = radixIcon(
            name = "ColorWheel",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 15.0f, height = 15.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 7.499 0.877 C 11.157 0.877 14.122 3.842 14.122 7.499 C 14.122 11.157 11.157 14.122 7.499 14.122 C 3.842 14.122 0.877 11.156 0.877 7.499 C 0.877 3.842 3.842 0.877 7.499 0.877 ZM 3.782 11.782 C 4.684 12.566 5.834 13.068 7.100 13.156 L 7.100 8.466 L 3.782 11.782 ZM 7.901 13.156 C 9.165 13.068 10.315 12.565 11.216 11.782 L 7.901 8.467 L 7.901 13.156 ZM 1.842 7.900 C 1.930 9.165 2.433 10.315 3.216 11.216 L 6.533 7.900 L 1.842 7.900 ZM 11.782 11.216 C 12.565 10.315 13.068 9.165 13.156 7.900 L 8.467 7.900 L 11.782 11.216 ZM 8.467 7.100 L 13.156 7.100 C 13.068 5.834 12.566 4.684 11.782 3.782 L 8.467 7.100 ZM 3.216 3.782 C 2.433 4.684 1.930 5.834 1.842 7.100 L 6.533 7.100 L 3.216 3.782 ZM 7.100 1.842 C 5.834 1.930 4.684 2.434 3.782 3.217 L 7.100 6.533 L 7.100 1.842 ZM 7.901 6.533 L 11.216 3.217 C 10.315 2.434 9.166 1.930 7.901 1.842 L 7.901 6.533 Z"),
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
        return _colorWheel!!
    }

private var _colorWheel: ImageVector? = null
