package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.GuitarPick: ImageVector
    get() {
        if (_guitarPick != null) return _guitarPick!!
        _guitarPick = tablerFilledIcon(
            name = "GuitarPick",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(12.0f, 2.0f),
                    PathNode.CurveTo(10.387f, 2.0f, 9.118f, 2.104f, 8.175f, 2.323f),
                    PathNode.LineTo(7.945f, 2.38f),
                    PathNode.CurveTo(4.926f, 3.088f, 3.0f, 4.883f, 3.0f, 8.0f),
                    PathNode.CurveTo(3.0f, 11.367f, 4.939f, 16.274f, 7.22f, 19.125f),
                    PathNode.CurveTo(7.54f, 19.525f, 7.884f, 19.911f, 8.25f, 20.283f),
                    PathNode.LineTo(8.617f, 20.643f),
                    PathNode.CurveTo(10.506413f, 22.442163f, 13.473735f, 22.446997f, 15.369f, 20.654f),
                    PathNode.CurveTo(15.873685f, 20.177805f, 16.34481f, 19.66725f, 16.779f, 19.126f),
                    PathNode.CurveTo(19.27f, 16.013f, 21.0f, 11.832f, 21.0f, 8.0f),
                    PathNode.CurveTo(21.0f, 4.975f, 19.187f, 3.194f, 16.29f, 2.438f),
                    PathNode.LineTo(16.024f, 2.372f),
                    PathNode.CurveTo(15.088f, 2.122f, 13.743f, 2.0f, 12.0f, 2.0f),
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
        return _guitarPick!!
    }

private var _guitarPick: ImageVector? = null
