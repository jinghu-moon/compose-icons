package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.SignOut: ImageVector
    get() {
        if (_signOut != null) return _signOut!!
        _signOut = phosphorBoldIcon(
            name = "SignOut",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(124.0f, 216.0f),
                    PathNode.CurveTo(124.0f, 222.62741f, 118.62742f, 228.0f, 112.0f, 228.0f),
                    PathNode.LineTo(48.0f, 228.0f),
                    PathNode.CurveTo(41.37258f, 228.0f, 36.0f, 222.62741f, 36.0f, 216.0f),
                    PathNode.LineTo(36.0f, 40.0f),
                    PathNode.CurveTo(36.0f, 33.37258f, 41.37258f, 28.0f, 48.0f, 28.0f),
                    PathNode.LineTo(112.0f, 28.0f),
                    PathNode.CurveTo(118.62742f, 28.0f, 124.0f, 33.37258f, 124.0f, 40.0f),
                    PathNode.CurveTo(124.0f, 46.62742f, 118.62742f, 52.0f, 112.0f, 52.0f),
                    PathNode.LineTo(60.0f, 52.0f),
                    PathNode.LineTo(60.0f, 204.0f),
                    PathNode.LineTo(112.0f, 204.0f),
                    PathNode.CurveTo(118.62742f, 204.0f, 124.0f, 209.37259f, 124.0f, 216.0f),
                    PathNode.Close,
                    PathNode.MoveTo(232.49f, 119.51f),
                    PathNode.LineTo(192.49f, 79.51f),
                    PathNode.CurveTo(187.79558f, 74.81558f, 180.18442f, 74.81558f, 175.49f, 79.51f),
                    PathNode.CurveTo(170.79558f, 84.20442f, 170.79558f, 91.81558f, 175.49f, 96.51f),
                    PathNode.LineTo(195.0f, 116.0f),
                    PathNode.LineTo(112.0f, 116.0f),
                    PathNode.CurveTo(105.37258f, 116.0f, 100.0f, 121.37258f, 100.0f, 128.0f),
                    PathNode.CurveTo(100.0f, 134.62741f, 105.37258f, 140.0f, 112.0f, 140.0f),
                    PathNode.LineTo(195.0f, 140.0f),
                    PathNode.LineTo(175.48f, 159.51f),
                    PathNode.CurveTo(170.78558f, 164.20442f, 170.78558f, 171.81558f, 175.48f, 176.51f),
                    PathNode.CurveTo(180.17442f, 181.20442f, 187.78558f, 181.20442f, 192.48f, 176.51f),
                    PathNode.LineTo(232.48f, 136.51f),
                    PathNode.CurveTo(234.74078f, 134.2597f, 236.01259f, 131.20189f, 236.01447f, 128.01207f),
                    PathNode.CurveTo(236.01634f, 124.82226f, 234.74812f, 121.762955f, 232.49f, 119.51f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 24.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _signOut!!
    }

private var _signOut: ImageVector? = null
