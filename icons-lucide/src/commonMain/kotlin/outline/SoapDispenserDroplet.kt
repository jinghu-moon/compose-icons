package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.SoapDispenserDroplet: ImageVector
    get() {
        if (_soapDispenserDroplet != null) return _soapDispenserDroplet!!
        _soapDispenserDroplet = lucideOutlineIcon(
            name = "SoapDispenserDroplet",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(10.5f, 2.0f),
                    PathNode.LineTo(10.5f, 6.0f)
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
                    PathNode.MoveTo(14.0f, 2.0f),
                    PathNode.LineTo(7.0f, 2.0f),
                    PathNode.CurveTo(5.895431f, 2.0f, 5.0f, 2.895431f, 5.0f, 4.0f)
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
                    PathNode.MoveTo(19.29f, 14.76f),
                    PathNode.CurveTo(18.123121f, 13.801964f, 17.315788f, 12.476387f, 17.0f, 11.0f),
                    PathNode.CurveTo(16.689495f, 12.478485f, 15.881167f, 13.805696f, 14.71f, 14.76f),
                    PathNode.CurveTo(13.56f, 15.68f, 13.0f, 16.8f, 13.0f, 17.95f),
                    PathNode.CurveTo(13.0f, 20.17f, 14.8f, 22.0f, 17.0f, 22.0f),
                    PathNode.CurveTo(19.2f, 22.0f, 21.0f, 20.17f, 21.0f, 17.95f),
                    PathNode.CurveTo(21.0f, 16.79f, 20.43f, 15.69f, 19.29f, 14.76f)
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
                    PathNode.MoveTo(9.607f, 21.0f),
                    PathNode.LineTo(6.0f, 21.0f),
                    PathNode.CurveTo(4.895431f, 21.0f, 4.0f, 20.10457f, 4.0f, 19.0f),
                    PathNode.LineTo(4.0f, 12.0f),
                    PathNode.CurveTo(4.0f, 10.895431f, 4.895431f, 10.0f, 6.0f, 10.0f),
                    PathNode.LineTo(13.0f, 10.0f),
                    PathNode.LineTo(13.0f, 7.0f),
                    PathNode.CurveTo(13.0f, 6.447716f, 12.552285f, 6.0f, 12.0f, 6.0f),
                    PathNode.LineTo(9.0f, 6.0f),
                    PathNode.CurveTo(8.447715f, 6.0f, 8.0f, 6.447716f, 8.0f, 7.0f),
                    PathNode.LineTo(8.0f, 10.0f)
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
        return _soapDispenserDroplet!!
    }

private var _soapDispenserDroplet: ImageVector? = null
