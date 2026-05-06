package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.BowlFood: ImageVector
    get() {
        if (_bowlFood != null) return _bowlFood!!
        _bowlFood = phosphorLightIcon(
            name = "BowlFood",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M224 106h-10.23C210.477 61.063 173.058 26.285 128 26.285 82.942 26.285 45.523 61.063 42.23 106h-10.23c-3.314 0-6 2.686-6 6 .073 38.465 21.705 73.641 56 91.06v4.94c0 7.732 6.268 14 14 14h64c7.732 0 14-6.268 14-14v-4.94C208.295 185.641 229.927 150.465 230 112c0-3.314-2.686-6-6-6ZM174.24 54.29c2.903 2.325 5.628 4.866 8.15 7.6C159.881 68.896 141.242 84.845 130.84 106h-33.5C107.037 75.115 135.629 54.074 168 54c2.08 0 4.17 .11 6.24 .29ZM190.3 72.14c6.542 10.173 10.471 21.804 11.44 33.86h-57.26C154.613 89.042 171.114 76.848 190.3 72.14ZM128 38c9.167-.015 18.255 1.681 26.8 5C121.08 48.323 93.665 73.018 84.86 106h-30.6C57.426 67.611 89.481 38.052 128 38ZM165.5 193.84c-2.135 .978-3.502 3.112-3.5 5.46v8.7c0 1.105-.895 2-2 2h-64c-1.105 0-2-.895-2-2v-8.7c.002-2.348-1.365-4.482-3.5-5.46C60.52 180.014 40.468 150.937 38.2 118h179.6c-2.268 32.937-22.32 62.014-52.3 75.84Z"),
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
        return _bowlFood!!
    }

private var _bowlFood: ImageVector? = null
