package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.InnerShadowRight: ImageVector
    get() {
        if (_innerShadowRight != null) return _innerShadowRight!!
        _innerShadowRight = tablerFilledIcon(
            name = "InnerShadowRight",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 4.929 4.929 C 8.834 1.024 15.166 1.024 19.071 4.929 C 22.976 8.834 22.976 15.166 19.071 19.071 C 15.166 22.976 8.834 22.976 4.929 19.071 C 1.024 15.166 1.024 8.834 4.929 4.929 ZM 16.949 7.050 C 16.555 6.681 15.939 6.691 15.558 7.073 C 15.176 7.455 15.166 8.070 15.536 8.464 C 16.474 9.402 17.001 10.674 17.001 12.000 C 17.001 13.326 16.474 14.598 15.536 15.536 C 15.157 15.928 15.162 16.552 15.548 16.938 C 15.934 17.324 16.558 17.329 16.950 16.950 C 18.263 15.637 19.001 13.857 19.001 12.000 C 19.001 10.143 18.263 8.363 16.950 7.050 Z"),
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
        return _innerShadowRight!!
    }

private var _innerShadowRight: ImageVector? = null
