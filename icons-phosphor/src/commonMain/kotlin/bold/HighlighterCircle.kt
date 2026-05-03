package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.HighlighterCircle: ImageVector
    get() {
        if (_highlighterCircle != null) return _highlighterCircle!!
        _highlighterCircle = phosphorBoldIcon(
            name = "HighlighterCircle",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(204.37f, 51.59f),
                    PathNode.CurveTo(167.94095f, 15.158596f, 110.85102f, 9.531108f, 68.00993f, 38.148666f),
                    PathNode.CurveTo(25.168844f, 66.76623f, 8.506528f, 121.65971f, 28.211761f, 169.26253f),
                    PathNode.CurveTo(47.916992f, 216.86533f, 98.502464f, 243.92152f, 149.03586f, 233.88663f),
                    PathNode.CurveTo(199.56926f, 223.85172f, 235.97856f, 179.52013f, 236.0f, 128.0f),
                    PathNode.CurveTo(235.99985f, 99.34466f, 224.62318f, 71.86157f, 204.37f, 51.59f),
                    PathNode.Close,
                    PathNode.MoveTo(140.0f, 136.0f),
                    PathNode.LineTo(116.0f, 136.0f),
                    PathNode.LineTo(116.0f, 111.39f),
                    PathNode.LineTo(140.0f, 99.39f),
                    PathNode.Close,
                    PathNode.MoveTo(100.0f, 207.25f),
                    PathNode.LineTo(100.0f, 160.0f),
                    PathNode.LineTo(156.0f, 160.0f),
                    PathNode.LineTo(156.0f, 207.25f),
                    PathNode.CurveTo(137.87283f, 213.5969f, 118.12716f, 213.5969f, 100.0f, 207.25f),
                    PathNode.Close,
                    PathNode.MoveTo(187.4f, 187.41f),
                    PathNode.CurveTo(185.06319f, 189.73578f, 182.59229f, 191.92285f, 180.0f, 193.96f),
                    PathNode.LineTo(180.0f, 156.0f),
                    PathNode.CurveTo(180.00194f, 146.49463f, 173.31332f, 138.30107f, 164.0f, 136.4f),
                    PathNode.LineTo(164.0f, 80.0f),
                    PathNode.CurveTo(163.9995f, 75.84064f, 161.84518f, 71.97815f, 158.30653f, 69.79222f),
                    PathNode.CurveTo(154.7679f, 67.606285f, 150.34966f, 67.40868f, 146.63f, 69.27f),
                    PathNode.LineTo(98.63f, 93.27f),
                    PathNode.CurveTo(94.56693f, 95.30316f, 92.000534f, 99.45663f, 92.0f, 104.0f),
                    PathNode.LineTo(92.0f, 136.41f),
                    PathNode.CurveTo(82.69035f, 138.31032f, 76.002815f, 146.49838f, 76.0f, 156.0f),
                    PathNode.LineTo(76.0f, 194.0f),
                    PathNode.CurveTo(73.40771f, 191.96284f, 70.93682f, 189.77577f, 68.6f, 187.45f),
                    PathNode.CurveTo(35.798424f, 154.64508f, 35.800232f, 101.46078f, 68.60404f, 68.65808f),
                    PathNode.CurveTo(101.40786f, 35.85539f, 154.59215f, 35.85539f, 187.39597f, 68.65808f),
                    PathNode.CurveTo(220.19978f, 101.46078f, 220.20158f, 154.64508f, 187.4f, 187.45f),
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
        return _highlighterCircle!!
    }

private var _highlighterCircle: ImageVector? = null
