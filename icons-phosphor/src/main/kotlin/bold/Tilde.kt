package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Tilde: ImageVector
    get() {
        if (_tilde != null) return _tilde!!
        _tilde = phosphorBoldIcon(
            name = "Tilde",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(225.35f, 133.1f),
                    PathNode.CurveTo(210.13f, 152.03f, 194.92f, 162.1f, 178.85f, 163.75f),
                    PathNode.CurveTo(177.23877f, 163.91737f, 175.6199f, 164.00081f, 174.0f, 164.0f),
                    PathNode.CurveTo(153.19f, 164.0f, 135.84f, 149.87f, 120.41f, 137.3f),
                    PathNode.CurveTo(106.17f, 125.7f, 92.73f, 114.76f, 79.66f, 116.12f),
                    PathNode.CurveTo(70.4f, 117.12f, 60.2f, 124.44f, 49.34f, 137.94f),
                    PathNode.CurveTo(45.098648f, 142.73938f, 37.83573f, 143.3619f, 32.83954f, 139.35426f),
                    PathNode.CurveTo(27.843342f, 135.3466f, 26.875183f, 128.12163f, 30.64f, 122.94f),
                    PathNode.CurveTo(45.87f, 104.0f, 61.08f, 94.0f, 77.15f, 92.25f),
                    PathNode.CurveTo(100.15f, 89.83f, 118.97f, 105.17f, 135.58f, 118.7f),
                    PathNode.CurveTo(149.82f, 130.3f, 163.26f, 141.24f, 176.33f, 139.88f),
                    PathNode.CurveTo(185.59f, 138.88f, 195.79f, 131.56f, 206.65f, 118.06f),
                    PathNode.CurveTo(209.25034f, 114.48109f, 213.60884f, 112.623116f, 217.9915f, 113.22528f),
                    PathNode.CurveTo(222.37416f, 113.827446f, 226.07007f, 116.79208f, 227.6088f, 120.93968f),
                    PathNode.CurveTo(229.14752f, 125.087296f, 228.27946f, 129.7451f, 225.35f, 133.06f),
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
        return _tilde!!
    }

private var _tilde: ImageVector? = null
