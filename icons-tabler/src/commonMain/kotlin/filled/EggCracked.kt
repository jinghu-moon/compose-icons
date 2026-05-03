package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.EggCracked: ImageVector
    get() {
        if (_eggCracked != null) return _eggCracked!!
        _eggCracked = tablerFilledIcon(
            name = "EggCracked",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(11.236f, 2.066f),
                    PathNode.LineTo(9.542f, 7.713f),
                    PathNode.LineTo(9.513f, 7.836f),
                    PathNode.CurveTo(9.45046f, 8.212783f, 9.608004f, 8.592283f, 9.919f, 8.814f),
                    PathNode.LineTo(12.683f, 10.788f),
                    PathNode.LineTo(11.132f, 13.504f),
                    PathNode.CurveTo(10.944541f, 13.814744f, 10.940147f, 14.202658f, 11.120521f, 14.517568f),
                    PathNode.CurveTo(11.300894f, 14.832478f, 11.637719f, 15.024949f, 12.000601f, 15.020471f),
                    PathNode.CurveTo(12.363482f, 15.015991f, 12.695454f, 14.815266f, 12.868f, 14.496f),
                    PathNode.LineTo(14.868f, 10.996f),
                    PathNode.LineTo(14.92f, 10.891f),
                    PathNode.CurveTo(15.103456f, 10.459529f, 14.962512f, 9.958529f, 14.581f, 9.686f),
                    PathNode.LineTo(11.663f, 7.601f),
                    PathNode.LineTo(13.286f, 2.191f),
                    PathNode.CurveTo(16.927f, 3.265f, 20.0f, 8.688f, 20.0f, 14.083f),
                    PathNode.CurveTo(20.0f, 18.673f, 16.727f, 21.793f, 12.0f, 22.0f),
                    PathNode.CurveTo(7.25f, 22.0f, 4.0f, 18.79f, 4.0f, 14.083f),
                    PathNode.CurveTo(4.0f, 8.429f, 7.372f, 2.739f, 11.236f, 2.066f)
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
        return _eggCracked!!
    }

private var _eggCracked: ImageVector? = null
