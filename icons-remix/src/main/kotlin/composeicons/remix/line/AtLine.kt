package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.AtLine: ImageVector
    get() {
        if (_atLine != null) return _atLine!!
        _atLine = remixIcon(
            name = "AtLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M20 12C20 7.582 16.418 4 12 4 7.582 4 4 7.582 4 12c0 4.418 3.582 8 8 8 1.642 0 3.168-.495 4.438-1.343l1.109 1.664C15.96 21.382 14.052 22 12 22 6.477 22 2 17.523 2 12 2 6.477 6.477 2 12 2c5.523 0 10 4.477 10 10v1.5C22 15.433 20.433 17 18.5 17c-1.204 0-2.266-.608-2.896-1.534C14.694 16.412 13.416 17 12 17 9.239 17 7 14.761 7 12 7 9.239 9.239 7 12 7c1.126 0 2.165 .372 3 1h2v5.5c0 .828 .672 1.5 1.5 1.5C19.328 15 20 14.328 20 13.5v-1.5ZM12 9C10.343 9 9 10.343 9 12c0 1.657 1.343 3 3 3 1.657 0 3-1.343 3-3C15 10.343 13.657 9 12 9Z"),
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
        return _atLine!!
    }

private var _atLine: ImageVector? = null
