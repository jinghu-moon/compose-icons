package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.BabyCarriage: ImageVector
    get() {
        if (_babyCarriage != null) return _babyCarriage!!
        _babyCarriage = phosphorThinIcon(
            name = "BabyCarriage",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 160.000 36.000 L 152.000 36.000 C 145.373 36.000 140.000 41.373 140.000 48.000 L 140.000 108.000 L 51.770 108.000 C 49.733 89.782 34.332 76.004 16.000 76.000 C 13.791 76.000 12.000 77.791 12.000 80.000 C 12.000 82.209 13.791 84.000 16.000 84.000 C 31.464 84.000 44.000 96.536 44.000 112.000 C 44.044 153.955 78.045 187.956 120.000 188.000 L 160.000 188.000 C 201.974 188.000 236.000 153.974 236.000 112.000 C 236.000 70.026 201.974 36.000 160.000 36.000 ZM 227.870 108.000 L 155.400 108.000 L 209.110 65.000 C 220.284 76.642 226.936 91.890 227.870 108.000 ZM 152.000 44.000 L 160.000 44.000 C 175.768 43.986 191.046 49.475 203.200 59.520 L 148.000 103.680 L 148.000 48.000 C 148.000 45.791 149.791 44.000 152.000 44.000 ZM 160.000 180.000 L 120.000 180.000 C 84.015 179.959 54.277 151.920 52.120 116.000 L 227.880 116.000 C 225.723 151.920 195.985 179.959 160.000 180.000 ZM 100.000 224.000 C 100.000 230.627 94.627 236.000 88.000 236.000 C 81.373 236.000 76.000 230.627 76.000 224.000 C 76.000 217.373 81.373 212.000 88.000 212.000 C 94.627 212.000 100.000 217.373 100.000 224.000 ZM 204.000 224.000 C 204.000 230.627 198.627 236.000 192.000 236.000 C 185.373 236.000 180.000 230.627 180.000 224.000 C 180.000 217.373 185.373 212.000 192.000 212.000 C 198.627 212.000 204.000 217.373 204.000 224.000 Z"),
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
        return _babyCarriage!!
    }

private var _babyCarriage: ImageVector? = null
