package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.DeviceCctv: ImageVector
    get() {
        if (_deviceCctv != null) return _deviceCctv!!
        _deviceCctv = tablerOutlineIcon(
            name = "DeviceCctv",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(3.0f, 4.0f),
                    PathNode.CurveTo(3.0f, 3.447715f, 3.447715f, 3.0f, 4.0f, 3.0f),
                    PathNode.LineTo(20.0f, 3.0f),
                    PathNode.CurveTo(20.552284f, 3.0f, 21.0f, 3.447715f, 21.0f, 4.0f),
                    PathNode.LineTo(21.0f, 6.0f),
                    PathNode.CurveTo(21.0f, 6.552285f, 20.552284f, 7.0f, 20.0f, 7.0f),
                    PathNode.LineTo(4.0f, 7.0f),
                    PathNode.CurveTo(3.447715f, 7.0f, 3.0f, 6.552285f, 3.0f, 6.0f),
                    PathNode.LineTo(3.0f, 4.0f)
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
                    PathNode.MoveTo(8.0f, 14.0f),
                    PathNode.CurveTo(8.0f, 16.209139f, 9.790861f, 18.0f, 12.0f, 18.0f),
                    PathNode.CurveTo(14.209139f, 18.0f, 16.0f, 16.209139f, 16.0f, 14.0f),
                    PathNode.CurveTo(16.0f, 11.790861f, 14.209139f, 10.0f, 12.0f, 10.0f),
                    PathNode.CurveTo(9.790861f, 10.0f, 8.0f, 11.790861f, 8.0f, 14.0f)
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
                    PathNode.MoveTo(19.0f, 7.0f),
                    PathNode.LineTo(19.0f, 14.0f),
                    PathNode.CurveTo(19.0f, 17.865993f, 15.865993f, 21.0f, 12.0f, 21.0f),
                    PathNode.CurveTo(8.134007f, 21.0f, 5.0f, 17.865993f, 5.0f, 14.0f),
                    PathNode.LineTo(5.0f, 7.0f)
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
                    PathNode.MoveTo(12.0f, 14.0f),
                    PathNode.LineTo(12.01f, 14.0f)
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
        return _deviceCctv!!
    }

private var _deviceCctv: ImageVector? = null
