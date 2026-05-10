package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.SafariFill: ImageVector
    get() {
        if (_safariFill != null) return _safariFill!!
        _safariFill = remixIcon(
            name = "SafariFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M16.701 6.801l-6.114 3.785L6.802 16.7l-.104-.104L5.283 18.01l.707 .707L7.405 17.303l-.104-.104 6.114-3.785L17.2 7.3l.104 .104L18.719 5.99l-.707-.707L16.597 6.697l.104 .104ZM12.001 22C6.478 22 2.001 17.523 2.001 12 2.001 6.477 6.478 2 12.001 2c5.523 0 10 4.477 10 10 0 5.523-4.477 10-10 10ZM11.501 3v2h1v-2h-1ZM11.501 19v2h1v-2h-1ZM8.095 3.876l.765 1.848 .924-.383L9.019 3.494l-.924 .383ZM14.218 18.659l.765 1.848 .924-.383-.765-1.848-.924 .383ZM14.983 3.494l-.765 1.848 .924 .383 .765-1.848-.924-.383ZM8.86 18.276l-.765 1.848 .924 .383 .765-1.848-.924-.383ZM21.001 11.5h-2v1h2v-1ZM5.001 11.5h-2v1h2v-1ZM20.459 15.116l-1.835-.794-.397 .918 1.836 .794 .397-.918ZM5.775 8.761 3.94 7.967l-.397 .918 1.836 .794 .397-.918ZM20.125 8.094l-1.848 .765 .383 .924 1.848-.765-.383-.924ZM5.342 14.217l-1.848 .765 .383 .924 1.848-.765-.383-.924ZM18.719 18.01 17.304 16.596l-.707 .707 1.414 1.414 .707-.707ZM7.405 6.697 5.991 5.282l-.707 .707L6.698 7.404l.707-.707ZM11.313 11.312 14.924 9.077l-2.235 3.611L11.313 11.312Z"),
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
        return _safariFill!!
    }

private var _safariFill: ImageVector? = null
