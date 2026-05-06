package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Barricade: ImageVector
    get() {
        if (_barricade != null) return _barricade!!
        _barricade = phosphorFillIcon(
            name = "Barricade",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M224 64h-192C23.163 64 16 71.163 16 80v72c0 8.837 7.163 16 16 16h24v32c0 4.418 3.582 8 8 8 4.418 0 8-3.582 8-8v-32h112v32c0 4.418 3.582 8 8 8 4.418 0 8-3.582 8-8v-32h24c8.837 0 16-7.163 16-16v-72c0-8.837-7.163-16-16-16ZM32 152v-60l60 60ZM224 152h-56.69l-72-72h68.69l60 60v12Z"),
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
        return _barricade!!
    }

private var _barricade: ImageVector? = null
