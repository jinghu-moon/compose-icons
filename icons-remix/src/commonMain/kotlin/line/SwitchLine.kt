package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.SwitchLine: ImageVector
    get() {
        if (_switchLine != null) return _switchLine!!
        _switchLine = remixIcon(
            name = "SwitchLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 12.001 3.000 L 12.001 21.000 L 7.601 21.000 C 5.060 21.000 3.001 18.941 3.001 16.400 L 3.001 7.600 C 3.001 5.059 5.060 3.000 7.601 3.000 L 12.001 3.000 ZM 10.001 5.000 L 7.601 5.000 C 6.165 5.000 5.001 6.164 5.001 7.600 L 5.001 16.400 C 5.001 17.836 6.165 19.000 7.601 19.000 L 10.001 19.000 L 10.001 5.000 ZM 7.501 10.000 C 6.673 10.000 6.001 9.328 6.001 8.500 C 6.001 7.672 6.673 7.000 7.501 7.000 C 8.329 7.000 9.001 7.672 9.001 8.500 C 9.001 9.328 8.329 10.000 7.501 10.000 ZM 14.001 3.000 L 16.401 3.000 C 18.941 3.000 21.001 5.059 21.001 7.600 L 21.001 16.400 C 21.001 18.941 18.941 21.000 16.401 21.000 L 14.001 21.000 L 14.001 3.000 ZM 17.001 14.700 C 17.995 14.700 18.801 13.894 18.801 12.900 C 18.801 11.906 17.995 11.100 17.001 11.100 C 16.007 11.100 15.201 11.906 15.201 12.900 C 15.201 13.894 16.007 14.700 17.001 14.700 Z"),
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
        return _switchLine!!
    }

private var _switchLine: ImageVector? = null
