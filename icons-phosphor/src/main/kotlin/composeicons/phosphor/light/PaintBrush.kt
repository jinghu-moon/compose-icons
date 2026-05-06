package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.PaintBrush: ImageVector
    get() {
        if (_paintBrush != null) return _paintBrush!!
        _paintBrush = phosphorLightIcon(
            name = "PaintBrush",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M224 26c-20.8 0-44.11 11.41-69.3 33.9C136.62 76.06 121 94.9 110.3 109c-17.678-5.878-37.103-2.907-52.216 7.987C42.972 127.881 34.012 145.371 34 164c0 32.07-20.43 46.39-21.35 47-2.211 1.466-3.196 4.21-2.423 6.748 .773 2.538 3.12 4.267 5.773 4.252h76c18.629-.012 36.119-8.972 47.013-24.084 10.894-15.112 13.865-34.538 7.987-52.216 14.08-10.67 32.92-26.32 49.08-44.4C218.59 76.11 230 52.8 230 32c0-3.314-2.686-6-6-6ZM92 210h-61.35C37.92 200.85 46 185.78 46 164c0-25.405 20.595-46 46-46 25.405 0 46 20.595 46 46 0 25.405-20.595 46-46 46ZM121.49 114.09c3.6-4.67 7.88-10 12.71-15.69 9.381 6.041 17.359 14.019 23.4 23.4-5.67 4.83-11 9.11-15.69 12.71-4.989-8.409-12.011-15.431-20.42-20.42ZM166.69 113.79C160.186 104.127 151.873 95.814 142.21 89.31 163.05 66.46 191 42 217.56 38.44 214 65 189.54 93 166.69 113.79Z"),
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
        return _paintBrush!!
    }

private var _paintBrush: ImageVector? = null
