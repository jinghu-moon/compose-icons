package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.FolderOpen: ImageVector
    get() {
        if (_folderOpen != null) return _folderOpen!!
        _folderOpen = phosphorThinIcon(
            name = "FolderOpen",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 241.720 113.000 C 239.483 109.850 235.853 107.985 231.990 108.000 L 212.000 108.000 L 212.000 88.000 C 212.000 81.373 206.627 76.000 200.000 76.000 L 129.330 76.000 L 100.530 54.400 C 98.451 52.845 95.926 52.004 93.330 52.000 L 40.000 52.000 C 33.373 52.000 28.000 57.373 28.000 64.000 L 28.000 208.000 C 28.000 210.209 29.791 212.000 32.000 212.000 L 211.090 212.000 C 212.811 211.997 214.338 210.894 214.880 209.260 L 243.370 123.790 C 244.606 120.139 243.991 116.115 241.720 113.000 ZM 40.000 60.000 L 93.330 60.000 C 94.195 60.000 95.038 60.281 95.730 60.800 L 125.600 83.200 C 126.292 83.719 127.135 84.000 128.000 84.000 L 200.000 84.000 C 202.209 84.000 204.000 85.791 204.000 88.000 L 204.000 108.000 L 69.760 108.000 C 64.595 108.002 60.011 111.309 58.380 116.210 L 36.000 183.350 L 36.000 64.000 C 36.000 61.791 37.791 60.000 40.000 60.000 ZM 235.780 121.260 L 208.200 204.000 L 37.550 204.000 L 66.000 118.740 C 66.539 117.117 68.050 116.016 69.760 116.000 L 232.000 116.000 C 233.284 116.002 234.488 116.620 235.239 117.662 C 235.989 118.703 236.194 120.042 235.790 121.260 Z"),
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
        return _folderOpen!!
    }

private var _folderOpen: ImageVector? = null
