package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Lifebuoy: ImageVector
    get() {
        if (_lifebuoy != null) return _lifebuoy!!
        _lifebuoy = phosphorLightIcon(
            name = "Lifebuoy",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M128 26C71.667 26 26 71.667 26 128c0 56.333 45.667 102 102 102 56.333 0 102-45.667 102-102C229.934 71.694 184.306 26.066 128 26ZM164.47 156c12.717-16.501 12.717-39.499 0-56L195.71 68.77c29.721 33.886 29.721 84.554 0 118.44ZM94 128c0-18.778 15.222-34 34-34 18.778 0 34 15.222 34 34 0 18.778-15.222 34-34 34C109.222 162 94 146.778 94 128ZM187.22 60.29 156 91.53c-16.501-12.717-39.499-12.717-56 0L68.78 60.29c33.886-29.721 84.554-29.721 118.44 0ZM60.29 68.78 91.53 100c-12.717 16.501-12.717 39.499 0 56L60.29 187.22C30.569 153.334 30.569 102.666 60.29 68.78ZM68.78 195.71 100 164.47c16.501 12.717 39.499 12.717 56 0l31.23 31.24c-33.886 29.721-84.554 29.721-118.44 0Z"),
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
