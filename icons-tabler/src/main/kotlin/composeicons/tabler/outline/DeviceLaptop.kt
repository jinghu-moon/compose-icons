package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.DeviceLaptop: ImageVector
    get() {
        if (_deviceLaptop != null) return _deviceLaptop!!
        _deviceLaptop = tablerOutlineIcon(
            name = "DeviceLaptop",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(3.0f, 19.0f),
                    PathNode.LineTo(21.0f, 19.0f)
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
                    PathNode.MoveTo(5.0f, 7.0f),
                    PathNode.CurveTo(5.0f, 6.447716f, 5.447716f, 6.0f, 6.0f, 6.0f),
                    PathNode.LineTo(18.0f, 6.0f),
                    PathNode.CurveTo(18.552284f, 6.0f, 19.0f, 6.447716f, 19.0f, 7.0f),
                    PathNode.LineTo(19.0f, 15.0f),
                    PathNode.CurveTo(19.0f, 15.552285f, 18.552284f, 16.0f, 18.0f, 16.0f),
                    PathNode.LineTo(6.0f, 16.0f),
                    PathNode.CurveTo(5.447716f, 16.0f, 5.0f, 15.552285f, 5.0f, 15.0f),
                    PathNode.LineTo(5.0f, 7.0f)
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
        return _deviceLaptop!!
    }

private var _deviceLaptop: ImageVector? = null
