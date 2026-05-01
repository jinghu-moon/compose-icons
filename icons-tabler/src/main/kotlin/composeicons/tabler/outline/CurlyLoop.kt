package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.CurlyLoop: ImageVector
    get() {
        if (_curlyLoop != null) return _curlyLoop!!
        _curlyLoop = tablerOutlineIcon(
            name = "CurlyLoop",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(21.0f, 8.0f),
                    PathNode.CurveTo(17.0f, 8.0f, 14.0f, 10.0f, 14.0f, 13.0f),
                    PathNode.CurveTo(14.0f, 14.656855f, 15.343145f, 16.0f, 17.0f, 16.0f),
                    PathNode.CurveTo(18.656855f, 16.0f, 20.0f, 14.656855f, 20.0f, 13.0f),
                    PathNode.CurveTo(20.0f, 10.0f, 17.5f, 8.0f, 12.0f, 8.0f),
                    PathNode.CurveTo(6.5f, 8.0f, 4.0f, 10.0f, 4.0f, 13.0f),
                    PathNode.CurveTo(4.0f, 14.656855f, 5.343146f, 16.0f, 7.0f, 16.0f),
                    PathNode.CurveTo(8.656855f, 16.0f, 10.0f, 14.656855f, 10.0f, 13.0f),
                    PathNode.CurveTo(10.0f, 10.0f, 7.0f, 8.0f, 3.0f, 8.0f)
                ),
                pathFillType = PathFillType.NonZero,
                fill = null,
                fillAlpha = 1f,
                stroke = SolidColor(Color.Black),
                strokeAlpha = 1f,
                strokeLineWidth = 2.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _curlyLoop!!
    }

private var _curlyLoop: ImageVector? = null
