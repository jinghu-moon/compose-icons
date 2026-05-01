package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.CloudComputing: ImageVector
    get() {
        if (_cloudComputing != null) return _cloudComputing!!
        _cloudComputing = tablerOutlineIcon(
            name = "CloudComputing",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(6.657f, 16.0f),
                    PathNode.CurveTo(4.085f, 16.0f, 2.0f, 13.993f, 2.0f, 11.517f),
                    PathNode.CurveTo(2.0f, 9.042f, 4.085f, 7.035f, 6.657f, 7.035f),
                    PathNode.CurveTo(7.05f, 5.273f, 8.451f, 3.835f, 10.332f, 3.262f),
                    PathNode.CurveTo(12.212f, 2.69f, 14.288f, 3.069f, 15.776f, 4.262f),
                    PathNode.CurveTo(17.264f, 5.452f, 17.938f, 7.269f, 17.546f, 9.031f),
                    PathNode.LineTo(18.536f, 9.031f),
                    PathNode.CurveTo(20.449f, 9.031f, 22.0f, 10.591f, 22.0f, 12.517f),
                    PathNode.CurveTo(22.0f, 14.444f, 20.449f, 16.004f, 18.535f, 16.004f),
                    PathNode.LineTo(6.657f, 16.004f)
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
                    PathNode.MoveTo(12.0f, 16.0f),
                    PathNode.LineTo(12.0f, 21.0f)
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
                    PathNode.MoveTo(16.0f, 16.0f),
                    PathNode.LineTo(16.0f, 20.0f),
                    PathNode.CurveTo(16.0f, 20.552284f, 16.447716f, 21.0f, 17.0f, 21.0f),
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
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(8.0f, 16.0f),
                    PathNode.LineTo(8.0f, 20.0f),
                    PathNode.CurveTo(8.0f, 20.552284f, 7.552285f, 21.0f, 7.0f, 21.0f),
                    PathNode.LineTo(3.0f, 21.0f)
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
        return _cloudComputing!!
    }

private var _cloudComputing: ImageVector? = null
