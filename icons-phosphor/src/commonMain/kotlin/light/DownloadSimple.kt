package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.DownloadSimple: ImageVector
    get() {
        if (_downloadSimple != null) return _downloadSimple!!
        _downloadSimple = phosphorLightIcon(
            name = "DownloadSimple",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(222.0f, 144.0f),
                    PathNode.LineTo(222.0f, 208.0f),
                    PathNode.CurveTo(222.0f, 211.3137f, 219.3137f, 214.0f, 216.0f, 214.0f),
                    PathNode.LineTo(40.0f, 214.0f),
                    PathNode.CurveTo(36.68629f, 214.0f, 34.0f, 211.3137f, 34.0f, 208.0f),
                    PathNode.LineTo(34.0f, 144.0f),
                    PathNode.CurveTo(34.0f, 140.6863f, 36.68629f, 138.0f, 40.0f, 138.0f),
                    PathNode.CurveTo(43.31371f, 138.0f, 46.0f, 140.6863f, 46.0f, 144.0f),
                    PathNode.LineTo(46.0f, 202.0f),
                    PathNode.LineTo(210.0f, 202.0f),
                    PathNode.LineTo(210.0f, 144.0f),
                    PathNode.CurveTo(210.0f, 140.6863f, 212.6863f, 138.0f, 216.0f, 138.0f),
                    PathNode.CurveTo(219.3137f, 138.0f, 222.0f, 140.6863f, 222.0f, 144.0f),
                    PathNode.Close,
                    PathNode.MoveTo(123.76f, 148.24f),
                    PathNode.CurveTo(126.10254f, 150.57962f, 129.89746f, 150.57962f, 132.24f, 148.24f),
                    PathNode.LineTo(172.24f, 108.24f),
                    PathNode.CurveTo(174.44287f, 105.87592f, 174.37787f, 102.191925f, 172.09297f, 99.90703f),
                    PathNode.CurveTo(169.80807f, 97.62213f, 166.12408f, 97.55713f, 163.76f, 99.76f),
                    PathNode.LineTo(134.0f, 129.51f),
                    PathNode.LineTo(134.0f, 32.0f),
                    PathNode.CurveTo(134.0f, 28.68629f, 131.3137f, 26.0f, 128.0f, 26.0f),
                    PathNode.CurveTo(124.686295f, 26.0f, 122.0f, 28.68629f, 122.0f, 32.0f),
                    PathNode.LineTo(122.0f, 129.51f),
                    PathNode.LineTo(92.24f, 99.76f),
                    PathNode.CurveTo(89.87592f, 97.55713f, 86.191925f, 97.62213f, 83.90703f, 99.90703f),
                    PathNode.CurveTo(81.62213f, 102.191925f, 81.55713f, 105.87592f, 83.76f, 108.24f),
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
        return _downloadSimple!!
    }

private var _downloadSimple: ImageVector? = null
