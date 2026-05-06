package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Balloon: ImageVector
    get() {
        if (_balloon != null) return _balloon!!
        _balloon = phosphorLightIcon(
            name = "Balloon",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M128 18C80.526 18.055 42.055 56.526 42 104c0 23 9.24 48.52 24.71 68.27 12.37 15.79 27.23 26.42 43.05 31.07L98.49 229.64c-.793 1.853-.602 3.979 .507 5.662 1.109 1.682 2.988 2.696 5.003 2.698h48c2.015-.002 3.894-1.016 5.003-2.698 1.109-1.682 1.299-3.809 .507-5.662L146.24 203.34c15.82-4.65 30.68-15.28 43-31.07C204.76 152.52 214 127 214 104 213.945 56.526 175.474 18.055 128 18ZM112.17 204l.58 .14c-.199-.018-.395-.065-.58-.14ZM142.9 226h-29.8l8.7-20.31c4.123 .413 8.277 .413 12.4 0ZM128 194C94.48 194 54 153.85 54 104 54 63.131 87.131 30 128 30c40.869 0 74 33.131 74 74 0 49.85-40.48 90-74 90ZM177 101.92c-.331 .051-.665 .078-1 .08-2.926-.003-5.422-2.115-5.91-5C166.92 79.099 152.902 65.085 135 61.92c-3.27-.552-5.472-3.65-4.92-6.92 .552-3.27 3.65-5.472 6.92-4.92 22.912 4.071 40.849 22.008 44.92 44.92 .266 1.57-.103 3.182-1.026 4.48-.923 1.298-2.324 2.176-3.894 2.44Z"),
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
        return _balloon!!
    }

private var _balloon: ImageVector? = null
