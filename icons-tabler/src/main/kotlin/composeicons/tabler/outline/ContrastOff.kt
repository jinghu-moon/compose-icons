package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.ContrastOff: ImageVector
    get() {
        if (_contrastOff != null) return _contrastOff!!
        _contrastOff = tablerOutlineIcon(
            name = "ContrastOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(12.0f, 12.0f),
                    PathNode.LineTo(12.0f, 17.0f),
                    PathNode.CurveTo(13.319668f, 17.002007f, 14.586265f, 16.480553f, 15.522f, 15.55f),
                    PathNode.MoveTo(16.914f, 12.927f),
                    PathNode.CurveTo(17.189974f, 11.464274f, 16.799877f, 9.954645f, 15.849816f, 8.808734f),
                    PathNode.CurveTo(14.899756f, 7.662822f, 13.488532f, 6.999797f, 12.0f, 7.0f),
                    PathNode.LineTo(12.0f, 8.0f)
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
                    PathNode.MoveTo(5.641f, 5.631f),
                    PathNode.CurveTo(2.123499f, 9.143255f, 2.119245f, 14.841998f, 5.6315f, 18.3595f),
                    PathNode.CurveTo(9.143755f, 21.877f, 14.842499f, 21.881254f, 18.36f, 18.369f),
                    PathNode.MoveTo(20.04f, 16.051f),
                    PathNode.CurveTo(21.78978f, 12.584411f, 21.118856f, 8.38644f, 18.375772f, 5.637903f),
                    PathNode.CurveTo(15.632688f, 2.889365f, 11.436057f, 2.210108f, 7.966f, 3.953f)
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
                    PathNode.MoveTo(3.0f, 3.0f),
                    PathNode.LineTo(21.0f, 21.0f)
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
        return _contrastOff!!
    }

private var _contrastOff: ImageVector? = null
