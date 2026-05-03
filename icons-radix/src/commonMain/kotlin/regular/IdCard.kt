package composeicons.radix.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.radix.RadixIcons
import composeicons.radix.radixIcon

val RadixIcons.Regular.IdCard: ImageVector
    get() {
        if (_idCard != null) return _idCard!!
        _idCard = radixIcon(
            name = "IdCard",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 15f, height = 15f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 14.000 3.000 C 14.552 3.000 15.000 3.448 15.000 4.000 L 15.000 11.000 C 15.000 11.552 14.552 12.000 14.000 12.000 L 1.000 12.000 L 0.897 11.995 C 0.393 11.944 0.000 11.518 0.000 11.000 L 0.000 4.000 C 0.000 3.448 0.448 3.000 1.000 3.000 L 14.000 3.000 ZM 1.000 11.000 L 14.000 11.000 L 14.000 4.000 L 1.000 4.000 L 1.000 11.000 ZM 5.750 5.000 C 5.888 5.000 6.000 5.112 6.000 5.250 L 6.000 9.750 C 6.000 9.888 5.888 10.000 5.750 10.000 L 2.250 10.000 C 2.112 10.000 2.000 9.888 2.000 9.750 L 2.000 5.250 C 2.000 5.112 2.112 5.000 2.250 5.000 L 5.750 5.000 ZM 12.500 9.000 C 12.776 9.000 13.000 9.224 13.000 9.500 C 13.000 9.776 12.776 10.000 12.500 10.000 L 7.500 10.000 C 7.224 10.000 7.000 9.776 7.000 9.500 C 7.000 9.224 7.224 9.000 7.500 9.000 L 12.500 9.000 ZM 10.500 7.000 C 10.776 7.000 11.000 7.224 11.000 7.500 C 11.000 7.776 10.776 8.000 10.500 8.000 L 7.500 8.000 C 7.224 8.000 7.000 7.776 7.000 7.500 C 7.000 7.224 7.224 7.000 7.500 7.000 L 10.500 7.000 ZM 11.500 5.000 C 11.776 5.000 12.000 5.224 12.000 5.500 C 12.000 5.776 11.776 6.000 11.500 6.000 L 7.500 6.000 C 7.224 6.000 7.000 5.776 7.000 5.500 C 7.000 5.224 7.224 5.000 7.500 5.000 L 11.500 5.000 Z"),
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
        return _idCard!!
    }

private var _idCard: ImageVector? = null
