package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.AlignBottom: ImageVector
    get() {
        if (_alignBottom != null) return _alignBottom!!
        _alignBottom = phosphorBoldIcon(
            name = "AlignBottom",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M228 216c0 6.627-5.373 12-12 12h-176c-6.627 0-12-5.373-12-12 0-6.627 5.373-12 12-12h176c6.627 0 12 5.373 12 12ZM136 168v-88c0-11.046 8.954-20 20-20h36c11.046 0 20 8.954 20 20v88c0 11.046-8.954 20-20 20h-36c-11.046 0-20-8.954-20-20ZM160 164h28v-80h-28ZM44 168v-128C44 28.954 52.954 20 64 20h36c11.046 0 20 8.954 20 20v128c0 11.046-8.954 20-20 20h-36C52.954 188 44 179.046 44 168ZM68 164h28v-120h-28Z"),
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
        return _alignBottom!!
    }

private var _alignBottom: ImageVector? = null
