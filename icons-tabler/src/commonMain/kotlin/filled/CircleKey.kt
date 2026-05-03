package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.CircleKey: ImageVector
    get() {
        if (_circleKey != null) return _circleKey!!
        _circleKey = tablerFilledIcon(
            name = "CircleKey",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(12.0f, 2.0f),
                    PathNode.CurveTo(17.523f, 2.0f, 22.0f, 6.477f, 22.0f, 12.0f),
                    PathNode.CurveTo(22.0f, 17.522848f, 17.522848f, 22.0f, 12.0f, 22.0f),
                    PathNode.CurveTo(6.477153f, 22.0f, 2.0f, 17.522848f, 2.0f, 12.0f),
                    PathNode.CurveTo(2.0f, 6.477f, 6.477f, 2.0f, 12.0f, 2.0f),
                    PathNode.Close,
                    PathNode.MoveTo(14.0f, 7.0f),
                    PathNode.CurveTo(12.478354f, 6.999753f, 11.197525f, 8.138746f, 11.02f, 9.65f),
                    PathNode.LineTo(11.005f, 9.824f),
                    PathNode.LineTo(11.0f, 10.0f),
                    PathNode.LineTo(11.005f, 10.176f),
                    PathNode.CurveTo(11.024f, 10.495f, 11.092f, 10.8f, 11.202f, 11.084f),
                    PathNode.LineTo(11.292f, 11.293f),
                    PathNode.LineTo(7.792f, 14.793f),
                    PathNode.LineTo(7.71f, 14.887f),
                    PathNode.CurveTo(7.430111f, 15.247744f, 7.430111f, 15.752256f, 7.71f, 16.113f),
                    PathNode.LineTo(7.793f, 16.207f),
                    PathNode.LineTo(9.293f, 17.707f),
                    PathNode.LineTo(9.387f, 17.79f),
                    PathNode.CurveTo(9.747744f, 18.06989f, 10.252256f, 18.06989f, 10.613f, 17.79f),
                    PathNode.LineTo(10.707f, 17.707f),
                    PathNode.LineTo(10.79f, 17.613f),
                    PathNode.CurveTo(11.069889f, 17.252256f, 11.069889f, 16.747744f, 10.79f, 16.387f),
                    PathNode.LineTo(10.707f, 16.293f),
                    PathNode.LineTo(9.915f, 15.5f),
                    PathNode.LineTo(10.5f, 14.915f),
                    PathNode.LineTo(11.293f, 15.707f),
                    PathNode.LineTo(11.387f, 15.79f),
                    PathNode.CurveTo(11.785102f, 16.098577f, 12.350574f, 16.0629f, 12.706738f, 15.706738f),
                    PathNode.CurveTo(13.062901f, 15.350574f, 13.098577f, 14.785102f, 12.79f, 14.387f),
                    PathNode.LineTo(12.707f, 14.293f),
                    PathNode.LineTo(11.915f, 13.5f),
                    PathNode.LineTo(12.707f, 12.708f),
                    PathNode.CurveTo(13.819231f, 13.238248f, 15.142585f, 13.0345f, 16.04381f, 12.194252f),
                    PathNode.CurveTo(16.945034f, 11.354004f, 17.240843f, 10.048142f, 16.789686f, 8.901547f),
                    PathNode.CurveTo(16.33853f, 7.754953f, 15.232162f, 7.000814f, 14.0f, 7.0f),
                    PathNode.Close,
                    PathNode.MoveTo(14.0f, 9.0f),
                    PathNode.CurveTo(14.552285f, 9.0f, 15.0f, 9.447715f, 15.0f, 10.0f),
                    PathNode.CurveTo(15.0f, 10.552285f, 14.552285f, 11.0f, 14.0f, 11.0f),
                    PathNode.CurveTo(13.447715f, 11.0f, 13.0f, 10.552285f, 13.0f, 10.0f),
                    PathNode.CurveTo(13.0f, 9.447715f, 13.447715f, 9.0f, 14.0f, 9.0f)
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
        return _circleKey!!
    }

private var _circleKey: ImageVector? = null
