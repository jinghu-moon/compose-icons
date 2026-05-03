package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.BrandStripe: ImageVector
    get() {
        if (_brandStripe != null) return _brandStripe!!
        _brandStripe = tablerFilledIcon(
            name = "BrandStripe",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 12.500 2.000 C 14.950 2.000 17.043 2.440 18.428 3.096 C 18.818 3.281 19.046 3.695 18.992 4.124 L 18.492 8.124 C 18.452 8.444 18.260 8.725 17.977 8.879 C 17.693 9.033 17.353 9.041 17.063 8.900 C 16.016 8.391 14.445 8.077 12.895 8.077 Q 12.689 8.078 12.563 8.103 L 12.591 8.127 L 12.661 8.174 C 12.975 8.381 13.493 8.611 14.333 8.920 C 18.157 10.271 20.000 12.160 20.000 15.500 C 20.000 17.630 19.242 19.232 17.705 20.424 C 16.412 21.447 14.283 22.000 12.000 22.000 C 9.600 22.000 7.280 21.356 5.514 20.374 C 5.158 20.176 4.957 19.781 5.008 19.376 L 5.508 15.376 C 5.550 15.043 5.755 14.753 6.056 14.604 C 6.357 14.455 6.712 14.467 7.002 14.635 C 8.294 15.385 10.642 16.000 12.000 16.000 C 12.390 16.000 12.704 15.853 12.870 15.705 L 12.905 15.670 L 12.815 15.635 C 12.648 15.575 11.232 15.142 10.662 14.941 C 7.036 13.637 5.000 11.332 5.000 8.000 C 5.000 6.113 5.882 4.437 7.370 3.223 C 8.590 2.236 9.887 2.000 12.500 2.000"),
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
        return _brandStripe!!
    }

private var _brandStripe: ImageVector? = null
