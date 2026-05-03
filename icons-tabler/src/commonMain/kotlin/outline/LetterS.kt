package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.LetterS: ImageVector
    get() {
        if (_letterS != null) return _letterS!!
        _letterS = tablerOutlineIcon(
            name = "LetterS",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(17.0f, 8.0f),
                    PathNode.CurveTo(17.0f, 5.790861f, 15.209139f, 4.0f, 13.0f, 4.0f),
                    PathNode.LineTo(11.0f, 4.0f),
                    PathNode.CurveTo(8.790861f, 4.0f, 7.0f, 5.790861f, 7.0f, 8.0f),
                    PathNode.CurveTo(7.0f, 10.209139f, 8.790861f, 12.0f, 11.0f, 12.0f),
                    PathNode.LineTo(13.0f, 12.0f),
                    PathNode.CurveTo(15.209139f, 12.0f, 17.0f, 13.790861f, 17.0f, 16.0f),
                    PathNode.CurveTo(17.0f, 18.209139f, 15.209139f, 20.0f, 13.0f, 20.0f),
                    PathNode.LineTo(11.0f, 20.0f),
                    PathNode.CurveTo(8.790861f, 20.0f, 7.0f, 18.209139f, 7.0f, 16.0f)
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
        return _letterS!!
    }

private var _letterS: ImageVector? = null
