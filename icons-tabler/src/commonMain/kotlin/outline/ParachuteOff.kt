package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.ParachuteOff: ImageVector
    get() {
        if (_parachuteOff != null) return _parachuteOff!!
        _parachuteOff = tablerOutlineIcon(
            name = "ParachuteOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(22.0f, 12.0f),
                    PathNode.CurveTo(22.0f, 6.477f, 17.523f, 2.0f, 12.0f, 2.0f),
                    PathNode.CurveTo(10.263f, 2.0f, 8.63f, 2.443f, 7.206f, 3.222f),
                    PathNode.MoveTo(4.926f, 4.932f),
                    PathNode.CurveTo(3.049569f, 6.805158f, 1.996622f, 9.348641f, 2.0f, 12.0f)
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
                    PathNode.MoveTo(22.0f, 12.0f),
                    PathNode.CurveTo(22.0f, 10.34f, 20.54f, 9.0f, 18.75f, 9.0f),
                    PathNode.CurveTo(17.12f, 9.0f, 15.777f, 10.099f, 15.538f, 11.54f),
                    PathNode.MoveTo(15.441f, 11.45f),
                    PathNode.CurveTo(15.211f, 10.383f, 14.321f, 9.515f, 13.151f, 9.166f),
                    PathNode.MoveTo(9.706f, 9.734f),
                    PathNode.CurveTo(8.967f, 10.284f, 8.5f, 11.094f, 8.5f, 12.0f),
                    PathNode.CurveTo(8.5f, 10.34f, 7.04f, 9.0f, 5.25f, 9.0f),
                    PathNode.CurveTo(3.45f, 9.0f, 2.0f, 10.34f, 2.0f, 12.0f)
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
                    PathNode.MoveTo(2.0f, 12.0f),
                    PathNode.LineTo(12.0f, 22.0f),
                    PathNode.LineTo(8.5f, 12.0f)
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
                    PathNode.MoveTo(14.582f, 14.624f),
                    PathNode.LineTo(12.0f, 22.0f),
                    PathNode.LineTo(16.992f, 17.008f),
                    PathNode.MoveTo(19.006f, 14.994f),
                    PathNode.LineTo(22.006f, 11.994f)
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
        return _parachuteOff!!
    }

private var _parachuteOff: ImageVector? = null
