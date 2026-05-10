package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Polygon: ImageVector
    get() {
        if (_polygon != null) return _polygon!!
        _polygon = phosphorFillIcon(
            name = "Polygon",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M227.81 52.19c-5.251-5.252-12.373-8.202-19.8-8.202-7.427 0-14.549 2.95-19.8 8.202h0c-1.519 1.509-2.861 3.187-4 5L148 47.33C147.74 36.124 140.822 26.153 130.416 21.987c-10.406-4.167-22.293-1.726-30.216 6.203h0C91.824 36.563 89.621 49.301 94.7 60L54.58 96.1C43.545 89.363 29.332 91.057 20.19 100.2h0C9.793 110.609 9.225 127.289 18.89 138.381c9.665 11.092 26.265 12.813 38 3.939l76.75 56.28c-4.662 13.067 .947 27.578 13.187 34.111 12.24 6.533 27.418 3.117 35.679-8.029 8.261-11.146 7.114-26.662-2.697-36.472-1.033-1.033-2.147-1.983-3.33-2.84L206.63 100q.69 0 1.38 0c11.321-.003 21.526-6.824 25.86-17.283 4.333-10.459 1.942-22.498-6.06-30.507ZM161.39 180.05c-6.57-.327-13.045 1.67-18.29 5.64L66.36 129.41C68.841 122.412 68.456 114.716 65.29 108L105.41 71.89c13.125 8.011 30.254 3.94 38.37-9.12L180 72.66c.153 7.192 3.081 14.046 8.17 19.13 1.032 1.033 2.142 1.986 3.32 2.85Z"),
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
        return _polygon!!
    }

private var _polygon: ImageVector? = null
