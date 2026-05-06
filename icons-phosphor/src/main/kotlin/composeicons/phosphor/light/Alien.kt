package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Alien: ImageVector
    get() {
        if (_alien != null) return _alien!!
        _alien = phosphorLightIcon(
            name = "Alien",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M128 18C76.11 18.061 34.061 60.11 34 112c0 23.6 12.41 54.2 33.21 81.83C83.27 215.18 107.68 238 128 238c20.32 0 44.73-22.82 60.79-44.17C209.59 166.2 222 135.6 222 112 221.939 60.11 179.89 18.061 128 18ZM179.21 186.62C161.48 210.17 140.91 226 128 226 115.09 226 94.52 210.17 76.79 186.62 57.8 161.37 46 132.78 46 112 46 66.713 82.713 30 128 30c45.287 0 82 36.713 82 82 0 20.78-11.8 49.37-30.79 74.62ZM118 136C118 115.013 100.987 98 80 98c-7.732 0-14 6.268-14 14 0 20.987 17.013 38 38 38 7.732 0 14-6.268 14-14ZM104 138C89.641 138 78 126.359 78 112c0-1.105 .895-2 2-2 14.359 0 26 11.641 26 26 0 1.105-.895 2-2 2ZM176 98c-20.987 0-38 17.013-38 38 0 7.732 6.268 14 14 14 20.987 0 38-17.013 38-38 0-7.732-6.268-14-14-14ZM152 138c-1.105 0-2-.895-2-2 0-14.359 11.641-26 26-26 1.105 0 2 .895 2 2 0 14.359-11.641 26-26 26ZM150 184c0 3.314-2.686 6-6 6h-32c-3.314 0-6-2.686-6-6 0-3.314 2.686-6 6-6h32c3.314 0 6 2.686 6 6Z"),
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
        return _alien!!
    }

private var _alien: ImageVector? = null
