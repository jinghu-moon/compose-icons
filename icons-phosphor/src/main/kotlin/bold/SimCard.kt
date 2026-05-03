package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.SimCard: ImageVector
    get() {
        if (_simCard != null) return _simCard!!
        _simCard = phosphorBoldIcon(
            name = "SimCard",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 216.490 79.510 L 160.490 23.510 C 158.238 21.260 155.184 19.997 152.000 20.000 L 56.000 20.000 C 44.954 20.000 36.000 28.954 36.000 40.000 L 36.000 216.000 C 36.000 227.046 44.954 236.000 56.000 236.000 L 200.000 236.000 C 211.046 236.000 220.000 227.046 220.000 216.000 L 220.000 88.000 C 220.003 84.816 218.740 81.762 216.490 79.510 ZM 196.000 212.000 L 60.000 212.000 L 60.000 44.000 L 147.000 44.000 L 196.000 93.000 ZM 88.000 112.000 C 81.373 112.000 76.000 117.373 76.000 124.000 L 76.000 184.000 C 76.000 190.627 81.373 196.000 88.000 196.000 L 168.000 196.000 C 174.627 196.000 180.000 190.627 180.000 184.000 L 180.000 124.000 C 180.000 117.373 174.627 112.000 168.000 112.000 ZM 100.000 136.000 L 116.000 136.000 L 116.000 172.000 L 100.000 172.000 ZM 156.000 172.000 L 140.000 172.000 L 140.000 136.000 L 156.000 136.000 Z"),
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
        return _simCard!!
    }

private var _simCard: ImageVector? = null
