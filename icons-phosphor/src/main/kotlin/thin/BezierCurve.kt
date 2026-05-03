package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.BezierCurve: ImageVector
    get() {
        if (_bezierCurve != null) return _bezierCurve!!
        _bezierCurve = phosphorThinIcon(
            name = "BezierCurve",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 217.830 148.070 C 211.432 119.682 192.062 95.953 165.530 84.000 L 240.000 84.000 C 242.209 84.000 244.000 82.209 244.000 80.000 C 244.000 77.791 242.209 76.000 240.000 76.000 L 155.710 76.000 C 153.713 62.233 141.911 52.019 128.000 52.019 C 114.089 52.019 102.287 62.233 100.290 76.000 L 16.000 76.000 C 13.791 76.000 12.000 77.791 12.000 80.000 C 12.000 82.209 13.791 84.000 16.000 84.000 L 90.470 84.000 C 63.938 95.953 44.568 119.682 38.170 148.070 C 23.525 149.037 12.112 161.148 12.015 175.824 C 11.918 190.501 23.170 202.761 37.801 203.922 C 52.432 205.082 65.476 194.748 67.693 180.240 C 69.911 165.732 60.549 151.973 46.240 148.710 C 52.991 120.480 73.757 97.690 101.240 88.350 C 104.888 100.047 115.718 108.013 127.970 108.013 C 140.222 108.013 151.052 100.047 154.700 88.350 C 182.180 97.693 202.946 120.482 209.700 148.710 C 195.391 151.973 186.029 165.732 188.247 180.240 C 190.464 194.748 203.508 205.082 218.139 203.922 C 232.770 202.761 244.022 190.501 243.925 175.824 C 243.828 161.148 232.415 149.037 217.770 148.070 ZM 60.000 176.000 C 60.000 187.046 51.046 196.000 40.000 196.000 C 28.954 196.000 20.000 187.046 20.000 176.000 C 20.000 164.954 28.954 156.000 40.000 156.000 C 51.046 156.000 60.000 164.954 60.000 176.000 ZM 128.000 100.000 C 116.954 100.000 108.000 91.046 108.000 80.000 C 108.000 68.954 116.954 60.000 128.000 60.000 C 139.046 60.000 148.000 68.954 148.000 80.000 C 148.000 91.046 139.046 100.000 128.000 100.000 ZM 216.000 196.000 C 204.954 196.000 196.000 187.046 196.000 176.000 C 196.000 164.954 204.954 156.000 216.000 156.000 C 227.046 156.000 236.000 164.954 236.000 176.000 C 236.000 187.046 227.046 196.000 216.000 196.000 Z"),
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
        return _bezierCurve!!
    }

private var _bezierCurve: ImageVector? = null
