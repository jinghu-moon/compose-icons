package composeicons.radix.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.radix.RadixIcons
import composeicons.radix.radixIcon

val RadixIcons.Regular.PaperPlane: ImageVector
    get() {
        if (_paperPlane != null) return _paperPlane!!
        _paperPlane = radixIcon(
            name = "PaperPlane",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 15.0f, height = 15.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 0.628 1.166 C 0.773 1.005 1.005 0.955 1.203 1.043 L 14.703 7.043 C 14.884 7.123 15.000 7.302 15.000 7.500 C 15.000 7.698 14.884 7.877 14.703 7.957 L 1.203 13.957 C 1.005 14.045 0.773 13.995 0.628 13.834 C 0.483 13.672 0.459 13.435 0.568 13.248 L 3.921 7.500 L 0.568 1.752 C 0.459 1.565 0.483 1.328 0.628 1.166 ZM 4.845 7.100 L 9.000 7.100 L 9.081 7.108 C 9.263 7.146 9.400 7.307 9.400 7.500 C 9.400 7.693 9.263 7.854 9.081 7.892 L 9.000 7.900 L 4.845 7.900 L 2.212 12.413 L 13.269 7.500 L 2.212 2.586 L 4.845 7.100 Z"),
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
        return _paperPlane!!
    }

private var _paperPlane: ImageVector? = null
