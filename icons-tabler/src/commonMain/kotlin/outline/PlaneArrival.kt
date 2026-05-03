package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.PlaneArrival: ImageVector
    get() {
        if (_planeArrival != null) return _planeArrival!!
        _planeArrival = tablerOutlineIcon(
            name = "PlaneArrival",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(15.157f, 11.81f),
                    PathNode.LineTo(19.987f, 13.105f),
                    PathNode.CurveTo(20.687212f, 13.281063f, 21.23817f, 13.820859f, 21.42853f, 14.51732f),
                    PathNode.CurveTo(21.618889f, 15.21378f, 21.419092f, 15.958775f, 20.905783f, 16.466522f),
                    PathNode.CurveTo(20.392473f, 16.974268f, 19.645346f, 17.165936f, 18.951f, 16.968f),
                    PathNode.LineTo(4.462f, 13.086f),
                    PathNode.LineTo(3.117f, 6.514f),
                    PathNode.LineTo(6.015f, 7.29f),
                    PathNode.LineTo(7.429f, 9.74f),
                    PathNode.LineTo(10.327f, 10.516f),
                    PathNode.LineTo(10.207f, 3.237f),
                    PathNode.LineTo(13.105f, 4.014f),
                    PathNode.LineTo(15.157f, 11.811f)
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
                    PathNode.MoveTo(3.0f, 21.0f),
                    PathNode.LineTo(21.0f, 21.0f)
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
        return _planeArrival!!
    }

private var _planeArrival: ImageVector? = null
