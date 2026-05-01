package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Onigiri: ImageVector
    get() {
        if (_onigiri != null) return _onigiri!!
        _onigiri = phosphorLightIcon(
            name = "Onigiri",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(229.82f, 147.6f),
                    PathNode.LineTo(174.0f, 51.67f),
                    PathNode.LineTo(173.91f, 51.52f),
                    PathNode.CurveTo(164.05763f, 35.659866f, 146.71118f, 26.014616f, 128.04f, 26.014616f),
                    PathNode.CurveTo(109.36881f, 26.014616f, 92.02238f, 35.659866f, 82.17f, 51.52f),
                    PathNode.LineTo(82.08f, 51.67f),
                    PathNode.LineTo(26.18f, 147.6f),
                    PathNode.CurveTo(15.882021f, 164.25395f, 15.406138f, 185.17763f, 24.936316f, 202.28255f),
                    PathNode.CurveTo(34.46649f, 219.38745f, 52.50934f, 229.99326f, 72.09f, 230.0f),
                    PathNode.LineTo(183.91f, 230.0f),
                    PathNode.CurveTo(203.49066f, 229.99326f, 221.53351f, 219.38745f, 231.06369f, 202.28255f),
                    PathNode.CurveTo(240.59386f, 185.17763f, 240.11798f, 164.25395f, 229.82f, 147.6f),
                    PathNode.Close,
                    PathNode.MoveTo(162.0f, 218.0f),
                    PathNode.LineTo(94.0f, 218.0f),
                    PathNode.LineTo(94.0f, 168.0f),
                    PathNode.CurveTo(94.0f, 166.89543f, 94.89543f, 166.0f, 96.0f, 166.0f),
                    PathNode.LineTo(160.0f, 166.0f),
                    PathNode.CurveTo(161.10457f, 166.0f, 162.0f, 166.89543f, 162.0f, 168.0f),
                    PathNode.Close,
                    PathNode.MoveTo(220.61f, 196.42f),
                    PathNode.CurveTo(213.28444f, 209.82318f, 199.18404f, 218.11436f, 183.91f, 218.0f),
                    PathNode.LineTo(174.0f, 218.0f),
                    PathNode.LineTo(174.0f, 168.0f),
                    PathNode.CurveTo(174.0f, 160.26802f, 167.73198f, 154.0f, 160.0f, 154.0f),
                    PathNode.LineTo(96.0f, 154.0f),
                    PathNode.CurveTo(88.26801f, 154.0f, 82.0f, 160.26802f, 82.0f, 168.0f),
                    PathNode.LineTo(82.0f, 218.0f),
                    PathNode.LineTo(72.09f, 218.0f),
                    PathNode.CurveTo(56.847713f, 217.99477f, 42.804615f, 209.73203f, 35.39737f, 196.41061f),
                    PathNode.CurveTo(27.990124f, 183.0892f, 28.381508f, 166.8003f, 36.42f, 153.85f),
                    PathNode.LineTo(36.5f, 153.71f),
                    PathNode.LineTo(92.37f, 57.78f),
                    PathNode.CurveTo(100.04224f, 45.487118f, 113.50937f, 38.017426f, 128.0f, 38.017426f),
                    PathNode.CurveTo(142.49063f, 38.017426f, 155.95775f, 45.487118f, 163.63f, 57.78f),
                    PathNode.LineTo(219.5f, 153.71f),
                    PathNode.LineTo(219.58f, 153.85f),
                    PathNode.CurveTo(227.73332f, 166.76947f, 228.12521f, 183.12486f, 220.6f, 196.42f),
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
        return _onigiri!!
    }

private var _onigiri: ImageVector? = null
