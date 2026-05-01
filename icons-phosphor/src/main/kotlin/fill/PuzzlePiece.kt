package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.PuzzlePiece: ImageVector
    get() {
        if (_puzzlePiece != null) return _puzzlePiece!!
        _puzzlePiece = phosphorFillIcon(
            name = "PuzzlePiece",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(165.78f, 224.0f),
                    PathNode.LineTo(208.0f, 224.0f),
                    PathNode.CurveTo(216.83656f, 224.0f, 224.0f, 216.83656f, 224.0f, 208.0f),
                    PathNode.LineTo(224.0f, 170.35f),
                    PathNode.CurveTo(223.98615f, 167.6858f, 222.64691f, 165.20332f, 220.42798f, 163.72871f),
                    PathNode.CurveTo(218.20905f, 162.2541f, 215.40161f, 161.9809f, 212.94f, 163.0f),
                    PathNode.CurveTo(210.10503f, 164.17096f, 207.06728f, 164.7724f, 204.0f, 164.77f),
                    PathNode.CurveTo(190.77f, 164.77f, 180.0f, 153.67f, 180.0f, 140.04f),
                    PathNode.CurveTo(180.0f, 126.41f, 190.77f, 115.31f, 204.0f, 115.31f),
                    PathNode.CurveTo(207.06728f, 115.3076f, 210.10503f, 115.909035f, 212.94f, 117.08f),
                    PathNode.CurveTo(215.4147f, 118.104515f, 218.23793f, 117.82264f, 220.46123f, 116.32905f),
                    PathNode.CurveTo(222.68451f, 114.835464f, 224.01285f, 112.32837f, 224.0f, 109.65f),
                    PathNode.LineTo(224.0f, 72.0f),
                    PathNode.CurveTo(224.0f, 63.163445f, 216.83656f, 56.0f, 208.0f, 56.0f),
                    PathNode.LineTo(171.78f, 56.0f),
                    PathNode.CurveTo(171.92886f, 54.671898f, 172.00232f, 53.33642f, 172.0f, 52.0f),
                    PathNode.CurveTo(172.0f, 32.11775f, 155.88223f, 16.0f, 136.0f, 16.0f),
                    PathNode.CurveTo(116.11775f, 16.0f, 100.0f, 32.11775f, 100.0f, 52.0f),
                    PathNode.CurveTo(99.99769f, 53.33642f, 100.07114f, 54.671898f, 100.22f, 56.0f),
                    PathNode.LineTo(64.0f, 56.0f),
                    PathNode.CurveTo(55.163445f, 56.0f, 48.0f, 63.163445f, 48.0f, 72.0f),
                    PathNode.LineTo(48.0f, 104.22f),
                    PathNode.CurveTo(46.671898f, 104.07114f, 45.33642f, 103.99769f, 44.0f, 104.0f),
                    PathNode.CurveTo(24.117748f, 104.0f, 8.0f, 120.11775f, 8.0f, 140.0f),
                    PathNode.CurveTo(8.0f, 159.88223f, 24.117748f, 176.0f, 44.0f, 176.0f),
                    PathNode.CurveTo(45.33642f, 176.00232f, 46.671898f, 175.92886f, 48.0f, 175.78f),
                    PathNode.LineTo(48.0f, 208.0f),
                    PathNode.CurveTo(48.0f, 216.83656f, 55.163445f, 224.0f, 64.0f, 224.0f),
                    PathNode.LineTo(106.22f, 224.0f)
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
        return _puzzlePiece!!
    }

private var _puzzlePiece: ImageVector? = null
