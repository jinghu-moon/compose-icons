package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.Bookmark3Fill: ImageVector
    get() {
        if (_bookmark3Fill != null) return _bookmark3Fill!!
        _bookmark3Fill = remixIcon(
            name = "Bookmark3Fill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M4 2h16c.552 0 1 .448 1 1v19.276c0 .276-.224 .5-.5 .5-.07 0-.14-.015-.204-.043L12 19.031 3.704 22.733c-.252 .113-.548-.001-.66-.253C3.015 22.416 3 22.347 3 22.276v-19.276C3 2.448 3.448 2 4 2ZM12 13.5l2.939 1.545-.561-3.273L16.755 9.455 13.469 8.977 12 6 10.531 8.977 7.245 9.455l2.378 2.318-.561 3.273L12 13.5Z"),
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
        return _bookmark3Fill!!
    }

private var _bookmark3Fill: ImageVector? = null
