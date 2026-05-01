package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.EaseOutControlPoint: ImageVector
    get() {
        if (_easeOutControlPoint != null) return _easeOutControlPoint!!
        _easeOutControlPoint = tablerFilledIcon(
            name = "EaseOutControlPoint",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(21.0f, 4.0f),
                    PathNode.CurveTo(21.552284f, 4.0f, 22.0f, 4.447716f, 22.0f, 5.0f),
                    PathNode.CurveTo(22.0f, 5.552285f, 21.552284f, 6.0f, 21.0f, 6.0f),
                    PathNode.CurveTo(19.903f, 6.0f, 18.683f, 6.361f, 17.36f, 7.068f),
                    PathNode.CurveTo(14.987f, 8.333f, 12.402f, 10.63f, 9.753f, 13.658f),
                    PathNode.CurveTo(8.245688f, 15.391715f, 6.827202f, 17.2007f, 5.503f, 19.078f),
                    PathNode.CurveTo(5.162462f, 19.55903f, 4.828101f, 20.044403f, 4.5f, 20.534f),
                    PathNode.LineTo(4.045f, 21.224f),
                    PathNode.QuadTo(3.913f, 21.428f, 3.849f, 21.53f),
                    PathNode.CurveTo(3.556289f, 21.998337f, 2.939338f, 22.14071f, 2.471f, 21.848f),
                    PathNode.CurveTo(2.002662f, 21.555288f, 1.860289f, 20.938337f, 2.153f, 20.47f),
                    PathNode.LineTo(2.439f, 20.025f),
                    PathNode.LineTo(2.612f, 19.761f),
                    PathNode.CurveTo(3.022615f, 19.141623f, 3.442664f, 18.528551f, 3.872f, 17.922f),
                    PathNode.CurveTo(5.235457f, 15.989263f, 6.695997f, 14.126874f, 8.248f, 12.342f),
                    PathNode.CurveTo(11.043f, 9.147f, 13.792f, 6.704f, 16.419f, 5.302f),
                    PathNode.CurveTo(18.011f, 4.454f, 19.541f, 4.0f, 21.0f, 4.0f),
                    PathNode.MoveTo(5.0f, 2.0f),
                    PathNode.CurveTo(6.306f, 2.0f, 7.418f, 2.835f, 7.83f, 4.0f),
                    PathNode.LineTo(9.0f, 4.0f),
                    PathNode.CurveTo(9.552285f, 4.0f, 10.0f, 4.447716f, 10.0f, 5.0f),
                    PathNode.CurveTo(10.0f, 5.552285f, 9.552285f, 6.0f, 9.0f, 6.0f),
                    PathNode.LineTo(7.829f, 6.0f),
                    PathNode.CurveTo(7.320865f, 7.43938f, 5.813213f, 8.268008f, 4.325706f, 7.925459f),
                    PathNode.CurveTo(2.838198f, 7.582912f, 1.844814f, 6.178339f, 2.017403f, 4.661688f),
                    PathNode.CurveTo(2.189992f, 3.145037f, 3.473561f, 1.999572f, 5.0f, 2.0f)
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
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(14.0f, 4.0f),
                    PathNode.CurveTo(14.552285f, 4.0f, 15.0f, 4.447716f, 15.0f, 5.0f),
                    PathNode.CurveTo(15.0f, 5.552285f, 14.552285f, 6.0f, 14.0f, 6.0f),
                    PathNode.LineTo(12.0f, 6.0f),
                    PathNode.CurveTo(11.447715f, 6.0f, 11.0f, 5.552285f, 11.0f, 5.0f),
                    PathNode.CurveTo(11.0f, 4.447716f, 11.447715f, 4.0f, 12.0f, 4.0f),
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
        return _easeOutControlPoint!!
    }

private var _easeOutControlPoint: ImageVector? = null
