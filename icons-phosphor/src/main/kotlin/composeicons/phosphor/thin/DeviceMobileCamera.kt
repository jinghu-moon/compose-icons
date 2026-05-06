package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.DeviceMobileCamera: ImageVector
    get() {
        if (_deviceMobileCamera != null) return _deviceMobileCamera!!
        _deviceMobileCamera = phosphorThinIcon(
            name = "DeviceMobileCamera",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M176 20h-96C68.954 20 60 28.954 60 40v176c0 11.046 8.954 20 20 20h96c11.046 0 20-8.954 20-20v-176C196 28.954 187.046 20 176 20ZM188 216c0 6.627-5.373 12-12 12h-96c-6.627 0-12-5.373-12-12v-176C68 33.373 73.373 28 80 28h96c6.627 0 12 5.373 12 12ZM136 60c0 4.418-3.582 8-8 8-4.418 0-8-3.582-8-8 0-4.418 3.582-8 8-8 4.418 0 8 3.582 8 8Z"),
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
