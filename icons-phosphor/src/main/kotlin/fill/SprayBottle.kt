package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.SprayBottle: ImageVector
    get() {
        if (_sprayBottle != null) return _sprayBottle!!
        _sprayBottle = phosphorFillIcon(
            name = "SprayBottle",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(200.0f, 80.0f),
                    PathNode.CurveTo(204.41827f, 80.0f, 208.0f, 76.41828f, 208.0f, 72.0f),
                    PathNode.CurveTo(207.96693f, 41.085766f, 182.91423f, 16.03307f, 152.0f, 16.0f),
                    PathNode.LineTo(80.0f, 16.0f),
                    PathNode.CurveTo(71.163445f, 16.0f, 64.0f, 23.163445f, 64.0f, 32.0f),
                    PathNode.LineTo(64.0f, 80.0f),
                    PathNode.CurveTo(64.0f, 93.25484f, 53.254833f, 104.0f, 40.0f, 104.0f),
                    PathNode.CurveTo(35.581722f, 104.0f, 32.0f, 107.58172f, 32.0f, 112.0f),
                    PathNode.CurveTo(32.0f, 116.41828f, 35.581722f, 120.0f, 40.0f, 120.0f),
                    PathNode.CurveTo(62.09139f, 120.0f, 80.0f, 102.09139f, 80.0f, 80.0f),
                    PathNode.LineTo(112.0f, 80.0f),
                    PathNode.LineTo(112.0f, 104.62f),
                    PathNode.CurveTo(112.02062f, 111.91361f, 108.70551f, 118.8164f, 103.0f, 123.36f),
                    PathNode.LineTo(87.0f, 136.15f),
                    PathNode.CurveTo(77.492516f, 143.72256f, 71.96764f, 155.22537f, 72.0f, 167.38f),
                    PathNode.LineTo(72.0f, 224.0f),
                    PathNode.CurveTo(72.0f, 232.83656f, 79.163445f, 240.0f, 88.0f, 240.0f),
                    PathNode.LineTo(192.0f, 240.0f),
                    PathNode.CurveTo(200.83656f, 240.0f, 208.0f, 232.83656f, 208.0f, 224.0f),
                    PathNode.LineTo(208.0f, 211.47f),
                    PathNode.CurveTo(208.01326f, 165.47067f, 196.31226f, 120.22564f, 174.0f, 80.0f),
                    PathNode.Close,
                    PathNode.MoveTo(80.0f, 32.0f),
                    PathNode.LineTo(152.0f, 32.0f),
                    PathNode.CurveTo(170.99971f, 32.027073f, 187.36972f, 45.39036f, 191.2f, 64.0f),
                    PathNode.LineTo(80.0f, 64.0f),
                    PathNode.Close
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
        return _sprayBottle!!
    }

private var _sprayBottle: ImageVector? = null
