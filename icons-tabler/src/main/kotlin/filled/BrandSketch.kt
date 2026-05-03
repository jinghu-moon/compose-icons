package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.BrandSketch: ImageVector
    get() {
        if (_brandSketch != null) return _brandSketch!!
        _brandSketch = tablerFilledIcon(
            name = "BrandSketch",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 7.554 3.004 L 16.483 3.004 C 17.142 3.006 17.758 3.332 18.130 3.877 L 21.666 9.070 C 22.189 9.837 22.118 10.863 21.493 11.550 L 13.493 20.340 C 13.113 20.758 12.573 20.997 12.008 20.997 C 11.443 20.997 10.903 20.758 10.523 20.340 L 2.523 11.551 C 2.473 11.498 2.430 11.439 2.393 11.376 L 2.381 11.350 L 2.330 11.278 C 1.933 10.653 1.911 9.860 2.274 9.215 L 2.364 9.069 L 5.905 3.876 C 6.277 3.332 6.892 3.006 7.554 3.004"),
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
        return _brandSketch!!
    }

private var _brandSketch: ImageVector? = null
