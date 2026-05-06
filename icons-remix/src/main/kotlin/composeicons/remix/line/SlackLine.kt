package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.SlackLine: ImageVector
    get() {
        if (_slackLine != null) return _slackLine!!
        _slackLine = remixIcon(
            name = "SlackLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M14.501 3c.828 0 1.5 .672 1.5 1.5v5c0 .828-.672 1.5-1.5 1.5-.829 0-1.5-.672-1.5-1.5v-5C13.001 3.672 13.672 3 14.501 3ZM4.501 13h1.5v1.5C6.001 15.328 5.329 16 4.501 16 3.673 16 3.001 15.328 3.001 14.5 3.001 13.672 3.673 13 4.501 13ZM13.001 18h1.5c.828 0 1.5 .672 1.5 1.5 0 .828-.672 1.5-1.5 1.5-.829 0-1.5-.672-1.5-1.5v-1.5ZM14.501 13h5c.828 0 1.5 .672 1.5 1.5 0 .828-.672 1.5-1.5 1.5h-5c-.829 0-1.5-.672-1.5-1.5 0-.828 .671-1.5 1.5-1.5ZM19.501 8c.828 0 1.5 .672 1.5 1.5 0 .828-.672 1.5-1.5 1.5h-1.5v-1.5C18.001 8.672 18.673 8 19.501 8ZM4.501 8h5c.828 0 1.5 .672 1.5 1.5 0 .828-.672 1.5-1.5 1.5h-5C3.673 11 3.001 10.328 3.001 9.5 3.001 8.672 3.673 8 4.501 8ZM9.501 3c.828 0 1.5 .672 1.5 1.5v1.5h-1.5C8.673 6 8.001 5.328 8.001 4.5 8.001 3.672 8.673 3 9.501 3ZM9.501 13c.828 0 1.5 .672 1.5 1.5v5c0 .828-.672 1.5-1.5 1.5C8.673 21 8.001 20.328 8.001 19.5v-5C8.001 13.672 8.673 13 9.501 13Z"),
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
        return _slackLine!!
    }

private var _slackLine: ImageVector? = null
