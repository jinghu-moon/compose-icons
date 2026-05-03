package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.GrokAiFill: ImageVector
    get() {
        if (_grokAiFill != null) return _grokAiFill!!
        _grokAiFill = remixIcon(
            name = "GrokAiFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 4.939 4.961 C 7.866 2.033 12.176 1.295 15.775 2.778 C 16.572 3.074 17.266 3.496 17.808 3.888 L 14.802 5.277 C 12.003 4.102 8.797 4.901 6.840 6.860 C 4.276 9.425 3.694 13.814 6.480 16.782 L 6.758 17.066 L 0.124 23.000 C 1.999 21.027 3.895 18.573 2.760 15.810 C 1.240 12.112 2.125 7.779 4.939 4.961 ZM 23.900 0.100 C 21.636 3.274 20.715 5.489 21.703 9.740 L 21.696 9.733 C 22.449 12.934 21.644 16.484 19.043 19.088 C 15.764 22.373 10.517 23.104 6.196 20.147 L 9.209 18.751 C 11.967 19.835 14.984 19.358 17.152 17.188 C 19.321 15.017 19.807 11.855 18.718 9.224 C 18.511 8.725 17.890 8.599 17.455 8.920 L 8.590 15.472 L 21.289 2.701 L 21.289 2.712 L 23.900 0.100 Z"),
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
        return _grokAiFill!!
    }

private var _grokAiFill: ImageVector? = null
