package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.CloudDataConnection: ImageVector
    get() {
        if (_cloudDataConnection != null) return _cloudDataConnection!!
        _cloudDataConnection = tablerOutlineIcon(
            name = "CloudDataConnection",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(5.0f, 9.897f),
                    PathNode.CurveTo(5.0f, 8.183f, 6.46f, 6.793f, 8.26f, 6.793f),
                    PathNode.CurveTo(8.535f, 5.573f, 9.515f, 4.578f, 10.832f, 4.182f),
                    PathNode.CurveTo(12.149f, 3.785f, 13.602f, 4.048f, 14.643f, 4.872f),
                    PathNode.CurveTo(15.685f, 5.694f, 16.157f, 6.952f, 15.882f, 8.172f),
                    PathNode.LineTo(16.575f, 8.172f),
                    PathNode.CurveTo(17.91114f, 8.169235f, 18.99669f, 9.249861f, 19.0f, 10.586f),
                    PathNode.CurveTo(18.99669f, 11.922139f, 17.91114f, 13.002765f, 16.575f, 13.0f),
                    PathNode.LineTo(8.26f, 13.0f),
                    PathNode.CurveTo(6.46f, 13.0f, 5.0f, 11.61f, 5.0f, 9.897f)
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
                    PathNode.MoveTo(12.0f, 13.0f),
                    PathNode.LineTo(12.0f, 16.0f)
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
                    PathNode.MoveTo(10.0f, 18.0f),
                    PathNode.CurveTo(10.0f, 19.10457f, 10.895431f, 20.0f, 12.0f, 20.0f),
                    PathNode.CurveTo(13.104569f, 20.0f, 14.0f, 19.10457f, 14.0f, 18.0f),
                    PathNode.CurveTo(14.0f, 16.89543f, 13.104569f, 16.0f, 12.0f, 16.0f),
                    PathNode.CurveTo(10.895431f, 16.0f, 10.0f, 16.89543f, 10.0f, 18.0f)
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
                    PathNode.MoveTo(14.0f, 18.0f),
                    PathNode.LineTo(21.0f, 18.0f)
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
                    PathNode.MoveTo(3.0f, 18.0f),
                    PathNode.LineTo(10.0f, 18.0f)
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
        return _cloudDataConnection!!
    }

private var _cloudDataConnection: ImageVector? = null
