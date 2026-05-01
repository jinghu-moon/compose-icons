package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.TreasureChest: ImageVector
    get() {
        if (_treasureChest != null) return _treasureChest!!
        _treasureChest = phosphorFillIcon(
            name = "TreasureChest",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(240.0f, 124.0f),
                    PathNode.LineTo(240.0f, 192.0f),
                    PathNode.CurveTo(240.0f, 200.83656f, 232.83656f, 208.0f, 224.0f, 208.0f),
                    PathNode.LineTo(32.0f, 208.0f),
                    PathNode.CurveTo(23.163445f, 208.0f, 16.0f, 200.83656f, 16.0f, 192.0f),
                    PathNode.LineTo(16.0f, 124.0f),
                    PathNode.CurveTo(16.0f, 121.79086f, 17.790861f, 120.0f, 20.0f, 120.0f),
                    PathNode.LineTo(56.0f, 120.0f),
                    PathNode.LineTo(56.0f, 184.0f),
                    PathNode.CurveTo(55.99513f, 186.21684f, 56.910343f, 188.3363f, 58.527313f, 189.85281f),
                    PathNode.CurveTo(60.144287f, 191.36931f, 62.31803f, 192.14687f, 64.53f, 192.0f),
                    PathNode.CurveTo(68.805466f, 191.63287f, 72.06826f, 188.02065f, 72.0f, 183.73f),
                    PathNode.LineTo(72.0f, 120.0f),
                    PathNode.LineTo(112.0f, 120.0f),
                    PathNode.LineTo(112.0f, 140.0f),
                    PathNode.CurveTo(112.0f, 142.20914f, 113.79086f, 144.0f, 116.0f, 144.0f),
                    PathNode.LineTo(140.0f, 144.0f),
                    PathNode.CurveTo(142.20914f, 144.0f, 144.0f, 142.20914f, 144.0f, 140.0f),
                    PathNode.LineTo(144.0f, 120.0f),
                    PathNode.LineTo(184.0f, 120.0f),
                    PathNode.LineTo(184.0f, 184.0f),
                    PathNode.CurveTo(183.99513f, 186.21684f, 184.91034f, 188.3363f, 186.52731f, 189.85281f),
                    PathNode.CurveTo(188.14429f, 191.36931f, 190.31801f, 192.14687f, 192.53f, 192.0f),
                    PathNode.CurveTo(196.79767f, 191.63339f, 200.05766f, 188.033f, 200.0f, 183.75f),
                    PathNode.LineTo(200.0f, 120.0f),
                    PathNode.LineTo(236.0f, 120.0f),
                    PathNode.CurveTo(238.20914f, 120.0f, 240.0f, 121.79086f, 240.0f, 124.0f),
                    PathNode.Close,
                    PathNode.MoveTo(184.0f, 40.0f),
                    PathNode.LineTo(72.0f, 40.0f),
                    PathNode.CurveTo(41.072056f, 40.0f, 16.0f, 65.07205f, 16.0f, 96.0f),
                    PathNode.LineTo(16.0f, 100.0f),
                    PathNode.CurveTo(16.0f, 102.20914f, 17.790861f, 104.0f, 20.0f, 104.0f),
                    PathNode.LineTo(56.0f, 104.0f),
                    PathNode.LineTo(56.0f, 64.27f),
                    PathNode.CurveTo(55.931744f, 59.979347f, 59.19454f, 56.367123f, 63.47f, 56.0f),
                    PathNode.CurveTo(65.68197f, 55.85313f, 67.85571f, 56.630688f, 69.47269f, 58.14719f),
                    PathNode.CurveTo(71.08966f, 59.663696f, 72.00487f, 61.783165f, 72.0f, 64.0f),
                    PathNode.LineTo(72.0f, 104.0f),
                    PathNode.LineTo(112.0f, 104.0f),
                    PathNode.LineTo(112.0f, 92.0f),
                    PathNode.CurveTo(112.0f, 89.79086f, 113.79086f, 88.0f, 116.0f, 88.0f),
                    PathNode.LineTo(140.0f, 88.0f),
                    PathNode.CurveTo(142.20914f, 88.0f, 144.0f, 89.79086f, 144.0f, 92.0f),
                    PathNode.LineTo(144.0f, 104.0f),
                    PathNode.LineTo(184.0f, 104.0f),
                    PathNode.LineTo(184.0f, 64.27f),
                    PathNode.CurveTo(183.93175f, 59.979347f, 187.19453f, 56.367123f, 191.47f, 56.0f),
                    PathNode.CurveTo(193.68199f, 55.85313f, 195.85571f, 56.630688f, 197.47269f, 58.14719f),
                    PathNode.CurveTo(199.08966f, 59.663696f, 200.00487f, 61.783165f, 200.0f, 64.0f),
                    PathNode.LineTo(200.0f, 104.0f),
                    PathNode.LineTo(236.0f, 104.0f),
                    PathNode.CurveTo(238.20914f, 104.0f, 240.0f, 102.20914f, 240.0f, 100.0f),
                    PathNode.LineTo(240.0f, 96.0f),
                    PathNode.CurveTo(240.0f, 65.07205f, 214.92795f, 40.0f, 184.0f, 40.0f),
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
        return _treasureChest!!
    }

private var _treasureChest: ImageVector? = null
