package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.ChartDots2: ImageVector
    get() {
        if (_chartDots2 != null) return _chartDots2!!
        _chartDots2 = tablerFilledIcon(
            name = "ChartDots2",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(3.0f, 2.0f),
                    PathNode.CurveTo(3.552285f, 2.0f, 4.0f, 2.447715f, 4.0f, 3.0f),
                    PathNode.LineTo(4.0f, 20.0f),
                    PathNode.LineTo(21.0f, 20.0f),
                    PathNode.CurveTo(21.506975f, 20.000067f, 21.933683f, 20.379507f, 21.993f, 20.883f),
                    PathNode.LineTo(22.0f, 21.0f),
                    PathNode.CurveTo(22.0f, 21.552284f, 21.552284f, 22.0f, 21.0f, 22.0f),
                    PathNode.LineTo(3.0f, 22.0f),
                    PathNode.CurveTo(2.447715f, 22.0f, 2.0f, 21.552284f, 2.0f, 21.0f),
                    PathNode.LineTo(2.0f, 3.0f),
                    PathNode.CurveTo(2.0f, 2.447715f, 2.447715f, 2.0f, 3.0f, 2.0f),
                    PathNode.MoveTo(21.97f, 2.757f),
                    PathNode.CurveTo(22.10419f, 3.292714f, 21.778708f, 3.835783f, 21.243f, 3.97f),
                    PathNode.LineTo(15.987f, 5.284f),
                    PathNode.CurveTo(15.936499f, 5.812391f, 15.746708f, 6.317923f, 15.437f, 6.749f),
                    PathNode.LineTo(17.205f, 9.107f),
                    PathNode.CurveTo(18.107517f, 8.860236f, 19.073483f, 9.048237f, 19.817575f, 9.615473f),
                    PathNode.CurveTo(20.561668f, 10.182709f, 20.998854f, 11.064356f, 21.0f, 12.0f),
                    PathNode.CurveTo(21.000011f, 13.3025f, 20.159563f, 14.4562f, 18.919796f, 14.855544f),
                    PathNode.CurveTo(17.680025f, 15.254889f, 16.324213f, 14.80863f, 15.564f, 13.751f),
                    PathNode.LineTo(11.994f, 15.179f),
                    PathNode.CurveTo(11.891874f, 16.79374f, 10.527677f, 18.0366f, 8.910433f, 17.988304f),
                    PathNode.CurveTo(7.293188f, 17.940008f, 6.005587f, 16.617956f, 6.0f, 15.0f),
                    PathNode.LineTo(6.005f, 14.824f),
                    PathNode.CurveTo(6.079548f, 13.556362f, 6.944115f, 12.472965f, 8.163616f, 12.119018f),
                    PathNode.CurveTo(9.383118f, 11.76507f, 10.69337f, 12.21725f, 11.435f, 13.248f),
                    PathNode.LineTo(15.005f, 11.82f),
                    PathNode.LineTo(15.02f, 11.65f),
                    PathNode.CurveTo(15.08f, 11.132f, 15.273f, 10.654f, 15.562f, 10.25f),
                    PathNode.LineTo(13.795f, 7.893f),
                    PathNode.CurveTo(12.892483f, 8.139764f, 11.926517f, 7.951763f, 11.182425f, 7.384527f),
                    PathNode.CurveTo(10.438332f, 6.817292f, 10.001146f, 5.935644f, 10.0f, 5.0f),
                    PathNode.LineTo(10.005f, 4.824f),
                    PathNode.CurveTo(10.080399f, 3.534532f, 10.972691f, 2.438085f, 12.219945f, 2.102277f),
                    PathNode.CurveTo(13.4672f, 1.766469f, 14.789377f, 2.266698f, 15.502f, 3.344f),
                    PathNode.LineTo(20.757f, 2.03f),
                    PathNode.CurveTo(21.292713f, 1.89581f, 21.835785f, 2.221293f, 21.97f, 2.757f)
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
        return _chartDots2!!
    }

private var _chartDots2: ImageVector? = null
