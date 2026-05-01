package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.ApproximateEquals: ImageVector
    get() {
        if (_approximateEquals != null) return _approximateEquals!!
        _approximateEquals = phosphorThinIcon(
            name = "ApproximateEquals",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(219.08f, 155.84f),
                    PathNode.CurveTo(220.48753f, 157.54128f, 220.2503f, 160.06128f, 218.55f, 161.47f),
                    PathNode.CurveTo(203.56f, 173.9f, 188.9f, 180.0f, 173.93f, 180.0f),
                    PathNode.CurveTo(171.88525f, 180.00085f, 169.84207f, 179.88734f, 167.81f, 179.66f),
                    PathNode.CurveTo(152.81f, 178.01f, 139.21f, 170.66f, 126.09f, 163.52f),
                    PathNode.CurveTo(100.57f, 149.66f, 76.47f, 136.52f, 42.55f, 164.7f),
                    PathNode.CurveTo(40.844143f, 166.03818f, 38.38273f, 165.77371f, 37.000084f, 164.1037f),
                    PathNode.CurveTo(35.61744f, 162.43369f, 35.81698f, 159.96616f, 37.45f, 158.54f),
                    PathNode.CurveTo(54.45f, 144.42f, 71.07f, 138.47f, 88.19f, 140.34f),
                    PathNode.CurveTo(103.19f, 141.99f, 116.79f, 149.34f, 129.91f, 156.49f),
                    PathNode.CurveTo(155.43f, 170.35f, 179.53f, 183.43f, 213.45f, 155.31f),
                    PathNode.CurveTo(215.15128f, 153.90247f, 217.67128f, 154.1397f, 219.08f, 155.84f),
                    PathNode.Close,
                    PathNode.MoveTo(42.55f, 100.69f),
                    PathNode.CurveTo(76.47f, 72.57f, 100.55f, 85.69f, 126.09f, 99.51f),
                    PathNode.CurveTo(139.21f, 106.64f, 152.78f, 114.01f, 167.81f, 115.66f),
                    PathNode.CurveTo(169.84265f, 115.87906f, 171.88557f, 115.98922f, 173.93f, 115.99f),
                    PathNode.CurveTo(188.93f, 115.99f, 203.56f, 109.89f, 218.55f, 97.46f),
                    PathNode.CurveTo(219.69415f, 96.562454f, 220.26106f, 95.11468f, 220.0306f, 93.67887f),
                    PathNode.CurveTo(219.80013f, 92.24306f, 218.8086f, 91.04543f, 217.44101f, 90.55106f),
                    PathNode.CurveTo(216.07344f, 90.05669f, 214.5453f, 90.34345f, 213.45f, 91.3f),
                    PathNode.CurveTo(179.53f, 119.43f, 155.45f, 106.3f, 129.91f, 92.48f),
                    PathNode.CurveTo(116.79f, 85.35f, 103.22f, 78.0f, 88.19f, 76.34f),
                    PathNode.CurveTo(71.07f, 74.46f, 54.47f, 80.41f, 37.45f, 94.53f),
                    PathNode.CurveTo(36.305847f, 95.42754f, 35.738934f, 96.87532f, 35.969402f, 98.311134f),
                    PathNode.CurveTo(36.19987f, 99.74694f, 37.191414f, 100.944565f, 38.558983f, 101.43894f),
                    PathNode.CurveTo(39.92656f, 101.93331f, 41.4547f, 101.646545f, 42.55f, 100.69f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 8.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _approximateEquals!!
    }

private var _approximateEquals: ImageVector? = null
