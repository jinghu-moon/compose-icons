package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.RadioLine: ImageVector
    get() {
        if (_radioLine != null) return _radioLine!!
        _radioLine = remixIcon(
            name = "RadioLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M17 10v-2h-2v2h-10v-4h14v4h-2ZM6 3v-2h2v2h13.008c.548 0 .992 .445 .992 .993v16.013c0 .549-.455 .993-.992 .993h-18.016C2.444 21 2 20.555 2 20.007v-16.013C2 3.445 2.455 3 2.992 3h3.008ZM4 5v14h16v-14h-16ZM8 18C6.343 18 5 16.657 5 15 5 13.343 6.343 12 8 12c1.657 0 3 1.343 3 3 0 1.657-1.343 3-3 3Z"),
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
        return _radioLine!!
    }

private var _radioLine: ImageVector? = null
