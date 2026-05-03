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
                pathData = parseSvgPathData("M 18.364 18.364 C 21.879 14.849 21.879 9.151 18.364 5.636 L 19.778 4.222 C 24.074 8.518 24.074 15.483 19.778 19.778 L 18.364 18.364 ZM 5.636 5.636 C 2.121 9.151 2.121 14.849 5.636 18.364 L 4.222 19.778 C -0.074 15.483 -0.074 8.518 4.222 4.222 L 5.636 5.636 ZM 15.535 15.535 C 17.488 13.583 17.488 10.417 15.535 8.464 L 16.950 7.050 C 19.683 9.784 19.683 14.216 16.950 16.950 L 15.535 15.535 ZM 8.464 8.464 C 6.512 10.417 6.512 13.583 8.464 15.535 L 7.050 16.950 C 4.317 14.216 4.317 9.784 7.050 7.050 L 8.464 8.464 ZM 12.000 14.000 C 13.105 14.000 14.000 13.105 14.000 12.000 C 14.000 10.896 13.105 10.000 12.000 10.000 C 10.895 10.000 10.000 10.896 10.000 12.000 C 10.000 13.105 10.895 14.000 12.000 14.000 Z"),
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
