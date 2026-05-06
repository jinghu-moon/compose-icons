package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.DiscussLine: ImageVector
    get() {
        if (_discussLine != null) return _discussLine!!
        _discussLine = remixIcon(
            name = "DiscussLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M14 22.5 11.2 19h-5.2C5.448 19 5 18.552 5 18v-10.897c0-.552 .448-1 1-1h16c.552 0 1 .448 1 1v10.897c0 .552-.448 1-1 1h-5.2L14 22.5ZM15.839 17h5.161v-8.897h-14v8.897h4.2 .961L14 19.298 15.839 17ZM2 2h17v2h-16v11h-2v-12C1 2.448 1.448 2 2 2Z"),
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
        return _discussLine!!
    }

private var _discussLine: ImageVector? = null
