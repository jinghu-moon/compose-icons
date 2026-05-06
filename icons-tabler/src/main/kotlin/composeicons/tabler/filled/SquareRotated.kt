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
                pathData = parseSvgPathData("M9.793 2.893 2.893 9.793c-1.172 1.171-1.172 3.243 0 4.414l6.9 6.9c1.171 1.172 3.243 1.172 4.414 0l6.9-6.9c1.172-1.171 1.172-3.243 0-4.414L14.207 2.893C13.036 1.721 10.964 1.721 9.793 2.893Z"),
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
