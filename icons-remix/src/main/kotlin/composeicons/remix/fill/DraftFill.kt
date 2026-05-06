package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.DraftFill: ImageVector
    get() {
        if (_draftFill != null) return _draftFill!!
        _draftFill = remixIcon(
            name = "DraftFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M20 2c.552 0 1 .448 1 1v3.757l-8.999 8.999-.006 4.239 4.246 .006L21 15.242v5.758c0 .552-.448 1-1 1h-16C3.448 22 3 21.552 3 21v-18C3 2.448 3.448 2 4 2h16ZM21.778 8.808l1.414 1.414L15.414 18l-1.416-.002L14 16.586 21.778 8.808ZM12 12h-5v2h5v-2ZM15 8h-8v2h8v-2Z"),
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
        return _draftFill!!
    }

private var _draftFill: ImageVector? = null
