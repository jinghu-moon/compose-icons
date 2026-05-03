package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.FolderStar: ImageVector
    get() {
        if (_folderStar != null) return _folderStar!!
        _folderStar = phosphorFillIcon(
            name = "FolderStar",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(237.09f, 167.78f),
                    PathNode.LineTo(214.58f, 186.37f),
                    PathNode.LineTo(221.43f, 214.08f),
                    PathNode.CurveTo(222.19882f, 217.2036f, 221.02193f, 220.48387f, 218.44272f, 222.40628f),
                    PathNode.CurveTo(215.86351f, 224.32869f, 212.38371f, 224.51926f, 209.61f, 222.89f),
                    PathNode.LineTo(184.0f, 207.82f),
                    PathNode.LineTo(158.39f, 222.89f),
                    PathNode.CurveTo(155.61629f, 224.51926f, 152.13649f, 224.32869f, 149.55728f, 222.40628f),
                    PathNode.CurveTo(146.97807f, 220.48387f, 145.80118f, 217.2036f, 146.57f, 214.08f),
                    PathNode.LineTo(153.42f, 186.37f),
                    PathNode.LineTo(130.91f, 167.78f),
                    PathNode.CurveTo(128.39896f, 165.7032f, 127.39849f, 162.31093f, 128.3807f, 159.20389f),
                    PathNode.CurveTo(129.36292f, 156.09685f, 132.13148f, 153.89606f, 135.38f, 153.64f),
                    PathNode.LineTo(165.22f, 151.33f),
                    PathNode.LineTo(176.65f, 124.83f),
                    PathNode.CurveTo(177.91243f, 121.89247f, 180.80269f, 119.98872f, 184.0f, 119.98872f),
                    PathNode.CurveTo(187.19731f, 119.98872f, 190.08757f, 121.89247f, 191.35f, 124.83f),
                    PathNode.LineTo(202.78f, 151.33f),
                    PathNode.LineTo(232.62f, 153.64f),
                    PathNode.CurveTo(235.86852f, 153.89606f, 238.63708f, 156.09685f, 239.6193f, 159.20389f),
                    PathNode.CurveTo(240.6015f, 162.31093f, 239.60104f, 165.7032f, 237.09f, 167.78f),
                    PathNode.Close,
                    PathNode.MoveTo(128.56f, 208.0f),
                    PathNode.CurveTo(128.56f, 212.41827f, 124.97828f, 216.0f, 120.56f, 216.0f),
                    PathNode.LineTo(39.38f, 216.0f),
                    PathNode.CurveTo(30.890429f, 215.98898f, 24.011019f, 209.10957f, 24.0f, 200.62f),
                    PathNode.LineTo(24.0f, 56.0f),
                    PathNode.CurveTo(24.0f, 47.163445f, 31.163445f, 40.0f, 40.0f, 40.0f),
                    PathNode.LineTo(92.69f, 40.0f),
                    PathNode.CurveTo(96.93579f, 39.986435f, 101.00975f, 41.67581f, 104.0f, 44.69f),
                    PathNode.LineTo(131.31f, 72.0f),
                    PathNode.LineTo(216.0f, 72.0f),
                    PathNode.CurveTo(224.83656f, 72.0f, 232.0f, 79.163445f, 232.0f, 88.0f),
                    PathNode.LineTo(232.0f, 120.0f),
                    PathNode.CurveTo(232.0f, 124.41828f, 228.41827f, 128.0f, 224.0f, 128.0f),
                    PathNode.CurveTo(219.58173f, 128.0f, 216.0f, 124.41828f, 216.0f, 120.0f),
                    PathNode.LineTo(216.0f, 88.0f),
                    PathNode.LineTo(40.0f, 88.0f),
                    PathNode.LineTo(40.0f, 200.0f),
                    PathNode.LineTo(120.56f, 200.0f),
                    PathNode.CurveTo(124.97828f, 200.0f, 128.56f, 203.58173f, 128.56f, 208.0f),
                    PathNode.Close,
                    PathNode.MoveTo(40.0f, 72.0f),
                    PathNode.LineTo(108.69f, 72.0f),
                    PathNode.LineTo(92.69f, 56.0f),
                    PathNode.LineTo(40.0f, 56.0f),
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
        return _folderStar!!
    }

private var _folderStar: ImageVector? = null
