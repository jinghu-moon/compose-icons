package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.DeviceMobileCamera: ImageVector
    get() {
        if (_deviceMobileCamera != null) return _deviceMobileCamera!!
        _deviceMobileCamera = phosphorLightIcon(
            name = "DeviceMobileCamera",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M176 18h-96C67.85 18 58 27.85 58 40v176c0 12.15 9.85 22 22 22h96c12.15 0 22-9.85 22-22v-176C198 27.85 188.15 18 176 18ZM186 216c0 5.523-4.477 10-10 10h-96c-5.523 0-10-4.477-10-10v-176C70 34.477 74.477 30 80 30h96c5.523 0 10 4.477 10 10ZM138 60c0 5.523-4.477 10-10 10-5.523 0-10-4.477-10-10 0-5.523 4.477-10 10-10 5.523 0 10 4.477 10 10Z"),
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
        return _deviceMobileCamera!!
    }

private var _deviceMobileCamera: ImageVector? = null
