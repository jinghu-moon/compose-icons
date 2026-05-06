package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Spiral: ImageVector
    get() {
        if (_spiral != null) return _spiral!!
        _spiral = phosphorFillIcon(
            name = "Spiral",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M248 144c0 4.418-3.582 8-8 8-4.418 0-8-3.582-8-8C231.939 91.006 188.994 48.061 136 48c-1.4 0-2.8 0-4.18 .1C89.33 50.353 56.025 85.45 56 128c.039 35.33 28.67 63.961 64 64 24.289-.028 43.972-19.711 44-44 0-17.673-14.327-32-32-32-4.418 0-8 3.582-8 8 0 4.418 3.582 8 8 8 8.837 0 16 7.163 16 16 0 15.464-12.536 28-28 28C93.502 175.972 72.028 154.498 72 128c.039-35.33 28.67-63.961 64-64 44.162 .05 79.95 35.838 80 80-.055 48.578-39.422 87.945-88 88C75.006 231.939 32.061 188.994 32 136 32.061 78.588 78.588 32.061 136 32c61.828 .066 111.934 50.172 112 112Z"),
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
        return _spiral!!
    }

private var _spiral: ImageVector? = null
