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
                pathData = parseSvgPathData("M 6.527 14.514 C 6.527 15.597 5.643 16.481 4.560 16.481 C 3.477 16.481 2.592 15.597 2.592 14.514 C 2.592 13.431 3.477 12.546 4.560 12.546 L 6.527 12.546 L 6.527 14.514 ZM 7.519 14.514 C 7.519 13.431 8.404 12.546 9.487 12.546 C 10.570 12.546 11.455 13.431 11.455 14.514 L 11.455 19.441 C 11.455 20.524 10.570 21.409 9.487 21.409 C 8.404 21.409 7.519 20.524 7.519 19.441 L 7.519 14.514 ZM 9.487 6.527 C 8.404 6.527 7.519 5.642 7.519 4.559 C 7.519 3.476 8.404 2.592 9.487 2.592 C 10.570 2.592 11.455 3.476 11.455 4.559 L 11.455 6.527 L 9.487 6.527 ZM 9.487 7.519 C 10.570 7.519 11.455 8.403 11.455 9.486 C 11.455 10.569 10.570 11.454 9.487 11.454 L 4.560 11.454 C 3.477 11.454 2.592 10.569 2.592 9.486 C 2.592 8.403 3.477 7.519 4.560 7.519 L 9.487 7.519 ZM 17.473 9.486 C 17.473 8.403 18.358 7.519 19.441 7.519 C 20.524 7.519 21.409 8.403 21.409 9.486 C 21.409 10.569 20.524 11.454 19.441 11.454 L 17.473 11.454 L 17.473 9.486 ZM 16.482 9.486 C 16.482 10.569 15.597 11.454 14.514 11.454 C 13.431 11.454 12.546 10.569 12.546 9.486 L 12.546 4.559 C 12.546 3.476 13.431 2.592 14.514 2.592 C 15.597 2.592 16.482 3.476 16.482 4.559 L 16.482 9.486 ZM 14.514 17.473 C 15.597 17.473 16.482 18.358 16.482 19.441 C 16.482 20.524 15.597 21.409 14.514 21.409 C 13.431 21.409 12.546 20.524 12.546 19.441 L 12.546 17.473 L 14.514 17.473 ZM 14.514 16.481 C 13.431 16.481 12.546 15.597 12.546 14.514 C 12.546 13.431 13.431 12.546 14.514 12.546 L 19.441 12.546 C 20.524 12.546 21.409 13.431 21.409 14.514 C 21.409 15.597 20.524 16.481 19.441 16.481 L 14.514 16.481 Z"),
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
