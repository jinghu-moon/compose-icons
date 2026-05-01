package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.DeviceGamepad: ImageVector
    get() {
        if (_deviceGamepad != null) return _deviceGamepad!!
        _deviceGamepad = tablerOutlineIcon(
            name = "DeviceGamepad",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(2.0f, 8.0f),
                    PathNode.CurveTo(2.0f, 6.895431f, 2.895431f, 6.0f, 4.0f, 6.0f),
                    PathNode.LineTo(20.0f, 6.0f),
                    PathNode.CurveTo(21.10457f, 6.0f, 22.0f, 6.895431f, 22.0f, 8.0f),
                    PathNode.LineTo(22.0f, 16.0f),
                    PathNode.CurveTo(22.0f, 17.10457f, 21.10457f, 18.0f, 20.0f, 18.0f),
                    PathNode.LineTo(4.0f, 18.0f),
                    PathNode.CurveTo(2.895431f, 18.0f, 2.0f, 17.10457f, 2.0f, 16.0f),
                    PathNode.LineTo(2.0f, 8.0f)
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
                    PathNode.MoveTo(6.0f, 12.0f),
                    PathNode.LineTo(10.0f, 12.0f),
                    PathNode.MoveTo(8.0f, 10.0f),
                    PathNode.LineTo(8.0f, 14.0f)
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
                    PathNode.MoveTo(15.0f, 11.0f),
                    PathNode.LineTo(15.0f, 11.01f)
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
                    PathNode.MoveTo(18.0f, 13.0f),
                    PathNode.LineTo(18.0f, 13.01f)
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
        return _deviceGamepad!!
    }

private var _deviceGamepad: ImageVector? = null
