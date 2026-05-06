package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.BaseballCap: ImageVector
    get() {
        if (_baseballCap != null) return _baseballCap!!
        _baseballCap = phosphorLightIcon(
            name = "BaseballCap",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M128 26C71.694 26.066 26.066 71.694 26 128v56c.003 8.287 4.662 15.869 12.054 19.615 7.391 3.746 16.261 3.022 22.946-1.875C73.38 192.74 95.06 182 128 182c32.94 0 54.61 10.73 67 19.73 6.684 4.896 15.551 5.621 22.942 1.877C225.332 199.863 229.993 192.285 230 184v-56C229.934 71.694 184.306 26.066 128 26ZM218 128v12.5c-13.83-8.976-28.933-15.82-44.8-20.3C170.156 90.8 159.274 62.758 141.69 39c43.887 6.819 76.27 44.586 76.31 89ZM160.79 117.22c-21.649-4.293-43.931-4.293-65.58 0 5-38.38 24.16-65.59 32.79-76.14 8.63 10.57 27.8 37.77 32.79 76.15ZM114.31 39C96.725 62.76 85.842 90.807 82.8 120.21 66.933 124.69 51.83 131.534 38 140.51v-12.51C38.04 83.586 70.423 45.819 114.31 39ZM212.57 192.85c-3.393 1.777-7.505 1.446-10.57-.85C188.18 182 164.12 170 128 170c-36.12 0-60.22 12-74 22-3.055 2.284-7.148 2.615-10.53 .85C40.1 191.193 37.975 187.755 38 184v-29c53.755-38.715 126.245-38.715 180 0v29c.048 3.76-2.063 7.216-5.43 8.89Z"),
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
        return _baseballCap!!
    }

private var _baseballCap: ImageVector? = null
