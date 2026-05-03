package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.SportShoe: ImageVector
    get() {
        if (_sportShoe != null) return _sportShoe!!
        _sportShoe = lucideOutlineIcon(
            name = "SportShoe",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(15.0f, 10.42f),
                    PathNode.LineTo(19.8f, 5.35f)
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
                    PathNode.MoveTo(19.0f, 18.0f),
                    PathNode.LineTo(22.0f, 18.0f)
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
                    PathNode.MoveTo(9.5f, 22.0f),
                    PathNode.LineTo(21.414f, 9.415f),
                    PathNode.CurveTo(21.82427f, 9.005044f, 22.036371f, 8.437177f, 21.995308f, 7.858645f),
                    PathNode.CurveTo(21.954245f, 7.280113f, 21.66406f, 6.747898f, 21.2f, 6.4f),
                    PathNode.LineTo(15.59f, 2.192f),
                    PathNode.CurveTo(15.2859f, 1.969783f, 14.882736f, 1.93728f, 14.546965f, 2.107911f),
                    PathNode.CurveTo(14.211193f, 2.278541f, 13.999775f, 2.623361f, 14.0f, 3.0f),
                    PathNode.LineTo(14.0f, 5.0f),
                    PathNode.CurveTo(14.000009f, 5.87112f, 13.43617f, 6.642051f, 12.606f, 6.906f),
                    PathNode.LineTo(8.677f, 8.053001f),
                    PathNode.CurveTo(8.27192f, 8.191251f, 7.999743f, 8.571978f, 8.0f, 9.0f),
                    PathNode.CurveTo(7.845f, 15.393f, 5.918f, 18.0f, 4.0f, 18.0f),
                    PathNode.CurveTo(2.895431f, 18.0f, 2.0f, 18.89543f, 2.0f, 20.0f),
                    PathNode.CurveTo(2.0f, 21.10457f, 2.895431f, 22.0f, 4.0f, 22.0f),
                    PathNode.LineTo(18.0f, 22.0f)
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
        return _sportShoe!!
    }

private var _sportShoe: ImageVector? = null
