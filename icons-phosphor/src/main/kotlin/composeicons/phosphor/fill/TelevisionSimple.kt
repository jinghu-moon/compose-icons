package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.TelevisionSimple: ImageVector
    get() {
        if (_televisionSimple != null) return _televisionSimple!!
        _televisionSimple = phosphorFillIcon(
            name = "TelevisionSimple",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M216 64h-68.69L181.66 29.66c3.126-3.126 3.126-8.194 0-11.32-3.126-3.126-8.194-3.126-11.32 0L128 60.69 85.66 18.34c-3.126-3.126-8.194-3.126-11.32 0-3.126 3.126-3.126 8.194 0 11.32L108.69 64h-68.69C31.163 64 24 71.163 24 80v120c0 8.837 7.163 16 16 16h176c8.837 0 16-7.163 16-16v-120c0-8.837-7.163-16-16-16ZM216 200h-176v-120h176v120ZM200 100v80c0 2.209-1.791 4-4 4h-136c-2.209 0-4-1.791-4-4v-80c0-2.209 1.791-4 4-4h136c2.209 0 4 1.791 4 4Z"),
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
        return _televisionSimple!!
    }

private var _televisionSimple: ImageVector? = null
