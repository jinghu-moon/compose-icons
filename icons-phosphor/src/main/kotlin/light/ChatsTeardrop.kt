package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.ChatsTeardrop: ImageVector
    get() {
        if (_chatsTeardrop != null) return _chatsTeardrop!!
        _chatsTeardrop = phosphorLightIcon(
            name = "ChatsTeardrop",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(168.16f, 74.42f),
                    PathNode.CurveTo(154.0165f, 39.955616f, 117.47569f, 20.303574f, 80.9245f, 27.503788f),
                    PathNode.CurveTo(44.373314f, 34.704002f, 18.01579f, 66.746376f, 18.0f, 104.0f),
                    PathNode.LineTo(18.0f, 168.0f),
                    PathNode.CurveTo(18.0f, 175.73198f, 24.268015f, 182.0f, 32.0f, 182.0f),
                    PathNode.LineTo(88.0f, 182.0f),
                    PathNode.CurveTo(100.14349f, 211.03972f, 128.52354f, 229.95975f, 160.0f, 230.0f),
                    PathNode.LineTo(224.0f, 230.0f),
                    PathNode.CurveTo(231.73198f, 230.0f, 238.0f, 223.73198f, 238.0f, 216.0f),
                    PathNode.LineTo(238.0f, 152.0f),
                    PathNode.CurveTo(238.0041f, 112.07768f, 207.86325f, 78.59649f, 168.16f, 74.42f),
                    PathNode.Close,
                    PathNode.MoveTo(30.0f, 168.0f),
                    PathNode.LineTo(30.0f, 104.0f),
                    PathNode.CurveTo(30.0f, 67.54921f, 59.549206f, 38.0f, 96.0f, 38.0f),
                    PathNode.CurveTo(132.45079f, 38.0f, 162.0f, 67.54921f, 162.0f, 104.0f),
                    PathNode.CurveTo(162.0f, 140.45079f, 132.45079f, 170.0f, 96.0f, 170.0f),
                    PathNode.LineTo(32.0f, 170.0f),
                    PathNode.CurveTo(30.89543f, 170.0f, 30.0f, 169.10457f, 30.0f, 168.0f),
                    PathNode.Close,
                    PathNode.MoveTo(226.0f, 216.0f),
                    PathNode.CurveTo(226.0f, 217.10457f, 225.10457f, 218.0f, 224.0f, 218.0f),
                    PathNode.LineTo(160.0f, 218.0f),
                    PathNode.CurveTo(135.12598f, 217.97209f, 112.37157f, 203.9887f, 101.11f, 181.81f),
                    PathNode.CurveTo(123.81452f, 180.33255f, 144.73909f, 169.0052f, 158.38939f, 150.80225f),
                    PathNode.CurveTo(172.0397f, 132.59927f, 177.05193f, 109.33936f, 172.11f, 87.13f),
                    PathNode.CurveTo(203.34746f, 92.96059f, 225.99544f, 120.223045f, 226.0f, 152.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 12.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _chatsTeardrop!!
    }

private var _chatsTeardrop: ImageVector? = null
