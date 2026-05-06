package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.Safe3Fill: ImageVector
    get() {
        if (_safe3Fill != null) return _safe3Fill!!
        _safe3Fill = remixIcon(
            name = "Safe3Fill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M3 3C2.448 3 2 3.448 2 4v15c0 .552 .448 1 1 1h1v2h2v-2h12v2h2v-2h1c.552 0 1-.448 1-1v-15C22 3.448 21.552 3 21 3h-18ZM15.349 8.236 16.682 6.904l1.414 1.414L16.763 9.651c.649 1.143 .649 2.555 0 3.698l1.333 1.333-1.414 1.414L15.349 14.763c-1.143 .649-2.555 .649-3.698 0l-1.333 1.333L8.904 14.682l1.333-1.333c-.649-1.143-.649-2.555 0-3.698L8.904 8.318 10.318 6.904l1.333 1.333c1.143-.649 2.555-.649 3.698 0ZM14.737 10.262c-.683-.683-1.791-.683-2.475 0-.684 .683-.684 1.792 0 2.475 .683 .683 1.791 .683 2.475 0 .684-.683 .684-1.792 0-2.475ZM5 8h2v7h-2v-7Z"),
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
        return _safe3Fill!!
    }

private var _safe3Fill: ImageVector? = null
