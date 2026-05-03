package composeicons.radix.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.radix.RadixIcons
import composeicons.radix.radixIcon

val RadixIcons.Regular.CrossCircled: ImageVector
    get() {
        if (_crossCircled != null) return _crossCircled!!
        _crossCircled = radixIcon(
            name = "CrossCircled",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 15f, height = 15f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 7.499 0.877 C 11.157 0.877 14.122 3.842 14.122 7.499 C 14.122 11.157 11.157 14.122 7.499 14.122 C 3.842 14.122 0.877 11.156 0.877 7.499 C 0.877 3.842 3.842 0.877 7.499 0.877 ZM 7.499 1.826 C 4.367 1.827 1.827 4.367 1.826 7.499 C 1.826 10.632 4.366 13.172 7.499 13.172 C 10.632 13.172 13.172 10.632 13.172 7.499 C 13.172 4.366 10.632 1.826 7.499 1.826 ZM 9.147 5.147 C 9.342 4.951 9.658 4.951 9.854 5.147 C 10.049 5.342 10.049 5.658 9.854 5.854 L 8.207 7.500 L 9.854 9.147 L 9.918 9.225 C 10.046 9.419 10.024 9.683 9.854 9.854 C 9.683 10.024 9.419 10.046 9.225 9.918 L 9.147 9.854 L 7.500 8.207 L 5.854 9.854 C 5.658 10.049 5.342 10.049 5.147 9.854 C 4.951 9.658 4.951 9.342 5.147 9.147 L 6.793 7.500 L 5.147 5.854 L 5.082 5.775 C 4.954 5.581 4.976 5.317 5.147 5.147 C 5.317 4.976 5.581 4.954 5.776 5.082 L 5.854 5.147 L 7.500 6.793 L 9.147 5.147 Z"),
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
        return _crossCircled!!
    }

private var _crossCircled: ImageVector? = null
