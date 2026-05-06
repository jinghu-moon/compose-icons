package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.CloudFog: ImageVector
    get() {
        if (_cloudFog != null) return _cloudFog!!
        _cloudFog = phosphorDuotoneIcon(
            name = "CloudFog",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M224 100c0 37.555-30.445 68-68 68h-80C58.556 167.983 42.769 157.663 35.755 141.69 28.742 125.718 31.826 107.111 43.618 94.256 55.411 81.401 73.683 76.727 90.2 82.34v.11C99.038 49.473 130.94 28.146 164.791 32.587 198.642 37.027 223.966 65.859 224 100Z"),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color(0xFF000000)),
                fillAlpha = 0.2f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
            )
            addPath(
                pathData = parseSvgPathData("M120 208h-48c-4.418 0-8-3.582-8-8 0-4.418 3.582-8 8-8h48c4.418 0 8 3.582 8 8 0 4.418-3.582 8-8 8ZM184 192h-24c-4.418 0-8 3.582-8 8 0 4.418 3.582 8 8 8h24c4.418 0 8-3.582 8-8 0-4.418-3.582-8-8-8ZM160 224h-56c-4.418 0-8 3.582-8 8 0 4.418 3.582 8 8 8h56c4.418 0 8-3.582 8-8 0-4.418-3.582-8-8-8ZM232 100c-.044 41.955-34.045 75.956-76 76h-80C47.281 176 24 152.719 24 124 24 95.281 47.281 72 76 72c2.989 .003 5.973 .257 8.92 .76C98.084 38.567 133.749 18.614 169.775 25.286 205.801 31.959 231.955 63.361 232 100ZM216 100C215.867 67.615 190.082 41.168 157.712 40.213 125.341 39.258 98.042 64.14 96 96.46c-.254 4.418-4.042 7.794-8.46 7.54C83.122 103.746 79.746 99.958 80 95.54q.21-3.66 .77-7.23C79.188 88.107 77.595 88.003 76 88 56.118 88 40 104.118 40 124c0 19.882 16.118 36 36 36h80c33.121-.039 59.961-26.879 60-60Z"),
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
        return _cloudFog!!
    }

private var _cloudFog: ImageVector? = null
