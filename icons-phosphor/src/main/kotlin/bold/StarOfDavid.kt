package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.StarOfDavid: ImageVector
    get() {
        if (_starOfDavid != null) return _starOfDavid!!
        _starOfDavid = phosphorBoldIcon(
            name = "StarOfDavid",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 205.820 128.000 L 234.420 78.000 C 236.566 74.283 236.563 69.703 234.413 65.988 C 232.263 62.273 228.292 59.990 224.000 60.000 L 167.000 60.000 L 138.450 10.000 C 136.296 6.269 132.308 3.979 128.000 4.000 L 128.000 4.000 C 123.693 4.000 119.716 6.309 117.580 10.050 L 89.000 60.000 L 32.000 60.000 C 27.708 59.990 23.737 62.273 21.587 65.988 C 19.437 69.703 19.434 74.283 21.580 78.000 L 50.160 128.000 L 21.580 178.000 C 19.434 181.717 19.437 186.297 21.587 190.012 C 23.737 193.727 27.708 196.010 32.000 196.000 L 89.000 196.000 L 117.570 246.000 C 119.706 249.740 123.683 252.048 127.990 252.048 C 132.297 252.048 136.274 249.740 138.410 246.000 L 167.000 196.000 L 224.000 196.000 C 228.277 196.000 232.230 193.723 234.377 190.025 C 236.524 186.326 236.541 181.764 234.420 178.050 ZM 203.320 84.000 L 192.000 103.810 L 180.680 84.000 ZM 178.180 128.000 L 153.000 172.000 L 102.900 172.000 L 77.810 128.000 L 102.940 84.000 L 153.000 84.000 ZM 128.000 40.180 L 139.330 60.000 L 116.660 60.000 ZM 52.680 84.000 L 75.290 84.000 L 64.000 103.820 ZM 52.680 171.920 L 64.000 152.180 L 75.290 172.000 ZM 128.000 215.820 L 116.660 196.000 L 139.330 196.000 ZM 180.680 172.000 L 192.000 152.190 L 203.320 172.000 Z"),
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
        return _starOfDavid!!
    }

private var _starOfDavid: ImageVector? = null
