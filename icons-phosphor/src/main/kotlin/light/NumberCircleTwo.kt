package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.NumberCircleTwo: ImageVector
    get() {
        if (_numberCircleTwo != null) return _numberCircleTwo!!
        _numberCircleTwo = phosphorLightIcon(
            name = "NumberCircleTwo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(128.0f, 26.0f),
                    PathNode.CurveTo(71.666954f, 26.0f, 26.0f, 71.666954f, 26.0f, 128.0f),
                    PathNode.CurveTo(26.0f, 184.33304f, 71.666954f, 230.0f, 128.0f, 230.0f),
                    PathNode.CurveTo(184.33304f, 230.0f, 230.0f, 184.33304f, 230.0f, 128.0f),
                    PathNode.CurveTo(229.93387f, 71.69437f, 184.30563f, 26.066126f, 128.0f, 26.0f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 218.0f),
                    PathNode.CurveTo(78.29437f, 218.0f, 38.0f, 177.70563f, 38.0f, 128.0f),
                    PathNode.CurveTo(38.0f, 78.29437f, 78.29437f, 38.0f, 128.0f, 38.0f),
                    PathNode.CurveTo(177.70563f, 38.0f, 218.0f, 78.29437f, 218.0f, 128.0f),
                    PathNode.CurveTo(217.94489f, 177.68279f, 177.68279f, 217.94489f, 128.0f, 218.0f),
                    PathNode.Close,
                    PathNode.MoveTo(152.0f, 122.05f),
                    PathNode.LineTo(116.0f, 170.05f),
                    PathNode.LineTo(152.0f, 170.05f),
                    PathNode.CurveTo(155.3137f, 170.05f, 158.0f, 172.7363f, 158.0f, 176.05f),
                    PathNode.CurveTo(158.0f, 179.36371f, 155.3137f, 182.05f, 152.0f, 182.05f),
                    PathNode.LineTo(104.0f, 182.05f),
                    PathNode.CurveTo(101.72737f, 182.05f, 99.64978f, 180.76599f, 98.63344f, 178.73328f),
                    PathNode.CurveTo(97.61709f, 176.70058f, 97.83642f, 174.26811f, 99.2f, 172.45f),
                    PathNode.LineTo(142.37f, 114.89f),
                    PathNode.CurveTo(146.56886f, 109.224525f, 147.0727f, 101.62899f, 143.65895f, 95.45855f),
                    PathNode.CurveTo(140.24521f, 89.28811f, 133.54272f, 85.679405f, 126.51218f, 86.22651f),
                    PathNode.CurveTo(119.48162f, 86.77361f, 113.41808f, 91.37575f, 111.0f, 98.0f),
                    PathNode.CurveTo(110.323524f, 100.07042f, 108.57814f, 101.61162f, 106.43991f, 102.02663f),
                    PathNode.CurveTo(104.30168f, 102.44163f, 102.10648f, 101.66525f, 100.704605f, 99.99822f),
                    PathNode.CurveTo(99.302734f, 98.33119f, 98.91439f, 96.035355f, 99.69f, 94.0f),
                    PathNode.CurveTo(103.6778f, 82.923065f, 113.775955f, 75.20246f, 125.51094f, 74.25843f),
                    PathNode.CurveTo(137.24593f, 73.31441f, 148.44841f, 79.32147f, 154.15562f, 89.61848f),
                    PathNode.CurveTo(159.86288f, 99.91549f, 159.01985f, 112.59893f, 152.0f, 122.05f),
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
        return _numberCircleTwo!!
    }

private var _numberCircleTwo: ImageVector? = null
