package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.LeafyGreen: ImageVector
    get() {
        if (_leafyGreen != null) return _leafyGreen!!
        _leafyGreen = lucideOutlineIcon(
            name = "LeafyGreen",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(2.0f, 22.0f),
                    PathNode.CurveTo(3.25f, 21.013f, 4.27f, 20.025f, 5.9f, 19.8f),
                    PathNode.CurveTo(7.311121f, 19.799665f, 8.669578f, 20.3359f, 9.7f, 21.3f),
                    PathNode.CurveTo(10.785755f, 22.060587f, 12.177805f, 22.233845f, 13.416875f, 21.76261f),
                    PathNode.CurveTo(14.655946f, 21.291374f, 15.58106f, 20.236868f, 15.887f, 18.947f),
                    PathNode.CurveTo(17.21103f, 19.183046f, 18.553207f, 18.639545f, 19.339952f, 17.548763f),
                    PathNode.CurveTo(20.126698f, 16.45798f, 20.21884f, 15.012871f, 19.577f, 13.831f),
                    PathNode.CurveTo(20.742943f, 13.454319f, 21.627014f, 12.495351f, 21.907846f, 11.302687f),
                    PathNode.CurveTo(22.188677f, 10.110023f, 21.825375f, 8.857341f, 20.95f, 8.0f),
                    PathNode.CurveTo(22.316904f, 6.633096f, 22.316904f, 4.416905f, 20.95f, 3.05f),
                    PathNode.CurveTo(19.583096f, 1.683095f, 17.366905f, 1.683095f, 16.0f, 3.05f),
                    PathNode.CurveTo(15.142659f, 2.174626f, 13.889977f, 1.811323f, 12.697313f, 2.092154f),
                    PathNode.CurveTo(11.504649f, 2.372985f, 10.545681f, 3.257056f, 10.169f, 4.423f),
                    PathNode.CurveTo(8.987129f, 3.781161f, 7.542021f, 3.873302f, 6.451237f, 4.660047f),
                    PathNode.CurveTo(5.360455f, 5.446793f, 4.816954f, 6.788969f, 5.053f, 8.113f),
                    PathNode.CurveTo(3.774637f, 8.424322f, 2.731127f, 9.3444f, 2.26217f, 10.573714f),
                    PathNode.CurveTo(1.793213f, 11.803028f, 1.95879f, 13.184346f, 2.705f, 14.268f),
                    PathNode.CurveTo(3.499f, 15.42f, 4.409f, 16.712f, 4.2f, 18.1f),
                    PathNode.CurveTo(3.926f, 19.743f, 3.014f, 20.732f, 2.0f, 22.0f)
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
                    PathNode.MoveTo(2.0f, 22.0f),
                    PathNode.LineTo(17.0f, 7.0f)
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
        return _leafyGreen!!
    }

private var _leafyGreen: ImageVector? = null
