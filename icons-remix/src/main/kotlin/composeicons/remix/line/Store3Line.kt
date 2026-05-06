package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.Store3Line: ImageVector
    get() {
        if (_store3Line != null) return _store3Line!!
        _store3Line = remixIcon(
            name = "Store3Line",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M21 13v7c0 .552-.448 1-1 1h-16C3.448 21 3 20.552 3 20v-7h-1v-2L3 6h18l1 5v2h-1ZM5 13v6h14v-6h-14ZM4.04 11h15.921L19.36 8h-14.721l-.6 3ZM6 14h8v3h-8v-3ZM3 3h18v2h-18v-2Z"),
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
        return _store3Line!!
    }

private var _store3Line: ImageVector? = null
