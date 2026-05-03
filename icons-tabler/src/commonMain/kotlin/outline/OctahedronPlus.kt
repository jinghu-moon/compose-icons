package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.OctahedronPlus: ImageVector
    get() {
        if (_octahedronPlus != null) return _octahedronPlus!!
        _octahedronPlus = tablerOutlineIcon(
            name = "OctahedronPlus",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(21.498f, 12.911f),
                    PathNode.LineTo(21.704f, 12.703f),
                    PathNode.CurveTo(21.893297f, 12.517874f, 22.0f, 12.264274f, 22.0f, 11.9995f),
                    PathNode.CurveTo(22.0f, 11.734727f, 21.893297f, 11.481126f, 21.704f, 11.296f),
                    PathNode.LineTo(12.859f, 2.348f),
                    PathNode.CurveTo(12.380571f, 1.883384f, 11.619429f, 1.883384f, 11.141f, 2.348f),
                    PathNode.LineTo(2.296f, 11.297f),
                    PathNode.CurveTo(2.106703f, 11.482126f, 2.0f, 11.735726f, 2.0f, 12.0005f),
                    PathNode.CurveTo(2.0f, 12.265273f, 2.106703f, 12.518874f, 2.296f, 12.704f),
                    PathNode.LineTo(11.141f, 21.653f),
                    PathNode.CurveTo(11.619911f, 22.116812f, 12.380629f, 22.11637f, 12.859f, 21.652f),
                    PathNode.LineTo(12.939f, 21.571f)
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
                    PathNode.CurveTo(2.004f, 12.086f, 2.103f, 12.178f, 2.296f, 12.246f),
                    PathNode.LineTo(11.141f, 14.878f),
                    PathNode.CurveTo(11.6f, 15.041f, 12.4f, 15.041f, 12.859f, 14.878f),
                    PathNode.LineTo(15.493f, 14.094f),
                    PathNode.MoveTo(20.903f, 12.484f),
                    PathNode.LineTo(21.704f, 12.246f),
                    PathNode.CurveTo(21.899f, 12.176f, 21.998f, 12.09f, 22.0f, 12.003f)
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
                    PathNode.MoveTo(12.0f, 2.12f),
                    PathNode.LineTo(12.0f, 21.88f)
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
                    PathNode.MoveTo(16.0f, 19.0f),
                    PathNode.LineTo(22.0f, 19.0f)
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
                    PathNode.MoveTo(19.0f, 16.0f),
                    PathNode.LineTo(19.0f, 22.0f)
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
        return _octahedronPlus!!
    }

private var _octahedronPlus: ImageVector? = null
