package composeicons.radix.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.radix.RadixIcons
import composeicons.radix.radixIcon

val RadixIcons.Regular.CursorArrow: ImageVector
    get() {
        if (_cursorArrow != null) return _cursorArrow!!
        _cursorArrow = radixIcon(
            name = "CursorArrow",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 15f, height = 15f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 3.292 0.049 C 3.470 -0.032 3.679 -0.002 3.827 0.126 L 12.858 7.950 C 13.013 8.084 13.071 8.299 13.004 8.492 C 12.937 8.685 12.758 8.819 12.554 8.828 L 9.219 8.975 L 11.150 13.219 C 11.265 13.470 11.154 13.766 10.902 13.881 L 8.750 14.861 C 8.499 14.976 8.203 14.865 8.088 14.614 L 6.152 10.369 L 3.862 12.785 C 3.721 12.934 3.505 12.982 3.314 12.906 C 3.124 12.830 3.000 12.646 3.000 12.441 L 3.000 0.504 L 3.005 0.432 C 3.029 0.265 3.136 0.120 3.292 0.049 ZM 4.000 11.188 L 5.938 9.145 L 5.983 9.103 C 6.094 9.012 6.239 8.971 6.383 8.995 C 6.547 9.023 6.687 9.130 6.756 9.281 L 8.790 13.743 L 10.033 13.178 L 8.002 8.715 C 7.933 8.564 7.944 8.389 8.030 8.247 C 8.117 8.106 8.269 8.016 8.435 8.009 L 11.255 7.884 L 4.000 1.598 L 4.000 11.188 Z"),
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
        return _cursorArrow!!
    }

private var _cursorArrow: ImageVector? = null
