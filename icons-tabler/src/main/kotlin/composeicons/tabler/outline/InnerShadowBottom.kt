package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.InnerShadowBottom: ImageVector
    get() {
        if (_innerShadowBottom != null) return _innerShadowBottom!!
        _innerShadowBottom = tablerOutlineIcon(
            name = "InnerShadowBottom",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(18.364f, 18.364f),
                    PathNode.CurveTo(21.87874f, 14.84926f, 21.87874f, 9.15074f, 18.364f, 5.636f),
                    PathNode.CurveTo(14.84926f, 2.12126f, 9.15074f, 2.12126f, 5.636f, 5.636f),
                    PathNode.CurveTo(2.12126f, 9.150741f, 2.12126f, 14.849259f, 5.636f, 18.364f),
                    PathNode.CurveTo(9.150741f, 21.87874f, 14.849259f, 21.87874f, 18.364f, 18.364f)
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
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(7.757f, 16.243f),
                    PathNode.CurveTo(8.882248f, 17.368439f, 10.408525f, 18.00072f, 12.0f, 18.00072f),
                    PathNode.CurveTo(13.591475f, 18.00072f, 15.117752f, 17.368439f, 16.243f, 16.243f)
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
        return _innerShadowBottom!!
    }

private var _innerShadowBottom: ImageVector? = null
