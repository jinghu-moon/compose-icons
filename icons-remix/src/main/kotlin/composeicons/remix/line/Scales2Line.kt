package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.Scales2Line: ImageVector
    get() {
        if (_scales2Line != null) return _scales2Line!!
        _scales2Line = remixIcon(
            name = "Scales2Line",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M5.998 2c0 .513 .49 1 1 1h10c.513 0 1-.49 1-1h2c0 1.657-1.343 3-3 3h-4l.001 2.062c3.946 .493 6.999 3.859 6.999 7.938v6c0 .552-.448 1-1 1h-14C4.446 22 3.998 21.552 3.998 21v-6c0-4.08 3.054-7.446 7-7.938L10.998 5h-4C5.338 5 3.998 3.66 3.998 2h2ZM11.998 9C8.76 9 5.998 11.76 5.998 15v5h12v-5c0-3.238-2.762-6-6-6ZM11.998 11c.742 0 1.436 .202 2.032 .554l-2.739 2.739c-.391 .391-.391 1.024 0 1.414 .36 .361 .928 .388 1.32 .083l.094-.083 2.739-2.739c.352 .595 .554 1.29 .554 2.032 0 2.209-1.791 4-4 4C9.789 19 7.998 17.209 7.998 15c0-2.209 1.791-4 4-4Z"),
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
        return _scales2Line!!
    }

private var _scales2Line: ImageVector? = null
