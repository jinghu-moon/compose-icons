package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.GenderIntersex: ImageVector
    get() {
        if (_genderIntersex != null) return _genderIntersex!!
        _genderIntersex = phosphorDuotoneIcon(
            name = "GenderIntersex",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            group(
                groupAlpha = 0.2f,
            ) {
                addPath(
                    pathData = parseSvgPathData("M 176.000 112.000 C 176.000 142.928 150.928 168.000 120.000 168.000 C 89.072 168.000 64.000 142.928 64.000 112.000 C 64.000 81.072 89.072 56.000 120.000 56.000 C 150.928 56.000 176.000 81.072 176.000 112.000 Z"),
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
                pathData = parseSvgPathData("M 208.000 24.000 L 168.000 24.000 C 163.582 24.000 160.000 27.582 160.000 32.000 C 160.000 36.418 163.582 40.000 168.000 40.000 L 188.690 40.000 L 163.540 65.150 C 143.268 46.258 113.140 42.558 88.899 55.984 C 64.658 69.410 51.810 96.911 57.070 124.118 C 62.330 151.325 84.502 172.057 112.000 175.480 L 112.000 192.000 L 88.000 192.000 C 83.582 192.000 80.000 195.582 80.000 200.000 C 80.000 204.418 83.582 208.000 88.000 208.000 L 112.000 208.000 L 112.000 232.000 C 112.000 236.418 115.582 240.000 120.000 240.000 C 124.418 240.000 128.000 236.418 128.000 232.000 L 128.000 208.000 L 152.000 208.000 C 156.418 208.000 160.000 204.418 160.000 200.000 C 160.000 195.582 156.418 192.000 152.000 192.000 L 128.000 192.000 L 128.000 175.480 C 149.797 172.757 168.669 159.033 177.976 139.136 C 187.283 119.238 185.721 95.956 173.840 77.480 L 200.000 51.310 L 200.000 72.000 C 200.000 76.418 203.582 80.000 208.000 80.000 C 212.418 80.000 216.000 76.418 216.000 72.000 L 216.000 32.000 C 216.000 27.582 212.418 24.000 208.000 24.000 ZM 120.000 160.000 C 93.490 160.000 72.000 138.510 72.000 112.000 C 72.000 85.490 93.490 64.000 120.000 64.000 C 146.510 64.000 168.000 85.490 168.000 112.000 C 167.972 138.498 146.498 159.972 120.000 160.000 Z"),
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
        return _genderIntersex!!
    }

private var _genderIntersex: ImageVector? = null
