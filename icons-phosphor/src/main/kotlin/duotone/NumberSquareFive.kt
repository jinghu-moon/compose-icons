package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.NumberSquareFive: ImageVector
    get() {
        if (_numberSquareFive != null) return _numberSquareFive!!
        _numberSquareFive = phosphorDuotoneIcon(
            name = "NumberSquareFive",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            group(
                groupAlpha = 0.2f,
            ) {
                addPath(
                    pathData = parseSvgPathData("M 216.000 48.000 L 216.000 208.000 C 216.000 212.418 212.418 216.000 208.000 216.000 L 48.000 216.000 C 43.582 216.000 40.000 212.418 40.000 208.000 L 40.000 48.000 C 40.000 43.582 43.582 40.000 48.000 40.000 L 208.000 40.000 C 212.418 40.000 216.000 43.582 216.000 48.000 Z"),
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
            addPath(
                pathData = parseSvgPathData("M 208.000 32.000 L 48.000 32.000 C 39.163 32.000 32.000 39.163 32.000 48.000 L 32.000 208.000 C 32.000 216.837 39.163 224.000 48.000 224.000 L 208.000 224.000 C 216.837 224.000 224.000 216.837 224.000 208.000 L 224.000 48.000 C 224.000 39.163 216.837 32.000 208.000 32.000 ZM 208.000 208.000 L 48.000 208.000 L 48.000 48.000 L 208.000 48.000 L 208.000 208.000 ZM 118.780 88.000 L 114.590 113.140 C 117.668 112.377 120.829 111.994 124.000 112.000 C 143.882 112.000 160.000 128.118 160.000 148.000 C 160.000 167.882 143.882 184.000 124.000 184.000 C 114.375 184.158 105.098 180.405 98.290 173.600 C 96.209 171.576 95.387 168.583 96.144 165.780 C 96.900 162.977 99.116 160.804 101.933 160.102 C 104.750 159.400 107.727 160.280 109.710 162.400 C 113.522 166.119 118.676 168.138 124.000 168.000 C 135.046 168.000 144.000 159.046 144.000 148.000 C 144.000 136.954 135.046 128.000 124.000 128.000 C 118.676 127.862 113.522 129.881 109.710 133.600 C 107.264 136.092 103.485 136.709 100.373 135.126 C 97.261 133.542 95.536 130.124 96.110 126.680 L 104.110 78.680 C 104.755 74.825 108.091 72.000 112.000 72.000 L 152.000 72.000 C 156.418 72.000 160.000 75.582 160.000 80.000 C 160.000 84.418 156.418 88.000 152.000 88.000 Z"),
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
        return _numberSquareFive!!
    }

private var _numberSquareFive: ImageVector? = null
