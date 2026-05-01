package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.WaveSine: ImageVector
    get() {
        if (_waveSine != null) return _waveSine!!
        _waveSine = phosphorRegularIcon(
            name = "WaveSine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(239.24f, 131.4f),
                    PathNode.CurveTo(217.24f, 178.2f, 197.84f, 200.0f, 178.04f, 200.0f),
                    PathNode.CurveTo(152.94f, 200.0f, 137.31f, 166.68f, 120.76f, 131.4f),
                    PathNode.CurveTo(107.7f, 103.56f, 92.9f, 72.0f, 78.0f, 72.0f),
                    PathNode.CurveTo(61.6f, 72.0f, 41.69f, 109.21f, 31.28f, 131.4f),
                    PathNode.CurveTo(29.353195f, 135.31107f, 24.64946f, 136.95909f, 20.703024f, 135.10579f),
                    PathNode.CurveTo(16.756588f, 133.2525f, 15.020857f, 128.58041f, 16.8f, 124.6f),
                    PathNode.CurveTo(38.71f, 77.8f, 58.16f, 56.0f, 78.0f, 56.0f),
                    PathNode.CurveTo(103.1f, 56.0f, 118.73f, 89.32f, 135.28f, 124.6f),
                    PathNode.CurveTo(148.3f, 152.44f, 163.1f, 184.0f, 178.0f, 184.0f),
                    PathNode.CurveTo(194.4f, 184.0f, 214.31f, 146.79f, 224.72f, 124.6f),
                    PathNode.CurveTo(226.6468f, 120.68893f, 231.35054f, 119.04091f, 235.29698f, 120.8942f),
                    PathNode.CurveTo(239.24341f, 122.747505f, 240.97914f, 127.419586f, 239.2f, 131.4f),
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
        return _waveSine!!
    }

private var _waveSine: ImageVector? = null
