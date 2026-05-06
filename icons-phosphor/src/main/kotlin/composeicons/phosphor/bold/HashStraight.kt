package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.HashStraight: ImageVector
    get() {
        if (_hashStraight != null) return _hashStraight!!
        _hashStraight = phosphorBoldIcon(
            name = "HashStraight",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M216 148h-44v-40h44c6.627 0 12-5.373 12-12 0-6.627-5.373-12-12-12h-44v-44c0-6.627-5.373-12-12-12-6.627 0-12 5.373-12 12v44h-40v-44C108 33.373 102.627 28 96 28 89.373 28 84 33.373 84 40v44h-44C33.373 84 28 89.373 28 96c0 6.627 5.373 12 12 12h44v40h-44c-6.627 0-12 5.373-12 12 0 6.627 5.373 12 12 12h44v44c0 6.627 5.373 12 12 12 6.627 0 12-5.373 12-12v-44h40v44c0 6.627 5.373 12 12 12 6.627 0 12-5.373 12-12v-44h44c6.627 0 12-5.373 12-12 0-6.627-5.373-12-12-12ZM108 148v-40h40v40Z"),
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
        return _hashStraight!!
    }

private var _hashStraight: ImageVector? = null
