package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.FlagCheckered: ImageVector
    get() {
        if (_flagCheckered != null) return _flagCheckered!!
        _flagCheckered = phosphorThinIcon(
            name = "FlagCheckered",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M225.66 52.44c-1.423-.652-3.096-.413-4.28 .61-30 26-56 13.08-83.61-.56C109.07 38.29 79.39 23.61 45.38 53.05c-.871 .755-1.374 1.848-1.38 3v167.95c0 2.209 1.791 4 4 4 2.209 0 4-1.791 4-4v-46.13c29.41-24.39 55.08-11.69 82.23 1.74 28.7 14.19 58.38 28.88 92.39-.56 .871-.755 1.374-1.848 1.38-3v-120c-.011-1.556-.924-2.964-2.34-3.61ZM220 64.32v49.88c-16.91 14-32.58 15.79-48 12.2v-51.73c15.24 3.23 31.09 1.7 48-10.35ZM164 72.55v51.54c-8.7-3-17.39-7.25-26.23-11.62C128.01 107.63 118.13 102.75 108 99.56v-51.56c8.7 3 17.39 7.25 26.23 11.62C144 64.49 153.87 69.37 164 72.55ZM100 45.73v51.71C84.76 94.21 68.91 95.75 52 107.81v-49.88C68.91 43.9 84.58 42.15 100 45.73ZM52 167.78v-49.88c16.91-14 32.58-15.79 48-12.2v51.72C95.608 156.483 91.131 156.007 86.64 156 75.52 156 64 159.2 52 167.78ZM108 159.55v-51.55c8.71 3 17.39 7.25 26.23 11.62 9.76 4.83 19.64 9.71 29.77 12.89v51.54c-8.71-3-17.39-7.25-26.23-11.62C128 167.61 118.13 162.73 108 159.55ZM172 186.37v-51.72c4.39 .954 8.868 1.447 13.36 1.47 11.12 0 22.61-3.27 34.64-11.85v49.9C203.09 188.19 187.42 190 172 186.37Z"),
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
        return _flagCheckered!!
    }

private var _flagCheckered: ImageVector? = null
