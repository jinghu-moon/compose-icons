package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.StackSimple: ImageVector
    get() {
        if (_stackSimple != null) return _stackSimple!!
        _stackSimple = phosphorRegularIcon(
            name = "StackSimple",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 12.000 111.000 L 124.000 175.000 C 126.460 176.406 129.480 176.406 131.940 175.000 L 243.940 111.000 C 246.437 109.577 247.978 106.924 247.978 104.050 C 247.978 101.176 246.437 98.523 243.940 97.100 L 131.940 33.100 C 129.480 31.694 126.460 31.694 124.000 33.100 L 12.000 97.100 C 9.503 98.523 7.962 101.176 7.962 104.050 C 7.962 106.924 9.503 109.577 12.000 111.000 ZM 128.000 49.210 L 223.870 104.000 L 128.000 158.790 L 32.130 104.000 ZM 246.940 140.000 C 248.023 141.845 248.321 144.047 247.769 146.114 C 247.216 148.181 245.859 149.941 244.000 151.000 L 132.000 215.000 C 129.540 216.406 126.520 216.406 124.060 215.000 L 12.000 151.000 C 8.148 148.791 6.816 143.877 9.025 140.025 C 11.234 136.173 16.148 134.841 20.000 137.050 L 128.000 198.790 L 236.000 137.050 C 237.841 135.987 240.030 135.701 242.082 136.254 C 244.135 136.808 245.883 138.156 246.940 140.000 Z"),
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
        return _stackSimple!!
    }

private var _stackSimple: ImageVector? = null
