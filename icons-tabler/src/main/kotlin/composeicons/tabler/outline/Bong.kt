package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Bong: ImageVector
    get() {
        if (_bong != null) return _bong!!
        _bong = tablerOutlineIcon(
            name = "Bong",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(13.0f, 3.0f),
                    PathNode.LineTo(13.0f, 11.416f),
                    PathNode.CurveTo(13.134f, 11.475f, 13.265f, 11.539f, 13.393f, 11.609f),
                    PathNode.LineTo(17.0f, 8.0f),
                    PathNode.LineTo(19.0f, 10.0f),
                    PathNode.LineTo(15.392f, 13.608f),
                    PathNode.CurveTo(16.37775f, 15.419f, 16.15072f, 17.64939f, 14.820288f, 19.224627f),
                    PathNode.CurveTo(13.489856f, 20.799864f, 11.328893f, 21.39687f, 9.378491f, 20.72802f),
                    PathNode.CurveTo(7.42809f, 20.059172f, 6.088279f, 18.26165f, 6.004541f, 16.201454f),
                    PathNode.CurveTo(5.920803f, 14.141256f, 7.110314f, 12.240931f, 9.0f, 11.416f),
                    PathNode.LineTo(9.0f, 3.0f),
                    PathNode.LineTo(13.0f, 3.0f)
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
                    PathNode.MoveTo(8.0f, 3.0f),
                    PathNode.LineTo(14.0f, 3.0f)
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
                    PathNode.MoveTo(6.1f, 17.0f),
                    PathNode.LineTo(15.9f, 17.0f)
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
        return _bong!!
    }

private var _bong: ImageVector? = null
