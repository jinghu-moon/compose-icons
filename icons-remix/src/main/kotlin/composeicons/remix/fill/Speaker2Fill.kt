package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.Speaker2Fill: ImageVector
    get() {
        if (_speaker2Fill != null) return _speaker2Fill!!
        _speaker2Fill = remixIcon(
            name = "Speaker2Fill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M4 3h16c.552 0 1 .448 1 1v16c0 .552-.448 1-1 1h-16C3.448 21 3 20.552 3 20v-16C3 3.448 3.448 3 4 3ZM12 17C9.239 17 7 14.761 7 12 7 9.239 9.239 7 12 7c2.761 0 5 2.239 5 5 0 2.761-2.239 5-5 5ZM12 19c3.866 0 7-3.134 7-7C19 8.134 15.866 5 12 5 8.134 5 5 8.134 5 12c0 3.866 3.134 7 7 7ZM12 14c1.105 0 2-.895 2-2 0-1.105-.895-2-2-2-1.105 0-2 .895-2 2 0 1.105 .895 2 2 2Z"),
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
        return _speaker2Fill!!
    }

private var _speaker2Fill: ImageVector? = null
