package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.ZapOff: ImageVector
    get() {
        if (_zapOff != null) return _zapOff!!
        _zapOff = lucideOutlineIcon(
            name = "ZapOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(10.513f, 4.856f),
                    PathNode.LineTo(13.12f, 2.17f),
                    PathNode.CurveTo(13.27295f, 1.993453f, 13.527758f, 1.946333f, 13.73373f, 2.056504f),
                    PathNode.CurveTo(13.939703f, 2.166676f, 14.041949f, 2.404778f, 13.98f, 2.63f),
                    PathNode.LineTo(12.603f, 6.947f)
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
                    PathNode.MoveTo(15.656f, 10.0f),
                    PathNode.LineTo(20.0f, 10.0f),
                    PathNode.CurveTo(20.38625f, 9.998683f, 20.738724f, 10.219928f, 20.90545f, 10.568343f),
                    PathNode.CurveTo(21.072176f, 10.916759f, 21.023342f, 11.33004f, 20.78f, 11.63f),
                    PathNode.LineTo(19.06f, 13.403f)
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
                    PathNode.MoveTo(16.273f, 16.273f),
                    PathNode.LineTo(10.88f, 21.83f),
                    PathNode.CurveTo(10.72705f, 22.006546f, 10.472242f, 22.053667f, 10.26627f, 21.943497f),
                    PathNode.CurveTo(10.060297f, 21.833324f, 9.958051f, 21.595222f, 10.02f, 21.37f),
                    PathNode.LineTo(11.94f, 15.35f),
                    PathNode.CurveTo(12.054922f, 15.042425f, 12.011532f, 14.698031f, 11.82391f, 14.428574f),
                    PathNode.CurveTo(11.636288f, 14.159117f, 11.328341f, 13.998932f, 11.0f, 14.0f),
                    PathNode.LineTo(4.0f, 14.0f),
                    PathNode.CurveTo(3.61375f, 14.001317f, 3.261276f, 13.780072f, 3.09455f, 13.431657f),
                    PathNode.CurveTo(2.927824f, 13.083241f, 2.976659f, 12.66996f, 3.22f, 12.37f),
                    PathNode.LineTo(7.727f, 7.727f)
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
                    PathNode.MoveTo(2.0f, 2.0f),
                    PathNode.LineTo(22.0f, 22.0f)
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
        return _zapOff!!
    }

private var _zapOff: ImageVector? = null
