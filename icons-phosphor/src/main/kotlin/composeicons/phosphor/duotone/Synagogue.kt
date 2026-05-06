package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.Synagogue: ImageVector
    get() {
        if (_synagogue != null) return _synagogue!!
        _synagogue = phosphorDuotoneIcon(
            name = "Synagogue",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M216 80v32h-32v-32c0-8.837 7.163-16 16-16h0c8.837 0 16 7.163 16 16ZM72 80C72 71.163 64.837 64 56 64h0C47.163 64 40 71.163 40 80v32h32ZM72 136v80h40v-40c0-8.837 7.163-16 16-16h0c8.837 0 16 7.163 16 16v40h40v-80L128 104Z"),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color(0xFF000000)),
                fillAlpha = 0.2f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
            )
            addPath(
                pathData = parseSvgPathData("M208 57.38v-25.38c0-4.418-3.582-8-8-8-4.418 0-8 3.582-8 8v25.38C182.413 60.769 176.003 69.832 176 80v42.21L136 99.36v-27.36c0-4.418-3.582-8-8-8-4.418 0-8 3.582-8 8v27.36L80 122.21v-42.21C79.997 69.832 73.587 60.769 64 57.38v-25.38c0-4.418-3.582-8-8-8-4.418 0-8 3.582-8 8v25.38C38.413 60.769 32.003 69.832 32 80v136c0 4.418 3.582 8 8 8h72c4.418 0 8-3.582 8-8v-40c0-4.418 3.582-8 8-8 4.418 0 8 3.582 8 8v40c0 4.418 3.582 8 8 8h72c4.418 0 8-3.582 8-8v-136C223.997 69.832 217.587 60.769 208 57.38ZM200 72c4.418 0 8 3.582 8 8v24h-16v-24c0-4.418 3.582-8 8-8ZM56 72c4.418 0 8 3.582 8 8v24h-16v-24c0-4.418 3.582-8 8-8ZM48 120h16v88h-16ZM128 152c-13.255 0-24 10.745-24 24v32h-24v-67.36l48-27.43 48 27.43v67.36h-24v-32c0-13.255-10.745-24-24-24ZM192 208v-88h16v88Z"),
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
        return _synagogue!!
    }

private var _synagogue: ImageVector? = null
