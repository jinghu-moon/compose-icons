package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.DropletHalf: ImageVector
    get() {
        if (_dropletHalf != null) return _dropletHalf!!
        _dropletHalf = tablerFilledIcon(
            name = "DropletHalf",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(12.0f, 2.0f),
                    PathNode.LineTo(12.07f, 2.003f),
                    PathNode.CurveTo(12.782524f, 2.020593f, 13.450715f, 2.352676f, 13.895f, 2.91f),
                    PathNode.LineTo(14.003f, 3.058f),
                    PathNode.LineTo(18.923f, 10.364f),
                    PathNode.CurveTo(20.875f, 13.631f, 20.114f, 17.784f, 17.127f, 20.2f),
                    PathNode.CurveTo(14.159f, 22.602f, 9.842f, 22.602f, 6.873f, 20.2f),
                    PathNode.CurveTo(3.956f, 17.84f, 3.162f, 13.824f, 4.972f, 10.55f),
                    PathNode.LineTo(5.106f, 10.318f),
                    PathNode.LineTo(9.999f, 3.058f),
                    PathNode.CurveTo(10.184f, 2.783f, 10.425f, 2.549f, 10.708f, 2.372f),
                    PathNode.CurveTo(11.030211f, 2.17012f, 11.395365f, 2.046804f, 11.774f, 2.012f),
                    PathNode.LineTo(12.0f, 2.0f),
                    PathNode.Close,
                    PathNode.MoveTo(11.0f, 5.149f),
                    PathNode.LineTo(6.794f, 11.389f),
                    PathNode.CurveTo(5.354f, 13.799f, 5.914f, 16.852f, 8.131f, 18.646f),
                    PathNode.CurveTo(8.959628f, 19.314358f, 9.948719f, 19.754263f, 11.0f, 19.922f),
                    PathNode.LineTo(11.0f, 5.149f),
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
        return _dropletHalf!!
    }

private var _dropletHalf: ImageVector? = null
