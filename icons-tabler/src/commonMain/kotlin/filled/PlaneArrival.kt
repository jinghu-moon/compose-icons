package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.PlaneArrival: ImageVector
    get() {
        if (_planeArrival != null) return _planeArrival!!
        _planeArrival = tablerFilledIcon(
            name = "PlaneArrival",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(10.466f, 2.271f),
                    PathNode.LineTo(13.364f, 3.048f),
                    PathNode.CurveTo(13.710428f, 3.140884f, 13.980582f, 3.412182f, 14.072f, 3.759f),
                    PathNode.LineTo(15.976f, 10.994f),
                    PathNode.LineTo(20.231f, 12.135f),
                    PathNode.CurveTo(21.275837f, 12.401974f, 22.09699f, 13.209198f, 22.381798f, 14.249316f),
                    PathNode.CurveTo(22.666603f, 15.289434f, 22.371237f, 16.402388f, 21.60816f, 17.164406f),
                    PathNode.CurveTo(20.845083f, 17.926426f, 19.731722f, 18.22025f, 18.692f, 17.934f),
                    PathNode.LineTo(4.203f, 14.052f),
                    PathNode.CurveTo(3.837598f, 13.953753f, 3.558942f, 13.657681f, 3.483f, 13.287f),
                    PathNode.LineTo(2.136f, 6.715f),
                    PathNode.CurveTo(2.066201f, 6.375262f, 2.177426f, 6.023617f, 2.429901f, 5.785813f),
                    PathNode.CurveTo(2.682377f, 5.54801f, 3.040043f, 5.458011f, 3.375f, 5.548f),
                    PathNode.LineTo(6.273f, 6.324f),
                    PathNode.CurveTo(6.529116f, 6.39271f, 6.747455f, 6.560331f, 6.88f, 6.79f),
                    PathNode.LineTo(8.087f, 8.881f),
                    PathNode.LineTo(9.304f, 9.207f),
                    PathNode.LineTo(9.206f, 3.253f),
                    PathNode.CurveTo(9.20093f, 2.939254f, 9.343422f, 2.641321f, 9.590845f, 2.448334f),
                    PathNode.CurveTo(9.838269f, 2.255347f, 10.161931f, 2.189688f, 10.465f, 2.271f)
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 4f,
            )
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(22.0f, 21.0f),
                    PathNode.CurveTo(22.0f, 21.552284f, 21.552284f, 22.0f, 21.0f, 22.0f),
                    PathNode.LineTo(3.0f, 22.0f),
                    PathNode.CurveTo(2.447715f, 22.0f, 2.0f, 21.552284f, 2.0f, 21.0f),
                    PathNode.CurveTo(2.0f, 20.447716f, 2.447715f, 20.0f, 3.0f, 20.0f),
                    PathNode.LineTo(21.0f, 20.0f),
                    PathNode.CurveTo(21.552284f, 20.0f, 22.0f, 20.447716f, 22.0f, 21.0f)
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 4f,
            )
        }
        return _planeArrival!!
    }

private var _planeArrival: ImageVector? = null
