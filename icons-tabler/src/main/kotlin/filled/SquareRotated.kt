package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.SquareRotated: ImageVector
    get() {
        if (_squareRotated != null) return _squareRotated!!
        _squareRotated = tablerFilledIcon(
            name = "SquareRotated",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 9.793 2.893 L 2.893 9.793 C 1.721 10.964 1.721 13.036 2.893 14.207 L 9.793 21.107 C 10.964 22.279 13.036 22.279 14.207 21.107 L 21.107 14.207 C 22.279 13.036 22.279 10.964 21.107 9.793 L 14.207 2.893 C 13.036 1.721 10.964 1.721 9.793 2.893 Z"),
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
        return _squareRotated!!
    }

private var _squareRotated: ImageVector? = null
