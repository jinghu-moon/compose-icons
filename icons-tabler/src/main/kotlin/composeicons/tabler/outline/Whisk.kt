package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Whisk: ImageVector
    get() {
        if (_whisk != null) return _whisk!!
        _whisk = tablerOutlineIcon(
            name = "Whisk",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(21.015f, 3.035f),
                    PathNode.LineTo(4.5f, 19.5f)
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
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(3.173f, 17.619f),
                    PathNode.CurveTo(3.607221f, 19.213991f, 4.858866f, 20.45649f, 6.457f, 20.879f),
                    PathNode.CurveTo(8.058576f, 21.305408f, 9.766171f, 20.851013f, 10.944f, 19.685f),
                    PathNode.CurveTo(12.794f, 17.849f, 15.014f, 9.035f, 15.014f, 9.035f),
                    PathNode.CurveTo(15.014f, 9.035f, 6.134f, 11.331f, 4.375f, 13.167f),
                    PathNode.CurveTo(3.203849f, 14.327427f, 2.745027f, 16.026825f, 3.173f, 17.619f)
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
        return _whisk!!
    }

private var _whisk: ImageVector? = null
