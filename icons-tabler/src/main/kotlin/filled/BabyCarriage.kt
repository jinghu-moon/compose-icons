package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.BabyCarriage: ImageVector
    get() {
        if (_babyCarriage != null) return _babyCarriage!!
        _babyCarriage = tablerFilledIcon(
            name = "BabyCarriage",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 14.500 2.000 C 16.286 2.000 17.993 2.735 19.221 4.032 C 20.449 5.329 21.088 7.075 20.990 8.858 C 21.011 9.011 20.997 9.167 20.950 9.314 C 20.666 11.551 19.245 13.481 17.193 14.417 L 17.725 16.012 Q 17.860 16.000 18.000 16.000 C 19.657 16.000 21.000 17.343 21.000 19.000 C 21.000 20.657 19.657 22.000 18.000 22.000 C 16.343 22.000 15.000 20.657 15.000 19.000 L 15.005 18.824 C 15.049 18.080 15.367 17.380 15.899 16.858 L 15.265 14.955 Q 14.888 15.000 14.500 15.000 L 11.825 15.000 Q 11.278 15.000 10.749 14.917 L 10.101 16.858 C 11.073 17.811 11.281 19.299 10.608 20.483 C 9.935 21.666 8.549 22.248 7.233 21.900 C 5.917 21.552 5.000 20.361 5.000 19.000 L 5.004 18.824 C 5.052 18.012 5.426 17.255 6.043 16.725 C 6.659 16.195 7.464 15.937 8.274 16.012 L 8.834 14.330 C 7.106 13.514 5.786 12.026 5.182 10.213 L 3.780 6.000 L 2.000 6.000 C 1.493 6.000 1.066 5.620 1.007 5.117 L 1.000 5.000 C 1.000 4.448 1.448 4.000 2.000 4.000 L 4.500 4.000 C 4.931 4.000 5.313 4.275 5.449 4.684 L 6.553 8.000 L 13.000 8.000 L 13.000 3.000 C 13.000 2.448 13.448 2.000 14.000 2.000 ZM 8.000 18.000 C 7.448 18.000 7.000 18.448 7.000 19.000 C 7.000 19.552 7.448 20.000 8.000 20.000 C 8.552 20.000 9.000 19.552 9.000 19.000 C 9.000 18.448 8.552 18.000 8.000 18.000M 18.000 18.000 C 17.448 18.000 17.000 18.448 17.000 19.000 C 17.000 19.552 17.448 20.000 18.000 20.000 C 18.552 20.000 19.000 19.552 19.000 19.000 C 19.000 18.448 18.552 18.000 18.000 18.000"),
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
        return _babyCarriage!!
    }

private var _babyCarriage: ImageVector? = null
