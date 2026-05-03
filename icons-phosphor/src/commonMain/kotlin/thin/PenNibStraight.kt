package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.PenNibStraight: ImageVector
    get() {
        if (_penNibStraight != null) return _penNibStraight!!
        _penNibStraight = phosphorThinIcon(
            name = "PenNibStraight",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(218.75f, 125.66f),
                    PathNode.CurveTo(218.72272f, 125.59366f, 218.68924f, 125.530045f, 218.65f, 125.47f),
                    PathNode.LineTo(188.0f, 70.94f),
                    PathNode.LineTo(188.0f, 32.0f),
                    PathNode.CurveTo(188.0f, 25.372583f, 182.62741f, 20.0f, 176.0f, 20.0f),
                    PathNode.LineTo(80.0f, 20.0f),
                    PathNode.CurveTo(73.37258f, 20.0f, 68.0f, 25.372583f, 68.0f, 32.0f),
                    PathNode.LineTo(68.0f, 71.0f),
                    PathNode.LineTo(37.34f, 125.47f),
                    PathNode.LineTo(37.24f, 125.66f),
                    PathNode.CurveTo(35.239708f, 129.71094f, 35.68417f, 134.54202f, 38.39f, 138.16f),
                    PathNode.LineTo(124.83f, 250.44f),
                    PathNode.CurveTo(125.58721f, 251.42397f, 126.75841f, 252.00052f, 128.0f, 252.00052f),
                    PathNode.CurveTo(129.2416f, 252.00052f, 130.4128f, 251.42397f, 131.17f, 250.44f),
                    PathNode.LineTo(217.66f, 138.09f),
                    PathNode.CurveTo(220.31825f, 134.47615f, 220.73872f, 129.68134f, 218.75f, 125.66f),
                    PathNode.Close,
                    PathNode.MoveTo(80.0f, 28.0f),
                    PathNode.LineTo(176.0f, 28.0f),
                    PathNode.CurveTo(178.20914f, 28.0f, 180.0f, 29.790861f, 180.0f, 32.0f),
                    PathNode.LineTo(180.0f, 68.0f),
                    PathNode.LineTo(76.0f, 68.0f),
                    PathNode.LineTo(76.0f, 32.0f),
                    PathNode.CurveTo(76.0f, 29.790861f, 77.79086f, 28.0f, 80.0f, 28.0f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 148.0f),
                    PathNode.CurveTo(119.163445f, 148.0f, 112.0f, 140.83656f, 112.0f, 132.0f),
                    PathNode.CurveTo(112.0f, 123.163445f, 119.163445f, 116.0f, 128.0f, 116.0f),
                    PathNode.CurveTo(136.83656f, 116.0f, 144.0f, 123.163445f, 144.0f, 132.0f),
                    PathNode.CurveTo(144.0f, 140.83656f, 136.83656f, 148.0f, 128.0f, 148.0f),
                    PathNode.Close,
                    PathNode.MoveTo(211.27f, 133.28f),
                    PathNode.LineTo(132.0f, 236.25f),
                    PathNode.LineTo(132.0f, 155.66f),
                    PathNode.CurveTo(144.30225f, 153.58052f, 152.95934f, 142.4217f, 151.91594f, 129.98865f),
                    PathNode.CurveTo(150.87254f, 117.555595f, 140.47676f, 107.99568f, 128.0f, 107.99568f),
                    PathNode.CurveTo(115.52325f, 107.99568f, 105.12745f, 117.555595f, 104.08407f, 129.98865f),
                    PathNode.CurveTo(103.04068f, 142.4217f, 111.697754f, 153.58052f, 124.0f, 155.66f),
                    PathNode.LineTo(124.0f, 236.24f),
                    PathNode.LineTo(44.78f, 133.34f),
                    PathNode.CurveTo(43.91468f, 132.16148f, 43.761303f, 130.60474f, 44.38f, 129.28f),
                    PathNode.LineTo(74.35f, 76.0f),
                    PathNode.LineTo(181.66f, 76.0f),
                    PathNode.LineTo(211.66f, 129.28f),
                    PathNode.CurveTo(212.25789f, 130.5866f, 212.10901f, 132.1135f, 211.27f, 133.28f),
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
        return _penNibStraight!!
    }

private var _penNibStraight: ImageVector? = null
