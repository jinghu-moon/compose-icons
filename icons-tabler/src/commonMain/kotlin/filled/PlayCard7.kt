package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.PlayCard7: ImageVector
    get() {
        if (_playCard7 != null) return _playCard7!!
        _playCard7 = tablerFilledIcon(
            name = "PlayCard7",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(17.0f, 2.0f),
                    PathNode.CurveTo(18.656855f, 2.0f, 20.0f, 3.343146f, 20.0f, 5.0f),
                    PathNode.LineTo(20.0f, 19.0f),
                    PathNode.CurveTo(20.0f, 20.656855f, 18.656855f, 22.0f, 17.0f, 22.0f),
                    PathNode.LineTo(7.0f, 22.0f),
                    PathNode.CurveTo(5.343146f, 22.0f, 4.0f, 20.656855f, 4.0f, 19.0f),
                    PathNode.LineTo(4.0f, 5.0f),
                    PathNode.CurveTo(4.0f, 3.343146f, 5.343146f, 2.0f, 7.0f, 2.0f),
                    PathNode.Close,
                    PathNode.MoveTo(17.01f, 18.0f),
                    PathNode.LineTo(17.0f, 18.0f),
                    PathNode.CurveTo(16.447716f, 18.0f, 16.0f, 18.447716f, 16.0f, 19.0f),
                    PathNode.CurveTo(16.0f, 19.552284f, 16.447716f, 20.0f, 17.0f, 20.0f),
                    PathNode.LineTo(17.01f, 20.0f),
                    PathNode.CurveTo(17.562284f, 20.0f, 18.01f, 19.552284f, 18.01f, 19.0f),
                    PathNode.CurveTo(18.01f, 18.447716f, 17.562284f, 18.0f, 17.01f, 18.0f),
                    PathNode.MoveTo(14.0f, 8.0f),
                    PathNode.LineTo(10.0f, 8.0f),
                    PathNode.CurveTo(9.447715f, 8.0f, 9.0f, 8.447715f, 9.0f, 9.0f),
                    PathNode.LineTo(9.007f, 9.117f),
                    PathNode.CurveTo(9.066316f, 9.620493f, 9.493025f, 9.999933f, 10.0f, 10.0f),
                    PathNode.LineTo(12.612f, 10.0f),
                    PathNode.LineTo(11.052f, 14.684f),
                    PathNode.CurveTo(10.929806f, 15.02534f, 11.001933f, 15.406082f, 11.240508f, 15.679078f),
                    PathNode.CurveTo(11.479082f, 15.952075f, 11.846729f, 16.074558f, 12.201363f, 15.999195f),
                    PathNode.CurveTo(12.555996f, 15.92383f, 12.842061f, 15.662423f, 12.949f, 15.316f),
                    PathNode.LineTo(14.949f, 9.316f),
                    PathNode.CurveTo(15.050576f, 9.011027f, 14.999356f, 8.675818f, 14.811342f, 8.415094f),
                    PathNode.CurveTo(14.623328f, 8.154372f, 14.321444f, 7.999923f, 14.0f, 8.0f),
                    PathNode.MoveTo(7.01f, 4.0f),
                    PathNode.LineTo(7.0f, 4.0f),
                    PathNode.CurveTo(6.447716f, 4.0f, 6.0f, 4.447716f, 6.0f, 5.0f),
                    PathNode.CurveTo(6.0f, 5.552285f, 6.447716f, 6.0f, 7.0f, 6.0f),
                    PathNode.LineTo(7.01f, 6.0f),
                    PathNode.CurveTo(7.562285f, 6.0f, 8.01f, 5.552285f, 8.01f, 5.0f),
                    PathNode.CurveTo(8.01f, 4.447716f, 7.562285f, 4.0f, 7.01f, 4.0f)
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
        return _playCard7!!
    }

private var _playCard7: ImageVector? = null
