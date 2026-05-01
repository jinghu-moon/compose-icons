package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Stethoscope: ImageVector
    get() {
        if (_stethoscope != null) return _stethoscope!!
        _stethoscope = phosphorLightIcon(
            name = "Stethoscope",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(218.0f, 160.0f),
                    PathNode.CurveTo(218.0f, 165.52284f, 213.52284f, 170.0f, 208.0f, 170.0f),
                    PathNode.CurveTo(202.47716f, 170.0f, 198.0f, 165.52284f, 198.0f, 160.0f),
                    PathNode.CurveTo(198.0f, 154.47716f, 202.47716f, 150.0f, 208.0f, 150.0f),
                    PathNode.CurveTo(213.52284f, 150.0f, 218.0f, 154.47716f, 218.0f, 160.0f),
                    PathNode.Close,
                    PathNode.MoveTo(213.65f, 197.58f),
                    PathNode.CurveTo(210.80937f, 220.64043f, 191.23471f, 237.97247f, 168.0f, 238.0f),
                    PathNode.LineTo(144.0f, 238.0f),
                    PathNode.CurveTo(118.608604f, 237.96695f, 98.03306f, 217.39139f, 98.0f, 192.0f),
                    PathNode.LineTo(98.0f, 149.71f),
                    PathNode.CurveTo(66.23172f, 146.62115f, 41.99948f, 119.91809f, 42.0f, 88.0f),
                    PathNode.LineTo(42.0f, 40.0f),
                    PathNode.CurveTo(42.0f, 36.68629f, 44.68629f, 34.0f, 48.0f, 34.0f),
                    PathNode.LineTo(72.0f, 34.0f),
                    PathNode.CurveTo(75.313705f, 34.0f, 78.0f, 36.68629f, 78.0f, 40.0f),
                    PathNode.CurveTo(78.0f, 43.31371f, 75.313705f, 46.0f, 72.0f, 46.0f),
                    PathNode.LineTo(54.0f, 46.0f),
                    PathNode.LineTo(54.0f, 88.0f),
                    PathNode.CurveTo(54.0f, 115.614235f, 76.385765f, 138.0f, 104.0f, 138.0f),
                    PathNode.LineTo(104.67f, 138.0f),
                    PathNode.CurveTo(131.87f, 137.64f, 154.0f, 114.84f, 154.0f, 87.17f),
                    PathNode.LineTo(154.0f, 46.0f),
                    PathNode.LineTo(136.0f, 46.0f),
                    PathNode.CurveTo(132.6863f, 46.0f, 130.0f, 43.31371f, 130.0f, 40.0f),
                    PathNode.CurveTo(130.0f, 36.68629f, 132.6863f, 34.0f, 136.0f, 34.0f),
                    PathNode.LineTo(160.0f, 34.0f),
                    PathNode.CurveTo(163.3137f, 34.0f, 166.0f, 36.68629f, 166.0f, 40.0f),
                    PathNode.LineTo(166.0f, 87.17f),
                    PathNode.CurveTo(166.0f, 119.6f, 141.32f, 146.61f, 110.0f, 149.69f),
                    PathNode.LineTo(110.0f, 192.0f),
                    PathNode.CurveTo(110.0f, 210.77768f, 125.22232f, 226.0f, 144.0f, 226.0f),
                    PathNode.LineTo(168.0f, 226.0f),
                    PathNode.CurveTo(184.66945f, 225.97821f, 198.87234f, 213.89137f, 201.56f, 197.44f),
                    PathNode.CurveTo(182.0392f, 194.06203f, 168.38878f, 176.25381f, 170.19824f, 156.52571f),
                    PathNode.CurveTo(172.00769f, 136.7976f, 188.66982f, 121.76963f, 208.4794f, 121.99902f),
                    PathNode.CurveTo(228.28899f, 122.22842f, 244.59866f, 137.63818f, 245.95079f, 157.40291f),
                    PathNode.CurveTo(247.30292f, 177.16763f, 233.24379f, 194.65498f, 213.65f, 197.58f),
                    PathNode.Close,
                    PathNode.MoveTo(234.0f, 160.0f),
                    PathNode.CurveTo(234.0f, 145.6406f, 222.3594f, 134.0f, 208.0f, 134.0f),
                    PathNode.CurveTo(193.6406f, 134.0f, 182.0f, 145.6406f, 182.0f, 160.0f),
                    PathNode.CurveTo(182.0f, 174.3594f, 193.6406f, 186.0f, 208.0f, 186.0f),
                    PathNode.CurveTo(222.3594f, 186.0f, 234.0f, 174.3594f, 234.0f, 160.0f),
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
        return _stethoscope!!
    }

private var _stethoscope: ImageVector? = null
