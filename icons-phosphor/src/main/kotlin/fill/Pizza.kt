package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Pizza: ImageVector
    get() {
        if (_pizza != null) return _pizza!!
        _pizza = phosphorFillIcon(
            name = "Pizza",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 239.540 63.000 C 238.544 58.863 235.933 55.298 232.290 53.100 C 168.173 14.314 87.827 14.314 23.710 53.100 C 20.078 55.303 17.471 58.860 16.463 62.987 C 15.456 67.113 16.131 71.471 18.340 75.100 L 114.340 232.370 C 117.241 237.152 122.427 240.072 128.020 240.072 C 133.613 240.072 138.799 237.152 141.700 232.370 L 237.700 75.100 C 239.912 71.477 240.575 67.117 239.540 63.000 ZM 184.440 131.530 C 166.039 123.178 144.299 129.862 133.769 147.108 C 123.238 164.355 127.224 186.747 143.060 199.300 L 128.000 224.000 L 96.500 172.430 C 110.617 166.069 119.794 152.131 120.061 136.650 C 120.327 121.168 111.634 106.923 97.744 100.080 C 83.855 93.237 67.263 95.025 55.150 104.670 L 48.800 94.260 C 97.425 64.578 158.565 64.578 207.190 94.260 Z"),
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
        return _pizza!!
    }

private var _pizza: ImageVector? = null
