package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.CubeTransparent: ImageVector
    get() {
        if (_cubeTransparent != null) return _cubeTransparent!!
        _cubeTransparent = phosphorFillIcon(
            name = "CubeTransparent",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 104.000 152.000 L 104.000 104.000 L 152.000 104.000 L 152.000 152.000 ZM 32.000 53.000 L 32.000 148.000 C 32.000 150.209 33.791 152.000 36.000 152.000 L 88.000 152.000 L 88.000 99.310 L 38.830 50.140 C 37.682 48.991 35.953 48.650 34.455 49.277 C 32.957 49.905 31.986 51.376 32.000 53.000 ZM 220.000 104.000 L 168.000 104.000 L 168.000 156.690 L 217.170 205.860 C 218.318 207.009 220.047 207.350 221.545 206.723 C 223.043 206.095 224.014 204.624 224.000 203.000 L 224.000 108.000 C 224.000 105.791 222.209 104.000 220.000 104.000 ZM 152.000 36.000 C 152.000 33.791 150.209 32.000 148.000 32.000 L 53.000 32.000 C 51.381 31.999 49.921 32.973 49.302 34.469 C 48.682 35.964 49.025 37.686 50.170 38.830 L 99.310 88.000 L 152.000 88.000 ZM 212.490 81.170 L 174.830 43.510 C 173.686 42.365 171.964 42.022 170.469 42.642 C 168.973 43.261 167.999 44.721 168.000 46.340 L 168.000 88.000 L 209.660 88.000 C 211.279 88.001 212.739 87.027 213.358 85.531 C 213.978 84.036 213.635 82.314 212.490 81.170 ZM 156.690 168.000 L 104.000 168.000 L 104.000 220.000 C 104.000 222.209 105.791 224.000 108.000 224.000 L 203.000 224.000 C 204.619 224.001 206.079 223.027 206.698 221.531 C 207.318 220.036 206.975 218.314 205.830 217.170 ZM 43.510 174.830 L 81.170 212.490 C 82.314 213.635 84.036 213.978 85.531 213.358 C 87.027 212.739 88.001 211.279 88.000 209.660 L 88.000 168.000 L 46.340 168.000 C 44.721 167.999 43.261 168.973 42.642 170.469 C 42.022 171.964 42.365 173.686 43.510 174.830 Z"),
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
        return _cubeTransparent!!
    }

private var _cubeTransparent: ImageVector? = null
