package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Rewind: ImageVector
    get() {
        if (_rewind != null) return _rewind!!
        _rewind = phosphorBoldIcon(
            name = "Rewind",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(225.7f, 54.46f),
                    PathNode.CurveTo(219.30907f, 50.96023f, 211.5205f, 51.21308f, 205.37f, 55.12f),
                    PathNode.LineTo(132.0f, 101.85f),
                    PathNode.LineTo(132.0f, 71.85f),
                    PathNode.CurveTo(131.97899f, 64.587006f, 128.00468f, 57.91171f, 121.62962f, 54.431755f),
                    PathNode.CurveTo(115.25456f, 50.951797f, 107.49035f, 51.21939f, 101.37f, 55.13f),
                    PathNode.LineTo(13.19f, 111.29f),
                    PathNode.CurveTo(7.469048f, 114.92006f, 4.00283f, 121.22455f, 4.00283f, 128.0f),
                    PathNode.CurveTo(4.00283f, 134.77544f, 7.469048f, 141.07994f, 13.19f, 144.71f),
                    PathNode.LineTo(101.37f, 200.88f),
                    PathNode.CurveTo(107.49035f, 204.7906f, 115.25456f, 205.0582f, 121.62962f, 201.57825f),
                    PathNode.CurveTo(128.00468f, 198.0983f, 131.97899f, 191.42299f, 132.0f, 184.16f),
                    PathNode.LineTo(132.0f, 154.16f),
                    PathNode.LineTo(205.37f, 200.89f),
                    PathNode.CurveTo(211.49185f, 204.80156f, 219.25824f, 205.06824f, 225.63399f, 201.58583f),
                    PathNode.CurveTo(232.00975f, 198.10341f, 235.98262f, 191.42479f, 236.0f, 184.16f),
                    PathNode.LineTo(236.0f, 71.84f),
                    PathNode.CurveTo(235.99425f, 64.601494f, 232.04675f, 57.94061f, 225.7f, 54.46f),
                    PathNode.Close,
                    PathNode.MoveTo(108.0f, 176.64f),
                    PathNode.LineTo(31.63f, 128.0f),
                    PathNode.LineTo(108.0f, 79.36f),
                    PathNode.Close,
                    PathNode.MoveTo(212.0f, 176.64f),
                    PathNode.LineTo(135.63f, 128.0f),
                    PathNode.LineTo(212.0f, 79.36f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 24.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _rewind!!
    }

private var _rewind: ImageVector? = null
