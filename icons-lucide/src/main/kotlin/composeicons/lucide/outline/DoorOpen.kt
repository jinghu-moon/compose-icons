package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.DoorOpen: ImageVector
    get() {
        if (_doorOpen != null) return _doorOpen!!
        _doorOpen = lucideOutlineIcon(
            name = "DoorOpen",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(11.0f, 20.0f),
                    PathNode.LineTo(2.0f, 20.0f)
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
                    PathNode.MoveTo(11.0f, 4.562f),
                    PathNode.LineTo(11.0f, 20.719f),
                    PathNode.CurveTo(11.000085f, 21.02679f, 11.141904f, 21.317392f, 11.38448f, 21.506844f),
                    PathNode.CurveTo(11.627054f, 21.696295f, 11.943358f, 21.763483f, 12.242f, 21.689f),
                    PathNode.LineTo(19.0f, 20.0f),
                    PathNode.LineTo(19.0f, 5.562f),
                    PathNode.CurveTo(18.99986f, 4.64435f, 18.37526f, 3.84453f, 17.485f, 3.622f),
                    PathNode.LineTo(13.485f, 2.622f),
                    PathNode.CurveTo(12.887747f, 2.47271f, 12.255018f, 2.606797f, 11.76966f, 2.985514f),
                    PathNode.CurveTo(11.284301f, 3.36423f, 11.000401f, 3.945371f, 11.0f, 4.561f),
                    PathNode.Close
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
                    PathNode.MoveTo(11.0f, 4.0f),
                    PathNode.LineTo(8.0f, 4.0f),
                    PathNode.CurveTo(6.895431f, 4.0f, 6.0f, 4.895431f, 6.0f, 6.0f),
                    PathNode.LineTo(6.0f, 20.0f)
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
                    PathNode.MoveTo(14.0f, 12.0f),
                    PathNode.LineTo(14.01f, 12.0f)
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
                    PathNode.MoveTo(22.0f, 20.0f),
                    PathNode.LineTo(19.0f, 20.0f)
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
        return _doorOpen!!
    }

private var _doorOpen: ImageVector? = null
