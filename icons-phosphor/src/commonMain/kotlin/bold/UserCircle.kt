package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.UserCircle: ImageVector
    get() {
        if (_userCircle != null) return _userCircle!!
        _userCircle = phosphorBoldIcon(
            name = "UserCircle",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(128.0f, 20.0f),
                    PathNode.CurveTo(68.35325f, 20.0f, 20.0f, 68.35325f, 20.0f, 128.0f),
                    PathNode.CurveTo(20.0f, 187.64676f, 68.35325f, 236.0f, 128.0f, 236.0f),
                    PathNode.CurveTo(187.64676f, 236.0f, 236.0f, 187.64676f, 236.0f, 128.0f),
                    PathNode.CurveTo(235.93387f, 68.38066f, 187.61934f, 20.066133f, 128.0f, 20.0f),
                    PathNode.Close,
                    PathNode.MoveTo(79.57f, 196.57f),
                    PathNode.CurveTo(90.86871f, 181.12094f, 108.86013f, 171.98941f, 128.0f, 171.98941f),
                    PathNode.CurveTo(147.13986f, 171.98941f, 165.13129f, 181.12094f, 176.43f, 196.57f),
                    PathNode.CurveTo(147.42055f, 217.14285f, 108.579445f, 217.14285f, 79.57f, 196.57f),
                    PathNode.Close,
                    PathNode.MoveTo(100.0f, 120.0f),
                    PathNode.CurveTo(100.0f, 104.536026f, 112.536026f, 92.0f, 128.0f, 92.0f),
                    PathNode.CurveTo(143.46397f, 92.0f, 156.0f, 104.536026f, 156.0f, 120.0f),
                    PathNode.CurveTo(156.0f, 135.46397f, 143.46397f, 148.0f, 128.0f, 148.0f),
                    PathNode.CurveTo(112.536026f, 148.0f, 100.0f, 135.46397f, 100.0f, 120.0f),
                    PathNode.Close,
                    PathNode.MoveTo(194.0f, 179.94f),
                    PathNode.CurveTo(186.2221f, 170.04733f, 176.30832f, 162.04109f, 165.0f, 156.52f),
                    PathNode.CurveTo(185.11942f, 136.146f, 184.9819f, 103.34045f, 164.69241f, 83.13582f),
                    PathNode.CurveTo(144.40292f, 62.93119f, 111.59708f, 62.93119f, 91.30759f, 83.13582f),
                    PathNode.CurveTo(71.0181f, 103.34045f, 70.88059f, 136.146f, 91.0f, 156.52f),
                    PathNode.CurveTo(79.69168f, 162.04109f, 69.777885f, 170.04733f, 62.0f, 179.94f),
                    PathNode.CurveTo(34.846165f, 145.51816f, 38.73256f, 96.00199f, 70.92416f, 66.238014f),
                    PathNode.CurveTo(103.115776f, 36.474037f, 152.78423f, 36.474037f, 184.97583f, 66.238014f),
                    PathNode.CurveTo(217.16745f, 96.00199f, 221.05383f, 145.51816f, 193.9f, 179.94f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 24.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _userCircle!!
    }

private var _userCircle: ImageVector? = null
