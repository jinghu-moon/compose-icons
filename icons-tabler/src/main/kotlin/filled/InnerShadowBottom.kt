package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.InnerShadowBottom: ImageVector
    get() {
        if (_innerShadowBottom != null) return _innerShadowBottom!!
        _innerShadowBottom = tablerFilledIcon(
            name = "InnerShadowBottom",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 5.144 4.720 C 9.064 1.025 15.237 1.095 19.071 4.929 C 22.976 8.834 22.976 15.166 19.071 19.071 C 15.166 22.976 8.834 22.976 4.929 19.071 C 1.024 15.166 1.024 8.834 4.929 4.929 ZM 8.464 15.536 C 8.213 15.276 7.841 15.172 7.491 15.263 C 7.142 15.355 6.869 15.628 6.777 15.977 C 6.686 16.327 6.790 16.699 7.050 16.950 C 8.363 18.263 10.143 19.001 12.000 19.001 C 13.857 19.001 15.637 18.263 16.950 16.950 C 17.329 16.558 17.324 15.934 16.938 15.548 C 16.552 15.162 15.928 15.157 15.536 15.536 C 14.598 16.474 13.326 17.001 12.000 17.001 C 10.674 17.001 9.402 16.474 8.464 15.536 Z"),
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
        return _innerShadowBottom!!
    }

private var _innerShadowBottom: ImageVector? = null
