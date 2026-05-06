package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Cards: ImageVector
    get() {
        if (_cards != null) return _cards!!
        _cards = phosphorBoldIcon(
            name = "Cards",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M180 72h-144C24.954 72 16 80.954 16 92v112c0 11.046 8.954 20 20 20h144c11.046 0 20-8.954 20-20v-112C200 80.954 191.046 72 180 72ZM176 200h-136v-104h136ZM240 52v124c0 6.627-5.373 12-12 12-6.627 0-12-5.373-12-12v-120h-152C57.373 56 52 50.627 52 44 52 37.373 57.373 32 64 32h156c11.046 0 20 8.954 20 20Z"),
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
        return _cards!!
    }

private var _cards: ImageVector? = null
