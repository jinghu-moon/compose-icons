package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Eyeglasses: ImageVector
    get() {
        if (_eyeglasses != null) return _eyeglasses!!
        _eyeglasses = phosphorBoldIcon(
            name = "Eyeglasses",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M200 36c-6.627 0-12 5.373-12 12 0 6.627 5.373 12 12 12 6.627 0 12 5.373 12 12v50.46c-12.346-7.155-27.238-8.438-40.626-3.5-13.388 4.938-23.88 15.582-28.624 29.04h-29.5C108.506 134.542 98.013 123.898 84.626 118.96 71.238 114.022 56.346 115.305 44 122.46v-50.46C44 65.373 49.373 60 56 60c6.627 0 12-5.373 12-12C68 41.373 62.627 36 56 36 36.118 36 20 52.118 20 72v92c.026 24.934 19.139 45.696 43.986 47.781 24.847 2.085 47.152-15.2 51.334-39.781h25.36c4.182 24.581 26.488 41.866 51.334 39.781C216.861 209.696 235.974 188.934 236 164v-92C236 52.118 219.882 36 200 36ZM68 188C54.745 188 44 177.255 44 164c0-13.255 10.745-24 24-24 13.255 0 24 10.745 24 24 0 13.255-10.745 24-24 24ZM188 188c-13.255 0-24-10.745-24-24 0-13.255 10.745-24 24-24 13.255 0 24 10.745 24 24 0 13.255-10.745 24-24 24Z"),
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
        return _eyeglasses!!
    }

private var _eyeglasses: ImageVector? = null
