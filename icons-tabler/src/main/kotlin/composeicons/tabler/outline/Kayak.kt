package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Kayak: ImageVector
    get() {
        if (_kayak != null) return _kayak!!
        _kayak = tablerOutlineIcon(
            name = "Kayak",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(6.414f, 6.414f),
                    PathNode.CurveTo(7.194764f, 5.633001f, 7.194764f, 4.367f, 6.414f, 3.586f),
                    PathNode.LineTo(5.0f, 2.172f),
                    PathNode.LineTo(2.172f, 5.0f),
                    PathNode.LineTo(3.586f, 6.414f),
                    PathNode.CurveTo(4.367f, 7.194764f, 5.633001f, 7.194764f, 6.414f, 6.414f)
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
                    PathNode.MoveTo(17.586f, 17.586f),
                    PathNode.CurveTo(16.805237f, 18.367f, 16.805237f, 19.633f, 17.586f, 20.414f),
                    PathNode.LineTo(19.0f, 21.828f),
                    PathNode.LineTo(21.828f, 19.0f),
                    PathNode.LineTo(20.414f, 17.586f),
                    PathNode.CurveTo(19.633f, 16.805237f, 18.367f, 16.805237f, 17.586f, 17.586f)
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
                    PathNode.MoveTo(6.5f, 6.5f),
                    PathNode.LineTo(17.5f, 17.5f)
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
                    PathNode.MoveTo(22.0f, 2.5f),
                    PathNode.CurveTo(12.017f, 5.101f, 4.373f, 10.452f, 2.0f, 22.0f),
                    PathNode.CurveTo(11.983f, 19.399f, 19.627f, 14.048f, 22.0f, 2.5f)
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
                    PathNode.MoveTo(6.5f, 12.5f),
                    PathNode.LineTo(11.5f, 17.5f)
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
                    PathNode.MoveTo(12.5f, 6.5f),
                    PathNode.LineTo(17.5f, 11.5f)
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
        return _kayak!!
    }

private var _kayak: ImageVector? = null
