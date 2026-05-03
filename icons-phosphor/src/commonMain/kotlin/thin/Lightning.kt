package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Lightning: ImageVector
    get() {
        if (_lightning != null) return _lightning!!
        _lightning = phosphorThinIcon(
            name = "Lightning",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(211.89f, 119.09f),
                    PathNode.CurveTo(211.58734f, 117.7864f, 210.65283f, 116.72053f, 209.4f, 116.25f),
                    PathNode.LineTo(148.59f, 93.45f),
                    PathNode.LineTo(163.92f, 16.78f),
                    PathNode.CurveTo(164.26364f, 15.030306f, 163.40764f, 13.264448f, 161.8212f, 12.450357f),
                    PathNode.CurveTo(160.23477f, 11.636267f, 158.30106f, 11.970561f, 157.08f, 13.27f),
                    PathNode.LineTo(45.08f, 133.27f),
                    PathNode.CurveTo(44.159103f, 134.23985f, 43.783848f, 135.60579f, 44.08f, 136.91f),
                    PathNode.CurveTo(44.382656f, 138.2136f, 45.317173f, 139.27946f, 46.57f, 139.75f),
                    PathNode.LineTo(107.38f, 162.55f),
                    PathNode.LineTo(92.08f, 239.22f),
                    PathNode.CurveTo(91.73637f, 240.9697f, 92.59237f, 242.73555f, 94.1788f, 243.54964f),
                    PathNode.CurveTo(95.76523f, 244.36374f, 97.698944f, 244.02943f, 98.92f, 242.73f),
                    PathNode.LineTo(210.92f, 122.73f),
                    PathNode.CurveTo(211.83018f, 121.75439f, 212.194f, 120.389175f, 211.89f, 119.09f),
                    PathNode.Close,
                    PathNode.MoveTo(102.68f, 227.0f),
                    PathNode.LineTo(115.92f, 160.8f),
                    PathNode.CurveTo(116.30444f, 158.87636f, 115.23716f, 156.95778f, 113.4f, 156.27f),
                    PathNode.LineTo(55.0f, 134.36f),
                    PathNode.LineTo(153.32f, 29.0f),
                    PathNode.LineTo(140.08f, 95.2f),
                    PathNode.CurveTo(139.69556f, 97.12364f, 140.76283f, 99.04221f, 142.6f, 99.73f),
                    PathNode.LineTo(201.0f, 121.64f),
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
        return _lightning!!
    }

private var _lightning: ImageVector? = null
