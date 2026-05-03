package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.XingFill: ImageVector
    get() {
        if (_xingFill != null) return _xingFill!!
        _xingFill = remixIcon(
            name = "XingFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 20.462 3.231 C 20.616 3.231 20.770 3.308 20.847 3.385 C 20.924 3.538 20.924 3.692 20.847 3.846 L 14.770 14.615 L 18.616 21.692 C 18.693 21.846 18.693 22.000 18.616 22.154 C 18.539 22.231 18.385 22.308 18.231 22.308 L 15.462 22.308 C 15.077 22.308 14.847 22.000 14.693 21.769 L 10.770 14.615 C 11.000 14.308 16.924 3.769 16.924 3.769 C 17.077 3.461 17.308 3.231 17.693 3.231 L 20.462 3.231 ZM 8.923 7.000 C 9.308 7.000 9.539 7.308 9.693 7.538 L 11.616 10.846 C 11.462 11.000 8.616 16.077 8.616 16.077 C 8.462 16.308 8.231 16.615 7.847 16.615 L 5.154 16.615 C 5.000 16.615 4.847 16.538 4.770 16.462 C 4.693 16.308 4.693 16.154 4.770 16.000 L 7.616 10.846 L 5.770 7.615 C 5.693 7.461 5.693 7.308 5.770 7.154 C 5.847 7.077 6.000 7.000 6.154 7.000 L 8.923 7.000 Z"),
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
        return _xingFill!!
    }

private var _xingFill: ImageVector? = null
