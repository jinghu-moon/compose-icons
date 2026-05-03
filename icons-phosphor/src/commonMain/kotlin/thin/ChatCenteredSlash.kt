package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.ChatCenteredSlash: ImageVector
    get() {
        if (_chatCenteredSlash != null) return _chatCenteredSlash!!
        _chatCenteredSlash = phosphorThinIcon(
            name = "ChatCenteredSlash",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(51.0f, 37.31f),
                    PathNode.CurveTo(49.514355f, 35.653145f, 46.966854f, 35.514355f, 45.31f, 37.0f),
                    PathNode.CurveTo(43.653145f, 38.485645f, 43.514355f, 41.033146f, 45.0f, 42.69f),
                    PathNode.LineTo(46.23f, 44.0f),
                    PathNode.LineTo(40.0f, 44.0f),
                    PathNode.CurveTo(33.37258f, 44.0f, 28.0f, 49.37258f, 28.0f, 56.0f),
                    PathNode.LineTo(28.0f, 184.0f),
                    PathNode.CurveTo(28.0f, 190.62741f, 33.37258f, 196.0f, 40.0f, 196.0f),
                    PathNode.LineTo(102.75f, 196.0f),
                    PathNode.LineTo(117.58f, 222.0f),
                    PathNode.CurveTo(119.716225f, 225.73994f, 123.69294f, 228.04823f, 128.0f, 228.04823f),
                    PathNode.CurveTo(132.30707f, 228.04823f, 136.28378f, 225.73994f, 138.42f, 222.0f),
                    PathNode.LineTo(153.25f, 196.0f),
                    PathNode.LineTo(184.41f, 196.0f),
                    PathNode.LineTo(205.0f, 218.69f),
                    PathNode.CurveTo(205.95595f, 219.76758f, 207.41747f, 220.24792f, 208.8263f, 219.94757f),
                    PathNode.CurveTo(210.23512f, 219.64722f, 211.37364f, 218.61255f, 211.80698f, 217.23878f),
                    PathNode.CurveTo(212.24031f, 215.865f, 211.9015f, 214.36435f, 210.92f, 213.31f),
                    PathNode.Close,
                    PathNode.MoveTo(150.93f, 188.0f),
                    PathNode.CurveTo(149.49883f, 187.9979f, 148.17558f, 188.76057f, 147.46f, 190.0f),
                    PathNode.LineTo(131.46f, 218.0f),
                    PathNode.CurveTo(130.74702f, 219.24338f, 129.4233f, 220.01025f, 127.99f, 220.01025f),
                    PathNode.CurveTo(126.55671f, 220.01025f, 125.23297f, 219.24338f, 124.52f, 218.0f),
                    PathNode.LineTo(108.52f, 190.0f),
                    PathNode.CurveTo(107.80441f, 188.76057f, 106.48117f, 187.9979f, 105.05f, 188.0f),
                    PathNode.LineTo(40.0f, 188.0f),
                    PathNode.CurveTo(37.79086f, 188.0f, 36.0f, 186.20914f, 36.0f, 184.0f),
                    PathNode.LineTo(36.0f, 56.0f),
                    PathNode.CurveTo(36.0f, 53.79086f, 37.79086f, 52.0f, 40.0f, 52.0f),
                    PathNode.LineTo(53.5f, 52.0f),
                    PathNode.LineTo(177.14f, 188.0f),
                    PathNode.Close,
                    PathNode.MoveTo(228.0f, 56.0f),
                    PathNode.LineTo(228.0f, 186.0f),
                    PathNode.CurveTo(228.0f, 188.20914f, 226.20914f, 190.0f, 224.0f, 190.0f),
                    PathNode.CurveTo(221.79086f, 190.0f, 220.0f, 188.20914f, 220.0f, 186.0f),
                    PathNode.LineTo(220.0f, 56.0f),
                    PathNode.CurveTo(220.0f, 53.79086f, 218.20914f, 52.0f, 216.0f, 52.0f),
                    PathNode.LineTo(98.52f, 52.0f),
                    PathNode.CurveTo(96.31086f, 52.0f, 94.52f, 50.20914f, 94.52f, 48.0f),
                    PathNode.CurveTo(94.52f, 45.79086f, 96.31086f, 44.0f, 98.52f, 44.0f),
                    PathNode.LineTo(216.0f, 44.0f),
                    PathNode.CurveTo(222.62741f, 44.0f, 228.0f, 49.37258f, 228.0f, 56.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 8.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _chatCenteredSlash!!
    }

private var _chatCenteredSlash: ImageVector? = null
