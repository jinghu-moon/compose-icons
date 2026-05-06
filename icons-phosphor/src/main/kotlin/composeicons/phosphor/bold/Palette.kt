package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Palette: ImageVector
    get() {
        if (_palette != null) return _palette!!
        _palette = phosphorBoldIcon(
            name = "Palette",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M203.57 51C172.563 20.497 126.273 11.593 86.163 28.417 46.053 45.242 19.967 84.504 20 128c0 44.72 27.6 82.25 72 97.94 11.018 3.896 23.242 2.2 32.784-4.547C134.326 214.646 140 203.687 140 192c0-6.627 5.373-12 12-12h46.21c16.828 .079 31.437-11.576 35.1-28 1.855-8.172 2.757-16.531 2.69-24.91C235.801 98.41 224.121 71.006 203.57 51ZM209.91 146.67c-1.228 5.466-6.098 9.337-11.7 9.3h-46.21c-19.882 0-36 16.118-36 36-.004 3.893-1.897 7.542-5.077 9.788-3.18 2.246-7.252 2.81-10.923 1.512C83.35 197.39 69.35 187.51 59.52 174.71 49.308 161.293 43.849 144.861 44 128 43.998 81.946 81.078 44.477 127.13 44h.87c46.038 .187 83.422 37.255 84 83.29 .054 6.532-.647 13.049-2.09 19.42ZM144 76c0 8.837-7.163 16-16 16-8.837 0-16-7.163-16-16 0-8.837 7.163-16 16-16 8.837 0 16 7.163 16 16ZM100 100c0 8.837-7.163 16-16 16-8.837 0-16-7.163-16-16C68 91.163 75.163 84 84 84c8.837 0 16 7.163 16 16ZM100 156c0 8.837-7.163 16-16 16-8.837 0-16-7.163-16-16 0-8.837 7.163-16 16-16 8.837 0 16 7.163 16 16ZM188 100c0 8.837-7.163 16-16 16-8.837 0-16-7.163-16-16 0-8.837 7.163-16 16-16 8.837 0 16 7.163 16 16Z"),
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
        return _palette!!
    }

private var _palette: ImageVector? = null
