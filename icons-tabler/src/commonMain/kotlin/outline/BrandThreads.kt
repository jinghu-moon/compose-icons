package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BrandThreads: ImageVector
    get() {
        if (_brandThreads != null) return _brandThreads!!
        _brandThreads = tablerOutlineIcon(
            name = "BrandThreads",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(19.0f, 7.5f),
                    PathNode.CurveTo(17.667f, 4.5f, 15.333f, 3.0f, 12.0f, 3.0f),
                    PathNode.CurveTo(7.0f, 3.0f, 4.0f, 5.5f, 4.0f, 12.0f),
                    PathNode.CurveTo(4.0f, 18.5f, 7.5f, 21.0f, 12.0f, 21.0f),
                    PathNode.CurveTo(16.5f, 21.0f, 19.0f, 18.0f, 19.0f, 16.0f),
                    PathNode.CurveTo(19.0f, 14.0f, 18.0f, 11.0f, 12.0f, 11.0f),
                    PathNode.CurveTo(9.5f, 11.0f, 9.0f, 12.25f, 9.0f, 13.5f),
                    PathNode.CurveTo(9.0f, 15.0f, 10.0f, 16.0f, 11.5f, 16.0f),
                    PathNode.CurveTo(14.0f, 16.0f, 15.0f, 14.5f, 15.0f, 11.0f),
                    PathNode.CurveTo(15.0f, 7.5f, 13.0f, 7.0f, 12.0f, 7.0f),
                    PathNode.CurveTo(11.0f, 7.0f, 10.167f, 7.333f, 9.5f, 8.0f)
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
        return _brandThreads!!
    }

private var _brandThreads: ImageVector? = null
