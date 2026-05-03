package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.CarProfile: ImageVector
    get() {
        if (_carProfile != null) return _carProfile!!
        _carProfile = phosphorBoldIcon(
            name = "CarProfile",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(236.0f, 108.0f),
                    PathNode.LineTo(213.0f, 108.0f),
                    PathNode.LineTo(170.83f, 65.86f),
                    PathNode.CurveTo(167.08894f, 62.09588f, 161.99698f, 59.985634f, 156.69f, 60.0f),
                    PathNode.LineTo(48.28f, 60.0f),
                    PathNode.CurveTo(41.592533f, 60.00123f, 35.3482f, 63.3448f, 31.64f, 68.91f),
                    PathNode.LineTo(2.0f, 113.34f),
                    PathNode.CurveTo(0.690619f, 115.31395f, -0.005272f, 117.63126f, 0f, 120.0f),
                    PathNode.LineTo(0f, 168.0f),
                    PathNode.CurveTo(0f, 179.0457f, 8.954305f, 188.0f, 20.0f, 188.0f),
                    PathNode.LineTo(33.5f, 188.0f),
                    PathNode.CurveTo(37.885857f, 202.27188f, 51.069416f, 212.01251f, 66.0f, 212.01251f),
                    PathNode.CurveTo(80.93059f, 212.01251f, 94.11414f, 202.27188f, 98.5f, 188.0f),
                    PathNode.LineTo(157.5f, 188.0f),
                    PathNode.CurveTo(161.88585f, 202.27188f, 175.06941f, 212.01251f, 190.0f, 212.01251f),
                    PathNode.CurveTo(204.93059f, 212.01251f, 218.11415f, 202.27188f, 222.5f, 188.0f),
                    PathNode.LineTo(236.0f, 188.0f),
                    PathNode.CurveTo(247.0457f, 188.0f, 256.0f, 179.0457f, 256.0f, 168.0f),
                    PathNode.LineTo(256.0f, 128.0f),
                    PathNode.CurveTo(256.0f, 116.95431f, 247.0457f, 108.0f, 236.0f, 108.0f),
                    PathNode.Close,
                    PathNode.MoveTo(50.42f, 84.0f),
                    PathNode.LineTo(155.0f, 84.0f),
                    PathNode.LineTo(179.0f, 108.0f),
                    PathNode.LineTo(34.42f, 108.0f),
                    PathNode.Close,
                    PathNode.MoveTo(66.0f, 188.0f),
                    PathNode.CurveTo(60.477154f, 188.0f, 56.0f, 183.52284f, 56.0f, 178.0f),
                    PathNode.CurveTo(56.0f, 172.47716f, 60.477154f, 168.0f, 66.0f, 168.0f),
                    PathNode.CurveTo(71.52285f, 168.0f, 76.0f, 172.47716f, 76.0f, 178.0f),
                    PathNode.CurveTo(76.0f, 183.52284f, 71.52285f, 188.0f, 66.0f, 188.0f),
                    PathNode.Close,
                    PathNode.MoveTo(190.0f, 188.0f),
                    PathNode.CurveTo(184.47716f, 188.0f, 180.0f, 183.52284f, 180.0f, 178.0f),
                    PathNode.CurveTo(180.0f, 172.47716f, 184.47716f, 168.0f, 190.0f, 168.0f),
                    PathNode.CurveTo(195.52284f, 168.0f, 200.0f, 172.47716f, 200.0f, 178.0f),
                    PathNode.CurveTo(200.0f, 183.52284f, 195.52284f, 188.0f, 190.0f, 188.0f),
                    PathNode.Close,
                    PathNode.MoveTo(232.0f, 164.0f),
                    PathNode.LineTo(221.0f, 164.0f),
                    PathNode.CurveTo(215.50685f, 151.80547f, 203.37465f, 143.96423f, 190.0f, 143.96423f),
                    PathNode.CurveTo(176.62535f, 143.96423f, 164.49315f, 151.80547f, 159.0f, 164.0f),
                    PathNode.LineTo(97.0f, 164.0f),
                    PathNode.CurveTo(91.50686f, 151.80547f, 79.37465f, 143.96423f, 66.0f, 143.96423f),
                    PathNode.CurveTo(52.625347f, 143.96423f, 40.49314f, 151.80547f, 35.0f, 164.0f),
                    PathNode.LineTo(24.0f, 164.0f),
                    PathNode.LineTo(24.0f, 132.0f),
                    PathNode.LineTo(232.0f, 132.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 24.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _carProfile!!
    }

private var _carProfile: ImageVector? = null
