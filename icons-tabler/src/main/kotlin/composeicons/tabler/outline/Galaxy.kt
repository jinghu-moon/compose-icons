package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Galaxy: ImageVector
    get() {
        if (_galaxy != null) return _galaxy!!
        _galaxy = tablerOutlineIcon(
            name = "Galaxy",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(12.0f, 3.0f),
                    PathNode.CurveTo(10.667f, 4.0f, 10.0f, 5.5f, 10.0f, 7.5f),
                    PathNode.CurveTo(10.0f, 10.5f, 12.0f, 12.0f, 12.0f, 12.0f),
                    PathNode.CurveTo(12.0f, 12.0f, 14.0f, 13.5f, 14.0f, 16.5f),
                    PathNode.CurveTo(14.0f, 18.5f, 13.333f, 20.0f, 12.0f, 21.0f)
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
                    PathNode.MoveTo(19.794f, 16.5f),
                    PathNode.CurveTo(19.594f, 14.845f, 18.629f, 13.518f, 16.897f, 12.518f),
                    PathNode.CurveTo(14.3f, 11.018f, 12.0f, 12.0f, 12.0f, 12.0f),
                    PathNode.CurveTo(12.0f, 12.0f, 9.701f, 12.982f, 7.103f, 11.482f),
                    PathNode.CurveTo(5.371f, 10.482f, 4.405f, 9.155f, 4.206f, 7.5f)
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
                    PathNode.MoveTo(19.794f, 7.5f),
                    PathNode.CurveTo(18.262f, 6.845f, 16.629f, 7.018f, 14.897f, 8.018f),
                    PathNode.CurveTo(12.3f, 9.518f, 12.0f, 12.0f, 12.0f, 12.0f),
                    PathNode.CurveTo(12.0f, 12.0f, 11.701f, 14.482f, 9.103f, 15.982f),
                    PathNode.CurveTo(7.371f, 16.982f, 5.738f, 17.155f, 4.206f, 16.5f)
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
        return _galaxy!!
    }

private var _galaxy: ImageVector? = null
