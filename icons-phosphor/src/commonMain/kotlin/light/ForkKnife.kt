package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.ForkKnife: ImageVector
    get() {
        if (_forkKnife != null) return _forkKnife!!
        _forkKnife = phosphorLightIcon(
            name = "ForkKnife",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(74.0f, 88.0f),
                    PathNode.LineTo(74.0f, 40.0f),
                    PathNode.CurveTo(74.0f, 36.68629f, 76.686295f, 34.0f, 80.0f, 34.0f),
                    PathNode.CurveTo(83.313705f, 34.0f, 86.0f, 36.68629f, 86.0f, 40.0f),
                    PathNode.LineTo(86.0f, 88.0f),
                    PathNode.CurveTo(86.0f, 91.313705f, 83.313705f, 94.0f, 80.0f, 94.0f),
                    PathNode.CurveTo(76.686295f, 94.0f, 74.0f, 91.313705f, 74.0f, 88.0f),
                    PathNode.Close,
                    PathNode.MoveTo(214.0f, 40.0f),
                    PathNode.LineTo(214.0f, 224.0f),
                    PathNode.CurveTo(214.0f, 227.3137f, 211.3137f, 230.0f, 208.0f, 230.0f),
                    PathNode.CurveTo(204.6863f, 230.0f, 202.0f, 227.3137f, 202.0f, 224.0f),
                    PathNode.LineTo(202.0f, 174.0f),
                    PathNode.LineTo(152.0f, 174.0f),
                    PathNode.CurveTo(148.6863f, 174.0f, 146.0f, 171.3137f, 146.0f, 168.0f),
                    PathNode.CurveTo(146.0f, 163.59f, 146.68f, 59.75f, 205.64f, 34.49f),
                    PathNode.CurveTo(207.49263f, 33.69741f, 209.61942f, 33.887714f, 211.30186f, 34.996624f),
                    PathNode.CurveTo(212.98434f, 36.105534f, 213.99785f, 37.98495f, 214.0f, 40.0f),
                    PathNode.Close,
                    PathNode.MoveTo(202.0f, 50.0f),
                    PathNode.CurveTo(165.21f, 74.29f, 159.18f, 141.48f, 158.19f, 162.0f),
                    PathNode.LineTo(202.0f, 162.0f),
                    PathNode.Close,
                    PathNode.MoveTo(117.92f, 39.0f),
                    PathNode.CurveTo(117.367714f, 35.730473f, 114.26952f, 33.527714f, 111.0f, 34.08f),
                    PathNode.CurveTo(107.73048f, 34.63229f, 105.52772f, 37.730473f, 106.08f, 41.0f),
                    PathNode.LineTo(114.0f, 88.48f),
                    PathNode.CurveTo(114.0f, 107.25768f, 98.77768f, 122.48f, 80.0f, 122.48f),
                    PathNode.CurveTo(61.222317f, 122.48f, 46.0f, 107.25768f, 46.0f, 88.48f),
                    PathNode.LineTo(53.92f, 41.0f),
                    PathNode.CurveTo(54.472286f, 37.730473f, 52.269527f, 34.63229f, 49.0f, 34.08f),
                    PathNode.CurveTo(45.730473f, 33.527714f, 42.63229f, 35.730473f, 42.08f, 39.0f),
                    PathNode.LineTo(34.08f, 87.0f),
                    PathNode.CurveTo(34.02804f, 87.330826f, 34.001297f, 87.66512f, 34.0f, 88.0f),
                    PathNode.CurveTo(34.029865f, 111.07325f, 51.1273f, 130.56433f, 74.0f, 133.6f),
                    PathNode.LineTo(74.0f, 224.0f),
                    PathNode.CurveTo(74.0f, 227.3137f, 76.686295f, 230.0f, 80.0f, 230.0f),
                    PathNode.CurveTo(83.313705f, 230.0f, 86.0f, 227.3137f, 86.0f, 224.0f),
                    PathNode.LineTo(86.0f, 133.6f),
                    PathNode.CurveTo(108.872696f, 130.56433f, 125.97014f, 111.07325f, 126.0f, 88.0f),
                    PathNode.CurveTo(125.9987f, 87.66512f, 125.97196f, 87.330826f, 125.92f, 87.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 12.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _forkKnife!!
    }

private var _forkKnife: ImageVector? = null
