package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.BasketballFill: ImageVector
    get() {
        if (_basketballFill != null) return _basketballFill!!
        _basketballFill = remixIcon(
            name = "BasketballFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M12.366 13.366l1.775 1.025c-1.091 2.413-1.145 5.076-.311 7.44C13.238 21.943 12.625 22 12 22c-1.465 0-2.856-.315-4.109-.881l4.475-7.753ZM15.884 15.398l4.233 2.445c-1.094 1.518-2.604 2.716-4.363 3.429-.65-1.76-.679-3.737 .008-5.57l.121-.304ZM8.859 11.342l1.775 1.024L6.158 20.117C4.519 18.935 3.253 17.27 2.568 15.331c2.359-.438 4.548-1.719 6.085-3.713l.206-.276ZM21.905 10.616c.063 .452 .095 .914 .095 1.384 0 1.465-.315 2.856-.881 4.11L16.884 13.665c1.222-1.615 2.974-2.657 4.866-3.021l.155-.027ZM2.881 7.891l4.235 2.445C5.86 11.995 4.046 13.049 2.095 13.385 2.032 12.932 2 12.47 2 12 2 10.535 2.315 9.144 2.881 7.891ZM17.842 3.883c1.638 1.181 2.904 2.846 3.589 4.785-2.359 .44-4.548 1.721-6.085 3.714l-.206 .276L13.366 11.634 17.842 3.883ZM12 2c1.465 0 2.856 .315 4.11 .881l-4.476 7.753L9.859 9.61c1.091-2.413 1.146-5.077 .311-7.441C10.762 2.057 11.375 2 12 2ZM8.247 2.729c.649 1.76 .678 3.737-.009 5.57l-.121 .304L3.883 6.158C4.936 4.697 6.373 3.533 8.047 2.812l.2-.082Z"),
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
        return _basketballFill!!
    }

private var _basketballFill: ImageVector? = null
