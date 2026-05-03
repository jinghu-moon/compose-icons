package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.Cardboards: ImageVector
    get() {
        if (_cardboards != null) return _cardboards!!
        _cardboards = tablerFilledIcon(
            name = "Cardboards",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(19.0f, 5.0f),
                    PathNode.CurveTo(20.656855f, 5.0f, 22.0f, 6.343146f, 22.0f, 8.0f),
                    PathNode.LineTo(22.0f, 16.5f),
                    PathNode.CurveTo(22.0f, 18.432997f, 20.432997f, 20.0f, 18.5f, 20.0f),
                    PathNode.LineTo(17.438f, 20.0f),
                    PathNode.CurveTo(16.224318f, 19.997663f, 15.077337f, 19.444405f, 14.32f, 18.496f),
                    PathNode.LineTo(12.78f, 16.576f),
                    PathNode.CurveTo(12.590203f, 16.339428f, 12.303296f, 16.20178f, 12.0f, 16.20178f),
                    PathNode.CurveTo(11.696704f, 16.20178f, 11.409797f, 16.339428f, 11.22f, 16.576f),
                    PathNode.LineTo(9.682f, 18.493f),
                    PathNode.CurveTo(8.924382f, 19.443623f, 7.775593f, 19.998148f, 6.56f, 20.0f),
                    PathNode.LineTo(5.5f, 20.0f),
                    PathNode.CurveTo(3.567004f, 20.0f, 2.0f, 18.432997f, 2.0f, 16.5f),
                    PathNode.LineTo(2.0f, 8.0f),
                    PathNode.CurveTo(2.0f, 6.343146f, 3.343146f, 5.0f, 5.0f, 5.0f),
                    PathNode.Close,
                    PathNode.MoveTo(8.0f, 10.0f),
                    PathNode.CurveTo(6.953376f, 9.999669f, 6.083497f, 10.806323f, 6.005f, 11.85f),
                    PathNode.LineTo(6.0f, 12.0f),
                    PathNode.CurveTo(6.0f, 13.104569f, 6.895431f, 14.0f, 8.0f, 14.0f),
                    PathNode.CurveTo(9.104569f, 14.0f, 10.0f, 13.104569f, 10.0f, 12.0f),
                    PathNode.CurveTo(10.0f, 10.895431f, 9.104569f, 10.0f, 8.0f, 10.0f),
                    PathNode.MoveTo(16.0f, 10.0f),
                    PathNode.CurveTo(14.953375f, 9.999669f, 14.083497f, 10.806323f, 14.005f, 11.85f),
                    PathNode.LineTo(14.0f, 12.0f),
                    PathNode.CurveTo(14.0f, 13.104569f, 14.895431f, 14.0f, 16.0f, 14.0f),
                    PathNode.CurveTo(17.10457f, 14.0f, 18.0f, 13.104569f, 18.0f, 12.0f),
                    PathNode.CurveTo(18.0f, 10.895431f, 17.10457f, 10.0f, 16.0f, 10.0f)
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
        return _cardboards!!
    }

private var _cardboards: ImageVector? = null
