package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.RfidLine: ImageVector
    get() {
        if (_rfidLine != null) return _rfidLine!!
        _rfidLine = remixIcon(
            name = "RfidLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M18.364 18.364c3.515-3.515 3.515-9.213 0-12.728L19.778 4.222c4.296 4.296 4.296 11.261 0 15.556L18.364 18.364ZM5.636 5.636c-3.515 3.515-3.515 9.213 0 12.728L4.222 19.778C-.074 15.483-.074 8.518 4.222 4.222L5.636 5.636ZM15.535 15.535c1.953-1.953 1.953-5.118 0-7.071L16.95 7.05c2.734 2.734 2.734 7.166 0 9.899L15.535 15.535ZM8.464 8.464c-1.953 1.953-1.953 5.118 0 7.071L7.05 16.95C4.317 14.216 4.317 9.784 7.05 7.05L8.464 8.464ZM12 14c1.105 0 2-.896 2-2 0-1.105-.895-2-2-2-1.105 0-2 .895-2 2 0 1.104 .895 2 2 2Z"),
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
        return _rfidLine!!
    }

private var _rfidLine: ImageVector? = null
