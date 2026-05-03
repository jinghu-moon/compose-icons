package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.Star: ImageVector
    get() {
        if (_star != null) return _star!!
        _star = tablerFilledIcon(
            name = "Star",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 8.243 7.340 L 1.863 8.265 L 1.750 8.288 C 1.402 8.380 1.130 8.653 1.039 9.002 C 0.948 9.350 1.051 9.721 1.310 9.972 L 5.932 14.471 L 4.842 20.826 L 4.829 20.936 C 4.808 21.296 4.982 21.640 5.285 21.836 C 5.589 22.031 5.974 22.048 6.293 21.880 L 11.999 18.880 L 17.692 21.880 L 17.792 21.926 C 18.128 22.058 18.509 21.999 18.790 21.771 C 19.070 21.543 19.205 21.182 19.144 20.826 L 18.053 14.471 L 22.677 9.971 L 22.755 9.886 C 22.982 9.607 23.041 9.227 22.910 8.892 C 22.779 8.557 22.478 8.318 22.122 8.266 L 15.742 7.340 L 12.890 1.560 C 12.722 1.218 12.374 1.002 11.993 1.002 C 11.612 1.002 11.264 1.218 11.096 1.560 L 8.243 7.340 Z"),
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
        return _star!!
    }

private var _star: ImageVector? = null
