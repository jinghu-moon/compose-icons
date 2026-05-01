package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.Help: ImageVector
    get() {
        if (_help != null) return _help!!
        _help = tablerFilledIcon(
            name = "Help",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(17.0f, 3.34f),
                    PathNode.CurveTo(20.119509f, 5.113616f, 22.049532f, 8.422732f, 22.05742f, 12.011183f),
                    PathNode.CurveTo(22.06531f, 15.599634f, 20.149853f, 18.917204f, 17.038174f, 20.70452f),
                    PathNode.CurveTo(13.926495f, 22.491833f, 10.095704f, 22.474844f, 7.0f, 20.66f),
                    PathNode.CurveTo(2.257864f, 17.879942f, 0.648714f, 11.79353f, 3.397255f, 7.033057f),
                    PathNode.CurveTo(6.145796f, 2.272585f, 12.2214f, 0.623097f, 17.0f, 3.34f),
                    PathNode.MoveTo(12.0f, 16.0f),
                    PathNode.CurveTo(11.493025f, 16.000067f, 11.066316f, 16.379507f, 11.007f, 16.883f),
                    PathNode.LineTo(11.0f, 17.01f),
                    PathNode.CurveTo(11.000587f, 17.539095f, 11.413211f, 17.976164f, 11.941395f, 18.007172f),
                    PathNode.CurveTo(12.469579f, 18.03818f, 12.93051f, 17.65239f, 12.993f, 17.127f),
                    PathNode.LineTo(13.0f, 17.0f),
                    PathNode.CurveTo(13.0f, 16.447716f, 12.552285f, 16.0f, 12.0f, 16.0f),
                    PathNode.MoveTo(13.173f, 6.144f),
                    PathNode.CurveTo(11.718066f, 5.676378f, 10.126448f, 6.178319f, 9.203f, 7.396f),
                    PathNode.CurveTo(8.880845f, 7.816561f, 8.942579f, 8.415386f, 9.343759f, 8.761377f),
                    PathNode.CurveTo(9.744939f, 9.107368f, 10.346336f, 9.08045f, 10.715f, 8.7f),
                    PathNode.LineTo(10.797f, 8.604f),
                    PathNode.CurveTo(11.207617f, 8.063292f, 11.91478f, 7.840614f, 12.56112f, 8.048498f),
                    PathNode.CurveTo(13.20746f, 8.256381f, 13.652219f, 8.849554f, 13.670635f, 9.528253f),
                    PathNode.CurveTo(13.689052f, 10.206952f, 13.277116f, 10.823371f, 12.643f, 11.066f),
                    PathNode.CurveTo(11.604507f, 11.440462f, 10.93655f, 12.454f, 11.002f, 13.556f),
                    PathNode.CurveTo(11.034289f, 14.082764f, 11.470371f, 14.493758f, 11.998122f, 14.494816f),
                    PathNode.CurveTo(12.525874f, 14.495873f, 12.9636f, 14.08663f, 12.998f, 13.56f),
                    PathNode.LineTo(12.998f, 13.443f),
                    PathNode.CurveTo(12.987411f, 13.250756f, 13.088146f, 13.06951f, 13.257f, 12.977f),
                    PathNode.LineTo(13.332f, 12.943f),
                    PathNode.CurveTo(14.770533f, 12.40195f, 15.70878f, 11.009427f, 15.67f, 9.473f),
                    PathNode.CurveTo(15.628289f, 7.945937f, 14.627346f, 6.61148f, 13.173f, 6.144f)
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 4f,
            )
        }
        return _help!!
    }

private var _help: ImageVector? = null
