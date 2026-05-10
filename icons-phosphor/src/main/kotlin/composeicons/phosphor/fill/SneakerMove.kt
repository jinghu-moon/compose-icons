package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.SneakerMove: ImageVector
    get() {
        if (_sneakerMove != null) return _sneakerMove!!
        _sneakerMove = phosphorFillIcon(
            name = "SneakerMove",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M70.8 184h-38.8c-4.418 0-8-3.582-8-8 0-4.418 3.582-8 8-8h38.8c4.418 0 8 3.582 8 8 0 4.418-3.582 8-8 8ZM102.8 200h-54.8c-4.418 0-8 3.582-8 8 0 4.418 3.582 8 8 8h54.8c4.418 0 8-3.582 8-8 0-4.418-3.582-8-8-8ZM231.16 166.63 202.53 152.32C186.228 144.236 175.939 127.587 176 109.39v-29.39c0-4.391-3.539-7.962-7.93-8C141.572 72.011 120.066 50.568 120 24.07c.024-3.048-1.687-5.845-4.411-7.213-2.724-1.367-5.989-1.068-8.419 .773L45.11 64.68c-.916 .699-1.486 1.758-1.564 2.907-.079 1.149 .342 2.276 1.154 3.093l51.44 51.44c3.059 2.976 3.32 7.802 .6 11.09-1.453 1.682-3.54 2.684-5.761 2.766-2.221 .082-4.376-.765-5.949-2.336l-53-53c-.916-.92-2.222-1.338-3.502-1.122-1.28 .217-2.376 1.041-2.938 2.212-2.928 6.121-1.678 13.423 3.12 18.22L142.4 213.66c1.502 1.5 3.538 2.342 5.66 2.34h75.94c8.837 0 16-7.163 16-16v-19.06c.019-6.064-3.408-11.613-8.84-14.31Z"),
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
        return _sneakerMove!!
    }

private var _sneakerMove: ImageVector? = null
