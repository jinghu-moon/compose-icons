package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.Flame: ImageVector
    get() {
        if (_flame != null) return _flame!!
        _flame = tablerFilledIcon(
            name = "Flame",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(10.0f, 2.0f),
                    PathNode.CurveTo(10.0f, 1.12f, 11.056f, 0.669f, 11.692f, 1.278f),
                    PathNode.CurveTo(13.65f, 3.154f, 14.788f, 7.273f, 13.442f, 10.398f),
                    PathNode.LineTo(13.362f, 10.572f),
                    PathNode.LineTo(13.374f, 10.575f),
                    PathNode.CurveTo(13.999f, 10.708f, 14.577f, 10.145f, 15.677f, 8.402f),
                    PathNode.LineTo(15.817f, 8.178001f),
                    PathNode.CurveTo(15.981463f, 7.913263f, 16.259954f, 7.740342f, 16.57017f, 7.71034f),
                    PathNode.CurveTo(16.880384f, 7.680338f, 17.186852f, 7.796686f, 17.399f, 8.025f),
                    PathNode.CurveTo(18.733f, 9.46f, 20.0f, 12.402f, 20.0f, 14.295f),
                    PathNode.CurveTo(20.0f, 18.56f, 16.409f, 22.0f, 12.0f, 22.0f),
                    PathNode.CurveTo(7.591f, 22.0f, 4.0f, 18.56f, 4.0f, 14.294f),
                    PathNode.CurveTo(4.0f, 12.042f, 5.022f, 9.578f, 6.632f, 7.993f),
                    PathNode.LineTo(7.237f, 7.404f),
                    PathNode.CurveTo(7.478f, 7.168f, 7.671f, 6.974f, 7.855f, 6.78f),
                    PathNode.CurveTo(9.285f, 5.268f, 10.0f, 3.856f, 10.0f, 2.0f)
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
        return _flame!!
    }

private var _flame: ImageVector? = null
