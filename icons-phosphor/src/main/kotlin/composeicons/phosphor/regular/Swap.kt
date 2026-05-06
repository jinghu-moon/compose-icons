package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.Swap: ImageVector
    get() {
        if (_swap != null) return _swap!!
        _swap = phosphorRegularIcon(
            name = "Swap",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M224 48v104c0 8.837-7.163 16-16 16h-108.69l10.35 10.34c3.126 3.126 3.126 8.194 0 11.32-3.126 3.126-8.194 3.126-11.32 0l-24-24C72.838 164.159 71.994 162.123 71.994 160c0-2.123 .844-4.159 2.346-5.66l24-24c3.126-3.126 8.194-3.126 11.32 0 3.126 3.126 3.126 8.194 0 11.32L99.31 152h108.69v-104h-112v8c0 4.418-3.582 8-8 8-4.418 0-8-3.582-8-8v-8C80 39.163 87.163 32 96 32h112c8.837 0 16 7.163 16 16ZM168 192c-4.418 0-8 3.582-8 8v8h-112v-104h108.69l-10.35 10.34c-3.126 3.126-3.126 8.194 0 11.32 3.126 3.126 8.194 3.126 11.32 0l24-24c1.502-1.501 2.346-3.537 2.346-5.66 0-2.123-.844-4.159-2.346-5.66l-24-24c-3.126-3.126-8.194-3.126-11.32 0-3.126 3.126-3.126 8.194 0 11.32L156.69 88h-108.69c-8.837 0-16 7.163-16 16v104c0 8.837 7.163 16 16 16h112c8.837 0 16-7.163 16-16v-8c0-4.418-3.582-8-8-8Z"),
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
        return _swap!!
    }

private var _swap: ImageVector? = null
