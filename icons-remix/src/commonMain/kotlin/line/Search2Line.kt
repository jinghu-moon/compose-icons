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
                pathData = parseSvgPathData("M 11.000 2.000 C 15.968 2.000 20.000 6.032 20.000 11.000 C 20.000 15.968 15.968 20.000 11.000 20.000 C 6.032 20.000 2.000 15.968 2.000 11.000 C 2.000 6.032 6.032 2.000 11.000 2.000 ZM 11.000 18.000 C 14.868 18.000 18.000 14.868 18.000 11.000 C 18.000 7.133 14.868 4.000 11.000 4.000 C 7.133 4.000 4.000 7.133 4.000 11.000 C 4.000 14.868 7.133 18.000 11.000 18.000 ZM 19.485 18.071 L 22.314 20.899 L 20.899 22.314 L 18.071 19.485 L 19.485 18.071 Z"),
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
