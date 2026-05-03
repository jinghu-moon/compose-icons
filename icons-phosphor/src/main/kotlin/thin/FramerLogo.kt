package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.FramerLogo: ImageVector
    get() {
        if (_framerLogo != null) return _framerLogo!!
        _framerLogo = phosphorThinIcon(
            name = "FramerLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 204.000 104.000 L 204.000 40.000 C 204.000 37.791 202.209 36.000 200.000 36.000 L 56.000 36.000 C 54.334 35.994 52.838 37.022 52.247 38.579 C 51.655 40.137 52.090 41.898 53.340 43.000 L 117.480 100.000 L 56.000 100.000 C 53.791 100.000 52.000 101.791 52.000 104.000 L 52.000 168.000 C 51.999 169.061 52.420 170.079 53.170 170.830 L 125.170 242.830 C 126.314 243.975 128.036 244.318 129.531 243.698 C 131.027 243.079 132.001 241.619 132.000 240.000 L 132.000 172.000 L 200.000 172.000 C 201.666 172.006 203.162 170.978 203.753 169.421 C 204.345 167.863 203.910 166.102 202.660 165.000 L 138.520 108.000 L 200.000 108.000 C 202.209 108.000 204.000 106.209 204.000 104.000 ZM 189.480 164.000 L 128.000 164.000 C 125.791 164.000 124.000 165.791 124.000 168.000 L 124.000 230.340 L 60.000 166.340 L 60.000 108.000 L 126.480 108.000 ZM 196.000 100.000 L 129.520 100.000 L 66.520 44.000 L 196.000 44.000 Z"),
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
        return _framerLogo!!
    }

private var _framerLogo: ImageVector? = null
