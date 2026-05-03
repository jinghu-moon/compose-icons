package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Coffee: ImageVector
    get() {
        if (_coffee != null) return _coffee!!
        _coffee = phosphorLightIcon(
            name = "Coffee",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(82.0f, 56.0f),
                    PathNode.LineTo(82.0f, 24.0f),
                    PathNode.CurveTo(82.0f, 20.68629f, 84.686295f, 18.0f, 88.0f, 18.0f),
                    PathNode.CurveTo(91.313705f, 18.0f, 94.0f, 20.68629f, 94.0f, 24.0f),
                    PathNode.LineTo(94.0f, 56.0f),
                    PathNode.CurveTo(94.0f, 59.31371f, 91.313705f, 62.0f, 88.0f, 62.0f),
                    PathNode.CurveTo(84.686295f, 62.0f, 82.0f, 59.31371f, 82.0f, 56.0f),
                    PathNode.Close,
                    PathNode.MoveTo(120.0f, 62.0f),
                    PathNode.CurveTo(123.313705f, 62.0f, 126.0f, 59.31371f, 126.0f, 56.0f),
                    PathNode.LineTo(126.0f, 24.0f),
                    PathNode.CurveTo(126.0f, 20.68629f, 123.313705f, 18.0f, 120.0f, 18.0f),
                    PathNode.CurveTo(116.686295f, 18.0f, 114.0f, 20.68629f, 114.0f, 24.0f),
                    PathNode.LineTo(114.0f, 56.0f),
                    PathNode.CurveTo(114.0f, 59.31371f, 116.686295f, 62.0f, 120.0f, 62.0f),
                    PathNode.Close,
                    PathNode.MoveTo(152.0f, 62.0f),
                    PathNode.CurveTo(155.3137f, 62.0f, 158.0f, 59.31371f, 158.0f, 56.0f),
                    PathNode.LineTo(158.0f, 24.0f),
                    PathNode.CurveTo(158.0f, 20.68629f, 155.3137f, 18.0f, 152.0f, 18.0f),
                    PathNode.CurveTo(148.6863f, 18.0f, 146.0f, 20.68629f, 146.0f, 24.0f),
                    PathNode.LineTo(146.0f, 56.0f),
                    PathNode.CurveTo(146.0f, 59.31371f, 148.6863f, 62.0f, 152.0f, 62.0f),
                    PathNode.Close,
                    PathNode.MoveTo(246.0f, 120.0f),
                    PathNode.LineTo(246.0f, 128.0f),
                    PathNode.CurveTo(246.00801f, 148.57974f, 229.63173f, 165.42593f, 209.06f, 166.0f),
                    PathNode.CurveTo(203.17206f, 183.37633f, 192.35583f, 198.66425f, 177.93f, 210.0f),
                    PathNode.LineTo(208.0f, 210.0f),
                    PathNode.CurveTo(211.3137f, 210.0f, 214.0f, 212.6863f, 214.0f, 216.0f),
                    PathNode.CurveTo(214.0f, 219.3137f, 211.3137f, 222.0f, 208.0f, 222.0f),
                    PathNode.LineTo(32.0f, 222.0f),
                    PathNode.CurveTo(28.68629f, 222.0f, 26.0f, 219.3137f, 26.0f, 216.0f),
                    PathNode.CurveTo(26.0f, 212.6863f, 28.68629f, 210.0f, 32.0f, 210.0f),
                    PathNode.LineTo(62.07f, 210.0f),
                    PathNode.CurveTo(39.350887f, 192.15694f, 26.059233f, 164.88823f, 26.0f, 136.0f),
                    PathNode.LineTo(26.0f, 88.0f),
                    PathNode.CurveTo(26.0f, 84.686295f, 28.68629f, 82.0f, 32.0f, 82.0f),
                    PathNode.LineTo(208.0f, 82.0f),
                    PathNode.CurveTo(228.98682f, 82.0f, 246.0f, 99.013176f, 246.0f, 120.0f),
                    PathNode.Close,
                    PathNode.MoveTo(202.0f, 136.0f),
                    PathNode.LineTo(202.0f, 94.0f),
                    PathNode.LineTo(38.0f, 94.0f),
                    PathNode.LineTo(38.0f, 136.0f),
                    PathNode.CurveTo(38.06478f, 167.57948f, 56.20013f, 196.33492f, 84.67f, 210.0f),
                    PathNode.LineTo(155.33f, 210.0f),
                    PathNode.CurveTo(183.79987f, 196.33492f, 201.93523f, 167.57948f, 202.0f, 136.0f),
                    PathNode.Close,
                    PathNode.MoveTo(234.0f, 120.0f),
                    PathNode.CurveTo(233.99619f, 107.955f, 225.7199f, 97.48962f, 214.0f, 94.71f),
                    PathNode.LineTo(214.0f, 136.0f),
                    PathNode.CurveTo(213.99834f, 141.92033f, 213.43245f, 147.82704f, 212.31f, 153.64f),
                    PathNode.CurveTo(224.8304f, 151.53539f, 233.99986f, 140.69606f, 234.0f, 128.0f),
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
        return _coffee!!
    }

private var _coffee: ImageVector? = null
