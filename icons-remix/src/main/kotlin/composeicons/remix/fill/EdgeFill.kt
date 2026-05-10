package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.EdgeFill: ImageVector
    get() {
        if (_edgeFill != null) return _edgeFill!!
        _edgeFill = remixIcon(
            name = "EdgeFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M20.645 8.586c-.17-.711-.441-1.448-.774-2.021C19.1 5.236 18.407 4.328 16.694 3.245 14.981 2.162 13.077 2 12.171 2 9.756 2 7.96 2.86 6.646 3.887 3.345 6.47 3.001 11 3.001 11c0 0 1.221-2.045 3.54-3.526C7.944 6.579 9.942 6 11.569 6c4.317 0 4.432 4 4.432 4h-7c0-2 1-3 1-3 0 0-5 2-5 7.044 0 .487-.003 1.372 .248 2.283 .232 .843 .7 1.705 1.132 2.353 1.221 1.832 3.045 2.614 3.916 2.904 .996 .332 2.029 .416 3.01 .416 2.72 0 4.877-.886 5.694-1.275v-4.172C18.243 17.007 16.322 18 14.001 18 9.001 18 9.001 14 9.001 14h12v-2.49c0 0-.039-1.593-.356-2.924Z"),
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
        return _edgeFill!!
    }

private var _edgeFill: ImageVector? = null
