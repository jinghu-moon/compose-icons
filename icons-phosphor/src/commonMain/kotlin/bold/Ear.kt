package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Ear: ImageVector
    get() {
        if (_ear != null) return _ear!!
        _ear = phosphorBoldIcon(
            name = "Ear",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(220.0f, 104.0f),
                    PathNode.CurveTo(220.0f, 110.62742f, 214.62741f, 116.0f, 208.0f, 116.0f),
                    PathNode.CurveTo(201.37259f, 116.0f, 196.0f, 110.62742f, 196.0f, 104.0f),
                    PathNode.CurveTo(196.0f, 66.44463f, 165.55536f, 36.0f, 128.0f, 36.0f),
                    PathNode.CurveTo(90.44463f, 36.0f, 60.0f, 66.44463f, 60.0f, 104.0f),
                    PathNode.CurveTo(60.0f, 129.0f, 67.58f, 136.3f, 76.35f, 144.76f),
                    PathNode.CurveTo(85.12f, 153.22f, 96.0f, 163.71f, 96.0f, 188.0f),
                    PathNode.CurveTo(96.0f, 205.67311f, 110.32689f, 220.0f, 128.0f, 220.0f),
                    PathNode.CurveTo(137.0f, 220.0f, 144.19f, 216.3f, 150.75f, 208.36f),
                    PathNode.CurveTo(155.01407f, 203.41988f, 162.44432f, 202.79294f, 167.47586f, 206.94873f),
                    PathNode.CurveTo(172.5074f, 211.1045f, 173.29555f, 218.5194f, 169.25f, 223.64f),
                    PathNode.CurveTo(158.09f, 237.15f, 144.21f, 244.0f, 128.0f, 244.0f),
                    PathNode.CurveTo(97.08576f, 243.96693f, 72.033066f, 218.91423f, 72.0f, 188.0f),
                    PathNode.CurveTo(72.0f, 173.91f, 67.37f, 169.44f, 59.69f, 162.0f),
                    PathNode.CurveTo(49.13f, 151.86f, 36.0f, 139.19f, 36.0f, 104.0f),
                    PathNode.CurveTo(36.0f, 53.189804f, 77.18981f, 12.0f, 128.0f, 12.0f),
                    PathNode.CurveTo(178.8102f, 12.0f, 220.0f, 53.189804f, 220.0f, 104.0f),
                    PathNode.Close,
                    PathNode.MoveTo(179.87f, 157.61f),
                    PathNode.CurveTo(177.1146f, 156.01523f, 173.83838f, 155.58076f, 170.76256f, 156.40224f),
                    PathNode.CurveTo(167.68672f, 157.22372f, 165.06339f, 159.2338f, 163.47f, 161.99f),
                    PathNode.CurveTo(162.5674f, 163.56412f, 160.71828f, 164.33347f, 158.96547f, 163.86418f),
                    PathNode.CurveTo(157.21268f, 163.3949f, 155.99535f, 161.80453f, 156.0f, 159.99f),
                    PathNode.CurveTo(156.0f, 152.38f, 159.65f, 147.13f, 165.6f, 139.19f),
                    PathNode.CurveTo(172.0f, 130.65f, 180.0f, 120.0f, 180.0f, 104.0f),
                    PathNode.CurveTo(180.0f, 75.2812f, 156.71881f, 52.0f, 128.0f, 52.0f),
                    PathNode.CurveTo(99.2812f, 52.0f, 76.0f, 75.2812f, 76.0f, 104.0f),
                    PathNode.CurveTo(76.0f, 110.62742f, 81.37258f, 116.0f, 88.0f, 116.0f),
                    PathNode.CurveTo(94.62742f, 116.0f, 100.0f, 110.62742f, 100.0f, 104.0f),
                    PathNode.CurveTo(100.0f, 88.536026f, 112.536026f, 76.0f, 128.0f, 76.0f),
                    PathNode.CurveTo(143.46397f, 76.0f, 156.0f, 88.536026f, 156.0f, 104.0f),
                    PathNode.CurveTo(156.0f, 111.61f, 152.35f, 116.86f, 146.4f, 124.8f),
                    PathNode.CurveTo(140.0f, 133.35f, 132.0f, 144.0f, 132.0f, 160.0f),
                    PathNode.CurveTo(131.999f, 172.67386f, 140.51122f, 183.76804f, 152.75323f, 187.0482f),
                    PathNode.CurveTo(164.99525f, 190.32835f, 177.91408f, 184.97644f, 184.25f, 174.0f),
                    PathNode.CurveTo(187.56421f, 168.26422f, 185.60367f, 160.92786f, 179.87f, 157.61f),
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
        return _ear!!
    }

private var _ear: ImageVector? = null
