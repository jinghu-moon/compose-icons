package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Copyright: ImageVector
    get() {
        if (_copyright != null) return _copyright!!
        _copyright = phosphorBoldIcon(
            name = "Copyright",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M128 20C68.353 20 20 68.353 20 128c0 59.647 48.353 108 108 108 59.647 0 108-48.353 108-108C235.934 68.381 187.619 20.066 128 20ZM128 212C81.608 212 44 174.392 44 128 44 81.608 81.608 44 128 44c46.392 0 84 37.608 84 84-.05 46.371-37.629 83.95-84 84ZM169.59 159.21c-13.434 17.898-36.812 25.194-58.041 18.114C90.319 170.243 76.001 150.374 76.001 127.995c0-22.379 14.318-42.248 35.547-49.329 21.229-7.081 44.608 .215 58.041 18.114 2.67 3.42 3.286 8.016 1.611 12.019-1.676 4.003-5.382 6.789-9.692 7.287-4.311 .498-8.554-1.37-11.098-4.885-7.231-9.642-19.821-13.574-31.254-9.763-11.434 3.811-19.146 14.511-19.146 26.563 0 12.052 7.712 22.752 19.146 26.563 11.434 3.811 24.023-.121 31.254-9.763 2.523-3.568 6.786-5.482 11.129-4.998 4.343 .485 8.079 3.292 9.753 7.328 1.674 4.036 1.022 8.664-1.702 12.08Z"),
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
        return _copyright!!
    }

private var _copyright: ImageVector? = null
