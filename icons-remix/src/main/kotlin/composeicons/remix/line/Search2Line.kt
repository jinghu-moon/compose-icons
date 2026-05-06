package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.Search2Line: ImageVector
    get() {
        if (_search2Line != null) return _search2Line!!
        _search2Line = remixIcon(
            name = "Search2Line",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M11 2c4.968 0 9 4.032 9 9 0 4.968-4.032 9-9 9C6.032 20 2 15.968 2 11 2 6.032 6.032 2 11 2ZM11 18c3.868 0 7-3.132 7-7C18 7.133 14.868 4 11 4 7.133 4 4 7.133 4 11c0 3.868 3.133 7 7 7ZM19.485 18.071l2.828 2.828-1.414 1.414L18.071 19.485l1.414-1.414Z"),
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
        return _search2Line!!
    }

private var _search2Line: ImageVector? = null
