package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.EraserOff: ImageVector
    get() {
        if (_eraserOff != null) return _eraserOff!!
        _eraserOff = tablerOutlineIcon(
            name = "EraserOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
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
                    PathNode.MoveTo(19.0f, 20.0f),
                    PathNode.LineTo(8.5f, 20.0f),
                    PathNode.LineTo(4.29f, 15.7f),
                    PathNode.CurveTo(3.902277f, 15.309962f, 3.902277f, 14.680037f, 4.29f, 14.29f),
                    PathNode.LineTo(9.29f, 9.297f),
                    PathNode.MoveTo(11.299f, 7.287f),
                    PathNode.LineTo(14.299f, 4.287f),
                    PathNode.CurveTo(14.689037f, 3.899277f, 15.318962f, 3.899277f, 15.709f, 4.287f),
                    PathNode.LineTo(20.709f, 9.287f),
                    PathNode.CurveTo(21.096724f, 9.677037f, 21.096724f, 10.306963f, 20.709f, 10.697f),
                    PathNode.CurveTo(19.292f, 12.128f, 18.303f, 13.129f, 17.739f, 13.697f),
                    PathNode.MoveTo(15.719f, 15.74f),
                    PathNode.LineTo(11.508f, 19.996f)
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
                    PathNode.MoveTo(18.0f, 13.3f),
                    PathNode.LineTo(11.7f, 7.0f)
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
        return _eraserOff!!
    }

private var _eraserOff: ImageVector? = null
