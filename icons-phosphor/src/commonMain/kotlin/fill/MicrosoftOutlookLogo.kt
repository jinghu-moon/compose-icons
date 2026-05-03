package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.MicrosoftOutlookLogo: ImageVector
    get() {
        if (_microsoftOutlookLogo != null) return _microsoftOutlookLogo!!
        _microsoftOutlookLogo = phosphorFillIcon(
            name = "MicrosoftOutlookLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(88.0f, 144.0f),
                    PathNode.CurveTo(79.163445f, 144.0f, 72.0f, 136.83656f, 72.0f, 128.0f),
                    PathNode.CurveTo(72.0f, 119.163445f, 79.163445f, 112.0f, 88.0f, 112.0f),
                    PathNode.CurveTo(96.836555f, 112.0f, 104.0f, 119.163445f, 104.0f, 128.0f),
                    PathNode.CurveTo(104.0f, 136.83656f, 96.836555f, 144.0f, 88.0f, 144.0f),
                    PathNode.Close,
                    PathNode.MoveTo(232.0f, 112.0f),
                    PathNode.LineTo(232.0f, 208.0f),
                    PathNode.CurveTo(232.0f, 216.83656f, 224.83656f, 224.0f, 216.0f, 224.0f),
                    PathNode.LineTo(88.0f, 224.0f),
                    PathNode.CurveTo(79.163445f, 224.0f, 72.0f, 216.83656f, 72.0f, 208.0f),
                    PathNode.LineTo(72.0f, 192.0f),
                    PathNode.LineTo(40.0f, 192.0f),
                    PathNode.CurveTo(31.163445f, 192.0f, 24.0f, 184.83656f, 24.0f, 176.0f),
                    PathNode.LineTo(24.0f, 80.0f),
                    PathNode.CurveTo(24.0f, 71.163445f, 31.163445f, 64.0f, 40.0f, 64.0f),
                    PathNode.LineTo(96.0f, 64.0f),
                    PathNode.LineTo(96.0f, 40.0f),
                    PathNode.CurveTo(96.0f, 35.581722f, 99.58172f, 32.0f, 104.0f, 32.0f),
                    PathNode.LineTo(200.0f, 32.0f),
                    PathNode.CurveTo(204.41827f, 32.0f, 208.0f, 35.581722f, 208.0f, 40.0f),
                    PathNode.LineTo(208.0f, 104.0f),
                    PathNode.LineTo(224.0f, 104.0f),
                    PathNode.CurveTo(228.41827f, 104.0f, 232.0f, 107.58172f, 232.0f, 112.0f),
                    PathNode.Close,
                    PathNode.MoveTo(112.0f, 64.0f),
                    PathNode.LineTo(136.0f, 64.0f),
                    PathNode.CurveTo(144.83656f, 64.0f, 152.0f, 71.163445f, 152.0f, 80.0f),
                    PathNode.LineTo(152.0f, 154.13f),
                    PathNode.LineTo(192.0f, 125.24f),
                    PathNode.LineTo(192.0f, 48.0f),
                    PathNode.LineTo(112.0f, 48.0f),
                    PathNode.Close,
                    PathNode.MoveTo(88.0f, 160.0f),
                    PathNode.CurveTo(105.67311f, 160.0f, 120.0f, 145.67311f, 120.0f, 128.0f),
                    PathNode.CurveTo(120.0f, 110.32689f, 105.67311f, 96.0f, 88.0f, 96.0f),
                    PathNode.CurveTo(70.32689f, 96.0f, 56.0f, 110.32689f, 56.0f, 128.0f),
                    PathNode.CurveTo(56.0f, 145.67311f, 70.32689f, 160.0f, 88.0f, 160.0f),
                    PathNode.Close,
                    PathNode.MoveTo(199.26f, 208.0f),
                    PathNode.LineTo(152.0f, 173.87f),
                    PathNode.LineTo(152.0f, 176.0f),
                    PathNode.CurveTo(152.0f, 184.83656f, 144.83656f, 192.0f, 136.0f, 192.0f),
                    PathNode.LineTo(88.0f, 192.0f),
                    PathNode.LineTo(88.0f, 208.0f),
                    PathNode.Close,
                    PathNode.MoveTo(216.0f, 127.65f),
                    PathNode.LineTo(165.66f, 164.0f),
                    PathNode.LineTo(216.0f, 200.35f),
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
        return _microsoftOutlookLogo!!
    }

private var _microsoftOutlookLogo: ImageVector? = null
