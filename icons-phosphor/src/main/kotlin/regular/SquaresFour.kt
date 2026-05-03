package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.SquaresFour: ImageVector
    get() {
        if (_squaresFour != null) return _squaresFour!!
        _squaresFour = phosphorRegularIcon(
            name = "SquaresFour",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 104.000 40.000 L 56.000 40.000 C 47.163 40.000 40.000 47.163 40.000 56.000 L 40.000 104.000 C 40.000 112.837 47.163 120.000 56.000 120.000 L 104.000 120.000 C 112.837 120.000 120.000 112.837 120.000 104.000 L 120.000 56.000 C 120.000 47.163 112.837 40.000 104.000 40.000 ZM 104.000 104.000 L 56.000 104.000 L 56.000 56.000 L 104.000 56.000 L 104.000 104.000 ZM 200.000 40.000 L 152.000 40.000 C 143.163 40.000 136.000 47.163 136.000 56.000 L 136.000 104.000 C 136.000 112.837 143.163 120.000 152.000 120.000 L 200.000 120.000 C 208.837 120.000 216.000 112.837 216.000 104.000 L 216.000 56.000 C 216.000 47.163 208.837 40.000 200.000 40.000 ZM 200.000 104.000 L 152.000 104.000 L 152.000 56.000 L 200.000 56.000 L 200.000 104.000 ZM 104.000 136.000 L 56.000 136.000 C 47.163 136.000 40.000 143.163 40.000 152.000 L 40.000 200.000 C 40.000 208.837 47.163 216.000 56.000 216.000 L 104.000 216.000 C 112.837 216.000 120.000 208.837 120.000 200.000 L 120.000 152.000 C 120.000 143.163 112.837 136.000 104.000 136.000 ZM 104.000 200.000 L 56.000 200.000 L 56.000 152.000 L 104.000 152.000 L 104.000 200.000 ZM 200.000 136.000 L 152.000 136.000 C 143.163 136.000 136.000 143.163 136.000 152.000 L 136.000 200.000 C 136.000 208.837 143.163 216.000 152.000 216.000 L 200.000 216.000 C 208.837 216.000 216.000 208.837 216.000 200.000 L 216.000 152.000 C 216.000 143.163 208.837 136.000 200.000 136.000 ZM 200.000 200.000 L 152.000 200.000 L 152.000 152.000 L 200.000 152.000 L 200.000 200.000 Z"),
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
