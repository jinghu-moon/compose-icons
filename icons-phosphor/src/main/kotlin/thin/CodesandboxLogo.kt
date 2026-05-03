package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.CodesandboxLogo: ImageVector
    get() {
        if (_codesandboxLogo != null) return _codesandboxLogo!!
        _codesandboxLogo = phosphorThinIcon(
            name = "CodesandboxLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 221.760 69.660 L 133.760 21.480 C 130.171 19.516 125.829 19.516 122.240 21.480 L 34.240 69.660 C 30.395 71.764 28.003 75.797 28.000 80.180 L 28.000 175.820 C 28.003 180.203 30.395 184.236 34.240 186.340 L 122.240 234.520 C 125.827 236.493 130.173 236.493 133.760 234.520 L 221.760 186.340 C 225.605 184.236 227.997 180.203 228.000 175.820 L 228.000 80.180 C 227.997 75.797 225.605 71.764 221.760 69.660 ZM 128.000 123.440 L 40.330 75.440 L 83.140 52.000 L 126.080 75.500 C 127.276 76.155 128.724 76.155 129.920 75.500 L 172.860 52.000 L 215.670 75.430 ZM 126.080 28.500 C 127.273 27.834 128.727 27.834 129.920 28.500 L 164.530 47.500 L 128.000 67.440 L 91.470 47.440 ZM 36.000 175.820 L 36.000 132.470 L 76.000 154.370 L 76.000 200.090 L 38.080 179.330 C 36.797 178.628 36.000 177.282 36.000 175.820 ZM 84.000 204.470 L 84.000 152.000 C 84.000 150.538 83.203 149.192 81.920 148.490 L 36.000 123.350 L 36.000 82.190 L 124.000 130.370 L 124.000 226.370 ZM 132.000 226.360 L 132.000 130.360 L 220.000 82.180 L 220.000 123.340 L 174.080 148.480 C 172.794 149.184 171.996 150.534 172.000 152.000 L 172.000 204.470 ZM 217.920 179.360 L 180.000 200.090 L 180.000 154.370 L 220.000 132.470 L 220.000 175.820 C 220.000 177.282 219.203 178.628 217.920 179.330 Z"),
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
        return _codesandboxLogo!!
    }

private var _codesandboxLogo: ImageVector? = null
