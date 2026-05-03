package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.GobletBrokenLine: ImageVector
    get() {
        if (_gobletBrokenLine != null) return _gobletBrokenLine!!
        _gobletBrokenLine = remixIcon(
            name = "GobletBrokenLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 17.867 2.000 L 18.989 9.858 C 19.291 11.973 18.468 13.790 17.109 15.047 C 16.004 16.069 14.541 16.732 13.000 16.935 L 13.000 20.000 L 18.000 20.000 L 18.000 22.000 L 6.000 22.000 L 6.000 20.000 L 11.000 20.000 L 11.000 16.935 C 9.459 16.732 7.995 16.069 6.890 15.047 C 5.532 13.790 4.707 11.973 5.010 9.858 L 6.133 2.000 L 17.867 2.000 ZM 14.077 4.000 L 13.566 4.884 L 16.165 6.384 L 13.415 11.148 L 11.682 10.148 L 13.432 7.116 L 10.835 5.616 L 11.768 4.000 L 7.867 4.000 L 6.989 10.142 C 6.791 11.527 7.311 12.710 8.249 13.578 C 9.203 14.461 10.582 15.000 12.000 15.000 C 13.417 15.000 14.796 14.461 15.751 13.578 C 16.688 12.710 17.207 11.527 17.010 10.142 L 16.133 4.000 L 14.077 4.000 Z"),
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
        return _gobletBrokenLine!!
    }

private var _gobletBrokenLine: ImageVector? = null
