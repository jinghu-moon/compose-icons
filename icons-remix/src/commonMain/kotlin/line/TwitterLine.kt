package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.TwitterLine: ImageVector
    get() {
        if (_twitterLine != null) return _twitterLine!!
        _twitterLine = remixIcon(
            name = "TwitterLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 15.350 5.550 C 13.768 5.550 12.479 6.818 12.450 8.397 L 12.422 9.972 C 12.416 10.303 12.143 10.567 11.812 10.561 C 11.788 10.560 11.765 10.559 11.741 10.555 L 10.181 10.343 C 8.127 10.062 6.159 9.117 4.271 7.544 C 3.673 10.854 4.840 13.147 7.653 14.916 L 9.400 16.014 C 9.681 16.191 9.765 16.561 9.589 16.841 C 9.549 16.906 9.496 16.962 9.435 17.007 L 7.843 18.170 C 8.790 18.229 9.689 18.188 10.435 18.039 C 15.153 17.097 18.290 13.547 18.290 7.691 C 18.290 7.213 17.277 5.550 15.350 5.550 ZM 10.451 8.361 C 10.498 5.696 12.674 3.550 15.350 3.550 C 16.713 3.550 17.947 4.107 18.835 5.005 C 19.546 5.000 20.151 5.180 21.503 4.360 C 21.169 6.000 21.003 6.712 20.290 7.691 C 20.290 15.333 15.593 19.049 10.826 20.000 C 7.559 20.652 2.806 19.581 1.445 18.159 C 2.139 18.105 4.959 17.802 6.589 16.609 C 5.210 15.699 -0.279 12.468 3.328 3.786 C 5.021 5.763 6.738 7.109 8.478 7.823 C 9.635 8.298 9.920 8.288 10.451 8.361 Z"),
        pathFillType = PathFillType.NonZero,
        fill = SolidColor(Color(0xFF000000)),
        fillAlpha = 1.0f,
        stroke = null,
        strokeAlpha = 1.0f,
        strokeLineWidth = 0.0f,
        strokeLineCap = StrokeCap.Butt,
        strokeLineJoin = StrokeJoin.Miter,
    )
        }
        return _twitterLine!!
    }

private var _twitterLine: ImageVector? = null
