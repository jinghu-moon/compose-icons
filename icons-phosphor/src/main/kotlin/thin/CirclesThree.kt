package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.CirclesThree: ImageVector
    get() {
        if (_circlesThree != null) return _circlesThree!!
        _circlesThree = phosphorThinIcon(
            name = "CirclesThree",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 168.000 76.000 C 168.000 53.909 150.091 36.000 128.000 36.000 C 105.909 36.000 88.000 53.909 88.000 76.000 C 88.000 98.091 105.909 116.000 128.000 116.000 C 150.091 116.000 168.000 98.091 168.000 76.000 ZM 128.000 108.000 C 110.327 108.000 96.000 93.673 96.000 76.000 C 96.000 58.327 110.327 44.000 128.000 44.000 C 145.673 44.000 160.000 58.327 160.000 76.000 C 160.000 93.673 145.673 108.000 128.000 108.000 ZM 188.000 132.000 C 165.909 132.000 148.000 149.909 148.000 172.000 C 148.000 194.091 165.909 212.000 188.000 212.000 C 210.091 212.000 228.000 194.091 228.000 172.000 C 228.000 149.909 210.091 132.000 188.000 132.000 ZM 188.000 204.000 C 170.327 204.000 156.000 189.673 156.000 172.000 C 156.000 154.327 170.327 140.000 188.000 140.000 C 205.673 140.000 220.000 154.327 220.000 172.000 C 220.000 189.673 205.673 204.000 188.000 204.000 ZM 68.000 132.000 C 45.909 132.000 28.000 149.909 28.000 172.000 C 28.000 194.091 45.909 212.000 68.000 212.000 C 90.091 212.000 108.000 194.091 108.000 172.000 C 108.000 149.909 90.091 132.000 68.000 132.000 ZM 68.000 204.000 C 50.327 204.000 36.000 189.673 36.000 172.000 C 36.000 154.327 50.327 140.000 68.000 140.000 C 85.673 140.000 100.000 154.327 100.000 172.000 C 100.000 189.673 85.673 204.000 68.000 204.000 Z"),
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
        return _circlesThree!!
    }

private var _circlesThree: ImageVector? = null
