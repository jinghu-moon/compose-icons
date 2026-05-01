package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Flask2Off: ImageVector
    get() {
        if (_flask2Off != null) return _flask2Off!!
        _flask2Off = tablerOutlineIcon(
            name = "Flask2Off",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(6.1f, 15.0f),
                    PathNode.LineTo(15.0f, 15.0f)
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
                    PathNode.MoveTo(17.742f, 17.741f),
                    PathNode.CurveTo(17.337442f, 19.0761f, 16.4803f, 20.2285f, 15.318f, 21.0f),
                    PathNode.LineTo(8.683f, 21.0f),
                    PathNode.CurveTo(6.785732f, 19.743114f, 5.762885f, 17.521008f, 6.041933f, 15.262352f),
                    PathNode.CurveTo(6.32098f, 13.003696f, 7.853882f, 11.097342f, 10.0f, 10.34f),
                    PathNode.LineTo(10.0f, 10.014f),
                    PathNode.MoveTo(10.0f, 6.0f),
                    PathNode.LineTo(10.0f, 3.0f),
                    PathNode.LineTo(14.0f, 3.0f),
                    PathNode.LineTo(14.0f, 10.0f),
                    PathNode.MoveTo(14.613f, 10.598f),
                    PathNode.CurveTo(15.83945f, 11.191707f, 16.82729f, 12.185188f, 17.414f, 13.415f)
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
                    PathNode.MoveTo(9.0f, 3.0f),
                    PathNode.LineTo(15.0f, 3.0f)
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
                    PathNode.MoveTo(3.0f, 3.0f),
                    PathNode.LineTo(21.0f, 21.0f)
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
        return _flask2Off!!
    }

private var _flask2Off: ImageVector? = null
