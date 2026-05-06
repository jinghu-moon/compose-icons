package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.LightbulbFilament: ImageVector
    get() {
        if (_lightbulbFilament != null) return _lightbulbFilament!!
        _lightbulbFilament = phosphorThinIcon(
            name = "LightbulbFilament",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M172 232c0 2.209-1.791 4-4 4h-80c-2.209 0-4-1.791-4-4 0-2.209 1.791-4 4-4h80c2.209 0 4 1.791 4 4ZM212 104c.063 25.795-11.787 50.174-32.11 66.06-4.954 3.807-7.867 9.692-7.89 15.94v6c0 6.627-5.373 12-12 12h-64c-6.627 0-12-5.373-12-12v-6c-.002-6.187-2.867-12.024-7.76-15.81C55.961 154.405 44.072 130.168 44 104.47 43.75 59 80.52 21.09 126 20c22.623-.539 44.506 8.073 60.694 23.885C202.882 59.696 212.006 81.371 212 104ZM204 104c.006-20.479-8.253-40.094-22.906-54.401C166.44 35.292 146.633 27.504 126.16 28 85 29 51.77 63.27 52 104.43c.075 23.24 10.831 45.155 29.17 59.43C88.009 169.169 92.007 177.343 92 186v6c0 2.209 1.791 4 4 4h28v-50.34L93.17 114.83c-1.563-1.563-1.563-4.097 0-5.66 1.563-1.563 4.097-1.563 5.66 0L128 138.34l29.17-29.17c1.563-1.563 4.097-1.563 5.66 0 1.563 1.563 1.563 4.097 0 5.66L132 145.66v50.34h28c2.209 0 4-1.791 4-4v-6c.022-8.693 4.06-16.887 10.94-22.2C193.34 149.423 204.066 127.351 204 104Z"),
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
        return _lightbulbFilament!!
    }

private var _lightbulbFilament: ImageVector? = null
