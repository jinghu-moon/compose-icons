package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.EggFried: ImageVector
    get() {
        if (_eggFried != null) return _eggFried!!
        _eggFried = tablerOutlineIcon(
            name = "EggFried",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(9.0f, 12.0f),
                    PathNode.CurveTo(9.0f, 13.656855f, 10.343145f, 15.0f, 12.0f, 15.0f),
                    PathNode.CurveTo(13.656855f, 15.0f, 15.0f, 13.656855f, 15.0f, 12.0f),
                    PathNode.CurveTo(15.0f, 10.343145f, 13.656855f, 9.0f, 12.0f, 9.0f),
                    PathNode.CurveTo(10.343145f, 9.0f, 9.0f, 10.343145f, 9.0f, 12.0f)
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
                    PathNode.MoveTo(14.0f, 3.0f),
                    PathNode.CurveTo(15.524993f, 2.999584f, 16.966805f, 3.695147f, 17.915655f, 4.889f),
                    PathNode.CurveTo(18.864506f, 6.082854f, 19.216648f, 7.644463f, 18.872f, 9.13f),
                    PathNode.CurveTo(20.102995f, 9.503763f, 20.958649f, 10.62079f, 20.99894f, 11.906647f),
                    PathNode.CurveTo(21.039228f, 13.192502f, 20.255182f, 14.360906f, 19.05f, 14.811f),
                    PathNode.CurveTo(19.91667f, 15.6219f, 20.223795f, 16.867512f, 19.833424f, 17.988352f),
                    PathNode.CurveTo(19.443052f, 19.109194f, 18.428585f, 19.894518f, 17.245686f, 19.991585f),
                    PathNode.CurveTo(16.062786f, 20.08865f, 14.933867f, 19.47921f, 14.366f, 18.437f),
                    PathNode.CurveTo(12.985289f, 20.828945f, 9.926946f, 21.648712f, 7.535f, 20.268f),
                    PathNode.CurveTo(5.143055f, 18.88729f, 4.323288f, 15.828945f, 5.704f, 13.437f),
                    PathNode.CurveTo(3.258483f, 12.154319f, 2.315819f, 9.132017f, 3.5985f, 6.6865f),
                    PathNode.CurveTo(4.881181f, 4.240983f, 7.903483f, 3.298319f, 10.349f, 4.581f),
                    PathNode.CurveTo(11.29293f, 3.568358f, 12.615644f, 2.994132f, 14.0f, 2.996f),
                    PathNode.LineTo(14.0f, 3.0f)
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
        return _eggFried!!
    }

private var _eggFried: ImageVector? = null
