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
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M19 2c.552 0 1 .448 1 1v18c0 .552-.448 1-1 1h-14C4.448 22 4 21.552 4 21v-18C4 2.448 4.448 2 5 2h14ZM12 7C9.239 7 7 9.239 7 12c0 2.761 2.239 5 5 5 .33 0 .65-.03 .955-.091L12 15C10.343 15 9 13.657 9 12 9 10.343 10.343 9 12 9c1.598 0 3 1.339 3 3h-2.5l2.128 4.254C16.052 15.373 17 13.797 17 12 17 9.239 14.761 7 12 7Z"),
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
        return _deviceRecoverFill!!
    }

private var _deviceRecoverFill: ImageVector? = null
