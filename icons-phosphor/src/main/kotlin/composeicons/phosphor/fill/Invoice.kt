package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Invoice: ImageVector
    get() {
        if (_invoice != null) return _invoice!!
        _invoice = phosphorFillIcon(
            name = "Invoice",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M28 128c-4.418 0-8-3.582-8-8 0-4.418 3.582-8 8-8h28c4.418 0 8-3.582 8-8 0-4.418-3.582-8-8-8h-16C26.745 96 16 85.255 16 72 16 58.745 26.745 48 40 48c0-4.418 3.582-8 8-8 4.418 0 8 3.582 8 8h8c4.418 0 8 3.582 8 8 0 4.418-3.582 8-8 8h-24c-4.418 0-8 3.582-8 8 0 4.418 3.582 8 8 8h16c13.255 0 24 10.745 24 24 0 13.255-10.745 24-24 24 0 4.418-3.582 8-8 8-4.418 0-8-3.582-8-8ZM224 48h-128c-4.418 0-8 3.582-8 8 0 4.418 3.582 8 8 8h120v32h-112c-4.418 0-8 3.582-8 8 0 4.418 3.582 8 8 8h56v32h-80c-4.418 0-8 3.582-8 8 0 4.418 3.582 8 8 8h80v32h-120v-40c0-4.418-3.582-8-8-8-4.418 0-8 3.582-8 8v40c0 8.837 7.163 16 16 16h176c8.837 0 16-7.163 16-16v-136c0-4.418-3.582-8-8-8Z"),
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
        return _invoice!!
    }

private var _invoice: ImageVector? = null
