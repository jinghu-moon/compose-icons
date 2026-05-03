package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.Lego: ImageVector
    get() {
        if (_lego != null) return _lego!!
        _lego = tablerFilledIcon(
            name = "Lego",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(16.0f, 2.0f),
                    PathNode.CurveTo(16.552284f, 2.0f, 17.0f, 2.447715f, 17.0f, 3.0f),
                    PathNode.LineTo(17.0f, 4.0f),
                    PathNode.LineTo(17.2f, 4.005f),
                    PathNode.CurveTo(19.251867f, 4.107721f, 20.89228f, 5.748133f, 20.995f, 7.8f),
                    PathNode.LineTo(21.0f, 8.0f),
                    PathNode.LineTo(21.0f, 17.0f),
                    PathNode.CurveTo(21.000168f, 18.764408f, 19.844252f, 20.320528f, 18.155f, 20.83f),
                    PathNode.LineTo(18.0f, 20.873f),
                    PathNode.LineTo(18.0f, 21.0f),
                    PathNode.CurveTo(17.999933f, 21.506975f, 17.620493f, 21.933683f, 17.117f, 21.993f),
                    PathNode.LineTo(17.0f, 22.0f),
                    PathNode.LineTo(7.0f, 22.0f),
                    PathNode.CurveTo(6.447716f, 22.0f, 6.0f, 21.552284f, 6.0f, 21.0f),
                    PathNode.LineTo(6.0f, 20.873f),
                    PathNode.LineTo(5.845f, 20.831f),
                    PathNode.CurveTo(4.225976f, 20.342676f, 3.088961f, 18.888977f, 3.005f, 17.2f),
                    PathNode.LineTo(3.0f, 17.0f),
                    PathNode.LineTo(3.0f, 8.0f),
                    PathNode.CurveTo(3.0f, 5.790861f, 4.790861f, 4.0f, 7.0f, 4.0f),
                    PathNode.LineTo(7.0f, 3.0f),
                    PathNode.CurveTo(7.0f, 2.447715f, 7.447716f, 2.0f, 8.0f, 2.0f),
                    PathNode.Close,
                    PathNode.MoveTo(15.2f, 14.286f),
                    PathNode.CurveTo(14.805646f, 13.899457f, 14.172624f, 13.905725f, 13.786f, 14.3f),
                    PathNode.CurveTo(13.315757f, 14.780097f, 12.672028f, 15.050656f, 12.0f, 15.050656f),
                    PathNode.CurveTo(11.327972f, 15.050656f, 10.684243f, 14.780097f, 10.214f, 14.3f),
                    PathNode.CurveTo(9.825724f, 13.915112f, 9.200322f, 13.913386f, 8.809928f, 14.296126f),
                    PathNode.CurveTo(8.419534f, 14.678865f, 8.408875f, 15.304179f, 8.786f, 15.7f),
                    PathNode.CurveTo(9.63238f, 16.563675f, 10.790747f, 17.050364f, 12.0f, 17.050364f),
                    PathNode.CurveTo(13.209253f, 17.050364f, 14.36762f, 16.563675f, 15.214f, 15.7f),
                    PathNode.CurveTo(15.600543f, 15.305646f, 15.594275f, 14.672624f, 15.2f, 14.286f),
                    PathNode.MoveTo(9.51f, 10.0f),
                    PathNode.LineTo(9.5f, 10.0f),
                    PathNode.CurveTo(8.947715f, 10.0f, 8.5f, 10.447715f, 8.5f, 11.0f),
                    PathNode.CurveTo(8.5f, 11.552285f, 8.947715f, 12.0f, 9.5f, 12.0f),
                    PathNode.LineTo(9.51f, 12.0f),
                    PathNode.CurveTo(10.062284f, 12.0f, 10.51f, 11.552285f, 10.51f, 11.0f),
                    PathNode.CurveTo(10.51f, 10.447715f, 10.062284f, 10.0f, 9.51f, 10.0f),
                    PathNode.MoveTo(14.51f, 10.0f),
                    PathNode.LineTo(14.5f, 10.0f),
                    PathNode.CurveTo(13.947715f, 10.0f, 13.5f, 10.447715f, 13.5f, 11.0f),
                    PathNode.CurveTo(13.5f, 11.552285f, 13.947715f, 12.0f, 14.5f, 12.0f),
                    PathNode.LineTo(14.51f, 12.0f),
                    PathNode.CurveTo(15.062284f, 12.0f, 15.51f, 11.552285f, 15.51f, 11.0f),
                    PathNode.CurveTo(15.51f, 10.447715f, 15.062284f, 10.0f, 14.51f, 10.0f)
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
        return _lego!!
    }

private var _lego: ImageVector? = null
