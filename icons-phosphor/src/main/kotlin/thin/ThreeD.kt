package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.ThreeD: ImageVector
    get() {
        if (_threeD != null) return _threeD!!
        _threeD = phosphorThinIcon(
            name = "ThreeD",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(100.0f, 148.0f),
                    PathNode.CurveTo(100.0f, 134.74516f, 89.25484f, 124.0f, 76.0f, 124.0f),
                    PathNode.CurveTo(74.50927f, 124.000145f, 73.14215f, 123.171295f, 72.45288f, 121.849495f),
                    PathNode.CurveTo(71.7636f, 120.52769f, 71.86656f, 118.93225f, 72.72f, 117.71f),
                    PathNode.LineTo(96.32f, 84.0f),
                    PathNode.LineTo(56.0f, 84.0f),
                    PathNode.CurveTo(53.79086f, 84.0f, 52.0f, 82.20914f, 52.0f, 80.0f),
                    PathNode.CurveTo(52.0f, 77.79086f, 53.79086f, 76.0f, 56.0f, 76.0f),
                    PathNode.LineTo(104.0f, 76.0f),
                    PathNode.CurveTo(105.49073f, 75.999855f, 106.85785f, 76.828705f, 107.54712f, 78.150505f),
                    PathNode.CurveTo(108.2364f, 79.47231f, 108.13344f, 81.06775f, 107.28f, 82.29f),
                    PathNode.LineTo(83.12f, 116.8f),
                    PathNode.CurveTo(96.40628f, 119.84928f, 106.30228f, 130.98073f, 107.77469f, 144.53268f),
                    PathNode.CurveTo(109.2471f, 158.08464f, 101.97266f, 171.08165f, 89.651276f, 176.9132f),
                    PathNode.CurveTo(77.32989f, 182.74474f, 62.666824f, 180.13045f, 53.12f, 170.4f),
                    PathNode.CurveTo(51.5736f, 168.82047f, 51.600464f, 166.2864f, 53.18f, 164.74f),
                    PathNode.CurveTo(54.759533f, 163.1936f, 57.2936f, 163.22046f, 58.84f, 164.8f),
                    PathNode.CurveTo(65.66344f, 171.7784f, 76.03328f, 173.92964f, 85.069534f, 170.24136f),
                    PathNode.CurveTo(94.1058f, 166.5531f, 100.00855f, 157.75998f, 100.0f, 148.0f),
                    PathNode.Close,
                    PathNode.MoveTo(160.0f, 76.0f),
                    PathNode.CurveTo(188.71881f, 76.0f, 212.0f, 99.2812f, 212.0f, 128.0f),
                    PathNode.CurveTo(212.0f, 156.71881f, 188.71881f, 180.0f, 160.0f, 180.0f),
                    PathNode.LineTo(136.0f, 180.0f),
                    PathNode.CurveTo(133.79086f, 180.0f, 132.0f, 178.20914f, 132.0f, 176.0f),
                    PathNode.LineTo(132.0f, 80.0f),
                    PathNode.CurveTo(132.0f, 77.79086f, 133.79086f, 76.0f, 136.0f, 76.0f),
                    PathNode.Close,
                    PathNode.MoveTo(160.0f, 84.0f),
                    PathNode.LineTo(140.0f, 84.0f),
                    PathNode.LineTo(140.0f, 172.0f),
                    PathNode.LineTo(160.0f, 172.0f),
                    PathNode.CurveTo(184.30052f, 172.0f, 204.0f, 152.30052f, 204.0f, 128.0f),
                    PathNode.CurveTo(204.0f, 103.69947f, 184.30052f, 84.0f, 160.0f, 84.0f),
                    PathNode.Close,
                    PathNode.MoveTo(32.0f, 52.0f),
                    PathNode.LineTo(224.0f, 52.0f),
                    PathNode.CurveTo(226.20914f, 52.0f, 228.0f, 50.20914f, 228.0f, 48.0f),
                    PathNode.CurveTo(228.0f, 45.79086f, 226.20914f, 44.0f, 224.0f, 44.0f),
                    PathNode.LineTo(32.0f, 44.0f),
                    PathNode.CurveTo(29.790861f, 44.0f, 28.0f, 45.79086f, 28.0f, 48.0f),
                    PathNode.CurveTo(28.0f, 50.20914f, 29.790861f, 52.0f, 32.0f, 52.0f),
                    PathNode.Close,
                    PathNode.MoveTo(224.0f, 204.0f),
                    PathNode.LineTo(32.0f, 204.0f),
                    PathNode.CurveTo(29.790861f, 204.0f, 28.0f, 205.79086f, 28.0f, 208.0f),
                    PathNode.CurveTo(28.0f, 210.20914f, 29.790861f, 212.0f, 32.0f, 212.0f),
                    PathNode.LineTo(224.0f, 212.0f),
                    PathNode.CurveTo(226.20914f, 212.0f, 228.0f, 210.20914f, 228.0f, 208.0f),
                    PathNode.CurveTo(228.0f, 205.79086f, 226.20914f, 204.0f, 224.0f, 204.0f),
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
        return _threeD!!
    }

private var _threeD: ImageVector? = null
