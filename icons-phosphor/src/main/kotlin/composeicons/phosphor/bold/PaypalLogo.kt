package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.PaypalLogo: ImageVector
    get() {
        if (_paypalLogo != null) return _paypalLogo!!
        _paypalLogo = phosphorBoldIcon(
            name = "PaypalLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M223.27 91.08C218.009 84.324 211.36 78.775 203.77 74.81 201.078 43.803 175.123 20.003 144 20h-60c-9.176 .001-17.175 6.247-19.4 15.15L28.6 179.15c-1.493 5.974-.151 12.303 3.638 17.157 3.789 4.854 9.604 7.692 15.762 7.693h22.39l-1.79 7.15c-1.493 5.974-.151 12.303 3.638 17.157 3.789 4.854 9.604 7.692 15.762 7.693h31.5c9.176-.001 17.175-6.247 19.4-15.15L147.13 188h28.87c22.934-.002 43.861-13.078 53.917-33.689 10.057-20.611 7.485-45.153-6.627-63.231ZM87.13 44h56.87c11.093-.032 21.572 5.084 28.37 13.85 2.416 3.077 4.318 6.525 5.63 10.21-.66 0-1.31-.06-2-.06h-56c-9.176 .001-17.175 6.247-19.4 15.15L76.39 180h-23.26ZM177.89 92.05C172.812 106.41 159.231 116.007 144 116h-26.87l6-24h52.87c.62 0 1.26 0 1.89 .05ZM210.89 136.73C206.906 152.756 192.514 164.005 176 164h-32c-9.176 .001-17.175 6.247-19.4 15.15L116.39 212h-23.26l18-72h32.87c24.945 .027 47.295-15.411 56.1-38.75 9.868 8.93 14.025 22.563 10.82 35.48Z"),
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
        return _paypalLogo!!
    }

private var _paypalLogo: ImageVector? = null
