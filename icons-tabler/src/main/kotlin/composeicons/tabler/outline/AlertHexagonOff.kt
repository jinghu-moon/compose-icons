package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.AlertHexagonOff: ImageVector
    get() {
        if (_alertHexagonOff != null) return _alertHexagonOff!!
        _alertHexagonOff = tablerOutlineIcon(
            name = "AlertHexagonOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(18.36f, 18.387f),
                    PathNode.LineTo(13.092f, 21.72f),
                    PathNode.CurveTo(12.411882f, 22.093409f, 11.588118f, 22.093409f, 10.908f, 21.72f),
                    PathNode.LineTo(4.158f, 17.45f),
                    PathNode.CurveTo(3.445466f, 17.060612f, 3.001632f, 16.31399f, 3.0f, 15.502f),
                    PathNode.LineTo(3.0f, 8.217f),
                    PathNode.CurveTo(3.0f, 7.408f, 3.443f, 6.663f, 4.158f, 6.27f),
                    PathNode.LineTo(5.475f, 5.493f),
                    PathNode.MoveTo(8.01f, 4.0f),
                    PathNode.LineTo(10.908f, 2.291f),
                    PathNode.CurveTo(11.608304f, 1.904881f, 12.457696f, 1.904881f, 13.158f, 2.291f),
                    PathNode.LineTo(19.908f, 6.271f),
                    PathNode.LineTo(19.875f, 6.271f),
                    PathNode.CurveTo(20.575f, 6.669f, 21.005f, 7.414f, 21.0f, 8.219f),
                    PathNode.LineTo(21.0f, 15.503f),
                    PathNode.CurveTo(21.0f, 15.917f, 20.884f, 16.315f, 20.674f, 16.658f)
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
                    PathNode.MoveTo(12.0f, 7.0f),
                    PathNode.LineTo(12.0f, 8.0f)
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
                    PathNode.MoveTo(12.0f, 8.0f),
                    PathNode.LineTo(12.0f, 8.01f)
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
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(12.0f, 16.0f),
                    PathNode.LineTo(12.01f, 16.0f)
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
        return _alertHexagonOff!!
    }

private var _alertHexagonOff: ImageVector? = null
