package composeicons.radix.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.radix.RadixIcons
import composeicons.radix.radixIcon

val RadixIcons.Regular.ExclamationTriangle: ImageVector
    get() {
        if (_exclamationTriangle != null) return _exclamationTriangle!!
        _exclamationTriangle = radixIcon(
            name = "ExclamationTriangle",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 15.0f, height = 15.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 6.642 0.483 C 7.109 -0.104 8.045 -0.062 8.445 0.608 L 14.839 11.337 C 15.276 12.070 14.747 13.000 13.894 13.000 L 1.106 13.000 C 0.253 12.999 -0.275 12.070 0.162 11.337 L 6.555 0.608 L 6.642 0.483 ZM 7.452 1.084 L 7.415 1.121 L 1.020 11.848 C 0.980 11.915 1.029 11.999 1.106 12.000 L 13.894 12.000 C 13.971 12.000 14.020 11.915 13.980 11.848 L 7.586 1.121 C 7.557 1.072 7.496 1.059 7.452 1.084 ZM 7.499 9.726 C 7.914 9.726 8.249 10.062 8.249 10.476 C 8.249 10.890 7.914 11.226 7.499 11.226 C 7.085 11.226 6.750 10.890 6.749 10.476 C 6.749 10.062 7.085 9.726 7.499 9.726 ZM 7.499 3.787 C 7.882 3.787 8.188 4.104 8.173 4.486 L 8.019 8.487 C 8.008 8.766 7.779 8.987 7.499 8.987 C 7.220 8.987 6.992 8.766 6.981 8.487 L 6.827 4.486 C 6.812 4.104 7.118 3.787 7.499 3.787 Z"),
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
        return _exclamationTriangle!!
    }

private var _exclamationTriangle: ImageVector? = null
