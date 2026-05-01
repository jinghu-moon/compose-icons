package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.ChessBishop: ImageVector
    get() {
        if (_chessBishop != null) return _chessBishop!!
        _chessBishop = tablerFilledIcon(
            name = "ChessBishop",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(12.0f, 2.0f),
                    PathNode.CurveTo(12.816177f, 1.999947f, 13.550504f, 2.495844f, 13.855369f, 3.252946f),
                    PathNode.CurveTo(14.160233f, 4.010048f, 13.974464f, 4.876442f, 13.386f, 5.442f),
                    PathNode.CurveTo(14.032f, 5.722f, 14.612f, 6.062f, 15.126f, 6.459f),
                    PathNode.LineTo(11.293f, 10.293f),
                    PathNode.LineTo(11.21f, 10.387f),
                    PathNode.CurveTo(10.901423f, 10.785102f, 10.937099f, 11.350574f, 11.293262f, 11.706738f),
                    PathNode.CurveTo(11.649426f, 12.062901f, 12.214898f, 12.098577f, 12.613f, 11.79f),
                    PathNode.LineTo(12.707f, 11.707f),
                    PathNode.LineTo(16.521f, 7.894f),
                    PathNode.CurveTo(17.498f, 9.244f, 18.0f, 10.964f, 18.0f, 13.0f),
                    PathNode.CurveTo(18.0f, 14.913f, 16.822f, 16.722f, 14.911f, 16.973f),
                    PathNode.LineTo(14.711f, 16.993f),
                    PathNode.LineTo(14.5f, 17.0f),
                    PathNode.LineTo(9.5f, 17.0f),
                    PathNode.CurveTo(7.374f, 17.0f, 6.0f, 15.076f, 6.0f, 13.0f),
                    PathNode.CurveTo(6.0f, 9.32f, 7.57f, 6.745f, 10.613f, 5.44f),
                    PathNode.CurveTo(10.025872f, 4.874095f, 9.84111f, 4.008403f, 10.146047f, 3.252108f),
                    PathNode.CurveTo(10.450983f, 2.495813f, 11.184545f, 2.000387f, 12.0f, 2.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 4f,
            )
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(12.0f, 5.0f),
                    PathNode.LineTo(12.0f, 6.0f)
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 4f,
            )
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(18.0f, 18.0f),
                    PathNode.LineTo(6.0f, 18.0f),
                    PathNode.CurveTo(5.447716f, 18.0f, 5.0f, 18.447716f, 5.0f, 19.0f),
                    PathNode.CurveTo(5.0f, 20.10457f, 5.895431f, 21.0f, 7.0f, 21.0f),
                    PathNode.LineTo(17.0f, 21.0f),
                    PathNode.CurveTo(18.01501f, 21.000254f, 18.869259f, 20.240158f, 18.987f, 19.232f),
                    PathNode.LineTo(18.998f, 19.058f),
                    PathNode.CurveTo(19.013964f, 18.783232f, 18.915974f, 18.514032f, 18.727116f, 18.31382f),
                    PathNode.CurveTo(18.538258f, 18.11361f, 18.27523f, 18.000088f, 18.0f, 18.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 4f,
            )
        }
        return _chessBishop!!
    }

private var _chessBishop: ImageVector? = null
