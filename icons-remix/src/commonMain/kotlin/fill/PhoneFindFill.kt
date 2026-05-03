package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.PhoneFindFill: ImageVector
    get() {
        if (_phoneFindFill != null) return _phoneFindFill!!
        _phoneFindFill = remixIcon(
            name = "PhoneFindFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 18.000 2.000 C 18.552 2.000 19.000 2.448 19.000 3.000 L 19.001 11.529 C 17.939 10.578 16.537 10.000 15.000 10.000 C 11.686 10.000 9.000 12.686 9.000 16.000 C 9.000 19.238 11.760 22.000 15.000 22.000 L 6.000 22.000 C 5.448 22.000 5.000 21.552 5.000 21.000 L 5.000 3.000 C 5.000 2.448 5.448 2.000 6.000 2.000 L 18.000 2.000 ZM 15.000 12.000 C 17.209 12.000 19.000 13.791 19.000 16.000 C 19.000 16.742 18.798 17.437 18.446 18.032 L 20.657 20.243 L 19.243 21.657 L 17.032 19.446 C 16.437 19.798 15.742 20.000 15.000 20.000 C 12.791 20.000 11.000 18.209 11.000 16.000 C 11.000 13.791 12.791 12.000 15.000 12.000 ZM 15.000 14.000 C 13.895 14.000 13.000 14.895 13.000 16.000 C 13.000 17.105 13.895 18.000 15.000 18.000 C 16.105 18.000 17.000 17.105 17.000 16.000 C 17.000 14.895 16.105 14.000 15.000 14.000 Z"),
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
        return _phoneFindFill!!
    }

private var _phoneFindFill: ImageVector? = null
