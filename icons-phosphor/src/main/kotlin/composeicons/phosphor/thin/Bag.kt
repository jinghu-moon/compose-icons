package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Bag: ImageVector
    get() {
        if (_bag != null) return _bag!!
        _bag = phosphorThinIcon(
            name = "Bag",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M216 68h-44v-4C172 39.699 152.301 20 128 20 103.699 20 84 39.699 84 64v4h-44C33.373 68 28 73.373 28 80v120c0 6.627 5.373 12 12 12h176c6.627 0 12-5.373 12-12v-120c0-6.627-5.373-12-12-12ZM92 64C92 44.118 108.118 28 128 28c19.882 0 36 16.118 36 36v4h-72ZM220 200c0 2.209-1.791 4-4 4h-176c-2.209 0-4-1.791-4-4v-120c0-2.209 1.791-4 4-4h44v20c0 2.209 1.791 4 4 4 2.209 0 4-1.791 4-4v-20h72v20c0 2.209 1.791 4 4 4 2.209 0 4-1.791 4-4v-20h44c2.209 0 4 1.791 4 4Z"),
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
        return _bag!!
    }

private var _bag: ImageVector? = null
