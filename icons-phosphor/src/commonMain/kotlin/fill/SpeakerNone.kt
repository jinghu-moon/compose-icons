package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.SpeakerNone: ImageVector
    get() {
        if (_speakerNone != null) return _speakerNone!!
        _speakerNone = phosphorFillIcon(
            name = "SpeakerNone",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(64.0f, 84.0f),
                    PathNode.LineTo(64.0f, 172.0f),
                    PathNode.CurveTo(64.0f, 174.20914f, 62.20914f, 176.0f, 60.0f, 176.0f),
                    PathNode.LineTo(32.0f, 176.0f),
                    PathNode.CurveTo(23.163445f, 176.0f, 16.0f, 168.83656f, 16.0f, 160.0f),
                    PathNode.LineTo(16.0f, 96.0f),
                    PathNode.CurveTo(16.0f, 87.163445f, 23.163445f, 80.0f, 32.0f, 80.0f),
                    PathNode.LineTo(60.0f, 80.0f),
                    PathNode.CurveTo(62.20914f, 80.0f, 64.0f, 81.79086f, 64.0f, 84.0f),
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
        return _speakerNone!!
    }

private var _speakerNone: ImageVector? = null
