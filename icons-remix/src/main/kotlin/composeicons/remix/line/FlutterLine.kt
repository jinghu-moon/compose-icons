package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.FlutterLine: ImageVector
    get() {
        if (_flutterLine != null) return _flutterLine!!
        _flutterLine = remixIcon(
            name = "FlutterLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M14.598 10.684h2.828l-5.658 5.658 5.658 5.656h-2.828L8.941 16.341l5.657-5.657ZM14.404 2.004h2.828L5.919 13.318 4.505 11.904 14.404 2.004Z"),
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
        return _flutterLine!!
    }

private var _flutterLine: ImageVector? = null
