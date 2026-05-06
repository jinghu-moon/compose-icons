package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.PhpLine: ImageVector
    get() {
        if (_phpLine != null) return _phpLine!!
        _phpLine = remixIcon(
            name = "PhpLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M10.15 5.55 8.433 14.384h2l.859-4.417h1.5c.552 0 .915 .439 .809 .982l-.668 3.436h2l.668-3.436C15.917 9.322 14.83 8.004 13.173 8.004h-1.5l.477-2.454h-2ZM2.173 8.004h3.75c1.795 0 2.972 1.428 2.63 3.19-.342 1.762-2.075 3.19-3.87 3.19h-1.75l-.477 2.454h-2L2.173 8.004ZM3.314 12.421h1.75c.69 0 1.357-.549 1.489-1.227C6.684 10.517 6.232 9.967 5.541 9.967h-1.75l-.477 2.454ZM17.173 8.004h3.75c1.795 0 2.972 1.428 2.63 3.19-.343 1.762-2.075 3.19-3.87 3.19h-1.75l-.477 2.454h-2L17.173 8.004ZM18.314 12.421h1.75c.69 0 1.357-.549 1.489-1.227 .132-.678-.321-1.227-1.011-1.227h-1.75l-.477 2.454Z"),
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
        return _phpLine!!
    }

private var _phpLine: ImageVector? = null
