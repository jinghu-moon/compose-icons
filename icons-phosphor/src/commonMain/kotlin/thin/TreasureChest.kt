package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.TreasureChest: ImageVector
    get() {
        if (_treasureChest != null) return _treasureChest!!
        _treasureChest = phosphorThinIcon(
            name = "TreasureChest",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(184.0f, 44.0f),
                    PathNode.LineTo(72.0f, 44.0f),
                    PathNode.CurveTo(43.2949f, 44.033066f, 20.033064f, 67.2949f, 20.0f, 96.0f),
                    PathNode.LineTo(20.0f, 192.0f),
                    PathNode.CurveTo(20.0f, 198.62741f, 25.372583f, 204.0f, 32.0f, 204.0f),
                    PathNode.LineTo(224.0f, 204.0f),
                    PathNode.CurveTo(230.62741f, 204.0f, 236.0f, 198.62741f, 236.0f, 192.0f),
                    PathNode.LineTo(236.0f, 96.0f),
                    PathNode.CurveTo(235.96693f, 67.2949f, 212.7051f, 44.033066f, 184.0f, 44.0f),
                    PathNode.Close,
                    PathNode.MoveTo(228.0f, 96.0f),
                    PathNode.LineTo(228.0f, 108.0f),
                    PathNode.LineTo(188.0f, 108.0f),
                    PathNode.LineTo(188.0f, 52.19f),
                    PathNode.CurveTo(210.63995f, 54.285095f, 227.96773f, 73.26334f, 228.0f, 96.0f),
                    PathNode.Close,
                    PathNode.MoveTo(140.0f, 140.0f),
                    PathNode.LineTo(116.0f, 140.0f),
                    PathNode.LineTo(116.0f, 100.0f),
                    PathNode.LineTo(140.0f, 100.0f),
                    PathNode.Close,
                    PathNode.MoveTo(112.0f, 148.0f),
                    PathNode.LineTo(144.0f, 148.0f),
                    PathNode.CurveTo(146.20914f, 148.0f, 148.0f, 146.20914f, 148.0f, 144.0f),
                    PathNode.LineTo(148.0f, 116.0f),
                    PathNode.LineTo(180.0f, 116.0f),
                    PathNode.LineTo(180.0f, 196.0f),
                    PathNode.LineTo(76.0f, 196.0f),
                    PathNode.LineTo(76.0f, 116.0f),
                    PathNode.LineTo(108.0f, 116.0f),
                    PathNode.LineTo(108.0f, 144.0f),
                    PathNode.CurveTo(108.0f, 146.20914f, 109.79086f, 148.0f, 112.0f, 148.0f),
                    PathNode.Close,
                    PathNode.MoveTo(148.0f, 108.0f),
                    PathNode.LineTo(148.0f, 96.0f),
                    PathNode.CurveTo(148.0f, 93.79086f, 146.20914f, 92.0f, 144.0f, 92.0f),
                    PathNode.LineTo(112.0f, 92.0f),
                    PathNode.CurveTo(109.79086f, 92.0f, 108.0f, 93.79086f, 108.0f, 96.0f),
                    PathNode.LineTo(108.0f, 108.0f),
                    PathNode.LineTo(76.0f, 108.0f),
                    PathNode.LineTo(76.0f, 52.0f),
                    PathNode.LineTo(180.0f, 52.0f),
                    PathNode.LineTo(180.0f, 108.0f),
                    PathNode.Close,
                    PathNode.MoveTo(68.0f, 52.19f),
                    PathNode.LineTo(68.0f, 108.0f),
                    PathNode.LineTo(28.0f, 108.0f),
                    PathNode.LineTo(28.0f, 96.0f),
                    PathNode.CurveTo(28.032276f, 73.26334f, 45.360058f, 54.285095f, 68.0f, 52.19f),
                    PathNode.Close,
                    PathNode.MoveTo(28.0f, 192.0f),
                    PathNode.LineTo(28.0f, 116.0f),
                    PathNode.LineTo(68.0f, 116.0f),
                    PathNode.LineTo(68.0f, 196.0f),
                    PathNode.LineTo(32.0f, 196.0f),
                    PathNode.CurveTo(29.790861f, 196.0f, 28.0f, 194.20914f, 28.0f, 192.0f),
                    PathNode.Close,
                    PathNode.MoveTo(224.0f, 196.0f),
                    PathNode.LineTo(188.0f, 196.0f),
                    PathNode.LineTo(188.0f, 116.0f),
                    PathNode.LineTo(228.0f, 116.0f),
                    PathNode.LineTo(228.0f, 192.0f),
                    PathNode.CurveTo(228.0f, 194.20914f, 226.20914f, 196.0f, 224.0f, 196.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 8.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _treasureChest!!
    }

private var _treasureChest: ImageVector? = null
