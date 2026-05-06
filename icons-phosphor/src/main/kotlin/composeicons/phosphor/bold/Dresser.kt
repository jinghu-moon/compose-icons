package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Dresser: ImageVector
    get() {
        if (_dresser != null) return _dresser!!
        _dresser = phosphorBoldIcon(
            name = "Dresser",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M148 176c0 6.627-5.373 12-12 12h-16c-6.627 0-12-5.373-12-12 0-6.627 5.373-12 12-12h16c6.627 0 12 5.373 12 12ZM120 92h16c6.627 0 12-5.373 12-12 0-6.627-5.373-12-12-12h-16c-6.627 0-12 5.373-12 12 0 6.627 5.373 12 12 12ZM220 40v176c0 11.046-8.954 20-20 20h-144C44.954 236 36 227.046 36 216v-176C36 28.954 44.954 20 56 20h144c11.046 0 20 8.954 20 20ZM60 44v72h136v-72ZM196 212v-72h-136v72Z"),
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
        return _dresser!!
    }

private var _dresser: ImageVector? = null
