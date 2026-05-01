package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Omega: ImageVector
    get() {
        if (_omega != null) return _omega!!
        _omega = tablerOutlineIcon(
            name = "Omega",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(4.0f, 19.0f),
                    PathNode.LineTo(9.0f, 19.0f),
                    PathNode.LineTo(9.0f, 18.0f),
                    PathNode.CurveTo(5.833842f, 16.584404f, 4.088081f, 13.148209f, 4.811811f, 9.756353f),
                    PathNode.CurveTo(5.535542f, 6.364498f, 8.531792f, 3.940119f, 12.0f, 3.940119f),
                    PathNode.CurveTo(15.468208f, 3.940119f, 18.464458f, 6.364498f, 19.188189f, 9.756353f),
                    PathNode.CurveTo(19.91192f, 13.148209f, 18.166159f, 16.584404f, 15.0f, 18.0f),
                    PathNode.LineTo(15.0f, 19.0f),
                    PathNode.LineTo(20.0f, 19.0f)
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
        return _omega!!
    }

private var _omega: ImageVector? = null
