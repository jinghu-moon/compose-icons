package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.Pentagon: ImageVector
    get() {
        if (_pentagon != null) return _pentagon!!
        _pentagon = tablerFilledIcon(
            name = "Pentagon",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M10.205 2.6 3.245 7.838C2.217 8.611 1.797 9.954 2.2 11.176l2.896 8.765c.406 1.229 1.555 2.06 2.85 2.059h8.12c1.286-0 2.428-.819 2.841-2.037l2.973-8.764C22.298 9.967 21.874 8.606 20.83 7.829L13.797 2.592l-.091-.061-.018-.01-.106-.07c-1.049-.65-2.389-.591-3.377 .148Z"),
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
        return _pentagon!!
    }

private var _pentagon: ImageVector? = null
