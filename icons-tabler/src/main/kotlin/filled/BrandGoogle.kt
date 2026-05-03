package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.BrandGoogle: ImageVector
    get() {
        if (_brandGoogle != null) return _brandGoogle!!
        _brandGoogle = tablerFilledIcon(
            name = "BrandGoogle",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 12.000 2.000 C 14.290 1.997 16.512 2.783 18.290 4.226 C 18.517 4.410 18.653 4.684 18.660 4.977 C 18.668 5.269 18.547 5.550 18.330 5.746 L 16.820 7.108 C 16.466 7.426 15.937 7.452 15.555 7.168 C 13.470 5.635 10.636 5.612 8.527 7.111 C 6.417 8.610 5.506 11.293 6.267 13.767 C 7.028 16.241 9.289 17.947 11.877 18.001 C 14.464 18.055 16.795 16.444 17.658 14.004 L 17.659 14.000 L 13.999 14.000 C 13.492 13.999 13.066 13.620 13.007 13.117 L 13.000 13.000 L 13.000 11.000 C 13.000 10.448 13.448 10.000 14.000 10.000 L 20.945 10.000 C 21.455 10.000 21.883 10.383 21.939 10.890 C 21.979 11.257 22.000 11.627 22.000 12.000 C 22.000 17.523 17.523 22.000 12.000 22.000 C 6.477 22.000 2.000 17.523 2.000 12.000 C 2.000 6.477 6.477 2.000 12.000 2.000 Z"),
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
        return _brandGoogle!!
    }

private var _brandGoogle: ImageVector? = null
