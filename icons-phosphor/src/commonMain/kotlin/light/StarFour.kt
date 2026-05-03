package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.StarFour: ImageVector
    get() {
        if (_starFour != null) return _starFour!!
        _starFour = phosphorLightIcon(
            name = "StarFour",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(228.81f, 114.89f),
                    PathNode.LineTo(164.5f, 91.5f),
                    PathNode.LineTo(141.11f, 27.19f),
                    PathNode.CurveTo(139.10522f, 21.67728f, 133.86594f, 18.00764f, 128.0f, 18.00764f),
                    PathNode.CurveTo(122.13406f, 18.00764f, 116.89478f, 21.67728f, 114.89f, 27.19f),
                    PathNode.LineTo(91.5f, 91.5f),
                    PathNode.LineTo(27.19f, 114.89f),
                    PathNode.CurveTo(21.67728f, 116.89478f, 18.00764f, 122.13406f, 18.00764f, 128.0f),
                    PathNode.CurveTo(18.00764f, 133.86594f, 21.67728f, 139.10522f, 27.19f, 141.11f),
                    PathNode.LineTo(91.5f, 164.5f),
                    PathNode.LineTo(114.89f, 228.81f),
                    PathNode.CurveTo(116.89478f, 234.32272f, 122.13406f, 237.99236f, 128.0f, 237.99236f),
                    PathNode.CurveTo(133.86594f, 237.99236f, 139.10522f, 234.32272f, 141.11f, 228.81f),
                    PathNode.LineTo(164.5f, 164.5f),
                    PathNode.LineTo(228.81f, 141.11f),
                    PathNode.CurveTo(234.32272f, 139.10522f, 237.99236f, 133.86594f, 237.99236f, 128.0f),
                    PathNode.CurveTo(237.99236f, 122.13406f, 234.32272f, 116.89478f, 228.81f, 114.89f),
                    PathNode.Close,
                    PathNode.MoveTo(224.71f, 129.89f),
                    PathNode.LineTo(157.77f, 154.23f),
                    PathNode.CurveTo(156.10106f, 154.83647f, 154.78647f, 156.15106f, 154.18f, 157.82f),
                    PathNode.LineTo(129.84f, 224.76f),
                    PathNode.CurveTo(129.52582f, 225.49751f, 128.80164f, 225.97617f, 128.0f, 225.97617f),
                    PathNode.CurveTo(127.198364f, 225.97617f, 126.474174f, 225.49751f, 126.16f, 224.76f),
                    PathNode.LineTo(101.82f, 157.82f),
                    PathNode.CurveTo(101.21353f, 156.15106f, 99.89895f, 154.83647f, 98.23f, 154.23f),
                    PathNode.LineTo(31.29f, 129.84f),
                    PathNode.CurveTo(30.552494f, 129.52582f, 30.073837f, 128.80164f, 30.073837f, 128.0f),
                    PathNode.CurveTo(30.073837f, 127.198364f, 30.552494f, 126.474174f, 31.29f, 126.16f),
                    PathNode.LineTo(98.23f, 101.82f),
                    PathNode.CurveTo(99.89895f, 101.21353f, 101.21353f, 99.89895f, 101.82f, 98.23f),
                    PathNode.LineTo(126.16f, 31.29f),
                    PathNode.CurveTo(126.474174f, 30.552494f, 127.198364f, 30.073837f, 128.0f, 30.073837f),
                    PathNode.CurveTo(128.80164f, 30.073837f, 129.52582f, 30.552494f, 129.84f, 31.29f),
                    PathNode.LineTo(154.18f, 98.23f),
                    PathNode.CurveTo(154.78647f, 99.89895f, 156.10106f, 101.21353f, 157.77f, 101.82f),
                    PathNode.LineTo(224.71f, 126.16f),
                    PathNode.CurveTo(225.44751f, 126.474174f, 225.92616f, 127.198364f, 225.92616f, 128.0f),
                    PathNode.CurveTo(225.92616f, 128.80164f, 225.44751f, 129.52582f, 224.71f, 129.84f),
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
        return _starFour!!
    }

private var _starFour: ImageVector? = null
