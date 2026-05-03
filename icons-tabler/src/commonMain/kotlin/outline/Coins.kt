package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Coins: ImageVector
    get() {
        if (_coins != null) return _coins!!
        _coins = tablerOutlineIcon(
            name = "Coins",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(9.0f, 14.0f),
                    PathNode.CurveTo(9.0f, 15.657f, 11.686f, 17.0f, 15.0f, 17.0f),
                    PathNode.CurveTo(18.314f, 17.0f, 21.0f, 15.657f, 21.0f, 14.0f),
                    PathNode.CurveTo(21.0f, 12.343f, 18.314f, 11.0f, 15.0f, 11.0f),
                    PathNode.CurveTo(11.686f, 11.0f, 9.0f, 12.343f, 9.0f, 14.0f)
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
                    PathNode.MoveTo(9.0f, 14.0f),
                    PathNode.LineTo(9.0f, 18.0f),
                    PathNode.CurveTo(9.0f, 19.656f, 11.686f, 21.0f, 15.0f, 21.0f),
                    PathNode.CurveTo(18.314f, 21.0f, 21.0f, 19.656f, 21.0f, 18.0f),
                    PathNode.LineTo(21.0f, 14.0f)
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
                    PathNode.MoveTo(3.0f, 6.0f),
                    PathNode.CurveTo(3.0f, 7.072f, 4.144f, 8.062001f, 6.0f, 8.598f),
                    PathNode.CurveTo(7.856f, 9.134f, 10.144f, 9.134f, 12.0f, 8.598f),
                    PathNode.CurveTo(13.856f, 8.062001f, 15.0f, 7.072f, 15.0f, 6.0f),
                    PathNode.CurveTo(15.0f, 4.928f, 13.856f, 3.938f, 12.0f, 3.402f),
                    PathNode.CurveTo(10.144f, 2.866f, 7.856f, 2.866f, 6.0f, 3.402f),
                    PathNode.CurveTo(4.144f, 3.938f, 3.0f, 4.928f, 3.0f, 6.0f)
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
                    PathNode.MoveTo(3.0f, 6.0f),
                    PathNode.LineTo(3.0f, 16.0f),
                    PathNode.CurveTo(3.0f, 16.888f, 3.772f, 17.45f, 5.0f, 18.0f)
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
                    PathNode.MoveTo(3.0f, 11.0f),
                    PathNode.CurveTo(3.0f, 11.888f, 3.772f, 12.45f, 5.0f, 13.0f)
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
        return _coins!!
    }

private var _coins: ImageVector? = null
