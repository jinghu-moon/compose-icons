package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.AlignTopSimple: ImageVector
    get() {
        if (_alignTopSimple != null) return _alignTopSimple!!
        _alignTopSimple = phosphorBoldIcon(
            name = "AlignTopSimple",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M212 32c0 6.627-5.373 12-12 12h-144C49.373 44 44 38.627 44 32 44 25.373 49.373 20 56 20h144c6.627 0 12 5.373 12 12ZM180 80v144c0 11.046-8.954 20-20 20h-64C84.954 244 76 235.046 76 224v-144C76 68.954 84.954 60 96 60h64c11.046 0 20 8.954 20 20ZM156 84h-56v136h56Z"),
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
        return _alignTopSimple!!
    }

private var _alignTopSimple: ImageVector? = null
