package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.EditCircleLine: ImageVector
    get() {
        if (_editCircleLine != null) return _editCircleLine!!
        _editCircleLine = remixIcon(
            name = "EditCircleLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M12.684 4.025C12.459 4.006 12.231 3.997 12 3.997c-4.418 0-8 3.582-8 8 0 4.418 3.582 8 8 8 4.418 0 8-3.582 8-8 0-.231-.01-.459-.029-.684-.072-.848-.276-1.668-.603-2.439L20.868 7.371c.335 .641 .602 1.322 .793 2.035 .16 .6 .264 1.216 .311 1.842 .018 .247 .028 .497 .028 .749 0 5.523-4.477 10-10 10-5.523 0-10-4.477-10-10C2 6.474 6.477 1.997 12 1.997c.252 0 .502 .009 .749 .028 .626 .046 1.242 .151 1.841 .311 .713 .19 1.395 .458 2.036 .793L15.125 4.629c-.772-.328-1.593-.532-2.44-.604ZM20.485 2.097l1.414 1.414-9.192 9.192-1.412 .002-.002-1.417L20.485 2.097Z"),
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
        return _editCircleLine!!
    }

private var _editCircleLine: ImageVector? = null
