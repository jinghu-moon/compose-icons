package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.AndroidLogo: ImageVector
    get() {
        if (_androidLogo != null) return _androidLogo!!
        _androidLogo = phosphorRegularIcon(
            name = "AndroidLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(176.0f, 148.0f),
                    PathNode.CurveTo(176.0f, 154.62741f, 170.62741f, 160.0f, 164.0f, 160.0f),
                    PathNode.CurveTo(157.37259f, 160.0f, 152.0f, 154.62741f, 152.0f, 148.0f),
                    PathNode.CurveTo(152.0f, 141.37259f, 157.37259f, 136.0f, 164.0f, 136.0f),
                    PathNode.CurveTo(170.62741f, 136.0f, 176.0f, 141.37259f, 176.0f, 148.0f),
                    PathNode.Close,
                    PathNode.MoveTo(92.0f, 136.0f),
                    PathNode.CurveTo(85.37258f, 136.0f, 80.0f, 141.37259f, 80.0f, 148.0f),
                    PathNode.CurveTo(80.0f, 154.62741f, 85.37258f, 160.0f, 92.0f, 160.0f),
                    PathNode.CurveTo(98.62742f, 160.0f, 104.0f, 154.62741f, 104.0f, 148.0f),
                    PathNode.CurveTo(104.0f, 141.37259f, 98.62742f, 136.0f, 92.0f, 136.0f),
                    PathNode.Close,
                    PathNode.MoveTo(240.0f, 160.0f),
                    PathNode.LineTo(240.0f, 184.0f),
                    PathNode.CurveTo(240.0f, 192.83656f, 232.83656f, 200.0f, 224.0f, 200.0f),
                    PathNode.LineTo(32.0f, 200.0f),
                    PathNode.CurveTo(23.163445f, 200.0f, 16.0f, 192.83656f, 16.0f, 184.0f),
                    PathNode.LineTo(16.0f, 161.13f),
                    PathNode.CurveTo(15.9712f, 129.96198f, 28.774384f, 100.1566f, 51.4f, 78.72f),
                    PathNode.LineTo(26.34f, 53.66f),
                    PathNode.CurveTo(23.21407f, 50.53407f, 23.21407f, 45.46593f, 26.34f, 42.34f),
                    PathNode.CurveTo(29.46593f, 39.21407f, 34.53407f, 39.21407f, 37.66f, 42.34f),
                    PathNode.LineTo(63.82f, 68.5f),
                    PathNode.CurveTo(102.31078f, 41.23502f, 153.79878f, 41.15892f, 192.37f, 68.31f),
                    PathNode.LineTo(218.37f, 42.31f),
                    PathNode.CurveTo(221.49593f, 39.184067f, 226.56406f, 39.184067f, 229.69f, 42.31f),
                    PathNode.CurveTo(232.81593f, 45.435932f, 232.81593f, 50.504066f, 229.69f, 53.63f),
                    PathNode.LineTo(204.82f, 78.5f),
                    PathNode.CurveTo(205.57f, 79.21f, 206.32f, 79.93f, 207.06f, 80.67f),
                    PathNode.CurveTo(228.21744f, 101.63721f, 240.08298f, 130.2132f, 240.0f, 160.0f),
                    PathNode.Close,
                    PathNode.MoveTo(224.0f, 160.0f),
                    PathNode.CurveTo(224.0f, 106.98067f, 181.01933f, 64.0f, 128.0f, 64.0f),
                    PathNode.LineTo(127.66f, 64.0f),
                    PathNode.CurveTo(74.91f, 64.18f, 32.0f, 107.75f, 32.0f, 161.13f),
                    PathNode.LineTo(32.0f, 184.0f),
                    PathNode.LineTo(224.0f, 184.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 16.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _androidLogo!!
    }

private var _androidLogo: ImageVector? = null
