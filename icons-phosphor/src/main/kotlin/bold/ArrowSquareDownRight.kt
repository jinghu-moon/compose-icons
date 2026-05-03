package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.ArrowSquareDownRight: ImageVector
    get() {
        if (_arrowSquareDownRight != null) return _arrowSquareDownRight!!
        _arrowSquareDownRight = phosphorBoldIcon(
            name = "ArrowSquareDownRight",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 208.000 28.000 L 48.000 28.000 C 36.954 28.000 28.000 36.954 28.000 48.000 L 28.000 208.000 C 28.000 219.046 36.954 228.000 48.000 228.000 L 208.000 228.000 C 219.046 228.000 228.000 219.046 228.000 208.000 L 228.000 48.000 C 228.000 36.954 219.046 28.000 208.000 28.000 ZM 204.000 204.000 L 52.000 204.000 L 52.000 52.000 L 204.000 52.000 ZM 87.510 104.490 C 82.816 99.796 82.816 92.184 87.510 87.490 C 92.204 82.796 99.816 82.796 104.510 87.490 L 148.000 131.000 L 148.000 112.000 C 148.000 105.373 153.373 100.000 160.000 100.000 C 166.627 100.000 172.000 105.373 172.000 112.000 L 172.000 160.000 C 172.000 166.627 166.627 172.000 160.000 172.000 L 112.000 172.000 C 105.373 172.000 100.000 166.627 100.000 160.000 C 100.000 153.373 105.373 148.000 112.000 148.000 L 131.000 148.000 Z"),
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
        return _arrowSquareDownRight!!
    }

private var _arrowSquareDownRight: ImageVector? = null
