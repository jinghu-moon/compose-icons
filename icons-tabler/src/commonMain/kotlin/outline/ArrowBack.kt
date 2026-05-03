package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.ArrowBack: ImageVector
    get() {
        if (_arrowBack != null) return _arrowBack!!
        _arrowBack = tablerOutlineIcon(
            name = "ArrowBack",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(9.0f, 11.0f),
                    PathNode.LineTo(5.0f, 15.0f),
                    PathNode.LineTo(9.0f, 19.0f),
                    PathNode.MoveTo(5.0f, 15.0f),
                    PathNode.LineTo(16.0f, 15.0f),
                    PathNode.CurveTo(18.209139f, 15.0f, 20.0f, 13.209139f, 20.0f, 11.0f),
                    PathNode.CurveTo(20.0f, 8.790861f, 18.209139f, 7.0f, 16.0f, 7.0f),
                    PathNode.LineTo(15.0f, 7.0f)
                ),
                pathFillType = PathFillType.NonZero,
                fill = null,
                fillAlpha = 1.0f,
                stroke = SolidColor(Color.Black),
                strokeAlpha = 1.0f,
                strokeLineWidth = 2.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _arrowBack!!
    }

private var _arrowBack: ImageVector? = null
