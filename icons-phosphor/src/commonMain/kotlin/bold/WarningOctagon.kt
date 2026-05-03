package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.WarningOctagon: ImageVector
    get() {
        if (_warningOctagon != null) return _warningOctagon!!
        _warningOctagon = phosphorBoldIcon(
            name = "WarningOctagon",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(116.0f, 132.0f),
                    PathNode.LineTo(116.0f, 80.0f),
                    PathNode.CurveTo(116.0f, 73.37258f, 121.37258f, 68.0f, 128.0f, 68.0f),
                    PathNode.CurveTo(134.62741f, 68.0f, 140.0f, 73.37258f, 140.0f, 80.0f),
                    PathNode.LineTo(140.0f, 132.0f),
                    PathNode.CurveTo(140.0f, 138.62741f, 134.62741f, 144.0f, 128.0f, 144.0f),
                    PathNode.CurveTo(121.37258f, 144.0f, 116.0f, 138.62741f, 116.0f, 132.0f),
                    PathNode.Close,
                    PathNode.MoveTo(236.0f, 91.55f),
                    PathNode.LineTo(236.0f, 164.45f),
                    PathNode.CurveTo(236.01437f, 169.75697f, 233.90411f, 174.84894f, 230.14f, 178.59f),
                    PathNode.LineTo(178.59f, 230.14f),
                    PathNode.CurveTo(174.84958f, 233.90506f, 169.75719f, 236.01549f, 164.45f, 236.0f),
                    PathNode.LineTo(91.55f, 236.0f),
                    PathNode.CurveTo(86.242805f, 236.01549f, 81.15043f, 233.90506f, 77.41f, 230.14f),
                    PathNode.LineTo(25.86f, 178.59f),
                    PathNode.CurveTo(22.095879f, 174.84894f, 19.98563f, 169.75697f, 20.0f, 164.45f),
                    PathNode.LineTo(20.0f, 91.55f),
                    PathNode.CurveTo(19.98563f, 86.24303f, 22.095879f, 81.15106f, 25.86f, 77.41f),
                    PathNode.LineTo(77.41f, 25.86f),
                    PathNode.CurveTo(81.15043f, 22.094933f, 86.242805f, 19.984512f, 91.55f, 20.0f),
                    PathNode.LineTo(164.45f, 20.0f),
                    PathNode.CurveTo(169.75719f, 19.984512f, 174.84958f, 22.094933f, 178.59f, 25.86f),
                    PathNode.LineTo(230.14f, 77.41f),
                    PathNode.CurveTo(233.90411f, 81.15106f, 236.01437f, 86.24303f, 236.0f, 91.55f),
                    PathNode.Close,
                    PathNode.MoveTo(212.0f, 93.21f),
                    PathNode.LineTo(162.79f, 44.0f),
                    PathNode.LineTo(93.21f, 44.0f),
                    PathNode.LineTo(44.0f, 93.21f),
                    PathNode.LineTo(44.0f, 162.79f),
                    PathNode.LineTo(93.21f, 212.0f),
                    PathNode.LineTo(162.79f, 212.0f),
                    PathNode.LineTo(212.0f, 162.79f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 156.0f),
                    PathNode.CurveTo(119.163445f, 156.0f, 112.0f, 163.16344f, 112.0f, 172.0f),
                    PathNode.CurveTo(112.0f, 180.83656f, 119.163445f, 188.0f, 128.0f, 188.0f),
                    PathNode.CurveTo(136.83656f, 188.0f, 144.0f, 180.83656f, 144.0f, 172.0f),
                    PathNode.CurveTo(144.0f, 163.16344f, 136.83656f, 156.0f, 128.0f, 156.0f),
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
        return _warningOctagon!!
    }

private var _warningOctagon: ImageVector? = null
