package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BrandCtemplar: ImageVector
    get() {
        if (_brandCtemplar != null) return _brandCtemplar!!
        _brandCtemplar = tablerOutlineIcon(
            name = "BrandCtemplar",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(6.04f, 14.831f),
                    PathNode.LineTo(10.5f, 10.5f)
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
                    PathNode.MoveTo(12.555f, 20.82f),
                    PathNode.CurveTo(17.105f, 17.364f, 20.137f, 12.181f, 20.981f, 6.415f),
                    PathNode.CurveTo(21.096079f, 5.68403f, 20.715815f, 4.964621f, 20.047f, 4.648f),
                    PathNode.CurveTo(17.510744f, 3.537825f, 14.768487f, 2.976219f, 12.0f, 3.0f),
                    PathNode.CurveTo(9.231585f, 2.975904f, 6.489332f, 3.537168f, 3.953f, 4.647f),
                    PathNode.CurveTo(3.284186f, 4.963621f, 2.903921f, 5.68303f, 3.019f, 6.414f),
                    PathNode.CurveTo(3.863f, 12.18f, 6.894f, 17.364f, 11.445f, 20.82f),
                    PathNode.CurveTo(11.776321f, 21.059258f, 12.223679f, 21.059258f, 12.555f, 20.82f)
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
                    PathNode.MoveTo(20.0f, 5.0f),
                    PathNode.CurveTo(18.0f, 5.0f, 15.63f, 8.304f, 12.0f, 11.644f),
                    PathNode.CurveTo(8.37f, 8.304f, 6.0f, 5.0f, 4.0f, 5.0f)
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
                    PathNode.MoveTo(17.738f, 15.0f),
                    PathNode.LineTo(13.5f, 10.5f)
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
        return _brandCtemplar!!
    }

private var _brandCtemplar: ImageVector? = null
