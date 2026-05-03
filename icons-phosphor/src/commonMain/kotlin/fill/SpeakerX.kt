package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.SpeakerX: ImageVector
    get() {
        if (_speakerX != null) return _speakerX!!
        _speakerX = phosphorFillIcon(
            name = "SpeakerX",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(245.66f, 146.34f),
                    PathNode.CurveTo(248.78593f, 149.46593f, 248.78593f, 154.53407f, 245.66f, 157.66f),
                    PathNode.CurveTo(242.53407f, 160.78593f, 237.46593f, 160.78593f, 234.34f, 157.66f),
                    PathNode.LineTo(216.0f, 139.31f),
                    PathNode.LineTo(197.66f, 157.66f),
                    PathNode.CurveTo(194.53407f, 160.78593f, 189.46593f, 160.78593f, 186.34f, 157.66f),
                    PathNode.CurveTo(183.21407f, 154.53407f, 183.21407f, 149.46593f, 186.34f, 146.34f),
                    PathNode.LineTo(204.69f, 128.0f),
                    PathNode.LineTo(186.34f, 109.66f),
                    PathNode.CurveTo(183.21407f, 106.534065f, 183.21407f, 101.465935f, 186.34f, 98.34f),
                    PathNode.CurveTo(189.46593f, 95.214066f, 194.53407f, 95.214066f, 197.66f, 98.34f),
                    PathNode.LineTo(216.0f, 116.69f),
                    PathNode.LineTo(234.34f, 98.34f),
                    PathNode.CurveTo(237.46593f, 95.214066f, 242.53407f, 95.214066f, 245.66f, 98.34f),
                    PathNode.CurveTo(248.78593f, 101.465935f, 248.78593f, 106.534065f, 245.66f, 109.66f),
                    PathNode.LineTo(227.31f, 128.0f),
                    PathNode.Close,
                    PathNode.MoveTo(60.0f, 80.0f),
                    PathNode.LineTo(32.0f, 80.0f),
                    PathNode.CurveTo(23.163445f, 80.0f, 16.0f, 87.163445f, 16.0f, 96.0f),
                    PathNode.LineTo(16.0f, 160.0f),
                    PathNode.CurveTo(16.0f, 168.83656f, 23.163445f, 176.0f, 32.0f, 176.0f),
                    PathNode.LineTo(60.0f, 176.0f),
                    PathNode.CurveTo(62.20914f, 176.0f, 64.0f, 174.20914f, 64.0f, 172.0f),
                    PathNode.LineTo(64.0f, 84.0f),
                    PathNode.CurveTo(64.0f, 81.79086f, 62.20914f, 80.0f, 60.0f, 80.0f),
                    PathNode.Close,
                    PathNode.MoveTo(157.15f, 25.85f),
                    PathNode.CurveTo(154.26492f, 23.462852f, 150.10997f, 23.396374f, 147.15f, 25.69f),
                    PathNode.LineTo(81.58f, 76.69f),
                    PathNode.CurveTo(80.59426f, 77.43893f, 80.01084f, 78.60207f, 80.0f, 79.84f),
                    PathNode.LineTo(80.0f, 176.16f),
                    PathNode.CurveTo(80.00367f, 177.39275f, 80.57554f, 178.55495f, 81.55f, 179.31f),
                    PathNode.LineTo(147.12f, 230.31f),
                    PathNode.CurveTo(149.71901f, 232.3307f, 153.29054f, 232.55293f, 156.12f, 230.87f),
                    PathNode.CurveTo(158.59492f, 229.33044f, 160.07951f, 226.60428f, 160.03f, 223.69f),
                    PathNode.LineTo(160.03f, 32.25f),
                    PathNode.CurveTo(160.06023f, 29.790026f, 158.99365f, 27.444307f, 157.12f, 25.85f),
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
        return _speakerX!!
    }

private var _speakerX: ImageVector? = null
