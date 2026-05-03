package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Escalator: ImageVector
    get() {
        if (_escalator != null) return _escalator!!
        _escalator = tablerOutlineIcon(
            name = "Escalator",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(19.5f, 5.0f),
                    PathNode.LineTo(16.828f, 5.0f),
                    PathNode.CurveTo(16.297611f, 5.000114f, 15.788985f, 5.210902f, 15.414f, 5.586f),
                    PathNode.LineTo(7.0f, 14.0f),
                    PathNode.LineTo(4.5f, 14.0f),
                    PathNode.CurveTo(3.119288f, 14.0f, 2.0f, 15.119288f, 2.0f, 16.5f),
                    PathNode.CurveTo(2.0f, 17.880713f, 3.119288f, 19.0f, 4.5f, 19.0f),
                    PathNode.LineTo(8.172f, 19.0f),
                    PathNode.CurveTo(8.70239f, 18.999887f, 9.211015f, 18.789099f, 9.586f, 18.414f),
                    PathNode.LineTo(18.0f, 10.0f),
                    PathNode.LineTo(19.5f, 10.0f),
                    PathNode.CurveTo(20.880713f, 10.0f, 22.0f, 8.880712f, 22.0f, 7.5f),
                    PathNode.CurveTo(22.0f, 6.119288f, 20.880713f, 5.0f, 19.5f, 5.0f)
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
        return _escalator!!
    }

private var _escalator: ImageVector? = null
