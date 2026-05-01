package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.MarkerCircle: ImageVector
    get() {
        if (_markerCircle != null) return _markerCircle!!
        _markerCircle = phosphorBoldIcon(
            name = "MarkerCircle",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(204.37f, 51.6f),
                    PathNode.CurveTo(167.92007f, 15.125355f, 110.77971f, 9.480288f, 67.897194f, 38.117447f),
                    PathNode.CurveTo(25.014675f, 66.7546f, 8.334971f, 121.697075f, 28.059746f, 169.34087f),
                    PathNode.CurveTo(47.784523f, 216.98465f, 98.419426f, 244.05852f, 148.99506f, 234.00351f),
                    PathNode.CurveTo(199.57068f, 223.94852f, 235.99915f, 179.56546f, 236.0f, 128.0f),
                    PathNode.CurveTo(235.99937f, 99.34769f, 224.6226f, 71.86789f, 204.37f, 51.6f),
                    PathNode.Close,
                    PathNode.MoveTo(108.0f, 140.0f),
                    PathNode.LineTo(148.0f, 140.0f),
                    PathNode.LineTo(148.0f, 156.0f),
                    PathNode.LineTo(108.0f, 156.0f),
                    PathNode.Close,
                    PathNode.MoveTo(92.0f, 203.92f),
                    PathNode.LineTo(92.0f, 180.0f),
                    PathNode.LineTo(164.0f, 180.0f),
                    PathNode.LineTo(164.0f, 203.9f),
                    PathNode.CurveTo(141.20908f, 214.66667f, 114.7969f, 214.67401f, 92.0f, 203.92f),
                    PathNode.Close,
                    PathNode.MoveTo(188.0f, 186.79f),
                    PathNode.LineTo(188.0f, 176.0f),
                    PathNode.CurveTo(188.00194f, 166.49463f, 181.31332f, 158.30107f, 172.0f, 156.4f),
                    PathNode.LineTo(172.0f, 136.0f),
                    PathNode.CurveTo(171.99295f, 126.94352f, 165.90108f, 119.02204f, 157.15f, 116.69f),
                    PathNode.LineTo(147.27f, 81.2f),
                    PathNode.CurveTo(144.865f, 72.54424f, 136.98366f, 66.55417f, 128.0f, 66.55417f),
                    PathNode.CurveTo(119.01634f, 66.55417f, 111.135f, 72.54424f, 108.73f, 81.2f),
                    PathNode.LineTo(98.85f, 116.69f),
                    PathNode.CurveTo(90.09892f, 119.02204f, 84.00705f, 126.94352f, 84.0f, 136.0f),
                    PathNode.LineTo(84.0f, 156.42f),
                    PathNode.CurveTo(74.69403f, 158.31956f, 68.00756f, 166.50215f, 68.0f, 176.0f),
                    PathNode.LineTo(68.0f, 186.77f),
                    PathNode.CurveTo(35.6885f, 153.7922f, 36.04821f, 100.918686f, 68.80541f, 68.383575f),
                    PathNode.CurveTo(101.56262f, 35.84847f, 154.43738f, 35.84847f, 187.19458f, 68.383575f),
                    PathNode.CurveTo(219.95178f, 100.918686f, 220.31151f, 153.7922f, 188.0f, 186.77f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 24.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _markerCircle!!
    }

private var _markerCircle: ImageVector? = null
