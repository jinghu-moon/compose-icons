package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.FileCode: ImageVector
    get() {
        if (_fileCode != null) return _fileCode!!
        _fileCode = phosphorRegularIcon(
            name = "FileCode",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(181.66f, 146.34f),
                    PathNode.CurveTo(183.16223f, 147.84055f, 184.00629f, 149.87672f, 184.00629f, 152.0f),
                    PathNode.CurveTo(184.00629f, 154.12328f, 183.16223f, 156.15945f, 181.66f, 157.66f),
                    PathNode.LineTo(157.66f, 181.66f),
                    PathNode.CurveTo(154.53407f, 184.78593f, 149.46593f, 184.78593f, 146.34f, 181.66f),
                    PathNode.CurveTo(143.21407f, 178.53407f, 143.21407f, 173.46593f, 146.34f, 170.34f),
                    PathNode.LineTo(164.69f, 152.0f),
                    PathNode.LineTo(146.34f, 133.66f),
                    PathNode.CurveTo(143.21407f, 130.53407f, 143.21407f, 125.465935f, 146.34f, 122.34f),
                    PathNode.CurveTo(149.46593f, 119.214066f, 154.53407f, 119.214066f, 157.66f, 122.34f),
                    PathNode.Close,
                    PathNode.MoveTo(109.66f, 122.34f),
                    PathNode.CurveTo(108.159454f, 120.83778f, 106.123276f, 119.993706f, 104.0f, 119.993706f),
                    PathNode.CurveTo(101.876724f, 119.993706f, 99.840546f, 120.83778f, 98.34f, 122.34f),
                    PathNode.LineTo(74.34f, 146.34f),
                    PathNode.CurveTo(72.83778f, 147.84055f, 71.993706f, 149.87672f, 71.993706f, 152.0f),
                    PathNode.CurveTo(71.993706f, 154.12328f, 72.83778f, 156.15945f, 74.34f, 157.66f),
                    PathNode.LineTo(98.34f, 181.66f),
                    PathNode.CurveTo(101.465935f, 184.78593f, 106.534065f, 184.78593f, 109.66f, 181.66f),
                    PathNode.CurveTo(112.785934f, 178.53407f, 112.785934f, 173.46593f, 109.66f, 170.34f),
                    PathNode.LineTo(91.31f, 152.0f),
                    PathNode.LineTo(109.66f, 133.66f),
                    PathNode.CurveTo(111.16222f, 132.15945f, 112.006294f, 130.12328f, 112.006294f, 128.0f),
                    PathNode.CurveTo(112.006294f, 125.876724f, 111.16222f, 123.840546f, 109.66f, 122.34f),
                    PathNode.Close,
                    PathNode.MoveTo(216.0f, 88.0f),
                    PathNode.LineTo(216.0f, 216.0f),
                    PathNode.CurveTo(216.0f, 224.83656f, 208.83656f, 232.0f, 200.0f, 232.0f),
                    PathNode.LineTo(56.0f, 232.0f),
                    PathNode.CurveTo(47.163445f, 232.0f, 40.0f, 224.83656f, 40.0f, 216.0f),
                    PathNode.LineTo(40.0f, 40.0f),
                    PathNode.CurveTo(40.0f, 31.163445f, 47.163445f, 24.0f, 56.0f, 24.0f),
                    PathNode.LineTo(152.0f, 24.0f),
                    PathNode.CurveTo(154.12238f, 23.998331f, 156.15842f, 24.840092f, 157.66f, 26.34f),
                    PathNode.LineTo(213.66f, 82.34f),
                    PathNode.CurveTo(215.15993f, 83.841576f, 216.00166f, 85.87763f, 216.0f, 88.0f),
                    PathNode.Close,
                    PathNode.MoveTo(160.0f, 80.0f),
                    PathNode.LineTo(188.69f, 80.0f),
                    PathNode.LineTo(160.0f, 51.31f),
                    PathNode.Close,
                    PathNode.MoveTo(200.0f, 216.0f),
                    PathNode.LineTo(200.0f, 96.0f),
                    PathNode.LineTo(152.0f, 96.0f),
                    PathNode.CurveTo(147.58173f, 96.0f, 144.0f, 92.41828f, 144.0f, 88.0f),
                    PathNode.LineTo(144.0f, 40.0f),
                    PathNode.LineTo(56.0f, 40.0f),
                    PathNode.LineTo(56.0f, 216.0f),
                    PathNode.LineTo(200.0f, 216.0f),
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
        return _fileCode!!
    }

private var _fileCode: ImageVector? = null
