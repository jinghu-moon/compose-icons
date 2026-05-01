package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Tree: ImageVector
    get() {
        if (_tree != null) return _tree!!
        _tree = tablerOutlineIcon(
            name = "Tree",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(12.0f, 13.0f),
                    PathNode.LineTo(10.0f, 11.0f)
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
                    PathNode.MoveTo(12.0f, 12.0f),
                    PathNode.LineTo(14.0f, 10.0f)
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
                    PathNode.MoveTo(12.0f, 21.0f),
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
                    PathNode.MoveTo(9.824f, 16.0f),
                    PathNode.CurveTo(8.93831f, 15.948141f, 8.120998f, 15.50691f, 7.591704f, 14.794882f),
                    PathNode.CurveTo(7.06241f, 14.082853f, 6.875426f, 13.173062f, 7.081f, 12.31f),
                    PathNode.CurveTo(6.345716f, 11.697679f, 5.946633f, 10.771337f, 6.006701f, 9.816364f),
                    PathNode.CurveTo(6.06677f, 8.861392f, 6.578784f, 7.992359f, 7.385f, 7.477f),
                    PathNode.CurveTo(6.665013f, 6.197929f, 6.97623f, 4.585718f, 8.120565f, 3.666532f),
                    PathNode.CurveTo(9.264899f, 2.747345f, 10.906289f, 2.791122f, 12.0f, 3.77f),
                    PathNode.CurveTo(13.09392f, 2.792707f, 14.734137f, 2.749786f, 15.877671f, 3.668529f),
                    PathNode.CurveTo(17.021206f, 4.587273f, 17.332666f, 6.198219f, 16.614f, 7.477f),
                    PathNode.CurveTo(17.420347f, 7.992189f, 17.93256f, 8.861131f, 17.992826f, 9.81611f),
                    PathNode.CurveTo(18.053091f, 10.771088f, 17.654184f, 11.697529f, 16.919f, 12.31f),
                    PathNode.CurveTo(17.131676f, 13.203049f, 16.92375f, 14.144316f, 16.354675f, 14.864676f),
                    PathNode.CurveTo(15.7856f, 15.585037f, 14.918023f, 16.005188f, 14.0f, 16.005f),
                    PathNode.LineTo(10.0f, 16.005f),
                    PathNode.LineTo(9.824f, 16.0f)
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
        return _tree!!
    }

private var _tree: ImageVector? = null
