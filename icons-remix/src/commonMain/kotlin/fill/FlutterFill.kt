package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.FlutterFill: ImageVector
    get() {
        if (_flutterFill != null) return _flutterFill!!
        _flutterFill = remixIcon(
            name = "FlutterFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 13.504 2.001 L 3.504 12.001 L 6.587 15.084 L 19.667 2.001 L 13.504 2.001 ZM 13.498 11.199 L 8.123 16.620 L 13.496 22.000 L 19.684 22.000 L 14.297 16.600 L 19.686 11.200 L 13.498 11.199 Z"),
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
        return _flutterFill!!
    }

private var _flutterFill: ImageVector? = null
