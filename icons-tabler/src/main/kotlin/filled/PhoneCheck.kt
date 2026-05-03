package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.PhoneCheck: ImageVector
    get() {
        if (_phoneCheck != null) return _phoneCheck!!
        _phoneCheck = tablerFilledIcon(
            name = "PhoneCheck",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 9.928 3.629 L 11.928 8.629 C 12.110 9.084 11.934 9.605 11.514 9.857 L 9.844 10.860 C 10.665 12.206 11.795 13.336 13.140 14.157 L 14.143 12.486 C 14.395 12.066 14.916 11.890 15.371 12.072 L 20.371 14.072 C 20.751 14.224 21.000 14.591 21.000 15.000 L 21.000 19.000 C 21.000 20.657 19.657 22.000 17.940 21.998 C 9.361 21.477 2.522 14.638 2.000 6.000 C 2.000 4.343 3.343 3.000 5.000 3.000 L 9.000 3.000 C 9.409 3.000 9.776 3.249 9.928 3.629"),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color(0xFF000000)),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
            )
            addPath(
                pathData = parseSvgPathData("M 21.707 3.293 C 22.097 3.683 22.097 4.317 21.707 4.707 L 17.707 8.707 C 17.316 9.097 16.684 9.097 16.293 8.707 L 14.293 6.707 C 14.033 6.456 13.929 6.084 14.020 5.734 C 14.112 5.385 14.385 5.112 14.734 5.020 C 15.084 4.929 15.456 5.033 15.707 5.293 L 17.000 6.586 L 20.293 3.293 C 20.684 2.903 21.316 2.903 21.707 3.293"),
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
        return _phoneCheck!!
    }

private var _phoneCheck: ImageVector? = null
