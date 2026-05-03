package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.IceCream: ImageVector
    get() {
        if (_iceCream != null) return _iceCream!!
        _iceCream = phosphorThinIcon(
            name = "IceCream",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(204.0f, 100.4f),
                    PathNode.LineTo(204.0f, 96.0f),
                    PathNode.CurveTo(204.0f, 54.02636f, 169.97365f, 20.0f, 128.0f, 20.0f),
                    PathNode.CurveTo(86.02636f, 20.0f, 52.0f, 54.02636f, 52.0f, 96.0f),
                    PathNode.LineTo(52.0f, 100.4f),
                    PathNode.CurveTo(41.930428f, 102.44469f, 35.048527f, 111.786934f, 36.081158f, 122.00999f),
                    PathNode.CurveTo(37.11379f, 132.23303f, 45.724937f, 140.01033f, 56.0f, 140.0f),
                    PathNode.LineTo(61.61f, 140.0f),
                    PathNode.LineTo(117.61f, 237.95f),
                    PathNode.CurveTo(119.74622f, 241.68997f, 123.72294f, 243.99823f, 128.03f, 243.99823f),
                    PathNode.CurveTo(132.33707f, 243.99823f, 136.31378f, 241.68997f, 138.45f, 237.95f),
                    PathNode.LineTo(194.45f, 140.0f),
                    PathNode.LineTo(200.0f, 140.0f),
                    PathNode.CurveTo(210.27505f, 140.01033f, 218.88622f, 132.23303f, 219.91884f, 122.00999f),
                    PathNode.CurveTo(220.95148f, 111.786934f, 214.06956f, 102.44469f, 204.0f, 100.4f),
                    PathNode.Close,
                    PathNode.MoveTo(131.47f, 234.0f),
                    PathNode.CurveTo(130.75703f, 235.24338f, 129.43329f, 236.01025f, 128.0f, 236.01025f),
                    PathNode.CurveTo(126.56671f, 236.01025f, 125.24297f, 235.24338f, 124.53f, 234.0f),
                    PathNode.LineTo(70.82f, 140.0f),
                    PathNode.LineTo(99.39f, 140.0f),
                    PathNode.LineTo(142.29f, 215.06f),
                    PathNode.Close,
                    PathNode.MoveTo(137.11f, 140.0f),
                    PathNode.LineTo(161.11f, 182.06f),
                    PathNode.LineTo(146.89f, 207.0f),
                    PathNode.LineTo(108.61f, 140.0f),
                    PathNode.Close,
                    PathNode.MoveTo(165.75f, 174.0f),
                    PathNode.LineTo(146.32f, 140.0f),
                    PathNode.LineTo(185.18f, 140.0f),
                    PathNode.Close,
                    PathNode.MoveTo(200.0f, 132.0f),
                    PathNode.LineTo(56.0f, 132.0f),
                    PathNode.CurveTo(49.37258f, 132.0f, 44.0f, 126.62742f, 44.0f, 120.0f),
                    PathNode.CurveTo(44.0f, 113.37258f, 49.37258f, 108.0f, 56.0f, 108.0f),
                    PathNode.CurveTo(58.20914f, 108.0f, 60.0f, 106.20914f, 60.0f, 104.0f),
                    PathNode.LineTo(60.0f, 96.0f),
                    PathNode.CurveTo(60.0f, 58.444637f, 90.44463f, 28.0f, 128.0f, 28.0f),
                    PathNode.CurveTo(165.55536f, 28.0f, 196.0f, 58.444637f, 196.0f, 96.0f),
                    PathNode.LineTo(196.0f, 104.0f),
                    PathNode.CurveTo(196.0f, 106.20914f, 197.79086f, 108.0f, 200.0f, 108.0f),
                    PathNode.CurveTo(206.62741f, 108.0f, 212.0f, 113.37258f, 212.0f, 120.0f),
                    PathNode.CurveTo(212.0f, 126.62742f, 206.62741f, 132.0f, 200.0f, 132.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 8.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _iceCream!!
    }

private var _iceCream: ImageVector? = null
