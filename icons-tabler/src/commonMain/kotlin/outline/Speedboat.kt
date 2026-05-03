package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Speedboat: ImageVector
    get() {
        if (_speedboat != null) return _speedboat!!
        _speedboat = tablerOutlineIcon(
            name = "Speedboat",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(2.0f, 17.0f),
                    PathNode.LineTo(16.4f, 17.0f),
                    PathNode.CurveTo(17.4052f, 17.000376f, 18.343788f, 16.497293f, 18.9f, 15.66f),
                    PathNode.LineTo(22.0f, 11.0f),
                    PathNode.LineTo(15.77f, 11.0f),
                    PathNode.CurveTo(15.259376f, 11.000677f, 14.753604f, 11.099115f, 14.28f, 11.29f),
                    PathNode.LineTo(10.72f, 12.71f),
                    PathNode.CurveTo(10.246396f, 12.900885f, 9.740624f, 12.999323f, 9.23f, 13.0f),
                    PathNode.LineTo(3.5f, 13.0f),
                    PathNode.LineTo(2.0f, 17.0f)
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
                    PathNode.MoveTo(6.0f, 13.0f),
                    PathNode.LineTo(7.5f, 8.0f)
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
                    PathNode.MoveTo(6.0f, 8.0f),
                    PathNode.LineTo(14.0f, 8.0f),
                    PathNode.LineTo(16.0f, 11.0f)
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
        return _speedboat!!
    }

private var _speedboat: ImageVector? = null
