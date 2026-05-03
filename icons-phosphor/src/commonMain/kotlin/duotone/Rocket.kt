package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.Rocket: ImageVector
    get() {
        if (_rocket != null) return _rocket!!
        _rocket = phosphorDuotoneIcon(
            name = "Rocket",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(94.81f, 192.0f),
                    PathNode.LineTo(65.36f, 214.24f),
                    PathNode.CurveTo(63.203537f, 215.96675f, 60.308773f, 216.4587f, 57.70295f, 215.54126f),
                    PathNode.CurveTo(55.09713f, 214.62384f, 53.149044f, 212.42688f, 52.55f, 209.73f),
                    PathNode.LineTo(40.19f, 154.1f),
                    PathNode.CurveTo(39.650204f, 151.67964f, 40.26335f, 149.1458f, 41.85f, 147.24f),
                    PathNode.LineTo(72.16f, 110.91f),
                    PathNode.CurveTo(71.0f, 134.25f, 76.7f, 161.43f, 94.81f, 192.0f),
                    PathNode.Close,
                    PathNode.MoveTo(214.15f, 147.24f),
                    PathNode.LineTo(183.84f, 110.91f),
                    PathNode.CurveTo(185.05f, 134.25f, 179.3f, 161.43f, 161.19f, 192.0f),
                    PathNode.LineTo(190.64f, 214.24f),
                    PathNode.CurveTo(192.79646f, 215.96675f, 195.69122f, 216.4587f, 198.29704f, 215.54126f),
                    PathNode.CurveTo(200.90288f, 214.62384f, 202.85097f, 212.42688f, 203.45f, 209.73f),
                    PathNode.LineTo(215.81f, 154.1f),
                    PathNode.CurveTo(216.3498f, 151.67964f, 215.73665f, 149.1458f, 214.15f, 147.24f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 0.2f,
                stroke = null,
                strokeAlpha = 0.2f,
                strokeLineWidth = 16.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(152.0f, 224.0f),
                    PathNode.CurveTo(152.0f, 228.41827f, 148.41827f, 232.0f, 144.0f, 232.0f),
                    PathNode.LineTo(112.0f, 232.0f),
                    PathNode.CurveTo(107.58172f, 232.0f, 104.0f, 228.41827f, 104.0f, 224.0f),
                    PathNode.CurveTo(104.0f, 219.58173f, 107.58172f, 216.0f, 112.0f, 216.0f),
                    PathNode.LineTo(144.0f, 216.0f),
                    PathNode.CurveTo(148.41827f, 216.0f, 152.0f, 219.58173f, 152.0f, 224.0f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 112.0f),
                    PathNode.CurveTo(134.62741f, 112.0f, 140.0f, 106.62742f, 140.0f, 100.0f),
                    PathNode.CurveTo(140.0f, 93.37258f, 134.62741f, 88.0f, 128.0f, 88.0f),
                    PathNode.CurveTo(121.37258f, 88.0f, 116.0f, 93.37258f, 116.0f, 100.0f),
                    PathNode.CurveTo(116.0f, 106.62742f, 121.37258f, 112.0f, 128.0f, 112.0f),
                    PathNode.Close,
                    PathNode.MoveTo(223.62f, 155.83f),
                    PathNode.LineTo(211.26f, 211.46f),
                    PathNode.CurveTo(210.06805f, 216.82985f, 206.20132f, 221.21095f, 201.02118f, 223.06087f),
                    PathNode.CurveTo(195.84103f, 224.91077f, 190.07382f, 223.9701f, 185.75f, 220.57f),
                    PathNode.LineTo(158.51f, 200.0f),
                    PathNode.LineTo(97.51f, 200.0f),
                    PathNode.LineTo(70.25f, 220.57f),
                    PathNode.CurveTo(65.92618f, 223.9701f, 60.15896f, 224.91077f, 54.978817f, 223.06087f),
                    PathNode.CurveTo(49.798676f, 221.21095f, 45.93195f, 216.82985f, 44.74f, 211.46f),
                    PathNode.LineTo(32.38f, 155.83f),
                    PathNode.CurveTo(31.317638f, 150.9926f, 32.542267f, 145.93547f, 35.7f, 142.12f),
                    PathNode.LineTo(64.26f, 107.86f),
                    PathNode.CurveTo(65.218575f, 95.2694f, 68.10907f, 82.90131f, 72.83f, 71.19f),
                    PathNode.CurveTo(85.73f, 38.85f, 108.83f, 18.56f, 118.2f, 11.34f),
                    PathNode.CurveTo(123.96877f, 6.870039f, 132.03123f, 6.870039f, 137.8f, 11.34f),
                    PathNode.CurveTo(147.14f, 18.56f, 170.27f, 38.85f, 183.17f, 71.19f),
                    PathNode.CurveTo(187.89093f, 82.90131f, 190.78143f, 95.2694f, 191.74f, 107.86f),
                    PathNode.LineTo(220.3f, 142.12f),
                    PathNode.CurveTo(223.45773f, 145.93547f, 224.68236f, 150.9926f, 223.62f, 155.83f),
                    PathNode.Close,
                    PathNode.MoveTo(99.43f, 184.0f),
                    PathNode.LineTo(156.57f, 184.0f),
                    PathNode.CurveTo(177.69f, 146.46f, 181.64f, 110.52f, 168.31f, 77.12f),
                    PathNode.CurveTo(156.55f, 47.64f, 134.49f, 29.0f, 128.0f, 24.0f),
                    PathNode.CurveTo(121.49f, 29.0f, 99.43f, 47.64f, 87.67f, 77.12f),
                    PathNode.CurveTo(74.36f, 110.52f, 78.31f, 146.46f, 99.43f, 184.0f),
                    PathNode.Close,
                    PathNode.MoveTo(84.43f, 189.85f),
                    PathNode.QuadTo(68.28f, 160.5f, 64.83f, 132.16f),
                    PathNode.LineTo(48.0f, 152.36f),
                    PathNode.LineTo(60.36f, 208.0f),
                    PathNode.LineTo(60.54f, 207.87f),
                    PathNode.Close,
                    PathNode.MoveTo(208.0f, 152.36f),
                    PathNode.LineTo(191.17f, 132.16f),
                    PathNode.QuadTo(187.75f, 160.44f, 171.61f, 189.85f),
                    PathNode.LineTo(195.46f, 207.85f),
                    PathNode.LineTo(195.64f, 207.98f),
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
        return _rocket!!
    }

private var _rocket: ImageVector? = null
