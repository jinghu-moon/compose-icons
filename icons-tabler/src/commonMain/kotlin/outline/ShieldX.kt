package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.ShieldX: ImageVector
    get() {
        if (_shieldX != null) return _shieldX!!
        _shieldX = tablerOutlineIcon(
            name = "ShieldX",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(13.252f, 20.601f),
                    PathNode.CurveTo(12.844f, 20.756f, 12.426f, 20.889f, 12.0f, 21.0f),
                    PathNode.CurveTo(8.854644f, 20.184156f, 6.174611f, 18.127613f, 4.572596f, 15.300529f),
                    PathNode.CurveTo(2.97058f, 12.473444f, 2.583555f, 9.11753f, 3.5f, 6.0f),
                    PathNode.CurveTo(6.615528f, 6.142566f, 9.664169f, 5.066576f, 12.0f, 3.0f),
                    PathNode.CurveTo(14.335831f, 5.066576f, 17.384472f, 6.142566f, 20.5f, 6.0f),
                    PathNode.CurveTo(21.208784f, 8.411704f, 21.142324f, 10.985096f, 20.31f, 13.357f)
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
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(22.0f, 22.0f),
                    PathNode.LineTo(17.0f, 17.0f)
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
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(17.0f, 22.0f),
                    PathNode.LineTo(22.0f, 17.0f)
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
        return _shieldX!!
    }

private var _shieldX: ImageVector? = null
