package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Wallet: ImageVector
    get() {
        if (_wallet != null) return _wallet!!
        _wallet = phosphorLightIcon(
            name = "Wallet",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(216.0f, 66.0f),
                    PathNode.LineTo(56.0f, 66.0f),
                    PathNode.CurveTo(50.477154f, 66.0f, 46.0f, 61.522846f, 46.0f, 56.0f),
                    PathNode.CurveTo(46.0f, 50.477154f, 50.477154f, 46.0f, 56.0f, 46.0f),
                    PathNode.LineTo(192.0f, 46.0f),
                    PathNode.CurveTo(195.3137f, 46.0f, 198.0f, 43.31371f, 198.0f, 40.0f),
                    PathNode.CurveTo(198.0f, 36.68629f, 195.3137f, 34.0f, 192.0f, 34.0f),
                    PathNode.LineTo(56.0f, 34.0f),
                    PathNode.CurveTo(43.849735f, 34.0f, 34.0f, 43.849735f, 34.0f, 56.0f),
                    PathNode.LineTo(34.0f, 184.0f),
                    PathNode.CurveTo(34.0f, 196.15027f, 43.849735f, 206.0f, 56.0f, 206.0f),
                    PathNode.LineTo(216.0f, 206.0f),
                    PathNode.CurveTo(223.73198f, 206.0f, 230.0f, 199.73198f, 230.0f, 192.0f),
                    PathNode.LineTo(230.0f, 80.0f),
                    PathNode.CurveTo(230.0f, 72.26801f, 223.73198f, 66.0f, 216.0f, 66.0f),
                    PathNode.Close,
                    PathNode.MoveTo(218.0f, 192.0f),
                    PathNode.CurveTo(218.0f, 193.10457f, 217.10457f, 194.0f, 216.0f, 194.0f),
                    PathNode.LineTo(56.0f, 194.0f),
                    PathNode.CurveTo(50.477154f, 194.0f, 46.0f, 189.52284f, 46.0f, 184.0f),
                    PathNode.LineTo(46.0f, 75.59f),
                    PathNode.CurveTo(49.093918f, 77.17805f, 52.52233f, 78.004295f, 56.0f, 78.0f),
                    PathNode.LineTo(216.0f, 78.0f),
                    PathNode.CurveTo(217.10457f, 78.0f, 218.0f, 78.89543f, 218.0f, 80.0f),
                    PathNode.Close,
                    PathNode.MoveTo(190.0f, 132.0f),
                    PathNode.CurveTo(190.0f, 137.52284f, 185.52284f, 142.0f, 180.0f, 142.0f),
                    PathNode.CurveTo(174.47716f, 142.0f, 170.0f, 137.52284f, 170.0f, 132.0f),
                    PathNode.CurveTo(170.0f, 126.47715f, 174.47716f, 122.0f, 180.0f, 122.0f),
                    PathNode.CurveTo(185.52284f, 122.0f, 190.0f, 126.47715f, 190.0f, 132.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 12.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _wallet!!
    }

private var _wallet: ImageVector? = null
