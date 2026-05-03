package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.PersonSimpleSnowboard: ImageVector
    get() {
        if (_personSimpleSnowboard != null) return _personSimpleSnowboard!!
        _personSimpleSnowboard = phosphorFillIcon(
            name = "PersonSimpleSnowboard",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(136.0f, 52.0f),
                    PathNode.CurveTo(136.0f, 36.53603f, 148.53603f, 24.0f, 164.0f, 24.0f),
                    PathNode.CurveTo(179.46397f, 24.0f, 192.0f, 36.53603f, 192.0f, 52.0f),
                    PathNode.CurveTo(192.0f, 67.463974f, 179.46397f, 80.0f, 164.0f, 80.0f),
                    PathNode.CurveTo(148.53603f, 80.0f, 136.0f, 67.463974f, 136.0f, 52.0f),
                    PathNode.Close,
                    PathNode.MoveTo(223.67f, 122.25f),
                    PathNode.CurveTo(222.42433f, 126.48856f, 217.97874f, 128.91505f, 213.74f, 127.67f),
                    PathNode.LineTo(134.67f, 104.41f),
                    PathNode.LineTo(126.89f, 116.08f),
                    PathNode.LineTo(162.22f, 126.31f),
                    PathNode.CurveTo(164.67278f, 127.020004f, 166.63924f, 128.85822f, 167.51282f, 131.2576f),
                    PathNode.CurveTo(168.3864f, 133.65697f, 168.0621f, 136.32921f, 166.64f, 138.45f),
                    PathNode.LineTo(146.89f, 167.89f),
                    PathNode.LineTo(197.78f, 182.64f),
                    PathNode.CurveTo(208.53046f, 185.78038f, 215.94061f, 195.6104f, 216.0f, 206.81f),
                    PathNode.CurveTo(215.95058f, 220.70934f, 204.68936f, 231.9616f, 190.79f, 232.0f),
                    PathNode.CurveTo(188.37502f, 232.00143f, 185.97168f, 231.66484f, 183.65f, 231.0f),
                    PathNode.LineTo(26.21f, 185.35f),
                    PathNode.CurveTo(15.463493f, 182.20598f, 8.058082f, 172.37683f, 8.0f, 161.18f),
                    PathNode.CurveTo(8.017029f, 153.23825f, 11.769482f, 145.76727f, 18.129974f, 141.01166f),
                    PathNode.CurveTo(24.490465f, 136.25603f, 32.717743f, 134.76999f, 40.34f, 137.0f),
                    PathNode.LineTo(85.07f, 150.0f),
                    PathNode.LineTo(118.59f, 99.72f),
                    PathNode.LineTo(77.74f, 87.72f),
                    PathNode.CurveTo(73.50121f, 86.47184f, 71.076836f, 82.02379f, 72.325f, 77.785f),
                    PathNode.CurveTo(73.573166f, 73.54621f, 78.02122f, 71.12183f, 82.26f, 72.37f),
                    PathNode.LineTo(218.26f, 112.37f),
                    PathNode.CurveTo(222.4692f, 113.62052f, 224.88373f, 118.03006f, 223.67f, 122.25f),
                    PathNode.Close,
                    PathNode.MoveTo(117.58f, 130.0f),
                    PathNode.LineTo(101.18f, 154.6f),
                    PathNode.LineTo(130.76f, 163.18f),
                    PathNode.LineTo(147.25f, 138.59f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 4f,
            )
        }
        return _personSimpleSnowboard!!
    }

private var _personSimpleSnowboard: ImageVector? = null
