package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.CloudRain: ImageVector
    get() {
        if (_cloudRain != null) return _cloudRain!!
        _cloudRain = phosphorFillIcon(
            name = "CloudRain",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M158.66 196.44l-32 48c-2.452 3.678-7.422 4.672-11.1 2.22-3.678-2.452-4.672-7.422-2.22-11.1l32-48c2.452-3.678 7.422-4.672 11.1-2.22 3.678 2.452 4.672 7.422 2.22 11.1ZM231.87 87.55C229.512 47.227 196.025 15.793 155.634 15.987 115.243 16.181 82.06 47.936 80.09 88.28 79.848 92.583 76.309 95.959 72 96h-.6C67.009 95.608 63.728 91.79 64 87.39c.278-5.562 1.058-11.088 2.33-16.51 .334-1.385-.094-2.844-1.124-3.829-1.03-.985-2.506-1.347-3.876-.951C39.084 72.673 23.864 93.164 24 116.36 24.2 145.07 48.12 168 76.84 168h36.21L89.34 203.56c-2.452 3.678-1.458 8.648 2.22 11.1 3.678 2.452 8.648 1.458 11.1-2.22L132.28 168h23.72c20.922-.023 40.91-8.661 55.265-23.882 14.354-15.221 21.807-35.681 20.605-56.568Z"),
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
