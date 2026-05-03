package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.StackSimple: ImageVector
    get() {
        if (_stackSimple != null) return _stackSimple!!
        _stackSimple = phosphorFillIcon(
            name = "StackSimple",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 12.000 111.000 L 124.000 175.000 C 126.460 176.406 129.480 176.406 131.940 175.000 L 243.940 111.000 C 246.437 109.577 247.978 106.924 247.978 104.050 C 247.978 101.176 246.437 98.523 243.940 97.100 L 131.940 33.100 C 129.480 31.694 126.460 31.694 124.000 33.100 L 12.000 97.100 C 9.503 98.523 7.962 101.176 7.962 104.050 C 7.962 106.924 9.503 109.577 12.000 111.000 Z"),
        pathFillType = PathFillType.NonZero,
        fill = SolidColor(Color(0xFF000000)),
        fillAlpha = 1.0f,
        stroke = null,
        strokeAlpha = 1.0f,
        strokeLineWidth = 0.0f,
        strokeLineCap = StrokeCap.Butt,
        strokeLineJoin = StrokeJoin.Miter,
    )
    addPath(
        pathData = parseSvgPathData("M 236.000 137.050 L 128.000 198.790 L 20.000 137.050 C 16.148 134.841 11.234 136.173 9.025 140.025 C 6.816 143.877 8.148 148.791 12.000 151.000 L 124.000 215.000 C 126.460 216.406 129.480 216.406 131.940 215.000 L 243.940 151.000 C 247.778 148.807 249.113 143.918 246.920 140.080 C 244.727 136.242 239.838 134.907 236.000 137.100 Z"),
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
