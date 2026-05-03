package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.UserGear: ImageVector
    get() {
        if (_userGear != null) return _userGear!!
        _userGear = phosphorDuotoneIcon(
            name = "UserGear",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(168.0f, 100.0f),
                    PathNode.CurveTo(168.0f, 133.13708f, 141.13708f, 160.0f, 108.0f, 160.0f),
                    PathNode.CurveTo(74.862915f, 160.0f, 48.0f, 133.13708f, 48.0f, 100.0f),
                    PathNode.CurveTo(48.0f, 66.862915f, 74.862915f, 40.0f, 108.0f, 40.0f),
                    PathNode.CurveTo(141.13708f, 40.0f, 168.0f, 66.862915f, 168.0f, 100.0f),
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
                    PathNode.MoveTo(144.0f, 157.68f),
                    PathNode.CurveTo(169.76613f, 141.63197f, 181.77513f, 110.44987f, 173.4295f, 81.26455f),
                    PathNode.CurveTo(165.08388f, 52.079227f, 138.4051f, 31.960009f, 108.05f, 31.960009f),
                    PathNode.CurveTo(77.6949f, 31.960009f, 51.01612f, 52.079227f, 42.670498f, 81.26455f),
                    PathNode.CurveTo(34.324867f, 110.44987f, 46.333878f, 141.63197f, 72.1f, 157.68f),
                    PathNode.CurveTo(51.45f, 164.44f, 32.87f, 177.07f, 17.93f, 194.85f),
                    PathNode.CurveTo(16.024683f, 197.02878f, 15.444799f, 200.06679f, 16.413643f, 202.79417f),
                    PathNode.CurveTo(17.382484f, 205.52156f, 19.748941f, 207.51294f, 22.601768f, 208.0015f),
                    PathNode.CurveTo(25.454594f, 208.49005f, 28.348831f, 207.39958f, 30.17f, 205.15f),
                    PathNode.CurveTo(50.25f, 181.19f, 77.91f, 168.0f, 108.0f, 168.0f),
                    PathNode.CurveTo(138.09f, 168.0f, 165.75f, 181.19f, 185.87f, 205.15f),
                    PathNode.CurveTo(188.71425f, 208.5355f, 193.7645f, 208.97427f, 197.15f, 206.13f),
                    PathNode.CurveTo(200.5355f, 203.28575f, 200.97427f, 198.2355f, 198.13f, 194.85f),
                    PathNode.CurveTo(183.18f, 177.07f, 164.6f, 164.44f, 144.0f, 157.68f),
                    PathNode.Close,
                    PathNode.MoveTo(56.0f, 100.0f),
                    PathNode.CurveTo(56.0f, 71.2812f, 79.2812f, 48.0f, 108.0f, 48.0f),
                    PathNode.CurveTo(136.71881f, 48.0f, 160.0f, 71.2812f, 160.0f, 100.0f),
                    PathNode.CurveTo(160.0f, 128.71881f, 136.71881f, 152.0f, 108.0f, 152.0f),
                    PathNode.CurveTo(79.2949f, 151.96693f, 56.033066f, 128.7051f, 56.0f, 100.0f),
                    PathNode.Close,
                    PathNode.MoveTo(252.25f, 143.07f),
                    PathNode.LineTo(247.59f, 140.38f),
                    PathNode.CurveTo(248.13669f, 137.48558f, 248.13669f, 134.51442f, 247.59f, 131.62f),
                    PathNode.LineTo(252.25f, 128.93f),
                    PathNode.CurveTo(256.07733f, 126.72086f, 257.38913f, 121.82733f, 255.18f, 118.0f),
                    PathNode.CurveTo(252.97084f, 114.17267f, 248.07733f, 112.86086f, 244.25f, 115.07f),
                    PathNode.LineTo(239.58f, 117.77f),
                    PathNode.CurveTo(237.3451f, 115.85257f, 234.77534f, 114.36428f, 232.0f, 113.38f),
                    PathNode.LineTo(232.0f, 108.0f),
                    PathNode.CurveTo(232.0f, 103.58172f, 228.41827f, 100.0f, 224.0f, 100.0f),
                    PathNode.CurveTo(219.58173f, 100.0f, 216.0f, 103.58172f, 216.0f, 108.0f),
                    PathNode.LineTo(216.0f, 113.38f),
                    PathNode.CurveTo(213.22466f, 114.36428f, 210.6549f, 115.85257f, 208.42f, 117.77f),
                    PathNode.LineTo(203.75f, 115.07f),
                    PathNode.CurveTo(199.92267f, 112.86086f, 195.02916f, 114.17267f, 192.82f, 118.0f),
                    PathNode.CurveTo(190.61086f, 121.82733f, 191.92267f, 126.72086f, 195.75f, 128.93f),
                    PathNode.LineTo(200.41f, 131.62f),
                    PathNode.CurveTo(199.86331f, 134.51442f, 199.86331f, 137.48558f, 200.41f, 140.38f),
                    PathNode.LineTo(195.75f, 143.07f),
                    PathNode.CurveTo(191.92267f, 145.27916f, 190.61086f, 150.17267f, 192.82f, 154.0f),
                    PathNode.CurveTo(195.02916f, 157.82733f, 199.92267f, 159.13914f, 203.75f, 156.93f),
                    PathNode.LineTo(208.42f, 154.23f),
                    PathNode.CurveTo(210.6549f, 156.14743f, 213.22466f, 157.63571f, 216.0f, 158.62f),
                    PathNode.LineTo(216.0f, 164.0f),
                    PathNode.CurveTo(216.0f, 168.41827f, 219.58173f, 172.0f, 224.0f, 172.0f),
                    PathNode.CurveTo(228.41827f, 172.0f, 232.0f, 168.41827f, 232.0f, 164.0f),
                    PathNode.LineTo(232.0f, 158.62f),
                    PathNode.CurveTo(234.77534f, 157.63571f, 237.3451f, 156.14743f, 239.58f, 154.23f),
                    PathNode.LineTo(244.25f, 156.93f),
                    PathNode.CurveTo(245.46486f, 157.63506f, 246.84537f, 158.00435f, 248.25f, 158.0f),
                    PathNode.CurveTo(251.87209f, 158.0014f, 255.04323f, 155.56902f, 255.98059f, 152.07031f),
                    PathNode.CurveTo(256.91794f, 148.57162f, 255.38763f, 144.87964f, 252.25f, 143.07f),
                    PathNode.Close,
                    PathNode.MoveTo(224.0f, 144.0f),
                    PathNode.CurveTo(219.58173f, 144.0f, 216.0f, 140.41827f, 216.0f, 136.0f),
                    PathNode.CurveTo(216.0f, 131.58173f, 219.58173f, 128.0f, 224.0f, 128.0f),
                    PathNode.CurveTo(228.41827f, 128.0f, 232.0f, 131.58173f, 232.0f, 136.0f),
                    PathNode.CurveTo(232.0f, 140.41827f, 228.41827f, 144.0f, 224.0f, 144.0f),
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
        return _userGear!!
    }

private var _userGear: ImageVector? = null
