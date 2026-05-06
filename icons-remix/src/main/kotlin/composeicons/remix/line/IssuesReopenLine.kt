package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.IssuesReopenLine: ImageVector
    get() {
        if (_issuesReopenLine != null) return _issuesReopenLine!!
        _issuesReopenLine = remixIcon(
            name = "IssuesReopenLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M22 12c0 5.523-4.477 10-10 10C8.728 22 5.824 20.429 4 18.001v2.499h-2v-6h6v2h-2.615C6.825 18.614 9.252 20 12 20c4.418 0 8-3.582 8-8h2ZM12 10c1.105 0 2 .895 2 2 0 1.105-.895 2-2 2-1.105 0-2-.895-2-2 0-1.105 .895-2 2-2ZM12 2c3.272 0 6.176 1.571 8 3.999v-2.499h2v6h-6v-2h2.615C17.175 5.386 14.748 4 12 4 7.582 4 4 7.582 4 12h-2C2 6.477 6.477 2 12 2Z"),
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
        return _issuesReopenLine!!
    }

private var _issuesReopenLine: ImageVector? = null
