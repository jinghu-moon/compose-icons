package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.ArrowSquareIn: ImageVector
    get() {
        if (_arrowSquareIn != null) return _arrowSquareIn!!
        _arrowSquareIn = phosphorBoldIcon(
            name = "ArrowSquareIn",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 132.000 136.000 L 132.000 200.000 C 132.000 206.627 126.627 212.000 120.000 212.000 C 113.373 212.000 108.000 206.627 108.000 200.000 L 108.000 165.000 L 48.490 224.490 C 43.796 229.184 36.184 229.184 31.490 224.490 C 26.796 219.796 26.796 212.184 31.490 207.490 L 91.000 148.000 L 56.000 148.000 C 49.373 148.000 44.000 142.627 44.000 136.000 C 44.000 129.373 49.373 124.000 56.000 124.000 L 120.000 124.000 C 126.627 124.000 132.000 129.373 132.000 136.000 ZM 208.000 28.000 L 80.000 28.000 C 68.954 28.000 60.000 36.954 60.000 48.000 L 60.000 92.000 C 60.000 98.627 65.373 104.000 72.000 104.000 C 78.627 104.000 84.000 98.627 84.000 92.000 L 84.000 52.000 L 204.000 52.000 L 204.000 172.000 L 164.000 172.000 C 157.373 172.000 152.000 177.373 152.000 184.000 C 152.000 190.627 157.373 196.000 164.000 196.000 L 208.000 196.000 C 219.046 196.000 228.000 187.046 228.000 176.000 L 228.000 48.000 C 228.000 36.954 219.046 28.000 208.000 28.000 Z"),
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
        return _arrowSquareIn!!
    }

private var _arrowSquareIn: ImageVector? = null
