package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Tornado: ImageVector
    get() {
        if (_tornado != null) return _tornado!!
        _tornado = phosphorFillIcon(
            name = "Tornado",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M144 228c0 6.627-5.373 12-12 12h-16c-6.627 0-12-5.373-12-12 0-6.627 5.373-12 12-12h16c6.627 0 12 5.373 12 12ZM220 32h-160C53.373 32 48 37.373 48 44c0 6.627 5.373 12 12 12 6.627 0 12 5.373 12 12 0 6.627-5.373 12-12 12h-16C37.373 80 32 85.373 32 92c0 6.627 5.373 12 12 12h32c6.627 0 12 5.373 12 12 0 6.627-5.373 12-12 12-6.627 0-12 5.373-12 12 0 6.627 5.373 12 12 12h48c6.627 0 12 5.373 12 12 0 6.627-5.373 12-12 12-6.627 0-12 5.373-12 12 0 6.627 5.373 12 12 12h48c6.627 0 12-5.373 12-12 0-6.627-5.373-12-12-12-6.627 0-12-5.373-12-12 0-6.627 5.373-12 12-12h16c6.627 0 12-5.373 12-12 0-6.627-5.373-12-12-12h-24c-6.627 0-12-5.373-12-12 0-6.627 5.373-12 12-12 6.627 0 12-5.373 12-12 0-6.627-5.373-12-12-12-6.627 0-12-5.373-12-12 0-6.627 5.373-12 12-12h56c6.627 0 12-5.373 12-12 0-6.627-5.373-12-12-12Z"),
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
        return _tornado!!
    }

private var _tornado: ImageVector? = null
