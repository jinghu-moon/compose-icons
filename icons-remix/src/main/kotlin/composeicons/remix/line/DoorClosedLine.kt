package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.DoorClosedLine: ImageVector
    get() {
        if (_doorClosedLine != null) return _doorClosedLine!!
        _doorClosedLine = remixIcon(
            name = "DoorClosedLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M2.998 21v-2h2v-15c0-.552 .448-1 1-1h12c.552 0 1 .448 1 1v15h2v2h-18ZM16.998 5h-10v14h10v-14ZM14.998 11v2h-2v-2h2Z"),
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
        return _doorClosedLine!!
    }

private var _doorClosedLine: ImageVector? = null
