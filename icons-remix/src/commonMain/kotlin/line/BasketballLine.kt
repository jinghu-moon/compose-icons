package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.BasketballLine: ImageVector
    get() {
        if (_basketballLine != null) return _basketballLine!!
        _basketballLine = remixIcon(
            name = "BasketballLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 12.000 2.000 C 17.523 2.000 22.000 6.477 22.000 12.000 C 22.000 17.523 17.523 22.000 12.000 22.000 C 6.477 22.000 2.000 17.523 2.000 12.000 C 2.000 6.477 6.477 2.000 12.000 2.000 ZM 12.366 13.366 L 8.897 19.376 C 9.851 19.778 10.900 20.000 12.000 20.000 C 12.462 20.000 12.915 19.961 13.356 19.886 C 13.098 18.063 13.341 16.160 14.140 14.392 L 12.366 13.366 ZM 15.884 15.397 C 15.352 16.657 15.167 17.994 15.297 19.291 C 16.517 18.738 17.574 17.889 18.375 16.835 L 15.884 15.397 ZM 8.859 11.342 C 7.727 12.919 6.199 14.081 4.494 14.770 C 5.025 16.213 5.962 17.460 7.165 18.375 L 10.634 12.366 L 8.859 11.342 ZM 19.962 11.211 L 19.704 11.333 C 18.620 11.869 17.648 12.655 16.883 13.665 L 19.376 15.104 C 19.778 14.149 20.000 13.101 20.000 12.000 C 20.000 11.734 19.987 11.471 19.962 11.211 ZM 4.000 12.000 C 4.000 12.266 4.013 12.529 4.038 12.789 C 5.226 12.253 6.292 11.425 7.116 10.335 L 4.624 8.897 C 4.222 9.851 4.000 10.900 4.000 12.000 ZM 16.835 5.626 L 13.366 11.634 L 15.141 12.659 C 16.273 11.081 17.801 9.919 19.507 9.230 C 19.013 7.891 18.170 6.719 17.088 5.827 L 16.835 5.626 ZM 12.000 4.000 C 11.538 4.000 11.084 4.039 10.643 4.115 C 10.902 5.937 10.659 7.841 9.859 9.609 L 11.634 10.634 L 15.103 4.624 C 14.149 4.222 13.100 4.000 12.000 4.000 ZM 8.703 4.710 L 8.512 4.798 C 7.373 5.351 6.384 6.166 5.626 7.165 L 8.116 8.603 C 8.648 7.344 8.833 6.006 8.703 4.710 Z"),
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
        return _basketballLine!!
    }

private var _basketballLine: ImageVector? = null
