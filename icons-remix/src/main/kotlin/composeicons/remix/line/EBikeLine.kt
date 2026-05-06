package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.EBikeLine: ImageVector
    get() {
        if (_eBikeLine != null) return _eBikeLine!!
        _eBikeLine = remixIcon(
            name = "EBikeLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M15.501 6.937C17.593 8.147 19 10.409 19 13v8h-4.171c-.412 1.165-1.523 2-2.829 2C10.694 23 9.583 22.165 9.171 21h-4.171v-8C5 10.409 6.407 8.147 8.499 6.937 8.338 6.645 8.211 6.331 8.126 6h-3.126v-2h3.126C8.57 2.275 10.136 1 12 1c1.864 0 3.43 1.275 3.874 3h3.126v2h-3.126c-.085 .331-.211 .645-.373 .937ZM14.047 8.437C13.448 8.795 12.748 9 12 9 11.252 9 10.552 8.795 9.953 8.437 8.212 9.219 7 10.968 7 13v6h2v-4c0-1.657 1.343-3 3-3 1.657 0 3 1.343 3 3v4h2v-6C17 10.968 15.788 9.219 14.047 8.437ZM12 14c-.552 0-1 .448-1 1v5c0 .552 .448 1 1 1 .552 0 1-.448 1-1v-5c0-.552-.448-1-1-1ZM12 7c1.105 0 2-.895 2-2C14 3.895 13.105 3 12 3c-1.105 0-2 .895-2 2 0 1.105 .895 2 2 2Z"),
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
        return _eBikeLine!!
    }

private var _eBikeLine: ImageVector? = null
