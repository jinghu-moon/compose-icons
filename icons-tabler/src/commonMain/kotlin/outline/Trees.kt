package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Trees: ImageVector
    get() {
        if (_trees != null) return _trees!!
        _trees = tablerOutlineIcon(
            name = "Trees",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(16.0f, 5.0f),
                    PathNode.LineTo(19.0f, 8.0f),
                    PathNode.LineTo(17.0f, 9.0f),
                    PathNode.LineTo(21.0f, 13.0f),
                    PathNode.LineTo(18.0f, 14.0f),
                    PathNode.LineTo(22.0f, 18.0f),
                    PathNode.LineTo(13.0f, 18.0f)
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
                    PathNode.MoveTo(15.0f, 21.0f),
                    PathNode.LineTo(15.0f, 18.0f)
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
                    PathNode.MoveTo(8.0f, 13.0f),
                    PathNode.LineTo(6.0f, 11.0f)
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
                    PathNode.MoveTo(8.0f, 12.0f),
                    PathNode.LineTo(10.0f, 10.0f)
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
                    PathNode.MoveTo(8.0f, 21.0f),
                    PathNode.LineTo(8.0f, 8.0f)
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
                    PathNode.MoveTo(5.824f, 16.0f),
                    PathNode.CurveTo(4.93831f, 15.948141f, 4.120998f, 15.50691f, 3.591704f, 14.794882f),
                    PathNode.CurveTo(3.06241f, 14.082853f, 2.875425f, 13.173062f, 3.081f, 12.31f),
                    PathNode.CurveTo(2.345716f, 11.697679f, 1.946632f, 10.771337f, 2.006701f, 9.816364f),
                    PathNode.CurveTo(2.06677f, 8.861392f, 2.578784f, 7.992359f, 3.385f, 7.477f),
                    PathNode.CurveTo(2.665013f, 6.197929f, 2.97623f, 4.585718f, 4.120565f, 3.666532f),
                    PathNode.CurveTo(5.264899f, 2.747345f, 6.906289f, 2.791122f, 8.0f, 3.77f),
                    PathNode.CurveTo(9.09392f, 2.792707f, 10.734137f, 2.749786f, 11.877671f, 3.668529f),
                    PathNode.CurveTo(13.021206f, 4.587273f, 13.332666f, 6.198219f, 12.614f, 7.477f),
                    PathNode.CurveTo(13.420347f, 7.992189f, 13.932559f, 8.861131f, 13.992826f, 9.81611f),
                    PathNode.CurveTo(14.053093f, 10.771088f, 13.654183f, 11.697529f, 12.919f, 12.31f),
                    PathNode.CurveTo(13.131676f, 13.203049f, 12.923751f, 14.144316f, 12.354675f, 14.864676f),
                    PathNode.CurveTo(11.7856f, 15.585037f, 10.918023f, 16.005188f, 10.0f, 16.005f),
                    PathNode.LineTo(6.0f, 16.005f),
                    PathNode.LineTo(5.824f, 16.0f)
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
        return _trees!!
    }

private var _trees: ImageVector? = null
