package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.KeyReturn: ImageVector
    get() {
        if (_keyReturn != null) return _keyReturn!!
        _keyReturn = phosphorFillIcon(
            name = "KeyReturn",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M216 40h-176C31.163 40 24 47.163 24 56v144c0 8.837 7.163 16 16 16h176c8.837 0 16-7.163 16-16v-144c0-8.837-7.163-16-16-16ZM184 136c0 4.418-3.582 8-8 8h-76.69l10.35 10.34c3.126 3.126 3.126 8.194 0 11.32-3.126 3.126-8.194 3.126-11.32 0l-24-24C72.838 140.159 71.994 138.123 71.994 136c0-2.123 .844-4.159 2.346-5.66l24-24c3.126-3.126 8.194-3.126 11.32 0 3.126 3.126 3.126 8.194 0 11.32L99.31 128h68.69v-24c0-4.418 3.582-8 8-8 4.418 0 8 3.582 8 8Z"),
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
        return _keyReturn!!
    }

private var _keyReturn: ImageVector? = null
