package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Metronome: ImageVector
    get() {
        if (_metronome != null) return _metronome!!
        _metronome = phosphorThinIcon(
            name = "Metronome",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(182.63f, 113.85f),
                    PathNode.LineTo(211.0f, 82.69f),
                    PathNode.CurveTo(212.48564f, 81.03314f, 212.34685f, 78.48565f, 210.69f, 77.0f),
                    PathNode.CurveTo(209.03314f, 75.51435f, 206.48564f, 75.653145f, 205.0f, 77.31f),
                    PathNode.LineTo(179.82f, 105.0f),
                    PathNode.LineTo(160.52f, 44.32f),
                    PathNode.CurveTo(158.92032f, 39.354984f, 154.29636f, 35.992092f, 149.08f, 36.0f),
                    PathNode.LineTo(106.92f, 36.0f),
                    PathNode.CurveTo(101.69289f, 35.99765f, 97.06556f, 39.37916f, 95.48f, 44.36f),
                    PathNode.LineTo(44.58f, 204.36f),
                    PathNode.CurveTo(43.419422f, 208.0058f, 44.066944f, 211.98648f, 46.323193f, 215.07648f),
                    PathNode.CurveTo(48.579445f, 218.16647f, 52.173943f, 219.99535f, 56.0f, 220.0f),
                    PathNode.LineTo(200.0f, 220.0f),
                    PathNode.CurveTo(203.82782f, 219.99854f, 207.42528f, 218.17099f, 209.68385f, 215.0805f),
                    PathNode.CurveTo(211.94243f, 211.99004f, 212.59111f, 208.00748f, 211.43f, 204.36f),
                    PathNode.Close,
                    PathNode.MoveTo(190.19f, 164.0f),
                    PathNode.LineTo(137.0f, 164.0f),
                    PathNode.LineTo(176.37f, 120.69f),
                    PathNode.Close,
                    PathNode.MoveTo(103.1f, 46.79f),
                    PathNode.CurveTo(103.62808f, 45.126053f, 105.17427f, 43.99677f, 106.92f, 44.0f),
                    PathNode.LineTo(149.08f, 44.0f),
                    PathNode.CurveTo(150.82573f, 43.99677f, 152.37192f, 45.126053f, 152.9f, 46.79f),
                    PathNode.LineTo(173.61f, 111.88f),
                    PathNode.LineTo(126.23f, 164.0f),
                    PathNode.LineTo(65.81f, 164.0f),
                    PathNode.Close,
                    PathNode.MoveTo(203.22f, 210.36f),
                    PathNode.CurveTo(202.46883f, 211.38797f, 201.27316f, 211.99693f, 200.0f, 212.0f),
                    PathNode.LineTo(56.0f, 212.0f),
                    PathNode.CurveTo(54.72486f, 211.99919f, 53.526527f, 211.39044f, 52.773827f, 210.36118f),
                    PathNode.CurveTo(52.02113f, 209.33188f, 51.80427f, 208.0054f, 52.19f, 206.79f),
                    PathNode.LineTo(63.27f, 172.0f),
                    PathNode.LineTo(192.73f, 172.0f),
                    PathNode.LineTo(203.8f, 206.79f),
                    PathNode.CurveTo(204.18643f, 208.00446f, 203.97101f, 209.33035f, 203.22f, 210.36f),
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
        return _metronome!!
    }

private var _metronome: ImageVector? = null
