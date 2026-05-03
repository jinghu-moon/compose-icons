package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.NumberCircleFour: ImageVector
    get() {
        if (_numberCircleFour != null) return _numberCircleFour!!
        _numberCircleFour = phosphorThinIcon(
            name = "NumberCircleFour",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(128.0f, 28.0f),
                    PathNode.CurveTo(72.77152f, 28.0f, 28.0f, 72.77152f, 28.0f, 128.0f),
                    PathNode.CurveTo(28.0f, 183.22847f, 72.77152f, 228.0f, 128.0f, 228.0f),
                    PathNode.CurveTo(183.22847f, 228.0f, 228.0f, 183.22847f, 228.0f, 128.0f),
                    PathNode.CurveTo(227.93938f, 72.79665f, 183.20334f, 28.060623f, 128.0f, 28.0f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 220.0f),
                    PathNode.CurveTo(77.18981f, 220.0f, 36.0f, 178.8102f, 36.0f, 128.0f),
                    PathNode.CurveTo(36.0f, 77.18981f, 77.18981f, 36.0f, 128.0f, 36.0f),
                    PathNode.CurveTo(178.8102f, 36.0f, 220.0f, 77.18981f, 220.0f, 128.0f),
                    PathNode.CurveTo(219.94489f, 178.78735f, 178.78735f, 219.94489f, 128.0f, 220.0f),
                    PathNode.Close,
                    PathNode.MoveTo(160.0f, 148.0f),
                    PathNode.LineTo(148.0f, 148.0f),
                    PathNode.LineTo(148.0f, 80.0f),
                    PathNode.CurveTo(148.00325f, 78.28902f, 146.91788f, 76.76543f, 145.29973f, 76.209465f),
                    PathNode.CurveTo(143.6816f, 75.65351f, 141.88902f, 76.18832f, 140.84f, 77.54f),
                    PathNode.LineTo(84.84f, 149.54f),
                    PathNode.CurveTo(83.89919f, 150.74626f, 83.72876f, 152.38347f, 84.400955f, 153.75764f),
                    PathNode.CurveTo(85.07315f, 155.1318f, 86.47024f, 156.00226f, 88.0f, 156.0f),
                    PathNode.LineTo(140.0f, 156.0f),
                    PathNode.LineTo(140.0f, 176.0f),
                    PathNode.CurveTo(140.0f, 178.20914f, 141.79086f, 180.0f, 144.0f, 180.0f),
                    PathNode.CurveTo(146.20914f, 180.0f, 148.0f, 178.20914f, 148.0f, 176.0f),
                    PathNode.LineTo(148.0f, 156.0f),
                    PathNode.LineTo(160.0f, 156.0f),
                    PathNode.CurveTo(162.20914f, 156.0f, 164.0f, 154.20914f, 164.0f, 152.0f),
                    PathNode.CurveTo(164.0f, 149.79086f, 162.20914f, 148.0f, 160.0f, 148.0f),
                    PathNode.Close,
                    PathNode.MoveTo(140.0f, 148.0f),
                    PathNode.LineTo(96.18f, 148.0f),
                    PathNode.LineTo(140.0f, 91.66f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 8.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _numberCircleFour!!
    }

private var _numberCircleFour: ImageVector? = null
