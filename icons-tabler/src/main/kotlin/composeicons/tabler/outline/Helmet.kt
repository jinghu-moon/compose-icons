package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Helmet: ImageVector
    get() {
        if (_helmet != null) return _helmet!!
        _helmet = tablerOutlineIcon(
            name = "Helmet",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(12.0f, 4.0f),
                    PathNode.CurveTo(15.81389f, 4.000362f, 19.213444f, 6.404572f, 20.48457f, 10.000402f),
                    PathNode.CurveTo(21.755695f, 13.596233f, 20.622358f, 17.60282f, 17.656f, 20.0f),
                    PathNode.LineTo(6.344f, 20.0f),
                    PathNode.CurveTo(3.377641f, 17.60282f, 2.244305f, 13.596233f, 3.515431f, 10.000402f),
                    PathNode.CurveTo(4.786557f, 6.404572f, 8.18611f, 4.000362f, 12.0f, 4.0f)
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
                    PathNode.MoveTo(20.0f, 9.0f),
                    PathNode.LineTo(11.2f, 9.0f),
                    PathNode.CurveTo(10.891661f, 9.000391f, 10.600743f, 9.143003f, 10.411576f, 9.386497f),
                    PathNode.CurveTo(10.222409f, 9.629992f, 10.156148f, 9.947136f, 10.232f, 10.246f),
                    PathNode.CurveTo(10.739f, 12.246f, 11.828f, 13.664f, 13.5f, 14.5f),
                    PathNode.CurveTo(15.5f, 15.5f, 17.833f, 16.0f, 20.5f, 16.0f)
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
        return _helmet!!
    }

private var _helmet: ImageVector? = null
