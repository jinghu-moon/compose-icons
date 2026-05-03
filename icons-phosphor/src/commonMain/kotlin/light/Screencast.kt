package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Screencast: ImageVector
    get() {
        if (_screencast != null) return _screencast!!
        _screencast = phosphorLightIcon(
            name = "Screencast",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(230.0f, 56.0f),
                    PathNode.LineTo(230.0f, 200.0f),
                    PathNode.CurveTo(230.0f, 207.73198f, 223.73198f, 214.0f, 216.0f, 214.0f),
                    PathNode.LineTo(144.0f, 214.0f),
                    PathNode.CurveTo(140.6863f, 214.0f, 138.0f, 211.3137f, 138.0f, 208.0f),
                    PathNode.CurveTo(138.0f, 204.6863f, 140.6863f, 202.0f, 144.0f, 202.0f),
                    PathNode.LineTo(216.0f, 202.0f),
                    PathNode.CurveTo(217.10457f, 202.0f, 218.0f, 201.10457f, 218.0f, 200.0f),
                    PathNode.LineTo(218.0f, 56.0f),
                    PathNode.CurveTo(218.0f, 54.89543f, 217.10457f, 54.0f, 216.0f, 54.0f),
                    PathNode.LineTo(40.0f, 54.0f),
                    PathNode.CurveTo(38.89543f, 54.0f, 38.0f, 54.89543f, 38.0f, 56.0f),
                    PathNode.LineTo(38.0f, 96.0f),
                    PathNode.CurveTo(38.0f, 99.313705f, 35.31371f, 102.0f, 32.0f, 102.0f),
                    PathNode.CurveTo(28.68629f, 102.0f, 26.0f, 99.313705f, 26.0f, 96.0f),
                    PathNode.LineTo(26.0f, 56.0f),
                    PathNode.CurveTo(26.0f, 48.268013f, 32.268013f, 42.0f, 40.0f, 42.0f),
                    PathNode.LineTo(216.0f, 42.0f),
                    PathNode.CurveTo(223.73198f, 42.0f, 230.0f, 48.268013f, 230.0f, 56.0f),
                    PathNode.Close,
                    PathNode.MoveTo(32.0f, 186.0f),
                    PathNode.CurveTo(28.68629f, 186.0f, 26.0f, 188.6863f, 26.0f, 192.0f),
                    PathNode.CurveTo(26.0f, 195.3137f, 28.68629f, 198.0f, 32.0f, 198.0f),
                    PathNode.CurveTo(37.522846f, 198.0f, 42.0f, 202.47716f, 42.0f, 208.0f),
                    PathNode.CurveTo(42.0f, 211.3137f, 44.68629f, 214.0f, 48.0f, 214.0f),
                    PathNode.CurveTo(51.31371f, 214.0f, 54.0f, 211.3137f, 54.0f, 208.0f),
                    PathNode.CurveTo(54.0f, 195.84973f, 44.150265f, 186.0f, 32.0f, 186.0f),
                    PathNode.Close,
                    PathNode.MoveTo(32.0f, 154.0f),
                    PathNode.CurveTo(28.68629f, 154.0f, 26.0f, 156.6863f, 26.0f, 160.0f),
                    PathNode.CurveTo(26.0f, 163.3137f, 28.68629f, 166.0f, 32.0f, 166.0f),
                    PathNode.CurveTo(55.19596f, 166.0f, 74.0f, 184.80405f, 74.0f, 208.0f),
                    PathNode.CurveTo(74.0f, 211.3137f, 76.686295f, 214.0f, 80.0f, 214.0f),
                    PathNode.CurveTo(83.313705f, 214.0f, 86.0f, 211.3137f, 86.0f, 208.0f),
                    PathNode.CurveTo(85.966934f, 178.19034f, 61.80967f, 154.03307f, 32.0f, 154.0f),
                    PathNode.Close,
                    PathNode.MoveTo(32.0f, 122.0f),
                    PathNode.CurveTo(28.68629f, 122.0f, 26.0f, 124.686295f, 26.0f, 128.0f),
                    PathNode.CurveTo(26.0f, 131.3137f, 28.68629f, 134.0f, 32.0f, 134.0f),
                    PathNode.CurveTo(72.84851f, 134.04959f, 105.95041f, 167.15149f, 106.0f, 208.0f),
                    PathNode.CurveTo(106.0f, 211.3137f, 108.686295f, 214.0f, 112.0f, 214.0f),
                    PathNode.CurveTo(115.313705f, 214.0f, 118.0f, 211.3137f, 118.0f, 208.0f),
                    PathNode.CurveTo(117.94489f, 160.52635f, 79.47364f, 122.05511f, 32.0f, 122.0f),
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
        return _screencast!!
    }

private var _screencast: ImageVector? = null
