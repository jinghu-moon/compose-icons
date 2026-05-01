package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Crane: ImageVector
    get() {
        if (_crane != null) return _crane!!
        _crane = phosphorFillIcon(
            name = "Crane",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(228.12f, 17.14f),
                    PathNode.CurveTo(225.71072f, 15.694114f, 222.71954f, 15.618195f, 220.24f, 16.94f),
                    PathNode.LineTo(102.0f, 80.0f),
                    PathNode.LineTo(32.0f, 80.0f),
                    PathNode.CurveTo(23.163445f, 80.0f, 16.0f, 87.163445f, 16.0f, 96.0f),
                    PathNode.LineTo(16.0f, 200.0f),
                    PathNode.CurveTo(16.0f, 208.83656f, 23.163445f, 216.0f, 32.0f, 216.0f),
                    PathNode.LineTo(120.0f, 216.0f),
                    PathNode.CurveTo(128.83656f, 216.0f, 136.0f, 208.83656f, 136.0f, 200.0f),
                    PathNode.LineTo(136.0f, 168.0f),
                    PathNode.CurveTo(135.99861f, 167.64853f, 135.97188f, 167.29762f, 135.92f, 166.95f),
                    PathNode.LineTo(135.92f, 166.71f),
                    PathNode.CurveTo(135.8645f, 166.37299f, 135.79108f, 166.03918f, 135.7f, 165.71f),
                    PathNode.CurveTo(135.70473f, 165.69366f, 135.70473f, 165.67633f, 135.7f, 165.66f),
                    PathNode.LineTo(135.7f, 165.66f),
                    PathNode.CurveTo(135.69873f, 165.63669f, 135.69873f, 165.61331f, 135.7f, 165.59f),
                    PathNode.LineTo(113.54f, 92.0f),
                    PathNode.LineTo(216.0f, 37.33f),
                    PathNode.LineTo(216.0f, 160.0f),
                    PathNode.LineTo(200.0f, 160.0f),
                    PathNode.LineTo(200.0f, 152.0f),
                    PathNode.CurveTo(200.0f, 147.58173f, 196.41827f, 144.0f, 192.0f, 144.0f),
                    PathNode.CurveTo(187.58173f, 144.0f, 184.0f, 147.58173f, 184.0f, 152.0f),
                    PathNode.LineTo(184.0f, 160.0f),
                    PathNode.CurveTo(184.0f, 168.83656f, 191.16344f, 176.0f, 200.0f, 176.0f),
                    PathNode.LineTo(216.0f, 176.0f),
                    PathNode.CurveTo(224.83656f, 176.0f, 232.0f, 168.83656f, 232.0f, 160.0f),
                    PathNode.LineTo(232.0f, 24.0f),
                    PathNode.CurveTo(232.00087f, 21.19069f, 230.5281f, 18.586794f, 228.12f, 17.14f),
                    PathNode.Close,
                    PathNode.MoveTo(48.0f, 96.0f),
                    PathNode.LineTo(48.0f, 160.0f),
                    PathNode.LineTo(32.0f, 160.0f),
                    PathNode.LineTo(32.0f, 96.0f),
                    PathNode.Close,
                    PathNode.MoveTo(32.0f, 200.0f),
                    PathNode.LineTo(32.0f, 200.0f),
                    PathNode.LineTo(32.0f, 176.0f),
                    PathNode.LineTo(120.0f, 176.0f),
                    PathNode.LineTo(120.0f, 200.0f),
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
        return _crane!!
    }

private var _crane: ImageVector? = null
