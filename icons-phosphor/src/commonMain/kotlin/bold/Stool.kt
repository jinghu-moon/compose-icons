package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Stool: ImageVector
    get() {
        if (_stool != null) return _stool!!
        _stool = phosphorBoldIcon(
            name = "Stool",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(204.0f, 64.0f),
                    PathNode.LineTo(204.0f, 40.0f),
                    PathNode.CurveTo(204.0f, 28.954306f, 195.0457f, 20.0f, 184.0f, 20.0f),
                    PathNode.LineTo(72.0f, 20.0f),
                    PathNode.CurveTo(60.954304f, 20.0f, 52.0f, 28.954306f, 52.0f, 40.0f),
                    PathNode.LineTo(52.0f, 64.0f),
                    PathNode.CurveTo(52.0f, 75.04569f, 60.954304f, 84.0f, 72.0f, 84.0f),
                    PathNode.LineTo(74.0f, 84.0f),
                    PathNode.LineTo(52.15f, 222.13f),
                    PathNode.CurveTo(51.369595f, 226.41438f, 52.971596f, 230.78531f, 56.335815f, 233.55063f),
                    PathNode.CurveTo(59.70004f, 236.31596f, 64.298386f, 237.04161f, 68.350685f, 235.44666f),
                    PathNode.CurveTo(72.402985f, 233.8517f, 75.27313f, 230.18651f, 75.85f, 225.87f),
                    PathNode.LineTo(83.1f, 180.0f),
                    PathNode.LineTo(172.9f, 180.0f),
                    PathNode.LineTo(180.15f, 225.87f),
                    PathNode.CurveTo(180.72687f, 230.18651f, 183.59702f, 233.8517f, 187.6493f, 235.44666f),
                    PathNode.CurveTo(191.70161f, 237.04161f, 196.29996f, 236.31596f, 199.66418f, 233.55063f),
                    PathNode.CurveTo(203.02841f, 230.78531f, 204.6304f, 226.41438f, 203.85f, 222.13f),
                    PathNode.LineTo(182.0f, 84.0f),
                    PathNode.LineTo(184.0f, 84.0f),
                    PathNode.CurveTo(195.0457f, 84.0f, 204.0f, 75.04569f, 204.0f, 64.0f),
                    PathNode.Close,
                    PathNode.MoveTo(76.0f, 44.0f),
                    PathNode.LineTo(180.0f, 44.0f),
                    PathNode.LineTo(180.0f, 60.0f),
                    PathNode.LineTo(76.0f, 60.0f),
                    PathNode.Close,
                    PathNode.MoveTo(169.11f, 156.0f),
                    PathNode.LineTo(86.89f, 156.0f),
                    PathNode.LineTo(98.25f, 84.0f),
                    PathNode.LineTo(157.75f, 84.0f),
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
        return _stool!!
    }

private var _stool: ImageVector? = null
