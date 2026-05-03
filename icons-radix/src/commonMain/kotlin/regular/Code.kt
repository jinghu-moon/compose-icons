package composeicons.radix.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.radix.RadixIcons
import composeicons.radix.radixIcon

val RadixIcons.Regular.Code: ImageVector
    get() {
        if (_code != null) return _code!!
        _code = radixIcon(
            name = "Code",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 15.0f, height = 15.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 9.036 2.314 C 9.139 2.058 9.429 1.933 9.685 2.036 C 9.942 2.138 10.066 2.429 9.964 2.685 L 5.964 12.685 C 5.861 12.942 5.571 13.066 5.314 12.964 C 5.058 12.861 4.934 12.571 5.036 12.314 L 9.036 2.314 ZM 11.146 5.146 C 11.317 4.975 11.581 4.954 11.775 5.082 L 11.853 5.146 L 13.853 7.146 L 13.918 7.224 C 14.046 7.418 14.024 7.682 13.853 7.853 L 11.853 9.853 C 11.658 10.048 11.342 10.048 11.146 9.853 C 10.951 9.658 10.951 9.341 11.146 9.146 L 12.793 7.500 L 11.146 5.853 L 11.082 5.775 C 10.954 5.581 10.976 5.317 11.146 5.146 ZM 3.146 5.146 C 3.342 4.951 3.658 4.951 3.853 5.146 C 4.049 5.341 4.049 5.658 3.853 5.853 L 2.207 7.500 L 3.853 9.146 L 3.918 9.224 C 4.046 9.418 4.024 9.682 3.853 9.853 C 3.683 10.024 3.419 10.046 3.225 9.918 L 3.146 9.853 L 1.146 7.853 C 0.951 7.658 0.951 7.341 1.146 7.146 L 3.146 5.146 Z"),
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
        return _code!!
    }

private var _code: ImageVector? = null
