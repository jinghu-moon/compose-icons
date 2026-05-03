package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.TrafficSign: ImageVector
    get() {
        if (_trafficSign != null) return _trafficSign!!
        _trafficSign = phosphorFillIcon(
            name = "TrafficSign",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 243.150 116.290 L 139.710 12.850 C 136.604 9.744 132.392 7.999 128.000 7.999 C 123.608 7.999 119.396 9.744 116.290 12.850 L 12.850 116.290 C 9.744 119.396 7.999 123.608 7.999 128.000 C 7.999 132.392 9.744 136.604 12.850 139.710 L 116.290 243.150 L 116.290 243.150 C 119.396 246.256 123.608 248.001 128.000 248.001 C 132.392 248.001 136.604 246.256 139.710 243.150 L 243.150 139.710 C 246.256 136.604 248.001 132.392 248.001 128.000 C 248.001 123.608 246.256 119.396 243.150 116.290 ZM 173.660 125.660 L 149.660 149.660 C 146.534 152.786 141.466 152.786 138.340 149.660 C 135.214 146.534 135.214 141.466 138.340 138.340 L 148.690 128.000 L 112.000 128.000 C 103.163 128.000 96.000 135.163 96.000 144.000 L 96.000 152.000 C 96.000 156.418 92.418 160.000 88.000 160.000 C 83.582 160.000 80.000 156.418 80.000 152.000 L 80.000 144.000 C 80.000 126.327 94.327 112.000 112.000 112.000 L 148.690 112.000 L 138.340 101.660 C 135.214 98.534 135.214 93.466 138.340 90.340 C 141.466 87.214 146.534 87.214 149.660 90.340 L 173.660 114.340 C 175.162 115.841 176.006 117.877 176.006 120.000 C 176.006 122.123 175.162 124.159 173.660 125.660 Z"),
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
        return _trafficSign!!
    }

private var _trafficSign: ImageVector? = null
