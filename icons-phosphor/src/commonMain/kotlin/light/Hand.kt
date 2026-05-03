package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Hand: ImageVector
    get() {
        if (_hand != null) return _hand!!
        _hand = phosphorLightIcon(
            name = "Hand",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(188.0f, 50.0f),
                    PathNode.CurveTo(183.03506f, 49.99439f, 178.174f, 51.421467f, 174.0f, 54.11f),
                    PathNode.LineTo(174.0f, 44.0f),
                    PathNode.CurveTo(174.00131f, 30.712118f, 163.98296f, 19.56155f, 150.77075f, 18.145496f),
                    PathNode.CurveTo(137.55853f, 16.729445f, 125.4047f, 25.50365f, 122.59f, 38.49f),
                    PathNode.CurveTo(114.62486f, 33.08997f, 104.32848f, 32.530983f, 95.825554f, 37.036972f),
                    PathNode.CurveTo(87.32263f, 41.542957f, 82.00388f, 50.37692f, 82.0f, 60.0f),
                    PathNode.LineTo(82.0f, 131.0f),
                    PathNode.LineTo(74.47f, 118.9f),
                    PathNode.CurveTo(67.326195f, 106.443214f, 51.436783f, 102.1362f, 38.98f, 109.28f),
                    PathNode.CurveTo(26.523218f, 116.423805f, 22.216196f, 132.31322f, 29.36f, 144.77f),
                    PathNode.CurveTo(60.76f, 211.0f, 78.51f, 238.0f, 128.0f, 238.0f),
                    PathNode.CurveTo(175.47365f, 237.9449f, 213.9449f, 199.47365f, 214.0f, 152.0f),
                    PathNode.LineTo(214.0f, 76.0f),
                    PathNode.CurveTo(214.0f, 61.6406f, 202.3594f, 50.0f, 188.0f, 50.0f),
                    PathNode.Close,
                    PathNode.MoveTo(202.0f, 152.0f),
                    PathNode.CurveTo(201.95041f, 192.84851f, 168.84851f, 225.95041f, 128.0f, 226.0f),
                    PathNode.CurveTo(107.0f, 226.0f, 93.49f, 220.95f, 81.25f, 208.55f),
                    PathNode.CurveTo(67.81f, 195.0f, 55.54f, 172.0f, 40.1f, 139.43f),
                    PathNode.LineTo(39.87f, 139.0f),
                    PathNode.CurveTo(36.004005f, 132.30354f, 38.298546f, 123.74099f, 44.995f, 119.875f),
                    PathNode.CurveTo(51.691452f, 116.00901f, 60.254005f, 118.30355f, 64.12f, 125.0f),
                    PathNode.LineTo(64.22f, 125.17f),
                    PathNode.LineTo(82.9f, 155.17f),
                    PathNode.CurveTo(84.31314f, 157.45021f, 87.06818f, 158.5153f, 89.64765f, 157.77866f),
                    PathNode.CurveTo(92.22712f, 157.042f, 94.004166f, 154.6826f, 94.0f, 152.0f),
                    PathNode.LineTo(94.0f, 60.0f),
                    PathNode.CurveTo(94.0f, 52.268013f, 100.26801f, 46.0f, 108.0f, 46.0f),
                    PathNode.CurveTo(115.73199f, 46.0f, 122.0f, 52.268013f, 122.0f, 60.0f),
                    PathNode.LineTo(122.0f, 120.0f),
                    PathNode.CurveTo(122.0f, 123.313705f, 124.686295f, 126.0f, 128.0f, 126.0f),
                    PathNode.CurveTo(131.3137f, 126.0f, 134.0f, 123.313705f, 134.0f, 120.0f),
                    PathNode.LineTo(134.0f, 44.0f),
                    PathNode.CurveTo(134.0f, 36.268013f, 140.26802f, 30.0f, 148.0f, 30.0f),
                    PathNode.CurveTo(155.73198f, 30.0f, 162.0f, 36.268013f, 162.0f, 44.0f),
                    PathNode.LineTo(162.0f, 120.0f),
                    PathNode.CurveTo(162.0f, 123.313705f, 164.6863f, 126.0f, 168.0f, 126.0f),
                    PathNode.CurveTo(171.3137f, 126.0f, 174.0f, 123.313705f, 174.0f, 120.0f),
                    PathNode.LineTo(174.0f, 76.0f),
                    PathNode.CurveTo(174.0f, 68.26801f, 180.26802f, 62.0f, 188.0f, 62.0f),
                    PathNode.CurveTo(195.73198f, 62.0f, 202.0f, 68.26801f, 202.0f, 76.0f),
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
        return _hand!!
    }

private var _hand: ImageVector? = null
