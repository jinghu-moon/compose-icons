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
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 14.598 10.684 L 17.426 10.684 L 11.769 16.342 L 17.426 21.998 L 14.598 21.998 L 8.941 16.341 L 14.598 10.684 ZM 14.404 2.004 L 17.233 2.004 L 5.919 13.318 L 4.505 11.904 L 14.404 2.004 Z"),
        pathFillType = PathFillType.NonZero,
        fill = SolidColor(Color(0xFF000000)),
        fillAlpha = 1.0f,
        stroke = null,
        strokeAlpha = 1.0f,
        strokeLineWidth = 0.0f,
        strokeLineCap = StrokeCap.Butt,
        strokeLineJoin = StrokeJoin.Miter,
    )
        }
        return _flutterLine!!
    }

private var _flutterLine: ImageVector? = null
