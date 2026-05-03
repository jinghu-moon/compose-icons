package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.DoorLockFill: ImageVector
    get() {
        if (_doorLockFill != null) return _doorLockFill!!
        _doorLockFill = remixIcon(
            name = "DoorLockFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 12.000 22.000 C 6.477 22.000 2.000 17.523 2.000 12.000 C 2.000 6.477 6.477 2.000 12.000 2.000 C 17.523 2.000 22.000 6.477 22.000 12.000 C 22.000 17.523 17.523 22.000 12.000 22.000 ZM 11.000 12.792 L 11.000 16.000 L 13.000 16.000 L 13.000 12.792 C 13.883 12.406 14.500 11.525 14.500 10.500 C 14.500 9.119 13.381 8.000 12.000 8.000 C 10.619 8.000 9.500 9.119 9.500 10.500 C 9.500 11.525 10.117 12.406 11.000 12.792 Z"),
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
        return _doorLockFill!!
    }

private var _doorLockFill: ImageVector? = null
