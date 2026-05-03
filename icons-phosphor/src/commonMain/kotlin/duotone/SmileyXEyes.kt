package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.SmileyXEyes: ImageVector
    get() {
        if (_smileyXEyes != null) return _smileyXEyes!!
        _smileyXEyes = phosphorDuotoneIcon(
            name = "SmileyXEyes",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(224.0f, 128.0f),
                    PathNode.CurveTo(224.0f, 181.01933f, 181.01933f, 224.0f, 128.0f, 224.0f),
                    PathNode.CurveTo(74.98067f, 224.0f, 32.0f, 181.01933f, 32.0f, 128.0f),
                    PathNode.CurveTo(32.0f, 74.98067f, 74.98067f, 32.0f, 128.0f, 32.0f),
                    PathNode.CurveTo(181.01933f, 32.0f, 224.0f, 74.98067f, 224.0f, 128.0f),
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
                    PathNode.MoveTo(128.0f, 24.0f),
                    PathNode.CurveTo(70.562386f, 24.0f, 24.0f, 70.562386f, 24.0f, 128.0f),
                    PathNode.CurveTo(24.0f, 185.4376f, 70.562386f, 232.0f, 128.0f, 232.0f),
                    PathNode.CurveTo(185.4376f, 232.0f, 232.0f, 185.4376f, 232.0f, 128.0f),
                    PathNode.CurveTo(231.93938f, 70.58752f, 185.41248f, 24.060629f, 128.0f, 24.0f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 216.0f),
                    PathNode.CurveTo(79.39894f, 216.0f, 40.0f, 176.60106f, 40.0f, 128.0f),
                    PathNode.CurveTo(40.0f, 79.39894f, 79.39894f, 40.0f, 128.0f, 40.0f),
                    PathNode.CurveTo(176.60106f, 40.0f, 216.0f, 79.39894f, 216.0f, 128.0f),
                    PathNode.CurveTo(215.94489f, 176.57822f, 176.57822f, 215.94489f, 128.0f, 216.0f),
                    PathNode.Close,
                    PathNode.MoveTo(189.66f, 122.34f),
                    PathNode.CurveTo(192.78593f, 125.465935f, 192.78593f, 130.53407f, 189.66f, 133.66f),
                    PathNode.CurveTo(186.53407f, 136.78593f, 181.46593f, 136.78593f, 178.34f, 133.66f),
                    PathNode.LineTo(168.0f, 123.31f),
                    PathNode.LineTo(157.66f, 133.66f),
                    PathNode.CurveTo(154.53407f, 136.78593f, 149.46593f, 136.78593f, 146.34f, 133.66f),
                    PathNode.CurveTo(143.21407f, 130.53407f, 143.21407f, 125.465935f, 146.34f, 122.34f),
                    PathNode.LineTo(156.69f, 112.0f),
                    PathNode.LineTo(146.34f, 101.66f),
                    PathNode.CurveTo(143.21407f, 98.534065f, 143.21407f, 93.465935f, 146.34f, 90.34f),
                    PathNode.CurveTo(149.46593f, 87.214066f, 154.53407f, 87.214066f, 157.66f, 90.34f),
                    PathNode.LineTo(168.0f, 100.69f),
                    PathNode.LineTo(178.34f, 90.34f),
                    PathNode.CurveTo(181.46593f, 87.214066f, 186.53407f, 87.214066f, 189.66f, 90.34f),
                    PathNode.CurveTo(192.78593f, 93.465935f, 192.78593f, 98.534065f, 189.66f, 101.66f),
                    PathNode.LineTo(179.31f, 112.0f),
                    PathNode.Close,
                    PathNode.MoveTo(109.66f, 101.66f),
                    PathNode.LineTo(99.31f, 112.0f),
                    PathNode.LineTo(109.66f, 122.34f),
                    PathNode.CurveTo(112.785934f, 125.465935f, 112.785934f, 130.53407f, 109.66f, 133.66f),
                    PathNode.CurveTo(106.534065f, 136.78593f, 101.465935f, 136.78593f, 98.34f, 133.66f),
                    PathNode.LineTo(88.0f, 123.31f),
                    PathNode.LineTo(77.66f, 133.66f),
                    PathNode.CurveTo(74.534065f, 136.78593f, 69.465935f, 136.78593f, 66.34f, 133.66f),
                    PathNode.CurveTo(63.21407f, 130.53407f, 63.21407f, 125.465935f, 66.34f, 122.34f),
                    PathNode.LineTo(76.69f, 112.0f),
                    PathNode.LineTo(66.34f, 101.66f),
                    PathNode.CurveTo(63.21407f, 98.534065f, 63.21407f, 93.465935f, 66.34f, 90.34f),
                    PathNode.CurveTo(69.465935f, 87.214066f, 74.534065f, 87.214066f, 77.66f, 90.34f),
                    PathNode.LineTo(88.0f, 100.69f),
                    PathNode.LineTo(98.34f, 90.34f),
                    PathNode.CurveTo(101.465935f, 87.214066f, 106.534065f, 87.214066f, 109.66f, 90.34f),
                    PathNode.CurveTo(112.785934f, 93.465935f, 112.785934f, 98.534065f, 109.66f, 101.66f),
                    PathNode.Close,
                    PathNode.MoveTo(140.0f, 180.0f),
                    PathNode.CurveTo(140.0f, 186.62741f, 134.62741f, 192.0f, 128.0f, 192.0f),
                    PathNode.CurveTo(121.37258f, 192.0f, 116.0f, 186.62741f, 116.0f, 180.0f),
                    PathNode.CurveTo(116.0f, 173.37259f, 121.37258f, 168.0f, 128.0f, 168.0f),
                    PathNode.CurveTo(134.62741f, 168.0f, 140.0f, 173.37259f, 140.0f, 180.0f),
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
        return _smileyXEyes!!
    }

private var _smileyXEyes: ImageVector? = null
