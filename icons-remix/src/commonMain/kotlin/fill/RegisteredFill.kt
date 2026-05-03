package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.RegisteredFill: ImageVector
    get() {
        if (_registeredFill != null) return _registeredFill!!
        _registeredFill = remixIcon(
            name = "RegisteredFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 12.000 2.000 C 17.523 2.000 22.000 6.477 22.000 12.000 C 22.000 17.523 17.523 22.000 12.000 22.000 C 6.477 22.000 2.000 17.523 2.000 12.000 C 2.000 6.477 6.477 2.000 12.000 2.000 ZM 12.500 7.000 L 8.000 7.000 L 8.000 17.000 L 10.000 17.000 L 10.000 14.000 L 12.217 14.000 L 14.397 17.000 L 16.869 17.000 L 14.319 13.491 C 15.327 12.876 16.000 11.767 16.000 10.500 C 16.000 8.631 14.536 7.105 12.692 7.005 L 12.500 7.000 ZM 12.500 9.000 C 13.280 9.000 13.920 9.595 13.993 10.356 L 14.000 10.500 L 13.993 10.644 C 13.925 11.358 13.358 11.925 12.644 11.993 L 12.500 12.000 L 10.000 12.000 L 10.000 9.000 L 12.500 9.000 Z"),
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
        return _registeredFill!!
    }

private var _registeredFill: ImageVector? = null
