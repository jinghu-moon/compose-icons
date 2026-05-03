package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Queue: ImageVector
    get() {
        if (_queue != null) return _queue!!
        _queue = phosphorThinIcon(
            name = "Queue",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 36.000 64.000 C 36.000 61.791 37.791 60.000 40.000 60.000 L 216.000 60.000 C 218.209 60.000 220.000 61.791 220.000 64.000 C 220.000 66.209 218.209 68.000 216.000 68.000 L 40.000 68.000 C 37.791 68.000 36.000 66.209 36.000 64.000 ZM 136.000 124.000 L 40.000 124.000 C 37.791 124.000 36.000 125.791 36.000 128.000 C 36.000 130.209 37.791 132.000 40.000 132.000 L 136.000 132.000 C 138.209 132.000 140.000 130.209 140.000 128.000 C 140.000 125.791 138.209 124.000 136.000 124.000 ZM 136.000 188.000 L 40.000 188.000 C 37.791 188.000 36.000 189.791 36.000 192.000 C 36.000 194.209 37.791 196.000 40.000 196.000 L 136.000 196.000 C 138.209 196.000 140.000 194.209 140.000 192.000 C 140.000 189.791 138.209 188.000 136.000 188.000 ZM 244.000 160.000 C 243.999 161.378 243.289 162.659 242.120 163.390 L 178.120 203.390 C 177.484 203.788 176.750 203.999 176.000 204.000 C 175.322 203.998 174.655 203.826 174.060 203.500 C 172.788 202.795 171.999 201.454 172.000 200.000 L 172.000 120.000 C 172.001 118.546 172.790 117.207 174.062 116.503 C 175.333 115.799 176.887 115.840 178.120 116.610 L 242.120 156.610 C 243.289 157.341 243.999 158.622 244.000 160.000 ZM 232.450 160.000 L 180.000 127.220 L 180.000 192.780 Z"),
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
        return _queue!!
    }

private var _queue: ImageVector? = null
