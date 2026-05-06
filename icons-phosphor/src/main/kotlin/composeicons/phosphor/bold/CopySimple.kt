package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.CopySimple: ImageVector
    get() {
        if (_copySimple != null) return _copySimple!!
        _copySimple = phosphorBoldIcon(
            name = "CopySimple",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M180 64h-140C33.373 64 28 69.373 28 76v140c0 6.627 5.373 12 12 12h140c6.627 0 12-5.373 12-12v-140c0-6.627-5.373-12-12-12ZM168 204h-116v-116h116ZM228 40v140c0 6.627-5.373 12-12 12-6.627 0-12-5.373-12-12v-128h-128C69.373 52 64 46.627 64 40 64 33.373 69.373 28 76 28h140c6.627 0 12 5.373 12 12Z"),
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
        return _copySimple!!
    }

private var _copySimple: ImageVector? = null
