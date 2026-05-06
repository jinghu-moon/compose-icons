package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.Home7Line: ImageVector
    get() {
        if (_home7Line != null) return _home7Line!!
        _home7Line = remixIcon(
            name = "Home7Line",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M19 21h-14C4.448 21 4 20.552 4 20v-9h-3L11.327 1.612c.381-.347 .964-.347 1.345 0L23 11h-3v9c0 .552-.448 1-1 1ZM6 19h12v-9.843L12 3.703 6 9.157v9.843ZM12 15C10.619 15 9.5 13.881 9.5 12.5 9.5 11.119 10.619 10 12 10c1.381 0 2.5 1.119 2.5 2.5C14.5 13.881 13.381 15 12 15Z"),
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
        return _home7Line!!
    }

private var _home7Line: ImageVector? = null
