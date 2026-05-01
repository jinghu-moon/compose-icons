package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.ShieldCheckered: ImageVector
    get() {
        if (_shieldCheckered != null) return _shieldCheckered!!
        _shieldCheckered = tablerFilledIcon(
            name = "ShieldCheckered",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(11.013f, 12.0f),
                    PathNode.LineTo(11.013f, 21.754f),
                    PathNode.CurveTo(6.557765f, 20.312746f, 3.221877f, 16.586851f, 2.28f, 12.0f),
                    PathNode.LineTo(11.014f, 12.0f),
                    PathNode.Close,
                    PathNode.MoveTo(20.297f, 15.794f),
                    PathNode.CurveTo(18.697124f, 18.617098f, 16.099297f, 20.739805f, 13.014f, 21.745f),
                    PathNode.LineTo(13.013f, 12.0f),
                    PathNode.LineTo(21.721f, 12.0f),
                    PathNode.CurveTo(21.448215f, 13.331512f, 20.967676f, 14.611828f, 20.297f, 15.794f),
                    PathNode.Close,
                    PathNode.MoveTo(11.014f, 2.526f),
                    PathNode.LineTo(11.013f, 10.0f),
                    PathNode.LineTo(2.027f, 10.0f),
                    PathNode.CurveTo(1.959f, 8.568f, 2.128f, 7.12f, 2.541f, 5.718f),
                    PathNode.CurveTo(2.67088f, 5.276058f, 3.085847f, 4.980007f, 3.546f, 5.001f),
                    PathNode.CurveTo(6.134208f, 5.119462f, 8.681166f, 4.320527f, 10.738f, 2.745f),
                    PathNode.LineTo(11.014f, 2.526f),
                    PathNode.Close,
                    PathNode.MoveTo(13.013f, 10.0f),
                    PathNode.LineTo(13.013f, 2.547f),
                    PathNode.LineTo(12.923f, 2.474f),
                    PathNode.CurveTo(14.94031f, 4.149565f, 17.489864f, 5.049303f, 20.112f, 5.011f),
                    PathNode.LineTo(20.454f, 5.001f),
                    PathNode.CurveTo(20.914154f, 4.980007f, 21.32912f, 5.276058f, 21.459f, 5.718f),
                    PathNode.CurveTo(21.872f, 7.121f, 22.041f, 8.568f, 21.973f, 10.0f),
                    PathNode.LineTo(13.013f, 10.0f),
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
        return _shieldCheckered!!
    }

private var _shieldCheckered: ImageVector? = null
