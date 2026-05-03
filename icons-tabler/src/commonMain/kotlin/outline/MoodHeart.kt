package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.MoodHeart: ImageVector
    get() {
        if (_moodHeart != null) return _moodHeart!!
        _moodHeart = tablerOutlineIcon(
            name = "MoodHeart",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(21.0f, 12.0f),
                    PathNode.CurveTo(20.999836f, 8.269595f, 18.69838f, 4.92596f, 15.213942f, 3.593815f),
                    PathNode.CurveTo(11.729504f, 2.26167f, 7.784431f, 3.217178f, 5.295691f, 5.996043f),
                    PathNode.CurveTo(2.80695f, 8.774909f, 2.290476f, 12.801054f, 3.997229f, 16.118118f),
                    PathNode.CurveTo(5.703982f, 19.435183f, 9.280141f, 21.355516f, 12.988f, 20.946f)
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
                    PathNode.MoveTo(9.0f, 10.0f),
                    PathNode.LineTo(9.01f, 10.0f)
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
                    PathNode.MoveTo(15.0f, 10.0f),
                    PathNode.LineTo(15.01f, 10.0f)
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
                    PathNode.MoveTo(9.5f, 15.0f),
                    PathNode.CurveTo(10.240499f, 15.711585f, 11.250294f, 16.071966f, 12.274f, 15.99f)
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
                    PathNode.MoveTo(18.994f, 21.5f),
                    PathNode.LineTo(21.512f, 18.92f),
                    PathNode.CurveTo(22.161415f, 18.247374f, 22.163181f, 17.181774f, 21.516f, 16.507f),
                    PathNode.CurveTo(21.209917f, 16.187195f, 20.78674f, 16.005917f, 20.344065f, 16.004974f),
                    PathNode.CurveTo(19.90139f, 16.00403f, 19.477444f, 16.183504f, 19.17f, 16.502f),
                    PathNode.LineTo(19.002f, 16.674f),
                    PathNode.LineTo(18.834f, 16.502f),
                    PathNode.CurveTo(18.52778f, 16.182327f, 18.104527f, 16.001228f, 17.661852f, 16.000475f),
                    PathNode.CurveTo(17.219177f, 15.99972f, 16.795307f, 16.179373f, 16.488f, 16.498f),
                    PathNode.CurveTo(15.839226f, 17.170498f, 15.837461f, 18.235355f, 16.484f, 18.91f),
                    PathNode.LineTo(18.994f, 21.5f)
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
        return _moodHeart!!
    }

private var _moodHeart: ImageVector? = null
