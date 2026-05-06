package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Volleyball: ImageVector
    get() {
        if (_volleyball != null) return _volleyball!!
        _volleyball = phosphorFillIcon(
            name = "Volleyball",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M128 24C70.562 24 24 70.562 24 128c0 57.438 46.562 104 104 104 57.438 0 104-46.562 104-104C231.939 70.588 185.412 24.061 128 24ZM215.63 120h-34.26C181.269 89.987 168.229 61.475 145.59 41.77c38.02 7.819 66.456 39.58 70.04 78.23ZM44.53 155.87C32.23 119.041 45.536 78.505 77.27 56.13L94.39 85.78C68.447 100.868 50.274 126.414 44.53 155.87ZM58.9 182.43C56.32 148.777 73.216 116.613 102.39 99.64L118.76 128 77.27 199.87C70.343 194.966 64.157 189.093 58.9 182.43ZM209.74 160.58c-27.856 19.095-64.183 20.564-93.49 3.78L132.62 136h83c-.755 8.436-2.736 16.716-5.88 24.58Z"),
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
        return _volleyball!!
    }

private var _volleyball: ImageVector? = null
