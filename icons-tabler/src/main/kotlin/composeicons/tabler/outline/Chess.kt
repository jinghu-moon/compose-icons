package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Chess: ImageVector
    get() {
        if (_chess != null) return _chess!!
        _chess = tablerOutlineIcon(
            name = "Chess",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(12.0f, 3.0f),
                    PathNode.CurveTo(13.656855f, 3.0f, 15.0f, 4.343146f, 15.0f, 6.0f),
                    PathNode.CurveTo(15.0f, 7.113f, 14.4f, 8.482f, 13.5f, 9.0f),
                    PathNode.LineTo(15.0f, 16.0f),
                    PathNode.LineTo(9.0f, 16.0f),
                    PathNode.LineTo(10.5f, 9.0f),
                    PathNode.CurveTo(9.6f, 8.482f, 9.0f, 7.113f, 9.0f, 6.0f),
                    PathNode.CurveTo(9.0f, 4.343146f, 10.343145f, 3.0f, 12.0f, 3.0f)
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
                    PathNode.MoveTo(8.0f, 9.0f),
                    PathNode.LineTo(16.0f, 9.0f)
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
                    PathNode.MoveTo(6.684f, 16.772f),
                    PathNode.CurveTo(6.275458f, 16.908072f, 5.999897f, 17.290392f, 6.0f, 17.721f),
                    PathNode.LineTo(6.0f, 19.0f),
                    PathNode.CurveTo(6.0f, 19.552284f, 6.447716f, 20.0f, 7.0f, 20.0f),
                    PathNode.LineTo(17.0f, 20.0f),
                    PathNode.CurveTo(17.552284f, 20.0f, 18.0f, 19.552284f, 18.0f, 19.0f),
                    PathNode.LineTo(18.0f, 17.72f),
                    PathNode.CurveTo(17.999674f, 17.28976f, 17.724194f, 16.907955f, 17.316f, 16.772f),
                    PathNode.LineTo(15.0f, 16.0f),
                    PathNode.LineTo(9.0f, 16.0f),
                    PathNode.LineTo(6.684f, 16.772f)
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
        return _chess!!
    }

private var _chess: ImageVector? = null
