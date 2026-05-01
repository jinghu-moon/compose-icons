package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Shovel: ImageVector
    get() {
        if (_shovel != null) return _shovel!!
        _shovel = tablerOutlineIcon(
            name = "Shovel",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(17.0f, 4.0f),
                    PathNode.LineTo(20.0f, 7.0f)
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
                    PathNode.MoveTo(18.5f, 5.5f),
                    PathNode.LineTo(10.5f, 13.5f)
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
                    PathNode.MoveTo(8.276f, 11.284f),
                    PathNode.LineTo(12.716f, 15.724f),
                    PathNode.CurveTo(12.897548f, 15.905537f, 12.999541f, 16.15176f, 12.999541f, 16.4085f),
                    PathNode.CurveTo(12.999541f, 16.66524f, 12.897548f, 16.911463f, 12.716f, 17.093f),
                    PathNode.LineTo(10.012f, 19.797f),
                    PathNode.CurveTo(8.40504f, 21.385965f, 5.816413f, 21.378567f, 4.218562f, 19.780441f),
                    PathNode.CurveTo(2.620712f, 18.182316f, 2.613758f, 15.593686f, 4.203f, 13.987f),
                    PathNode.LineTo(6.907f, 11.284f),
                    PathNode.CurveTo(7.088578f, 11.102146f, 7.335016f, 10.999958f, 7.592f, 10.999958f),
                    PathNode.CurveTo(7.848985f, 10.999958f, 8.095423f, 11.102146f, 8.277001f, 11.284f),
                    PathNode.LineTo(8.276f, 11.284f)
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
        return _shovel!!
    }

private var _shovel: ImageVector? = null
