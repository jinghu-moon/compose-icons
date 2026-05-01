package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Candy: ImageVector
    get() {
        if (_candy != null) return _candy!!
        _candy = tablerOutlineIcon(
            name = "Candy",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(7.05f, 11.293f),
                    PathNode.LineTo(11.293f, 7.05f),
                    PathNode.CurveTo(12.073999f, 6.269236f, 13.34f, 6.269236f, 14.121f, 7.05f),
                    PathNode.LineTo(16.95f, 9.88f),
                    PathNode.CurveTo(17.730764f, 10.660999f, 17.730764f, 11.927f, 16.95f, 12.708f),
                    PathNode.LineTo(12.707f, 16.951f),
                    PathNode.CurveTo(11.926001f, 17.731764f, 10.66f, 17.731764f, 9.879f, 16.951f),
                    PathNode.LineTo(7.05f, 14.12f),
                    PathNode.CurveTo(6.269236f, 13.339001f, 6.269236f, 12.073f, 7.05f, 11.292f)
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
                    PathNode.MoveTo(16.243f, 9.172f),
                    PathNode.LineTo(19.329f, 8.4f),
                    PathNode.CurveTo(19.853348f, 8.268996f, 20.26668f, 7.86604f, 20.410969f, 7.345191f),
                    PathNode.CurveTo(20.555258f, 6.824342f, 20.408194f, 6.266141f, 20.026f, 5.884f),
                    PathNode.LineTo(17.81f, 3.667f),
                    PathNode.CurveTo(17.458023f, 3.314779f, 16.954205f, 3.160183f, 16.46525f, 3.254367f),
                    PathNode.CurveTo(15.976297f, 3.34855f, 15.565953f, 3.679236f, 15.37f, 4.137f),
                    PathNode.LineTo(14.122f, 7.05f)
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
                    PathNode.MoveTo(9.172f, 16.243f),
                    PathNode.LineTo(8.4f, 19.329f),
                    PathNode.CurveTo(8.268996f, 19.853348f, 7.86604f, 20.26668f, 7.345191f, 20.410969f),
                    PathNode.CurveTo(6.824342f, 20.555258f, 6.266141f, 20.408194f, 5.884f, 20.026f),
                    PathNode.LineTo(3.667f, 17.81f),
                    PathNode.CurveTo(3.314779f, 17.458023f, 3.160183f, 16.954205f, 3.254367f, 16.46525f),
                    PathNode.CurveTo(3.34855f, 15.976297f, 3.679236f, 15.565953f, 4.137f, 15.37f),
                    PathNode.LineTo(7.05f, 14.122f)
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
        return _candy!!
    }

private var _candy: ImageVector? = null
