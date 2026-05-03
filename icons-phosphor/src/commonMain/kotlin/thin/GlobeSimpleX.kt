package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.GlobeSimpleX: ImageVector
    get() {
        if (_globeSimpleX != null) return _globeSimpleX!!
        _globeSimpleX = phosphorThinIcon(
            name = "GlobeSimpleX",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(218.83f, 170.83f),
                    PathNode.LineTo(197.66f, 192.0f),
                    PathNode.LineTo(218.83f, 213.17f),
                    PathNode.CurveTo(220.39296f, 214.73297f, 220.39296f, 217.26703f, 218.83f, 218.83f),
                    PathNode.CurveTo(217.26703f, 220.39296f, 214.73297f, 220.39296f, 213.17f, 218.83f),
                    PathNode.LineTo(192.0f, 197.66f),
                    PathNode.LineTo(170.83f, 218.83f),
                    PathNode.CurveTo(169.26703f, 220.39296f, 166.73297f, 220.39296f, 165.17f, 218.83f),
                    PathNode.CurveTo(163.60704f, 217.26703f, 163.60704f, 214.73297f, 165.17f, 213.17f),
                    PathNode.LineTo(186.34f, 192.0f),
                    PathNode.LineTo(165.17f, 170.83f),
                    PathNode.CurveTo(163.60704f, 169.26703f, 163.60704f, 166.73297f, 165.17f, 165.17f),
                    PathNode.CurveTo(166.73297f, 163.60704f, 169.26703f, 163.60704f, 170.83f, 165.17f),
                    PathNode.LineTo(192.0f, 186.34f),
                    PathNode.LineTo(213.17f, 165.17f),
                    PathNode.CurveTo(214.73297f, 163.60704f, 217.26703f, 163.60704f, 218.83f, 165.17f),
                    PathNode.CurveTo(220.39296f, 166.73297f, 220.39296f, 169.26703f, 218.83f, 170.83f),
                    PathNode.Close,
                    PathNode.MoveTo(228.0f, 128.0f),
                    PathNode.CurveTo(228.0f, 130.20914f, 226.20914f, 132.0f, 224.0f, 132.0f),
                    PathNode.LineTo(92.08f, 132.0f),
                    PathNode.CurveTo(93.69f, 190.53f, 130.13f, 220.58f, 130.5f, 220.88f),
                    PathNode.LineTo(130.5f, 220.88f),
                    PathNode.CurveTo(131.82379f, 221.94205f, 132.33325f, 223.72386f, 131.771f, 225.32518f),
                    PathNode.CurveTo(131.20872f, 226.9265f, 129.69716f, 227.99867f, 128.0f, 228.0f),
                    PathNode.CurveTo(72.77152f, 228.0f, 28.0f, 183.22847f, 28.0f, 128.0f),
                    PathNode.CurveTo(28.0f, 72.77152f, 72.77152f, 28.0f, 128.0f, 28.0f),
                    PathNode.LineTo(128.0f, 28.0f),
                    PathNode.CurveTo(183.20334f, 28.060623f, 227.93938f, 72.79665f, 228.0f, 128.0f),
                    PathNode.Close,
                    PathNode.MoveTo(138.46f, 36.6f),
                    PathNode.CurveTo(150.2f, 49.48f, 170.79f, 78.45f, 171.94f, 124.0f),
                    PathNode.LineTo(219.94f, 124.0f),
                    PathNode.CurveTo(217.91174f, 78.81743f, 183.38963f, 41.787094f, 138.46f, 36.6f),
                    PathNode.Close,
                    PathNode.MoveTo(92.07f, 124.0f),
                    PathNode.LineTo(163.93f, 124.0f),
                    PathNode.CurveTo(162.57f, 74.52f, 136.32f, 45.4f, 128.0f, 37.39f),
                    PathNode.CurveTo(119.68f, 45.39f, 93.43f, 74.52f, 92.07f, 124.0f),
                    PathNode.Close,
                    PathNode.MoveTo(36.07f, 124.0f),
                    PathNode.LineTo(84.07f, 124.0f),
                    PathNode.CurveTo(85.22f, 78.45f, 105.81f, 49.48f, 117.55f, 36.6f),
                    PathNode.CurveTo(72.628235f, 41.79618f, 38.116814f, 78.82415f, 36.09f, 124.0f),
                    PathNode.Close,
                    PathNode.MoveTo(84.07f, 132.0f),
                    PathNode.LineTo(36.07f, 132.0f),
                    PathNode.CurveTo(38.09609f, 177.17249f, 72.60217f, 214.19928f, 117.52f, 219.4f),
                    PathNode.CurveTo(105.8f, 206.52f, 85.21f, 177.55f, 84.06f, 132.0f),
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
        return _globeSimpleX!!
    }

private var _globeSimpleX: ImageVector? = null
