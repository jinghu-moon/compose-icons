package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.Save2Line: ImageVector
    get() {
        if (_save2Line != null) return _save2Line!!
        _save2Line = remixIcon(
            name = "Save2Line",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M5 5v14h14v-11.172L16.172 5h-11.172ZM4 3h13l3.707 3.707c.188 .188 .293 .442 .293 .707v12.586c0 .552-.448 1-1 1h-16C3.448 21 3 20.552 3 20v-16C3 3.448 3.448 3 4 3ZM12 18C10.343 18 9 16.657 9 15c0-1.657 1.343-3 3-3 1.657 0 3 1.343 3 3 0 1.657-1.343 3-3 3ZM6 6h9v4h-9v-4Z"),
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
        return _save2Line!!
    }

private var _save2Line: ImageVector? = null
