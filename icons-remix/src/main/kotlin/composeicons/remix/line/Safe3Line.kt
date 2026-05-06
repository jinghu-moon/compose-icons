package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.Safe3Line: ImageVector
    get() {
        if (_safe3Line != null) return _safe3Line!!
        _safe3Line = remixIcon(
            name = "Safe3Line",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M2 4C2 3.448 2.448 3 3 3h18c.552 0 1 .448 1 1v15c0 .552-.448 1-1 1h-1v2h-2v-2h-12v2h-2v-2h-1C2.448 20 2 19.552 2 19v-15ZM4 18h1 14 1v-13h-16v13ZM15.349 8.236c-1.143-.649-2.555-.649-3.698 0L10.318 6.904 8.904 8.318l1.333 1.333c-.649 1.143-.649 2.555 0 3.698L8.904 14.682l1.414 1.414 1.333-1.333c1.143 .649 2.555 .649 3.698 0l1.333 1.333 1.414-1.414L16.763 13.349c.649-1.143 .649-2.555 0-3.698L18.096 8.318 16.682 6.904 15.349 8.236ZM14.737 10.262c.684 .683 .684 1.792 0 2.475-.683 .683-1.791 .683-2.475 0-.684-.683-.684-1.792 0-2.475 .683-.683 1.791-.683 2.475 0ZM5 8v7h2v-7h-2Z"),
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
        return _safe3Line!!
    }

private var _safe3Line: ImageVector? = null
