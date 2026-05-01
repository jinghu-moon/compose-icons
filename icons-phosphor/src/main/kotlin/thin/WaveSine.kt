package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.WaveSine: ImageVector
    get() {
        if (_waveSine != null) return _waveSine!!
        _waveSine = phosphorThinIcon(
            name = "WaveSine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(235.62f, 129.7f),
                    PathNode.CurveTo(214.4f, 174.93f, 196.1f, 196.0f, 178.0f, 196.0f),
                    PathNode.CurveTo(155.44f, 196.0f, 140.33f, 163.79f, 124.34f, 129.7f),
                    PathNode.CurveTo(110.15f, 99.37f, 95.44f, 68.0f, 78.0f, 68.0f),
                    PathNode.CurveTo(63.8f, 68.0f, 46.87f, 88.76f, 27.66f, 129.7f),
                    PathNode.CurveTo(26.696598f, 131.65553f, 24.34473f, 132.47955f, 22.371511f, 131.5529f),
                    PathNode.CurveTo(20.398294f, 130.62625f, 19.530428f, 128.2902f, 20.42f, 126.3f),
                    PathNode.CurveTo(41.6f, 81.07f, 59.9f, 60.0f, 78.0f, 60.0f),
                    PathNode.CurveTo(100.56f, 60.0f, 115.67f, 92.21f, 131.66f, 126.3f),
                    PathNode.CurveTo(145.85f, 156.63f, 160.56f, 188.0f, 178.0f, 188.0f),
                    PathNode.CurveTo(192.2f, 188.0f, 209.13f, 167.24f, 228.34f, 126.3f),
                    PathNode.CurveTo(229.3034f, 124.34447f, 231.65527f, 123.520454f, 233.6285f, 124.447105f),
                    PathNode.CurveTo(235.6017f, 125.37375f, 236.46957f, 127.70979f, 235.58f, 129.7f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 8.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _waveSine!!
    }

private var _waveSine: ImageVector? = null
