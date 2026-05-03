package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.FileImage: ImageVector
    get() {
        if (_fileImage != null) return _fileImage!!
        _fileImage = phosphorThinIcon(
            name = "FileImage",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(107.33f, 149.78f),
                    PathNode.CurveTo(106.5884f, 148.66565f, 105.33856f, 147.9961f, 104.0f, 147.9961f),
                    PathNode.CurveTo(102.66144f, 147.9961f, 101.4116f, 148.66565f, 100.67f, 149.78f),
                    PathNode.LineTo(76.42f, 186.15f),
                    PathNode.LineTo(63.36f, 165.84f),
                    PathNode.CurveTo(62.623188f, 164.69931f, 61.357967f, 164.01035f, 60.0f, 164.01035f),
                    PathNode.CurveTo(58.642033f, 164.01035f, 57.376812f, 164.69931f, 56.64f, 165.84f),
                    PathNode.LineTo(20.64f, 221.84f),
                    PathNode.CurveTo(19.850847f, 223.07f, 19.795284f, 224.63246f, 20.495073f, 225.91542f),
                    PathNode.CurveTo(21.194864f, 227.19836f, 22.53861f, 227.99757f, 24.0f, 228.0f),
                    PathNode.LineTo(152.0f, 228.0f),
                    PathNode.CurveTo(153.4759f, 228.00096f, 154.83241f, 227.18912f, 155.52902f, 225.88794f),
                    PathNode.CurveTo(156.22563f, 224.58678f, 156.14912f, 223.00775f, 155.33f, 221.78f),
                    PathNode.Close,
                    PathNode.MoveTo(31.33f, 220.0f),
                    PathNode.LineTo(60.0f, 175.4f),
                    PathNode.LineTo(73.0f, 195.62f),
                    PathNode.CurveTo(73.730934f, 196.75192f, 74.98262f, 197.43979f, 76.33f, 197.45f),
                    PathNode.CurveTo(77.681595f, 197.47403f, 78.95067f, 196.80171f, 79.69f, 195.67f),
                    PathNode.LineTo(104.0f, 159.21f),
                    PathNode.LineTo(144.53f, 220.0f),
                    PathNode.Close,
                    PathNode.MoveTo(210.83f, 85.17f),
                    PathNode.LineTo(154.83f, 29.17f),
                    PathNode.CurveTo(154.07921f, 28.420046f, 153.06119f, 27.999166f, 152.0f, 28.0f),
                    PathNode.LineTo(56.0f, 28.0f),
                    PathNode.CurveTo(49.37258f, 28.0f, 44.0f, 33.37258f, 44.0f, 40.0f),
                    PathNode.LineTo(44.0f, 128.0f),
                    PathNode.CurveTo(44.0f, 130.20914f, 45.79086f, 132.0f, 48.0f, 132.0f),
                    PathNode.CurveTo(50.20914f, 132.0f, 52.0f, 130.20914f, 52.0f, 128.0f),
                    PathNode.LineTo(52.0f, 40.0f),
                    PathNode.CurveTo(52.0f, 37.79086f, 53.79086f, 36.0f, 56.0f, 36.0f),
                    PathNode.LineTo(148.0f, 36.0f),
                    PathNode.LineTo(148.0f, 88.0f),
                    PathNode.CurveTo(148.0f, 90.20914f, 149.79086f, 92.0f, 152.0f, 92.0f),
                    PathNode.LineTo(204.0f, 92.0f),
                    PathNode.LineTo(204.0f, 216.0f),
                    PathNode.CurveTo(204.0f, 218.20914f, 202.20914f, 220.0f, 200.0f, 220.0f),
                    PathNode.LineTo(192.0f, 220.0f),
                    PathNode.CurveTo(189.79086f, 220.0f, 188.0f, 221.79086f, 188.0f, 224.0f),
                    PathNode.CurveTo(188.0f, 226.20914f, 189.79086f, 228.0f, 192.0f, 228.0f),
                    PathNode.LineTo(200.0f, 228.0f),
                    PathNode.CurveTo(206.62741f, 228.0f, 212.0f, 222.62741f, 212.0f, 216.0f),
                    PathNode.LineTo(212.0f, 88.0f),
                    PathNode.CurveTo(212.00084f, 86.93881f, 211.57996f, 85.92079f, 210.83f, 85.17f),
                    PathNode.Close,
                    PathNode.MoveTo(156.0f, 41.65f),
                    PathNode.LineTo(198.34f, 84.0f),
                    PathNode.LineTo(156.0f, 84.0f),
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
        return _fileImage!!
    }

private var _fileImage: ImageVector? = null
