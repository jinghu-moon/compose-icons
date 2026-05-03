package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.BracketsSquare: ImageVector
    get() {
        if (_bracketsSquare != null) return _bracketsSquare!!
        _bracketsSquare = phosphorThinIcon(
            name = "BracketsSquare",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 44.000 44.000 L 44.000 212.000 L 80.000 212.000 C 82.209 212.000 84.000 213.791 84.000 216.000 C 84.000 218.209 82.209 220.000 80.000 220.000 L 40.000 220.000 C 37.791 220.000 36.000 218.209 36.000 216.000 L 36.000 40.000 C 36.000 37.791 37.791 36.000 40.000 36.000 L 80.000 36.000 C 82.209 36.000 84.000 37.791 84.000 40.000 C 84.000 42.209 82.209 44.000 80.000 44.000 ZM 216.000 36.000 L 176.000 36.000 C 173.791 36.000 172.000 37.791 172.000 40.000 C 172.000 42.209 173.791 44.000 176.000 44.000 L 212.000 44.000 L 212.000 212.000 L 176.000 212.000 C 173.791 212.000 172.000 213.791 172.000 216.000 C 172.000 218.209 173.791 220.000 176.000 220.000 L 216.000 220.000 C 218.209 220.000 220.000 218.209 220.000 216.000 L 220.000 40.000 C 220.000 37.791 218.209 36.000 216.000 36.000 Z"),
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
        return _bracketsSquare!!
    }

private var _bracketsSquare: ImageVector? = null
