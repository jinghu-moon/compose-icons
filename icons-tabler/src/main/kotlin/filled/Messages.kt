package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.Messages: ImageVector
    get() {
        if (_messages != null) return _messages!!
        _messages = tablerFilledIcon(
            name = "Messages",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 20.901 14.995 L 20.857 14.989 C 20.822 14.987 20.788 14.980 20.755 14.969 L 20.710 14.957 L 20.662 14.940 L 20.617 14.924 L 20.574 14.904 L 20.529 14.882 L 20.489 14.858 L 20.445 14.832 L 20.402 14.800 L 20.366 14.773 C 20.341 14.752 20.316 14.730 20.293 14.707 L 17.586 12.000 L 11.000 12.000 C 9.895 12.000 9.000 11.105 9.000 10.000 L 9.000 4.000 C 9.000 2.895 9.895 2.000 11.000 2.000 L 20.000 2.000 C 21.105 2.000 22.000 2.895 22.000 4.000 L 22.000 14.000 C 22.000 14.131 21.974 14.262 21.924 14.383 L 21.904 14.426 L 21.882 14.471 L 21.858 14.511 L 21.832 14.555 L 21.800 14.598 L 21.773 14.634 C 21.626 14.813 21.422 14.936 21.195 14.981 L 21.143 14.989 L 21.099 14.995 C 21.033 15.002 20.967 15.002 20.901 14.995"),
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
                pathData = parseSvgPathData("M 7.000 8.999 L 7.000 10.000 C 7.000 12.209 8.791 14.000 11.000 14.000 L 15.000 14.000 L 15.000 17.000 C 15.000 18.105 14.105 19.000 13.000 19.000 L 6.414 19.000 L 3.707 21.707 C 3.077 22.337 2.000 21.891 2.000 21.000 L 2.000 11.000 C 2.000 9.895 2.895 9.000 4.000 9.000 Z"),
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
        return _messages!!
    }

private var _messages: ImageVector? = null
