package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Ticket: ImageVector
    get() {
        if (_ticket != null) return _ticket!!
        _ticket = phosphorBoldIcon(
            name = "Ticket",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M232 108c6.627 0 12-5.373 12-12v-32C244 52.954 235.046 44 224 44h-192C20.954 44 12 52.954 12 64v32c0 6.627 5.373 12 12 12 11.046 0 20 8.954 20 20 0 11.046-8.954 20-20 20-6.627 0-12 5.373-12 12v32c0 11.046 8.954 20 20 20h192c11.046 0 20-8.954 20-20v-32c0-6.627-5.373-12-12-12-11.046 0-20-8.954-20-20 0-11.046 8.954-20 20-20ZM36 170.34C54.947 164.983 68.028 147.69 68.028 128 68.028 108.31 54.947 91.017 36 85.66v-17.66h52v120h-52ZM220 170.34v17.66h-108v-120h108v17.66C201.053 91.017 187.972 108.31 187.972 128c0 19.69 13.081 36.983 32.028 42.34Z"),
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
        return _ticket!!
    }

private var _ticket: ImageVector? = null
