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
                pathData = parseSvgPathData("M 22.000 12.000 C 22.000 17.523 17.523 22.000 12.000 22.000 C 8.728 22.000 5.824 20.429 4.000 18.001 L 4.000 20.500 L 2.000 20.500 L 2.000 14.500 L 8.000 14.500 L 8.000 16.500 L 5.385 16.500 C 6.825 18.614 9.252 20.000 12.000 20.000 C 16.418 20.000 20.000 16.418 20.000 12.000 L 22.000 12.000 ZM 12.000 10.000 C 13.105 10.000 14.000 10.895 14.000 12.000 C 14.000 13.105 13.105 14.000 12.000 14.000 C 10.895 14.000 10.000 13.105 10.000 12.000 C 10.000 10.895 10.895 10.000 12.000 10.000 ZM 12.000 2.000 C 15.272 2.000 18.176 3.571 20.000 5.999 L 20.000 3.500 L 22.000 3.500 L 22.000 9.500 L 16.000 9.500 L 16.000 7.500 L 18.615 7.500 C 17.175 5.386 14.748 4.000 12.000 4.000 C 7.582 4.000 4.000 7.582 4.000 12.000 L 2.000 12.000 C 2.000 6.477 6.477 2.000 12.000 2.000 Z"),
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
