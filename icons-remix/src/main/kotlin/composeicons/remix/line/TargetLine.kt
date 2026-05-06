package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.TargetLine: ImageVector
    get() {
        if (_targetLine != null) return _targetLine!!
        _targetLine = remixIcon(
            name = "TargetLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M12 2c.552 0 1 .448 1 1-0 .552-.448 1-1 1C7.582 4 4 7.582 4 12c0 4.418 3.582 8 8 8 4.418 0 8-3.582 8-8 0-.552 .448-1 1-1 .552 0 1 .448 1 1-0 5.523-4.477 10-10 10C6.477 22 2 17.523 2 12 2 6.477 6.477 2 12 2ZM12 6c.552 0 1 .448 1 1-0 .552-.448 1-1 1C9.791 8 8 9.791 8 12c0 2.209 1.791 4 4 4 2.209 0 4-1.791 4-4 0-.552 .448-1 1-1 .552 0 1 .448 1 1-0 3.314-2.686 6-6 6C8.686 18 6 15.314 6 12 6 8.686 8.686 6 12 6ZM17.656 2.101c.391-.391 1.024-.391 1.415 0 .39 .39 .39 1.024 0 1.414l-.708 .706 .001 .001c-.391 .391-.391 1.024 0 1.414 .391 .39 1.024 .39 1.414 0l.707-.707c.391-.39 1.024-.39 1.414 0 .39 .39 .39 1.024 0 1.414L19.778 8.465c-.187 .187-.442 .292-.707 .292h-2.414l-3.95 3.95c-.391 .39-1.024 .39-1.414 0-.391-.391-.39-1.023 0-1.414L15.242 7.344v-2.415c0-.265 .106-.52 .293-.707L17.656 2.101Z"),
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
        return _targetLine!!
    }

private var _targetLine: ImageVector? = null
