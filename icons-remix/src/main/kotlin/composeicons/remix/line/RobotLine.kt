package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.RobotLine: ImageVector
    get() {
        if (_robotLine != null) return _robotLine!!
        _robotLine = remixIcon(
            name = "RobotLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M13 4.055c4.5 .497 8 4.313 8 8.945v9h-18v-9C3 8.367 6.5 4.552 11 4.055v-3.055h2v3.055ZM19 20v-7C19 9.134 15.866 6 12 6 8.134 6 5 9.134 5 13v7h14ZM12 18C9.239 18 7 15.761 7 13 7 10.239 9.239 8 12 8c2.761 0 5 2.239 5 5 0 2.761-2.239 5-5 5ZM12 16c1.657 0 3-1.343 3-3 0-1.657-1.343-3-3-3-1.657 0-3 1.343-3 3 0 1.657 1.343 3 3 3ZM12 14c-.552 0-1-.448-1-1 0-.552 .448-1 1-1 .552 0 1 .448 1 1 0 .552-.448 1-1 1Z"),
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
        return _robotLine!!
    }

private var _robotLine: ImageVector? = null
