package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Boom: ImageVector
    get() {
        if (_boom != null) return _boom!!
        _boom = tablerOutlineIcon(
            name = "Boom",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(3.0f, 9.662f),
                    PathNode.CurveTo(5.0f, 12.0f, 5.0f, 14.0f, 3.0f, 16.0f),
                    PathNode.CurveTo(6.0f, 16.5f, 7.5f, 17.0f, 8.0f, 20.0f),
                    PathNode.CurveTo(10.0f, 17.0f, 14.0f, 16.0f, 17.0f, 20.0f),
                    PathNode.CurveTo(17.0f, 17.0f, 18.0f, 16.0f, 21.0f, 15.996f),
                    PathNode.QuadTo(18.0f, 13.001f, 21.0f, 10.0f),
                    PathNode.CurveTo(18.0f, 10.0f, 16.0f, 8.0f, 16.0f, 5.0f),
                    PathNode.CurveTo(14.0f, 9.0f, 11.0f, 8.0f, 8.5f, 4.0f),
                    PathNode.CurveTo(8.0f, 7.0f, 6.0f, 9.0f, 3.0f, 9.662f)
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
        return _boom!!
    }

private var _boom: ImageVector? = null
