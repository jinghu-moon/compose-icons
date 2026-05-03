package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.MicrosoftPowerpointLogo: ImageVector
    get() {
        if (_microsoftPowerpointLogo != null) return _microsoftPowerpointLogo!!
        _microsoftPowerpointLogo = phosphorFillIcon(
            name = "MicrosoftPowerpointLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 136.000 24.000 C 103.976 24.042 73.746 38.788 54.000 64.000 L 40.000 64.000 C 31.163 64.000 24.000 71.163 24.000 80.000 L 24.000 176.000 C 24.000 184.837 31.163 192.000 40.000 192.000 L 54.000 192.000 C 83.940 230.349 136.466 242.816 180.446 222.013 C 224.426 201.209 248.106 152.694 237.451 105.223 C 226.795 57.751 184.652 24.011 136.000 24.000 ZM 72.000 152.000 L 72.000 104.000 C 72.000 99.582 75.582 96.000 80.000 96.000 L 96.000 96.000 C 109.255 96.000 120.000 106.745 120.000 120.000 C 120.000 133.255 109.255 144.000 96.000 144.000 L 88.000 144.000 L 88.000 152.000 C 88.000 156.418 84.418 160.000 80.000 160.000 C 75.582 160.000 72.000 156.418 72.000 152.000 ZM 128.000 215.630 C 108.398 213.807 89.967 205.491 75.630 192.000 L 128.000 192.000 ZM 128.000 64.000 L 75.630 64.000 C 89.967 50.509 108.398 42.193 128.000 40.370 ZM 144.000 40.370 C 186.252 44.282 219.718 77.748 223.630 120.000 L 160.000 120.000 L 160.000 80.000 C 160.000 71.163 152.837 64.000 144.000 64.000 ZM 144.000 215.630 L 144.000 192.000 C 152.837 192.000 160.000 184.837 160.000 176.000 L 160.000 136.000 L 223.630 136.000 C 219.718 178.252 186.252 211.718 144.000 215.630 ZM 96.000 128.000 L 88.000 128.000 L 88.000 112.000 L 96.000 112.000 C 100.418 112.000 104.000 115.582 104.000 120.000 C 104.000 124.418 100.418 128.000 96.000 128.000 Z"),
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
        return _microsoftPowerpointLogo!!
    }

private var _microsoftPowerpointLogo: ImageVector? = null
