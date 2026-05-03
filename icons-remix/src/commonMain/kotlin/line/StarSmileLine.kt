package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.StarSmileLine: ImageVector
    get() {
        if (_starSmileLine != null) return _starSmileLine!!
        _starSmileLine = remixIcon(
            name = "StarSmileLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 12.000 0.500 L 16.226 6.683 L 23.412 8.792 L 18.837 14.722 L 19.053 22.208 L 12.000 19.690 L 4.946 22.208 L 5.162 14.722 L 0.587 8.792 L 7.774 6.683 L 12.000 0.500 ZM 12.000 4.044 L 9.022 8.402 L 3.957 9.887 L 7.182 14.066 L 7.029 19.340 L 12.000 17.566 L 16.970 19.340 L 16.818 14.066 L 20.042 9.887 L 14.977 8.402 L 12.000 4.044 ZM 10.000 12.000 C 10.000 13.105 10.895 14.000 12.000 14.000 C 13.104 14.000 14.000 13.105 14.000 12.000 L 16.000 12.000 C 16.000 14.209 14.209 16.000 12.000 16.000 C 9.790 16.000 8.000 14.209 8.000 12.000 L 10.000 12.000 Z"),
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
        return _starSmileLine!!
    }

private var _starSmileLine: ImageVector? = null
