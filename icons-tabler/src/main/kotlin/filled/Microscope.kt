package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.Microscope: ImageVector
    get() {
        if (_microscope != null) return _microscope!!
        _microscope = tablerFilledIcon(
            name = "Microscope",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 15.707 4.293 L 18.707 7.293 C 19.097 7.683 19.097 8.316 18.707 8.707 L 17.154 10.262 C 19.713 13.045 19.600 17.357 16.898 20.002 L 19.000 20.000 C 19.552 20.000 20.000 20.448 20.000 21.000 C 20.000 21.552 19.552 22.000 19.000 22.000 L 5.000 22.000 C 4.448 22.000 4.000 21.552 4.000 21.000 C 4.000 20.448 4.448 20.000 5.000 20.000 L 6.000 20.000 L 6.000 19.000 C 5.448 19.000 5.000 18.552 5.000 18.000 C 5.000 17.448 5.448 17.000 6.000 17.000 L 8.000 17.000 C 8.552 17.000 9.000 17.448 9.000 18.000 C 9.000 18.552 8.552 19.000 8.000 19.000 L 8.000 20.000 L 12.000 20.000 C 13.969 20.000 15.756 18.845 16.562 17.048 C 17.369 15.251 17.046 13.149 15.737 11.677 L 12.707 14.707 C 12.316 15.097 11.684 15.097 11.293 14.707 L 10.500 13.915 L 9.707 14.707 C 9.456 14.967 9.084 15.071 8.734 14.980 C 8.385 14.888 8.112 14.615 8.020 14.266 C 7.929 13.916 8.033 13.544 8.293 13.293 L 9.085 12.500 L 8.293 11.707 C 7.903 11.316 7.903 10.684 8.293 10.293 L 14.293 4.293 C 14.684 3.903 15.316 3.903 15.707 4.293M 17.707 2.293 L 20.707 5.293 C 20.967 5.544 21.071 5.916 20.980 6.266 C 20.888 6.615 20.615 6.888 20.266 6.980 C 19.916 7.071 19.544 6.967 19.293 6.707 L 16.293 3.707 C 16.033 3.456 15.929 3.084 16.020 2.734 C 16.112 2.385 16.385 2.112 16.734 2.020 C 17.084 1.929 17.456 2.033 17.707 2.293"),
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
        return _microscope!!
    }

private var _microscope: ImageVector? = null
