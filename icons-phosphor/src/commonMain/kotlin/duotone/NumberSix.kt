package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.NumberSix: ImageVector
    get() {
        if (_numberSix != null) return _numberSix!!
        _numberSix = phosphorDuotoneIcon(
            name = "NumberSix",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(216.0f, 40.0f),
                    PathNode.LineTo(216.0f, 216.0f),
                    PathNode.CurveTo(216.0f, 224.83656f, 208.83656f, 232.0f, 200.0f, 232.0f),
                    PathNode.LineTo(56.0f, 232.0f),
                    PathNode.CurveTo(47.163445f, 232.0f, 40.0f, 224.83656f, 40.0f, 216.0f),
                    PathNode.LineTo(40.0f, 40.0f),
                    PathNode.CurveTo(40.0f, 31.163445f, 47.163445f, 24.0f, 56.0f, 24.0f),
                    PathNode.LineTo(200.0f, 24.0f),
                    PathNode.CurveTo(208.83656f, 24.0f, 216.0f, 31.163445f, 216.0f, 40.0f),
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
                    PathNode.MoveTo(128.0f, 104.0f),
                    PathNode.CurveTo(122.71417f, 104.002426f, 117.45533f, 104.753204f, 112.38f, 106.23f),
                    PathNode.LineTo(143.0f, 51.93f),
                    PathNode.CurveTo(145.16772f, 48.064007f, 143.79102f, 43.17272f, 139.925f, 41.005f),
                    PathNode.CurveTo(136.059f, 38.83728f, 131.16772f, 40.21401f, 129.0f, 44.08f),
                    PathNode.LineTo(79.45f, 132.08f),
                    PathNode.CurveTo(66.817825f, 154.04312f, 70.506f, 181.75165f, 88.4434f, 199.64577f),
                    PathNode.CurveTo(106.3808f, 217.5399f, 134.09816f, 221.16113f, 156.03069f, 208.47594f),
                    PathNode.CurveTo(177.96323f, 195.79076f, 188.64624f, 169.95981f, 182.08064f, 145.48853f),
                    PathNode.CurveTo(175.51506f, 121.01726f, 153.33673f, 104.00293f, 128.0f, 104.0f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 200.0f),
                    PathNode.CurveTo(105.90861f, 200.0f, 88.0f, 182.09138f, 88.0f, 160.0f),
                    PathNode.CurveTo(88.0f, 137.90862f, 105.90861f, 120.0f, 128.0f, 120.0f),
                    PathNode.CurveTo(150.09138f, 120.0f, 168.0f, 137.90862f, 168.0f, 160.0f),
                    PathNode.CurveTo(168.0f, 182.09138f, 150.09138f, 200.0f, 128.0f, 200.0f),
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
        return _numberSix!!
    }

private var _numberSix: ImageVector? = null
