package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Carrot: ImageVector
    get() {
        if (_carrot != null) return _carrot!!
        _carrot = phosphorThinIcon(
            name = "Carrot",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(232.0f, 68.0f),
                    PathNode.LineTo(193.66f, 68.0f),
                    PathNode.LineTo(226.83f, 34.83f),
                    PathNode.CurveTo(228.39296f, 33.267033f, 228.39296f, 30.732965f, 226.83f, 29.17f),
                    PathNode.CurveTo(225.26703f, 27.607035f, 222.73297f, 27.607035f, 221.17f, 29.17f),
                    PathNode.LineTo(188.0f, 62.34f),
                    PathNode.LineTo(188.0f, 24.0f),
                    PathNode.CurveTo(188.0f, 21.790861f, 186.20914f, 20.0f, 184.0f, 20.0f),
                    PathNode.CurveTo(181.79086f, 20.0f, 180.0f, 21.790861f, 180.0f, 24.0f),
                    PathNode.LineTo(180.0f, 64.0f),
                    PathNode.CurveTo(156.12775f, 46.097046f, 122.727066f, 48.457546f, 101.61f, 69.54f),
                    PathNode.LineTo(101.61f, 69.54f),
                    PathNode.LineTo(101.61f, 69.54f),
                    PathNode.CurveTo(84.49f, 86.33f, 67.1f, 115.26f, 49.91f, 155.54f),
                    PathNode.CurveTo(37.98f, 183.54f, 30.3f, 207.54f, 29.32f, 210.63f),
                    PathNode.CurveTo(27.492275f, 214.34393f, 27.698725f, 218.73602f, 29.866764f, 222.26213f),
                    PathNode.CurveTo(32.034805f, 225.78824f, 35.860943f, 227.95477f, 40.0f, 228.0f),
                    PathNode.CurveTo(41.86177f, 227.9949f, 43.69682f, 227.55669f, 45.36f, 226.72f),
                    PathNode.CurveTo(48.48f, 225.72f, 72.49f, 218.07f, 100.45f, 206.13f),
                    PathNode.CurveTo(140.74f, 188.93f, 169.69f, 171.52f, 186.45f, 154.42f),
                    PathNode.CurveTo(207.55258f, 133.30127f, 209.91788f, 99.88031f, 192.0f, 76.0f),
                    PathNode.LineTo(232.0f, 76.0f),
                    PathNode.CurveTo(234.20914f, 76.0f, 236.0f, 74.20914f, 236.0f, 72.0f),
                    PathNode.CurveTo(236.0f, 69.79086f, 234.20914f, 68.0f, 232.0f, 68.0f),
                    PathNode.Close,
                    PathNode.MoveTo(180.74f, 148.79f),
                    PathNode.CurveTo(170.98f, 158.79f, 157.32f, 168.18f, 142.37f, 176.7f),
                    PathNode.LineTo(114.83f, 149.17f),
                    PathNode.CurveTo(113.249626f, 147.73805f, 110.82375f, 147.79778f, 109.315765f, 149.30577f),
                    PathNode.CurveTo(107.80778f, 150.81375f, 107.74805f, 153.23964f, 109.18f, 154.82f),
                    PathNode.LineTo(135.08f, 180.73f),
                    PathNode.CurveTo(92.61f, 203.55f, 43.34f, 219.0f, 42.64f, 219.18f),
                    PathNode.CurveTo(42.395103f, 219.25928f, 42.157543f, 219.35965f, 41.93f, 219.48f),
                    PathNode.CurveTo(40.377094f, 220.30609f, 38.466766f, 220.02078f, 37.222996f, 218.77701f),
                    PathNode.CurveTo(35.979225f, 217.53323f, 35.693916f, 215.62291f, 36.52f, 214.07f),
                    PathNode.CurveTo(36.640347f, 213.84245f, 36.740723f, 213.60492f, 36.82f, 213.36f),
                    PathNode.CurveTo(37.11f, 212.36f, 66.54f, 118.36f, 104.44f, 78.09f),
                    PathNode.LineTo(141.18f, 114.82f),
                    PathNode.CurveTo(142.7413f, 116.37753f, 145.26869f, 116.37753f, 146.83f, 114.82f),
                    PathNode.CurveTo(148.38753f, 113.25869f, 148.38753f, 110.7313f, 146.83f, 109.17f),
                    PathNode.LineTo(110.18f, 72.52f),
                    PathNode.CurveTo(131.41751f, 54.510723f, 163.07245f, 56.42721f, 181.98212f, 76.86713f),
                    PathNode.CurveTo(200.89178f, 97.307045f, 200.34418f, 129.01523f, 180.74f, 148.79f),
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
        return _carrot!!
    }

private var _carrot: ImageVector? = null
