package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.CloudSnow: ImageVector
    get() {
        if (_cloudSnow != null) return _cloudSnow!!
        _cloudSnow = phosphorRegularIcon(
            name = "CloudSnow",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M88 196c0 6.627-5.373 12-12 12-6.627 0-12-5.373-12-12 0-6.627 5.373-12 12-12 6.627 0 12 5.373 12 12ZM116 200c-6.627 0-12 5.373-12 12 0 6.627 5.373 12 12 12 6.627 0 12-5.373 12-12 0-6.627-5.373-12-12-12ZM164 184c-6.627 0-12 5.373-12 12 0 6.627 5.373 12 12 12 6.627 0 12-5.373 12-12 0-6.627-5.373-12-12-12ZM68 224c-6.627 0-12 5.373-12 12 0 6.627 5.373 12 12 12 6.627 0 12-5.373 12-12 0-6.627-5.373-12-12-12ZM156 224c-6.627 0-12 5.373-12 12 0 6.627 5.373 12 12 12 6.627 0 12-5.373 12-12 0-6.627-5.373-12-12-12ZM232 92c-.044 41.955-34.045 75.956-76 76h-80C47.281 168 24 144.719 24 116 24 87.281 47.281 64 76 64c2.989 .003 5.973 .257 8.92 .76C98.084 30.567 133.749 10.614 169.775 17.286 205.801 23.959 231.955 55.361 232 92ZM216 92C215.867 59.615 190.082 33.168 157.712 32.213 125.341 31.258 98.042 56.14 96 88.46c-.254 4.418-4.042 7.794-8.46 7.54C83.122 95.746 79.746 91.958 80 87.54q.21-3.66 .77-7.23C79.188 80.107 77.595 80.003 76 80 56.118 80 40 96.118 40 116c0 19.882 16.118 36 36 36h80c33.121-.039 59.961-26.879 60-60Z"),
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
        return _cloudSnow!!
    }

private var _cloudSnow: ImageVector? = null
