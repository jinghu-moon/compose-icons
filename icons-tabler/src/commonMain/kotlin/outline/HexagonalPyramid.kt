package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.HexagonalPyramid: ImageVector
    get() {
        if (_hexagonalPyramid != null) return _hexagonalPyramid!!
        _hexagonalPyramid = tablerOutlineIcon(
            name = "HexagonalPyramid",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(11.162f, 2.457f),
                    PathNode.LineTo(3.316f, 15.411f),
                    PathNode.CurveTo(2.809176f, 16.19827f, 2.920385f, 17.232483f, 3.583f, 17.894f),
                    PathNode.LineTo(6.11f, 20.417f),
                    PathNode.CurveTo(6.484f, 20.79f, 6.99f, 21.0f, 7.518f, 21.0f),
                    PathNode.LineTo(16.482f, 21.0f),
                    PathNode.CurveTo(17.01f, 21.0f, 17.516f, 20.79f, 17.89f, 20.417f),
                    PathNode.LineTo(20.417f, 17.894f),
                    PathNode.CurveTo(21.079615f, 17.232483f, 21.190825f, 16.19827f, 20.684f, 15.411f),
                    PathNode.LineTo(12.838f, 2.457f),
                    PathNode.CurveTo(12.654768f, 2.171756f, 12.339025f, 1.999305f, 12.0f, 1.999305f),
                    PathNode.CurveTo(11.660975f, 1.999305f, 11.345232f, 2.171756f, 11.162f, 2.457f)
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
                    PathNode.MoveTo(12.0f, 2.0f),
                    PathNode.LineTo(7.0f, 20.9f)
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
                    PathNode.MoveTo(12.0f, 2.0f),
                    PathNode.LineTo(17.0f, 20.9f)
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
        return _hexagonalPyramid!!
    }

private var _hexagonalPyramid: ImageVector? = null
