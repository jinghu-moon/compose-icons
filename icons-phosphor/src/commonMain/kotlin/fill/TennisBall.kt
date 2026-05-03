package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.TennisBall: ImageVector
    get() {
        if (_tennisBall != null) return _tennisBall!!
        _tennisBall = phosphorFillIcon(
            name = "TennisBall",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(24.81f, 115.41f),
                    PathNode.CurveTo(30.55707f, 67.947556f, 67.95073f, 30.533257f, 115.41f, 24.76f),
                    PathNode.CurveTo(116.513954f, 24.628216f, 117.622955f, 24.961842f, 118.47096f, 25.680845f),
                    PathNode.CurveTo(119.31897f, 26.399849f, 119.82947f, 27.439356f, 119.88f, 28.55f),
                    PathNode.CurveTo(120.87996f, 53.054577f, 111.58762f, 76.86093f, 94.25155f, 94.208405f),
                    PathNode.CurveTo(76.915474f, 111.55587f, 53.115227f, 120.86385f, 28.61f, 119.88f),
                    PathNode.CurveTo(27.49758f, 119.83216f, 26.45544f, 119.322815f, 25.734264f, 118.47449f),
                    PathNode.CurveTo(25.013086f, 117.62615f, 24.678143f, 116.51561f, 24.81f, 115.41f),
                    PathNode.Close,
                    PathNode.MoveTo(227.35f, 136.11f),
                    PathNode.CurveTo(226.23f, 136.11f, 225.12f, 136.04f, 224.0f, 136.04f),
                    PathNode.CurveTo(200.0645f, 136.00932f, 177.15305f, 145.74754f, 160.56451f, 163.00238f),
                    PathNode.CurveTo(143.976f, 180.25723f, 135.14719f, 203.53426f, 136.12f, 227.45f),
                    PathNode.CurveTo(136.17053f, 228.56064f, 136.68103f, 229.60014f, 137.52904f, 230.31915f),
                    PathNode.CurveTo(138.37704f, 231.03816f, 139.48604f, 231.37178f, 140.59f, 231.24f),
                    PathNode.CurveTo(188.05252f, 225.46577f, 225.4472f, 188.04634f, 231.19f, 140.58f),
                    PathNode.CurveTo(231.32222f, 139.46771f, 230.98201f, 138.35097f, 230.25212f, 137.5013f),
                    PathNode.CurveTo(229.52222f, 136.65166f, 228.4695f, 136.14697f, 227.35f, 136.11f),
                    PathNode.Close,
                    PathNode.MoveTo(150.46f, 150.46f),
                    PathNode.CurveTo(169.92209f, 130.8935f, 196.4026f, 119.92536f, 224.0f, 120.0f),
                    PathNode.CurveTo(225.0f, 120.0f, 226.06f, 120.0f, 227.09f, 120.0f),
                    PathNode.CurveTo(228.25044f, 120.04165f, 229.37172f, 119.57696f, 230.1625f, 118.72666f),
                    PathNode.CurveTo(230.95331f, 117.87636f, 231.33557f, 116.72438f, 231.21f, 115.57f),
                    PathNode.CurveTo(225.53516f, 67.92442f, 187.97496f, 30.360079f, 140.33f, 24.68f),
                    PathNode.CurveTo(139.17561f, 24.554424f, 138.02364f, 24.936691f, 137.17334f, 25.727488f),
                    PathNode.CurveTo(136.32304f, 26.518284f, 135.85835f, 27.639553f, 135.9f, 28.8f),
                    PathNode.CurveTo(136.81924f, 57.464504f, 125.8288f, 85.23023f, 105.54f, 105.5f),
                    PathNode.CurveTo(86.084496f, 125.081184f, 59.603176f, 136.06406f, 32.0f, 136.0f),
                    PathNode.CurveTo(31.0f, 136.0f, 29.94f, 136.0f, 28.91f, 136.0f),
                    PathNode.CurveTo(27.749554f, 135.95836f, 26.628284f, 136.42303f, 25.837488f, 137.27335f),
                    PathNode.CurveTo(25.04669f, 138.12364f, 24.664425f, 139.27562f, 24.79f, 140.43f),
                    PathNode.CurveTo(30.464836f, 188.07558f, 68.02505f, 225.63992f, 115.67f, 231.32f),
                    PathNode.CurveTo(116.82438f, 231.44557f, 117.97637f, 231.06331f, 118.82667f, 230.2725f),
                    PathNode.CurveTo(119.67696f, 229.4817f, 120.14165f, 228.36044f, 120.1f, 227.2f),
                    PathNode.CurveTo(119.169586f, 198.52176f, 130.16089f, 170.73938f, 150.46f, 150.46f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 4f,
            )
        }
        return _tennisBall!!
    }

private var _tennisBall: ImageVector? = null
