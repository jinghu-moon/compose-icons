package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Lemon2: ImageVector
    get() {
        if (_lemon2 != null) return _lemon2!!
        _lemon2 = tablerOutlineIcon(
            name = "Lemon2",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(18.0f, 4.0f),
                    PathNode.CurveTo(18.864222f, 4.000083f, 19.630634f, 4.555255f, 19.9001f, 5.376393f),
                    PathNode.CurveTo(20.16957f, 6.19753f, 19.88113f, 7.098866f, 19.185f, 7.611f),
                    PathNode.CurveTo(20.735f, 10.551f, 20.058f, 14.528f, 17.293f, 17.293f),
                    PathNode.CurveTo(14.528f, 20.058f, 10.55f, 20.735f, 7.611f, 19.185f),
                    PathNode.CurveTo(7.14477f, 19.81933f, 6.349787f, 20.12115f, 5.580052f, 19.95606f),
                    PathNode.CurveTo(4.810318f, 19.79097f, 4.20903f, 19.189682f, 4.04394f, 18.419949f),
                    PathNode.CurveTo(3.878849f, 17.650213f, 4.180669f, 16.85523f, 4.815f, 16.389f),
                    PathNode.CurveTo(3.265f, 13.449f, 3.942f, 9.472f, 6.707f, 6.707f),
                    PathNode.CurveTo(9.472f, 3.942f, 13.45f, 3.265f, 16.389f, 4.815f),
                    PathNode.CurveTo(16.765856f, 4.302622f, 17.363956f, 4.000045f, 18.0f, 4.0f)
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
        return _lemon2!!
    }

private var _lemon2: ImageVector? = null
