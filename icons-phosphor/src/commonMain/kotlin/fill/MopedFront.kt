package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.MopedFront: ImageVector
    get() {
        if (_mopedFront != null) return _mopedFront!!
        _mopedFront = phosphorFillIcon(
            name = "MopedFront",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(208.0f, 40.0f),
                    PathNode.LineTo(167.2f, 40.0f),
                    PathNode.CurveTo(163.41446f, 21.357409f, 147.02306f, 7.9599f, 128.0f, 7.9599f),
                    PathNode.CurveTo(108.976944f, 7.9599f, 92.58554f, 21.357409f, 88.8f, 40.0f),
                    PathNode.LineTo(48.0f, 40.0f),
                    PathNode.CurveTo(43.581722f, 40.0f, 40.0f, 43.581722f, 40.0f, 48.0f),
                    PathNode.CurveTo(40.0f, 52.418278f, 43.581722f, 56.0f, 48.0f, 56.0f),
                    PathNode.LineTo(88.8f, 56.0f),
                    PathNode.CurveTo(90.534294f, 64.43822f, 94.94644f, 72.09107f, 101.38f, 77.82f),
                    PathNode.CurveTo(78.6269f, 88.24885f, 64.028336f, 110.97074f, 64.0f, 136.0f),
                    PathNode.LineTo(64.0f, 200.0f),
                    PathNode.CurveTo(64.0f, 208.83656f, 71.163445f, 216.0f, 80.0f, 216.0f),
                    PathNode.LineTo(96.0f, 216.0f),
                    PathNode.CurveTo(96.0f, 233.67311f, 110.32689f, 248.0f, 128.0f, 248.0f),
                    PathNode.CurveTo(145.67311f, 248.0f, 160.0f, 233.67311f, 160.0f, 216.0f),
                    PathNode.LineTo(176.0f, 216.0f),
                    PathNode.CurveTo(184.83656f, 216.0f, 192.0f, 208.83656f, 192.0f, 200.0f),
                    PathNode.LineTo(192.0f, 136.0f),
                    PathNode.CurveTo(191.97166f, 110.97074f, 177.37311f, 88.24885f, 154.62f, 77.82f),
                    PathNode.CurveTo(161.05356f, 72.09107f, 165.4657f, 64.43822f, 167.2f, 56.0f),
                    PathNode.LineTo(208.0f, 56.0f),
                    PathNode.CurveTo(212.41827f, 56.0f, 216.0f, 52.418278f, 216.0f, 48.0f),
                    PathNode.CurveTo(216.0f, 43.581722f, 212.41827f, 40.0f, 208.0f, 40.0f),
                    PathNode.Close,
                    PathNode.MoveTo(144.0f, 216.0f),
                    PathNode.CurveTo(144.0f, 224.83656f, 136.83656f, 232.0f, 128.0f, 232.0f),
                    PathNode.CurveTo(119.163445f, 232.0f, 112.0f, 224.83656f, 112.0f, 216.0f),
                    PathNode.LineTo(112.0f, 168.0f),
                    PathNode.CurveTo(112.0f, 159.16344f, 119.163445f, 152.0f, 128.0f, 152.0f),
                    PathNode.CurveTo(136.83656f, 152.0f, 144.0f, 159.16344f, 144.0f, 168.0f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 72.0f),
                    PathNode.CurveTo(114.74516f, 72.0f, 104.0f, 61.254833f, 104.0f, 48.0f),
                    PathNode.CurveTo(104.0f, 34.745167f, 114.74516f, 24.0f, 128.0f, 24.0f),
                    PathNode.CurveTo(141.25484f, 24.0f, 152.0f, 34.745167f, 152.0f, 48.0f),
                    PathNode.CurveTo(152.0f, 61.254833f, 141.25484f, 72.0f, 128.0f, 72.0f),
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
        return _mopedFront!!
    }

private var _mopedFront: ImageVector? = null
