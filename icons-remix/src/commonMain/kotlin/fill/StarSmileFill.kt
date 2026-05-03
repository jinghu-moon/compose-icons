package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.StarSmileFill: ImageVector
    get() {
        if (_starSmileFill != null) return _starSmileFill!!
        _starSmileFill = remixIcon(
            name = "StarSmileFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 12.000 0.500 L 16.226 6.683 L 23.412 8.792 L 18.837 14.722 L 19.053 22.208 L 12.000 19.690 L 4.946 22.208 L 5.162 14.722 L 0.587 8.792 L 7.774 6.683 L 12.000 0.500 ZM 10.000 12.000 L 8.000 12.000 C 8.000 14.209 9.790 16.000 12.000 16.000 C 14.142 16.000 15.891 14.316 15.995 12.200 L 16.000 12.000 L 14.000 12.000 C 14.000 13.105 13.104 14.000 12.000 14.000 C 10.945 14.000 10.081 13.184 10.005 12.149 L 10.000 12.000 Z"),
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
        return _starSmileFill!!
    }

private var _starSmileFill: ImageVector? = null
