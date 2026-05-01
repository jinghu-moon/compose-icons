package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.PersonSimpleWalk: ImageVector
    get() {
        if (_personSimpleWalk != null) return _personSimpleWalk!!
        _personSimpleWalk = phosphorThinIcon(
            name = "PersonSimpleWalk",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(152.0f, 76.0f),
                    PathNode.CurveTo(167.46397f, 76.0f, 180.0f, 63.46397f, 180.0f, 48.0f),
                    PathNode.CurveTo(180.0f, 32.536026f, 167.46397f, 20.0f, 152.0f, 20.0f),
                    PathNode.CurveTo(136.53603f, 20.0f, 124.0f, 32.536026f, 124.0f, 48.0f),
                    PathNode.CurveTo(124.0f, 63.46397f, 136.53603f, 76.0f, 152.0f, 76.0f),
                    PathNode.Close,
                    PathNode.MoveTo(152.0f, 28.0f),
                    PathNode.CurveTo(163.0457f, 28.0f, 172.0f, 36.954304f, 172.0f, 48.0f),
                    PathNode.CurveTo(172.0f, 59.045696f, 163.0457f, 68.0f, 152.0f, 68.0f),
                    PathNode.CurveTo(140.9543f, 68.0f, 132.0f, 59.045696f, 132.0f, 48.0f),
                    PathNode.CurveTo(132.0f, 36.954304f, 140.9543f, 28.0f, 152.0f, 28.0f),
                    PathNode.Close,
                    PathNode.MoveTo(212.0f, 144.0f),
                    PathNode.CurveTo(212.0f, 146.20914f, 210.20914f, 148.0f, 208.0f, 148.0f),
                    PathNode.CurveTo(174.35f, 148.0f, 158.08f, 131.57f, 143.72f, 117.07f),
                    PathNode.CurveTo(140.2f, 113.5f, 136.86f, 110.14f, 133.38f, 107.07f),
                    PathNode.CurveTo(132.72f, 106.5f, 132.04f, 105.98f, 131.38f, 105.48f),
                    PathNode.LineTo(114.52f, 144.25f),
                    PathNode.LineTo(154.36f, 172.7f),
                    PathNode.CurveTo(155.41098f, 173.46768f, 156.02275f, 174.6987f, 156.0f, 176.0f),
                    PathNode.LineTo(156.0f, 232.0f),
                    PathNode.CurveTo(156.0f, 234.20914f, 154.20914f, 236.0f, 152.0f, 236.0f),
                    PathNode.CurveTo(149.79086f, 236.0f, 148.0f, 234.20914f, 148.0f, 232.0f),
                    PathNode.LineTo(148.0f, 178.06f),
                    PathNode.LineTo(111.23f, 151.8f),
                    PathNode.LineTo(75.67f, 233.59f),
                    PathNode.CurveTo(74.78911f, 235.61688f, 72.431885f, 236.5459f, 70.405f, 235.665f),
                    PathNode.CurveTo(68.37811f, 234.7841f, 67.449104f, 232.42688f, 68.33f, 230.4f),
                    PathNode.LineTo(124.26f, 101.78f),
                    PathNode.CurveTo(94.56f, 91.23f, 51.26f, 131.42f, 50.74f, 131.87f),
                    PathNode.CurveTo(49.119045f, 133.38326f, 46.57826f, 133.29596f, 45.065f, 131.675f),
                    PathNode.CurveTo(43.55174f, 130.05405f, 43.639046f, 127.51325f, 45.26f, 126.0f),
                    PathNode.CurveTo(55.258858f, 116.94589f, 66.280045f, 109.08944f, 78.1f, 102.59f),
                    PathNode.CurveTo(103.25f, 89.05f, 124.17f, 88.53f, 138.62f, 101.07f),
                    PathNode.CurveTo(142.33f, 104.3f, 145.77f, 107.77f, 149.41f, 111.44f),
                    PathNode.CurveTo(163.31f, 125.44f, 177.69f, 140.0f, 208.0f, 140.0f),
                    PathNode.CurveTo(210.20914f, 140.0f, 212.0f, 141.79086f, 212.0f, 144.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 8.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _personSimpleWalk!!
    }

private var _personSimpleWalk: ImageVector? = null
