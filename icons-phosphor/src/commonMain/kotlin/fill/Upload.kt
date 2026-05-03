package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Upload: ImageVector
    get() {
        if (_upload != null) return _upload!!
        _upload = phosphorFillIcon(
            name = "Upload",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(74.34f, 77.66f),
                    PathNode.CurveTo(72.83778f, 76.159454f, 71.993706f, 74.123276f, 71.993706f, 72.0f),
                    PathNode.CurveTo(71.993706f, 69.876724f, 72.83778f, 67.840546f, 74.34f, 66.34f),
                    PathNode.LineTo(122.34f, 18.34f),
                    PathNode.CurveTo(123.840546f, 16.837784f, 125.876724f, 15.993707f, 128.0f, 15.993707f),
                    PathNode.CurveTo(130.12328f, 15.993707f, 132.15945f, 16.837784f, 133.66f, 18.34f),
                    PathNode.LineTo(181.66f, 66.34f),
                    PathNode.CurveTo(184.78593f, 69.465935f, 184.78593f, 74.534065f, 181.66f, 77.66f),
                    PathNode.CurveTo(178.53407f, 80.785934f, 173.46593f, 80.785934f, 170.34f, 77.66f),
                    PathNode.LineTo(136.0f, 43.31f),
                    PathNode.LineTo(136.0f, 128.0f),
                    PathNode.CurveTo(136.0f, 132.41827f, 132.41827f, 136.0f, 128.0f, 136.0f),
                    PathNode.CurveTo(123.58172f, 136.0f, 120.0f, 132.41827f, 120.0f, 128.0f),
                    PathNode.LineTo(120.0f, 43.31f),
                    PathNode.LineTo(85.66f, 77.66f),
                    PathNode.CurveTo(84.159454f, 79.16222f, 82.123276f, 80.006294f, 80.0f, 80.006294f),
                    PathNode.CurveTo(77.876724f, 80.006294f, 75.840546f, 79.16222f, 74.34f, 77.66f),
                    PathNode.Close,
                    PathNode.MoveTo(240.0f, 136.0f),
                    PathNode.LineTo(240.0f, 200.0f),
                    PathNode.CurveTo(240.0f, 208.83656f, 232.83656f, 216.0f, 224.0f, 216.0f),
                    PathNode.LineTo(32.0f, 216.0f),
                    PathNode.CurveTo(23.163445f, 216.0f, 16.0f, 208.83656f, 16.0f, 200.0f),
                    PathNode.LineTo(16.0f, 136.0f),
                    PathNode.CurveTo(16.0f, 127.163445f, 23.163445f, 120.0f, 32.0f, 120.0f),
                    PathNode.LineTo(100.0f, 120.0f),
                    PathNode.CurveTo(102.20914f, 120.0f, 104.0f, 121.79086f, 104.0f, 124.0f),
                    PathNode.LineTo(104.0f, 127.46f),
                    PathNode.CurveTo(104.0f, 140.91f, 115.0f, 152.25f, 128.46f, 152.0f),
                    PathNode.CurveTo(141.53485f, 151.74936f, 152.0024f, 141.07726f, 152.0f, 128.0f),
                    PathNode.LineTo(152.0f, 124.0f),
                    PathNode.CurveTo(152.0f, 121.79086f, 153.79086f, 120.0f, 156.0f, 120.0f),
                    PathNode.LineTo(224.0f, 120.0f),
                    PathNode.CurveTo(232.83656f, 120.0f, 240.0f, 127.163445f, 240.0f, 136.0f),
                    PathNode.Close,
                    PathNode.MoveTo(200.0f, 168.0f),
                    PathNode.CurveTo(200.0f, 161.37259f, 194.62741f, 156.0f, 188.0f, 156.0f),
                    PathNode.CurveTo(181.37259f, 156.0f, 176.0f, 161.37259f, 176.0f, 168.0f),
                    PathNode.CurveTo(176.0f, 174.62741f, 181.37259f, 180.0f, 188.0f, 180.0f),
                    PathNode.CurveTo(194.62741f, 180.0f, 200.0f, 174.62741f, 200.0f, 168.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 4f,
            )
        }
        return _upload!!
    }

private var _upload: ImageVector? = null
