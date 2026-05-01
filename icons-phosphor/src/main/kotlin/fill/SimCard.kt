package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.SimCard: ImageVector
    get() {
        if (_simCard != null) return _simCard!!
        _simCard = phosphorFillIcon(
            name = "SimCard",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(213.66f, 82.34f),
                    PathNode.LineTo(157.66f, 26.34f),
                    PathNode.CurveTo(156.15842f, 24.840092f, 154.12238f, 23.998331f, 152.0f, 24.0f),
                    PathNode.LineTo(56.0f, 24.0f),
                    PathNode.CurveTo(47.163445f, 24.0f, 40.0f, 31.163445f, 40.0f, 40.0f),
                    PathNode.LineTo(40.0f, 216.0f),
                    PathNode.CurveTo(40.0f, 224.83656f, 47.163445f, 232.0f, 56.0f, 232.0f),
                    PathNode.LineTo(200.0f, 232.0f),
                    PathNode.CurveTo(208.83656f, 232.0f, 216.0f, 224.83656f, 216.0f, 216.0f),
                    PathNode.LineTo(216.0f, 88.0f),
                    PathNode.CurveTo(216.00166f, 85.87763f, 215.15993f, 83.841576f, 213.66f, 82.34f),
                    PathNode.Close,
                    PathNode.MoveTo(184.0f, 192.0f),
                    PathNode.CurveTo(184.0f, 196.41827f, 180.41827f, 200.0f, 176.0f, 200.0f),
                    PathNode.LineTo(160.0f, 200.0f),
                    PathNode.CurveTo(157.79086f, 200.0f, 156.0f, 198.20914f, 156.0f, 196.0f),
                    PathNode.LineTo(156.0f, 160.27f),
                    PathNode.CurveTo(156.05766f, 155.987f, 152.79767f, 152.38661f, 148.53f, 152.02f),
                    PathNode.CurveTo(146.31801f, 151.87312f, 144.14429f, 152.65068f, 142.52731f, 154.16719f),
                    PathNode.CurveTo(140.91034f, 155.6837f, 139.99513f, 157.80316f, 140.0f, 160.02f),
                    PathNode.LineTo(140.0f, 196.02f),
                    PathNode.CurveTo(140.0f, 198.22914f, 138.20914f, 200.02f, 136.0f, 200.02f),
                    PathNode.LineTo(120.0f, 200.02f),
                    PathNode.CurveTo(117.79086f, 200.02f, 116.0f, 198.22914f, 116.0f, 196.02f),
                    PathNode.LineTo(116.0f, 160.27f),
                    PathNode.CurveTo(116.05766f, 155.987f, 112.79768f, 152.38661f, 108.53f, 152.02f),
                    PathNode.CurveTo(106.31803f, 151.87312f, 104.14429f, 152.65068f, 102.52731f, 154.16719f),
                    PathNode.CurveTo(100.91034f, 155.6837f, 99.99513f, 157.80316f, 100.0f, 160.02f),
                    PathNode.LineTo(100.0f, 196.02f),
                    PathNode.CurveTo(100.0f, 198.22914f, 98.20914f, 200.02f, 96.0f, 200.02f),
                    PathNode.LineTo(80.0f, 200.02f),
                    PathNode.CurveTo(75.58172f, 200.02f, 72.0f, 196.43828f, 72.0f, 192.02f),
                    PathNode.LineTo(72.0f, 136.0f),
                    PathNode.CurveTo(72.0f, 131.58173f, 75.58172f, 128.0f, 80.0f, 128.0f),
                    PathNode.LineTo(176.0f, 128.0f),
                    PathNode.CurveTo(180.41827f, 128.0f, 184.0f, 131.58173f, 184.0f, 136.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 4f,
            )
        }
        return _simCard!!
    }

private var _simCard: ImageVector? = null
