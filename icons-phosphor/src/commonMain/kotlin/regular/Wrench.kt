package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.Wrench: ImageVector
    get() {
        if (_wrench != null) return _wrench!!
        _wrench = phosphorRegularIcon(
            name = "Wrench",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(226.76f, 69.0f),
                    PathNode.CurveTo(225.77495f, 66.56534f, 223.65762f, 64.76926f, 221.0949f, 64.19444f),
                    PathNode.CurveTo(218.53218f, 63.619633f, 215.85056f, 64.33931f, 213.92f, 66.12f),
                    PathNode.LineTo(173.62f, 103.31f),
                    PathNode.LineTo(156.39f, 99.61f),
                    PathNode.LineTo(152.69f, 82.38f),
                    PathNode.LineTo(189.88f, 42.08f),
                    PathNode.CurveTo(191.66069f, 40.149445f, 192.38037f, 37.467823f, 191.80556f, 34.90511f),
                    PathNode.CurveTo(191.23074f, 32.342396f, 189.43466f, 30.225058f, 187.0f, 29.24f),
                    PathNode.CurveTo(164.80386f, 20.26122f, 139.59639f, 22.903778f, 119.74488f, 36.290512f),
                    PathNode.CurveTo(99.89337f, 49.677246f, 87.99527f, 72.05659f, 88.0f, 96.0f),
                    PathNode.CurveTo(87.98705f, 105.95679f, 90.02968f, 115.80904f, 94.0f, 124.94f),
                    PathNode.LineTo(33.79f, 177.0f),
                    PathNode.CurveTo(33.64f, 177.12f, 33.5f, 177.26f, 33.36f, 177.39f),
                    PathNode.CurveTo(20.861797f, 189.8882f, 20.861797f, 210.1518f, 33.36f, 222.65f),
                    PathNode.CurveTo(45.858204f, 235.14821f, 66.121796f, 235.14821f, 78.62f, 222.65f),
                    PathNode.CurveTo(78.75f, 222.52f, 78.89f, 222.37f, 79.01f, 222.23f),
                    PathNode.LineTo(131.06f, 162.0f),
                    PathNode.CurveTo(153.33516f, 171.77803f, 179.0416f, 169.64673f, 199.40231f, 156.3338f),
                    PathNode.CurveTo(219.763f, 143.02087f, 232.0244f, 120.326775f, 232.0f, 96.0f),
                    PathNode.CurveTo(232.0156f, 86.74584f, 230.23607f, 77.576515f, 226.76f, 69.0f),
                    PathNode.Close,
                    PathNode.MoveTo(160.0f, 152.0f),
                    PathNode.CurveTo(150.53072f, 151.987f, 141.21857f, 149.57898f, 132.93f, 145.0f),
                    PathNode.CurveTo(129.62053f, 143.1717f, 125.48295f, 143.90997f, 123.01f, 146.77f),
                    PathNode.LineTo(67.11f, 211.51f),
                    PathNode.CurveTo(60.81937f, 217.48647f, 50.911503f, 217.3596f, 44.775948f, 211.22406f),
                    PathNode.CurveTo(38.64039f, 205.0885f, 38.51354f, 195.18063f, 44.49f, 188.89f),
                    PathNode.LineTo(109.18f, 133.0f),
                    PathNode.CurveTo(112.045166f, 130.52571f, 112.78379f, 126.38187f, 110.95f, 123.07f),
                    PathNode.CurveTo(100.54324f, 104.24779f, 101.83572f, 81.1285f, 114.27558f, 63.583523f),
                    PathNode.CurveTo(126.71544f, 46.038544f, 148.10445f, 37.168236f, 169.31f, 40.76f),
                    PathNode.LineTo(138.11f, 74.57f),
                    PathNode.CurveTo(136.34839f, 76.48101f, 135.62492f, 79.1287f, 136.17f, 81.67f),
                    PathNode.LineTo(141.83f, 108.0f),
                    PathNode.CurveTo(142.49123f, 111.07597f, 144.89403f, 113.47877f, 147.97f, 114.14f),
                    PathNode.LineTo(174.32f, 119.8f),
                    PathNode.CurveTo(176.8613f, 120.34507f, 179.50899f, 119.62163f, 181.42f, 117.86f),
                    PathNode.LineTo(215.23f, 86.66f),
                    PathNode.CurveTo(217.95811f, 102.913025f, 213.39642f, 119.54313f, 202.7575f, 132.12952f),
                    PathNode.CurveTo(192.11859f, 144.7159f, 176.4804f, 151.98335f, 160.0f, 152.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 16.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _wrench!!
    }

private var _wrench: ImageVector? = null
