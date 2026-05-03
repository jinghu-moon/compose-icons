package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.SquaresFour: ImageVector
    get() {
        if (_squaresFour != null) return _squaresFour!!
        _squaresFour = phosphorBoldIcon(
            name = "SquaresFour",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 100.000 36.000 L 56.000 36.000 C 44.954 36.000 36.000 44.954 36.000 56.000 L 36.000 100.000 C 36.000 111.046 44.954 120.000 56.000 120.000 L 100.000 120.000 C 111.046 120.000 120.000 111.046 120.000 100.000 L 120.000 56.000 C 120.000 44.954 111.046 36.000 100.000 36.000 ZM 96.000 96.000 L 60.000 96.000 L 60.000 60.000 L 96.000 60.000 ZM 200.000 36.000 L 156.000 36.000 C 144.954 36.000 136.000 44.954 136.000 56.000 L 136.000 100.000 C 136.000 111.046 144.954 120.000 156.000 120.000 L 200.000 120.000 C 211.046 120.000 220.000 111.046 220.000 100.000 L 220.000 56.000 C 220.000 44.954 211.046 36.000 200.000 36.000 ZM 196.000 96.000 L 160.000 96.000 L 160.000 60.000 L 196.000 60.000 ZM 100.000 136.000 L 56.000 136.000 C 44.954 136.000 36.000 144.954 36.000 156.000 L 36.000 200.000 C 36.000 211.046 44.954 220.000 56.000 220.000 L 100.000 220.000 C 111.046 220.000 120.000 211.046 120.000 200.000 L 120.000 156.000 C 120.000 144.954 111.046 136.000 100.000 136.000 ZM 96.000 196.000 L 60.000 196.000 L 60.000 160.000 L 96.000 160.000 ZM 200.000 136.000 L 156.000 136.000 C 144.954 136.000 136.000 144.954 136.000 156.000 L 136.000 200.000 C 136.000 211.046 144.954 220.000 156.000 220.000 L 200.000 220.000 C 211.046 220.000 220.000 211.046 220.000 200.000 L 220.000 156.000 C 220.000 144.954 211.046 136.000 200.000 136.000 ZM 196.000 196.000 L 160.000 196.000 L 160.000 160.000 L 196.000 160.000 Z"),
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
        return _squaresFour!!
    }

private var _squaresFour: ImageVector? = null
