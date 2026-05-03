package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Recycle: ImageVector
    get() {
        if (_recycle != null) return _recycle!!
        _recycle = lucideOutlineIcon(
            name = "Recycle",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(7.0f, 19.0f),
                    PathNode.LineTo(4.815f, 19.0f),
                    PathNode.CurveTo(4.173413f, 19.001856f, 3.577712f, 18.66758f, 3.245f, 18.119f),
                    PathNode.CurveTo(2.925287f, 17.567688f, 2.923762f, 16.887741f, 3.241f, 16.335f),
                    PathNode.LineTo(7.196f, 9.5f)
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
                    PathNode.MoveTo(11.0f, 19.0f),
                    PathNode.LineTo(19.203f, 19.0f),
                    PathNode.CurveTo(19.841404f, 18.99506f, 20.431086f, 18.657774f, 20.759f, 18.11f),
                    PathNode.CurveTo(21.074228f, 17.56032f, 21.074228f, 16.88468f, 20.759f, 16.335f),
                    PathNode.LineTo(19.533f, 14.215f)
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
                    PathNode.MoveTo(14.0f, 16.0f),
                    PathNode.LineTo(11.0f, 19.0f),
                    PathNode.LineTo(14.0f, 22.0f)
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
                    PathNode.MoveTo(8.293f, 13.596f),
                    PathNode.LineTo(7.196f, 9.5f),
                    PathNode.LineTo(3.1f, 10.598f)
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
                    PathNode.MoveTo(9.344f, 5.811f),
                    PathNode.LineTo(10.437f, 3.919f),
                    PathNode.CurveTo(10.756233f, 3.362494f, 11.343581f, 3.013803f, 11.985f, 3.0f),
                    PathNode.CurveTo(12.621899f, 2.998813f, 13.211123f, 3.337255f, 13.531f, 3.888f),
                    PathNode.LineTo(17.474f, 10.731f)
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
                    PathNode.MoveTo(13.378f, 9.633f),
                    PathNode.LineTo(17.474f, 10.731f),
                    PathNode.LineTo(18.571f, 6.635f)
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
        return _recycle!!
    }

private var _recycle: ImageVector? = null
