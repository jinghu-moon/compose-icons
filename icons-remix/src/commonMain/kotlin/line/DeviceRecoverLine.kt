package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.DeviceRecoverLine: ImageVector
    get() {
        if (_deviceRecoverLine != null) return _deviceRecoverLine!!
        _deviceRecoverLine = remixIcon(
            name = "DeviceRecoverLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 19.000 2.000 C 19.552 2.000 20.000 2.448 20.000 3.000 L 20.000 21.000 C 20.000 21.552 19.552 22.000 19.000 22.000 L 5.000 22.000 C 4.448 22.000 4.000 21.552 4.000 21.000 L 4.000 3.000 C 4.000 2.448 4.448 2.000 5.000 2.000 L 19.000 2.000 ZM 18.000 4.000 L 6.000 4.000 L 6.000 20.000 L 18.000 20.000 L 18.000 4.000 ZM 12.000 7.000 C 14.761 7.000 17.000 9.239 17.000 12.000 C 17.000 13.797 16.052 15.373 14.628 16.254 L 12.500 12.000 L 15.000 12.000 C 15.000 10.343 13.657 9.000 12.000 9.000 C 10.343 9.000 9.000 10.343 9.000 12.000 C 9.000 13.657 10.343 15.000 12.000 15.000 L 12.955 16.909 C 12.646 16.969 12.327 17.000 12.000 17.000 C 9.239 17.000 7.000 14.761 7.000 12.000 C 7.000 9.239 9.239 7.000 12.000 7.000 Z"),
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
        return _deviceRecoverLine!!
    }

private var _deviceRecoverLine: ImageVector? = null
