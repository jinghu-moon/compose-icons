package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Drumstick: ImageVector
    get() {
        if (_drumstick != null) return _drumstick!!
        _drumstick = lucideOutlineIcon(
            name = "Drumstick",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(15.4f, 15.63f),
                    PathNode.CurveTo(12.327477f, 16.615788f, 9.499968f, 15.581908f, 8.432403f, 13.082296f),
                    PathNode.CurveTo(7.364837f, 10.582685f, 8.307628f, 7.20366f, 10.755644f, 4.755644f),
                    PathNode.CurveTo(13.203659f, 2.307628f, 16.582685f, 1.364837f, 19.082296f, 2.432402f),
                    PathNode.CurveTo(21.581907f, 3.499968f, 22.615788f, 6.327478f, 21.63f, 9.4f),
                    PathNode.CurveTo(20.197886f, 8.583062f, 18.091692f, 9.077594f, 16.584642f, 10.584643f),
                    PathNode.CurveTo(15.077594f, 12.091692f, 14.583062f, 14.197886f, 15.4f, 15.63f)
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
                    PathNode.MoveTo(8.29f, 12.71f),
                    PathNode.LineTo(5.69f, 15.31f),
                    PathNode.CurveTo(4.822273f, 14.831941f, 3.754109f, 14.911381f, 2.966643f, 15.512537f),
                    PathNode.CurveTo(2.179177f, 16.113693f, 1.820986f, 17.123138f, 2.05341f, 18.086191f),
                    PathNode.CurveTo(2.285835f, 19.049244f, 3.065021f, 19.784195f, 4.04f, 19.96f),
                    PathNode.CurveTo(4.231225f, 20.921835f, 4.967138f, 21.683044f, 5.921963f, 21.906652f),
                    PathNode.CurveTo(6.876789f, 22.13026f, 7.874173f, 21.77497f, 8.47259f, 20.99806f),
                    PathNode.CurveTo(9.071009f, 20.22115f, 9.159933f, 19.166115f, 8.7f, 18.3f),
                    PathNode.LineTo(11.29f, 15.71f)
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
        return _drumstick!!
    }

private var _drumstick: ImageVector? = null
