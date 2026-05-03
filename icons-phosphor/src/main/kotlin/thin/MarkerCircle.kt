package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.MarkerCircle: ImageVector
    get() {
        if (_markerCircle != null) return _markerCircle!!
        _markerCircle = phosphorThinIcon(
            name = "MarkerCircle",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 198.710 57.290 C 173.485 31.843 136.573 21.837 101.949 31.060 C 67.326 40.283 40.283 67.326 31.060 101.949 C 21.837 136.573 31.843 173.485 57.290 198.710 C 82.515 224.157 119.427 234.163 154.051 224.940 C 188.674 215.717 215.717 188.674 224.940 154.051 C 234.163 119.427 224.157 82.515 198.710 57.290 ZM 84.000 208.830 L 84.000 176.000 C 84.000 173.791 85.791 172.000 88.000 172.000 L 168.000 172.000 C 170.209 172.000 172.000 173.791 172.000 176.000 L 172.000 208.830 C 144.557 223.723 111.443 223.723 84.000 208.830 ZM 108.150 140.000 L 152.000 140.000 C 154.209 140.000 156.000 141.791 156.000 144.000 L 156.000 164.000 L 100.000 164.000 L 100.000 144.000 C 100.000 141.791 101.791 140.000 104.000 140.000 ZM 113.080 132.000 L 124.080 79.180 C 124.459 77.316 126.098 75.976 128.000 75.976 C 129.902 75.976 131.541 77.316 131.920 79.180 L 142.920 132.000 ZM 193.080 193.050 C 189.063 197.061 184.684 200.693 180.000 203.900 L 180.000 176.000 C 180.000 169.373 174.627 164.000 168.000 164.000 L 164.000 164.000 L 164.000 144.000 C 164.000 137.373 158.627 132.000 152.000 132.000 L 151.090 132.000 L 139.750 77.550 C 138.595 71.980 133.688 67.987 128.000 67.987 C 122.312 67.987 117.405 71.980 116.250 77.550 L 104.910 132.000 L 104.000 132.000 C 97.373 132.000 92.000 137.373 92.000 144.000 L 92.000 164.000 L 88.000 164.000 C 81.373 164.000 76.000 169.373 76.000 176.000 L 76.000 203.900 C 71.344 200.689 66.992 197.057 63.000 193.050 C 36.686 166.739 28.813 127.167 43.052 92.788 C 57.291 58.409 90.838 35.992 128.050 35.992 C 165.262 35.992 198.809 58.409 213.048 92.788 C 227.287 127.167 219.414 166.739 193.100 193.050 Z"),
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
        return _markerCircle!!
    }

private var _markerCircle: ImageVector? = null
