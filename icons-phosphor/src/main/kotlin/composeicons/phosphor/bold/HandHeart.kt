package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.HandHeart: ImageVector
    get() {
        if (_handHeart != null) return _handHeart!!
        _handHeart = phosphorBoldIcon(
            name = "HandHeart",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M232.76 137.88c-3.528-2.703-7.636-4.548-12-5.39C236.19 114.94 244 97.37 244 80 244 51.33 220.91 28 192.54 28 178.878 27.934 165.743 33.272 156 42.85 146.257 33.272 133.122 27.934 119.46 28 91.09 28 68 51.33 68 80c0 10.15 2.72 20.3 8.22 30.7-4.39 1.812-8.377 4.477-11.73 7.84L43 140h-23C8.954 140 0 148.954 0 160v40c0 11.046 8.954 20 20 20h100c.981 .001 1.959-.12 2.91-.36l64-16c.612-.15 1.211-.351 1.79-.6l38.82-16.54c.23-.09 .45-.19 .67-.3 8.826-4.415 14.753-13.068 15.682-22.893 .929-9.825-3.271-19.435-11.112-25.427ZM119.46 52c11.06-.171 21.119 6.378 25.44 16.56 1.849 4.501 6.234 7.44 11.1 7.44 4.866 0 9.251-2.939 11.1-7.44C171.421 58.378 181.48 51.829 192.54 52 207.42 52 220 64.82 220 80c0 18.06-15 38.84-43.38 60.19L172 141.26c0-.42 0-.84 0-1.26 0-17.673-14.327-32-32-32h-37.29C95.42 97.76 92 88.77 92 80 92 64.82 104.58 52 119.46 52ZM24 164h12v32h-12ZM217.68 164.61l-37.51 16L118.52 196h-58.52v-39L81.46 135.54c2.241-2.265 5.294-3.54 8.48-3.54h50.06c4.418 0 8 3.582 8 8 0 4.418-3.582 8-8 8h-28c-6.627 0-12 5.373-12 12 0 6.627 5.373 12 12 12h32c.905 0 1.807-.1 2.69-.3l67-15.41 .47-.12c1.384-.377 2.865-.087 4.006 .783 1.141 .87 1.811 2.222 1.814 3.657 .01 1.65-.869 3.178-2.3 4Z"),
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
        return _handHeart!!
    }

private var _handHeart: ImageVector? = null
