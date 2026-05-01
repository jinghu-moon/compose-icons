package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.SpeakerHifi: ImageVector
    get() {
        if (_speakerHifi != null) return _speakerHifi!!
        _speakerHifi = phosphorBoldIcon(
            name = "SpeakerHifi",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(192.0f, 20.0f),
                    PathNode.LineTo(64.0f, 20.0f),
                    PathNode.CurveTo(52.954304f, 20.0f, 44.0f, 28.954306f, 44.0f, 40.0f),
                    PathNode.LineTo(44.0f, 216.0f),
                    PathNode.CurveTo(44.0f, 227.0457f, 52.954304f, 236.0f, 64.0f, 236.0f),
                    PathNode.LineTo(192.0f, 236.0f),
                    PathNode.CurveTo(203.0457f, 236.0f, 212.0f, 227.0457f, 212.0f, 216.0f),
                    PathNode.LineTo(212.0f, 40.0f),
                    PathNode.CurveTo(212.0f, 28.954306f, 203.0457f, 20.0f, 192.0f, 20.0f),
                    PathNode.Close,
                    PathNode.MoveTo(188.0f, 212.0f),
                    PathNode.LineTo(68.0f, 212.0f),
                    PathNode.LineTo(68.0f, 44.0f),
                    PathNode.LineTo(188.0f, 44.0f),
                    PathNode.Close,
                    PathNode.MoveTo(112.0f, 76.0f),
                    PathNode.CurveTo(112.0f, 67.163445f, 119.163445f, 60.0f, 128.0f, 60.0f),
                    PathNode.CurveTo(136.83656f, 60.0f, 144.0f, 67.163445f, 144.0f, 76.0f),
                    PathNode.CurveTo(144.0f, 84.836555f, 136.83656f, 92.0f, 128.0f, 92.0f),
                    PathNode.CurveTo(119.163445f, 92.0f, 112.0f, 84.836555f, 112.0f, 76.0f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 196.0f),
                    PathNode.CurveTo(152.30052f, 196.0f, 172.0f, 176.30052f, 172.0f, 152.0f),
                    PathNode.CurveTo(172.0f, 127.69947f, 152.30052f, 108.0f, 128.0f, 108.0f),
                    PathNode.CurveTo(103.69947f, 108.0f, 84.0f, 127.69947f, 84.0f, 152.0f),
                    PathNode.CurveTo(84.02756f, 176.28911f, 103.71089f, 195.97244f, 128.0f, 196.0f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 132.0f),
                    PathNode.CurveTo(139.0457f, 132.0f, 148.0f, 140.9543f, 148.0f, 152.0f),
                    PathNode.CurveTo(148.0f, 163.0457f, 139.0457f, 172.0f, 128.0f, 172.0f),
                    PathNode.CurveTo(116.95431f, 172.0f, 108.0f, 163.0457f, 108.0f, 152.0f),
                    PathNode.CurveTo(108.0f, 140.9543f, 116.95431f, 132.0f, 128.0f, 132.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 24.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _speakerHifi!!
    }

private var _speakerHifi: ImageVector? = null
