package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Bomb: ImageVector
    get() {
        if (_bomb != null) return _bomb!!
        _bomb = phosphorBoldIcon(
            name = "Bomb",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M244 28c-6.627 0-12 5.373-12 12-.201 5.483-1.327 10.892-3.33 16C224.23 66.64 217.43 68 212 68c-8.81 0-14.91-8.5-23.91-22.49C178.5 30.58 166.55 12 144 12c-18.14 0-32 9.78-39.14 27.54-1.589 4.03-2.791 8.202-3.59 12.46h-13.27C76.954 52 68 60.954 68 72v7.18C31.03 99.287 12.417 141.916 22.8 182.699 33.184 223.482 69.916 252.02 112 252h1.66c41.779-.722 77.824-29.509 87.767-70.094C211.37 141.321 192.713 99.133 156 79.18v-7.18C156 60.954 147.046 52 136 52h-10.07c.397-1.357 .865-2.692 1.4-4C131.77 37.38 138.57 36 144 36c8.81 0 14.91 8.5 23.91 22.49C177.5 73.42 189.45 92 212 92c18.14 0 32-9.78 39.14-27.54C254.172 56.652 255.817 48.374 256 40c0-6.627-5.373-12-12-12ZM139.2 97.65c29.512 12.88 45.945 44.695 39.366 76.216-6.579 31.521-34.365 54.107-66.566 54.107-32.201 0-59.987-22.585-66.566-54.107C38.855 142.345 55.288 110.53 84.8 97.65c4.374-1.909 7.201-6.228 7.2-11v-10.65h19.5c.17 0 .33 0 .5 0 .17 0 .34 0 .51 0h19.49v10.66c.003 4.768 2.83 9.083 7.2 10.99ZM111.45 201.76c-1.569 5.004-6.206 8.41-11.45 8.41-1.221-.002-2.434-.188-3.6-.55C74.69 202.864 59.926 182.737 60 160c0-6.627 5.373-12 12-12 6.627 0 12 5.373 12 12-.04 12.243 7.91 23.081 19.6 26.72 6.319 1.987 9.833 8.719 7.85 15.04Z"),
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
        return _bomb!!
    }

private var _bomb: ImageVector? = null
