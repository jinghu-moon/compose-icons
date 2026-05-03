package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.CourtBasketball: ImageVector
    get() {
        if (_courtBasketball != null) return _courtBasketball!!
        _courtBasketball = phosphorDuotoneIcon(
            name = "CourtBasketball",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(232.0f, 88.0f),
                    PathNode.LineTo(232.0f, 168.0f),
                    PathNode.LineTo(216.0f, 168.0f),
                    PathNode.CurveTo(193.90862f, 168.0f, 176.0f, 150.09138f, 176.0f, 128.0f),
                    PathNode.CurveTo(176.0f, 105.90861f, 193.90862f, 88.0f, 216.0f, 88.0f),
                    PathNode.Close,
                    PathNode.MoveTo(40.0f, 88.0f),
                    PathNode.LineTo(24.0f, 88.0f),
                    PathNode.LineTo(24.0f, 168.0f),
                    PathNode.LineTo(40.0f, 168.0f),
                    PathNode.CurveTo(62.09139f, 168.0f, 80.0f, 150.09138f, 80.0f, 128.0f),
                    PathNode.CurveTo(80.0f, 105.90861f, 62.09139f, 88.0f, 40.0f, 88.0f),
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
                    PathNode.MoveTo(224.0f, 160.0f),
                    PathNode.LineTo(216.0f, 160.0f),
                    PathNode.CurveTo(198.32689f, 160.0f, 184.0f, 145.67311f, 184.0f, 128.0f),
                    PathNode.CurveTo(184.0f, 110.32689f, 198.32689f, 96.0f, 216.0f, 96.0f),
                    PathNode.LineTo(224.0f, 96.0f),
                    PathNode.Close,
                    PathNode.MoveTo(32.0f, 96.0f),
                    PathNode.LineTo(40.0f, 96.0f),
                    PathNode.CurveTo(57.67311f, 96.0f, 72.0f, 110.32689f, 72.0f, 128.0f),
                    PathNode.CurveTo(72.0f, 145.67311f, 57.67311f, 160.0f, 40.0f, 160.0f),
                    PathNode.LineTo(32.0f, 160.0f),
                    PathNode.Close,
                    PathNode.MoveTo(32.0f, 176.0f),
                    PathNode.LineTo(40.0f, 176.0f),
                    PathNode.CurveTo(66.50967f, 176.0f, 88.0f, 154.50967f, 88.0f, 128.0f),
                    PathNode.CurveTo(88.0f, 101.49033f, 66.50967f, 80.0f, 40.0f, 80.0f),
                    PathNode.LineTo(32.0f, 80.0f),
                    PathNode.LineTo(32.0f, 64.0f),
                    PathNode.LineTo(120.0f, 64.0f),
                    PathNode.LineTo(120.0f, 192.0f),
                    PathNode.LineTo(32.0f, 192.0f),
                    PathNode.Close,
                    PathNode.MoveTo(224.0f, 192.0f),
                    PathNode.LineTo(136.0f, 192.0f),
                    PathNode.LineTo(136.0f, 64.0f),
                    PathNode.LineTo(224.0f, 64.0f),
                    PathNode.LineTo(224.0f, 80.0f),
                    PathNode.LineTo(216.0f, 80.0f),
                    PathNode.CurveTo(189.49033f, 80.0f, 168.0f, 101.49033f, 168.0f, 128.0f),
                    PathNode.CurveTo(168.0f, 154.50967f, 189.49033f, 176.0f, 216.0f, 176.0f),
                    PathNode.LineTo(224.0f, 176.0f),
                    PathNode.LineTo(224.0f, 192.0f),
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
        return _courtBasketball!!
    }

private var _courtBasketball: ImageVector? = null
