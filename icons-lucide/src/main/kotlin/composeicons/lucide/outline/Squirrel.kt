package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Squirrel: ImageVector
    get() {
        if (_squirrel != null) return _squirrel!!
        _squirrel = lucideOutlineIcon(
            name = "Squirrel",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(15.236f, 22.0f),
                    PathNode.CurveTo(16.020489f, 21.123087f, 16.219934f, 19.868534f, 15.746069f, 18.791569f),
                    PathNode.CurveTo(15.272204f, 17.714605f, 14.212522f, 17.01407f, 13.036f, 17.0f)
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
                    PathNode.MoveTo(16.0f, 20.0f),
                    PathNode.CurveTo(16.0f, 18.343145f, 17.343145f, 17.0f, 19.0f, 17.0f),
                    PathNode.LineTo(20.0f, 17.0f),
                    PathNode.CurveTo(21.10457f, 17.0f, 22.0f, 16.10457f, 22.0f, 15.0f),
                    PathNode.LineTo(22.0f, 13.0f),
                    PathNode.CurveTo(22.0f, 10.790861f, 20.209139f, 9.0f, 18.0f, 9.0f),
                    PathNode.LineTo(18.0f, 4.0f)
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
                    PathNode.MoveTo(18.0f, 13.0f),
                    PathNode.LineTo(18.01f, 13.0f)
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
                    PathNode.MoveTo(18.0f, 6.0f),
                    PathNode.CurveTo(15.790861f, 6.0f, 14.0f, 7.790861f, 14.0f, 10.0f),
                    PathNode.CurveTo(10.134007f, 10.0f, 7.0f, 13.134007f, 7.0f, 17.0f),
                    PathNode.CurveTo(7.0f, 12.0f, 11.0f, 12.0f, 11.0f, 6.5f),
                    PathNode.CurveTo(11.0f, 4.014719f, 8.985281f, 2.0f, 6.5f, 2.0f),
                    PathNode.CurveTo(4.014719f, 2.0f, 2.0f, 4.014719f, 2.0f, 6.5f),
                    PathNode.CurveTo(2.0f, 7.880712f, 3.119288f, 9.0f, 4.5f, 9.0f),
                    PathNode.CurveTo(5.880712f, 9.0f, 7.0f, 7.880712f, 7.0f, 6.5f),
                    PathNode.CurveTo(7.0f, 10.0f, 3.0f, 11.0f, 3.0f, 17.0f),
                    PathNode.CurveTo(3.0f, 19.8f, 5.2f, 22.0f, 8.0f, 22.0f),
                    PathNode.LineTo(18.0f, 22.0f)
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
        return _squirrel!!
    }

private var _squirrel: ImageVector? = null
