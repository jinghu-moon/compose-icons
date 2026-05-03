package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.Binary: ImageVector
    get() {
        if (_binary != null) return _binary!!
        _binary = phosphorDuotoneIcon(
            name = "Binary",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    group(
        groupAlpha = 0.20000000298023224f,
    ) {
        addPath(
            pathData = parseSvgPathData("M 224.000 48.000 L 224.000 208.000 C 224.000 216.837 216.837 224.000 208.000 224.000 L 48.000 224.000 C 39.163 224.000 32.000 216.837 32.000 208.000 L 32.000 48.000 C 32.000 39.163 39.163 32.000 48.000 32.000 L 208.000 32.000 C 216.837 32.000 224.000 39.163 224.000 48.000 Z"),
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
        pathData = parseSvgPathData("M 94.000 24.000 C 71.630 24.000 56.000 43.740 56.000 72.000 C 56.000 100.260 71.630 120.000 94.000 120.000 C 116.370 120.000 132.000 100.260 132.000 72.000 C 132.000 43.740 116.370 24.000 94.000 24.000 ZM 94.000 104.000 C 76.630 104.000 72.000 83.890 72.000 72.000 C 72.000 60.110 76.630 40.000 94.000 40.000 C 111.370 40.000 116.000 60.110 116.000 72.000 C 116.000 83.890 111.370 104.000 94.000 104.000 ZM 166.000 136.000 C 143.630 136.000 128.000 155.740 128.000 184.000 C 128.000 212.260 143.630 232.000 166.000 232.000 C 188.370 232.000 204.000 212.260 204.000 184.000 C 204.000 155.740 188.370 136.000 166.000 136.000 ZM 166.000 216.000 C 148.630 216.000 144.000 195.890 144.000 184.000 C 144.000 172.110 148.630 152.000 166.000 152.000 C 183.370 152.000 188.000 172.110 188.000 184.000 C 188.000 195.890 183.370 216.000 166.000 216.000 ZM 145.000 49.220 C 143.969 47.365 143.718 45.176 144.301 43.136 C 144.884 41.095 146.255 39.370 148.110 38.340 L 172.110 25.010 C 174.588 23.631 177.610 23.667 180.054 25.104 C 182.499 26.541 184.000 29.165 184.000 32.000 L 184.000 112.000 C 184.000 116.418 180.418 120.000 176.000 120.000 C 171.582 120.000 168.000 116.418 168.000 112.000 L 168.000 45.600 L 155.880 52.330 C 154.025 53.361 151.836 53.612 149.796 53.029 C 147.755 52.446 146.030 51.075 145.000 49.220 ZM 104.000 144.000 L 104.000 224.000 C 104.000 228.418 100.418 232.000 96.000 232.000 C 91.582 232.000 88.000 228.418 88.000 224.000 L 88.000 157.600 L 75.880 164.330 C 72.014 166.473 67.143 165.076 65.000 161.210 C 62.857 157.344 64.254 152.473 68.120 150.330 L 92.120 137.000 C 94.599 135.625 97.619 135.665 100.061 137.104 C 102.503 138.542 104.001 141.166 104.000 144.000 Z"),
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
        return _binary!!
    }

private var _binary: ImageVector? = null
