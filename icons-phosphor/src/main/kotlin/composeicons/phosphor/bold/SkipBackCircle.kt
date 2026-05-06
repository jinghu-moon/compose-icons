package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.SkipBackCircle: ImageVector
    get() {
        if (_skipBackCircle != null) return _skipBackCircle!!
        _skipBackCircle = phosphorBoldIcon(
            name = "SkipBackCircle",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M128 20C68.353 20 20 68.353 20 128c0 59.647 48.353 108 108 108 59.647 0 108-48.353 108-108C235.934 68.381 187.619 20.066 128 20ZM128 212C81.608 212 44 174.392 44 128 44 81.608 81.608 44 128 44c46.392 0 84 37.608 84 84-.05 46.371-37.629 83.95-84 84ZM165.82 77.5c-3.816-2.116-8.48-1.993-12.18 .32L108 106.35v-18.35C108 81.373 102.627 76 96 76 89.373 76 84 81.373 84 88v80c0 6.627 5.373 12 12 12 6.627 0 12-5.373 12-12v-18.35l45.64 28.53c3.7 2.312 8.363 2.434 12.179 .319 3.816-2.116 6.182-6.136 6.181-10.499v-80c.002-4.363-2.364-8.384-6.18-10.5ZM148 146.35 118.64 128 148 109.65Z"),
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
        return _skipBackCircle!!
    }

private var _skipBackCircle: ImageVector? = null
