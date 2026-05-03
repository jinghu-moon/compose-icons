package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.DotsThreeOutlineVertical: ImageVector
    get() {
        if (_dotsThreeOutlineVertical != null) return _dotsThreeOutlineVertical!!
        _dotsThreeOutlineVertical = phosphorDuotoneIcon(
            name = "DotsThreeOutlineVertical",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(152.0f, 128.0f),
                    PathNode.CurveTo(152.0f, 141.25484f, 141.25484f, 152.0f, 128.0f, 152.0f),
                    PathNode.CurveTo(114.74516f, 152.0f, 104.0f, 141.25484f, 104.0f, 128.0f),
                    PathNode.CurveTo(104.0f, 114.74516f, 114.74516f, 104.0f, 128.0f, 104.0f),
                    PathNode.CurveTo(141.25484f, 104.0f, 152.0f, 114.74516f, 152.0f, 128.0f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 72.0f),
                    PathNode.CurveTo(141.25484f, 72.0f, 152.0f, 61.254833f, 152.0f, 48.0f),
                    PathNode.CurveTo(152.0f, 34.745167f, 141.25484f, 24.0f, 128.0f, 24.0f),
                    PathNode.CurveTo(114.74516f, 24.0f, 104.0f, 34.745167f, 104.0f, 48.0f),
                    PathNode.CurveTo(104.0f, 61.254833f, 114.74516f, 72.0f, 128.0f, 72.0f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 184.0f),
                    PathNode.CurveTo(114.74516f, 184.0f, 104.0f, 194.74516f, 104.0f, 208.0f),
                    PathNode.CurveTo(104.0f, 221.25484f, 114.74516f, 232.0f, 128.0f, 232.0f),
                    PathNode.CurveTo(141.25484f, 232.0f, 152.0f, 221.25484f, 152.0f, 208.0f),
                    PathNode.CurveTo(152.0f, 194.74516f, 141.25484f, 184.0f, 128.0f, 184.0f),
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
                    PathNode.MoveTo(128.0f, 96.0f),
                    PathNode.CurveTo(110.32689f, 96.0f, 96.0f, 110.32689f, 96.0f, 128.0f),
                    PathNode.CurveTo(96.0f, 145.67311f, 110.32689f, 160.0f, 128.0f, 160.0f),
                    PathNode.CurveTo(145.67311f, 160.0f, 160.0f, 145.67311f, 160.0f, 128.0f),
                    PathNode.CurveTo(160.0f, 110.32689f, 145.67311f, 96.0f, 128.0f, 96.0f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 144.0f),
                    PathNode.CurveTo(119.163445f, 144.0f, 112.0f, 136.83656f, 112.0f, 128.0f),
                    PathNode.CurveTo(112.0f, 119.163445f, 119.163445f, 112.0f, 128.0f, 112.0f),
                    PathNode.CurveTo(136.83656f, 112.0f, 144.0f, 119.163445f, 144.0f, 128.0f),
                    PathNode.CurveTo(144.0f, 136.83656f, 136.83656f, 144.0f, 128.0f, 144.0f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 80.0f),
                    PathNode.CurveTo(145.67311f, 80.0f, 160.0f, 65.67311f, 160.0f, 48.0f),
                    PathNode.CurveTo(160.0f, 30.326887f, 145.67311f, 16.0f, 128.0f, 16.0f),
                    PathNode.CurveTo(110.32689f, 16.0f, 96.0f, 30.326887f, 96.0f, 48.0f),
                    PathNode.CurveTo(96.0f, 65.67311f, 110.32689f, 80.0f, 128.0f, 80.0f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 32.0f),
                    PathNode.CurveTo(136.83656f, 32.0f, 144.0f, 39.163445f, 144.0f, 48.0f),
                    PathNode.CurveTo(144.0f, 56.836555f, 136.83656f, 64.0f, 128.0f, 64.0f),
                    PathNode.CurveTo(119.163445f, 64.0f, 112.0f, 56.836555f, 112.0f, 48.0f),
                    PathNode.CurveTo(112.0f, 39.163445f, 119.163445f, 32.0f, 128.0f, 32.0f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 176.0f),
                    PathNode.CurveTo(110.32689f, 176.0f, 96.0f, 190.32689f, 96.0f, 208.0f),
                    PathNode.CurveTo(96.0f, 225.67311f, 110.32689f, 240.0f, 128.0f, 240.0f),
                    PathNode.CurveTo(145.67311f, 240.0f, 160.0f, 225.67311f, 160.0f, 208.0f),
                    PathNode.CurveTo(160.0f, 190.32689f, 145.67311f, 176.0f, 128.0f, 176.0f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 224.0f),
                    PathNode.CurveTo(119.163445f, 224.0f, 112.0f, 216.83656f, 112.0f, 208.0f),
                    PathNode.CurveTo(112.0f, 199.16344f, 119.163445f, 192.0f, 128.0f, 192.0f),
                    PathNode.CurveTo(136.83656f, 192.0f, 144.0f, 199.16344f, 144.0f, 208.0f),
                    PathNode.CurveTo(144.0f, 216.83656f, 136.83656f, 224.0f, 128.0f, 224.0f),
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
        return _dotsThreeOutlineVertical!!
    }

private var _dotsThreeOutlineVertical: ImageVector? = null
