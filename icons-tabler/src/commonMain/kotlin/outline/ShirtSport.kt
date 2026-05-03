package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.ShirtSport: ImageVector
    get() {
        if (_shirtSport != null) return _shirtSport!!
        _shirtSport = tablerOutlineIcon(
            name = "ShirtSport",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(15.0f, 4.0f),
                    PathNode.LineTo(21.0f, 6.0f),
                    PathNode.LineTo(21.0f, 11.0f),
                    PathNode.LineTo(18.0f, 11.0f),
                    PathNode.LineTo(18.0f, 19.0f),
                    PathNode.CurveTo(18.0f, 19.552284f, 17.552284f, 20.0f, 17.0f, 20.0f),
                    PathNode.LineTo(7.0f, 20.0f),
                    PathNode.CurveTo(6.447716f, 20.0f, 6.0f, 19.552284f, 6.0f, 19.0f),
                    PathNode.LineTo(6.0f, 11.0f),
                    PathNode.LineTo(3.0f, 11.0f),
                    PathNode.LineTo(3.0f, 6.0f),
                    PathNode.LineTo(9.0f, 4.0f),
                    PathNode.CurveTo(9.0f, 5.656854f, 10.343145f, 7.0f, 12.0f, 7.0f),
                    PathNode.CurveTo(13.656855f, 7.0f, 15.0f, 5.656854f, 15.0f, 4.0f)
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
                    PathNode.MoveTo(10.5f, 11.0f),
                    PathNode.LineTo(13.0f, 11.0f),
                    PathNode.LineTo(11.5f, 16.0f)
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
        return _shirtSport!!
    }

private var _shirtSport: ImageVector? = null
