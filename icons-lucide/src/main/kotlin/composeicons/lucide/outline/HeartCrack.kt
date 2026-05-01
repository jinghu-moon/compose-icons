package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.HeartCrack: ImageVector
    get() {
        if (_heartCrack != null) return _heartCrack!!
        _heartCrack = lucideOutlineIcon(
            name = "HeartCrack",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(12.409f, 5.824f),
                    PathNode.CurveTo(11.707f, 6.616f, 11.259f, 7.32f, 10.994f, 7.99f),
                    PathNode.LineTo(13.147f, 10.146f),
                    PathNode.CurveTo(13.342191f, 10.341249f, 13.342191f, 10.65775f, 13.147f, 10.853f),
                    PathNode.LineTo(10.854f, 13.146f),
                    PathNode.CurveTo(10.658809f, 13.341249f, 10.658809f, 13.65775f, 10.854f, 13.853f),
                    PathNode.LineTo(12.0f, 15.0f)
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
                    PathNode.MoveTo(13.508f, 20.313f),
                    PathNode.CurveTo(13.131067f, 20.745916f, 12.586294f, 20.99601f, 12.012289f, 20.999645f),
                    PathNode.CurveTo(11.438283f, 21.00328f, 10.890386f, 20.760109f, 10.508f, 20.332f),
                    PathNode.LineTo(5.0f, 15.0f),
                    PathNode.CurveTo(3.5f, 13.5f, 2.0f, 11.8f, 2.0f, 9.5f),
                    PathNode.CurveTo(1.999628f, 7.221763f, 3.40388f, 5.179128f, 5.531142f, 4.363578f),
                    PathNode.CurveTo(7.658404f, 3.548028f, 10.068268f, 4.128406f, 11.591f, 5.823f),
                    PathNode.CurveTo(11.821152f, 6.037952f, 12.178323f, 6.038389f, 12.409f, 5.824f),
                    PathNode.CurveTo(13.93161f, 4.129542f, 16.341227f, 3.549108f, 18.468391f, 4.364399f),
                    PathNode.CurveTo(20.595556f, 5.179691f, 21.999958f, 7.221946f, 22.0f, 9.5f),
                    PathNode.CurveTo(22.0f, 11.79f, 20.5f, 13.5f, 19.0f, 15.0f),
                    PathNode.Close
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
        return _heartCrack!!
    }

private var _heartCrack: ImageVector? = null
