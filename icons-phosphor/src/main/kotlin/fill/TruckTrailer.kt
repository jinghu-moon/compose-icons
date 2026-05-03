package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.TruckTrailer: ImageVector
    get() {
        if (_truckTrailer != null) return _truckTrailer!!
        _truckTrailer = phosphorFillIcon(
            name = "TruckTrailer",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 224.000 96.800 L 224.000 96.000 C 223.967 65.086 198.914 40.033 168.000 40.000 L 160.000 40.000 C 151.163 40.000 144.000 47.163 144.000 56.000 L 144.000 176.000 L 128.000 176.000 L 128.000 72.000 C 128.000 67.582 124.418 64.000 120.000 64.000 L 16.000 64.000 C 7.163 64.000 0.000 71.163 0.000 80.000 L 0.000 184.000 C 0.015 197.302 8.258 209.208 20.703 213.904 C 33.149 218.600 47.202 215.107 56.000 205.130 C 63.828 214.022 75.927 217.862 87.450 215.112 C 98.973 212.361 108.033 203.469 111.000 192.000 L 193.000 192.000 C 197.003 207.634 212.021 217.841 228.031 215.808 C 244.041 213.775 256.032 200.139 256.000 184.000 L 256.000 136.000 C 255.977 116.999 242.612 100.627 224.000 96.800 ZM 32.000 200.000 C 23.163 200.000 16.000 192.837 16.000 184.000 C 16.000 175.163 23.163 168.000 32.000 168.000 C 40.837 168.000 48.000 175.163 48.000 184.000 C 48.000 192.837 40.837 200.000 32.000 200.000 ZM 80.000 200.000 C 71.163 200.000 64.000 192.837 64.000 184.000 C 64.000 175.163 71.163 168.000 80.000 168.000 C 88.837 168.000 96.000 175.163 96.000 184.000 C 96.000 192.837 88.837 200.000 80.000 200.000 ZM 224.000 200.000 C 215.163 200.000 208.000 192.837 208.000 184.000 C 208.000 175.163 215.163 168.000 224.000 168.000 C 232.837 168.000 240.000 175.163 240.000 184.000 C 240.000 192.837 232.837 200.000 224.000 200.000 Z"),
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
        return _truckTrailer!!
    }

private var _truckTrailer: ImageVector? = null
