package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.DeviceMobileSlash: ImageVector
    get() {
        if (_deviceMobileSlash != null) return _deviceMobileSlash!!
        _deviceMobileSlash = phosphorFillIcon(
            name = "DeviceMobileSlash",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(213.38f, 221.92f),
                    PathNode.CurveTo(210.11035f, 224.89098f, 205.05144f, 224.64922f, 202.08f, 221.38f),
                    PathNode.LineTo(199.82f, 218.9f),
                    PathNode.CurveTo(198.3541f, 230.9428f, 188.13168f, 239.99791f, 176.0f, 240.0f),
                    PathNode.LineTo(80.0f, 240.0f),
                    PathNode.CurveTo(66.74516f, 240.0f, 56.0f, 229.25484f, 56.0f, 216.0f),
                    PathNode.LineTo(56.0f, 60.69f),
                    PathNode.LineTo(42.08f, 45.38f),
                    PathNode.CurveTo(40.116978f, 43.271305f, 39.439384f, 40.26998f, 40.30605f, 37.52244f),
                    PathNode.CurveTo(41.17271f, 34.774906f, 43.44975f, 32.70557f, 46.26741f, 32.104855f),
                    PathNode.CurveTo(49.085068f, 31.50414f, 52.008102f, 32.46484f, 53.92f, 34.62f),
                    PathNode.LineTo(213.92f, 210.62f),
                    PathNode.CurveTo(216.89098f, 213.88965f, 216.64922f, 218.94856f, 213.38f, 221.92f),
                    PathNode.Close,
                    PathNode.MoveTo(186.08f, 156.21f),
                    PathNode.CurveTo(188.30302f, 158.65576f, 191.80121f, 159.4827f, 194.88405f, 158.2912f),
                    PathNode.CurveTo(197.96687f, 157.0997f, 199.99965f, 154.13509f, 200.0f, 150.83f),
                    PathNode.LineTo(200.0f, 40.0f),
                    PathNode.CurveTo(200.0f, 26.745167f, 189.25484f, 16.0f, 176.0f, 16.0f),
                    PathNode.LineTo(76.7f, 16.0f),
                    PathNode.CurveTo(73.53394f, 16.000307f, 70.66593f, 17.867752f, 69.38488f, 20.763071f),
                    PathNode.CurveTo(68.10384f, 23.658392f, 68.650826f, 27.036808f, 70.78f, 29.38f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 4f,
            )
        }
        return _deviceMobileSlash!!
    }

private var _deviceMobileSlash: ImageVector? = null
