package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.CassetteTape: ImageVector
    get() {
        if (_cassetteTape != null) return _cassetteTape!!
        _cassetteTape = phosphorDuotoneIcon(
            name = "CassetteTape",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(168.0f, 168.0f),
                    PathNode.LineTo(192.0f, 200.0f),
                    PathNode.LineTo(64.0f, 200.0f),
                    PathNode.LineTo(88.0f, 168.0f),
                    PathNode.Close,
                    PathNode.MoveTo(176.0f, 88.0f),
                    PathNode.CurveTo(162.74516f, 88.0f, 152.0f, 98.74516f, 152.0f, 112.0f),
                    PathNode.CurveTo(152.0f, 125.25484f, 162.74516f, 136.0f, 176.0f, 136.0f),
                    PathNode.CurveTo(189.25484f, 136.0f, 200.0f, 125.25484f, 200.0f, 112.0f),
                    PathNode.CurveTo(200.0f, 98.74516f, 189.25484f, 88.0f, 176.0f, 88.0f),
                    PathNode.Close,
                    PathNode.MoveTo(104.0f, 112.0f),
                    PathNode.CurveTo(104.0f, 98.74516f, 93.25484f, 88.0f, 80.0f, 88.0f),
                    PathNode.CurveTo(66.74516f, 88.0f, 56.0f, 98.74516f, 56.0f, 112.0f),
                    PathNode.CurveTo(56.0f, 125.25484f, 66.74516f, 136.0f, 80.0f, 136.0f),
                    PathNode.CurveTo(93.25484f, 136.0f, 104.0f, 125.25484f, 104.0f, 112.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 0.2f,
                stroke = null,
                strokeAlpha = 0.2f,
                strokeLineWidth = 16.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(224.0f, 48.0f),
                    PathNode.LineTo(32.0f, 48.0f),
                    PathNode.CurveTo(23.163445f, 48.0f, 16.0f, 55.163445f, 16.0f, 64.0f),
                    PathNode.LineTo(16.0f, 192.0f),
                    PathNode.CurveTo(16.0f, 200.83656f, 23.163445f, 208.0f, 32.0f, 208.0f),
                    PathNode.LineTo(224.0f, 208.0f),
                    PathNode.CurveTo(232.83656f, 208.0f, 240.0f, 200.83656f, 240.0f, 192.0f),
                    PathNode.LineTo(240.0f, 64.0f),
                    PathNode.CurveTo(240.0f, 55.163445f, 232.83656f, 48.0f, 224.0f, 48.0f),
                    PathNode.Close,
                    PathNode.MoveTo(80.0f, 192.0f),
                    PathNode.LineTo(92.0f, 176.0f),
                    PathNode.LineTo(164.0f, 176.0f),
                    PathNode.LineTo(176.0f, 192.0f),
                    PathNode.Close,
                    PathNode.MoveTo(224.0f, 192.0f),
                    PathNode.LineTo(196.0f, 192.0f),
                    PathNode.LineTo(174.4f, 163.2f),
                    PathNode.CurveTo(172.88918f, 161.18555f, 170.51805f, 160.0f, 168.0f, 160.0f),
                    PathNode.LineTo(88.0f, 160.0f),
                    PathNode.CurveTo(85.48194f, 160.0f, 83.11083f, 161.18555f, 81.6f, 163.2f),
                    PathNode.LineTo(60.0f, 192.0f),
                    PathNode.LineTo(32.0f, 192.0f),
                    PathNode.LineTo(32.0f, 64.0f),
                    PathNode.LineTo(224.0f, 64.0f),
                    PathNode.LineTo(224.0f, 192.0f),
                    PathNode.Close,
                    PathNode.MoveTo(176.0f, 80.0f),
                    PathNode.LineTo(80.0f, 80.0f),
                    PathNode.CurveTo(62.32689f, 80.0f, 48.0f, 94.32689f, 48.0f, 112.0f),
                    PathNode.CurveTo(48.0f, 129.67311f, 62.32689f, 144.0f, 80.0f, 144.0f),
                    PathNode.LineTo(176.0f, 144.0f),
                    PathNode.CurveTo(193.67311f, 144.0f, 208.0f, 129.67311f, 208.0f, 112.0f),
                    PathNode.CurveTo(208.0f, 94.32689f, 193.67311f, 80.0f, 176.0f, 80.0f),
                    PathNode.Close,
                    PathNode.MoveTo(148.3f, 96.0f),
                    PathNode.CurveTo(142.5672f, 105.89639f, 142.5672f, 118.10361f, 148.3f, 128.0f),
                    PathNode.LineTo(107.7f, 128.0f),
                    PathNode.CurveTo(113.4328f, 118.10361f, 113.4328f, 105.89639f, 107.7f, 96.0f),
                    PathNode.Close,
                    PathNode.MoveTo(64.0f, 112.0f),
                    PathNode.CurveTo(64.0f, 103.163445f, 71.163445f, 96.0f, 80.0f, 96.0f),
                    PathNode.CurveTo(88.836555f, 96.0f, 96.0f, 103.163445f, 96.0f, 112.0f),
                    PathNode.CurveTo(96.0f, 120.836555f, 88.836555f, 128.0f, 80.0f, 128.0f),
                    PathNode.CurveTo(71.163445f, 128.0f, 64.0f, 120.836555f, 64.0f, 112.0f),
                    PathNode.Close,
                    PathNode.MoveTo(176.0f, 128.0f),
                    PathNode.CurveTo(167.16344f, 128.0f, 160.0f, 120.836555f, 160.0f, 112.0f),
                    PathNode.CurveTo(160.0f, 103.163445f, 167.16344f, 96.0f, 176.0f, 96.0f),
                    PathNode.CurveTo(184.83656f, 96.0f, 192.0f, 103.163445f, 192.0f, 112.0f),
                    PathNode.CurveTo(192.0f, 120.836555f, 184.83656f, 128.0f, 176.0f, 128.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 16.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _cassetteTape!!
    }

private var _cassetteTape: ImageVector? = null
