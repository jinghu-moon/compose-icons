package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.DeviceGamepad3: ImageVector
    get() {
        if (_deviceGamepad3 != null) return _deviceGamepad3!!
        _deviceGamepad3 = tablerOutlineIcon(
            name = "DeviceGamepad3",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(9.0f, 12.0f),
                    PathNode.LineTo(6.0f, 9.0f),
                    PathNode.LineTo(4.0f, 9.0f),
                    PathNode.CurveTo(3.447715f, 9.0f, 3.0f, 9.447715f, 3.0f, 10.0f),
                    PathNode.LineTo(3.0f, 14.0f),
                    PathNode.CurveTo(3.0f, 14.552285f, 3.447715f, 15.0f, 4.0f, 15.0f),
                    PathNode.LineTo(6.0f, 15.0f),
                    PathNode.LineTo(9.0f, 12.0f)
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
                    PathNode.MoveTo(15.0f, 12.0f),
                    PathNode.LineTo(18.0f, 9.0f),
                    PathNode.LineTo(20.0f, 9.0f),
                    PathNode.CurveTo(20.552284f, 9.0f, 21.0f, 9.447715f, 21.0f, 10.0f),
                    PathNode.LineTo(21.0f, 14.0f),
                    PathNode.CurveTo(21.0f, 14.552285f, 20.552284f, 15.0f, 20.0f, 15.0f),
                    PathNode.LineTo(18.0f, 15.0f),
                    PathNode.LineTo(15.0f, 12.0f)
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
                    PathNode.MoveTo(12.0f, 15.0f),
                    PathNode.LineTo(9.0f, 18.0f),
                    PathNode.LineTo(9.0f, 20.0f),
                    PathNode.CurveTo(9.0f, 20.552284f, 9.447715f, 21.0f, 10.0f, 21.0f),
                    PathNode.LineTo(14.0f, 21.0f),
                    PathNode.CurveTo(14.552285f, 21.0f, 15.0f, 20.552284f, 15.0f, 20.0f),
                    PathNode.LineTo(15.0f, 18.0f),
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
                    PathNode.MoveTo(12.0f, 9.0f),
                    PathNode.LineTo(9.0f, 6.0f),
                    PathNode.LineTo(9.0f, 4.0f),
                    PathNode.CurveTo(9.0f, 3.447715f, 9.447715f, 3.0f, 10.0f, 3.0f),
                    PathNode.LineTo(14.0f, 3.0f),
                    PathNode.CurveTo(14.552285f, 3.0f, 15.0f, 3.447715f, 15.0f, 4.0f),
                    PathNode.LineTo(15.0f, 6.0f),
                    PathNode.LineTo(12.0f, 9.0f)
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
        return _deviceGamepad3!!
    }

private var _deviceGamepad3: ImageVector? = null
