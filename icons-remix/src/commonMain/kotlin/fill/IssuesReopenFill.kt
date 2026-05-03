package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.IssuesReopenFill: ImageVector
    get() {
        if (_issuesReopenFill != null) return _issuesReopenFill!!
        _issuesReopenFill = remixIcon(
            name = "IssuesReopenFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 22.000 12.000 C 22.000 17.523 17.523 22.000 12.000 22.000 C 8.856 22.000 6.051 20.548 4.219 18.281 L 2.000 20.500 L 2.000 14.500 L 8.000 14.500 L 5.643 16.857 C 7.106 18.770 9.410 20.000 12.000 20.000 C 16.418 20.000 20.000 16.418 20.000 12.000 L 22.000 12.000 ZM 12.000 10.000 C 13.105 10.000 14.000 10.895 14.000 12.000 C 14.000 13.105 13.105 14.000 12.000 14.000 C 10.895 14.000 10.000 13.105 10.000 12.000 C 10.000 10.895 10.895 10.000 12.000 10.000 ZM 12.000 2.000 C 15.144 2.000 17.949 3.452 19.781 5.719 L 22.000 3.500 L 22.000 9.500 L 16.000 9.500 L 18.357 7.143 C 16.894 5.230 14.590 4.000 12.000 4.000 C 7.582 4.000 4.000 7.582 4.000 12.000 L 2.000 12.000 C 2.000 6.477 6.477 2.000 12.000 2.000 Z"),
        pathFillType = PathFillType.NonZero,
        fill = SolidColor(Color(0xFF000000)),
        fillAlpha = 1.0f,
        stroke = null,
        strokeAlpha = 1.0f,
        strokeLineWidth = 0.0f,
        strokeLineCap = StrokeCap.Butt,
        strokeLineJoin = StrokeJoin.Miter,
    )
        }
        return _issuesReopenFill!!
    }

private var _issuesReopenFill: ImageVector? = null
