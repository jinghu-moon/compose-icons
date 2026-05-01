package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.FolderUser: ImageVector
    get() {
        if (_folderUser != null) return _folderUser!!
        _folderUser = phosphorDuotoneIcon(
            name = "FolderUser",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(216.0f, 176.0f),
                    PathNode.CurveTo(216.0f, 189.25484f, 205.25484f, 200.0f, 192.0f, 200.0f),
                    PathNode.CurveTo(178.74516f, 200.0f, 168.0f, 189.25484f, 168.0f, 176.0f),
                    PathNode.CurveTo(168.0f, 162.74516f, 178.74516f, 152.0f, 192.0f, 152.0f),
                    PathNode.CurveTo(205.25484f, 152.0f, 216.0f, 162.74516f, 216.0f, 176.0f),
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
                    PathNode.MoveTo(214.61f, 198.62f),
                    PathNode.CurveTo(223.76921f, 189.47083f, 226.51344f, 175.7043f, 221.5625f, 163.74242f),
                    PathNode.CurveTo(216.61157f, 151.78052f, 204.941f, 143.98018f, 191.995f, 143.98018f),
                    PathNode.CurveTo(179.04901f, 143.98018f, 167.37843f, 151.78052f, 162.42749f, 163.74242f),
                    PathNode.CurveTo(157.47656f, 175.7043f, 160.22078f, 189.47083f, 169.38f, 198.62f),
                    PathNode.CurveTo(160.96753f, 203.98701f, 154.86488f, 212.3046f, 152.27f, 221.94f),
                    PathNode.CurveTo(151.13242f, 226.20914f, 153.67091f, 230.5922f, 157.94f, 231.73f),
                    PathNode.CurveTo(158.61234f, 231.90752f, 159.30463f, 231.99825f, 160.0f, 232.0f),
                    PathNode.CurveTo(163.62769f, 231.99869f, 166.8004f, 229.55655f, 167.73f, 226.05f),
                    PathNode.CurveTo(170.56f, 215.42f, 180.54f, 208.0f, 192.0f, 208.0f),
                    PathNode.CurveTo(203.46f, 208.0f, 213.44f, 215.42f, 216.27f, 226.05f),
                    PathNode.CurveTo(216.95941f, 228.86182f, 219.11421f, 231.08179f, 221.90427f, 231.85463f),
                    PathNode.CurveTo(224.69432f, 232.62749f, 227.68422f, 231.83263f, 229.72214f, 229.77628f),
                    PathNode.CurveTo(231.76006f, 227.71992f, 232.52795f, 224.72298f, 231.73f, 221.94f),
                    PathNode.CurveTo(229.13263f, 212.303f, 223.02625f, 203.98518f, 214.61f, 198.62f),
                    PathNode.Close,
                    PathNode.MoveTo(192.0f, 160.0f),
                    PathNode.CurveTo(200.83656f, 160.0f, 208.0f, 167.16344f, 208.0f, 176.0f),
                    PathNode.CurveTo(208.0f, 184.83656f, 200.83656f, 192.0f, 192.0f, 192.0f),
                    PathNode.CurveTo(183.16344f, 192.0f, 176.0f, 184.83656f, 176.0f, 176.0f),
                    PathNode.CurveTo(176.0f, 167.16344f, 183.16344f, 160.0f, 192.0f, 160.0f),
                    PathNode.Close,
                    PathNode.MoveTo(216.0f, 72.0f),
                    PathNode.LineTo(131.31f, 72.0f),
                    PathNode.LineTo(104.0f, 44.69f),
                    PathNode.CurveTo(101.00975f, 41.67581f, 96.93579f, 39.986435f, 92.69f, 40.0f),
                    PathNode.LineTo(40.0f, 40.0f),
                    PathNode.CurveTo(31.163445f, 40.0f, 24.0f, 47.163445f, 24.0f, 56.0f),
                    PathNode.LineTo(24.0f, 200.61f),
                    PathNode.CurveTo(24.005508f, 209.10347f, 30.88653f, 215.98895f, 39.38f, 216.0f),
                    PathNode.LineTo(120.56f, 216.0f),
                    PathNode.CurveTo(124.97828f, 216.0f, 128.56f, 212.41827f, 128.56f, 208.0f),
                    PathNode.CurveTo(128.56f, 203.58173f, 124.97828f, 200.0f, 120.56f, 200.0f),
                    PathNode.LineTo(40.0f, 200.0f),
                    PathNode.LineTo(40.0f, 88.0f),
                    PathNode.LineTo(216.0f, 88.0f),
                    PathNode.LineTo(216.0f, 120.0f),
                    PathNode.CurveTo(216.0f, 124.41828f, 219.58173f, 128.0f, 224.0f, 128.0f),
                    PathNode.CurveTo(228.41827f, 128.0f, 232.0f, 124.41828f, 232.0f, 120.0f),
                    PathNode.LineTo(232.0f, 88.0f),
                    PathNode.CurveTo(232.0f, 79.163445f, 224.83656f, 72.0f, 216.0f, 72.0f),
                    PathNode.Close,
                    PathNode.MoveTo(92.69f, 56.0f),
                    PathNode.LineTo(108.69f, 72.0f),
                    PathNode.LineTo(40.0f, 72.0f),
                    PathNode.LineTo(40.0f, 56.0f),
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
        return _folderUser!!
    }

private var _folderUser: ImageVector? = null
