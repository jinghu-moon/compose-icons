package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.HandPointing: ImageVector
    get() {
        if (_handPointing != null) return _handPointing!!
        _handPointing = phosphorLightIcon(
            name = "HandPointing",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(196.0f, 90.0f),
                    PathNode.CurveTo(190.79575f, 89.99506f, 185.711f, 91.559875f, 181.41f, 94.49f),
                    PathNode.CurveTo(179.60417f, 86.17426f, 173.84332f, 79.26851f, 165.98618f, 76.00085f),
                    PathNode.CurveTo(158.12903f, 72.73318f, 149.17014f, 73.51722f, 142.0f, 78.1f),
                    PathNode.LineTo(142.0f, 44.0f),
                    PathNode.CurveTo(142.0f, 29.640596f, 130.3594f, 18.0f, 116.0f, 18.0f),
                    PathNode.CurveTo(101.640594f, 18.0f, 90.0f, 29.640596f, 90.0f, 44.0f),
                    PathNode.LineTo(90.0f, 131.0f),
                    PathNode.LineTo(82.47f, 118.9f),
                    PathNode.CurveTo(75.270966f, 106.473595f, 59.36141f, 102.23597f, 46.935f, 109.435f),
                    PathNode.CurveTo(34.508595f, 116.63403f, 30.27097f, 132.5436f, 37.47f, 144.97f),
                    PathNode.LineTo(42.14f, 153.22f),
                    PathNode.CurveTo(76.14f, 213.22f, 90.21f, 237.99f, 136.0f, 237.99f),
                    PathNode.CurveTo(183.47365f, 237.93489f, 221.9449f, 199.46364f, 222.0f, 151.99f),
                    PathNode.LineTo(222.0f, 116.0f),
                    PathNode.CurveTo(222.0f, 101.640594f, 210.3594f, 90.0f, 196.0f, 90.0f),
                    PathNode.Close,
                    PathNode.MoveTo(210.0f, 152.0f),
                    PathNode.CurveTo(209.95041f, 192.84851f, 176.84851f, 225.95041f, 136.0f, 226.0f),
                    PathNode.CurveTo(97.2f, 226.0f, 86.0f, 206.17f, 52.58f, 147.31f),
                    PathNode.LineTo(47.89f, 139.0f),
                    PathNode.LineTo(47.89f, 139.0f),
                    PathNode.CurveTo(44.024563f, 132.30862f, 46.311726f, 123.750786f, 53.0f, 119.88f),
                    PathNode.CurveTo(55.12545f, 118.64397f, 57.54128f, 117.99515f, 60.0f, 118.0f),
                    PathNode.CurveTo(65.01088f, 117.99083f, 69.64456f, 120.66044f, 72.15f, 125.0f),
                    PathNode.LineTo(72.25f, 125.17f),
                    PathNode.LineTo(90.93f, 155.17f),
                    PathNode.CurveTo(92.35417f, 157.42056f, 95.09148f, 158.46294f, 97.65189f, 157.72975f),
                    PathNode.CurveTo(100.21231f, 156.99655f, 101.98295f, 154.66327f, 102.0f, 152.0f),
                    PathNode.LineTo(102.0f, 44.0f),
                    PathNode.CurveTo(102.0f, 36.268013f, 108.26801f, 30.0f, 116.0f, 30.0f),
                    PathNode.CurveTo(123.73199f, 30.0f, 130.0f, 36.268013f, 130.0f, 44.0f),
                    PathNode.LineTo(130.0f, 112.0f),
                    PathNode.CurveTo(130.0f, 115.313705f, 132.6863f, 118.0f, 136.0f, 118.0f),
                    PathNode.CurveTo(139.3137f, 118.0f, 142.0f, 115.313705f, 142.0f, 112.0f),
                    PathNode.LineTo(142.0f, 100.0f),
                    PathNode.CurveTo(142.0f, 92.26801f, 148.26802f, 86.0f, 156.0f, 86.0f),
                    PathNode.CurveTo(163.73198f, 86.0f, 170.0f, 92.26801f, 170.0f, 100.0f),
                    PathNode.LineTo(170.0f, 120.0f),
                    PathNode.CurveTo(170.0f, 123.313705f, 172.6863f, 126.0f, 176.0f, 126.0f),
                    PathNode.CurveTo(179.3137f, 126.0f, 182.0f, 123.313705f, 182.0f, 120.0f),
                    PathNode.LineTo(182.0f, 116.0f),
                    PathNode.CurveTo(182.0f, 108.26801f, 188.26802f, 102.0f, 196.0f, 102.0f),
                    PathNode.CurveTo(203.73198f, 102.0f, 210.0f, 108.26801f, 210.0f, 116.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 12.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _handPointing!!
    }

private var _handPointing: ImageVector? = null
