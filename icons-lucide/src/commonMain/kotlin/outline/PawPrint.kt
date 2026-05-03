package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.PawPrint: ImageVector
    get() {
        if (_pawPrint != null) return _pawPrint!!
        _pawPrint = lucideOutlineIcon(
            name = "PawPrint",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(13.0f, 4.0f),
                    PathNode.CurveTo(13.0f, 5.10457f, 12.104569f, 6.0f, 11.0f, 6.0f),
                    PathNode.CurveTo(9.895431f, 6.0f, 9.0f, 5.10457f, 9.0f, 4.0f),
                    PathNode.CurveTo(9.0f, 2.895431f, 9.895431f, 2.0f, 11.0f, 2.0f),
                    PathNode.CurveTo(12.104569f, 2.0f, 13.0f, 2.895431f, 13.0f, 4.0f),
                    PathNode.Close
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
                    PathNode.MoveTo(20.0f, 8.0f),
                    PathNode.CurveTo(20.0f, 9.104569f, 19.10457f, 10.0f, 18.0f, 10.0f),
                    PathNode.CurveTo(16.89543f, 10.0f, 16.0f, 9.104569f, 16.0f, 8.0f),
                    PathNode.CurveTo(16.0f, 6.895431f, 16.89543f, 6.0f, 18.0f, 6.0f),
                    PathNode.CurveTo(19.10457f, 6.0f, 20.0f, 6.895431f, 20.0f, 8.0f),
                    PathNode.Close
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
                    PathNode.MoveTo(22.0f, 16.0f),
                    PathNode.CurveTo(22.0f, 17.10457f, 21.10457f, 18.0f, 20.0f, 18.0f),
                    PathNode.CurveTo(18.89543f, 18.0f, 18.0f, 17.10457f, 18.0f, 16.0f),
                    PathNode.CurveTo(18.0f, 14.895431f, 18.89543f, 14.0f, 20.0f, 14.0f),
                    PathNode.CurveTo(21.10457f, 14.0f, 22.0f, 14.895431f, 22.0f, 16.0f),
                    PathNode.Close
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
                    PathNode.MoveTo(9.0f, 10.0f),
                    PathNode.CurveTo(11.761424f, 10.0f, 14.0f, 12.238576f, 14.0f, 15.0f),
                    PathNode.LineTo(14.0f, 18.5f),
                    PathNode.CurveTo(13.999439f, 20.228453f, 12.737217f, 21.69768f, 11.028589f, 21.95872f),
                    PathNode.CurveTo(9.319962f, 22.219757f, 7.676627f, 21.194439f, 7.16f, 19.545f),
                    PathNode.QuadTo(6.52f, 17.48f, 4.46f, 16.84f),
                    PathNode.CurveTo(2.811457f, 16.323662f, 1.786209f, 14.681761f, 2.045887f, 12.973878f),
                    PathNode.CurveTo(2.305566f, 11.265994f, 3.772491f, 10.00302f, 5.5f, 10.0f),
                    PathNode.Close
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
        return _pawPrint!!
    }

private var _pawPrint: ImageVector? = null
