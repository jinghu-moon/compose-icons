package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.FacebookLogo: ImageVector
    get() {
        if (_facebookLogo != null) return _facebookLogo!!
        _facebookLogo = phosphorFillIcon(
            name = "FacebookLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(232.0f, 128.0f),
                    PathNode.CurveTo(231.93239f, 180.5981f, 192.66129f, 224.89232f, 140.45f, 231.26f),
                    PathNode.CurveTo(139.3136f, 231.38869f, 138.17647f, 231.02478f, 137.32591f, 230.26024f),
                    PathNode.CurveTo(136.47536f, 229.4957f, 135.99274f, 228.40364f, 136.0f, 227.26f),
                    PathNode.LineTo(136.0f, 152.0f),
                    PathNode.LineTo(160.0f, 152.0f),
                    PathNode.CurveTo(162.21684f, 152.00487f, 164.3363f, 151.08966f, 165.85281f, 149.47269f),
                    PathNode.CurveTo(167.36931f, 147.85571f, 168.14687f, 145.68199f, 168.0f, 143.47f),
                    PathNode.CurveTo(167.63339f, 139.20233f, 164.033f, 135.94234f, 159.75f, 136.0f),
                    PathNode.LineTo(136.0f, 136.0f),
                    PathNode.LineTo(136.0f, 112.0f),
                    PathNode.CurveTo(136.0f, 103.163445f, 143.16344f, 96.0f, 152.0f, 96.0f),
                    PathNode.LineTo(168.0f, 96.0f),
                    PathNode.CurveTo(170.21684f, 96.00487f, 172.3363f, 95.08966f, 173.85281f, 93.47269f),
                    PathNode.CurveTo(175.36931f, 91.85571f, 176.14687f, 89.68197f, 176.0f, 87.47f),
                    PathNode.CurveTo(175.63287f, 83.194534f, 172.02065f, 79.93174f, 167.73f, 80.0f),
                    PathNode.LineTo(152.0f, 80.0f),
                    PathNode.CurveTo(134.32689f, 80.0f, 120.0f, 94.32689f, 120.0f, 112.0f),
                    PathNode.LineTo(120.0f, 136.0f),
                    PathNode.LineTo(96.0f, 136.0f),
                    PathNode.CurveTo(93.783165f, 135.99513f, 91.6637f, 136.91034f, 90.147194f, 138.52731f),
                    PathNode.CurveTo(88.63069f, 140.14429f, 87.85313f, 142.31801f, 88.0f, 144.53f),
                    PathNode.CurveTo(88.36713f, 148.80547f, 91.97935f, 152.06825f, 96.27f, 152.0f),
                    PathNode.LineTo(120.0f, 152.0f),
                    PathNode.LineTo(120.0f, 227.28f),
                    PathNode.CurveTo(120.00693f, 228.42169f, 119.52566f, 229.51193f, 118.677414f, 230.27612f),
                    PathNode.CurveTo(117.82916f, 231.04031f, 116.694786f, 231.40561f, 115.56f, 231.28f),
                    PathNode.CurveTo(61.850082f, 224.73914f, 22.093884f, 178.16063f, 24.07f, 124.09f),
                    PathNode.CurveTo(26.07f, 70.09f, 69.81f, 26.19f, 123.85f, 24.09f),
                    PathNode.CurveTo(152.11934f, 22.994982f, 179.61723f, 33.45042f, 200.01756f, 53.05096f),
                    PathNode.CurveTo(220.4179f, 72.651505f, 231.96414f, 99.70948f, 232.0f, 128.0f),
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
        return _facebookLogo!!
    }

private var _facebookLogo: ImageVector? = null
