package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.SpeedMiniLine: ImageVector
    get() {
        if (_speedMiniLine != null) return _speedMiniLine!!
        _speedMiniLine = remixIcon(
            name = "SpeedMiniLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M9.032 12 6 9.86v4.28L9.032 12ZM4.788 17.443c-.084 .06-.185 .092-.288 .092C4.224 17.535 4 17.311 4 17.035v-10.07c0-.103 .032-.204 .092-.288 .159-.226 .471-.279 .697-.12l7.133 5.035c.047 .033 .087 .074 .12 .12 .159 .226 .105 .538-.12 .697L4.788 17.443ZM15 14.14l3.032-2.14L15 9.86v4.28ZM13 6.965c0-.103 .032-.204 .092-.288 .159-.226 .471-.279 .697-.12l7.133 5.035c.047 .033 .087 .074 .12 .12 .159 .226 .105 .538-.12 .697l-7.133 5.035c-.084 .06-.185 .092-.288 .092-.276 0-.5-.224-.5-.5v-10.07Z"),
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
        return _speedMiniLine!!
    }

private var _speedMiniLine: ImageVector? = null
