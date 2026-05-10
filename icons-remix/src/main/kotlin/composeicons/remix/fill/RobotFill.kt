package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.RobotFill: ImageVector
    get() {
        if (_robotFill != null) return _robotFill!!
        _robotFill = remixIcon(
            name = "RobotFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M13 4.055c4.5 .497 8 4.313 8 8.945v9h-18v-9C3 8.367 6.5 4.552 11 4.055v-3.055h2v3.055ZM12 18c2.761 0 5-2.239 5-5C17 10.239 14.761 8 12 8 9.239 8 7 10.239 7 13c0 2.761 2.239 5 5 5ZM12 16C10.343 16 9 14.657 9 13c0-1.657 1.343-3 3-3 1.657 0 3 1.343 3 3 0 1.657-1.343 3-3 3ZM12 14c.552 0 1-.448 1-1 0-.552-.448-1-1-1-.552 0-1 .448-1 1 0 .552 .448 1 1 1Z"),
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
        return _robotFill!!
    }

private var _robotFill: ImageVector? = null
