package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.PencilQuestion: ImageVector
    get() {
        if (_pencilQuestion != null) return _pencilQuestion!!
        _pencilQuestion = tablerOutlineIcon(
            name = "PencilQuestion",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(8.0f, 20.0f),
                    PathNode.LineTo(14.0f, 14.0f),
                    PathNode.LineTo(17.0f, 11.0f),
                    PathNode.LineTo(18.5f, 9.5f),
                    PathNode.CurveTo(19.60457f, 8.395431f, 19.60457f, 6.60457f, 18.5f, 5.5f),
                    PathNode.CurveTo(17.39543f, 4.395431f, 15.604569f, 4.395431f, 14.5f, 5.5f),
                    PathNode.LineTo(4.0f, 16.0f),
                    PathNode.LineTo(4.0f, 20.0f),
                    PathNode.LineTo(8.0f, 20.0f)
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
                    PathNode.MoveTo(13.5f, 6.5f),
                    PathNode.LineTo(17.5f, 10.5f)
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
                    PathNode.MoveTo(19.0f, 22.0f),
                    PathNode.LineTo(19.0f, 22.01f)
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
                    PathNode.MoveTo(19.0f, 19.0f),
                    PathNode.CurveTo(19.922588f, 18.997053f, 20.72383f, 18.36431f, 20.940554f, 17.467531f),
                    PathNode.CurveTo(21.157278f, 16.570755f, 20.733423f, 15.64194f, 19.914f, 15.218f),
                    PathNode.CurveTo(19.094873f, 14.798393f, 18.094618f, 14.998527f, 17.5f, 15.701f)
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
        return _pencilQuestion!!
    }

private var _pencilQuestion: ImageVector? = null
