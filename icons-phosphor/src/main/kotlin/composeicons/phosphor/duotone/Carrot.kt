package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.Carrot: ImageVector
    get() {
        if (_carrot != null) return _carrot!!
        _carrot = phosphorDuotoneIcon(
            name = "Carrot",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M183.6 151.6C144 192 43.81 223 43.81 223c-3.103 1.639-6.911 1.064-9.393-1.417C31.936 219.101 31.361 215.293 33 212.19c0 0 31-100.19 71.4-139.79 21.87-21.87 57.33-21.87 79.2 0 21.87 21.87 21.87 57.33 0 79.2Z"),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color(0xFF000000)),
                fillAlpha = 0.2f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
            )
            addPath(
                pathData = parseSvgPathData("M232 64h-28.69L229.66 37.66c3.126-3.126 3.126-8.194 0-11.32-3.126-3.126-8.194-3.126-11.32 0L192 52.69v-28.69c0-4.418-3.582-8-8-8-4.418 0-8 3.582-8 8v32.57C150.938 42.102 119.286 46.251 98.8 66.69h0 0 0C58.7 106.08 28.55 199.77 25.61 209.14c-2.84 6.095-1.565 13.316 3.19 18.07 4.755 4.755 11.975 6.029 18.07 3.19 9.37-2.94 103.18-33.13 142.47-73.21C209.764 136.698 213.9 105.053 199.43 80h32.57c4.418 0 8-3.582 8-8 0-4.418-3.582-8-8-8ZM177.88 146c-8.94 9.12-21.25 17.8-34.85 25.73L117.65 146.34c-3.126-3.126-8.194-3.126-11.32 0-3.126 3.126-3.126 8.194 0 11.32l22.09 22.09c-40.87 21.19-86.32 35.42-87 35.63-.492 .16-.968 .367-1.42 .62 .242-.45 .439-.922 .59-1.41 .29-.93 28-89.58 64-130.67l33.77 33.77c3.126 3.126 8.194 3.126 11.32 0 3.126-3.126 3.126-8.194 0-11.32L116.18 72.88c20.351-14.479 48.405-10.933 64.512 8.155 16.107 19.088 14.884 47.339-2.812 64.965Z"),
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
        return _carrot!!
    }

private var _carrot: ImageVector? = null
