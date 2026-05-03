package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.CameraSlash: ImageVector
    get() {
        if (_cameraSlash != null) return _cameraSlash!!
        _cameraSlash = phosphorBoldIcon(
            name = "CameraSlash",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 56.880 31.930 C 54.012 28.697 49.628 27.256 45.401 28.157 C 41.175 29.058 37.759 32.162 36.459 36.284 C 35.159 40.405 36.175 44.907 39.120 48.070 L 43.120 52.440 C 29.751 54.806 20.006 66.423 20.000 80.000 L 20.000 192.000 C 20.000 207.464 32.536 220.000 48.000 220.000 L 195.420 220.000 L 199.120 224.070 C 203.598 228.880 211.111 229.194 215.974 224.774 C 220.837 220.355 221.241 212.846 216.880 207.930 ZM 106.230 121.930 L 136.000 154.640 C 126.889 157.866 116.731 155.312 110.230 148.160 C 103.728 141.008 102.152 130.653 106.230 121.890 ZM 48.000 196.000 C 45.791 196.000 44.000 194.209 44.000 192.000 L 44.000 80.000 C 44.000 77.791 45.791 76.000 48.000 76.000 L 64.510 76.000 L 89.430 103.410 C 75.812 121.824 77.100 147.294 92.506 164.241 C 107.913 181.187 133.146 184.888 152.770 173.080 L 173.600 196.000 ZM 236.000 80.000 L 236.000 174.140 C 236.000 180.767 230.627 186.140 224.000 186.140 C 217.373 186.140 212.000 180.767 212.000 174.140 L 212.000 80.000 C 212.000 77.791 210.209 76.000 208.000 76.000 L 176.000 76.000 C 171.983 76.006 168.229 74.002 166.000 70.660 L 153.570 52.000 L 102.060 52.000 C 95.433 52.000 90.060 46.627 90.060 40.000 C 90.060 33.373 95.433 28.000 102.060 28.000 L 160.000 28.000 C 164.017 27.994 167.771 29.998 170.000 33.340 L 182.420 52.000 L 208.000 52.000 C 223.464 52.000 236.000 64.536 236.000 80.000 Z"),
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
        return _cameraSlash!!
    }

private var _cameraSlash: ImageVector? = null
