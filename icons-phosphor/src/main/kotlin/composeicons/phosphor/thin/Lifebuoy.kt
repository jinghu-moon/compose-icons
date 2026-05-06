package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Lifebuoy: ImageVector
    get() {
        if (_lifebuoy != null) return _lifebuoy!!
        _lifebuoy = phosphorThinIcon(
            name = "Lifebuoy",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M128 28C72.772 28 28 72.772 28 128c0 55.228 44.772 100 100 100 55.228 0 100-44.772 100-100C227.939 72.797 183.203 28.061 128 28ZM195.79 190.13l-34-34c13.599-16.296 13.599-39.984 0-56.28l34-34c32.279 35.131 32.279 89.129 0 124.26ZM92 128c0-19.882 16.118-36 36-36 19.882 0 36 16.118 36 36 0 19.882-16.118 36-36 36C108.118 164 92 147.882 92 128ZM190.13 60.21l-34 34c-16.296-13.599-39.984-13.599-56.28 0l-34-34c35.131-32.279 89.129-32.279 124.26 0ZM60.21 65.87l34 34c-13.599 16.296-13.599 39.984 0 56.28l-34 34C27.931 155.019 27.931 101.021 60.21 65.89ZM65.87 195.79l34-34c16.296 13.599 39.984 13.599 56.28 0l34 34c-35.131 32.279-89.129 32.279-124.26 0Z"),
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
        return _lifebuoy!!
    }

private var _lifebuoy: ImageVector? = null
