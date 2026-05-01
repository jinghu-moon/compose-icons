package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.AngularLogo: ImageVector
    get() {
        if (_angularLogo != null) return _angularLogo!!
        _angularLogo = phosphorBoldIcon(
            name = "AngularLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(228.61f, 60.92f),
                    PathNode.LineTo(132.61f, 20.92f),
                    PathNode.CurveTo(129.65347f, 19.686665f, 126.32653f, 19.686665f, 123.37f, 20.92f),
                    PathNode.LineTo(27.37f, 60.92f),
                    PathNode.CurveTo(22.355242f, 63.00868f, 19.369106f, 68.205696f, 20.09f, 73.59f),
                    PathNode.LineTo(36.09f, 193.59f),
                    PathNode.CurveTo(36.6162f, 197.52815f, 39.057568f, 200.95058f, 42.61f, 202.73f),
                    PathNode.LineTo(122.61f, 242.73f),
                    PathNode.CurveTo(125.9902f, 244.42146f, 129.96979f, 244.42146f, 133.35f, 242.73f),
                    PathNode.LineTo(213.35f, 202.73f),
                    PathNode.CurveTo(216.90244f, 200.95058f, 219.3438f, 197.52815f, 219.87f, 193.59f),
                    PathNode.LineTo(235.87f, 73.59f),
                    PathNode.CurveTo(236.59386f, 68.2108f, 233.61688f, 63.01545f, 228.61f, 60.92f),
                    PathNode.Close,
                    PathNode.MoveTo(197.0f, 184.11f),
                    PathNode.LineTo(128.0f, 218.58f),
                    PathNode.LineTo(59.05f, 184.11f),
                    PathNode.LineTo(45.11f, 79.54f),
                    PathNode.LineTo(128.0f, 45.0f),
                    PathNode.LineTo(210.89f, 79.54f),
                    PathNode.Close,
                    PathNode.MoveTo(117.51f, 82.17f),
                    PathNode.LineTo(77.51f, 154.17f),
                    PathNode.CurveTo(74.29018f, 159.969f, 76.381004f, 167.28018f, 82.18f, 170.5f),
                    PathNode.CurveTo(87.97899f, 173.71982f, 95.29018f, 171.62898f, 98.51f, 165.83f),
                    PathNode.LineTo(106.17f, 152.0f),
                    PathNode.LineTo(149.83f, 152.0f),
                    PathNode.LineTo(157.51f, 165.83f),
                    PathNode.CurveTo(160.72981f, 171.62898f, 168.04102f, 173.71982f, 173.84f, 170.5f),
                    PathNode.CurveTo(179.63899f, 167.28018f, 181.72981f, 159.969f, 178.51f, 154.17f),
                    PathNode.LineTo(138.51f, 82.17f),
                    PathNode.CurveTo(136.39658f, 78.35022f, 132.37547f, 75.97948f, 128.01f, 75.97948f),
                    PathNode.CurveTo(123.64452f, 75.97948f, 119.62343f, 78.35022f, 117.51f, 82.17f),
                    PathNode.Close,
                    PathNode.MoveTo(119.51f, 128.0f),
                    PathNode.LineTo(128.0f, 112.71f),
                    PathNode.LineTo(136.49f, 128.0f),
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
        return _angularLogo!!
    }

private var _angularLogo: ImageVector? = null
