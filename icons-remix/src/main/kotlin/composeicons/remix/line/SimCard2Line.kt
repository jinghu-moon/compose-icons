package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.SimCard2Line: ImageVector
    get() {
        if (_simCard2Line != null) return _simCard2Line!!
        _simCard2Line = remixIcon(
            name = "SimCard2Line",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M6 4v16h12v-12.172L14.172 4h-8.172ZM5 2h10l4.707 4.707c.188 .188 .293 .442 .293 .707v13.586c0 .552-.448 1-1 1h-14C4.448 22 4 21.552 4 21v-18C4 2.448 4.448 2 5 2ZM13 10v8h-2v-6h-3v-2h5ZM8 13h2v2h-2v-2ZM14 13h2v2h-2v-2ZM14 10h2v2h-2v-2ZM8 16h2v2h-2v-2ZM14 16h2v2h-2v-2Z"),
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
        return _simCard2Line!!
    }

private var _simCard2Line: ImageVector? = null
