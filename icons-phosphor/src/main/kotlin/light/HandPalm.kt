package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.HandPalm: ImageVector
    get() {
        if (_handPalm != null) return _handPalm!!
        _handPalm = phosphorLightIcon(
            name = "HandPalm",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(188.0f, 90.0f),
                    PathNode.CurveTo(183.03506f, 89.99439f, 178.174f, 91.42146f, 174.0f, 94.11f),
                    PathNode.LineTo(174.0f, 60.0f),
                    PathNode.CurveTo(173.99611f, 50.37692f, 168.67738f, 41.542957f, 160.17444f, 37.036972f),
                    PathNode.CurveTo(151.67151f, 32.530983f, 141.37514f, 33.08997f, 133.41f, 38.49f),
                    PathNode.CurveTo(130.5953f, 25.50365f, 118.44147f, 16.729445f, 105.22925f, 18.145496f),
                    PathNode.CurveTo(92.01704f, 19.56155f, 81.998695f, 30.712118f, 82.0f, 44.0f),
                    PathNode.LineTo(82.0f, 54.11f),
                    PathNode.CurveTo(73.99913f, 48.997364f, 63.84752f, 48.65268f, 55.518288f, 53.21085f),
                    PathNode.CurveTo(47.18906f, 57.76902f, 42.0069f, 66.50511f, 42.0f, 76.0f),
                    PathNode.LineTo(42.0f, 152.0f),
                    PathNode.CurveTo(42.0f, 199.49649f, 80.50351f, 238.0f, 128.0f, 238.0f),
                    PathNode.CurveTo(175.49649f, 238.0f, 214.0f, 199.49649f, 214.0f, 152.0f),
                    PathNode.LineTo(214.0f, 116.0f),
                    PathNode.CurveTo(214.0f, 101.640594f, 202.3594f, 90.0f, 188.0f, 90.0f),
                    PathNode.Close,
                    PathNode.MoveTo(202.0f, 152.0f),
                    PathNode.CurveTo(202.0f, 192.86908f, 168.86908f, 226.0f, 128.0f, 226.0f),
                    PathNode.CurveTo(87.13093f, 226.0f, 54.0f, 192.86908f, 54.0f, 152.0f),
                    PathNode.LineTo(54.0f, 76.0f),
                    PathNode.CurveTo(54.0f, 68.26801f, 60.268013f, 62.0f, 68.0f, 62.0f),
                    PathNode.CurveTo(75.73199f, 62.0f, 82.0f, 68.26801f, 82.0f, 76.0f),
                    PathNode.LineTo(82.0f, 120.0f),
                    PathNode.CurveTo(82.0f, 123.313705f, 84.686295f, 126.0f, 88.0f, 126.0f),
                    PathNode.CurveTo(91.313705f, 126.0f, 94.0f, 123.313705f, 94.0f, 120.0f),
                    PathNode.LineTo(94.0f, 44.0f),
                    PathNode.CurveTo(94.0f, 36.268013f, 100.26801f, 30.0f, 108.0f, 30.0f),
                    PathNode.CurveTo(115.73199f, 30.0f, 122.0f, 36.268013f, 122.0f, 44.0f),
                    PathNode.LineTo(122.0f, 112.0f),
                    PathNode.CurveTo(122.0f, 115.313705f, 124.686295f, 118.0f, 128.0f, 118.0f),
                    PathNode.CurveTo(131.3137f, 118.0f, 134.0f, 115.313705f, 134.0f, 112.0f),
                    PathNode.LineTo(134.0f, 60.0f),
                    PathNode.CurveTo(134.0f, 52.268013f, 140.26802f, 46.0f, 148.0f, 46.0f),
                    PathNode.CurveTo(155.73198f, 46.0f, 162.0f, 52.268013f, 162.0f, 60.0f),
                    PathNode.LineTo(162.0f, 130.39f),
                    PathNode.CurveTo(139.12575f, 133.43031f, 122.02923f, 152.92459f, 122.0f, 176.0f),
                    PathNode.CurveTo(122.0f, 179.3137f, 124.686295f, 182.0f, 128.0f, 182.0f),
                    PathNode.CurveTo(131.3137f, 182.0f, 134.0f, 179.3137f, 134.0f, 176.0f),
                    PathNode.CurveTo(134.0f, 157.22232f, 149.22232f, 142.0f, 168.0f, 142.0f),
                    PathNode.CurveTo(171.3137f, 142.0f, 174.0f, 139.3137f, 174.0f, 136.0f),
                    PathNode.LineTo(174.0f, 116.0f),
                    PathNode.CurveTo(174.0f, 108.26801f, 180.26802f, 102.0f, 188.0f, 102.0f),
                    PathNode.CurveTo(195.73198f, 102.0f, 202.0f, 108.26801f, 202.0f, 116.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 12.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _handPalm!!
    }

private var _handPalm: ImageVector? = null
