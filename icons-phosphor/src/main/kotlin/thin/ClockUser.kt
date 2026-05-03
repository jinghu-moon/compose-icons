package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.ClockUser: ImageVector
    get() {
        if (_clockUser != null) return _clockUser!!
        _clockUser = phosphorThinIcon(
            name = "ClockUser",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 132.000 72.000 L 132.000 121.530 L 174.210 100.420 C 176.187 99.431 178.591 100.233 179.580 102.210 C 180.569 104.187 179.767 106.591 177.790 107.580 L 129.790 131.580 C 129.233 131.855 128.621 131.999 128.000 132.000 C 125.791 132.000 124.000 130.209 124.000 128.000 L 124.000 72.000 C 124.000 69.791 125.791 68.000 128.000 68.000 C 130.209 68.000 132.000 69.791 132.000 72.000 ZM 128.000 220.000 C 77.190 220.000 36.000 178.810 36.000 128.000 C 36.000 77.190 77.190 36.000 128.000 36.000 C 178.810 36.000 220.000 77.190 220.000 128.000 C 220.000 130.209 221.791 132.000 224.000 132.000 C 226.209 132.000 228.000 130.209 228.000 128.000 C 228.000 72.772 183.228 28.000 128.000 28.000 C 72.772 28.000 28.000 72.772 28.000 128.000 C 28.000 183.228 72.772 228.000 128.000 228.000 C 130.209 228.000 132.000 226.209 132.000 224.000 C 132.000 221.791 130.209 220.000 128.000 220.000 ZM 227.860 223.000 C 228.270 224.395 227.890 225.903 226.868 226.938 C 225.846 227.973 224.343 228.371 222.943 227.979 C 221.543 227.586 220.466 226.465 220.130 225.050 C 216.840 212.680 205.270 204.050 192.000 204.050 C 178.730 204.050 167.160 212.700 163.860 225.050 C 163.405 226.811 161.819 228.044 160.000 228.050 C 159.662 228.049 159.325 228.002 159.000 227.910 C 156.866 227.343 155.595 225.154 156.160 223.020 C 159.008 212.446 166.485 203.728 176.500 199.300 C 166.218 192.466 161.626 179.704 165.196 167.886 C 168.766 156.067 179.654 147.982 192.000 147.982 C 204.346 147.982 215.234 156.067 218.804 167.886 C 222.374 179.704 217.782 192.466 207.500 199.300 C 217.522 203.714 225.007 212.427 227.860 223.000 ZM 192.000 196.000 C 203.046 196.000 212.000 187.046 212.000 176.000 C 212.000 164.954 203.046 156.000 192.000 156.000 C 180.954 156.000 172.000 164.954 172.000 176.000 C 172.000 187.046 180.954 196.000 192.000 196.000 Z"),
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
        return _clockUser!!
    }

private var _clockUser: ImageVector? = null
