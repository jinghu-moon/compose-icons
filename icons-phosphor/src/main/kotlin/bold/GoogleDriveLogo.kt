package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.GoogleDriveLogo: ImageVector
    get() {
        if (_googleDriveLogo != null) return _googleDriveLogo!!
        _googleDriveLogo = phosphorBoldIcon(
            name = "GoogleDriveLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 241.000 141.650 L 172.590 29.510 L 172.520 29.400 C 168.878 23.519 162.437 19.957 155.520 20.000 L 100.440 20.000 C 93.523 19.957 87.082 23.519 83.440 29.400 L 83.370 29.510 L 15.000 141.650 C 11.136 147.888 10.998 155.740 14.640 162.110 L 42.000 209.920 C 45.554 216.142 52.165 219.987 59.330 220.000 L 196.670 220.000 C 203.835 219.987 210.446 216.142 214.000 209.920 L 241.320 162.110 C 244.974 155.748 244.852 147.895 241.000 141.650 ZM 211.880 140.000 L 174.790 140.000 L 142.000 85.330 L 160.120 55.140 ZM 54.800 184.000 L 43.360 164.000 L 66.810 164.000 ZM 94.800 164.000 L 161.200 164.000 L 180.400 196.000 L 75.600 196.000 ZM 109.200 140.000 L 128.000 108.660 L 146.800 140.000 ZM 189.200 164.000 L 212.650 164.000 L 201.200 184.000 ZM 128.000 62.000 L 117.190 44.000 L 138.810 44.000 ZM 95.890 55.140 L 114.000 85.330 L 81.210 140.000 L 44.120 140.000 Z"),
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
        return _googleDriveLogo!!
    }

private var _googleDriveLogo: ImageVector? = null
