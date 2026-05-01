package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.ClosedCaption: ImageVector
    get() {
        if (_closedCaption != null) return _closedCaption!!
        _closedCaption = lucideOutlineIcon(
            name = "ClosedCaption",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(10.0f, 9.17f),
                    PathNode.CurveTo(8.757191f, 8.732803f, 7.374578f, 9.157606f, 6.591654f, 10.217203f),
                    PathNode.CurveTo(5.808729f, 11.2768f, 5.808729f, 12.7232f, 6.591654f, 13.782797f),
                    PathNode.CurveTo(7.374578f, 14.842394f, 8.757191f, 15.267197f, 10.0f, 14.83f)
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
                    PathNode.MoveTo(17.0f, 9.17f),
                    PathNode.CurveTo(15.757191f, 8.732803f, 14.374578f, 9.157606f, 13.591654f, 10.217203f),
                    PathNode.CurveTo(12.808729f, 11.2768f, 12.808729f, 12.7232f, 13.591654f, 13.782797f),
                    PathNode.CurveTo(14.374578f, 14.842394f, 15.757191f, 15.267197f, 17.0f, 14.83f)
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
                    PathNode.MoveTo(4.0f, 5.0f),
                    PathNode.LineTo(20.0f, 5.0f),
                    PathNode.CurveTo(21.10457f, 5.0f, 22.0f, 5.895431f, 22.0f, 7.0f),
                    PathNode.LineTo(22.0f, 17.0f),
                    PathNode.CurveTo(22.0f, 18.10457f, 21.10457f, 19.0f, 20.0f, 19.0f),
                    PathNode.LineTo(4.0f, 19.0f),
                    PathNode.CurveTo(2.895431f, 19.0f, 2.0f, 18.10457f, 2.0f, 17.0f),
                    PathNode.LineTo(2.0f, 7.0f),
                    PathNode.CurveTo(2.0f, 5.895431f, 2.895431f, 5.0f, 4.0f, 5.0f),
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
        }
        return _closedCaption!!
    }

private var _closedCaption: ImageVector? = null
