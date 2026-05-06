package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.UserRectangle: ImageVector
    get() {
        if (_userRectangle != null) return _userRectangle!!
        _userRectangle = phosphorLightIcon(
            name = "UserRectangle",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M216 42h-176C32.268 42 26 48.268 26 56v144c0 7.732 6.268 14 14 14h176c7.732 0 14-6.268 14-14v-144c0-7.732-6.268-14-14-14ZM94 120c0-18.778 15.222-34 34-34 18.778 0 34 15.222 34 34 0 18.778-15.222 34-34 34C109.222 154 94 138.778 94 120ZM69.21 202C80.484 179.904 103.194 165.996 128 165.996c24.806 0 47.516 13.909 58.79 36.004ZM218 200c0 1.105-.895 2-2 2h-16c-8.588-20.531-25.519-36.43-46.55-43.71 16.898-11.223 24.449-32.19 18.588-51.61C166.176 87.26 148.285 73.972 128 73.972c-20.285 0-38.176 13.288-44.038 32.708-5.862 19.42 1.69 40.387 18.588 51.61C81.519 165.57 64.588 181.469 56 202h-16c-1.105 0-2-.895-2-2v-144c0-1.105 .895-2 2-2h176c1.105 0 2 .895 2 2Z"),
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
        return _userRectangle!!
    }

private var _userRectangle: ImageVector? = null
