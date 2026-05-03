package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.ChartDonut: ImageVector
    get() {
        if (_chartDonut != null) return _chartDonut!!
        _chartDonut = tablerFilledIcon(
            name = "ChartDonut",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(11.292f, 2.61f),
                    PathNode.CurveTo(11.688f, 2.928f, 11.942f, 3.39f, 11.995f, 3.896f),
                    PathNode.LineTo(12.0f, 4.0f),
                    PathNode.LineTo(12.0f, 8.0f),
                    PathNode.CurveTo(12.000124f, 8.455331f, 11.692636f, 8.853256f, 11.252f, 8.968f),
                    PathNode.CurveTo(9.790223f, 9.34784f, 8.814929f, 10.725845f, 8.942764f, 12.230746f),
                    PathNode.CurveTo(9.070599f, 13.735648f, 10.264352f, 14.929401f, 11.769254f, 15.057236f),
                    PathNode.CurveTo(13.274155f, 15.185071f, 14.65216f, 14.209777f, 15.032f, 12.748f),
                    PathNode.CurveTo(15.146744f, 12.307364f, 15.544669f, 11.999876f, 16.0f, 12.0f),
                    PathNode.LineTo(19.8f, 12.0f),
                    PathNode.CurveTo(20.90457f, 12.0f, 21.8f, 12.895431f, 21.8f, 14.0f),
                    PathNode.CurveTo(21.79996f, 14.076077f, 21.791233f, 14.151901f, 21.774f, 14.226f),
                    PathNode.CurveTo(20.658676f, 19.037092f, 16.198189f, 22.313492f, 11.273741f, 21.938843f),
                    PathNode.CurveTo(6.349293f, 21.564194f, 2.435807f, 17.650707f, 2.061158f, 12.726259f),
                    PathNode.CurveTo(1.686509f, 7.801811f, 4.962909f, 3.341323f, 9.774f, 2.226f),
                    PathNode.LineTo(9.831f, 2.216f),
                    PathNode.LineTo(9.883f, 2.206f),
                    PathNode.CurveTo(10.387797f, 2.146789f, 10.895274f, 2.292297f, 11.292f, 2.61f),
                    PathNode.MoveTo(14.995f, 2.5f),
                    PathNode.LineTo(15.04f, 2.502f),
                    PathNode.LineTo(15.107f, 2.506f),
                    PathNode.LineTo(15.188f, 2.52f),
                    PathNode.LineTo(15.22f, 2.524f),
                    PathNode.LineTo(15.292f, 2.546f),
                    PathNode.LineTo(15.332f, 2.556f),
                    PathNode.CurveTo(18.086514f, 3.525793f, 20.279486f, 5.651183f, 21.335f, 8.374f),
                    PathNode.LineTo(21.443f, 8.668f),
                    PathNode.CurveTo(21.55068f, 8.973939f, 21.503296f, 9.313101f, 21.31589f, 9.577813f),
                    PathNode.CurveTo(21.128485f, 9.842526f, 20.824335f, 9.999909f, 20.5f, 10.0f),
                    PathNode.LineTo(16.0f, 10.0f),
                    PathNode.CurveTo(15.707688f, 10.000019f, 15.430002f, 9.872138f, 15.24f, 9.65f),
                    PathNode.CurveTo(14.967168f, 9.33042f, 14.66958f, 9.032832f, 14.35f, 8.76f),
                    PathNode.CurveTo(14.127862f, 8.569998f, 13.999981f, 8.292312f, 14.0f, 8.0f),
                    PathNode.LineTo(14.0f, 3.5f),
                    PathNode.QuadTo(14.001f, 3.381f, 14.026f, 3.27f),
                    PathNode.LineTo(14.056f, 3.168f),
                    PathNode.CurveTo(14.094363f, 3.059402f, 14.151199f, 2.958249f, 14.224f, 2.869f),
                    PathNode.LineTo(14.254f, 2.836f),
                    PathNode.LineTo(14.293f, 2.793f),
                    PathNode.CurveTo(14.321043f, 2.764581f, 14.350763f, 2.737866f, 14.382f, 2.713f),
                    PathNode.LineTo(14.433f, 2.679f),
                    PathNode.LineTo(14.463f, 2.656f),
                    PathNode.LineTo(14.508f, 2.631f),
                    PathNode.LineTo(14.56f, 2.601f),
                    PathNode.CurveTo(14.695533f, 2.534974f, 14.84424f, 2.500446f, 14.995f, 2.5f)
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
        return _chartDonut!!
    }

private var _chartDonut: ImageVector? = null
