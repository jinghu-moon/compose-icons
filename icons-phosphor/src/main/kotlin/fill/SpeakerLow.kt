package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.SpeakerLow: ImageVector
    get() {
        if (_speakerLow != null) return _speakerLow!!
        _speakerLow = phosphorFillIcon(
            name = "SpeakerLow",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(160.0f, 32.25f),
                    PathNode.LineTo(160.0f, 223.69f),
                    PathNode.CurveTo(160.04951f, 226.60428f, 158.56493f, 229.33044f, 156.09f, 230.87f),
                    PathNode.CurveTo(153.26054f, 232.55293f, 149.68901f, 232.3307f, 147.09f, 230.31f),
                    PathNode.LineTo(81.52f, 179.31f),
                    PathNode.CurveTo(80.5568f, 178.54887f, 79.996445f, 177.38762f, 80.0f, 176.16f),
                    PathNode.LineTo(80.0f, 79.84f),
                    PathNode.CurveTo(80.00367f, 78.607254f, 80.57554f, 77.44505f, 81.55f, 76.69f),
                    PathNode.LineTo(147.12f, 25.69f),
                    PathNode.CurveTo(150.07997f, 23.396374f, 154.23492f, 23.462852f, 157.12f, 25.85f),
                    PathNode.CurveTo(158.98248f, 27.450014f, 160.03769f, 29.794909f, 160.0f, 32.25f),
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
                    PathNode.MoveTo(198.0f, 101.56f),
                    PathNode.CurveTo(196.12433f, 99.36376f, 193.21051f, 98.34903f, 190.37636f, 98.90509f),
                    PathNode.CurveTo(187.54222f, 99.46115f, 185.22783f, 101.50167f, 184.32109f, 104.24382f),
                    PathNode.CurveTo(183.41435f, 106.98598f, 184.05605f, 110.00397f, 186.0f, 112.14f),
                    PathNode.CurveTo(193.98296f, 121.206535f, 193.98296f, 134.79347f, 186.0f, 143.86f),
                    PathNode.CurveTo(184.05605f, 145.99603f, 183.41435f, 149.01402f, 184.32109f, 151.75618f),
                    PathNode.CurveTo(185.22783f, 154.49834f, 187.54222f, 156.53885f, 190.37636f, 157.09491f),
                    PathNode.CurveTo(193.21051f, 157.65097f, 196.12433f, 156.63625f, 198.0f, 154.44f),
                    PathNode.CurveTo(211.31276f, 139.32698f, 211.31276f, 116.67301f, 198.0f, 101.56f),
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
        return _speakerLow!!
    }

private var _speakerLow: ImageVector? = null
