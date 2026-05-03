package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.CloudLockOpen: ImageVector
    get() {
        if (_cloudLockOpen != null) return _cloudLockOpen!!
        _cloudLockOpen = tablerOutlineIcon(
            name = "CloudLockOpen",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(19.0f, 18.0f),
                    PathNode.CurveTo(20.932997f, 18.0f, 22.5f, 16.432997f, 22.5f, 14.5f),
                    PathNode.CurveTo(22.5f, 12.567003f, 20.932997f, 11.0f, 19.0f, 11.0f),
                    PathNode.LineTo(18.0f, 11.0f),
                    PathNode.CurveTo(18.397f, 9.232f, 17.715f, 7.407f, 16.212f, 6.213f),
                    PathNode.CurveTo(14.709f, 5.02f, 12.612f, 4.638f, 10.712f, 5.213f),
                    PathNode.CurveTo(8.812f, 5.788f, 7.397f, 7.232f, 7.0f, 9.0f),
                    PathNode.CurveTo(4.801f, 8.912f, 2.845f, 10.326f, 2.334f, 12.373f),
                    PathNode.CurveTo(1.822f, 14.42f, 2.898f, 16.527f, 4.9f, 17.4f)
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
                    PathNode.MoveTo(8.0f, 16.0f),
                    PathNode.CurveTo(8.0f, 15.447715f, 8.447715f, 15.0f, 9.0f, 15.0f),
                    PathNode.LineTo(15.0f, 15.0f),
                    PathNode.CurveTo(15.552285f, 15.0f, 16.0f, 15.447715f, 16.0f, 16.0f),
                    PathNode.LineTo(16.0f, 19.0f),
                    PathNode.CurveTo(16.0f, 19.552284f, 15.552285f, 20.0f, 15.0f, 20.0f),
                    PathNode.LineTo(9.0f, 20.0f),
                    PathNode.CurveTo(8.447715f, 20.0f, 8.0f, 19.552284f, 8.0f, 19.0f),
                    PathNode.LineTo(8.0f, 16.0f)
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
                    PathNode.MoveTo(10.0f, 15.0f),
                    PathNode.LineTo(10.0f, 13.0f),
                    PathNode.CurveTo(9.996871f, 12.092034f, 10.605766f, 11.295888f, 11.482861f, 11.061119f),
                    PathNode.CurveTo(12.359955f, 10.826351f, 13.285144f, 11.211876f, 13.736f, 12.0f)
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
        return _cloudLockOpen!!
    }

private var _cloudLockOpen: ImageVector? = null
