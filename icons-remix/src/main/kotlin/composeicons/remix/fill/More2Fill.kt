package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.More2Fill: ImageVector
    get() {
        if (_more2Fill != null) return _more2Fill!!
        _more2Fill = remixIcon(
            name = "More2Fill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M12 3c-1.1 0-2 .9-2 2 0 1.1 .9 2 2 2 1.1 0 2-.9 2-2C14 3.9 13.1 3 12 3ZM12 17c-1.1 0-2 .9-2 2 0 1.1 .9 2 2 2 1.1 0 2-.9 2-2 0-1.1-.9-2-2-2ZM12 10c-1.1 0-2 .9-2 2 0 1.1 .9 2 2 2 1.1 0 2-.9 2-2 0-1.1-.9-2-2-2Z"),
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
        return _more2Fill!!
    }

private var _more2Fill: ImageVector? = null
