package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.DiscussFill: ImageVector
    get() {
        if (_discussFill != null) return _discussFill!!
        _discussFill = remixIcon(
            name = "DiscussFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M16.8 19 14 22.5 11.2 19h-5.2C5.448 19 5 18.552 5 18v-10.897c0-.552 .448-1 1-1h16c.552 0 1 .448 1 1v10.897c0 .552-.448 1-1 1h-5.2ZM2 2h17v2h-16v11h-2v-12C1 2.448 1.448 2 2 2Z"),
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
        return _discussFill!!
    }

private var _discussFill: ImageVector? = null
