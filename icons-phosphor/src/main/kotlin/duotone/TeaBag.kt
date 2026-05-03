package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.TeaBag: ImageVector
    get() {
        if (_teaBag != null) return _teaBag!!
        _teaBag = phosphorDuotoneIcon(
            name = "TeaBag",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            group(
                groupAlpha = 0.2f,
            ) {
                addPath(
                    pathData = parseSvgPathData("M 160.000 122.220 L 160.000 216.000 C 160.000 220.418 156.418 224.000 152.000 224.000 L 56.000 224.000 C 51.582 224.000 48.000 220.418 48.000 216.000 L 48.000 122.220 C 47.999 120.769 48.393 119.345 49.140 118.100 L 69.670 83.880 C 71.117 81.472 73.721 79.999 76.530 80.000 L 131.470 80.000 C 134.279 79.999 136.883 81.472 138.330 83.880 L 158.860 118.100 C 159.607 119.345 160.001 120.769 160.000 122.220 Z"),
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
                pathData = parseSvgPathData("M 224.000 160.000 C 215.163 160.000 208.000 152.837 208.000 144.000 L 208.000 64.000 C 208.000 33.072 182.928 8.000 152.000 8.000 C 121.072 8.000 96.000 33.072 96.000 64.000 L 96.000 72.000 L 76.530 72.000 C 70.914 72.018 65.714 74.963 62.810 79.770 L 42.280 114.000 C 40.793 116.484 40.005 119.325 40.000 122.220 L 40.000 216.000 C 40.000 224.837 47.163 232.000 56.000 232.000 L 152.000 232.000 C 160.837 232.000 168.000 224.837 168.000 216.000 L 168.000 122.220 C 167.998 119.318 167.211 116.470 165.720 113.980 L 145.190 79.770 C 142.286 74.963 137.086 72.018 131.470 72.000 L 112.000 72.000 L 112.000 64.000 C 112.000 41.909 129.909 24.000 152.000 24.000 C 174.091 24.000 192.000 41.909 192.000 64.000 L 192.000 144.000 C 192.000 161.673 206.327 176.000 224.000 176.000 C 228.418 176.000 232.000 172.418 232.000 168.000 C 232.000 163.582 228.418 160.000 224.000 160.000 ZM 131.470 88.000 L 152.000 122.220 L 152.000 216.000 L 56.000 216.000 L 56.000 122.220 L 76.530 88.000 L 96.000 88.000 L 96.000 136.000 C 96.000 140.418 99.582 144.000 104.000 144.000 C 108.418 144.000 112.000 140.418 112.000 136.000 L 112.000 88.000 Z"),
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
        return _teaBag!!
    }

private var _teaBag: ImageVector? = null
