package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.ApproximateEquals: ImageVector
    get() {
        if (_approximateEquals != null) return _approximateEquals!!
        _approximateEquals = phosphorRegularIcon(
            name = "ApproximateEquals",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(222.16f, 153.26f),
                    PathNode.CurveTo(224.98268f, 156.64519f, 224.5355f, 161.67577f, 221.16f, 164.51f),
                    PathNode.CurveTo(203.8f, 178.89f, 188.3f, 184.0f, 174.16f, 184.0f),
                    PathNode.CurveTo(155.58f, 184.0f, 139.34f, 175.19f, 124.23f, 167.0f),
                    PathNode.CurveTo(98.88f, 153.25f, 76.99f, 141.37f, 45.16f, 167.74f),
                    PathNode.CurveTo(42.97555f, 169.67639f, 39.909817f, 170.2692f, 37.16096f, 169.28677f),
                    PathNode.CurveTo(34.41211f, 168.30437f, 32.416573f, 165.9027f, 31.954268f, 163.0204f),
                    PathNode.CurveTo(31.49196f, 160.1381f, 32.63628f, 157.23282f, 34.94f, 155.44f),
                    PathNode.CurveTo(75.11f, 122.17f, 105.26f, 138.52f, 131.87f, 152.96f),
                    PathNode.CurveTo(157.22f, 166.71f, 179.11f, 178.58f, 210.94f, 152.21f),
                    PathNode.CurveTo(214.33379f, 149.41956f, 219.3429f, 149.88832f, 222.16f, 153.26f),
                    PathNode.Close,
                    PathNode.MoveTo(45.16f, 103.8f),
                    PathNode.CurveTo(76.99f, 77.43f, 98.88f, 89.3f, 124.23f, 103.05f),
                    PathNode.CurveTo(139.34f, 111.25f, 155.58f, 120.05f, 174.16f, 120.05f),
                    PathNode.CurveTo(188.3f, 120.05f, 203.8f, 114.94f, 221.16f, 100.56f),
                    PathNode.CurveTo(223.46371f, 98.76717f, 224.60805f, 95.861885f, 224.14574f, 92.9796f),
                    PathNode.CurveTo(223.68343f, 90.097305f, 221.6879f, 87.69563f, 218.93904f, 86.71322f),
                    PathNode.CurveTo(216.19019f, 85.730804f, 213.12445f, 86.32363f, 210.94f, 88.26f),
                    PathNode.CurveTo(179.11f, 114.63f, 157.22f, 102.75f, 131.87f, 89.0f),
                    PathNode.CurveTo(105.26f, 74.57f, 75.11f, 58.21f, 34.94f, 91.48f),
                    PathNode.CurveTo(31.82079f, 94.36045f, 31.495052f, 99.17589f, 34.19793f, 102.45017f),
                    PathNode.CurveTo(36.90081f, 105.72445f, 41.69074f, 106.31697f, 45.11f, 103.8f),
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
        return _approximateEquals!!
    }

private var _approximateEquals: ImageVector? = null
