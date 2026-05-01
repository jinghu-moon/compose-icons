package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Cone: ImageVector
    get() {
        if (_cone != null) return _cone!!
        _cone = tablerOutlineIcon(
            name = "Cone",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(21.0f, 17.998f),
                    PathNode.LineTo(21.0f, 17.498f),
                    PathNode.LineTo(12.87f, 2.508f),
                    PathNode.CurveTo(12.692439f, 2.19469f, 12.360126f, 2.001052f, 12.0f, 2.001052f),
                    PathNode.CurveTo(11.639874f, 2.001052f, 11.307561f, 2.19469f, 11.13f, 2.508f),
                    PathNode.LineTo(3.0f, 17.497f),
                    PathNode.LineTo(3.0f, 17.997f),
                    PathNode.CurveTo(3.0f, 19.656f, 7.03f, 21.0f, 12.0f, 21.0f),
                    PathNode.CurveTo(16.97f, 21.0f, 21.0f, 19.656f, 21.0f, 17.998f)
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
        return _cone!!
    }

private var _cone: ImageVector? = null
