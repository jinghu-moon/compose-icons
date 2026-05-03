package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.InnerShadowTop: ImageVector
    get() {
        if (_innerShadowTop != null) return _innerShadowTop!!
        _innerShadowTop = tablerFilledIcon(
            name = "InnerShadowTop",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 4.929 4.929 C 8.834 1.024 15.166 1.024 19.071 4.929 C 22.976 8.834 22.976 15.166 19.071 19.071 C 15.166 22.976 8.834 22.976 4.929 19.071 C 1.024 15.166 1.024 8.834 4.929 4.929 ZM 16.949 7.050 C 14.215 4.317 9.784 4.317 7.050 7.050 C 6.671 7.442 6.676 8.066 7.062 8.452 C 7.448 8.838 8.072 8.843 8.464 8.464 C 9.402 7.526 10.674 6.999 12.000 6.999 C 13.326 6.999 14.598 7.526 15.536 8.464 C 15.928 8.843 16.552 8.838 16.938 8.452 C 17.324 8.066 17.329 7.442 16.950 7.050 Z"),
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
        return _innerShadowTop!!
    }

private var _innerShadowTop: ImageVector? = null
