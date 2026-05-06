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
                pathData = parseSvgPathData("M5.144 4.72C9.064 1.025 15.237 1.095 19.071 4.929c3.905 3.905 3.905 10.237 0 14.142-3.905 3.905-10.237 3.905-14.142 0C1.024 15.166 1.024 8.834 4.929 4.929ZM8.464 15.536c-.251-.26-.623-.364-.973-.273-.35 .092-.623 .365-.714 .714-.092 .35 .013 .721 .273 .973 1.313 1.313 3.093 2.051 4.95 2.051 1.857 0 3.637-.738 4.95-2.051 .379-.392 .374-1.016-.012-1.402-.386-.386-1.009-.391-1.402-.012-.938 .938-2.21 1.465-3.536 1.465-1.326 0-2.598-.527-3.536-1.465Z"),
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
