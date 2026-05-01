package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.MapPinSimpleArea: ImageVector
    get() {
        if (_mapPinSimpleArea != null) return _mapPinSimpleArea!!
        _mapPinSimpleArea = phosphorLightIcon(
            name = "MapPinSimpleArea",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(122.0f, 101.52f),
                    PathNode.LineTo(122.0f, 176.0f),
                    PathNode.CurveTo(122.0f, 179.3137f, 124.686295f, 182.0f, 128.0f, 182.0f),
                    PathNode.CurveTo(131.3137f, 182.0f, 134.0f, 179.3137f, 134.0f, 176.0f),
                    PathNode.LineTo(134.0f, 101.52f),
                    PathNode.CurveTo(153.57114f, 98.39056f, 167.45029f, 80.74472f, 165.88065f, 60.98722f),
                    PathNode.CurveTo(164.31099f, 41.22972f, 147.81975f, 25.996674f, 128.0f, 25.996674f),
                    PathNode.CurveTo(108.180244f, 25.996674f, 91.689f, 41.22972f, 90.119354f, 60.98722f),
                    PathNode.CurveTo(88.549706f, 80.74472f, 102.42887f, 98.39056f, 122.0f, 101.52f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 38.0f),
                    PathNode.CurveTo(142.3594f, 38.0f, 154.0f, 49.6406f, 154.0f, 64.0f),
                    PathNode.CurveTo(154.0f, 78.359406f, 142.3594f, 90.0f, 128.0f, 90.0f),
                    PathNode.CurveTo(113.640594f, 90.0f, 102.0f, 78.359406f, 102.0f, 64.0f),
                    PathNode.CurveTo(102.0f, 49.6406f, 113.640594f, 38.0f, 128.0f, 38.0f),
                    PathNode.Close,
                    PathNode.MoveTo(238.0f, 176.0f),
                    PathNode.CurveTo(238.0f, 189.34f, 225.82f, 201.38f, 203.69f, 209.88f),
                    PathNode.CurveTo(183.38f, 217.7f, 156.5f, 222.0f, 128.0f, 222.0f),
                    PathNode.CurveTo(99.5f, 222.0f, 72.62f, 217.7f, 52.31f, 209.88f),
                    PathNode.CurveTo(30.18f, 201.38f, 18.0f, 189.34f, 18.0f, 176.0f),
                    PathNode.CurveTo(18.0f, 156.4f, 44.46f, 140.0f, 87.05f, 133.14f),
                    PathNode.CurveTo(90.32505f, 132.60152f, 93.41652f, 134.81995f, 93.955f, 138.095f),
                    PathNode.CurveTo(94.49348f, 141.37007f, 92.27505f, 144.46152f, 89.0f, 145.0f),
                    PathNode.CurveTo(71.0f, 147.89f, 55.73f, 152.66f, 44.91f, 158.78f),
                    PathNode.CurveTo(35.28f, 164.2f, 30.0f, 170.32f, 30.0f, 176.0f),
                    PathNode.CurveTo(30.0f, 192.08f, 70.25f, 210.0f, 128.0f, 210.0f),
                    PathNode.CurveTo(185.75f, 210.0f, 226.0f, 192.08f, 226.0f, 176.0f),
                    PathNode.CurveTo(226.0f, 170.32f, 220.72f, 164.2f, 211.14f, 158.77f),
                    PathNode.CurveTo(200.32f, 152.65f, 185.07f, 147.88f, 167.05f, 144.99f),
                    PathNode.CurveTo(163.77771f, 144.46533f, 161.55032f, 141.38728f, 162.075f, 138.115f),
                    PathNode.CurveTo(162.59967f, 134.84271f, 165.67772f, 132.61533f, 168.95f, 133.14f),
                    PathNode.CurveTo(211.54f, 140.0f, 238.0f, 156.4f, 238.0f, 176.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 12.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _mapPinSimpleArea!!
    }

private var _mapPinSimpleArea: ImageVector? = null
