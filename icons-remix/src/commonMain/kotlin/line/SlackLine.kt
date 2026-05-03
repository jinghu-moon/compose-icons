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
                pathData = parseSvgPathData("M 14.501 3.000 C 15.329 3.000 16.001 3.672 16.001 4.500 L 16.001 9.500 C 16.001 10.328 15.329 11.000 14.501 11.000 C 13.672 11.000 13.001 10.328 13.001 9.500 L 13.001 4.500 C 13.001 3.672 13.672 3.000 14.501 3.000 ZM 4.501 13.000 L 6.001 13.000 L 6.001 14.500 C 6.001 15.328 5.329 16.000 4.501 16.000 C 3.673 16.000 3.001 15.328 3.001 14.500 C 3.001 13.672 3.673 13.000 4.501 13.000 ZM 13.001 18.000 L 14.501 18.000 C 15.329 18.000 16.001 18.672 16.001 19.500 C 16.001 20.328 15.329 21.000 14.501 21.000 C 13.672 21.000 13.001 20.328 13.001 19.500 L 13.001 18.000 ZM 14.501 13.000 L 19.501 13.000 C 20.329 13.000 21.001 13.672 21.001 14.500 C 21.001 15.328 20.329 16.000 19.501 16.000 L 14.501 16.000 C 13.672 16.000 13.001 15.328 13.001 14.500 C 13.001 13.672 13.672 13.000 14.501 13.000 ZM 19.501 8.000 C 20.329 8.000 21.001 8.672 21.001 9.500 C 21.001 10.328 20.329 11.000 19.501 11.000 L 18.001 11.000 L 18.001 9.500 C 18.001 8.672 18.673 8.000 19.501 8.000 ZM 4.501 8.000 L 9.501 8.000 C 10.329 8.000 11.001 8.672 11.001 9.500 C 11.001 10.328 10.329 11.000 9.501 11.000 L 4.501 11.000 C 3.673 11.000 3.001 10.328 3.001 9.500 C 3.001 8.672 3.673 8.000 4.501 8.000 ZM 9.501 3.000 C 10.329 3.000 11.001 3.672 11.001 4.500 L 11.001 6.000 L 9.501 6.000 C 8.673 6.000 8.001 5.328 8.001 4.500 C 8.001 3.672 8.673 3.000 9.501 3.000 ZM 9.501 13.000 C 10.329 13.000 11.001 13.672 11.001 14.500 L 11.001 19.500 C 11.001 20.328 10.329 21.000 9.501 21.000 C 8.673 21.000 8.001 20.328 8.001 19.500 L 8.001 14.500 C 8.001 13.672 8.673 13.000 9.501 13.000 Z"),
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
