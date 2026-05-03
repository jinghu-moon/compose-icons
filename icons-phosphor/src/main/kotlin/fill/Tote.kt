package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Tote: ImageVector
    get() {
        if (_tote != null) return _tote!!
        _tote = phosphorFillIcon(
            name = "Tote",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 236.000 69.400 C 232.931 65.955 228.534 63.990 223.920 64.000 L 176.000 64.000 C 176.000 37.490 154.510 16.000 128.000 16.000 C 101.490 16.000 80.000 37.490 80.000 64.000 L 32.080 64.000 C 27.494 64.012 23.131 65.976 20.080 69.400 C 17.055 72.811 15.629 77.351 16.160 81.880 L 30.420 201.880 C 31.378 209.975 38.268 216.056 46.420 216.000 L 209.670 216.000 C 217.822 216.056 224.712 209.975 225.670 201.880 L 239.930 81.880 C 240.459 77.350 239.029 72.810 236.000 69.400 ZM 96.000 104.000 C 96.000 108.418 92.418 112.000 88.000 112.000 C 83.582 112.000 80.000 108.418 80.000 104.000 L 80.000 88.000 C 80.000 83.582 83.582 80.000 88.000 80.000 C 92.418 80.000 96.000 83.582 96.000 88.000 ZM 128.000 32.000 C 145.673 32.000 160.000 46.327 160.000 64.000 L 96.000 64.000 C 96.000 46.327 110.327 32.000 128.000 32.000 ZM 176.000 104.000 C 176.000 108.418 172.418 112.000 168.000 112.000 C 163.582 112.000 160.000 108.418 160.000 104.000 L 160.000 88.000 C 160.000 83.582 163.582 80.000 168.000 80.000 C 172.418 80.000 176.000 83.582 176.000 88.000 Z"),
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
        return _tote!!
    }

private var _tote: ImageVector? = null
