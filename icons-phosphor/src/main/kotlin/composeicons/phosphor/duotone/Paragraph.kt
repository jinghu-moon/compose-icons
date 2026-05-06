package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.Paragraph: ImageVector
    get() {
        if (_paragraph != null) return _paragraph!!
        _paragraph = phosphorDuotoneIcon(
            name = "Paragraph",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M144 48v112h-48C65.072 160 40 134.928 40 104 40 73.072 65.072 48 96 48Z"),
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
                pathData = parseSvgPathData("M208 40h-112C60.654 40 32 68.654 32 104c0 35.346 28.654 64 64 64h40v40c0 4.418 3.582 8 8 8 4.418 0 8-3.582 8-8v-152h24v152c0 4.418 3.582 8 8 8 4.418 0 8-3.582 8-8v-152h16c4.418 0 8-3.582 8-8 0-4.418-3.582-8-8-8ZM136 152h-40C69.49 152 48 130.51 48 104 48 77.49 69.49 56 96 56h40Z"),
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
        return _paragraph!!
    }

private var _paragraph: ImageVector? = null
