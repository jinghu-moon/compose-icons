package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.ListStar: ImageVector
    get() {
        if (_listStar != null) return _listStar!!
        _listStar = phosphorDuotoneIcon(
            name = "ListStar",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(205.6f, 159.41f),
                    PathNode.LineTo(213.67f, 192.0f),
                    PathNode.LineTo(184.0f, 174.54f),
                    PathNode.LineTo(154.33f, 192.0f),
                    PathNode.LineTo(162.4f, 159.41f),
                    PathNode.LineTo(136.0f, 137.61f),
                    PathNode.LineTo(170.65f, 134.94f),
                    PathNode.LineTo(184.0f, 104.0f),
                    PathNode.LineTo(197.35f, 134.94f),
                    PathNode.LineTo(232.0f, 137.61f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 16.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(32.0f, 64.0f),
                    PathNode.CurveTo(32.0f, 59.581722f, 35.581722f, 56.0f, 40.0f, 56.0f),
                    PathNode.LineTo(216.0f, 56.0f),
                    PathNode.CurveTo(220.41827f, 56.0f, 224.0f, 59.581722f, 224.0f, 64.0f),
                    PathNode.CurveTo(224.0f, 68.41828f, 220.41827f, 72.0f, 216.0f, 72.0f),
                    PathNode.LineTo(40.0f, 72.0f),
                    PathNode.CurveTo(35.581722f, 72.0f, 32.0f, 68.41828f, 32.0f, 64.0f),
                    PathNode.Close,
                    PathNode.MoveTo(40.0f, 136.0f),
                    PathNode.LineTo(96.0f, 136.0f),
                    PathNode.CurveTo(100.41828f, 136.0f, 104.0f, 132.41827f, 104.0f, 128.0f),
                    PathNode.CurveTo(104.0f, 123.58172f, 100.41828f, 120.0f, 96.0f, 120.0f),
                    PathNode.LineTo(40.0f, 120.0f),
                    PathNode.CurveTo(35.581722f, 120.0f, 32.0f, 123.58172f, 32.0f, 128.0f),
                    PathNode.CurveTo(32.0f, 132.41827f, 35.581722f, 136.0f, 40.0f, 136.0f),
                    PathNode.Close,
                    PathNode.MoveTo(112.0f, 184.0f),
                    PathNode.LineTo(40.0f, 184.0f),
                    PathNode.CurveTo(35.581722f, 184.0f, 32.0f, 187.58173f, 32.0f, 192.0f),
                    PathNode.CurveTo(32.0f, 196.41827f, 35.581722f, 200.0f, 40.0f, 200.0f),
                    PathNode.LineTo(112.0f, 200.0f),
                    PathNode.CurveTo(116.41828f, 200.0f, 120.0f, 196.41827f, 120.0f, 192.0f),
                    PathNode.CurveTo(120.0f, 187.58173f, 116.41828f, 184.0f, 112.0f, 184.0f),
                    PathNode.Close,
                    PathNode.MoveTo(237.09f, 143.78f),
                    PathNode.LineTo(214.57f, 162.37f),
                    PathNode.LineTo(221.43f, 190.08f),
                    PathNode.CurveTo(222.19882f, 193.2036f, 221.02193f, 196.48387f, 218.44272f, 198.40628f),
                    PathNode.CurveTo(215.86351f, 200.32869f, 212.38371f, 200.51926f, 209.61f, 198.89f),
                    PathNode.LineTo(184.0f, 183.82f),
                    PathNode.LineTo(158.39f, 198.89f),
                    PathNode.CurveTo(155.61629f, 200.51926f, 152.13649f, 200.32869f, 149.55728f, 198.40628f),
                    PathNode.CurveTo(146.97807f, 196.48387f, 145.80118f, 193.2036f, 146.57f, 190.08f),
                    PathNode.LineTo(153.42f, 162.37f),
                    PathNode.LineTo(130.91f, 143.78f),
                    PathNode.CurveTo(128.39896f, 141.7032f, 127.39849f, 138.31093f, 128.3807f, 135.20389f),
                    PathNode.CurveTo(129.36292f, 132.09685f, 132.13148f, 129.89606f, 135.38f, 129.64f),
                    PathNode.LineTo(165.22f, 127.33f),
                    PathNode.LineTo(176.65f, 100.83f),
                    PathNode.CurveTo(177.91243f, 97.89247f, 180.80269f, 95.98872f, 184.0f, 95.98872f),
                    PathNode.CurveTo(187.19731f, 95.98872f, 190.08757f, 97.89247f, 191.35f, 100.83f),
                    PathNode.LineTo(202.78f, 127.33f),
                    PathNode.LineTo(232.62f, 129.64f),
                    PathNode.CurveTo(235.86852f, 129.89606f, 238.63708f, 132.09685f, 239.6193f, 135.20389f),
                    PathNode.CurveTo(240.6015f, 138.31093f, 239.60104f, 141.7032f, 237.09f, 143.78f),
                    PathNode.Close,
                    PathNode.MoveTo(211.62f, 144.06f),
                    PathNode.LineTo(196.73f, 142.91f),
                    PathNode.CurveTo(193.76978f, 142.68275f, 191.17886f, 140.83485f, 190.0f, 138.11f),
                    PathNode.LineTo(184.0f, 124.19f),
                    PathNode.LineTo(178.0f, 138.11f),
                    PathNode.CurveTo(176.82114f, 140.83485f, 174.23022f, 142.68275f, 171.27f, 142.91f),
                    PathNode.LineTo(156.38f, 144.06f),
                    PathNode.LineTo(167.49f, 153.24f),
                    PathNode.CurveTo(169.8649f, 155.1968f, 170.90694f, 158.34233f, 170.17f, 161.33f),
                    PathNode.LineTo(166.67f, 175.45f),
                    PathNode.LineTo(179.94f, 167.64f),
                    PathNode.CurveTo(182.44553f, 166.16429f, 185.55447f, 166.16429f, 188.06f, 167.64f),
                    PathNode.LineTo(201.33f, 175.45f),
                    PathNode.LineTo(197.83f, 161.33f),
                    PathNode.CurveTo(197.09306f, 158.34233f, 198.1351f, 155.1968f, 200.51f, 153.24f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 16.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _listStar!!
    }

private var _listStar: ImageVector? = null
