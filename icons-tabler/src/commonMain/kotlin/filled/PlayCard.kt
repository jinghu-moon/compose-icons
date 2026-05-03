package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.PlayCard: ImageVector
    get() {
        if (_playCard != null) return _playCard!!
        _playCard = tablerFilledIcon(
            name = "PlayCard",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(17.0f, 2.0f),
                    PathNode.CurveTo(18.616941f, 1.999152f, 19.942633f, 3.281907f, 19.995f, 4.898f),
                    PathNode.QuadTo(20.0f, 4.948f, 20.0f, 5.0f),
                    PathNode.LineTo(20.0f, 19.0f),
                    PathNode.CurveTo(20.0f, 20.656855f, 18.656855f, 22.0f, 17.0f, 22.0f),
                    PathNode.LineTo(7.0f, 22.0f),
                    PathNode.CurveTo(5.343146f, 22.0f, 4.0f, 20.656855f, 4.0f, 19.0f),
                    PathNode.LineTo(4.0f, 5.0f),
                    PathNode.CurveTo(4.0f, 3.343146f, 5.343146f, 2.0f, 7.0f, 2.0f),
                    PathNode.Close,
                    PathNode.MoveTo(16.01f, 17.0f),
                    PathNode.LineTo(16.0f, 17.0f),
                    PathNode.CurveTo(15.447715f, 17.0f, 15.0f, 17.447716f, 15.0f, 18.0f),
                    PathNode.CurveTo(15.0f, 18.552284f, 15.447715f, 19.0f, 16.0f, 19.0f),
                    PathNode.LineTo(16.01f, 19.0f),
                    PathNode.CurveTo(16.562284f, 19.0f, 17.01f, 18.552284f, 17.01f, 18.0f),
                    PathNode.CurveTo(17.01f, 17.447716f, 16.562284f, 17.0f, 16.01f, 17.0f),
                    PathNode.MoveTo(12.8f, 7.4f),
                    PathNode.CurveTo(12.611146f, 7.148195f, 12.314757f, 7.0f, 12.0f, 7.0f),
                    PathNode.CurveTo(11.685243f, 7.0f, 11.388854f, 7.148195f, 11.2f, 7.4f),
                    PathNode.LineTo(8.2f, 11.4f),
                    PathNode.CurveTo(7.933334f, 11.755555f, 7.933334f, 12.244445f, 8.2f, 12.6f),
                    PathNode.LineTo(11.188f, 16.584f),
                    PathNode.LineTo(11.2f, 16.6f),
                    PathNode.QuadTo(11.207f, 16.61f, 11.217f, 16.62f),
                    PathNode.CurveTo(11.239261f, 16.651543f, 11.2651f, 16.680403f, 11.294f, 16.706f),
                    PathNode.LineTo(11.31f, 16.724f),
                    PathNode.LineTo(11.328f, 16.74f),
                    PathNode.QuadTo(11.353f, 16.764f, 11.38f, 16.783f),
                    PathNode.LineTo(11.405f, 16.803f),
                    PathNode.CurveTo(11.431039f, 16.824453f, 11.459183f, 16.843216f, 11.489f, 16.859f),
                    PathNode.LineTo(11.545f, 16.889f),
                    PathNode.QuadTo(11.561f, 16.899f, 11.578f, 16.907f),
                    PathNode.LineTo(11.621f, 16.924f),
                    PathNode.CurveTo(11.644681f, 16.935757f, 11.669469f, 16.945135f, 11.695f, 16.952f),
                    PathNode.CurveTo(11.793202f, 16.98511f, 11.896385f, 17.00101f, 12.0f, 16.999f),
                    PathNode.LineTo(12.047f, 16.999f),
                    PathNode.CurveTo(12.078808f, 16.997183f, 12.110511f, 16.993843f, 12.142f, 16.989f),
                    PathNode.CurveTo(12.19727f, 16.981237f, 12.251795f, 16.96886f, 12.305f, 16.952f),
                    PathNode.LineTo(12.33f, 16.944f),
                    PathNode.LineTo(12.379f, 16.924f),
                    PathNode.CurveTo(12.40579f, 16.916254f, 12.43137f, 16.90481f, 12.455f, 16.89f),
                    PathNode.CurveTo(12.483027f, 16.877165f, 12.509809f, 16.861767f, 12.535f, 16.844f),
                    PathNode.CurveTo(12.564355f, 16.82549f, 12.592727f, 16.805462f, 12.62f, 16.784f),
                    PathNode.CurveTo(12.651598f, 16.761427f, 12.68046f, 16.73525f, 12.706f, 16.706f),
                    PathNode.LineTo(12.724f, 16.69f),
                    PathNode.LineTo(12.74f, 16.672f),
                    PathNode.LineTo(12.783f, 16.62f),
                    PathNode.LineTo(12.8f, 16.6f),
                    PathNode.LineTo(12.809f, 16.588f),
                    PathNode.LineTo(15.8f, 12.6f),
                    PathNode.CurveTo(16.066668f, 12.244445f, 16.066668f, 11.755555f, 15.8f, 11.4f),
                    PathNode.Close,
                    PathNode.MoveTo(8.01f, 5.0f),
                    PathNode.LineTo(8.0f, 5.0f),
                    PathNode.CurveTo(7.447716f, 5.0f, 7.0f, 5.447716f, 7.0f, 6.0f),
                    PathNode.CurveTo(7.0f, 6.552285f, 7.447716f, 7.0f, 8.0f, 7.0f),
                    PathNode.LineTo(8.01f, 7.0f),
                    PathNode.CurveTo(8.562284f, 7.0f, 9.01f, 6.552285f, 9.01f, 6.0f),
                    PathNode.CurveTo(9.01f, 5.447716f, 8.562284f, 5.0f, 8.01f, 5.0f)
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
        return _playCard!!
    }

private var _playCard: ImageVector? = null
