package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Upload: ImageVector
    get() {
        if (_upload != null) return _upload!!
        _upload = phosphorFillIcon(
            name = "Upload",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 74.340 77.660 C 72.838 76.159 71.994 74.123 71.994 72.000 C 71.994 69.877 72.838 67.841 74.340 66.340 L 122.340 18.340 C 123.841 16.838 125.877 15.994 128.000 15.994 C 130.123 15.994 132.159 16.838 133.660 18.340 L 181.660 66.340 C 184.786 69.466 184.786 74.534 181.660 77.660 C 178.534 80.786 173.466 80.786 170.340 77.660 L 136.000 43.310 L 136.000 128.000 C 136.000 132.418 132.418 136.000 128.000 136.000 C 123.582 136.000 120.000 132.418 120.000 128.000 L 120.000 43.310 L 85.660 77.660 C 84.159 79.162 82.123 80.006 80.000 80.006 C 77.877 80.006 75.841 79.162 74.340 77.660 ZM 240.000 136.000 L 240.000 200.000 C 240.000 208.837 232.837 216.000 224.000 216.000 L 32.000 216.000 C 23.163 216.000 16.000 208.837 16.000 200.000 L 16.000 136.000 C 16.000 127.163 23.163 120.000 32.000 120.000 L 100.000 120.000 C 102.209 120.000 104.000 121.791 104.000 124.000 L 104.000 127.460 C 104.000 140.910 115.000 152.250 128.460 152.000 C 141.535 151.749 152.002 141.077 152.000 128.000 L 152.000 124.000 C 152.000 121.791 153.791 120.000 156.000 120.000 L 224.000 120.000 C 232.837 120.000 240.000 127.163 240.000 136.000 ZM 200.000 168.000 C 200.000 161.373 194.627 156.000 188.000 156.000 C 181.373 156.000 176.000 161.373 176.000 168.000 C 176.000 174.627 181.373 180.000 188.000 180.000 C 194.627 180.000 200.000 174.627 200.000 168.000 Z"),
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
        return _upload!!
    }

private var _upload: ImageVector? = null
