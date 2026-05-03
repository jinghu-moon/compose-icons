package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.TruckTrailer: ImageVector
    get() {
        if (_truckTrailer != null) return _truckTrailer!!
        _truckTrailer = phosphorLightIcon(
            name = "TruckTrailer",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 222.000 98.470 L 222.000 96.000 C 221.967 66.190 197.810 42.033 168.000 42.000 L 160.000 42.000 C 152.268 42.000 146.000 48.268 146.000 56.000 L 146.000 178.000 L 126.000 178.000 L 126.000 72.000 C 126.000 68.686 123.314 66.000 120.000 66.000 L 16.000 66.000 C 8.268 66.000 2.000 72.268 2.000 80.000 L 2.000 184.000 C 2.000 196.913 10.263 208.377 22.513 212.460 C 34.763 216.544 48.252 212.330 56.000 202.000 C 63.085 211.452 75.057 215.866 86.582 213.276 C 98.108 210.687 107.040 201.574 109.400 190.000 L 194.600 190.000 C 197.667 205.104 211.680 215.427 227.015 213.878 C 242.350 212.329 254.015 199.413 254.000 184.000 L 254.000 136.000 C 253.974 117.338 240.424 101.446 222.000 98.470 ZM 158.000 56.000 C 158.000 54.895 158.895 54.000 160.000 54.000 L 168.000 54.000 C 191.196 54.000 210.000 72.804 210.000 96.000 L 210.000 104.000 C 210.000 107.314 212.686 110.000 216.000 110.000 C 230.359 110.000 242.000 121.641 242.000 136.000 L 242.000 160.000 C 233.774 153.827 222.959 152.299 213.344 155.950 C 203.730 159.601 196.656 167.923 194.600 178.000 L 158.000 178.000 ZM 16.000 78.000 L 114.000 78.000 L 114.000 178.000 L 109.400 178.000 C 107.040 166.426 98.108 157.313 86.582 154.724 C 75.057 152.134 63.085 156.548 56.000 166.000 C 46.059 152.745 27.255 150.059 14.000 160.000 L 14.000 80.000 C 14.000 78.895 14.895 78.000 16.000 78.000 ZM 32.000 202.000 C 22.059 202.000 14.000 193.941 14.000 184.000 C 14.000 174.059 22.059 166.000 32.000 166.000 C 41.941 166.000 50.000 174.059 50.000 184.000 C 50.000 193.941 41.941 202.000 32.000 202.000 ZM 80.000 202.000 C 70.059 202.000 62.000 193.941 62.000 184.000 C 62.000 174.059 70.059 166.000 80.000 166.000 C 89.941 166.000 98.000 174.059 98.000 184.000 C 98.000 193.941 89.941 202.000 80.000 202.000 ZM 224.000 202.000 C 214.059 202.000 206.000 193.941 206.000 184.000 C 206.000 174.059 214.059 166.000 224.000 166.000 C 233.941 166.000 242.000 174.059 242.000 184.000 C 242.000 193.941 233.941 202.000 224.000 202.000 Z"),
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
