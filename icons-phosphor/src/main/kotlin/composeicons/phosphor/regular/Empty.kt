package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.Empty: ImageVector
    get() {
        if (_empty != null) return _empty!!
        _empty = phosphorRegularIcon(
            name = "Empty",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M198.24 62.63 213.92 45.38c2.907-3.277 2.638-8.283-.604-11.229-3.242-2.946-8.251-2.737-11.236 .469L186.4 51.86C146.815 21.458 90.532 26.482 56.958 63.416c-33.574 36.933-33.225 93.439 .802 129.954L42.08 210.62c-1.963 2.109-2.641 5.11-1.774 7.858 .867 2.748 3.144 4.817 5.961 5.418 2.818 .601 5.741-.36 7.653-2.515L69.6 204.14c39.585 30.402 95.868 25.378 129.442-11.556 33.574-36.933 33.225-93.439-.802-129.954ZM48 128C48.018 97.797 65.045 70.178 92.021 56.595c26.976-13.583 59.303-10.816 83.579 7.155L68.6 181.48C55.334 166.828 47.991 147.765 48 128ZM128 208c-17.15 .018-33.846-5.506-47.6-15.75L187.4 74.52c21.149 23.462 26.502 57.177 13.659 86.035C188.217 189.414 159.587 208.006 128 208Z"),
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
        return _empty!!
    }

private var _empty: ImageVector? = null
