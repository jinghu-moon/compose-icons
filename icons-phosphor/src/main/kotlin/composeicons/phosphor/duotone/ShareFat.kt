package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.ShareFat: ImageVector
    get() {
        if (_shareFat != null) return _shareFat!!
        _shareFat = phosphorDuotoneIcon(
            name = "ShareFat",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M152 192v-48C90.6 144 47.39 181.19 30.93 198.72c-1.177 1.263-3.032 1.628-4.6 .905-1.568-.723-2.495-2.37-2.3-4.085C31.51 130.45 99.19 80 152 80v-48l80 80Z"),
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
                pathData = parseSvgPathData("M237.66 106.35l-80-80c-2.287-2.289-5.728-2.976-8.718-1.739C145.952 25.848 144.001 28.764 144 32v40.35C118.06 74.57 89.41 87.27 65.84 107.26 37.46 131.34 19.79 162.37 16.08 194.63c-.595 5.144 2.178 10.09 6.877 12.266 4.699 2.177 10.264 1.094 13.803-2.686h0c11-11.71 50.14-48.74 107.24-52v39.79c.001 3.236 1.952 6.152 4.942 7.389 2.99 1.237 6.431 .55 8.718-1.739l80-80c3.115-3.123 3.115-8.177 0-11.3ZM160 172.69v-28.69c0-4.418-3.582-8-8-8-28.08 0-55.43 7.33-81.29 21.8-13.171 7.402-25.442 16.301-36.57 26.52 5.8-23.84 20.42-46.51 42.05-64.86C99.41 99.77 127.75 88 152 88c4.418 0 8-3.582 8-8v-28.68L220.69 112Z"),
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
        return _shareFat!!
    }

private var _shareFat: ImageVector? = null
