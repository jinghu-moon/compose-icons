package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.NotionFill: ImageVector
    get() {
        if (_notionFill != null) return _notionFill!!
        _notionFill = remixIcon(
            name = "NotionFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 6.104 5.910 C 6.688 6.384 6.906 6.348 8.002 6.275 L 18.334 5.654 C 18.553 5.654 18.371 5.436 18.298 5.399 L 16.582 4.159 C 16.253 3.904 15.815 3.611 14.976 3.684 L 4.971 4.414 C 4.607 4.450 4.534 4.633 4.679 4.779 L 6.104 5.910 ZM 6.724 8.318 L 6.724 19.188 C 6.724 19.773 7.016 19.991 7.673 19.955 L 19.028 19.298 C 19.685 19.262 19.759 18.860 19.759 18.385 L 19.759 7.588 C 19.759 7.114 19.576 6.858 19.174 6.895 L 7.308 7.588 C 6.870 7.624 6.724 7.843 6.724 8.318 ZM 17.934 8.901 C 18.006 9.229 17.934 9.558 17.604 9.595 L 17.057 9.704 L 17.057 17.729 C 16.582 17.985 16.144 18.130 15.779 18.130 C 15.195 18.130 15.048 17.948 14.611 17.401 L 11.032 11.783 L 11.032 17.219 L 12.165 17.474 C 12.165 17.474 12.165 18.130 11.251 18.130 L 8.732 18.277 C 8.659 18.130 8.732 17.766 8.988 17.693 L 9.645 17.511 L 9.645 10.324 L 8.732 10.251 C 8.659 9.922 8.841 9.448 9.353 9.412 L 12.055 9.229 L 15.779 14.920 L 15.779 9.886 L 14.830 9.777 C 14.757 9.375 15.048 9.084 15.413 9.047 L 17.934 8.901 ZM 4.132 3.429 L 14.538 2.663 C 15.816 2.553 16.144 2.627 16.948 3.210 L 20.269 5.545 C 20.817 5.946 21.000 6.056 21.000 6.493 L 21.000 19.298 C 21.000 20.101 20.708 20.575 19.686 20.648 L 7.601 21.378 C 6.834 21.414 6.469 21.305 6.067 20.794 L 3.621 17.620 C 3.182 17.036 3.000 16.599 3.000 16.087 L 3.000 4.705 C 3.000 4.049 3.292 3.502 4.132 3.429 Z"),
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
        return _notionFill!!
    }

private var _notionFill: ImageVector? = null
