package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Cone2: ImageVector
    get() {
        if (_cone2 != null) return _cone2!!
        _cone2 = tablerOutlineIcon(
            name = "Cone2",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(21.0f, 5.002f),
                    PathNode.LineTo(21.0f, 5.502f),
                    PathNode.LineTo(12.87f, 20.492f),
                    PathNode.CurveTo(12.692439f, 20.805311f, 12.360126f, 20.99895f, 12.0f, 20.99895f),
                    PathNode.CurveTo(11.639874f, 20.99895f, 11.307561f, 20.805311f, 11.13f, 20.492f),
                    PathNode.LineTo(3.0f, 5.503f),
                    PathNode.LineTo(3.0f, 5.003f),
                    PathNode.CurveTo(3.0f, 3.344f, 7.03f, 2.0f, 12.0f, 2.0f),
                    PathNode.CurveTo(16.97f, 2.0f, 21.0f, 3.344f, 21.0f, 5.002f)
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
        return _cone2!!
    }

private var _cone2: ImageVector? = null
