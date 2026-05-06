package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.CookieMan: ImageVector
    get() {
        if (_cookieMan != null) return _cookieMan!!
        _cookieMan = tablerFilledIcon(
            name = "CookieMan",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M12.007 1l.238 .005c2.443 .1 4.581 1.672 5.405 3.974l.078 .233c.418 1.339 .354 2.783-.182 4.08l-.093 .21 .05-.002c1.092-.025 2.108 .557 2.638 1.511l.081 .158c.65 1.384 .109 3.034-1.234 3.764l-.19 .096L17 15.85v.963l1.166 1.166 .14 .154c.992 1.176 .918 2.915-.17 4.002-1.087 1.088-2.827 1.161-4.03 .144l-.16-.146L12 20.185l-1.946 1.947c-1.067 1.072-2.77 1.167-3.95 .22l-.15-.128C4.784 21.151 4.67 19.345 5.72 18.104l.146-.158L7 16.812v-.962L5.166 15.01l-.181-.093C3.658 14.18 3.13 12.539 3.78 11.167 4.269 10.15 5.298 9.504 6.426 9.506l.13 .003L6.526 9.445C6.25 8.822 6.079 8.157 6.023 7.477L6.006 7.217v-.217C6.006 3.774 8.557 1.125 11.781 1.004L12.005 1ZM12.01 16h-.01c-.552 0-1 .448-1 1 0 .552 .448 1 1 1h.01c.552 0 1-.448 1-1 0-.552-.448-1-1-1M12.01 13h-.01c-.552 0-1 .448-1 1 0 .552 .448 1 1 1h.01c.552 0 1-.448 1-1 0-.552-.448-1-1-1M12.01 8h-.01c-.552 0-1 .448-1 1 0 .552 .448 1 1 1h.01c.552 0 1-.448 1-1 0-.552-.448-1-1-1M10.01 5h-.01C9.448 5 9 5.448 9 6c0 .552 .448 1 1 1h.01c.552 0 1-.448 1-1 0-.552-.448-1-1-1M14.01 5h-.01c-.552 0-1 .448-1 1 0 .552 .448 1 1 1h.01c.552 0 1-.448 1-1 0-.552-.448-1-1-1"),
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
        return _cookieMan!!
    }

private var _cookieMan: ImageVector? = null
