package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.Backspace: ImageVector
    get() {
        if (_backspace != null) return _backspace!!
        _backspace = tablerFilledIcon(
            name = "Backspace",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(20.0f, 5.0f),
                    PathNode.CurveTo(21.046625f, 4.999669f, 21.916504f, 5.806323f, 21.995f, 6.85f),
                    PathNode.LineTo(22.0f, 7.0f),
                    PathNode.LineTo(22.0f, 17.0f),
                    PathNode.CurveTo(22.000332f, 18.046625f, 21.193678f, 18.916504f, 20.15f, 18.995f),
                    PathNode.LineTo(20.0f, 19.0f),
                    PathNode.LineTo(9.0f, 19.0f),
                    PathNode.CurveTo(8.780202f, 19.000017f, 8.56652f, 18.92762f, 8.392f, 18.794f),
                    PathNode.LineTo(8.292f, 18.707f),
                    PathNode.LineTo(3.255f, 13.667f),
                    PathNode.CurveTo(2.446f, 12.763f, 2.408f, 11.417f, 3.172f, 10.437f),
                    PathNode.LineTo(3.292f, 10.293f),
                    PathNode.LineTo(8.292f, 5.293f),
                    PathNode.CurveTo(8.447816f, 5.137384f, 8.650642f, 5.037552f, 8.869f, 5.009f),
                    PathNode.LineTo(9.0f, 5.0f),
                    PathNode.LineTo(20.0f, 5.0f),
                    PathNode.Close,
                    PathNode.MoveTo(12.511f, 9.14f),
                    PathNode.CurveTo(12.097892f, 8.894123f, 11.568286f, 8.976998f, 11.250038f, 9.33732f),
                    PathNode.CurveTo(10.931789f, 9.697643f, 10.914974f, 10.23343f, 11.21f, 10.613f),
                    PathNode.LineTo(11.293f, 10.707f),
                    PathNode.LineTo(12.585f, 12.0f),
                    PathNode.LineTo(11.293f, 13.293f),
                    PathNode.LineTo(11.21f, 13.387f),
                    PathNode.CurveTo(10.901423f, 13.785102f, 10.937099f, 14.350574f, 11.293262f, 14.706738f),
                    PathNode.CurveTo(11.649426f, 15.062901f, 12.214898f, 15.098577f, 12.613f, 14.79f),
                    PathNode.LineTo(12.707f, 14.707f),
                    PathNode.LineTo(14.0f, 13.415f),
                    PathNode.LineTo(15.293f, 14.707f),
                    PathNode.LineTo(15.387f, 14.79f),
                    PathNode.CurveTo(15.785102f, 15.098577f, 16.350574f, 15.062901f, 16.706738f, 14.706738f),
                    PathNode.CurveTo(17.0629f, 14.350574f, 17.098577f, 13.785102f, 16.79f, 13.387f),
                    PathNode.LineTo(16.707f, 13.293f),
                    PathNode.LineTo(15.415f, 12.0f),
                    PathNode.LineTo(16.707f, 10.707f),
                    PathNode.LineTo(16.79f, 10.613f),
                    PathNode.CurveTo(17.098577f, 10.214898f, 17.0629f, 9.649426f, 16.706738f, 9.293262f),
                    PathNode.CurveTo(16.350574f, 8.937099f, 15.785102f, 8.901423f, 15.387f, 9.21f),
                    PathNode.LineTo(15.293f, 9.293f),
                    PathNode.LineTo(14.0f, 10.585f),
                    PathNode.LineTo(12.707f, 9.293f),
                    PathNode.LineTo(12.613f, 9.21f),
                    PathNode.LineTo(12.511f, 9.14f),
                    PathNode.Close
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
        return _backspace!!
    }

private var _backspace: ImageVector? = null
