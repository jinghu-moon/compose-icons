package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.AndroidLogo: ImageVector
    get() {
        if (_androidLogo != null) return _androidLogo!!
        _androidLogo = phosphorFillIcon(
            name = "AndroidLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(207.06f, 80.67f),
                    PathNode.CurveTo(206.32f, 79.93f, 205.57f, 79.21f, 204.82f, 78.5f),
                    PathNode.LineTo(229.66f, 53.66f),
                    PathNode.CurveTo(232.78593f, 50.53407f, 232.78593f, 45.46593f, 229.66f, 42.34f),
                    PathNode.CurveTo(226.53407f, 39.21407f, 221.46593f, 39.21407f, 218.34f, 42.34f),
                    PathNode.LineTo(192.34f, 68.34f),
                    PathNode.CurveTo(153.76878f, 41.18892f, 102.280785f, 41.26502f, 63.79f, 68.53f),
                    PathNode.LineTo(37.66f, 42.34f),
                    PathNode.CurveTo(34.53407f, 39.21407f, 29.46593f, 39.21407f, 26.34f, 42.34f),
                    PathNode.CurveTo(23.21407f, 45.46593f, 23.21407f, 50.53407f, 26.34f, 53.66f),
                    PathNode.LineTo(51.4f, 78.72f),
                    PathNode.CurveTo(28.774384f, 100.1566f, 15.9712f, 129.96198f, 16.0f, 161.13f),
                    PathNode.LineTo(16.0f, 184.0f),
                    PathNode.CurveTo(16.0f, 192.83656f, 23.163445f, 200.0f, 32.0f, 200.0f),
                    PathNode.LineTo(224.0f, 200.0f),
                    PathNode.CurveTo(232.83656f, 200.0f, 240.0f, 192.83656f, 240.0f, 184.0f),
                    PathNode.LineTo(240.0f, 160.0f),
                    PathNode.CurveTo(240.08298f, 130.2132f, 228.21744f, 101.63721f, 207.06f, 80.67f),
                    PathNode.Close,
                    PathNode.MoveTo(92.0f, 160.0f),
                    PathNode.CurveTo(85.37258f, 160.0f, 80.0f, 154.62741f, 80.0f, 148.0f),
                    PathNode.CurveTo(80.0f, 141.37259f, 85.37258f, 136.0f, 92.0f, 136.0f),
                    PathNode.CurveTo(98.62742f, 136.0f, 104.0f, 141.37259f, 104.0f, 148.0f),
                    PathNode.CurveTo(104.0f, 154.62741f, 98.62742f, 160.0f, 92.0f, 160.0f),
                    PathNode.Close,
                    PathNode.MoveTo(164.0f, 160.0f),
                    PathNode.CurveTo(157.37259f, 160.0f, 152.0f, 154.62741f, 152.0f, 148.0f),
                    PathNode.CurveTo(152.0f, 141.37259f, 157.37259f, 136.0f, 164.0f, 136.0f),
                    PathNode.CurveTo(170.62741f, 136.0f, 176.0f, 141.37259f, 176.0f, 148.0f),
                    PathNode.CurveTo(176.0f, 154.62741f, 170.62741f, 160.0f, 164.0f, 160.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 4f,
            )
        }
        return _androidLogo!!
    }

private var _androidLogo: ImageVector? = null
