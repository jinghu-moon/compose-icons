package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.SquareRotated: ImageVector
    get() {
        if (_squareRotated != null) return _squareRotated!!
        _squareRotated = tablerOutlineIcon(
            name = "SquareRotated",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M13.446 2.6l7.955 7.954c.799 .799 .799 2.093 0 2.892l-7.955 7.955c-.799 .799-2.093 .799-2.892 0L2.599 13.446c-.799-.799-.799-2.093 0-2.892L10.554 2.599c.799-.799 2.093-.799 2.892 0"),
                pathFillType = PathFillType.NonZero,
                fill = null,
                fillAlpha = 1f,
                stroke = SolidColor(Color(0xFF000000)),
                strokeAlpha = 1f,
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
            )
        }
        return _squareRotated!!
    }

private var _squareRotated: ImageVector? = null
