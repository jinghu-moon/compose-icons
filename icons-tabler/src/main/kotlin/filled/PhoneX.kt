package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.PhoneX: ImageVector
    get() {
        if (_phoneX != null) return _phoneX!!
        _phoneX = tablerFilledIcon(
            name = "PhoneX",
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
                pathData = parseSvgPathData("M 20.707 3.293 C 21.097 3.683 21.097 4.317 20.707 4.707 L 19.414 6.000 L 20.707 7.293 C 20.967 7.544 21.071 7.916 20.980 8.266 C 20.888 8.615 20.615 8.888 20.266 8.980 C 19.916 9.071 19.544 8.967 19.293 8.707 L 18.000 7.414 L 16.707 8.707 C 16.315 9.086 15.691 9.081 15.305 8.695 C 14.919 8.309 14.914 7.685 15.293 7.293 L 16.586 6.000 L 15.293 4.707 C 15.033 4.456 14.929 4.084 15.020 3.734 C 15.112 3.385 15.385 3.112 15.734 3.020 C 16.084 2.929 16.456 3.033 16.707 3.293 L 18.000 4.586 L 19.293 3.293 C 19.684 2.903 20.316 2.903 20.707 3.293"),
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
        return _phoneX!!
    }

private var _phoneX: ImageVector? = null
