package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.PokerChip: ImageVector
    get() {
        if (_pokerChip != null) return _pokerChip!!
        _pokerChip = phosphorBoldIcon(
            name = "PokerChip",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(128.0f, 20.0f),
                    PathNode.CurveTo(68.35325f, 20.0f, 20.0f, 68.35325f, 20.0f, 128.0f),
                    PathNode.CurveTo(20.0f, 187.64676f, 68.35325f, 236.0f, 128.0f, 236.0f),
                    PathNode.CurveTo(187.64676f, 236.0f, 236.0f, 187.64676f, 236.0f, 128.0f),
                    PathNode.CurveTo(235.93387f, 68.38066f, 187.61934f, 20.066133f, 128.0f, 20.0f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 164.0f),
                    PathNode.CurveTo(108.11775f, 164.0f, 92.0f, 147.88223f, 92.0f, 128.0f),
                    PathNode.CurveTo(92.0f, 108.11775f, 108.11775f, 92.0f, 128.0f, 92.0f),
                    PathNode.CurveTo(147.88223f, 92.0f, 164.0f, 108.11775f, 164.0f, 128.0f),
                    PathNode.CurveTo(164.0f, 147.88223f, 147.88223f, 164.0f, 128.0f, 164.0f),
                    PathNode.Close,
                    PathNode.MoveTo(161.06f, 78.0f),
                    PathNode.CurveTo(154.67279f, 73.73882f, 147.52132f, 70.75395f, 140.0f, 69.21f),
                    PathNode.LineTo(140.0f, 44.87f),
                    PathNode.CurveTo(153.89116f, 46.86445f, 167.05617f, 52.32579f, 178.28f, 60.75f),
                    PathNode.Close,
                    PathNode.MoveTo(116.0f, 69.21f),
                    PathNode.CurveTo(108.47867f, 70.75395f, 101.32721f, 73.73882f, 94.94f, 78.0f),
                    PathNode.LineTo(77.72f, 60.75f),
                    PathNode.CurveTo(88.94385f, 52.32579f, 102.10884f, 46.86445f, 116.0f, 44.87f),
                    PathNode.Close,
                    PathNode.MoveTo(78.0f, 94.94f),
                    PathNode.CurveTo(73.73882f, 101.32721f, 70.75395f, 108.47867f, 69.21f, 116.0f),
                    PathNode.LineTo(44.87f, 116.0f),
                    PathNode.CurveTo(46.86612f, 102.1093f, 52.327297f, 88.94471f, 60.75f, 77.72f),
                    PathNode.Close,
                    PathNode.MoveTo(69.21f, 140.0f),
                    PathNode.CurveTo(70.75395f, 147.52132f, 73.73882f, 154.67279f, 78.0f, 161.06f),
                    PathNode.LineTo(60.75f, 178.28f),
                    PathNode.CurveTo(52.327297f, 167.0553f, 46.86612f, 153.8907f, 44.87f, 140.0f),
                    PathNode.Close,
                    PathNode.MoveTo(94.94f, 178.0f),
                    PathNode.CurveTo(101.32721f, 182.26117f, 108.47867f, 185.24605f, 116.0f, 186.79f),
                    PathNode.LineTo(116.0f, 211.13f),
                    PathNode.CurveTo(102.10884f, 209.13553f, 88.94385f, 203.67421f, 77.72f, 195.25f),
                    PathNode.Close,
                    PathNode.MoveTo(140.0f, 186.79f),
                    PathNode.CurveTo(147.52132f, 185.24605f, 154.67279f, 182.26117f, 161.06f, 178.0f),
                    PathNode.LineTo(178.28f, 195.22f),
                    PathNode.CurveTo(167.05917f, 203.65492f, 153.89394f, 209.12668f, 140.0f, 211.13f),
                    PathNode.Close,
                    PathNode.MoveTo(178.0f, 161.06f),
                    PathNode.CurveTo(182.26117f, 154.67279f, 185.24605f, 147.52132f, 186.79f, 140.0f),
                    PathNode.LineTo(211.13f, 140.0f),
                    PathNode.CurveTo(209.13388f, 153.8907f, 203.6727f, 167.0553f, 195.25f, 178.28f),
                    PathNode.Close,
                    PathNode.MoveTo(186.79f, 116.0f),
                    PathNode.CurveTo(185.24605f, 108.47867f, 182.26117f, 101.32721f, 178.0f, 94.94f),
                    PathNode.LineTo(195.22f, 77.72f),
                    PathNode.CurveTo(203.65341f, 88.94169f, 209.12498f, 102.106514f, 211.13f, 116.0f),
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
        return _pokerChip!!
    }

private var _pokerChip: ImageVector? = null
