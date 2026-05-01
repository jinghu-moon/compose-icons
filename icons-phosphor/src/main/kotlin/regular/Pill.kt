package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.Pill: ImageVector
    get() {
        if (_pill != null) return _pill!!
        _pill = phosphorRegularIcon(
            name = "Pill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(216.42f, 39.6f),
                    PathNode.CurveTo(195.62079f, 18.801352f, 161.8992f, 18.801352f, 141.1f, 39.6f),
                    PathNode.LineTo(39.6f, 141.09f),
                    PathNode.CurveTo(19.249813f, 161.9639f, 19.462791f, 195.31973f, 40.07787f, 215.93207f),
                    PathNode.CurveTo(60.692944f, 236.5444f, 94.0488f, 236.75296f, 114.92f, 216.4f),
                    PathNode.LineTo(114.92f, 216.4f),
                    PathNode.LineTo(216.43f, 114.91f),
                    PathNode.CurveTo(237.19167f, 94.09778f, 237.1872f, 60.40671f, 216.42f, 39.6f),
                    PathNode.Close,
                    PathNode.MoveTo(103.61f, 205.09f),
                    PathNode.LineTo(103.61f, 205.09f),
                    PathNode.CurveTo(89.06006f, 219.6427f, 65.467705f, 219.64494f, 50.915f, 205.095f),
                    PathNode.CurveTo(36.362297f, 190.54506f, 36.360058f, 166.9527f, 50.91f, 152.4f),
                    PathNode.LineTo(96.0f, 107.31f),
                    PathNode.LineTo(148.7f, 160.0f),
                    PathNode.Close,
                    PathNode.MoveTo(205.11f, 103.6f),
                    PathNode.LineTo(160.0f, 148.69f),
                    PathNode.LineTo(107.32f, 96.0f),
                    PathNode.LineTo(152.42f, 50.91f),
                    PathNode.CurveTo(167.0185f, 36.648754f, 190.3731f, 36.785206f, 204.80394f, 51.216057f),
                    PathNode.CurveTo(219.2348f, 65.64691f, 219.37125f, 89.00151f, 205.11f, 103.6f),
                    PathNode.Close,
                    PathNode.MoveTo(189.68f, 82.34f),
                    PathNode.CurveTo(191.18222f, 83.840546f, 192.02629f, 85.876724f, 192.02629f, 88.0f),
                    PathNode.CurveTo(192.02629f, 90.123276f, 191.18222f, 92.159454f, 189.68f, 93.66f),
                    PathNode.LineTo(165.68f, 117.66f),
                    PathNode.CurveTo(162.55406f, 120.78317f, 157.48817f, 120.78093f, 154.365f, 117.655f),
                    PathNode.CurveTo(151.24184f, 114.52906f, 151.24406f, 109.46317f, 154.37f, 106.34f),
                    PathNode.LineTo(178.37f, 82.34f),
                    PathNode.CurveTo(181.49377f, 79.21828f, 186.55623f, 79.21828f, 189.68f, 82.34f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 16.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _pill!!
    }

private var _pill: ImageVector? = null
