package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.CassetteTape: ImageVector
    get() {
        if (_cassetteTape != null) return _cassetteTape!!
        _cassetteTape = phosphorThinIcon(
            name = "CassetteTape",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 224.000 52.000 L 32.000 52.000 C 25.373 52.000 20.000 57.373 20.000 64.000 L 20.000 192.000 C 20.000 198.627 25.373 204.000 32.000 204.000 L 224.000 204.000 C 230.627 204.000 236.000 198.627 236.000 192.000 L 236.000 64.000 C 236.000 57.373 230.627 52.000 224.000 52.000 ZM 72.000 196.000 L 90.000 172.000 L 166.000 172.000 L 184.000 196.000 ZM 228.000 192.000 C 228.000 194.209 226.209 196.000 224.000 196.000 L 194.000 196.000 L 171.200 165.600 C 170.445 164.593 169.259 164.000 168.000 164.000 L 88.000 164.000 C 86.741 164.000 85.555 164.593 84.800 165.600 L 62.000 196.000 L 32.000 196.000 C 29.791 196.000 28.000 194.209 28.000 192.000 L 28.000 64.000 C 28.000 61.791 29.791 60.000 32.000 60.000 L 224.000 60.000 C 226.209 60.000 228.000 61.791 228.000 64.000 ZM 176.000 84.000 L 80.000 84.000 C 64.536 84.000 52.000 96.536 52.000 112.000 C 52.000 127.464 64.536 140.000 80.000 140.000 L 176.000 140.000 C 191.464 140.000 204.000 127.464 204.000 112.000 C 204.000 96.536 191.464 84.000 176.000 84.000 ZM 60.000 112.000 C 60.000 100.954 68.954 92.000 80.000 92.000 C 91.046 92.000 100.000 100.954 100.000 112.000 C 100.000 123.046 91.046 132.000 80.000 132.000 C 68.954 132.000 60.000 123.046 60.000 112.000 ZM 99.570 132.000 C 104.960 126.742 108.000 119.530 108.000 112.000 C 108.000 104.470 104.960 97.258 99.570 92.000 L 156.430 92.000 C 151.040 97.258 148.000 104.470 148.000 112.000 C 148.000 119.530 151.040 126.742 156.430 132.000 ZM 176.000 132.000 C 164.954 132.000 156.000 123.046 156.000 112.000 C 156.000 100.954 164.954 92.000 176.000 92.000 C 187.046 92.000 196.000 100.954 196.000 112.000 C 196.000 123.046 187.046 132.000 176.000 132.000 Z"),
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
        return _cassetteTape!!
    }

private var _cassetteTape: ImageVector? = null
