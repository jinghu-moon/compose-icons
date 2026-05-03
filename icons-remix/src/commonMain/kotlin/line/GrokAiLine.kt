package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.GrokAiLine: ImageVector
    get() {
        if (_grokAiLine != null) return _grokAiLine!!
        _grokAiLine = remixIcon(
            name = "GrokAiLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 15.775 2.778 C 12.176 1.295 7.866 2.033 4.939 4.961 C 3.058 6.845 2.039 9.405 2.024 12.000 C 2.016 13.288 2.256 14.583 2.760 15.810 C 3.895 18.573 1.999 21.027 0.124 23.000 L 6.228 17.540 C 4.848 16.102 4.000 14.150 4.000 12.000 C 4.000 7.582 7.582 4.000 12.000 4.000 C 13.317 4.000 14.560 4.318 15.656 4.882 L 17.808 3.888 C 17.266 3.496 16.572 3.074 15.775 2.778 ZM 21.696 9.733 C 20.709 5.482 21.636 3.274 23.900 0.100 L 8.590 15.472 L 18.199 8.806 C 18.634 8.485 19.255 8.611 19.462 9.110 C 19.809 10.006 20.000 10.981 20.000 12.000 C 20.000 16.418 16.418 20.000 12.000 20.000 C 10.697 20.000 9.466 19.688 8.379 19.136 L 5.196 20.145 C 6.833 21.313 9.836 22.000 12.000 22.000 C 17.523 22.000 22.000 17.523 22.000 12.000 C 21.996 11.236 21.871 10.476 21.696 9.733 Z"),
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
        return _grokAiLine!!
    }

private var _grokAiLine: ImageVector? = null
