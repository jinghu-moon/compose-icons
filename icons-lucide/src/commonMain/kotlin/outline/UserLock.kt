package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.UserLock: ImageVector
    get() {
        if (_userLock != null) return _userLock!!
        _userLock = lucideOutlineIcon(
            name = "UserLock",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(19.0f, 16.0f),
                    PathNode.LineTo(19.0f, 14.0f),
                    PathNode.CurveTo(19.0f, 12.895431f, 18.10457f, 12.0f, 17.0f, 12.0f),
                    PathNode.CurveTo(15.895431f, 12.0f, 15.0f, 12.895431f, 15.0f, 14.0f),
                    PathNode.LineTo(15.0f, 16.0f)
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
                    PathNode.MoveTo(9.5f, 15.0f),
                    PathNode.LineTo(7.0f, 15.0f),
                    PathNode.CurveTo(4.790861f, 15.0f, 3.0f, 16.790861f, 3.0f, 19.0f),
                    PathNode.LineTo(3.0f, 21.0f)
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
                    PathNode.MoveTo(14.0f, 7.0f),
                    PathNode.CurveTo(14.0f, 9.209139f, 12.209139f, 11.0f, 10.0f, 11.0f),
                    PathNode.CurveTo(7.790861f, 11.0f, 6.0f, 9.209139f, 6.0f, 7.0f),
                    PathNode.CurveTo(6.0f, 4.790861f, 7.790861f, 3.0f, 10.0f, 3.0f),
                    PathNode.CurveTo(12.209139f, 3.0f, 14.0f, 4.790861f, 14.0f, 7.0f),
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
                    PathNode.MoveTo(13.899f, 16.0f),
                    PathNode.LineTo(20.101f, 16.0f),
                    PathNode.CurveTo(20.33943f, 16.0f, 20.568094f, 16.094715f, 20.736689f, 16.263311f),
                    PathNode.CurveTo(20.905285f, 16.431906f, 21.0f, 16.66057f, 21.0f, 16.899f),
                    PathNode.LineTo(21.0f, 20.101f),
                    PathNode.CurveTo(21.0f, 20.33943f, 20.905285f, 20.568094f, 20.736689f, 20.736689f),
                    PathNode.CurveTo(20.568094f, 20.905285f, 20.33943f, 21.0f, 20.101f, 21.0f),
                    PathNode.LineTo(13.899f, 21.0f),
                    PathNode.CurveTo(13.66057f, 21.0f, 13.431907f, 20.905285f, 13.263311f, 20.736689f),
                    PathNode.CurveTo(13.094716f, 20.568094f, 13.0f, 20.33943f, 13.0f, 20.101f),
                    PathNode.LineTo(13.0f, 16.899f),
                    PathNode.CurveTo(13.0f, 16.66057f, 13.094716f, 16.431906f, 13.263311f, 16.263311f),
                    PathNode.CurveTo(13.431907f, 16.094715f, 13.66057f, 16.0f, 13.899f, 16.0f),
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
        return _userLock!!
    }

private var _userLock: ImageVector? = null
