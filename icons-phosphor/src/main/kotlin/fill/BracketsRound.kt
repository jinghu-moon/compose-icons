package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.BracketsRound: ImageVector
    get() {
        if (_bracketsRound != null) return _bracketsRound!!
        _bracketsRound = phosphorFillIcon(
            name = "BracketsRound",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(216.0f, 40.0f),
                    PathNode.LineTo(40.0f, 40.0f),
                    PathNode.CurveTo(31.163445f, 40.0f, 24.0f, 47.163445f, 24.0f, 56.0f),
                    PathNode.LineTo(24.0f, 200.0f),
                    PathNode.CurveTo(24.0f, 208.83656f, 31.163445f, 216.0f, 40.0f, 216.0f),
                    PathNode.LineTo(216.0f, 216.0f),
                    PathNode.CurveTo(224.83656f, 216.0f, 232.0f, 208.83656f, 232.0f, 200.0f),
                    PathNode.LineTo(232.0f, 56.0f),
                    PathNode.CurveTo(232.0f, 47.163445f, 224.83656f, 40.0f, 216.0f, 40.0f),
                    PathNode.Close,
                    PathNode.MoveTo(99.61f, 176.86f),
                    PathNode.CurveTo(103.55884f, 178.84546f, 105.15047f, 183.65616f, 103.165f, 187.605f),
                    PathNode.CurveTo(101.179535f, 191.55383f, 96.368835f, 193.14546f, 92.42f, 191.16f),
                    PathNode.CurveTo(69.60879f, 178.38591f, 55.628857f, 154.14174f, 56.0f, 128.0f),
                    PathNode.CurveTo(55.628857f, 101.85825f, 69.60879f, 77.61409f, 92.42f, 64.84f),
                    PathNode.CurveTo(96.368835f, 62.857296f, 101.1773f, 64.451164f, 103.16f, 68.4f),
                    PathNode.CurveTo(105.1427f, 72.34884f, 103.548836f, 77.157295f, 99.6f, 79.14f),
                    PathNode.CurveTo(98.37f, 79.78f, 72.0f, 93.76f, 72.0f, 128.0f),
                    PathNode.CurveTo(72.0f, 162.24f, 98.48f, 176.28f, 99.61f, 176.86f),
                    PathNode.Close,
                    PathNode.MoveTo(163.61f, 191.16f),
                    PathNode.CurveTo(159.65562f, 193.13718f, 154.84718f, 191.53436f, 152.87f, 187.58f),
                    PathNode.CurveTo(150.89282f, 183.62564f, 152.49564f, 178.81718f, 156.45f, 176.84f),
                    PathNode.CurveTo(157.55f, 176.28f, 184.03f, 162.32f, 184.03f, 128.0f),
                    PathNode.CurveTo(184.03f, 93.68f, 157.55f, 79.72f, 156.42f, 79.14f),
                    PathNode.CurveTo(152.47116f, 77.15453f, 150.87953f, 72.343834f, 152.865f, 68.395f),
                    PathNode.CurveTo(154.85046f, 64.44617f, 159.66116f, 62.854534f, 163.61f, 64.84f),
                    PathNode.CurveTo(186.40964f, 77.62195f, 200.37717f, 101.86459f, 200.0f, 128.0f),
                    PathNode.CurveTo(200.37114f, 154.14174f, 186.3912f, 178.38591f, 163.58f, 191.16f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 4f,
            )
        }
        return _bracketsRound!!
    }

private var _bracketsRound: ImageVector? = null
