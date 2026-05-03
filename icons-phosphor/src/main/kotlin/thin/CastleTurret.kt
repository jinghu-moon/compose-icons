package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.CastleTurret: ImageVector
    get() {
        if (_castleTurret != null) return _castleTurret!!
        _castleTurret = phosphorThinIcon(
            name = "CastleTurret",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 216.000 220.000 L 196.000 220.000 L 196.000 113.660 L 208.490 101.170 C 210.744 98.924 212.008 95.872 212.000 92.690 L 212.000 48.000 C 212.000 41.373 206.627 36.000 200.000 36.000 L 176.000 36.000 C 173.791 36.000 172.000 37.791 172.000 40.000 L 172.000 68.000 L 148.000 68.000 L 148.000 40.000 C 148.000 37.791 146.209 36.000 144.000 36.000 L 112.000 36.000 C 109.791 36.000 108.000 37.791 108.000 40.000 L 108.000 68.000 L 84.000 68.000 L 84.000 40.000 C 84.000 37.791 82.209 36.000 80.000 36.000 L 56.000 36.000 C 49.373 36.000 44.000 41.373 44.000 48.000 L 44.000 92.690 C 43.992 95.872 45.256 98.924 47.510 101.170 L 60.000 113.660 L 60.000 220.000 L 40.000 220.000 C 37.791 220.000 36.000 221.791 36.000 224.000 C 36.000 226.209 37.791 228.000 40.000 228.000 L 216.000 228.000 C 218.209 228.000 220.000 226.209 220.000 224.000 C 220.000 221.791 218.209 220.000 216.000 220.000 ZM 66.830 109.170 L 53.170 95.510 C 52.422 94.762 52.002 93.748 52.000 92.690 L 52.000 48.000 C 52.000 45.791 53.791 44.000 56.000 44.000 L 76.000 44.000 L 76.000 72.000 C 76.000 74.209 77.791 76.000 80.000 76.000 L 112.000 76.000 C 114.209 76.000 116.000 74.209 116.000 72.000 L 116.000 44.000 L 140.000 44.000 L 140.000 72.000 C 140.000 74.209 141.791 76.000 144.000 76.000 L 176.000 76.000 C 178.209 76.000 180.000 74.209 180.000 72.000 L 180.000 44.000 L 200.000 44.000 C 202.209 44.000 204.000 45.791 204.000 48.000 L 204.000 92.690 C 203.998 93.748 203.578 94.762 202.830 95.510 L 189.170 109.170 C 188.420 109.921 187.999 110.939 188.000 112.000 L 188.000 220.000 L 156.000 220.000 L 156.000 168.000 C 156.000 152.536 143.464 140.000 128.000 140.000 C 112.536 140.000 100.000 152.536 100.000 168.000 L 100.000 220.000 L 68.000 220.000 L 68.000 112.000 C 68.001 110.939 67.580 109.921 66.830 109.170 ZM 148.000 220.000 L 108.000 220.000 L 108.000 168.000 C 108.000 156.954 116.954 148.000 128.000 148.000 C 139.046 148.000 148.000 156.954 148.000 168.000 Z"),
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
        return _castleTurret!!
    }

private var _castleTurret: ImageVector? = null
