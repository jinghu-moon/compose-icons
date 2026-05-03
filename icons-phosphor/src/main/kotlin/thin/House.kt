package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.House: ImageVector
    get() {
        if (_house != null) return _house!!
        _house = phosphorThinIcon(
            name = "House",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 216.490 111.510 L 136.490 31.510 C 134.238 29.251 131.180 27.981 127.990 27.981 C 124.800 27.981 121.742 29.251 119.490 31.510 L 39.490 111.510 C 37.247 113.766 35.992 116.819 36.000 120.000 L 36.000 216.000 C 36.000 218.209 37.791 220.000 40.000 220.000 L 104.000 220.000 C 106.209 220.000 108.000 218.209 108.000 216.000 L 108.000 156.000 L 148.000 156.000 L 148.000 216.000 C 148.000 218.209 149.791 220.000 152.000 220.000 L 216.000 220.000 C 218.209 220.000 220.000 218.209 220.000 216.000 L 220.000 120.000 C 220.003 116.816 218.740 113.762 216.490 111.510 ZM 212.000 212.000 L 156.000 212.000 L 156.000 152.000 C 156.000 149.791 154.209 148.000 152.000 148.000 L 104.000 148.000 C 101.791 148.000 100.000 149.791 100.000 152.000 L 100.000 212.000 L 44.000 212.000 L 44.000 120.000 C 43.999 118.939 44.420 117.921 45.170 117.170 L 125.170 37.170 C 125.920 36.419 126.938 35.997 128.000 35.997 C 129.062 35.997 130.080 36.419 130.830 37.170 L 210.830 117.170 C 211.580 117.921 212.001 118.939 212.000 120.000 Z"),
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
        return _house!!
    }

private var _house: ImageVector? = null
