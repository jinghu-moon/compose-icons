package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.FlowerFill: ImageVector
    get() {
        if (_flowerFill != null) return _flowerFill!!
        _flowerFill = remixIcon(
            name = "FlowerFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 12.455 2.309 L 12.000 2.076 L 11.545 2.309 C 10.395 2.896 9.353 3.664 8.456 4.574 C 9.774 5.260 10.969 6.150 12.000 7.202 C 13.031 6.150 14.226 5.260 15.544 4.574 C 14.647 3.664 13.604 2.897 12.455 2.309 ZM 10.699 8.734 C 8.989 6.935 6.726 5.665 4.181 5.198 L 3.000 4.981 L 3.000 13.000 C 3.000 16.805 5.361 20.058 8.697 21.375 C 8.245 19.998 8.000 18.528 8.000 17.000 C 8.000 13.908 9.002 11.051 10.699 8.734 ZM 21.000 4.981 L 19.819 5.198 C 14.233 6.224 10.000 11.117 10.000 17.000 C 10.000 18.536 10.289 20.007 10.817 21.360 L 11.057 21.975 C 11.371 21.985 11.686 22.000 12.000 22.000 C 16.971 22.000 21.000 17.971 21.000 13.000 L 21.000 4.981 Z"),
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
        return _flowerFill!!
    }

private var _flowerFill: ImageVector? = null
