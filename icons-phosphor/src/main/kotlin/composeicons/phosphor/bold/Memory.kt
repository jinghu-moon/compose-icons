package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Memory: ImageVector
    get() {
        if (_memory != null) return _memory!!
        _memory = phosphorBoldIcon(
            name = "Memory",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M232 52h-208C12.954 52 4 60.954 4 72v128c0 6.627 5.373 12 12 12 6.627 0 12-5.373 12-12v-12h20v12c0 6.627 5.373 12 12 12 6.627 0 12-5.373 12-12v-12h20v12c0 6.627 5.373 12 12 12 6.627 0 12-5.373 12-12v-12h24v12c0 6.627 5.373 12 12 12 6.627 0 12-5.373 12-12v-12h20v12c0 6.627 5.373 12 12 12 6.627 0 12-5.373 12-12v-12h20v12c0 6.627 5.373 12 12 12 6.627 0 12-5.373 12-12v-128C252 60.954 243.046 52 232 52ZM28 76h200v88h-200ZM120 140v-40c0-6.627-5.373-12-12-12h-52c-6.627 0-12 5.373-12 12v40c0 6.627 5.373 12 12 12h52c6.627 0 12-5.373 12-12ZM96 128h-28v-16h28ZM148 152h52c6.627 0 12-5.373 12-12v-40c0-6.627-5.373-12-12-12h-52c-6.627 0-12 5.373-12 12v40c0 6.627 5.373 12 12 12ZM160 112h28v16h-28Z"),
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
        return _memory!!
    }

private var _memory: ImageVector? = null
