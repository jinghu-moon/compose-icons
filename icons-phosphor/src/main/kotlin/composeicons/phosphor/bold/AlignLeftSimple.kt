package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.AlignLeftSimple: ImageVector
    get() {
        if (_alignLeftSimple != null) return _alignLeftSimple!!
        _alignLeftSimple = phosphorBoldIcon(
            name = "AlignLeftSimple",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M44 56v144c0 6.627-5.373 12-12 12-6.627 0-12-5.373-12-12v-144C20 49.373 25.373 44 32 44c6.627 0 12 5.373 12 12ZM244 96v64c0 11.046-8.954 20-20 20h-144C68.954 180 60 171.046 60 160v-64C60 84.954 68.954 76 80 76h144c11.046 0 20 8.954 20 20ZM220 100h-136v56h136Z"),
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
        return _alignLeftSimple!!
    }

private var _alignLeftSimple: ImageVector? = null
