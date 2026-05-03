package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.DeviceRecoverFill: ImageVector
    get() {
        if (_deviceRecoverFill != null) return _deviceRecoverFill!!
        _deviceRecoverFill = remixIcon(
            name = "DeviceRecoverFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 19.000 2.000 C 19.552 2.000 20.000 2.448 20.000 3.000 L 20.000 21.000 C 20.000 21.552 19.552 22.000 19.000 22.000 L 5.000 22.000 C 4.448 22.000 4.000 21.552 4.000 21.000 L 4.000 3.000 C 4.000 2.448 4.448 2.000 5.000 2.000 L 19.000 2.000 ZM 12.000 7.000 C 9.239 7.000 7.000 9.239 7.000 12.000 C 7.000 14.761 9.239 17.000 12.000 17.000 C 12.330 17.000 12.650 16.970 12.955 16.909 L 12.000 15.000 C 10.343 15.000 9.000 13.657 9.000 12.000 C 9.000 10.343 10.343 9.000 12.000 9.000 C 13.598 9.000 15.000 10.339 15.000 12.000 L 12.500 12.000 L 14.628 16.254 C 16.052 15.373 17.000 13.797 17.000 12.000 C 17.000 9.239 14.761 7.000 12.000 7.000 Z"),
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
        return _deviceRecoverFill!!
    }

private var _deviceRecoverFill: ImageVector? = null
