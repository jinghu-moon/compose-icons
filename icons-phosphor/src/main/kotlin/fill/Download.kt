package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Download: ImageVector
    get() {
        if (_download != null) return _download!!
        _download = phosphorFillIcon(
            name = "Download",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 74.340 85.660 C 71.214 82.534 71.214 77.466 74.340 74.340 C 77.466 71.214 82.534 71.214 85.660 74.340 L 120.000 108.690 L 120.000 24.000 C 120.000 19.582 123.582 16.000 128.000 16.000 C 132.418 16.000 136.000 19.582 136.000 24.000 L 136.000 108.690 L 170.340 74.340 C 173.466 71.214 178.534 71.214 181.660 74.340 C 184.786 77.466 184.786 82.534 181.660 85.660 L 133.660 133.660 C 132.159 135.162 130.123 136.006 128.000 136.006 C 125.877 136.006 123.841 135.162 122.340 133.660 ZM 240.000 136.000 L 240.000 200.000 C 240.000 208.837 232.837 216.000 224.000 216.000 L 32.000 216.000 C 23.163 216.000 16.000 208.837 16.000 200.000 L 16.000 136.000 C 16.000 127.163 23.163 120.000 32.000 120.000 L 84.400 120.000 C 85.461 119.999 86.479 120.420 87.230 121.170 L 111.000 145.000 C 115.503 149.519 121.620 152.059 128.000 152.059 C 134.380 152.059 140.497 149.519 145.000 145.000 L 168.800 121.200 C 169.539 120.446 170.545 120.015 171.600 120.000 L 224.000 120.000 C 232.837 120.000 240.000 127.163 240.000 136.000 ZM 200.000 168.000 C 200.000 161.373 194.627 156.000 188.000 156.000 C 181.373 156.000 176.000 161.373 176.000 168.000 C 176.000 174.627 181.373 180.000 188.000 180.000 C 194.627 180.000 200.000 174.627 200.000 168.000 Z"),
        pathFillType = PathFillType.NonZero,
        fill = SolidColor(Color(0xFF000000)),
        fillAlpha = 1.0f,
        stroke = null,
        strokeAlpha = 1.0f,
        strokeLineWidth = 0.0f,
        strokeLineCap = StrokeCap.Butt,
        strokeLineJoin = StrokeJoin.Miter,
    )
        }
        return _download!!
    }

private var _download: ImageVector? = null
