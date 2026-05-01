package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.PhoneSpark: ImageVector
    get() {
        if (_phoneSpark != null) return _phoneSpark!!
        _phoneSpark = tablerOutlineIcon(
            name = "PhoneSpark",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(11.584f, 19.225f),
                    PathNode.CurveTo(6.598497f, 16.630281f, 3.339971f, 11.610011f, 3.0f, 6.0f),
                    PathNode.CurveTo(3.0f, 4.895431f, 3.895431f, 4.0f, 5.0f, 4.0f),
                    PathNode.LineTo(9.0f, 4.0f),
                    PathNode.LineTo(11.0f, 9.0f),
                    PathNode.LineTo(8.5f, 10.5f),
                    PathNode.CurveTo(9.570958f, 12.671531f, 11.328469f, 14.429042f, 13.5f, 15.5f),
                    PathNode.LineTo(15.0f, 13.0f),
                    PathNode.LineTo(15.65f, 13.26f)
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
                    PathNode.MoveTo(19.0f, 22.5f),
                    PathNode.CurveTo(19.418587f, 20.769625f, 20.769625f, 19.418587f, 22.5f, 19.0f),
                    PathNode.CurveTo(20.769625f, 18.581413f, 19.418587f, 17.230375f, 19.0f, 15.5f),
                    PathNode.CurveTo(18.581413f, 17.230375f, 17.230375f, 18.581413f, 15.5f, 19.0f),
                    PathNode.CurveTo(17.230375f, 19.418587f, 18.581413f, 20.769625f, 19.0f, 22.5f)
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
        return _phoneSpark!!
    }

private var _phoneSpark: ImageVector? = null
