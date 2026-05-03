package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Hammer: ImageVector
    get() {
        if (_hammer != null) return _hammer!!
        _hammer = tablerOutlineIcon(
            name = "Hammer",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(11.414f, 10.0f),
                    PathNode.LineTo(4.031f, 17.418f),
                    PathNode.CurveTo(3.635831f, 17.810534f, 3.413604f, 18.344507f, 3.413604f, 18.9015f),
                    PathNode.CurveTo(3.413604f, 19.458492f, 3.635831f, 19.992466f, 4.031f, 20.385f),
                    PathNode.CurveTo(4.854084f, 21.203693f, 6.183916f, 21.203693f, 7.007f, 20.385f),
                    PathNode.LineTo(14.414f, 13.0f)
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
                    PathNode.MoveTo(18.121f, 15.293f),
                    PathNode.LineTo(20.707f, 12.707f),
                    PathNode.CurveTo(21.097382f, 12.3165f, 21.097382f, 11.6835f, 20.707f, 11.293f),
                    PathNode.LineTo(13.121f, 3.707f),
                    PathNode.CurveTo(12.7305f, 3.316618f, 12.0975f, 3.316618f, 11.707f, 3.707f),
                    PathNode.LineTo(9.121f, 6.293f),
                    PathNode.CurveTo(8.730618f, 6.6835f, 8.730618f, 7.3165f, 9.121f, 7.707f),
                    PathNode.LineTo(16.707f, 15.293f),
                    PathNode.CurveTo(17.0975f, 15.683382f, 17.7305f, 15.683382f, 18.121f, 15.293f)
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
        return _hammer!!
    }

private var _hammer: ImageVector? = null
