package composeicons.radix.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.radix.RadixIcons
import composeicons.radix.radixIcon

val RadixIcons.Regular.InfoCircled: ImageVector
    get() {
        if (_infoCircled != null) return _infoCircled!!
        _infoCircled = radixIcon(
            name = "InfoCircled",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 15f, height = 15f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 7.499 0.877 C 11.157 0.877 14.122 3.842 14.122 7.499 C 14.122 11.157 11.157 14.122 7.499 14.122 C 3.842 14.122 0.877 11.156 0.877 7.499 C 0.877 3.842 3.842 0.877 7.499 0.877 ZM 7.499 1.826 C 4.367 1.827 1.827 4.367 1.826 7.499 C 1.826 10.632 4.366 13.171 7.499 13.172 C 10.632 13.172 13.172 10.632 13.172 7.499 C 13.172 4.366 10.632 1.826 7.499 1.826 ZM 7.601 6.010 C 7.829 6.056 8.000 6.258 8.000 6.500 L 8.000 10.000 L 9.000 10.000 L 9.000 11.000 L 6.000 11.000 L 6.000 10.000 L 7.000 10.000 L 7.000 7.000 L 6.000 7.000 L 6.000 6.000 L 7.500 6.000 L 7.601 6.010 ZM 7.500 3.750 C 7.914 3.750 8.250 4.086 8.250 4.500 C 8.250 4.914 7.914 5.250 7.500 5.250 C 7.086 5.250 6.750 4.914 6.750 4.500 C 6.750 4.086 7.086 3.750 7.500 3.750 Z"),
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
        return _infoCircled!!
    }

private var _infoCircled: ImageVector? = null
