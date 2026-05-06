package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.Gif: ImageVector
    get() {
        if (_gif != null) return _gif!!
        _gif = phosphorRegularIcon(
            name = "Gif",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M144 72v112c0 4.418-3.582 8-8 8-4.418 0-8-3.582-8-8v-112c0-4.418 3.582-8 8-8 4.418 0 8 3.582 8 8ZM232 64h-56c-4.418 0-8 3.582-8 8v112c0 4.418 3.582 8 8 8 4.418 0 8-3.582 8-8v-48h40c4.418 0 8-3.582 8-8 0-4.418-3.582-8-8-8h-40v-40h48c4.418 0 8-3.582 8-8 0-4.418-3.582-8-8-8ZM96 120h-24c-4.418 0-8 3.582-8 8 0 4.418 3.582 8 8 8h16v16c0 13.255-10.745 24-24 24C50.745 176 40 165.255 40 152v-48C40 90.745 50.745 80 64 80c11.19 0 21.61 7.74 24.25 18 1.105 4.28 5.47 6.855 9.75 5.75 4.28-1.105 6.855-5.47 5.75-9.75C99.27 76.62 82.56 64 64 64 41.909 64 24 81.909 24 104v48c0 22.091 17.909 40 40 40 22.091 0 40-17.909 40-40v-24c0-4.418-3.582-8-8-8Z"),
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
        return _gif!!
    }

private var _gif: ImageVector? = null
