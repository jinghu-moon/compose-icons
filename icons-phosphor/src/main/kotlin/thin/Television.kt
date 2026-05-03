package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Television: ImageVector
    get() {
        if (_television != null) return _television!!
        _television = phosphorThinIcon(
            name = "Television",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 216.000 68.000 L 137.660 68.000 L 178.830 26.830 C 180.393 25.267 180.393 22.733 178.830 21.170 C 177.267 19.607 174.733 19.607 173.170 21.170 L 128.000 66.340 L 82.830 21.170 C 81.267 19.607 78.733 19.607 77.170 21.170 C 75.607 22.733 75.607 25.267 77.170 26.830 L 118.340 68.000 L 40.000 68.000 C 33.373 68.000 28.000 73.373 28.000 80.000 L 28.000 200.000 C 28.000 206.627 33.373 212.000 40.000 212.000 L 216.000 212.000 C 222.627 212.000 228.000 206.627 228.000 200.000 L 228.000 80.000 C 228.000 73.373 222.627 68.000 216.000 68.000 ZM 36.000 200.000 L 36.000 80.000 C 36.000 77.791 37.791 76.000 40.000 76.000 L 148.000 76.000 L 148.000 204.000 L 40.000 204.000 C 37.791 204.000 36.000 202.209 36.000 200.000 ZM 220.000 200.000 C 220.000 202.209 218.209 204.000 216.000 204.000 L 156.000 204.000 L 156.000 76.000 L 216.000 76.000 C 218.209 76.000 220.000 77.791 220.000 80.000 ZM 196.000 116.000 C 196.000 120.418 192.418 124.000 188.000 124.000 C 183.582 124.000 180.000 120.418 180.000 116.000 C 180.000 111.582 183.582 108.000 188.000 108.000 C 192.418 108.000 196.000 111.582 196.000 116.000 ZM 196.000 164.000 C 196.000 168.418 192.418 172.000 188.000 172.000 C 183.582 172.000 180.000 168.418 180.000 164.000 C 180.000 159.582 183.582 156.000 188.000 156.000 C 192.418 156.000 196.000 159.582 196.000 164.000 Z"),
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
        return _television!!
    }

private var _television: ImageVector? = null
