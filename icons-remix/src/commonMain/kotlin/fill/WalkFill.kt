package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.WalkFill: ImageVector
    get() {
        if (_walkFill != null) return _walkFill!!
        _walkFill = remixIcon(
            name = "WalkFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 7.617 8.712 L 10.822 6.384 C 11.174 6.127 11.609 5.985 12.065 6.001 C 13.176 6.028 14.152 6.757 14.492 7.820 C 14.678 8.404 14.848 8.798 15.002 9.002 C 15.914 10.215 17.365 11.000 19.000 11.000 L 19.000 13.000 C 16.826 13.000 14.882 12.008 13.599 10.453 L 12.901 14.408 L 14.962 16.138 L 17.185 22.246 L 15.306 22.930 L 13.266 17.326 L 9.876 14.481 C 9.328 14.038 9.031 13.319 9.162 12.577 L 9.671 9.692 L 8.994 10.184 L 6.867 13.112 L 5.249 11.936 L 7.600 8.700 L 7.617 8.712 ZM 13.500 5.500 C 12.396 5.500 11.500 4.605 11.500 3.500 C 11.500 2.395 12.396 1.500 13.500 1.500 C 14.605 1.500 15.500 2.395 15.500 3.500 C 15.500 4.605 14.605 5.500 13.500 5.500 ZM 10.529 18.681 L 7.315 22.512 L 5.783 21.226 L 8.758 17.680 L 9.504 15.500 L 11.295 17.000 L 10.529 18.681 Z"),
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
        return _walkFill!!
    }

private var _walkFill: ImageVector? = null
