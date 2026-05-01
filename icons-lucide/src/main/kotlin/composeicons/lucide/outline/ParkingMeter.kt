package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.ParkingMeter: ImageVector
    get() {
        if (_parkingMeter != null) return _parkingMeter!!
        _parkingMeter = lucideOutlineIcon(
            name = "ParkingMeter",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(11.0f, 15.0f),
                    PathNode.LineTo(13.0f, 15.0f)
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
                    PathNode.MoveTo(12.0f, 12.0f),
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
                    PathNode.MoveTo(12.0f, 19.0f),
                    PathNode.LineTo(12.0f, 22.0f)
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
                    PathNode.MoveTo(15.282f, 19.0f),
                    PathNode.CurveTo(15.711181f, 19.00025f, 16.092663f, 18.726614f, 16.23f, 18.32f),
                    PathNode.LineTo(18.6f, 11.332f),
                    PathNode.CurveTo(19.625101f, 8.431247f, 18.636051f, 5.201197f, 16.162546f, 3.371724f),
                    PathNode.CurveTo(13.689041f, 1.542251f, 10.310959f, 1.542251f, 7.837454f, 3.371724f),
                    PathNode.CurveTo(5.363948f, 5.201197f, 4.3749f, 8.431247f, 5.4f, 11.332f),
                    PathNode.LineTo(7.77f, 18.32f),
                    PathNode.CurveTo(7.907338f, 18.726614f, 8.28882f, 19.00025f, 8.718f, 19.0f),
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
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(9.0f, 9.0f),
                    PathNode.CurveTo(9.0f, 7.343146f, 10.343145f, 6.0f, 12.0f, 6.0f),
                    PathNode.CurveTo(13.656855f, 6.0f, 15.0f, 7.343146f, 15.0f, 9.0f)
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
        return _parkingMeter!!
    }

private var _parkingMeter: ImageVector? = null
