package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.DeviceMobileCamera: ImageVector
    get() {
        if (_deviceMobileCamera != null) return _deviceMobileCamera!!
        _deviceMobileCamera = phosphorRegularIcon(
            name = "DeviceMobileCamera",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M176 16h-96C66.745 16 56 26.745 56 40v176c0 13.255 10.745 24 24 24h96c13.255 0 24-10.745 24-24v-176C200 26.745 189.255 16 176 16ZM184 216c0 4.418-3.582 8-8 8h-96c-4.418 0-8-3.582-8-8v-176c0-4.418 3.582-8 8-8h96c4.418 0 8 3.582 8 8ZM140 60c0 6.627-5.373 12-12 12-6.627 0-12-5.373-12-12 0-6.627 5.373-12 12-12 6.627 0 12 5.373 12 12Z"),
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
