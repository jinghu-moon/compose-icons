package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.DeviceTabletDollar: ImageVector
    get() {
        if (_deviceTabletDollar != null) return _deviceTabletDollar!!
        _deviceTabletDollar = tablerOutlineIcon(
            name = "DeviceTabletDollar",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(13.0f, 21.0f),
                    PathNode.LineTo(6.0f, 21.0f),
                    PathNode.CurveTo(5.447716f, 21.0f, 5.0f, 20.552284f, 5.0f, 20.0f),
                    PathNode.LineTo(5.0f, 4.0f),
                    PathNode.CurveTo(5.0f, 3.447715f, 5.447716f, 3.0f, 6.0f, 3.0f),
                    PathNode.LineTo(18.0f, 3.0f),
                    PathNode.CurveTo(18.552284f, 3.0f, 19.0f, 3.447715f, 19.0f, 4.0f),
                    PathNode.LineTo(19.0f, 10.0f)
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
                    PathNode.MoveTo(11.0f, 17.0f),
                    PathNode.CurveTo(11.0f, 17.552284f, 11.447715f, 18.0f, 12.0f, 18.0f),
                    PathNode.CurveTo(12.552285f, 18.0f, 13.0f, 17.552284f, 13.0f, 17.0f),
                    PathNode.CurveTo(13.0f, 16.447716f, 12.552285f, 16.0f, 12.0f, 16.0f),
                    PathNode.CurveTo(11.447715f, 16.0f, 11.0f, 16.447716f, 11.0f, 17.0f)
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
                    PathNode.MoveTo(21.0f, 15.0f),
                    PathNode.LineTo(18.5f, 15.0f),
                    PathNode.CurveTo(17.671574f, 15.0f, 17.0f, 15.671573f, 17.0f, 16.5f),
                    PathNode.CurveTo(17.0f, 17.328426f, 17.671574f, 18.0f, 18.5f, 18.0f),
                    PathNode.LineTo(19.5f, 18.0f),
                    PathNode.CurveTo(20.328426f, 18.0f, 21.0f, 18.671574f, 21.0f, 19.5f),
                    PathNode.CurveTo(21.0f, 20.328426f, 20.328426f, 21.0f, 19.5f, 21.0f),
                    PathNode.LineTo(17.0f, 21.0f)
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
                    PathNode.MoveTo(19.0f, 21.0f),
                    PathNode.LineTo(19.0f, 22.0f),
                    PathNode.MoveTo(19.0f, 14.0f),
                    PathNode.LineTo(19.0f, 15.0f)
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
        return _deviceTabletDollar!!
    }

private var _deviceTabletDollar: ImageVector? = null
