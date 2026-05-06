package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.HandCoins: ImageVector
    get() {
        if (_handCoins != null) return _handCoins!!
        _handCoins = phosphorBoldIcon(
            name = "HandCoins",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M232.76 137.88c-7.005-5.366-16.108-7.17-24.63-4.88L172 141.26c0-.42 0-.84 0-1.26 0-17.673-14.327-32-32-32h-50.06c-9.55-.026-18.715 3.769-25.45 10.54L43 140h-23C8.954 140 0 148.954 0 160v40c0 11.046 8.954 20 20 20h100c.981 .001 1.959-.12 2.91-.36l64-16c.612-.15 1.211-.351 1.79-.6l38.82-16.54c.23-.09 .45-.19 .67-.3 8.826-4.415 14.753-13.068 15.682-22.893 .929-9.825-3.271-19.435-11.112-25.427ZM36 196h-12v-32h12ZM217.68 164.61l-37.51 16L118.52 196h-58.52v-39L81.46 135.54c2.241-2.265 5.294-3.54 8.48-3.54h50.06c4.418 0 8 3.582 8 8 0 4.418-3.582 8-8 8h-28c-6.627 0-12 5.373-12 12 0 6.627 5.373 12 12 12h32c.905 0 1.807-.1 2.69-.3l67-15.41 .47-.12c1.384-.377 2.865-.087 4.006 .783 1.141 .87 1.811 2.222 1.814 3.657 .01 1.65-.869 3.178-2.3 4ZM164 100c1.732-.002 3.462-.116 5.18-.34 9.885 17.521 31.244 24.974 49.884 17.407 18.639-7.567 28.759-27.8 23.634-47.253C237.573 50.361 218.798 37.741 198.85 40.34 189.286 23.393 168.914 15.788 150.584 22.322c-18.329 6.534-29.298 25.31-25.986 44.485C127.91 85.983 144.541 99.993 164 100ZM204 64c8.837 0 16 7.163 16 16 0 8.837-7.163 16-16 16-8.837 0-16-7.163-16-16 0-8.837 7.163-16 16-16ZM164 44c5.117-.002 9.927 2.444 12.94 6.58C169.716 57.201 165.181 66.25 164.2 76h-.2c-8.837 0-16-7.163-16-16 0-8.837 7.163-16 16-16Z"),
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
        return _handCoins!!
    }

private var _handCoins: ImageVector? = null
