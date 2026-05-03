package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.CarFan: ImageVector
    get() {
        if (_carFan != null) return _carFan!!
        _carFan = tablerFilledIcon(
            name = "CarFan",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(12.363f, 2.068f),
                    PathNode.LineTo(17.275f, 3.982f),
                    PathNode.CurveTo(18.180273f, 4.334375f, 18.826468f, 5.1459f, 18.96715f, 6.107096f),
                    PathNode.CurveTo(19.107834f, 7.068292f, 18.721317f, 8.030967f, 17.955f, 8.628f),
                    PathNode.LineTo(14.91f, 10.999f),
                    PathNode.LineTo(21.0f, 11.0f),
                    PathNode.CurveTo(21.330267f, 10.99993f, 21.639265f, 11.16293f, 21.825682f, 11.435555f),
                    PathNode.CurveTo(22.012098f, 11.708179f, 22.051886f, 12.055263f, 21.932f, 12.363f),
                    PathNode.LineTo(20.018f, 17.275f),
                    PathNode.CurveTo(19.665625f, 18.180273f, 18.8541f, 18.826468f, 17.892904f, 18.96715f),
                    PathNode.CurveTo(16.931707f, 19.107834f, 15.969033f, 18.721317f, 15.372f, 17.955f),
                    PathNode.LineTo(13.0f, 14.908f),
                    PathNode.LineTo(13.0f, 21.0f),
                    PathNode.CurveTo(13.00007f, 21.330267f, 12.83707f, 21.639265f, 12.564445f, 21.825682f),
                    PathNode.CurveTo(12.291821f, 22.012098f, 11.944737f, 22.051886f, 11.637f, 21.932f),
                    PathNode.LineTo(6.725f, 20.018f),
                    PathNode.CurveTo(5.819726f, 19.665625f, 5.173533f, 18.8541f, 5.03285f, 17.892904f),
                    PathNode.CurveTo(4.892167f, 16.931707f, 5.278684f, 15.969033f, 6.045f, 15.372f),
                    PathNode.LineTo(9.09f, 13.0f),
                    PathNode.LineTo(3.0f, 13.0f),
                    PathNode.CurveTo(2.669735f, 13.00007f, 2.360735f, 12.83707f, 2.174319f, 12.564445f),
                    PathNode.CurveTo(1.987902f, 12.291821f, 1.948114f, 11.944737f, 2.068f, 11.637f),
                    PathNode.LineTo(3.982f, 6.725f),
                    PathNode.CurveTo(4.334375f, 5.819726f, 5.1459f, 5.173533f, 6.107096f, 5.03285f),
                    PathNode.CurveTo(7.068292f, 4.892167f, 8.030967f, 5.278684f, 8.628f, 6.045f),
                    PathNode.LineTo(10.999f, 9.089f),
                    PathNode.LineTo(11.0f, 3.0f),
                    PathNode.CurveTo(10.99993f, 2.669735f, 11.16293f, 2.360735f, 11.435555f, 2.174319f),
                    PathNode.CurveTo(11.708179f, 1.987902f, 12.055263f, 1.948114f, 12.363f, 2.068f)
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
        return _carFan!!
    }

private var _carFan: ImageVector? = null
