package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Clock12: ImageVector
    get() {
        if (_clock12 != null) return _clock12!!
        _clock12 = tablerOutlineIcon(
            name = "Clock12",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(3.0f, 12.0f),
                    PathNode.CurveTo(3.0f, 16.970562f, 7.029437f, 21.0f, 12.0f, 21.0f),
                    PathNode.MoveTo(21.0f, 12.0f),
                    PathNode.CurveTo(21.0f, 7.029437f, 16.970562f, 3.0f, 12.0f, 3.0f),
                    PathNode.CurveTo(7.029437f, 3.0f, 3.0f, 7.029437f, 3.0f, 12.0f)
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
                    PathNode.LineTo(12.0f, 12.0f),
                    PathNode.LineTo(12.5f, 12.5f)
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
                    PathNode.MoveTo(18.0f, 15.0f),
                    PathNode.LineTo(20.0f, 15.0f),
                    PathNode.CurveTo(20.552284f, 15.0f, 21.0f, 15.447715f, 21.0f, 16.0f),
                    PathNode.LineTo(21.0f, 17.0f),
                    PathNode.CurveTo(21.0f, 17.552284f, 20.552284f, 18.0f, 20.0f, 18.0f),
                    PathNode.LineTo(19.0f, 18.0f),
                    PathNode.CurveTo(18.447716f, 18.0f, 18.0f, 18.447716f, 18.0f, 19.0f),
                    PathNode.LineTo(18.0f, 20.0f),
                    PathNode.CurveTo(18.0f, 20.552284f, 18.447716f, 21.0f, 19.0f, 21.0f),
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
                    PathNode.MoveTo(15.0f, 21.0f),
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
        }
        return _clock12!!
    }

private var _clock12: ImageVector? = null
