package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.DiamondOff: ImageVector
    get() {
        if (_diamondOff != null) return _diamondOff!!
        _diamondOff = tablerOutlineIcon(
            name = "DiamondOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(9.0f, 5.0f),
                    PathNode.LineTo(18.0f, 5.0f),
                    PathNode.LineTo(21.0f, 10.0f),
                    PathNode.LineTo(17.692f, 13.697f),
                    PathNode.MoveTo(15.809f, 15.801f),
                    PathNode.LineTo(12.5f, 19.5f),
                    PathNode.CurveTo(12.368338f, 19.634377f, 12.188128f, 19.710102f, 12.0f, 19.710102f),
                    PathNode.CurveTo(11.811872f, 19.710102f, 11.631662f, 19.634377f, 11.5f, 19.5f),
                    PathNode.LineTo(3.0f, 10.0f),
                    PathNode.LineTo(5.62f, 5.632f)
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
                    PathNode.MoveTo(10.0f, 12.0f),
                    PathNode.LineTo(8.0f, 9.8f),
                    PathNode.LineTo(8.6f, 8.8f)
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
        return _diamondOff!!
    }

private var _diamondOff: ImageVector? = null
