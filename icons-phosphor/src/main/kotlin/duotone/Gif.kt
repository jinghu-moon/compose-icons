package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.Gif: ImageVector
    get() {
        if (_gif != null) return _gif!!
        _gif = phosphorDuotoneIcon(
            name = "Gif",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    group(
        groupAlpha = 0.20000000298023224f,
    ) {
        addPath(
            pathData = parseSvgPathData("M 224.000 56.000 L 224.000 200.000 C 224.000 208.837 216.837 216.000 208.000 216.000 L 48.000 216.000 C 39.163 216.000 32.000 208.837 32.000 200.000 L 32.000 56.000 C 32.000 47.163 39.163 40.000 48.000 40.000 L 208.000 40.000 C 216.837 40.000 224.000 47.163 224.000 56.000 Z"),
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
    addPath(
        pathData = parseSvgPathData("M 144.000 72.000 L 144.000 184.000 C 144.000 188.418 140.418 192.000 136.000 192.000 C 131.582 192.000 128.000 188.418 128.000 184.000 L 128.000 72.000 C 128.000 67.582 131.582 64.000 136.000 64.000 C 140.418 64.000 144.000 67.582 144.000 72.000 ZM 232.000 64.000 L 176.000 64.000 C 171.582 64.000 168.000 67.582 168.000 72.000 L 168.000 184.000 C 168.000 188.418 171.582 192.000 176.000 192.000 C 180.418 192.000 184.000 188.418 184.000 184.000 L 184.000 136.000 L 224.000 136.000 C 228.418 136.000 232.000 132.418 232.000 128.000 C 232.000 123.582 228.418 120.000 224.000 120.000 L 184.000 120.000 L 184.000 80.000 L 232.000 80.000 C 236.418 80.000 240.000 76.418 240.000 72.000 C 240.000 67.582 236.418 64.000 232.000 64.000 ZM 96.000 120.000 L 72.000 120.000 C 67.582 120.000 64.000 123.582 64.000 128.000 C 64.000 132.418 67.582 136.000 72.000 136.000 L 88.000 136.000 L 88.000 152.000 C 88.000 165.255 77.255 176.000 64.000 176.000 C 50.745 176.000 40.000 165.255 40.000 152.000 L 40.000 104.000 C 40.000 90.745 50.745 80.000 64.000 80.000 C 75.190 80.000 85.610 87.740 88.250 98.000 C 89.355 102.280 93.720 104.855 98.000 103.750 C 102.280 102.645 104.855 98.280 103.750 94.000 C 99.270 76.620 82.560 64.000 64.000 64.000 C 41.909 64.000 24.000 81.909 24.000 104.000 L 24.000 152.000 C 24.000 174.091 41.909 192.000 64.000 192.000 C 86.091 192.000 104.000 174.091 104.000 152.000 L 104.000 128.000 C 104.000 123.582 100.418 120.000 96.000 120.000 Z"),
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
        return _gif!!
    }

private var _gif: ImageVector? = null
