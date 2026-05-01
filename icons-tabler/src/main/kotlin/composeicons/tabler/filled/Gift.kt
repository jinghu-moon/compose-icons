package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.Gift: ImageVector
    get() {
        if (_gift != null) return _gift!!
        _gift = tablerFilledIcon(
            name = "Gift",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(11.0f, 14.0f),
                    PathNode.LineTo(11.0f, 22.0f),
                    PathNode.LineTo(7.0f, 22.0f),
                    PathNode.CurveTo(5.343146f, 22.0f, 4.0f, 20.656855f, 4.0f, 19.0f),
                    PathNode.LineTo(4.0f, 15.0f),
                    PathNode.CurveTo(4.0f, 14.447715f, 4.447716f, 14.0f, 5.0f, 14.0f),
                    PathNode.LineTo(11.0f, 14.0f),
                    PathNode.Close,
                    PathNode.MoveTo(19.0f, 14.0f),
                    PathNode.CurveTo(19.552284f, 14.0f, 20.0f, 14.447715f, 20.0f, 15.0f),
                    PathNode.LineTo(20.0f, 19.0f),
                    PathNode.CurveTo(20.0f, 20.656855f, 18.656855f, 22.0f, 17.0f, 22.0f),
                    PathNode.LineTo(13.0f, 22.0f),
                    PathNode.LineTo(13.0f, 14.0f),
                    PathNode.LineTo(19.0f, 14.0f),
                    PathNode.Close,
                    PathNode.MoveTo(16.5f, 2.0f),
                    PathNode.CurveTo(17.700245f, 1.999752f, 18.816906f, 2.61454f, 19.458569f, 3.628866f),
                    PathNode.CurveTo(20.100231f, 4.643192f, 20.177391f, 5.91557f, 19.663f, 7.0f),
                    PathNode.LineTo(20.0f, 7.0f),
                    PathNode.CurveTo(21.10457f, 7.0f, 22.0f, 7.895431f, 22.0f, 9.0f),
                    PathNode.LineTo(22.0f, 10.0f),
                    PathNode.CurveTo(22.0f, 11.104569f, 21.10457f, 12.0f, 20.0f, 12.0f),
                    PathNode.LineTo(13.0f, 12.0f),
                    PathNode.LineTo(13.0f, 7.0f),
                    PathNode.LineTo(11.0f, 7.0f),
                    PathNode.LineTo(11.0f, 12.0f),
                    PathNode.LineTo(4.0f, 12.0f),
                    PathNode.CurveTo(2.895431f, 12.0f, 2.0f, 11.104569f, 2.0f, 10.0f),
                    PathNode.LineTo(2.0f, 9.0f),
                    PathNode.CurveTo(2.0f, 7.895431f, 2.895431f, 7.0f, 4.0f, 7.0f),
                    PathNode.LineTo(4.337f, 7.0f),
                    PathNode.CurveTo(4.114438f, 6.53131f, 3.999305f, 6.018849f, 4.0f, 5.5f),
                    PathNode.CurveTo(4.0f, 3.567f, 5.567f, 2.0f, 7.483f, 2.0f),
                    PathNode.CurveTo(9.238f, 1.97f, 10.795f, 3.092f, 11.864f, 4.934f),
                    PathNode.LineTo(12.0f, 5.177f),
                    PathNode.CurveTo(13.033f, 3.263f, 14.56f, 2.063f, 16.291f, 2.002f),
                    PathNode.LineTo(16.5f, 2.0f),
                    PathNode.Close,
                    PathNode.MoveTo(7.5f, 4.0f),
                    PathNode.CurveTo(6.671573f, 4.0f, 6.0f, 4.671573f, 6.0f, 5.5f),
                    PathNode.CurveTo(6.0f, 6.328428f, 6.671573f, 7.0f, 7.5f, 7.0f),
                    PathNode.LineTo(10.643f, 7.0f),
                    PathNode.CurveTo(9.902f, 5.095f, 8.694f, 3.98f, 7.5f, 4.0f),
                    PathNode.Close,
                    PathNode.MoveTo(16.483f, 4.0f),
                    PathNode.CurveTo(15.303f, 3.98f, 14.098f, 5.096f, 13.357f, 7.0f),
                    PathNode.LineTo(16.5f, 7.0f),
                    PathNode.CurveTo(17.328426f, 6.995306f, 17.996195f, 6.319927f, 17.9915f, 5.4915f),
                    PathNode.CurveTo(17.986803f, 4.663073f, 17.311428f, 3.995306f, 16.483f, 4.0f),
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
        return _gift!!
    }

private var _gift: ImageVector? = null
