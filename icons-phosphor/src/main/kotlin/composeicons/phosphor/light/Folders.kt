package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Folders: ImageVector
    get() {
        if (_folders != null) return _folders!!
        _folders = phosphorLightIcon(
            name = "Folders",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M224 66h-70L125.73 44.8C123.307 42.982 120.359 42 117.33 42h-45.33C64.268 42 58 48.268 58 56v18h-18C32.268 74 26 80.268 26 88v112c0 7.732 6.268 14 14 14h152.89c7.238-.006 13.104-5.872 13.11-13.11v-18.89h18.89c7.238-.006 13.104-5.872 13.11-13.11v-88.89c0-7.732-6.268-14-14-14ZM194 200.89c0 .613-.497 1.11-1.11 1.11h-152.89c-1.105 0-2-.895-2-2v-112c0-1.105 .895-2 2-2h45.33c.433 0 .854 .14 1.2 .4l29.87 22.4c1.039 .779 2.302 1.2 3.6 1.2h72c1.105 0 2 .895 2 2ZM226 168.89c0 .613-.497 1.11-1.11 1.11h-18.89v-58c0-7.732-6.268-14-14-14h-70L93.73 76.8C91.307 74.982 88.359 74 85.33 74h-15.33v-18c0-1.105 .895-2 2-2h45.33c.433 0 .854 .14 1.2 .4l29.87 22.4c1.039 .779 2.302 1.2 3.6 1.2h72c1.105 0 2 .895 2 2Z"),
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
        return _folders!!
    }

private var _folders: ImageVector? = null
