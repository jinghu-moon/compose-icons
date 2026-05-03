package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.LineSegment: ImageVector
    get() {
        if (_lineSegment != null) return _lineSegment!!
        _lineSegment = phosphorDuotoneIcon(
            name = "LineSegment",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    group(
        groupAlpha = 0.20000000298023224f,
    ) {
        addPath(
            pathData = parseSvgPathData("M 81.000 175.000 C 90.349 184.381 90.331 199.562 80.961 208.921 C 71.590 218.281 56.410 218.281 47.039 208.921 C 37.669 199.562 37.651 184.381 47.000 175.000 C 51.503 170.481 57.620 167.941 64.000 167.941 C 70.380 167.941 76.497 170.481 81.000 175.000 ZM 209.000 47.000 C 199.619 37.651 184.438 37.669 175.079 47.039 C 165.719 56.410 165.719 71.590 175.079 80.961 C 184.438 90.331 199.619 90.349 209.000 81.000 C 213.519 76.497 216.059 70.380 216.059 64.000 C 216.059 57.620 213.519 51.503 209.000 47.000 Z"),
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
        pathData = parseSvgPathData("M 214.640 41.360 C 203.249 29.937 185.136 28.779 172.383 38.658 C 159.630 48.538 156.225 66.366 164.440 80.250 L 80.250 164.440 C 67.673 157.046 51.689 159.076 41.360 169.380 L 41.360 169.380 C 29.605 181.141 28.817 199.945 39.547 212.649 C 50.276 225.353 68.947 227.722 82.509 218.101 C 96.071 208.479 100.005 190.074 91.560 175.750 L 175.750 91.560 C 189.634 99.775 207.462 96.370 217.342 83.617 C 227.221 70.864 226.063 52.751 214.640 41.360 ZM 75.310 203.360 C 69.058 209.612 58.922 209.612 52.670 203.360 C 46.418 197.108 46.418 186.972 52.670 180.720 L 52.670 180.720 C 55.671 177.719 59.741 176.032 63.985 176.032 C 68.229 176.032 72.299 177.719 75.300 180.720 L 75.300 180.720 C 81.540 186.964 81.544 197.081 75.310 203.330 ZM 203.310 75.360 C 197.061 81.607 186.931 81.607 180.683 75.358 C 174.436 69.110 174.436 58.980 180.683 52.732 C 186.931 46.483 197.061 46.483 203.310 52.730 C 209.526 58.966 209.535 69.053 203.330 75.300 Z"),
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
        return _lineSegment!!
    }

private var _lineSegment: ImageVector? = null
