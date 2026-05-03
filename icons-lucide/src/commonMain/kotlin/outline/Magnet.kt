package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Magnet: ImageVector
    get() {
        if (_magnet != null) return _magnet!!
        _magnet = lucideOutlineIcon(
            name = "Magnet",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(12.0f, 15.0f),
                    PathNode.LineTo(16.0f, 19.0f)
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
                    PathNode.MoveTo(2.352f, 10.648f),
                    PathNode.CurveTo(1.881503f, 11.118567f, 1.881503f, 11.881433f, 2.352f, 12.352f),
                    PathNode.LineTo(4.648f, 14.648f),
                    PathNode.CurveTo(5.118567f, 15.118497f, 5.881433f, 15.118497f, 6.352f, 14.648f),
                    PathNode.LineTo(12.381f, 8.619f),
                    PathNode.CurveTo(13.209427f, 7.790573f, 14.552573f, 7.790573f, 15.381f, 8.619f),
                    PathNode.CurveTo(16.209427f, 9.447427f, 16.209427f, 10.790573f, 15.381f, 11.619f),
                    PathNode.LineTo(9.352f, 17.648f),
                    PathNode.CurveTo(8.881503f, 18.118567f, 8.881503f, 18.881433f, 9.352f, 19.352f),
                    PathNode.LineTo(11.648f, 21.648f),
                    PathNode.CurveTo(12.118567f, 22.118496f, 12.881433f, 22.118496f, 13.352f, 21.648f),
                    PathNode.LineTo(19.717f, 15.281f),
                    PathNode.CurveTo(22.75429f, 12.243157f, 22.753841f, 7.31829f, 19.716f, 4.281f),
                    PathNode.CurveTo(16.678158f, 1.24371f, 11.75329f, 1.244158f, 8.716f, 4.282f),
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
                    PathNode.MoveTo(5.0f, 8.0f),
                    PathNode.LineTo(9.0f, 12.0f)
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
        return _magnet!!
    }

private var _magnet: ImageVector? = null
