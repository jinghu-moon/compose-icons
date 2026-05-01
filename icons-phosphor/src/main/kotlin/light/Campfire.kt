package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Campfire: ImageVector
    get() {
        if (_campfire != null) return _campfire!!
        _campfire = phosphorLightIcon(
            name = "Campfire",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(221.72f, 225.82f),
                    PathNode.CurveTo(221.23788f, 227.33746f, 220.17241f, 228.60104f, 218.75821f, 229.33253f),
                    PathNode.CurveTo(217.344f, 230.06401f, 215.69704f, 230.20338f, 214.18f, 229.72f),
                    PathNode.LineTo(128.0f, 202.3f),
                    PathNode.LineTo(41.82f, 229.72f),
                    PathNode.CurveTo(38.66093f, 230.72516f, 35.28516f, 228.97906f, 34.28f, 225.82f),
                    PathNode.CurveTo(33.27484f, 222.66093f, 35.02093f, 219.28516f, 38.18f, 218.28f),
                    PathNode.LineTo(108.18f, 196.0f),
                    PathNode.LineTo(38.18f, 173.72f),
                    PathNode.CurveTo(35.02093f, 172.71484f, 33.27484f, 169.33907f, 34.28f, 166.18f),
                    PathNode.CurveTo(35.28516f, 163.02094f, 38.66093f, 161.27484f, 41.82f, 162.28f),
                    PathNode.LineTo(128.0f, 189.7f),
                    PathNode.LineTo(214.18f, 162.28f),
                    PathNode.CurveTo(217.33907f, 161.27484f, 220.71484f, 163.02094f, 221.72f, 166.18f),
                    PathNode.CurveTo(222.72516f, 169.33907f, 220.97906f, 172.71484f, 217.82f, 173.72f),
                    PathNode.LineTo(147.82f, 196.0f),
                    PathNode.LineTo(217.82f, 218.28f),
                    PathNode.CurveTo(219.33746f, 218.76212f, 220.60104f, 219.82759f, 221.33253f, 221.24179f),
                    PathNode.CurveTo(222.06401f, 222.656f, 222.20338f, 224.30296f, 221.72f, 225.82f),
                    PathNode.Close,
                    PathNode.MoveTo(70.0f, 108.0f),
                    PathNode.CurveTo(70.0f, 61.19f, 122.62f, 28.27f, 124.86f, 26.89f),
                    PathNode.CurveTo(126.7862f, 25.707024f, 129.21379f, 25.707024f, 131.14f, 26.89f),
                    PathNode.CurveTo(133.38f, 28.27f, 186.0f, 61.19f, 186.0f, 108.0f),
                    PathNode.CurveTo(186.0f, 140.03252f, 160.03252f, 166.0f, 128.0f, 166.0f),
                    PathNode.CurveTo(95.96748f, 166.0f, 70.0f, 140.03252f, 70.0f, 108.0f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 154.0f),
                    PathNode.CurveTo(137.94113f, 154.0f, 146.0f, 145.94113f, 146.0f, 136.0f),
                    PathNode.CurveTo(146.0f, 120.52f, 134.0f, 108.57f, 128.0f, 103.56f),
                    PathNode.CurveTo(122.0f, 108.56f, 110.0f, 120.56f, 110.0f, 136.0f),
                    PathNode.CurveTo(110.0f, 145.94113f, 118.05888f, 154.0f, 128.0f, 154.0f),
                    PathNode.Close,
                    PathNode.MoveTo(82.0f, 108.0f),
                    PathNode.CurveTo(82.001144f, 121.844444f, 88.247025f, 134.94978f, 99.0f, 143.67f),
                    PathNode.CurveTo(98.33565f, 141.16748f, 97.9995f, 138.5892f, 98.0f, 136.0f),
                    PathNode.CurveTo(98.0f, 109.1f, 123.58f, 91.73f, 124.67f, 91.0f),
                    PathNode.CurveTo(126.68622f, 89.6548f, 129.31378f, 89.6548f, 131.33f, 91.0f),
                    PathNode.CurveTo(132.42f, 91.72f, 158.0f, 109.09f, 158.0f, 136.0f),
                    PathNode.CurveTo(158.0005f, 138.5892f, 157.66435f, 141.16748f, 157.0f, 143.67f),
                    PathNode.CurveTo(167.75298f, 134.94978f, 173.99886f, 121.844444f, 174.0f, 108.0f),
                    PathNode.CurveTo(174.0f, 73.94f, 138.85f, 46.78f, 128.0f, 39.22f),
                    PathNode.CurveTo(117.15f, 46.78f, 82.0f, 73.93f, 82.0f, 108.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 12.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _campfire!!
    }

private var _campfire: ImageVector? = null
