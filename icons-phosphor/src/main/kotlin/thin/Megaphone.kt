package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Megaphone: ImageVector
    get() {
        if (_megaphone != null) return _megaphone!!
        _megaphone = phosphorThinIcon(
            name = "Megaphone",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(200.0f, 76.0f),
                    PathNode.LineTo(160.1f, 76.0f),
                    PathNode.CurveTo(157.91f, 75.89f, 105.55f, 72.62f, 55.72f, 30.83f),
                    PathNode.CurveTo(52.150806f, 27.830746f, 47.167515f, 27.17017f, 42.94017f, 29.13593f),
                    PathNode.CurveTo(38.71282f, 31.101688f, 36.006615f, 35.33796f, 36.0f, 40.0f),
                    PathNode.LineTo(36.0f, 200.0f),
                    PathNode.CurveTo(35.970585f, 204.66824f, 38.67796f, 208.92102f, 42.92f, 210.87f),
                    PathNode.CurveTo(44.51215f, 211.60825f, 46.245033f, 211.99371f, 48.0f, 212.0f),
                    PathNode.CurveTo(50.817066f, 211.99419f, 53.54119f, 210.99168f, 55.69f, 209.17f),
                    PathNode.CurveTo(98.15f, 173.55f, 142.45f, 165.92f, 155.97f, 164.37f),
                    PathNode.LineTo(155.97f, 200.66f),
                    PathNode.CurveTo(155.96405f, 204.677f, 157.96844f, 208.43056f, 161.31f, 210.66f),
                    PathNode.LineTo(172.31f, 217.99f),
                    PathNode.CurveTo(175.54576f, 220.14745f, 179.62642f, 220.603f, 183.2583f, 219.21223f),
                    PathNode.CurveTo(186.89017f, 217.82147f, 189.62285f, 214.75688f, 190.59f, 210.99f),
                    PathNode.LineTo(203.08f, 163.9f),
                    PathNode.CurveTo(226.77254f, 162.30118f, 244.92209f, 142.1909f, 244.09055f, 118.45904f),
                    PathNode.CurveTo(243.25899f, 94.72717f, 223.74634f, 75.93657f, 200.0f, 76.0f),
                    PathNode.Close,
                    PathNode.MoveTo(156.0f, 156.3f),
                    PathNode.CurveTo(142.47f, 157.65f, 96.0f, 164.92f, 50.58f, 203.05f),
                    PathNode.CurveTo(49.39139f, 204.05324f, 47.728992f, 204.27647f, 46.317818f, 203.62238f),
                    PathNode.CurveTo(44.906647f, 202.96825f, 44.002617f, 201.5554f, 44.0f, 200.0f),
                    PathNode.LineTo(44.0f, 40.0f),
                    PathNode.CurveTo(44.0003f, 38.44956f, 44.89655f, 37.038937f, 46.3f, 36.38f),
                    PathNode.CurveTo(46.850388f, 36.132492f, 47.44653f, 36.003044f, 48.05f, 36.0f),
                    PathNode.CurveTo(48.98638f, 36.017067f, 49.884995f, 36.37225f, 50.58f, 37.0f),
                    PathNode.CurveTo(96.0f, 75.09f, 142.47f, 82.36f, 156.0f, 83.71f),
                    PathNode.Close,
                    PathNode.MoveTo(182.87f, 209.0f),
                    PathNode.CurveTo(182.55507f, 210.2625f, 181.64574f, 211.29292f, 180.43222f, 211.76242f),
                    PathNode.CurveTo(179.21869f, 212.23192f, 177.85263f, 212.0818f, 176.77f, 211.36f),
                    PathNode.LineTo(165.77f, 204.03f),
                    PathNode.CurveTo(164.65714f, 203.2875f, 163.98914f, 202.03783f, 163.99f, 200.7f),
                    PathNode.LineTo(163.99f, 164.0f),
                    PathNode.LineTo(194.79f, 164.0f),
                    PathNode.Close,
                    PathNode.MoveTo(200.0f, 156.0f),
                    PathNode.LineTo(164.0f, 156.0f),
                    PathNode.LineTo(164.0f, 84.0f),
                    PathNode.LineTo(200.0f, 84.0f),
                    PathNode.CurveTo(219.88223f, 84.0f, 236.0f, 100.11775f, 236.0f, 120.0f),
                    PathNode.CurveTo(236.0f, 139.88223f, 219.88223f, 156.0f, 200.0f, 156.0f),
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
        return _megaphone!!
    }

private var _megaphone: ImageVector? = null
