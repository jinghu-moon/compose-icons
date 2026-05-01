package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Handbag: ImageVector
    get() {
        if (_handbag != null) return _handbag!!
        _handbag = phosphorThinIcon(
            name = "Handbag",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(235.92f, 198.59f),
                    PathNode.LineTo(221.66f, 78.59f),
                    PathNode.CurveTo(220.94177f, 72.51851f, 215.77368f, 67.957664f, 209.66f, 68.0f),
                    PathNode.LineTo(172.0f, 68.0f),
                    PathNode.LineTo(172.0f, 64.0f),
                    PathNode.CurveTo(172.0f, 39.69947f, 152.30052f, 20.0f, 128.0f, 20.0f),
                    PathNode.CurveTo(103.69947f, 20.0f, 84.0f, 39.69947f, 84.0f, 64.0f),
                    PathNode.LineTo(84.0f, 68.0f),
                    PathNode.LineTo(46.33f, 68.0f),
                    PathNode.CurveTo(40.21632f, 67.957664f, 35.04823f, 72.51851f, 34.33f, 78.59f),
                    PathNode.LineTo(20.07f, 198.59f),
                    PathNode.CurveTo(19.671791f, 201.9816f, 20.737438f, 205.3822f, 23.0f, 207.94f),
                    PathNode.CurveTo(25.305595f, 210.53119f, 28.611578f, 212.00941f, 32.08f, 212.0f),
                    PathNode.LineTo(223.92f, 212.0f),
                    PathNode.CurveTo(227.38145f, 212.0037f, 230.67903f, 210.52597f, 232.98f, 207.94f),
                    PathNode.CurveTo(235.24615f, 205.38387f, 236.3155f, 201.98306f, 235.92f, 198.59f),
                    PathNode.Close,
                    PathNode.MoveTo(92.0f, 64.0f),
                    PathNode.CurveTo(92.0f, 44.11775f, 108.11775f, 28.0f, 128.0f, 28.0f),
                    PathNode.CurveTo(147.88223f, 28.0f, 164.0f, 44.11775f, 164.0f, 64.0f),
                    PathNode.LineTo(164.0f, 68.0f),
                    PathNode.LineTo(92.0f, 68.0f),
                    PathNode.Close,
                    PathNode.MoveTo(227.0f, 202.63f),
                    PathNode.CurveTo(226.2188f, 203.50926f, 225.09615f, 204.00864f, 223.92f, 204.0f),
                    PathNode.LineTo(32.08f, 204.0f),
                    PathNode.CurveTo(30.903856f, 204.00864f, 29.781202f, 203.50926f, 29.0f, 202.63f),
                    PathNode.CurveTo(28.233248f, 201.79439f, 27.868204f, 200.6664f, 28.0f, 199.54f),
                    PathNode.LineTo(42.25f, 79.54f),
                    PathNode.CurveTo(42.48471f, 77.5122f, 44.208706f, 75.986465f, 46.25f, 76.0f),
                    PathNode.LineTo(84.0f, 76.0f),
                    PathNode.LineTo(84.0f, 104.0f),
                    PathNode.CurveTo(84.0f, 106.20914f, 85.79086f, 108.0f, 88.0f, 108.0f),
                    PathNode.CurveTo(90.20914f, 108.0f, 92.0f, 106.20914f, 92.0f, 104.0f),
                    PathNode.LineTo(92.0f, 76.0f),
                    PathNode.LineTo(164.0f, 76.0f),
                    PathNode.LineTo(164.0f, 104.0f),
                    PathNode.CurveTo(164.0f, 106.20914f, 165.79086f, 108.0f, 168.0f, 108.0f),
                    PathNode.CurveTo(170.20914f, 108.0f, 172.0f, 106.20914f, 172.0f, 104.0f),
                    PathNode.LineTo(172.0f, 76.0f),
                    PathNode.LineTo(209.67f, 76.0f),
                    PathNode.CurveTo(211.73032f, 75.96061f, 213.4834f, 77.492935f, 213.72f, 79.54f),
                    PathNode.LineTo(227.97f, 199.54f),
                    PathNode.CurveTo(228.10983f, 200.66191f, 227.75594f, 201.78929f, 227.0f, 202.63f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 8.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _handbag!!
    }

private var _handbag: ImageVector? = null
