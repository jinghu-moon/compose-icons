package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.EggOff: ImageVector
    get() {
        if (_eggOff != null) return _eggOff!!
        _eggOff = tablerOutlineIcon(
            name = "EggOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(17.927f, 17.934f),
                    PathNode.CurveTo(16.716f, 19.792f, 14.576f, 20.887f, 12.0f, 21.0f),
                    PathNode.CurveTo(7.8f, 21.0f, 5.0f, 18.237f, 5.0f, 14.083f),
                    PathNode.CurveTo(5.0f, 11.515f, 5.753f, 8.943f, 6.91f, 6.925f)
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
                    PathNode.MoveTo(8.642f, 4.628f),
                    PathNode.CurveTo(9.676f, 3.608f, 10.838f, 2.998f, 12.0f, 3.0f),
                    PathNode.CurveTo(15.5f, 3.007f, 19.0f, 8.545f, 19.0f, 14.083f),
                    PathNode.CurveTo(19.0f, 14.381f, 18.985f, 14.67f, 18.955f, 14.951f)
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
                    PathNode.MoveTo(3.0f, 3.0f),
                    PathNode.LineTo(21.0f, 21.0f)
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
        return _eggOff!!
    }

private var _eggOff: ImageVector? = null
