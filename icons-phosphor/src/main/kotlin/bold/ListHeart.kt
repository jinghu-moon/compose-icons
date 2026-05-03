package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.ListHeart: ImageVector
    get() {
        if (_listHeart != null) return _listHeart!!
        _listHeart = phosphorBoldIcon(
            name = "ListHeart",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 124.000 192.000 C 124.000 198.627 118.627 204.000 112.000 204.000 L 40.000 204.000 C 33.373 204.000 28.000 198.627 28.000 192.000 C 28.000 185.373 33.373 180.000 40.000 180.000 L 112.000 180.000 C 118.627 180.000 124.000 185.373 124.000 192.000 ZM 40.000 76.000 L 216.000 76.000 C 222.627 76.000 228.000 70.627 228.000 64.000 C 228.000 57.373 222.627 52.000 216.000 52.000 L 40.000 52.000 C 33.373 52.000 28.000 57.373 28.000 64.000 C 28.000 70.627 33.373 76.000 40.000 76.000 ZM 40.000 140.000 L 96.000 140.000 C 102.627 140.000 108.000 134.627 108.000 128.000 C 108.000 121.373 102.627 116.000 96.000 116.000 L 40.000 116.000 C 33.373 116.000 28.000 121.373 28.000 128.000 C 28.000 134.627 33.373 140.000 40.000 140.000 ZM 252.000 144.000 C 252.000 161.000 242.470 177.560 223.680 193.220 C 215.545 199.958 206.727 205.827 197.370 210.730 C 193.990 212.421 190.010 212.421 186.630 210.730 C 177.273 205.827 168.455 199.958 160.320 193.220 C 141.530 177.560 132.000 161.000 132.000 144.000 C 132.009 129.807 140.356 116.945 153.313 111.155 C 166.271 105.365 181.422 107.728 192.000 117.190 C 202.578 107.728 217.729 105.365 230.687 111.155 C 243.644 116.945 251.991 129.807 252.000 144.000 ZM 228.000 144.000 C 228.000 137.373 222.627 132.000 216.000 132.000 C 209.373 132.000 204.000 137.373 204.000 144.000 C 204.000 150.627 198.627 156.000 192.000 156.000 C 185.373 156.000 180.000 150.627 180.000 144.000 C 180.000 137.373 174.627 132.000 168.000 132.000 C 161.373 132.000 156.000 137.373 156.000 144.000 C 156.000 161.230 178.850 178.430 192.000 186.290 C 205.140 178.440 228.000 161.230 228.000 144.000 Z"),
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
        return _listHeart!!
    }

private var _listHeart: ImageVector? = null
