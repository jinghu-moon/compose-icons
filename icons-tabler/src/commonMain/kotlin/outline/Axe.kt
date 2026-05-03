package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Axe: ImageVector
    get() {
        if (_axe != null) return _axe!!
        _axe = tablerOutlineIcon(
            name = "Axe",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(13.0f, 9.0f),
                    PathNode.LineTo(20.383f, 16.418f),
                    PathNode.CurveTo(21.206f, 17.238f, 21.206f, 18.566f, 20.383f, 19.385f),
                    PathNode.CurveTo(19.559916f, 20.203693f, 18.230083f, 20.203693f, 17.407f, 19.385f),
                    PathNode.LineTo(10.0f, 12.0f)
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
                    PathNode.MoveTo(6.66f, 15.66f),
                    PathNode.LineTo(3.34f, 12.34f),
                    PathNode.CurveTo(3.043129f, 12.04283f, 2.915363f, 11.616422f, 2.999909f, 11.204967f),
                    PathNode.CurveTo(3.084454f, 10.793513f, 3.370005f, 10.452033f, 3.76f, 10.296f),
                    PathNode.LineTo(7.0f, 9.0f),
                    PathNode.LineTo(13.0f, 3.0f),
                    PathNode.LineTo(16.0f, 6.0f),
                    PathNode.LineTo(10.0f, 12.0f),
                    PathNode.LineTo(8.704f, 15.24f),
                    PathNode.CurveTo(8.547967f, 15.629995f, 8.206487f, 15.915546f, 7.795033f, 16.000092f),
                    PathNode.CurveTo(7.383579f, 16.084637f, 6.95717f, 15.956872f, 6.66f, 15.66f)
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
        return _axe!!
    }

private var _axe: ImageVector? = null
