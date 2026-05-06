package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.CircleHalf: ImageVector
    get() {
        if (_circleHalf != null) return _circleHalf!!
        _circleHalf = phosphorThinIcon(
            name = "CircleHalf",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M128 28C72.772 28 28 72.772 28 128c0 55.228 44.772 100 100 100 55.228 0 100-44.772 100-100C227.939 72.797 183.203 28.061 128 28ZM132 36.09c8.155 .347 16.226 1.784 24 4.27v175.28c-7.774 2.486-15.845 3.923-24 4.27ZM164 43.34c8.724 3.735 16.82 8.795 24 15v139.35c-7.18 6.205-15.276 11.265-24 15ZM36 128C36.058 78.769 74.818 38.287 124 36.09v183.82C74.818 217.713 36.058 177.231 36 128ZM196 189.9v-123.8c31.998 35.064 31.998 88.736 0 123.8Z"),
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
        return _circleHalf!!
    }

private var _circleHalf: ImageVector? = null
