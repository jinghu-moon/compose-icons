package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.ApiApp: ImageVector
    get() {
        if (_apiApp != null) return _apiApp!!
        _apiApp = tablerOutlineIcon(
            name = "ApiApp",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(12.0f, 15.0f),
                    PathNode.LineTo(5.5f, 15.0f),
                    PathNode.CurveTo(4.119288f, 15.0f, 3.0f, 13.880712f, 3.0f, 12.5f),
                    PathNode.CurveTo(3.0f, 11.119288f, 4.119288f, 10.0f, 5.5f, 10.0f),
                    PathNode.LineTo(6.0f, 10.0f)
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
                    PathNode.MoveTo(15.0f, 12.0f),
                    PathNode.LineTo(15.0f, 18.5f),
                    PathNode.CurveTo(15.0f, 19.880713f, 13.880712f, 21.0f, 12.5f, 21.0f),
                    PathNode.CurveTo(11.119288f, 21.0f, 10.0f, 19.880713f, 10.0f, 18.5f),
                    PathNode.LineTo(10.0f, 18.0f)
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
                    PathNode.MoveTo(12.0f, 9.0f),
                    PathNode.LineTo(18.5f, 9.0f),
                    PathNode.CurveTo(19.880713f, 9.0f, 21.0f, 10.119288f, 21.0f, 11.5f),
                    PathNode.CurveTo(21.0f, 12.880712f, 19.880713f, 14.0f, 18.5f, 14.0f),
                    PathNode.LineTo(18.0f, 14.0f)
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
                    PathNode.MoveTo(9.0f, 12.0f),
                    PathNode.LineTo(9.0f, 5.5f),
                    PathNode.CurveTo(9.0f, 4.119288f, 10.119288f, 3.0f, 11.5f, 3.0f),
                    PathNode.CurveTo(12.880712f, 3.0f, 14.0f, 4.119288f, 14.0f, 5.5f),
                    PathNode.LineTo(14.0f, 6.0f)
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
        return _apiApp!!
    }

private var _apiApp: ImageVector? = null
