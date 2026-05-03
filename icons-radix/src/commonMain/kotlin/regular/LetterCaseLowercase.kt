package composeicons.radix.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.radix.RadixIcons
import composeicons.radix.radixIcon

val RadixIcons.Regular.LetterCaseLowercase: ImageVector
    get() {
        if (_letterCaseLowercase != null) return _letterCaseLowercase!!
        _letterCaseLowercase = radixIcon(
            name = "LetterCaseLowercase",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 15f, height = 15f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 3.699 5.207 C 4.592 5.207 5.405 5.602 5.954 6.225 L 5.954 5.720 C 5.954 5.471 6.155 5.270 6.404 5.270 C 6.652 5.270 6.854 5.471 6.854 5.720 L 6.854 11.529 C 6.854 11.778 6.652 11.979 6.404 11.979 C 6.155 11.979 5.954 11.778 5.954 11.529 L 5.954 11.019 C 5.374 11.668 4.522 12.013 3.699 12.013 C 2.158 12.013 0.809 10.633 0.809 8.609 C 0.809 6.686 2.058 5.207 3.699 5.207 ZM 10.798 5.207 C 11.692 5.207 12.504 5.602 13.053 6.225 L 13.053 5.720 C 13.053 5.472 13.255 5.270 13.503 5.270 C 13.752 5.270 13.953 5.471 13.954 5.720 L 13.954 11.529 C 13.954 11.778 13.752 11.979 13.503 11.979 C 13.255 11.979 13.053 11.778 13.053 11.529 L 13.053 11.019 C 12.473 11.667 11.621 12.013 10.798 12.013 C 9.258 12.012 7.909 10.633 7.909 8.609 C 7.909 6.686 9.158 5.207 10.798 5.207 ZM 3.886 6.058 C 2.909 6.058 1.836 6.966 1.836 8.609 C 1.836 10.153 2.809 11.161 3.886 11.161 C 4.771 11.161 5.572 10.493 5.954 9.795 L 5.954 7.306 C 5.564 6.583 4.742 6.058 3.886 6.058 ZM 10.986 6.058 C 10.008 6.058 8.935 6.966 8.935 8.609 C 8.935 10.153 9.908 11.161 10.986 11.161 C 11.870 11.161 12.671 10.493 13.053 9.795 L 13.053 7.306 C 12.663 6.583 11.842 6.058 10.986 6.058 Z"),
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
        return _letterCaseLowercase!!
    }

private var _letterCaseLowercase: ImageVector? = null
