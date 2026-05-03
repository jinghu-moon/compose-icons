package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.StackSimple: ImageVector
    get() {
        if (_stackSimple != null) return _stackSimple!!
        _stackSimple = phosphorDuotoneIcon(
            name = "StackSimple",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    group(
        groupAlpha = 0.20000000298023224f,
    ) {
        addPath(
            pathData = parseSvgPathData("M 240.000 104.000 L 128.000 168.000 L 16.000 104.000 L 128.000 40.000 Z"),
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
        pathData = parseSvgPathData("M 12.000 111.000 L 124.000 175.000 C 126.460 176.406 129.480 176.406 131.940 175.000 L 243.940 111.000 C 246.437 109.577 247.978 106.924 247.978 104.050 C 247.978 101.176 246.437 98.523 243.940 97.100 L 131.940 33.100 C 129.480 31.694 126.460 31.694 124.000 33.100 L 12.000 97.100 C 9.503 98.523 7.962 101.176 7.962 104.050 C 7.962 106.924 9.503 109.577 12.000 111.000 ZM 128.000 49.210 L 223.870 104.000 L 128.000 158.790 L 32.130 104.000 ZM 247.000 140.000 C 248.078 141.853 248.367 144.060 247.803 146.128 C 247.239 148.196 245.869 149.951 244.000 151.000 L 132.000 215.000 C 129.540 216.406 126.520 216.406 124.060 215.000 L 12.000 151.000 C 8.148 148.791 6.816 143.877 9.025 140.025 C 11.234 136.173 16.148 134.841 20.000 137.050 L 128.000 198.790 L 236.000 137.050 C 237.847 135.968 240.050 135.671 242.117 136.225 C 244.184 136.780 245.943 138.139 247.000 140.000 Z"),
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
