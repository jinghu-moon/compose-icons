package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.NyTimesLogo: ImageVector
    get() {
        if (_nyTimesLogo != null) return _nyTimesLogo!!
        _nyTimesLogo = phosphorThinIcon(
            name = "NyTimesLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M172 140c4.418 0 8 3.582 8 8 0 4.418-3.582 8-8 8-4.418 0-8-3.582-8-8 0-4.418 3.582-8 8-8ZM186.31 99.62 119.57 68.48C81.102 72.773 52.006 105.293 52 144c0 1.32 0 2.64 .1 3.95l74-39.48c1.241-.67 2.743-.637 3.954 .087 1.21 .724 1.95 2.032 1.946 3.443v107.88c31.718-1.556 59.087-22.757 68.52-53.08 .408-1.389 1.534-2.448 2.945-2.772 1.411-.323 2.886 .141 3.857 1.213 .972 1.072 1.288 2.586 .828 3.958-9.823 31.232-36.898 53.91-69.368 58.105C106.312 231.499 74.363 216.446 56.925 188.736 39.488 161.026 39.739 125.709 57.57 98.25 42.795 93.152 33.864 78.127 36.447 62.712 39.03 47.297 52.37 36.004 68 36c.584 .002 1.161 .131 1.69 .38L188.85 92c13.255-.235 23.81-11.17 23.575-24.425C212.19 54.32 201.255 43.765 188 44c-2.209 0-4-1.791-4-4 0-2.209 1.791-4 4-4 17.673 0 32 14.327 32 32 0 17.673-14.327 32-32 32-.584-.002-1.161-.131-1.69-.38ZM124 118.62l-24 12.8v83.16c7.659 3.053 15.766 4.83 24 5.26ZM53.05 156.51c3.906 23.181 18.3 43.258 39 54.4v-75.18ZM107.05 62.65 67.15 44C55.123 44.422 45.268 53.687 44.105 65.665c-1.163 11.978 6.724 22.966 18.445 25.695 1.1-1.37 2.22-2.71 3.41-4C76.969 75.296 91.26 66.708 107.08 62.65Z"),
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
        return _nyTimesLogo!!
    }

private var _nyTimesLogo: ImageVector? = null
