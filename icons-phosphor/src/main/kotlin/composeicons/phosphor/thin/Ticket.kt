package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Ticket: ImageVector
    get() {
        if (_ticket != null) return _ticket!!
        _ticket = phosphorThinIcon(
            name = "Ticket",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M232 100c2.209 0 4-1.791 4-4v-32c0-6.627-5.373-12-12-12h-192C25.373 52 20 57.373 20 64v32c0 2.209 1.791 4 4 4 15.464 0 28 12.536 28 28 0 15.464-12.536 28-28 28-2.209 0-4 1.791-4 4v32c0 6.627 5.373 12 12 12h192c6.627 0 12-5.373 12-12v-32c0-2.209-1.791-4-4-4-15.464 0-28-12.536-28-28 0-15.464 12.536-28 28-28ZM28 192v-28.22C46.232 161.755 60.026 146.344 60.026 128 60.026 109.656 46.232 94.245 28 92.22v-28.22c0-2.209 1.791-4 4-4h60v136h-60c-2.209 0-4-1.791-4-4ZM196 128c.026 18.325 13.791 33.717 32 35.78v28.22c0 2.209-1.791 4-4 4h-124v-136h124c2.209 0 4 1.791 4 4v28.22C209.791 94.283 196.026 109.675 196 128Z"),
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
