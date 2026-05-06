package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.SlackFill: ImageVector
    get() {
        if (_slackFill != null) return _slackFill!!
        _slackFill = remixIcon(
            name = "SlackFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M6.527 14.514c0 1.083-.885 1.968-1.968 1.968-1.083 0-1.968-.885-1.968-1.968 0-1.083 .885-1.968 1.968-1.968h1.968v1.968ZM7.519 14.514c0-1.083 .885-1.968 1.968-1.968 1.083 0 1.968 .885 1.968 1.968v4.927c0 1.083-.885 1.968-1.968 1.968-1.083 0-1.968-.885-1.968-1.968v-4.927ZM9.487 6.527C8.404 6.527 7.519 5.642 7.519 4.559c0-1.083 .885-1.968 1.968-1.968 1.083 0 1.968 .885 1.968 1.968v1.968h-1.968ZM9.487 7.519c1.083 0 1.968 .885 1.968 1.968 0 1.083-.885 1.968-1.968 1.968h-4.927c-1.083 0-1.968-.885-1.968-1.968 0-1.083 .885-1.968 1.968-1.968h4.927ZM17.473 9.486c0-1.083 .885-1.968 1.968-1.968 1.083 0 1.968 .885 1.968 1.968 0 1.083-.885 1.968-1.968 1.968h-1.968v-1.968ZM16.482 9.486c0 1.083-.885 1.968-1.968 1.968-1.083 0-1.968-.885-1.968-1.968v-4.927c0-1.083 .885-1.968 1.968-1.968 1.083 0 1.968 .885 1.968 1.968v4.927ZM14.514 17.473c1.083 0 1.968 .885 1.968 1.968 0 1.083-.885 1.968-1.968 1.968-1.083 0-1.968-.885-1.968-1.968v-1.968h1.968ZM14.514 16.481c-1.083 0-1.968-.885-1.968-1.968 0-1.083 .885-1.968 1.968-1.968h4.927c1.083 0 1.968 .885 1.968 1.968 0 1.083-.885 1.968-1.968 1.968h-4.927Z"),
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
        return _slackFill!!
    }

private var _slackFill: ImageVector? = null
