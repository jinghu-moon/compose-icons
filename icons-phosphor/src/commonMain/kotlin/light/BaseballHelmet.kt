package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.BaseballHelmet: ImageVector
    get() {
        if (_baseballHelmet != null) return _baseballHelmet!!
        _baseballHelmet = phosphorLightIcon(
            name = "BaseballHelmet",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(88.0f, 130.0f),
                    PathNode.CurveTo(73.640594f, 130.0f, 62.0f, 141.6406f, 62.0f, 156.0f),
                    PathNode.CurveTo(62.0f, 170.3594f, 73.640594f, 182.0f, 88.0f, 182.0f),
                    PathNode.CurveTo(102.359406f, 182.0f, 114.0f, 170.3594f, 114.0f, 156.0f),
                    PathNode.CurveTo(114.0f, 141.6406f, 102.359406f, 130.0f, 88.0f, 130.0f),
                    PathNode.Close,
                    PathNode.MoveTo(88.0f, 170.0f),
                    PathNode.CurveTo(80.26801f, 170.0f, 74.0f, 163.73198f, 74.0f, 156.0f),
                    PathNode.CurveTo(74.0f, 148.26802f, 80.26801f, 142.0f, 88.0f, 142.0f),
                    PathNode.CurveTo(95.73199f, 142.0f, 102.0f, 148.26802f, 102.0f, 156.0f),
                    PathNode.CurveTo(102.0f, 163.73198f, 95.73199f, 170.0f, 88.0f, 170.0f),
                    PathNode.Close,
                    PathNode.MoveTo(248.0f, 122.0f),
                    PathNode.LineTo(221.83f, 122.0f),
                    PathNode.CurveTo(218.64442f, 66.88312f, 172.18369f, 24.305126f, 116.99873f, 25.929567f),
                    PathNode.CurveTo(61.813774f, 27.554008f, 17.937975f, 72.791176f, 18.0f, 128.0f),
                    PathNode.LineTo(18.0f, 152.0f),
                    PathNode.CurveTo(18.044086f, 190.64166f, 49.358345f, 221.95592f, 88.0f, 222.0f),
                    PathNode.LineTo(128.0f, 222.0f),
                    PathNode.CurveTo(166.64166f, 221.95592f, 197.95592f, 190.64166f, 198.0f, 152.0f),
                    PathNode.LineTo(198.0f, 134.0f),
                    PathNode.LineTo(248.0f, 134.0f),
                    PathNode.CurveTo(251.3137f, 134.0f, 254.0f, 131.3137f, 254.0f, 128.0f),
                    PathNode.CurveTo(254.0f, 124.686295f, 251.3137f, 122.0f, 248.0f, 122.0f),
                    PathNode.Close,
                    PathNode.MoveTo(186.0f, 152.0f),
                    PathNode.CurveTo(185.96143f, 184.01653f, 160.01653f, 209.96143f, 128.0f, 210.0f),
                    PathNode.LineTo(127.15f, 210.0f),
                    PathNode.CurveTo(146.43016f, 196.99222f, 157.9906f, 175.25784f, 158.0f, 152.0f),
                    PathNode.LineTo(158.0f, 134.0f),
                    PathNode.LineTo(186.0f, 134.0f),
                    PathNode.Close,
                    PathNode.MoveTo(152.0f, 122.0f),
                    PathNode.CurveTo(148.6863f, 122.0f, 146.0f, 124.686295f, 146.0f, 128.0f),
                    PathNode.LineTo(146.0f, 152.0f),
                    PathNode.CurveTo(146.0f, 184.03252f, 120.03252f, 210.0f, 88.0f, 210.0f),
                    PathNode.CurveTo(55.967484f, 210.0f, 30.0f, 184.03252f, 30.0f, 152.0f),
                    PathNode.LineTo(30.0f, 128.0f),
                    PathNode.CurveTo(29.998201f, 79.46151f, 68.48685f, 39.66558f, 116.99834f, 38.046734f),
                    PathNode.CurveTo(165.50983f, 36.427887f, 206.5659f, 73.569374f, 209.8f, 122.0f),
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
        return _baseballHelmet!!
    }

private var _baseballHelmet: ImageVector? = null
