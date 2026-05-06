package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.Bookmark3Line: ImageVector
    get() {
        if (_bookmark3Line != null) return _bookmark3Line!!
        _bookmark3Line = remixIcon(
            name = "Bookmark3Line",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M4 2h16c.552 0 1 .448 1 1v19.276c0 .276-.224 .5-.5 .5-.07 0-.14-.015-.204-.043L12 19.031 3.704 22.733c-.252 .113-.548-.001-.66-.253C3.015 22.416 3 22.347 3 22.276v-19.276C3 2.448 3.448 2 4 2ZM19 19.965v-15.965h-14v15.965l7-3.123 7 3.123ZM12 13.5 9.061 15.045l.561-3.273L7.245 9.455l3.286-.477L12 6l1.469 2.977 3.286 .477-2.378 2.318 .561 3.273L12 13.5Z"),
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
        return _bookmark3Line!!
    }

private var _bookmark3Line: ImageVector? = null
