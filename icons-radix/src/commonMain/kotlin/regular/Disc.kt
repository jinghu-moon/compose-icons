package composeicons.radix.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.radix.RadixIcons
import composeicons.radix.radixIcon

val RadixIcons.Regular.Disc: ImageVector
    get() {
        if (_disc != null) return _disc!!
        _disc = radixIcon(
            name = "Disc",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 15f, height = 15f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 7.499 0.877 C 11.157 0.877 14.122 3.842 14.122 7.499 C 14.122 11.157 11.157 14.122 7.499 14.122 C 3.842 14.122 0.877 11.156 0.877 7.499 C 0.877 3.842 3.842 0.877 7.499 0.877 ZM 7.499 1.826 C 4.367 1.827 1.827 4.367 1.826 7.499 C 1.826 10.632 4.366 13.172 7.499 13.172 C 10.632 13.172 13.172 10.632 13.172 7.499 C 13.172 4.366 10.632 1.826 7.499 1.826 ZM 7.687 5.688 C 8.606 5.781 9.323 6.557 9.323 7.500 L 9.314 7.687 C 9.220 8.606 8.444 9.323 7.500 9.323 L 7.314 9.314 C 6.456 9.226 5.775 8.544 5.688 7.687 L 5.678 7.500 C 5.678 6.494 6.494 5.678 7.500 5.678 L 7.687 5.688 ZM 7.500 6.628 C 7.018 6.628 6.628 7.018 6.628 7.500 C 6.628 7.982 7.018 8.373 7.500 8.373 C 7.982 8.373 8.373 7.982 8.373 7.500 C 8.373 7.018 7.982 6.628 7.500 6.628 Z"),
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
        return _disc!!
    }

private var _disc: ImageVector? = null
