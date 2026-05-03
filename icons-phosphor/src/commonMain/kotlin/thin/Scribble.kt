package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Scribble: ImageVector
    get() {
        if (_scribble != null) return _scribble!!
        _scribble = phosphorThinIcon(
            name = "Scribble",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(202.84f, 186.83f),
                    PathNode.CurveTo(199.34337f, 190.32092f, 197.37851f, 195.05905f, 197.37851f, 200.0f),
                    PathNode.CurveTo(197.37851f, 204.94095f, 199.34337f, 209.67908f, 202.84f, 213.17f),
                    PathNode.CurveTo(204.40297f, 214.73297f, 204.40297f, 217.26703f, 202.84f, 218.83f),
                    PathNode.CurveTo(201.27704f, 220.39296f, 198.74297f, 220.39296f, 197.18f, 218.83f),
                    PathNode.CurveTo(186.78067f, 208.43039f, 186.78067f, 191.56961f, 197.18f, 181.17f),
                    PathNode.LineTo(206.56f, 171.8f),
                    PathNode.CurveTo(211.35728f, 167.11176f, 213.26389f, 160.20651f, 211.55182f, 153.72096f),
                    PathNode.CurveTo(209.83974f, 147.23541f, 204.77335f, 142.17093f, 198.28714f, 140.46132f),
                    PathNode.CurveTo(191.80093f, 138.75171f, 184.89642f, 140.66093f, 180.21f, 145.46f),
                    PathNode.LineTo(113.45f, 212.2f),
                    PathNode.CurveTo(103.03485f, 222.5076f, 86.248985f, 222.46405f, 75.887474f, 212.10252f),
                    PathNode.CurveTo(65.525955f, 201.74101f, 65.48239f, 184.95515f, 75.79f, 174.54f),
                    PathNode.LineTo(174.55f, 75.8f),
                    PathNode.CurveTo(179.34727f, 71.11175f, 181.25389f, 64.20652f, 179.54181f, 57.720963f),
                    PathNode.CurveTo(177.82974f, 51.23541f, 172.76335f, 46.170933f, 166.27715f, 44.461323f),
                    PathNode.CurveTo(159.79094f, 42.751713f, 152.88643f, 44.660946f, 148.2f, 49.46f),
                    PathNode.LineTo(81.45f, 116.2f),
                    PathNode.CurveTo(71.03485f, 126.50761f, 54.24899f, 126.46405f, 43.88747f, 116.10253f),
                    PathNode.CurveTo(33.52595f, 105.74101f, 33.482395f, 88.955154f, 43.79f, 78.54f),
                    PathNode.LineTo(85.17f, 37.17f),
                    PathNode.CurveTo(86.17206f, 36.11717f, 87.66636f, 35.690746f, 89.07314f, 36.056187f),
                    PathNode.CurveTo(90.47992f, 36.421627f, 91.57776f, 37.52141f, 91.94071f, 38.928837f),
                    PathNode.CurveTo(92.303665f, 40.336254f, 91.8746f, 41.829807f, 90.82f, 42.83f),
                    PathNode.LineTo(49.44f, 84.2f),
                    PathNode.CurveTo(44.64272f, 88.88825f, 42.73611f, 95.79348f, 44.448185f, 102.27904f),
                    PathNode.CurveTo(46.160255f, 108.76459f, 51.226658f, 113.82907f, 57.71286f, 115.53868f),
                    PathNode.CurveTo(64.199066f, 117.24829f, 71.10357f, 115.33906f, 75.79f, 110.54f),
                    PathNode.LineTo(142.55f, 43.8f),
                    PathNode.CurveTo(152.96515f, 33.492393f, 169.751f, 33.535954f, 180.11253f, 43.897472f),
                    PathNode.CurveTo(190.47404f, 54.258987f, 190.51761f, 71.044846f, 180.21f, 81.46f),
                    PathNode.LineTo(81.45f, 180.2f),
                    PathNode.CurveTo(76.65272f, 184.88824f, 74.74611f, 191.79349f, 76.45818f, 198.27904f),
                    PathNode.CurveTo(78.17026f, 204.76459f, 83.23666f, 209.82907f, 89.72286f, 211.53868f),
                    PathNode.CurveTo(96.20906f, 213.24829f, 103.11357f, 211.33907f, 107.8f, 206.54f),
                    PathNode.LineTo(174.55f, 139.8f),
                    PathNode.CurveTo(184.96515f, 129.4924f, 201.751f, 129.53595f, 212.11253f, 139.89748f),
                    PathNode.CurveTo(222.47404f, 150.25899f, 222.51761f, 167.04485f, 212.21f, 177.46f),
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
        return _scribble!!
    }

private var _scribble: ImageVector? = null
