package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.Taxi: ImageVector
    get() {
        if (_taxi != null) return _taxi!!
        _taxi = phosphorDuotoneIcon(
            name = "Taxi",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            group(
                groupAlpha = 0.2f,
            ) {
                addPath(
                    pathData = parseSvgPathData("M 184.000 176.000 L 224.000 176.000 L 224.000 200.000 C 224.000 204.418 220.418 208.000 216.000 208.000 L 192.000 208.000 C 187.582 208.000 184.000 204.418 184.000 200.000 ZM 32.000 200.000 C 32.000 204.418 35.582 208.000 40.000 208.000 L 64.000 208.000 C 68.418 208.000 72.000 204.418 72.000 200.000 L 72.000 176.000 L 32.000 176.000 ZM 194.300 60.000 C 192.869 57.521 190.222 55.996 187.360 56.000 L 68.640 56.000 C 65.778 55.996 63.131 57.521 61.700 60.000 L 32.000 112.000 L 224.000 112.000 Z"),
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
            addPath(
                pathData = parseSvgPathData("M 240.000 104.000 L 228.640 104.000 L 201.250 56.060 C 198.401 51.076 193.101 48.000 187.360 48.000 L 165.420 48.000 L 153.420 18.060 C 151.009 11.977 145.123 7.987 138.580 8.000 L 117.420 8.000 C 110.869 7.979 104.974 11.970 102.560 18.060 L 90.580 48.000 L 68.640 48.000 C 62.899 48.000 57.599 51.076 54.750 56.060 L 27.360 104.000 L 16.000 104.000 C 11.582 104.000 8.000 107.582 8.000 112.000 C 8.000 116.418 11.582 120.000 16.000 120.000 L 24.000 120.000 L 24.000 200.000 C 24.000 208.837 31.163 216.000 40.000 216.000 L 64.000 216.000 C 72.837 216.000 80.000 208.837 80.000 200.000 L 80.000 184.000 L 176.000 184.000 L 176.000 200.000 C 176.000 208.837 183.163 216.000 192.000 216.000 L 216.000 216.000 C 224.837 216.000 232.000 208.837 232.000 200.000 L 232.000 120.000 L 240.000 120.000 C 244.418 120.000 248.000 116.418 248.000 112.000 C 248.000 107.582 244.418 104.000 240.000 104.000 ZM 117.420 24.000 L 138.580 24.000 L 148.180 48.000 L 107.820 48.000 ZM 68.640 64.000 L 187.360 64.000 L 210.210 104.000 L 45.790 104.000 ZM 64.000 200.000 L 40.000 200.000 L 40.000 184.000 L 64.000 184.000 ZM 192.000 200.000 L 192.000 184.000 L 216.000 184.000 L 216.000 200.000 ZM 216.000 168.000 L 40.000 168.000 L 40.000 120.000 L 216.000 120.000 ZM 56.000 144.000 C 56.000 139.582 59.582 136.000 64.000 136.000 L 80.000 136.000 C 84.418 136.000 88.000 139.582 88.000 144.000 C 88.000 148.418 84.418 152.000 80.000 152.000 L 64.000 152.000 C 59.582 152.000 56.000 148.418 56.000 144.000 ZM 168.000 144.000 C 168.000 139.582 171.582 136.000 176.000 136.000 L 192.000 136.000 C 196.418 136.000 200.000 139.582 200.000 144.000 C 200.000 148.418 196.418 152.000 192.000 152.000 L 176.000 152.000 C 171.582 152.000 168.000 148.418 168.000 144.000 Z"),
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
        return _taxi!!
    }

private var _taxi: ImageVector? = null
