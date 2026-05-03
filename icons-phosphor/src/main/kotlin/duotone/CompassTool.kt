package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.CompassTool: ImageVector
    get() {
        if (_compassTool != null) return _compassTool!!
        _compassTool = phosphorDuotoneIcon(
            name = "CompassTool",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            group(
                groupAlpha = 0.2f,
            ) {
                addPath(
                    pathData = parseSvgPathData("M 160.000 80.000 C 160.000 97.673 145.673 112.000 128.000 112.000 C 110.327 112.000 96.000 97.673 96.000 80.000 C 96.000 62.327 110.327 48.000 128.000 48.000 C 145.673 48.000 160.000 62.327 160.000 80.000 Z"),
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
                pathData = parseSvgPathData("M 215.120 123.640 C 216.523 121.085 216.425 117.970 214.866 115.508 C 213.306 113.046 210.530 111.627 207.621 111.804 C 204.712 111.981 202.129 113.727 200.880 116.360 C 193.484 130.607 181.953 142.285 167.800 149.860 L 151.220 112.540 C 164.170 103.293 170.407 87.251 167.105 71.685 C 163.803 56.120 151.588 43.992 136.000 40.800 L 136.000 24.000 C 136.000 19.582 132.418 16.000 128.000 16.000 C 123.582 16.000 120.000 19.582 120.000 24.000 L 120.000 40.800 C 104.412 43.992 92.197 56.120 88.895 71.685 C 85.593 87.251 91.830 103.293 104.780 112.540 L 56.690 220.750 C 55.513 223.364 55.825 226.409 57.508 228.730 C 59.191 231.051 61.987 232.294 64.838 231.989 C 67.688 231.683 70.158 229.875 71.310 227.250 L 96.450 170.690 C 106.593 174.222 117.260 176.017 128.000 176.000 C 138.746 175.988 149.419 174.228 159.600 170.790 L 184.690 227.250 C 186.498 231.265 191.211 233.065 195.235 231.276 C 199.259 229.487 201.080 224.782 199.310 220.750 L 174.310 164.500 C 191.792 155.401 206.043 141.133 215.120 123.640 ZM 128.000 56.000 C 141.255 56.000 152.000 66.745 152.000 80.000 C 152.000 93.255 141.255 104.000 128.000 104.000 C 114.745 104.000 104.000 93.255 104.000 80.000 C 104.000 66.745 114.745 56.000 128.000 56.000 ZM 128.000 160.000 C 119.507 160.010 111.066 158.660 103.000 156.000 L 119.420 119.060 C 125.085 120.313 130.955 120.313 136.620 119.060 L 153.100 156.120 C 144.981 158.690 136.516 159.999 128.000 160.000 Z"),
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
        return _compassTool!!
    }

private var _compassTool: ImageVector? = null
