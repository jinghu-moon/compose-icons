package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.InnerShadowLeft: ImageVector
    get() {
        if (_innerShadowLeft != null) return _innerShadowLeft!!
        _innerShadowLeft = tablerFilledIcon(
            name = "InnerShadowLeft",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 4.929 4.929 C 8.834 1.024 15.166 1.024 19.071 4.929 C 22.976 8.834 22.976 15.166 19.071 19.071 C 15.166 22.976 8.834 22.976 4.929 19.071 C 1.024 15.166 1.024 8.834 4.929 4.929 ZM 8.464 7.050 C 8.073 6.660 7.440 6.660 7.050 7.050 C 5.737 8.363 4.999 10.143 4.999 12.000 C 4.999 13.857 5.737 15.637 7.050 16.950 C 7.301 17.210 7.673 17.314 8.023 17.223 C 8.372 17.131 8.645 16.858 8.737 16.509 C 8.828 16.159 8.724 15.787 8.464 15.536 C 7.526 14.598 6.999 13.326 6.999 12.000 C 6.999 10.674 7.526 9.402 8.464 8.464 C 8.854 8.073 8.854 7.440 8.464 7.050 Z"),
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
        return _innerShadowLeft!!
    }

private var _innerShadowLeft: ImageVector? = null
