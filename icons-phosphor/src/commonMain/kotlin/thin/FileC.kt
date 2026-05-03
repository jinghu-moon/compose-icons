package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.FileC: ImageVector
    get() {
        if (_fileC != null) return _fileC!!
        _fileC = phosphorThinIcon(
            name = "FileC",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(44.0f, 180.0f),
                    PathNode.CurveTo(44.0f, 193.23f, 53.0f, 204.0f, 64.0f, 204.0f),
                    PathNode.CurveTo(68.99581f, 203.92166f, 73.73837f, 201.78732f, 77.11f, 198.1f),
                    PathNode.CurveTo(78.63983f, 196.50389f, 81.1739f, 196.45016f, 82.77f, 197.98f),
                    PathNode.CurveTo(84.366104f, 199.50983f, 84.41983f, 202.0439f, 82.89f, 203.64f),
                    PathNode.CurveTo(78.010284f, 208.90494f, 71.17816f, 211.92857f, 64.0f, 212.0f),
                    PathNode.CurveTo(48.56f, 212.0f, 36.0f, 197.64f, 36.0f, 180.0f),
                    PathNode.CurveTo(36.0f, 162.36f, 48.56f, 148.0f, 64.0f, 148.0f),
                    PathNode.CurveTo(71.17816f, 148.07143f, 78.010284f, 151.09506f, 82.89f, 156.36f),
                    PathNode.CurveTo(84.41983f, 157.9561f, 84.366104f, 160.49017f, 82.77f, 162.02f),
                    PathNode.CurveTo(81.1739f, 163.54984f, 78.63983f, 163.49611f, 77.11f, 161.9f),
                    PathNode.CurveTo(73.73837f, 158.21268f, 68.99581f, 156.07834f, 64.0f, 156.0f),
                    PathNode.CurveTo(53.0f, 156.0f, 44.0f, 166.77f, 44.0f, 180.0f),
                    PathNode.Close,
                    PathNode.MoveTo(212.0f, 88.0f),
                    PathNode.LineTo(212.0f, 216.0f),
                    PathNode.CurveTo(212.0f, 222.62741f, 206.62741f, 228.0f, 200.0f, 228.0f),
                    PathNode.LineTo(120.0f, 228.0f),
                    PathNode.CurveTo(117.79086f, 228.0f, 116.0f, 226.20914f, 116.0f, 224.0f),
                    PathNode.CurveTo(116.0f, 221.79086f, 117.79086f, 220.0f, 120.0f, 220.0f),
                    PathNode.LineTo(200.0f, 220.0f),
                    PathNode.CurveTo(202.20914f, 220.0f, 204.0f, 218.20914f, 204.0f, 216.0f),
                    PathNode.LineTo(204.0f, 92.0f),
                    PathNode.LineTo(152.0f, 92.0f),
                    PathNode.CurveTo(149.79086f, 92.0f, 148.0f, 90.20914f, 148.0f, 88.0f),
                    PathNode.LineTo(148.0f, 36.0f),
                    PathNode.LineTo(56.0f, 36.0f),
                    PathNode.CurveTo(53.79086f, 36.0f, 52.0f, 37.79086f, 52.0f, 40.0f),
                    PathNode.LineTo(52.0f, 112.0f),
                    PathNode.CurveTo(52.0f, 114.20914f, 50.20914f, 116.0f, 48.0f, 116.0f),
                    PathNode.CurveTo(45.79086f, 116.0f, 44.0f, 114.20914f, 44.0f, 112.0f),
                    PathNode.LineTo(44.0f, 40.0f),
                    PathNode.CurveTo(44.0f, 33.37258f, 49.37258f, 28.0f, 56.0f, 28.0f),
                    PathNode.LineTo(152.0f, 28.0f),
                    PathNode.CurveTo(153.06119f, 27.999166f, 154.07921f, 28.420046f, 154.83f, 29.17f),
                    PathNode.LineTo(210.83f, 85.17f),
                    PathNode.CurveTo(211.57996f, 85.92079f, 212.00084f, 86.93881f, 212.0f, 88.0f),
                    PathNode.Close,
                    PathNode.MoveTo(156.0f, 84.0f),
                    PathNode.LineTo(198.34f, 84.0f),
                    PathNode.LineTo(156.0f, 41.65f),
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
        return _fileC!!
    }

private var _fileC: ImageVector? = null
