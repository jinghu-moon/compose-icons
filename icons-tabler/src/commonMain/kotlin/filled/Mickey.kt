package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.Mickey: ImageVector
    get() {
        if (_mickey != null) return _mickey!!
        _mickey = tablerFilledIcon(
            name = "Mickey",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(18.501f, 2.0f),
                    PathNode.CurveTo(20.814438f, 2.001327f, 22.749949f, 3.756554f, 22.976742f, 6.05885f),
                    PathNode.CurveTo(23.203535f, 8.361145f, 21.647713f, 10.460295f, 19.379f, 10.913f),
                    PathNode.CurveTo(20.617262f, 13.869534f, 19.971273f, 17.279736f, 17.737495f, 19.578566f),
                    PathNode.CurveTo(15.503718f, 21.877396f, 12.113461f, 22.620987f, 9.122608f, 21.46808f),
                    PathNode.CurveTo(6.131757f, 20.315174f, 4.1178f, 17.488382f, 4.005f, 14.285f),
                    PathNode.LineTo(4.0f, 14.0f),
                    PathNode.LineTo(4.005f, 13.715f),
                    PathNode.CurveTo(4.03918f, 12.751211f, 4.247539f, 11.801568f, 4.62f, 10.912f),
                    PathNode.CurveTo(3.258217f, 10.641687f, 2.097449f, 9.757926f, 1.474528f, 8.517164f),
                    PathNode.CurveTo(0.851606f, 7.276403f, 0.836281f, 5.817574f, 1.433f, 4.564f),
                    PathNode.CurveTo(2.108423f, 3.149782f, 3.470292f, 2.188218f, 5.029f, 2.025f),
                    PathNode.LineTo(5.254f, 2.007f),
                    PathNode.LineTo(5.535f, 2.0f),
                    PathNode.LineTo(5.779f, 2.009f),
                    PathNode.CurveTo(8.058022f, 2.150246f, 9.869995f, 3.975975f, 9.994f, 6.256f),
                    PathNode.CurveTo(11.309946f, 5.915092f, 12.691053f, 5.915092f, 14.007f, 6.256f),
                    PathNode.CurveTo(14.136609f, 3.86919f, 16.109673f, 2.000202f, 18.5f, 2.0f),
                    PathNode.Close
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
        return _mickey!!
    }

private var _mickey: ImageVector? = null
