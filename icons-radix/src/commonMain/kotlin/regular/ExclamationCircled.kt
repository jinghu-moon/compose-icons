package composeicons.radix.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.radix.RadixIcons
import composeicons.radix.radixIcon

val RadixIcons.Regular.ExclamationCircled: ImageVector
    get() {
        if (_exclamationCircled != null) return _exclamationCircled!!
        _exclamationCircled = radixIcon(
            name = "ExclamationCircled",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 15.0f, height = 15.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 7.499 0.877 C 11.157 0.877 14.122 3.842 14.122 7.499 C 14.122 11.157 11.157 14.122 7.499 14.122 C 3.842 14.122 0.877 11.156 0.877 7.499 C 0.877 3.842 3.842 0.877 7.499 0.877 ZM 7.499 1.826 C 4.367 1.827 1.827 4.367 1.826 7.499 C 1.826 10.632 4.366 13.172 7.499 13.172 C 10.632 13.172 13.172 10.632 13.172 7.499 C 13.172 4.366 10.632 1.826 7.499 1.826 ZM 7.500 9.726 C 7.914 9.726 8.250 10.062 8.250 10.476 C 8.250 10.890 7.914 11.226 7.500 11.226 C 7.086 11.226 6.750 10.890 6.750 10.476 C 6.750 10.062 7.086 9.726 7.500 9.726 ZM 7.500 3.786 C 7.882 3.786 8.188 4.105 8.173 4.486 L 8.020 8.487 C 8.009 8.766 7.779 8.986 7.500 8.986 C 7.221 8.986 6.991 8.766 6.981 8.487 L 6.827 4.486 C 6.813 4.105 7.118 3.786 7.500 3.786 Z"),
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
        return _exclamationCircled!!
    }

private var _exclamationCircled: ImageVector? = null
