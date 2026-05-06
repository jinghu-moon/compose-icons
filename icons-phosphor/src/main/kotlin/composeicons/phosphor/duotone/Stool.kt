package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.Stool: ImageVector
    get() {
        if (_stool != null) return _stool!!
        _stool = phosphorDuotoneIcon(
            name = "Stool",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M192 40v24c0 4.418-3.582 8-8 8h-112c-4.418 0-8-3.582-8-8v-24c0-4.418 3.582-8 8-8h112c4.418 0 8 3.582 8 8Z"),
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
                pathData = parseSvgPathData("M200 64v-24c0-8.837-7.163-16-16-16h-112C63.163 24 56 31.163 56 40v24c0 8.837 7.163 16 16 16h6.64L56.1 222.75c-.689 4.363 2.287 8.459 6.65 9.15 .413 .067 .831 .1 1.25 .1 3.931-.006 7.276-2.867 7.89-6.75L79.68 176h96.64l7.78 49.25c.615 3.887 3.965 6.749 7.9 6.75 .422 .001 .843-.033 1.26-.1 4.363-.691 7.339-4.787 6.65-9.15L177.36 80h6.64c8.837 0 16-7.163 16-16ZM72 40h112v24h-112ZM173.79 160h-91.58L94.84 80h66.32Z"),
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
        return _stool!!
    }

private var _stool: ImageVector? = null
