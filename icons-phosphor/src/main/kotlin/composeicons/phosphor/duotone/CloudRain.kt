package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.CloudRain: ImageVector
    get() {
        if (_cloudRain != null) return _cloudRain!!
        _cloudRain = phosphorDuotoneIcon(
            name = "CloudRain",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M224 92c0 37.555-30.445 68-68 68h-80C58.556 159.983 42.769 149.663 35.755 133.69 28.742 117.718 31.826 99.111 43.618 86.256 55.411 73.401 73.683 68.727 90.2 74.34v.11C99.038 41.473 130.94 20.146 164.791 24.587 198.642 29.027 223.966 57.859 224 92Z"),
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
                pathData = parseSvgPathData("M158.66 196.44l-32 48c-2.452 3.678-7.422 4.672-11.1 2.22-3.678-2.452-4.672-7.422-2.22-11.1l32-48c2.452-3.678 7.422-4.672 11.1-2.22 3.678 2.452 4.672 7.422 2.22 11.1ZM232 92c-.044 41.955-34.045 75.956-76 76h-23.72l-29.62 44.44c-2.452 3.678-7.422 4.672-11.1 2.22-3.678-2.452-4.672-7.422-2.22-11.1L113.05 168h-37.05C47.281 168 24 144.719 24 116 24 87.281 47.281 64 76 64c2.989 .003 5.973 .257 8.92 .76C98.084 30.567 133.749 10.614 169.775 17.286 205.801 23.959 231.955 55.361 232 92ZM216 92C215.867 59.615 190.082 33.168 157.712 32.213 125.341 31.258 98.042 56.14 96 88.46c-.254 4.418-4.042 7.794-8.46 7.54C83.122 95.746 79.746 91.958 80 87.54q.21-3.66 .77-7.23C79.188 80.107 77.595 80.003 76 80 56.118 80 40 96.118 40 116c0 19.882 16.118 36 36 36h80c33.121-.039 59.961-26.879 60-60Z"),
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
        return _cloudRain!!
    }

private var _cloudRain: ImageVector? = null
