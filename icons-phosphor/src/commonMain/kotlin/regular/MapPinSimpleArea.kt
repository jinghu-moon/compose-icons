package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.MapPinSimpleArea: ImageVector
    get() {
        if (_mapPinSimpleArea != null) return _mapPinSimpleArea!!
        _mapPinSimpleArea = phosphorRegularIcon(
            name = "MapPinSimpleArea",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(120.0f, 103.2f),
                    PathNode.LineTo(120.0f, 176.0f),
                    PathNode.CurveTo(120.0f, 180.41827f, 123.58172f, 184.0f, 128.0f, 184.0f),
                    PathNode.CurveTo(132.41827f, 184.0f, 136.0f, 180.41827f, 136.0f, 176.0f),
                    PathNode.LineTo(136.0f, 103.2f),
                    PathNode.CurveTo(156.1197f, 99.09308f, 169.86136f, 80.41841f, 167.79744f, 59.987804f),
                    PathNode.CurveTo(165.73354f, 39.5572f, 148.53459f, 24.008163f, 128.0f, 24.008163f),
                    PathNode.CurveTo(107.46541f, 24.008163f, 90.266464f, 39.5572f, 88.20255f, 59.987804f),
                    PathNode.CurveTo(86.13864f, 80.41841f, 99.880295f, 99.09308f, 120.0f, 103.2f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 40.0f),
                    PathNode.CurveTo(141.25484f, 40.0f, 152.0f, 50.745167f, 152.0f, 64.0f),
                    PathNode.CurveTo(152.0f, 77.25484f, 141.25484f, 88.0f, 128.0f, 88.0f),
                    PathNode.CurveTo(114.74516f, 88.0f, 104.0f, 77.25484f, 104.0f, 64.0f),
                    PathNode.CurveTo(104.0f, 50.745167f, 114.74516f, 40.0f, 128.0f, 40.0f),
                    PathNode.Close,
                    PathNode.MoveTo(240.0f, 176.0f),
                    PathNode.CurveTo(240.0f, 207.18f, 182.29f, 224.0f, 128.0f, 224.0f),
                    PathNode.CurveTo(73.71f, 224.0f, 16.0f, 207.18f, 16.0f, 176.0f),
                    PathNode.CurveTo(16.0f, 168.26f, 19.81f, 156.87f, 38.0f, 146.59f),
                    PathNode.CurveTo(50.26f, 139.65f, 67.12f, 134.32f, 86.77f, 131.17f),
                    PathNode.CurveTo(91.141335f, 130.47964f, 95.24465f, 133.46367f, 95.935f, 137.835f),
                    PathNode.CurveTo(96.62536f, 142.20633f, 93.641335f, 146.30965f, 89.27f, 147.0f),
                    PathNode.CurveTo(71.73f, 149.82f, 56.27f, 154.63f, 45.85f, 160.55f),
                    PathNode.CurveTo(37.05f, 165.5f, 32.0f, 171.14f, 32.0f, 176.0f),
                    PathNode.CurveTo(32.0f, 189.36f, 68.52f, 208.0f, 128.0f, 208.0f),
                    PathNode.CurveTo(187.48f, 208.0f, 224.0f, 189.36f, 224.0f, 176.0f),
                    PathNode.CurveTo(224.0f, 171.14f, 218.95f, 165.5f, 210.15f, 160.51f),
                    PathNode.CurveTo(199.69f, 154.59f, 184.27f, 149.78f, 166.73f, 146.96f),
                    PathNode.CurveTo(163.83995f, 146.58249f, 161.38388f, 144.66309f, 160.31914f, 141.94992f),
                    PathNode.CurveTo(159.25438f, 139.23676f, 159.74944f, 136.15921f, 161.61134f, 133.91684f),
                    PathNode.CurveTo(163.47325f, 131.67447f, 166.40735f, 130.62213f, 169.27f, 131.17f),
                    PathNode.CurveTo(188.92f, 134.32f, 205.78f, 139.65f, 218.04f, 146.59f),
                    PathNode.CurveTo(236.19f, 156.87f, 240.0f, 168.26f, 240.0f, 176.0f),
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
        return _mapPinSimpleArea!!
    }

private var _mapPinSimpleArea: ImageVector? = null
