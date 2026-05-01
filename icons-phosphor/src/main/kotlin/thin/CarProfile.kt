package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.CarProfile: ImageVector
    get() {
        if (_carProfile != null) return _carProfile!!
        _carProfile = phosphorThinIcon(
            name = "CarProfile",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(240.0f, 116.0f),
                    PathNode.LineTo(209.66f, 116.0f),
                    PathNode.LineTo(165.17f, 71.52f),
                    PathNode.CurveTo(162.92801f, 69.25954f, 159.87373f, 67.991714f, 156.69f, 68.0f),
                    PathNode.LineTo(44.28f, 68.0f),
                    PathNode.CurveTo(40.26299f, 67.99405f, 36.509438f, 69.99844f, 34.28f, 73.34f),
                    PathNode.LineTo(4.67f, 117.78f),
                    PathNode.CurveTo(4.232363f, 118.437614f, 3.999231f, 119.210075f, 4.0f, 120.0f),
                    PathNode.LineTo(4.0f, 168.0f),
                    PathNode.CurveTo(4.0f, 174.62741f, 9.372583f, 180.0f, 16.0f, 180.0f),
                    PathNode.LineTo(36.29f, 180.0f),
                    PathNode.CurveTo(38.28699f, 193.76724f, 50.08867f, 203.98056f, 64.0f, 203.98056f),
                    PathNode.CurveTo(77.91133f, 203.98056f, 89.713005f, 193.76724f, 91.71f, 180.0f),
                    PathNode.LineTo(164.29f, 180.0f),
                    PathNode.CurveTo(166.28699f, 193.76724f, 178.08867f, 203.98056f, 192.0f, 203.98056f),
                    PathNode.CurveTo(205.91133f, 203.98056f, 217.71301f, 193.76724f, 219.71f, 180.0f),
                    PathNode.LineTo(240.0f, 180.0f),
                    PathNode.CurveTo(246.62741f, 180.0f, 252.0f, 174.62741f, 252.0f, 168.0f),
                    PathNode.LineTo(252.0f, 128.0f),
                    PathNode.CurveTo(252.0f, 121.37258f, 246.62741f, 116.0f, 240.0f, 116.0f),
                    PathNode.Close,
                    PathNode.MoveTo(41.0f, 77.78f),
                    PathNode.CurveTo(41.732605f, 76.68175f, 42.95992f, 76.01571f, 44.28f, 76.0f),
                    PathNode.LineTo(156.69f, 76.0f),
                    PathNode.CurveTo(157.74773f, 76.001816f, 158.76166f, 76.42249f, 159.51f, 77.17f),
                    PathNode.LineTo(198.34f, 116.0f),
                    PathNode.LineTo(15.47f, 116.0f),
                    PathNode.Close,
                    PathNode.MoveTo(64.0f, 196.0f),
                    PathNode.CurveTo(52.954304f, 196.0f, 44.0f, 187.0457f, 44.0f, 176.0f),
                    PathNode.CurveTo(44.0f, 164.9543f, 52.954304f, 156.0f, 64.0f, 156.0f),
                    PathNode.CurveTo(75.04569f, 156.0f, 84.0f, 164.9543f, 84.0f, 176.0f),
                    PathNode.CurveTo(84.0f, 187.0457f, 75.04569f, 196.0f, 64.0f, 196.0f),
                    PathNode.Close,
                    PathNode.MoveTo(192.0f, 196.0f),
                    PathNode.CurveTo(180.9543f, 196.0f, 172.0f, 187.0457f, 172.0f, 176.0f),
                    PathNode.CurveTo(172.0f, 164.9543f, 180.9543f, 156.0f, 192.0f, 156.0f),
                    PathNode.CurveTo(203.0457f, 156.0f, 212.0f, 164.9543f, 212.0f, 176.0f),
                    PathNode.CurveTo(212.0f, 187.0457f, 203.0457f, 196.0f, 192.0f, 196.0f),
                    PathNode.Close,
                    PathNode.MoveTo(244.0f, 168.0f),
                    PathNode.CurveTo(244.0f, 170.20914f, 242.20914f, 172.0f, 240.0f, 172.0f),
                    PathNode.LineTo(219.71f, 172.0f),
                    PathNode.CurveTo(217.71301f, 158.23276f, 205.91133f, 148.01944f, 192.0f, 148.01944f),
                    PathNode.CurveTo(178.08867f, 148.01944f, 166.28699f, 158.23276f, 164.29f, 172.0f),
                    PathNode.LineTo(91.71f, 172.0f),
                    PathNode.CurveTo(89.713005f, 158.23276f, 77.91133f, 148.01944f, 64.0f, 148.01944f),
                    PathNode.CurveTo(50.08867f, 148.01944f, 38.28699f, 158.23276f, 36.29f, 172.0f),
                    PathNode.LineTo(16.0f, 172.0f),
                    PathNode.CurveTo(13.790861f, 172.0f, 12.0f, 170.20914f, 12.0f, 168.0f),
                    PathNode.LineTo(12.0f, 124.0f),
                    PathNode.LineTo(240.0f, 124.0f),
                    PathNode.CurveTo(242.20914f, 124.0f, 244.0f, 125.79086f, 244.0f, 128.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 8.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _carProfile!!
    }

private var _carProfile: ImageVector? = null
