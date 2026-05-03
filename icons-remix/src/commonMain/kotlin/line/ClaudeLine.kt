package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.ClaudeLine: ImageVector
    get() {
        if (_claudeLine != null) return _claudeLine!!
        _claudeLine = remixIcon(
            name = "ClaudeLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 8.644 2.553 C 8.397 2.059 7.797 1.859 7.303 2.106 C 6.809 2.353 6.609 2.953 6.856 3.447 L 9.681 9.099 L 5.067 5.926 C 4.611 5.613 3.989 5.728 3.676 6.183 C 3.363 6.639 3.478 7.261 3.934 7.574 L 9.405 11.336 L 3.053 11.001 C 2.501 10.972 2.030 11.396 2.001 11.947 C 1.972 12.499 2.396 12.970 2.947 12.999 L 8.742 13.304 L 4.445 16.168 C 3.986 16.474 3.862 17.095 4.168 17.555 C 4.474 18.014 5.095 18.138 5.555 17.832 L 9.197 15.404 L 6.686 18.919 C 6.365 19.368 6.469 19.993 6.919 20.314 C 7.368 20.635 7.993 20.531 8.314 20.081 L 11.347 15.835 L 10.514 20.836 C 10.423 21.380 10.791 21.896 11.336 21.986 C 11.880 22.077 12.396 21.709 12.486 21.164 L 13.288 16.353 L 15.659 20.041 C 15.958 20.505 16.576 20.640 17.041 20.341 C 17.505 20.042 17.640 19.424 17.341 18.959 L 15.555 16.181 L 18.322 18.735 C 18.728 19.109 19.360 19.084 19.735 18.678 C 20.109 18.272 20.084 17.640 19.678 17.265 L 16.643 14.463 L 20.876 14.992 C 21.424 15.061 21.924 14.672 21.992 14.124 C 22.061 13.576 21.672 13.076 21.124 13.008 L 16.934 12.484 L 21.229 11.473 C 21.767 11.347 22.100 10.809 21.973 10.271 C 21.847 9.733 21.309 9.400 20.771 9.527 L 15.182 10.842 L 19.286 5.618 C 19.628 5.184 19.552 4.555 19.118 4.214 C 18.684 3.872 18.055 3.948 17.714 4.382 L 13.857 9.290 L 14.738 3.654 C 14.823 3.109 14.450 2.597 13.904 2.512 C 13.359 2.427 12.847 2.800 12.762 3.346 L 11.876 9.016 L 8.644 2.553 Z"),
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
        return _claudeLine!!
    }

private var _claudeLine: ImageVector? = null
