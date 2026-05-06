package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.RewindStartMiniLine: ImageVector
    get() {
        if (_rewindStartMiniLine != null) return _rewindStartMiniLine!!
        _rewindStartMiniLine = remixIcon(
            name = "RewindStartMiniLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M3 6C2.448 6 2 6.448 2 7v10c0 .552 .448 1 1 1 .552 0 1-.448 1-1v-10C4 6.448 3.552 6 3 6ZM7.968 12 11 9.86v4.28L7.968 12ZM12.212 17.443c.226 .159 .538 .106 .697-.12 .059-.084 .092-.185 .092-.288v-10.07c0-.276-.224-.5-.5-.5-.103 0-.204 .032-.288 .092L5.079 11.591c-.226 .159-.279 .471-.12 .697 .033 .047 .074 .087 .12 .12l7.133 5.035ZM16.968 12 20 9.86v4.28L16.968 12ZM13.959 12.288c.033 .047 .074 .087 .12 .12l7.133 5.035c.226 .159 .537 .106 .697-.12 .059-.084 .091-.185 .091-.288v-10.07c0-.276-.224-.5-.5-.5-.103 0-.204 .032-.288 .092l-7.133 5.035c-.226 .159-.279 .471-.12 .697Z"),
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
        return _rewindStartMiniLine!!
    }

private var _rewindStartMiniLine: ImageVector? = null
