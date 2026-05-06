package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.StarLine: ImageVector
    get() {
        if (_starLine != null) return _starLine!!
        _starLine = remixIcon(
            name = "StarLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M12.001 18.26 4.947 22.208 6.522 14.28 .588 8.792 8.615 7.84 12.001 .5l3.386 7.34 8.027 .952-5.934 5.488 1.575 7.928L12.001 18.26ZM12.001 15.968l4.247 2.377-.948-4.773 3.573-3.304L14.039 9.694 12.001 5.275 9.962 9.694l-4.833 .573 3.573 3.304-.948 4.773 4.247-2.377Z"),
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
        return _starLine!!
    }

private var _starLine: ImageVector? = null
