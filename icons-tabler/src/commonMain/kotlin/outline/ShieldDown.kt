package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.ShieldDown: ImageVector
    get() {
        if (_shieldDown != null) return _shieldDown!!
        _shieldDown = tablerOutlineIcon(
            name = "ShieldDown",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(12.444f, 20.876f),
                    PathNode.CurveTo(12.297f, 20.92f, 12.149f, 20.961f, 12.0f, 21.0f),
                    PathNode.CurveTo(8.854644f, 20.184156f, 6.174611f, 18.127613f, 4.572596f, 15.300529f),
                    PathNode.CurveTo(2.97058f, 12.473444f, 2.583555f, 9.11753f, 3.5f, 6.0f),
                    PathNode.CurveTo(6.615528f, 6.142566f, 9.664169f, 5.066576f, 12.0f, 3.0f),
                    PathNode.CurveTo(14.335831f, 5.066576f, 17.384472f, 6.142566f, 20.5f, 6.0f),
                    PathNode.CurveTo(21.10731f, 8.065554f, 21.147722f, 10.256454f, 20.617f, 12.343f)
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
                    PathNode.MoveTo(19.0f, 16.0f),
                    PathNode.LineTo(19.0f, 22.0f)
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
                    PathNode.MoveTo(22.0f, 19.0f),
                    PathNode.LineTo(19.0f, 22.0f),
                    PathNode.LineTo(16.0f, 19.0f)
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
        return _shieldDown!!
    }

private var _shieldDown: ImageVector? = null
