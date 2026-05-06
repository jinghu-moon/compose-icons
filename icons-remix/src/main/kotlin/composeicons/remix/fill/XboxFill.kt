package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.XboxFill: ImageVector
    get() {
        if (_xboxFill != null) return _xboxFill!!
        _xboxFill = remixIcon(
            name = "XboxFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M5.419 19.528C7.177 21.067 9.482 22 12.001 22c2.522 0 4.824-.933 6.585-2.472 1.564-1.593-3.597-7.257-6.585-9.514C9.016 12.27 3.852 17.934 5.419 19.528ZM14.719 7.523c2.083 2.467 6.237 8.594 5.063 10.76 1.387-1.716 2.218-3.898 2.218-6.279 0-2.783-1.137-5.302-2.975-7.113 0 0-.022-.018-.068-.035-.052-.018-.127-.037-.234-.037-.493 0-1.654 .362-4.004 2.705ZM5.046 4.855c-.048 .017-.068 .034-.072 .035C3.138 6.702 2.001 9.22 2.001 12.003c0 2.378 .832 4.561 2.218 6.278C3.051 16.11 7.201 9.988 9.285 7.523 6.935 5.178 5.772 4.818 5.28 4.818c-.109 0-.186 .018-.234 .038v-.002ZM12.001 4.959c0 0-2.454-1.436-4.371-1.504C6.878 3.428 6.418 3.701 6.363 3.737 8.15 2.538 10.05 2 11.988 2h.013c1.945 0 3.837 .538 5.638 1.737-.057-.038-.512-.31-1.267-.283-1.917 .068-4.372 1.499-4.372 1.499v.005Z"),
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
        return _xboxFill!!
    }

private var _xboxFill: ImageVector? = null
