package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.HomeSmileLine: ImageVector
    get() {
        if (_homeSmileLine != null) return _homeSmileLine!!
        _homeSmileLine = remixIcon(
            name = "HomeSmileLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M6 19h12v-9.843L12 3.703 6 9.157v9.843ZM19 21h-14C4.448 21 4 20.552 4 20v-9h-3L11.327 1.612c.381-.347 .964-.347 1.345 0L23 11h-3v9c0 .552-.448 1-1 1ZM7.5 13h2c0 1.381 1.119 2.5 2.5 2.5 1.381 0 2.5-1.119 2.5-2.5h2c0 2.485-2.015 4.5-4.5 4.5C9.515 17.5 7.5 15.485 7.5 13Z"),
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
        return _homeSmileLine!!
    }

private var _homeSmileLine: ImageVector? = null
