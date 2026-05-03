package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.LineSegment: ImageVector
    get() {
        if (_lineSegment != null) return _lineSegment!!
        _lineSegment = phosphorLightIcon(
            name = "LineSegment",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 213.230 42.770 C 202.337 31.879 184.966 31.007 173.038 40.753 C 161.110 50.499 158.500 67.694 167.000 80.540 L 80.540 167.000 C 68.638 159.158 52.866 160.749 42.770 170.810 L 42.770 170.810 C 31.606 181.976 31.008 199.885 41.404 211.771 C 51.799 223.657 69.628 225.450 82.182 215.873 C 94.736 206.295 97.717 188.626 89.000 175.460 L 175.460 89.000 C 188.310 97.547 205.549 94.951 215.311 82.997 C 225.073 71.043 224.173 53.633 213.230 42.750 ZM 76.720 204.770 C 69.690 211.798 58.294 211.797 51.266 204.767 C 44.237 197.738 44.237 186.342 51.266 179.313 C 58.294 172.283 69.690 172.282 76.720 179.310 C 83.732 186.336 83.732 197.714 76.720 204.740 ZM 204.720 76.770 C 201.344 80.147 196.765 82.044 191.990 82.044 C 187.215 82.044 182.636 80.147 179.260 76.770 L 179.260 76.770 C 172.232 69.740 172.233 58.344 179.263 51.316 C 186.292 44.287 197.688 44.287 204.717 51.316 C 211.747 58.344 211.748 69.740 204.720 76.770 Z"),
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
        return _lineSegment!!
    }

private var _lineSegment: ImageVector? = null
