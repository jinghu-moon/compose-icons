package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.NotMemberOf: ImageVector
    get() {
        if (_notMemberOf != null) return _notMemberOf!!
        _notMemberOf = phosphorFillIcon(
            name = "NotMemberOf",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 208.000 32.000 L 48.000 32.000 C 39.163 32.000 32.000 39.163 32.000 48.000 L 32.000 208.000 C 32.000 216.837 39.163 224.000 48.000 224.000 L 208.000 224.000 C 216.837 224.000 224.000 216.837 224.000 208.000 L 224.000 48.000 C 224.000 39.163 216.837 32.000 208.000 32.000 ZM 190.000 69.270 L 145.630 120.000 L 176.000 120.000 C 180.418 120.000 184.000 123.582 184.000 128.000 C 184.000 132.418 180.418 136.000 176.000 136.000 L 131.630 136.000 L 102.870 168.870 C 110.420 173.538 119.123 176.007 128.000 176.000 L 176.000 176.000 C 180.418 176.000 184.000 179.582 184.000 184.000 C 184.000 188.418 180.418 192.000 176.000 192.000 L 128.000 192.000 C 115.240 192.004 102.774 188.172 92.220 181.000 L 78.000 197.270 C 75.022 200.278 70.216 200.446 67.035 197.653 C 63.855 194.859 63.401 190.071 66.000 186.730 L 80.210 170.490 C 63.491 151.658 59.370 124.771 69.680 101.796 C 79.991 78.821 102.817 64.028 128.000 64.000 L 173.370 64.000 L 178.000 58.730 C 179.825 56.384 182.800 55.243 185.725 55.767 C 188.650 56.291 191.044 58.394 191.941 61.227 C 192.838 64.061 192.091 67.158 190.000 69.270 ZM 128.000 80.000 L 159.370 80.000 L 124.370 120.000 L 80.680 120.000 C 84.610 96.923 104.591 80.033 128.000 80.000 ZM 80.680 136.000 L 110.370 136.000 L 90.840 158.320 C 85.569 151.891 82.067 144.197 80.680 136.000 Z"),
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
        return _notMemberOf!!
    }

private var _notMemberOf: ImageVector? = null
