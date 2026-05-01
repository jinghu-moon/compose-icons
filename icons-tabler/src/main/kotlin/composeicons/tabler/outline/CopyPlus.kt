package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.CopyPlus: ImageVector
    get() {
        if (_copyPlus != null) return _copyPlus!!
        _copyPlus = tablerOutlineIcon(
            name = "CopyPlus",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(7.0f, 9.667f),
                    PathNode.CurveTo(7.0f, 8.194057f, 8.194057f, 7.0f, 9.667f, 7.0f),
                    PathNode.LineTo(18.333f, 7.0f),
                    PathNode.CurveTo(19.805943f, 7.0f, 21.0f, 8.194057f, 21.0f, 9.667f),
                    PathNode.LineTo(21.0f, 18.333f),
                    PathNode.CurveTo(21.0f, 19.805943f, 19.805943f, 21.0f, 18.333f, 21.0f),
                    PathNode.LineTo(9.667f, 21.0f),
                    PathNode.CurveTo(8.194057f, 21.0f, 7.0f, 19.805943f, 7.0f, 18.333f),
                    PathNode.LineTo(7.0f, 9.667f)
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
                    PathNode.MoveTo(4.012f, 16.737f),
                    PathNode.CurveTo(3.387043f, 16.38192f, 3.000692f, 15.718786f, 3.0f, 15.0f),
                    PathNode.LineTo(3.0f, 5.0f),
                    PathNode.CurveTo(3.0f, 3.9f, 3.9f, 3.0f, 5.0f, 3.0f),
                    PathNode.LineTo(15.0f, 3.0f),
                    PathNode.CurveTo(15.75f, 3.0f, 16.158f, 3.385f, 16.5f, 4.0f)
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
                    PathNode.MoveTo(11.0f, 14.0f),
                    PathNode.LineTo(17.0f, 14.0f)
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
                    PathNode.MoveTo(14.0f, 11.0f),
                    PathNode.LineTo(14.0f, 17.0f)
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
        return _copyPlus!!
    }

private var _copyPlus: ImageVector? = null
