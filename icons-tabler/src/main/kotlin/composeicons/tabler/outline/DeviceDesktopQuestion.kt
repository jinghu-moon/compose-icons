package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.DeviceDesktopQuestion: ImageVector
    get() {
        if (_deviceDesktopQuestion != null) return _deviceDesktopQuestion!!
        _deviceDesktopQuestion = tablerOutlineIcon(
            name = "DeviceDesktopQuestion",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(13.5f, 16.0f),
                    PathNode.LineTo(4.0f, 16.0f),
                    PathNode.CurveTo(3.447715f, 16.0f, 3.0f, 15.552285f, 3.0f, 15.0f),
                    PathNode.LineTo(3.0f, 5.0f),
                    PathNode.CurveTo(3.0f, 4.447716f, 3.447715f, 4.0f, 4.0f, 4.0f),
                    PathNode.LineTo(20.0f, 4.0f),
                    PathNode.CurveTo(20.552284f, 4.0f, 21.0f, 4.447716f, 21.0f, 5.0f),
                    PathNode.LineTo(21.0f, 11.5f)
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
                    PathNode.MoveTo(7.0f, 20.0f),
                    PathNode.LineTo(15.0f, 20.0f)
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
                    PathNode.MoveTo(9.0f, 16.0f),
                    PathNode.LineTo(9.0f, 20.0f)
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
                    PathNode.MoveTo(19.0f, 22.0f),
                    PathNode.LineTo(19.0f, 22.01f)
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
                    PathNode.MoveTo(19.0f, 19.0f),
                    PathNode.CurveTo(19.922588f, 18.997053f, 20.72383f, 18.36431f, 20.940554f, 17.467531f),
                    PathNode.CurveTo(21.157278f, 16.570755f, 20.733423f, 15.64194f, 19.914f, 15.218f),
                    PathNode.CurveTo(19.094873f, 14.798393f, 18.094618f, 14.998527f, 17.5f, 15.701f)
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
        return _deviceDesktopQuestion!!
    }

private var _deviceDesktopQuestion: ImageVector? = null
