package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.Badge3D: ImageVector
    get() {
        if (_badge3D != null) return _badge3D!!
        _badge3D = tablerFilledIcon(
            name = "Badge3D",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 19.000 4.000 C 20.657 4.000 22.000 5.343 22.000 7.000 L 22.000 17.000 C 22.000 18.657 20.657 20.000 19.000 20.000 L 5.000 20.000 C 3.343 20.000 2.000 18.657 2.000 17.000 L 2.000 7.000 C 2.000 5.343 3.343 4.000 5.000 4.000 ZM 8.500 8.000 L 7.000 8.000 C 6.448 8.000 6.000 8.448 6.000 9.000 C 6.000 9.552 6.448 10.000 7.000 10.000 L 8.500 10.000 C 8.759 10.000 8.975 10.197 8.999 10.455 C 9.022 10.713 8.845 10.946 8.590 10.992 L 8.500 11.000 L 8.000 11.000 C 6.713 11.000 6.668 12.864 7.867 12.993 L 8.000 13.000 L 8.500 13.000 C 8.776 13.000 9.000 13.224 9.000 13.500 C 9.000 13.776 8.776 14.000 8.500 14.000 L 7.000 14.000 C 6.448 14.000 6.000 14.448 6.000 15.000 C 6.000 15.552 6.448 16.000 7.000 16.000 L 8.500 16.000 C 9.881 16.000 11.000 14.881 11.000 13.500 L 10.995 13.336 C 10.964 12.862 10.798 12.407 10.518 12.024 L 10.499 12.000 L 10.518 11.976 C 11.074 11.216 11.156 10.208 10.730 9.369 C 10.303 8.529 9.442 8.000 8.500 8.000M 15.000 8.000 L 14.000 8.000 C 13.448 8.000 13.000 8.448 13.000 9.000 L 13.000 15.000 C 13.000 15.552 13.448 16.000 14.000 16.000 L 15.000 16.000 C 16.657 16.000 18.000 14.657 18.000 13.000 L 18.000 11.000 C 18.000 9.343 16.657 8.000 15.000 8.000M 15.000 10.000 C 15.552 10.000 16.000 10.448 16.000 11.000 L 16.000 13.000 C 16.000 13.507 15.620 13.934 15.117 13.993 L 15.000 14.000 Z"),
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
        return _badge3D!!
    }

private var _badge3D: ImageVector? = null
