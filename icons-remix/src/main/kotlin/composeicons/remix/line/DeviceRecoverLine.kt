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
                pathData = parseSvgPathData("M19 2c.552 0 1 .448 1 1v18c0 .552-.448 1-1 1h-14C4.448 22 4 21.552 4 21v-18C4 2.448 4.448 2 5 2h14ZM18 4h-12v16h12v-16ZM12 7c2.761 0 5 2.239 5 5 0 1.797-.948 3.373-2.372 4.254L12.5 12h2.5C15 10.343 13.657 9 12 9 10.343 9 9 10.343 9 12c0 1.657 1.343 3 3 3l.955 1.909C12.646 16.969 12.327 17 12 17 9.239 17 7 14.761 7 12 7 9.239 9.239 7 12 7Z"),
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
