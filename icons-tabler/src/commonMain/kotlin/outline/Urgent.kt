package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Urgent: ImageVector
    get() {
        if (_urgent != null) return _urgent!!
        _urgent = tablerOutlineIcon(
            name = "Urgent",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(8.0f, 16.0f),
                    PathNode.LineTo(8.0f, 12.0f),
                    PathNode.CurveTo(8.0f, 9.790861f, 9.790861f, 8.0f, 12.0f, 8.0f),
                    PathNode.CurveTo(14.209139f, 8.0f, 16.0f, 9.790861f, 16.0f, 12.0f),
                    PathNode.LineTo(16.0f, 16.0f)
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
                    PathNode.MoveTo(3.0f, 12.0f),
                    PathNode.LineTo(4.0f, 12.0f),
                    PathNode.MoveTo(12.0f, 3.0f),
                    PathNode.LineTo(12.0f, 4.0f),
                    PathNode.MoveTo(20.0f, 12.0f),
                    PathNode.LineTo(21.0f, 12.0f),
                    PathNode.MoveTo(5.6f, 5.6f),
                    PathNode.LineTo(6.3f, 6.3f),
                    PathNode.MoveTo(18.4f, 5.6f),
                    PathNode.LineTo(17.7f, 6.3f)
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
                    PathNode.MoveTo(6.0f, 17.0f),
                    PathNode.CurveTo(6.0f, 16.447716f, 6.447716f, 16.0f, 7.0f, 16.0f),
                    PathNode.LineTo(17.0f, 16.0f),
                    PathNode.CurveTo(17.552284f, 16.0f, 18.0f, 16.447716f, 18.0f, 17.0f),
                    PathNode.LineTo(18.0f, 19.0f),
                    PathNode.CurveTo(18.0f, 19.552284f, 17.552284f, 20.0f, 17.0f, 20.0f),
                    PathNode.LineTo(7.0f, 20.0f),
                    PathNode.CurveTo(6.447716f, 20.0f, 6.0f, 19.552284f, 6.0f, 19.0f),
                    PathNode.LineTo(6.0f, 17.0f)
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
        return _urgent!!
    }

private var _urgent: ImageVector? = null
