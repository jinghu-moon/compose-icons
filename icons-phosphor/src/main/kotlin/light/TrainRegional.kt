package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.TrainRegional: ImageVector
    get() {
        if (_trainRegional != null) return _trainRegional!!
        _trainRegional = phosphorLightIcon(
            name = "TrainRegional",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(221.79f, 118.42f),
                    PathNode.LineTo(199.4f, 36.32f),
                    PathNode.CurveTo(197.7399f, 30.226513f, 192.20558f, 25.998957f, 185.89f, 26.0f),
                    PathNode.LineTo(70.11f, 26.0f),
                    PathNode.CurveTo(63.794422f, 25.998957f, 58.260094f, 30.226513f, 56.6f, 36.32f),
                    PathNode.LineTo(34.21f, 118.42f),
                    PathNode.CurveTo(33.92764f, 119.454414f, 33.92764f, 120.545586f, 34.21f, 121.58f),
                    PathNode.LineTo(56.6f, 203.68f),
                    PathNode.CurveTo(58.260094f, 209.77348f, 63.794422f, 214.00104f, 70.11f, 214.0f),
                    PathNode.LineTo(84.0f, 214.0f),
                    PathNode.LineTo(67.2f, 236.4f),
                    PathNode.CurveTo(65.21178f, 239.05096f, 65.74903f, 242.81177f, 68.4f, 244.8f),
                    PathNode.CurveTo(71.050964f, 246.78822f, 74.811775f, 246.25096f, 76.8f, 243.6f),
                    PathNode.LineTo(99.0f, 214.0f),
                    PathNode.LineTo(157.0f, 214.0f),
                    PathNode.LineTo(179.2f, 243.6f),
                    PathNode.CurveTo(181.18823f, 246.25096f, 184.94904f, 246.78822f, 187.6f, 244.8f),
                    PathNode.CurveTo(190.25096f, 242.81177f, 190.78822f, 239.05096f, 188.8f, 236.4f),
                    PathNode.LineTo(172.0f, 214.0f),
                    PathNode.LineTo(185.89f, 214.0f),
                    PathNode.CurveTo(192.20558f, 214.00104f, 197.7399f, 209.77348f, 199.4f, 203.68f),
                    PathNode.LineTo(221.79f, 121.58f),
                    PathNode.CurveTo(222.07236f, 120.545586f, 222.07236f, 119.454414f, 221.79f, 118.42f),
                    PathNode.Close,
                    PathNode.MoveTo(68.18f, 39.47f),
                    PathNode.CurveTo(68.41877f, 38.6012f, 69.20899f, 37.99932f, 70.11f, 38.0f),
                    PathNode.LineTo(185.89f, 38.0f),
                    PathNode.CurveTo(186.79102f, 37.99932f, 187.58124f, 38.6012f, 187.82f, 39.47f),
                    PathNode.LineTo(208.49f, 115.27f),
                    PathNode.LineTo(128.0f, 129.9f),
                    PathNode.LineTo(47.51f, 115.27f),
                    PathNode.Close,
                    PathNode.MoveTo(68.18f, 200.53f),
                    PathNode.LineTo(48.29f, 127.61f),
                    PathNode.LineTo(122.0f, 141.0f),
                    PathNode.LineTo(122.0f, 202.0f),
                    PathNode.LineTo(70.11f, 202.0f),
                    PathNode.CurveTo(69.20899f, 202.00067f, 68.41877f, 201.3988f, 68.18f, 200.53f),
                    PathNode.Close,
                    PathNode.MoveTo(187.82f, 200.53f),
                    PathNode.CurveTo(187.58124f, 201.3988f, 186.79102f, 202.00067f, 185.89f, 202.0f),
                    PathNode.LineTo(134.0f, 202.0f),
                    PathNode.LineTo(134.0f, 141.0f),
                    PathNode.LineTo(207.71f, 127.6f),
                    PathNode.Close,
                    PathNode.MoveTo(90.0f, 88.0f),
                    PathNode.CurveTo(90.0f, 84.686295f, 92.686295f, 82.0f, 96.0f, 82.0f),
                    PathNode.LineTo(160.0f, 82.0f),
                    PathNode.CurveTo(163.3137f, 82.0f, 166.0f, 84.686295f, 166.0f, 88.0f),
                    PathNode.CurveTo(166.0f, 91.313705f, 163.3137f, 94.0f, 160.0f, 94.0f),
                    PathNode.LineTo(96.0f, 94.0f),
                    PathNode.CurveTo(92.686295f, 94.0f, 90.0f, 91.313705f, 90.0f, 88.0f),
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
        return _trainRegional!!
    }

private var _trainRegional: ImageVector? = null
