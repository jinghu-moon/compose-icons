package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.BilliardsFill: ImageVector
    get() {
        if (_billiardsFill != null) return _billiardsFill!!
        _billiardsFill = remixIcon(
            name = "BilliardsFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M12 2c5.523 0 10 4.477 10 10 0 5.523-4.477 10-10 10C6.477 22 2 17.523 2 12 2 6.477 6.477 2 12 2ZM12 6C8.686 6 6 8.686 6 12c0 3.314 2.686 6 6 6 3.314 0 6-2.686 6-6C18 8.686 15.314 6 12 6ZM12 7.75c1.381 0 2.5 1.119 2.5 2.5 0 .632-.234 1.208-.62 1.648 .565 .456 .92 1.116 .92 1.852 0 1.381-1.254 2.5-2.8 2.5-1.546 0-2.8-1.119-2.8-2.5 0-.735 .355-1.396 .921-1.853-.387-.438-.621-1.015-.621-1.647C9.5 8.869 10.619 7.75 12 7.75ZM12 12.75c-.753 0-1.3 .488-1.3 1 0 .512 .547 1 1.3 1 .753 0 1.3-.488 1.3-1 0-.512-.547-1-1.3-1ZM12 9.25c-.552 0-1 .448-1 1 0 .552 .448 1 1 1 .552 0 1-.448 1-1 0-.552-.448-1-1-1Z"),
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
        return _billiardsFill!!
    }

private var _billiardsFill: ImageVector? = null
