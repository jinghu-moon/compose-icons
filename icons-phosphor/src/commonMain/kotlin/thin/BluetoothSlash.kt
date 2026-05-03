package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.BluetoothSlash: ImageVector
    get() {
        if (_bluetoothSlash != null) return _bluetoothSlash!!
        _bluetoothSlash = phosphorThinIcon(
            name = "BluetoothSlash",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(219.0f, 213.31f),
                    PathNode.LineTo(59.0f, 37.31f),
                    PathNode.CurveTo(57.514355f, 35.653145f, 54.966854f, 35.514355f, 53.31f, 37.0f),
                    PathNode.CurveTo(51.653145f, 38.485645f, 51.514355f, 41.033146f, 53.0f, 42.69f),
                    PathNode.LineTo(127.0f, 124.11f),
                    PathNode.LineTo(126.86f, 124.11f),
                    PathNode.CurveTo(126.68697f, 124.161064f, 126.51675f, 124.221146f, 126.35f, 124.29f),
                    PathNode.LineTo(126.2f, 124.35f),
                    PathNode.LineTo(126.15f, 124.35f),
                    PathNode.CurveTo(125.954f, 124.451035f, 125.7667f, 124.56809f, 125.59f, 124.7f),
                    PathNode.LineTo(125.54f, 124.7f),
                    PathNode.LineTo(61.54f, 172.7f),
                    PathNode.CurveTo(59.77269f, 174.02548f, 59.414516f, 176.53268f, 60.74f, 178.3f),
                    PathNode.CurveTo(62.065483f, 180.0673f, 64.572685f, 180.42548f, 66.34f, 179.1f),
                    PathNode.LineTo(124.0f, 136.0f),
                    PathNode.LineTo(124.0f, 224.0f),
                    PathNode.CurveTo(123.99892f, 225.51566f, 124.85457f, 226.90175f, 126.21f, 227.58f),
                    PathNode.CurveTo(126.76658f, 227.85538f, 127.37903f, 227.99908f, 128.0f, 228.0f),
                    PathNode.CurveTo(128.86548f, 228.0f, 129.70761f, 227.71928f, 130.4f, 227.2f),
                    PathNode.LineTo(184.14f, 186.9f),
                    PathNode.LineTo(213.0f, 218.69f),
                    PathNode.CurveTo(213.95595f, 219.76758f, 215.41747f, 220.24792f, 216.8263f, 219.94757f),
                    PathNode.CurveTo(218.23512f, 219.64722f, 219.37364f, 218.61255f, 219.80698f, 217.23878f),
                    PathNode.CurveTo(220.24031f, 215.865f, 219.9015f, 214.36435f, 218.92f, 213.31f),
                    PathNode.Close,
                    PathNode.MoveTo(132.0f, 216.0f),
                    PathNode.LineTo(132.0f, 136.0f),
                    PathNode.LineTo(150.44f, 149.83f),
                    PathNode.LineTo(178.73f, 181.0f),
                    PathNode.Close,
                    PathNode.MoveTo(124.0f, 71.63f),
                    PathNode.LineTo(124.0f, 32.0f),
                    PathNode.CurveTo(124.0f, 30.48491f, 124.85601f, 29.09986f, 126.21114f, 28.42229f),
                    PathNode.CurveTo(127.56629f, 27.744722f, 129.18793f, 27.890947f, 130.4f, 28.8f),
                    PathNode.LineTo(194.4f, 76.8f),
                    PathNode.CurveTo(195.40723f, 77.55541f, 196.0f, 78.740974f, 196.0f, 80.0f),
                    PathNode.CurveTo(196.0f, 81.259026f, 195.40723f, 82.44459f, 194.4f, 83.2f),
                    PathNode.LineTo(160.87f, 108.35f),
                    PathNode.CurveTo(160.17761f, 108.869286f, 159.33546f, 109.15f, 158.47f, 109.15f),
                    PathNode.CurveTo(156.74828f, 109.15f, 155.21973f, 108.04828f, 154.67526f, 106.41491f),
                    PathNode.CurveTo(154.13081f, 104.78153f, 154.69263f, 102.98303f, 156.07f, 101.95f),
                    PathNode.LineTo(185.33f, 79.95f),
                    PathNode.LineTo(132.0f, 40.0f),
                    PathNode.LineTo(132.0f, 71.63f),
                    PathNode.CurveTo(132.0f, 73.83914f, 130.20914f, 75.63f, 128.0f, 75.63f),
                    PathNode.CurveTo(125.79086f, 75.63f, 124.0f, 73.83914f, 124.0f, 71.63f),
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
        return _bluetoothSlash!!
    }

private var _bluetoothSlash: ImageVector? = null
