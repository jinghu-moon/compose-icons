package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Meeple: ImageVector
    get() {
        if (_meeple != null) return _meeple!!
        _meeple = tablerOutlineIcon(
            name = "Meeple",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(9.0f, 20.0f),
                    PathNode.LineTo(4.0f, 20.0f),
                    PathNode.CurveTo(3.447715f, 20.0f, 3.0f, 19.552284f, 3.0f, 19.0f),
                    PathNode.CurveTo(3.0f, 17.0f, 6.378f, 14.093f, 7.0f, 13.0f),
                    PathNode.CurveTo(6.0f, 13.0f, 3.0f, 12.5f, 3.0f, 11.0f),
                    PathNode.CurveTo(3.0f, 9.0f, 7.0f, 7.5f, 9.0f, 7.0f),
                    PathNode.CurveTo(9.0f, 5.5f, 9.5f, 3.0f, 12.0f, 3.0f),
                    PathNode.CurveTo(14.5f, 3.0f, 15.0f, 5.5f, 15.0f, 7.0f),
                    PathNode.CurveTo(17.0f, 7.5f, 21.0f, 9.0f, 21.0f, 11.0f),
                    PathNode.CurveTo(21.0f, 12.5f, 18.0f, 13.0f, 17.0f, 13.0f),
                    PathNode.CurveTo(17.622f, 14.093f, 21.0f, 17.0f, 21.0f, 19.0f),
                    PathNode.CurveTo(21.0f, 19.552284f, 20.552284f, 20.0f, 20.0f, 20.0f),
                    PathNode.LineTo(15.0f, 20.0f),
                    PathNode.CurveTo(14.0f, 20.0f, 13.0f, 16.0f, 12.0f, 16.0f),
                    PathNode.CurveTo(11.0f, 16.0f, 10.0f, 20.0f, 9.0f, 20.0f)
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
        return _meeple!!
    }

private var _meeple: ImageVector? = null
