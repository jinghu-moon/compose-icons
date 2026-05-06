package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.HandArrowDown: ImageVector
    get() {
        if (_handArrowDown != null) return _handArrowDown!!
        _handArrowDown = phosphorBoldIcon(
            name = "HandArrowDown",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M232.76 137.88c-7.005-5.366-16.108-7.17-24.63-4.88L172 141.26c0-.42 0-.84 0-1.26 0-17.673-14.327-32-32-32h-50.06c-9.55-.026-18.715 3.769-25.45 10.54L43 140h-23C8.954 140 0 148.954 0 160v40c0 11.046 8.954 20 20 20h100c.981 .001 1.959-.12 2.91-.36l64-16c.612-.15 1.211-.351 1.79-.6l38.82-16.54c.23-.09 .45-.19 .67-.3 8.826-4.415 14.753-13.068 15.682-22.893 .929-9.825-3.271-19.435-11.112-25.427ZM24 164h12v32h-12ZM217.68 164.61l-37.51 16L118.52 196h-58.52v-39L81.46 135.54c2.241-2.265 5.294-3.54 8.48-3.54h50.06c4.418 0 8 3.582 8 8 0 4.418-3.582 8-8 8h-28c-6.627 0-12 5.373-12 12 0 6.627 5.373 12 12 12h32c.905 0 1.807-.1 2.69-.3l67-15.41 .47-.12c1.384-.377 2.865-.087 4.006 .783 1.141 .87 1.811 2.222 1.814 3.657 .01 1.65-.869 3.178-2.3 4ZM151.51 80.49c-4.694-4.694-4.694-12.306 0-17 4.694-4.694 12.306-4.694 17 0L180 75v-51c0-6.627 5.373-12 12-12 6.627 0 12 5.373 12 12v51L215.51 63.48c4.694-4.694 12.306-4.694 17 0 4.694 4.694 4.694 12.306 0 17l-32 32c-2.252 2.259-5.31 3.529-8.5 3.529-3.19 0-6.248-1.27-8.5-3.529Z"),
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
        return _handArrowDown!!
    }

private var _handArrowDown: ImageVector? = null
