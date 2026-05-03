package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.LoaderPinwheel: ImageVector
    get() {
        if (_loaderPinwheel != null) return _loaderPinwheel!!
        _loaderPinwheel = lucideOutlineIcon(
            name = "LoaderPinwheel",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(22.0f, 12.0f),
                    PathNode.CurveTo(22.0f, 14.761424f, 19.761423f, 17.0f, 17.0f, 17.0f),
                    PathNode.CurveTo(14.238576f, 17.0f, 12.0f, 14.761424f, 12.0f, 12.0f),
                    PathNode.CurveTo(12.0f, 9.238576f, 9.761424f, 7.0f, 7.0f, 7.0f),
                    PathNode.CurveTo(4.238577f, 7.0f, 2.0f, 9.238576f, 2.0f, 12.0f)
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
                    PathNode.MoveTo(7.0f, 20.7f),
                    PathNode.CurveTo(4.597562f, 19.319288f, 3.769288f, 16.25244f, 5.15f, 13.85f),
                    PathNode.CurveTo(6.530712f, 11.447561f, 9.597561f, 10.619288f, 12.0f, 12.0f),
                    PathNode.CurveTo(14.374825f, 13.380712f, 17.419289f, 12.574824f, 18.8f, 10.2f),
                    PathNode.CurveTo(20.180712f, 7.825176f, 19.374825f, 4.780712f, 17.0f, 3.4f)
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
                    PathNode.MoveTo(7.0f, 3.3f),
                    PathNode.CurveTo(9.374825f, 1.919288f, 12.419289f, 2.725176f, 13.8f, 5.1f),
                    PathNode.CurveTo(15.180712f, 7.474825f, 14.374825f, 10.519288f, 12.0f, 11.9f),
                    PathNode.CurveTo(9.625175f, 13.280712f, 8.819288f, 16.325176f, 10.2f, 18.7f),
                    PathNode.CurveTo(11.580711f, 21.074825f, 14.625175f, 21.880713f, 17.0f, 20.5f)
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
                    PathNode.CurveTo(22.0f, 17.522848f, 17.522848f, 22.0f, 12.0f, 22.0f),
                    PathNode.CurveTo(6.477153f, 22.0f, 2.0f, 17.522848f, 2.0f, 12.0f),
                    PathNode.CurveTo(2.0f, 6.477153f, 6.477153f, 2.0f, 12.0f, 2.0f),
                    PathNode.CurveTo(17.522848f, 2.0f, 22.0f, 6.477153f, 22.0f, 12.0f),
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
        return _loaderPinwheel!!
    }

private var _loaderPinwheel: ImageVector? = null
