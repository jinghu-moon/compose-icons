package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.Volleyball: ImageVector
    get() {
        if (_volleyball != null) return _volleyball!!
        _volleyball = phosphorRegularIcon(
            name = "Volleyball",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M128 24C70.562 24 24 70.562 24 128c0 57.438 46.562 104 104 104 57.438 0 104-46.562 104-104C231.939 70.588 185.412 24.061 128 24ZM209.74 160.58c-27.856 19.095-64.183 20.564-93.49 3.78L132.62 136h83c-.755 8.436-2.736 16.716-5.88 24.58ZM91.12 48.11c7.683-3.558 15.841-5.983 24.22-7.2 30.463 14.584 49.891 45.316 50 79.09h-32.72ZM215.63 120h-34.26C181.269 89.987 168.229 61.475 145.59 41.77c38.02 7.819 66.456 39.58 70.04 78.23ZM77.27 56.13 94.39 85.78C68.447 100.868 50.274 126.414 44.53 155.87 32.23 119.041 45.536 78.505 77.27 56.13ZM58.9 182.43C56.32 148.777 73.216 116.613 102.39 99.64L118.76 128 77.27 199.87C70.343 194.966 64.157 189.093 58.9 182.43ZM128 216c-12.737 .013-25.323-2.755-36.88-8.11l17.13-29.67c26.009 14.894 57.171 17.871 85.53 8.17C177.107 205.227 153.156 216.008 128 216Z"),
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
