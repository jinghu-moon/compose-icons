package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Cactus: ImageVector
    get() {
        if (_cactus != null) return _cactus!!
        _cactus = phosphorFillIcon(
            name = "Cactus",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 224.000 216.000 C 224.000 220.418 220.418 224.000 216.000 224.000 L 40.000 224.000 C 35.582 224.000 32.000 220.418 32.000 216.000 C 32.000 211.582 35.582 208.000 40.000 208.000 L 88.000 208.000 L 88.000 136.000 L 80.000 136.000 C 44.670 135.961 16.039 107.330 16.000 72.000 C 16.039 58.730 26.810 47.994 40.080 48.000 L 40.480 48.000 C 53.463 48.017 63.983 58.537 64.000 71.520 L 64.000 72.000 L 64.000 72.000 C 64.000 80.837 71.163 88.000 80.000 88.000 L 88.000 88.000 L 88.000 56.000 C 88.000 33.909 105.909 16.000 128.000 16.000 C 150.091 16.000 168.000 33.909 168.000 56.000 L 168.000 128.000 L 176.000 128.000 C 184.837 128.000 192.000 120.837 192.000 112.000 L 192.000 112.000 L 192.000 111.520 C 192.017 98.537 202.537 88.017 215.520 88.000 L 215.920 88.000 C 229.190 87.994 239.961 98.730 240.000 112.000 C 239.961 147.330 211.330 175.961 176.000 176.000 L 168.000 176.000 L 168.000 208.000 L 216.000 208.000 C 220.418 208.000 224.000 211.582 224.000 216.000 Z"),
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
        return _cactus!!
    }

private var _cactus: ImageVector? = null
