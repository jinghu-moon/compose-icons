package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Watch: ImageVector
    get() {
        if (_watch != null) return _watch!!
        _watch = phosphorFillIcon(
            name = "Watch",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 175.300 63.530 L 169.060 29.150 C 167.682 21.538 161.056 16.002 153.320 16.000 L 102.680 16.000 C 94.944 16.002 88.318 21.538 86.940 29.150 L 80.700 63.530 C 60.145 78.578 47.998 102.526 47.998 128.000 C 47.998 153.474 60.145 177.422 80.700 192.470 L 86.940 226.850 C 88.318 234.462 94.944 239.998 102.680 240.000 L 153.320 240.000 C 161.056 239.998 167.682 234.462 169.060 226.850 L 175.300 192.470 C 195.855 177.422 208.002 153.474 208.002 128.000 C 208.002 102.526 195.855 78.578 175.300 63.530 ZM 102.680 32.000 L 153.320 32.000 L 157.230 53.550 C 138.446 46.150 117.554 46.150 98.770 53.550 ZM 153.320 224.000 L 102.680 224.000 L 98.770 202.450 C 117.554 209.850 138.446 209.850 157.230 202.450 ZM 168.000 136.000 L 128.000 136.000 C 123.582 136.000 120.000 132.418 120.000 128.000 L 120.000 88.000 C 120.000 83.582 123.582 80.000 128.000 80.000 C 132.418 80.000 136.000 83.582 136.000 88.000 L 136.000 120.000 L 168.000 120.000 C 172.418 120.000 176.000 123.582 176.000 128.000 C 176.000 132.418 172.418 136.000 168.000 136.000 Z"),
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
        return _watch!!
    }

private var _watch: ImageVector? = null
