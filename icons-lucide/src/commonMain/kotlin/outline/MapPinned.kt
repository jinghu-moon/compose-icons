package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.MapPinned: ImageVector
    get() {
        if (_mapPinned != null) return _mapPinned!!
        _mapPinned = lucideOutlineIcon(
            name = "MapPinned",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(18.0f, 8.0f),
                    PathNode.CurveTo(18.0f, 11.613f, 14.131f, 15.429f, 12.607f, 16.795f),
                    PathNode.CurveTo(12.248624f, 17.068731f, 11.751376f, 17.068731f, 11.393f, 16.795f),
                    PathNode.CurveTo(9.87f, 15.429f, 6.0f, 11.613f, 6.0f, 8.0f),
                    PathNode.CurveTo(6.0f, 4.686292f, 8.686292f, 2.0f, 12.0f, 2.0f),
                    PathNode.CurveTo(15.313708f, 2.0f, 18.0f, 4.686292f, 18.0f, 8.0f)
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
                    PathNode.MoveTo(14.0f, 8.0f),
                    PathNode.CurveTo(14.0f, 9.104569f, 13.104569f, 10.0f, 12.0f, 10.0f),
                    PathNode.CurveTo(10.895431f, 10.0f, 10.0f, 9.104569f, 10.0f, 8.0f),
                    PathNode.CurveTo(10.0f, 6.895431f, 10.895431f, 6.0f, 12.0f, 6.0f),
                    PathNode.CurveTo(13.104569f, 6.0f, 14.0f, 6.895431f, 14.0f, 8.0f),
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
                    PathNode.MoveTo(8.714f, 14.0f),
                    PathNode.LineTo(5.004f, 14.0f),
                    PathNode.CurveTo(4.574026f, 14.000183f, 4.192302f, 14.275202f, 4.056f, 14.683f),
                    PathNode.LineTo(2.052f, 20.683f),
                    PathNode.CurveTo(1.950081f, 20.98793f, 2.000991f, 21.323265f, 2.188821f, 21.584208f),
                    PathNode.CurveTo(2.376651f, 21.845148f, 2.678488f, 21.999863f, 3.0f, 22.0f),
                    PathNode.LineTo(21.0f, 22.0f),
                    PathNode.CurveTo(21.321268f, 21.999756f, 21.622854f, 21.845175f, 21.810635f, 21.5845f),
                    PathNode.CurveTo(21.998413f, 21.323826f, 22.04952f, 20.988806f, 21.948f, 20.684f),
                    PathNode.LineTo(19.948f, 14.684f),
                    PathNode.CurveTo(19.811928f, 14.275457f, 19.429607f, 13.999896f, 18.999f, 14.0f),
                    PathNode.LineTo(15.287f, 14.0f)
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
        return _mapPinned!!
    }

private var _mapPinned: ImageVector? = null
