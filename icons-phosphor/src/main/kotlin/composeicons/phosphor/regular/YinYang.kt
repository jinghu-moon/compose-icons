package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.YinYang: ImageVector
    get() {
        if (_yinYang != null) return _yinYang!!
        _yinYang = phosphorRegularIcon(
            name = "YinYang",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M128 24C70.562 24 24 70.562 24 128c0 57.438 46.562 104 104 104 57.438 0 104-46.562 104-104C231.939 70.588 185.412 24.061 128 24ZM40 128C40.055 79.422 79.422 40.055 128 40c22.091 0 40 17.909 40 40 0 22.091-17.909 40-40 40-19.204-.005-37.071 9.832-47.339 26.061C70.394 162.29 69.16 182.649 77.39 200 53.947 183.519 39.997 156.656 40 128ZM128 216C105.909 216 88 198.091 88 176c0-22.091 17.909-40 40-40 19.19-.003 37.042-9.833 47.306-26.048 10.264-16.215 11.511-36.556 3.304-53.902 31.358 22.082 44.803 61.931 33.233 98.497C200.273 191.113 166.353 215.975 128 216ZM140 176c0 6.627-5.373 12-12 12-6.627 0-12-5.373-12-12 0-6.627 5.373-12 12-12 6.627 0 12 5.373 12 12ZM116 80c0-6.627 5.373-12 12-12 6.627 0 12 5.373 12 12 0 6.627-5.373 12-12 12-6.627 0-12-5.373-12-12Z"),
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
        return _yinYang!!
    }

private var _yinYang: ImageVector? = null
