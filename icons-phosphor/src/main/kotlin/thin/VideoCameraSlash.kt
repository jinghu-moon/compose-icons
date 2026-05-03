package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.VideoCameraSlash: ImageVector
    get() {
        if (_videoCameraSlash != null) return _videoCameraSlash!!
        _videoCameraSlash = phosphorThinIcon(
            name = "VideoCameraSlash",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 249.890 76.470 C 248.588 75.773 247.008 75.850 245.780 76.670 L 204.000 104.530 L 204.000 72.000 C 204.000 65.373 198.627 60.000 192.000 60.000 L 113.060 60.000 C 110.851 60.000 109.060 61.791 109.060 64.000 C 109.060 66.209 110.851 68.000 113.060 68.000 L 192.000 68.000 C 194.209 68.000 196.000 69.791 196.000 72.000 L 196.000 159.630 C 196.000 161.839 197.791 163.630 200.000 163.630 C 202.209 163.630 204.000 161.839 204.000 159.630 L 204.000 151.470 L 245.780 179.330 C 247.008 180.149 248.587 180.226 249.888 179.529 C 251.189 178.832 252.001 177.476 252.000 176.000 L 252.000 80.000 C 252.002 78.524 251.191 77.167 249.890 76.470 ZM 244.000 168.530 L 204.000 141.860 L 204.000 114.140 L 244.000 87.470 ZM 51.000 37.310 C 49.514 35.653 46.967 35.514 45.310 37.000 C 43.653 38.486 43.514 41.033 45.000 42.690 L 60.780 60.000 L 32.000 60.000 C 25.373 60.000 20.000 65.373 20.000 72.000 L 20.000 184.000 C 20.000 190.627 25.373 196.000 32.000 196.000 L 184.410 196.000 L 205.000 218.690 C 205.956 219.768 207.417 220.248 208.826 219.948 C 210.235 219.647 211.374 218.613 211.807 217.239 C 212.240 215.865 211.902 214.364 210.920 213.310 ZM 32.000 188.000 C 29.791 188.000 28.000 186.209 28.000 184.000 L 28.000 72.000 C 28.000 69.791 29.791 68.000 32.000 68.000 L 68.050 68.000 L 177.140 188.000 Z"),
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
        return _videoCameraSlash!!
    }

private var _videoCameraSlash: ImageVector? = null
