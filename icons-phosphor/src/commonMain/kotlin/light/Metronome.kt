package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Metronome: ImageVector
    get() {
        if (_metronome != null) return _metronome!!
        _metronome = phosphorLightIcon(
            name = "Metronome",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(213.33f, 203.75f),
                    PathNode.LineTo(184.88f, 114.34f),
                    PathNode.LineTo(212.43f, 84.0f),
                    PathNode.CurveTo(214.29503f, 81.51588f, 213.95567f, 78.019005f, 211.6478f, 75.939835f),
                    PathNode.CurveTo(209.33994f, 73.86067f, 205.82672f, 73.88678f, 203.55f, 76.0f),
                    PathNode.LineTo(180.68f, 101.17f),
                    PathNode.LineTo(162.42f, 43.75f),
                    PathNode.CurveTo(160.58617f, 37.930885f, 155.1812f, 33.980488f, 149.08f, 34.0f),
                    PathNode.LineTo(106.92f, 34.0f),
                    PathNode.CurveTo(100.818794f, 33.980488f, 95.41384f, 37.930885f, 93.58f, 43.75f),
                    PathNode.LineTo(42.67f, 203.75f),
                    PathNode.CurveTo(41.314335f, 208.00497f, 42.069912f, 212.6514f, 44.703915f, 216.2576f),
                    PathNode.CurveTo(47.337917f, 219.86378f, 51.534286f, 221.99702f, 56.0f, 222.0f),
                    PathNode.LineTo(200.0f, 222.0f),
                    PathNode.CurveTo(204.46747f, 222.00021f, 208.66681f, 219.8683f, 211.30313f, 216.26163f),
                    PathNode.CurveTo(213.93947f, 212.65495f, 214.6962f, 208.00665f, 213.34f, 203.75f),
                    PathNode.Close,
                    PathNode.MoveTo(187.45f, 162.0f),
                    PathNode.LineTo(141.56f, 162.0f),
                    PathNode.LineTo(175.56f, 124.61f),
                    PathNode.Close,
                    PathNode.MoveTo(105.0f, 47.39f),
                    PathNode.CurveTo(105.266914f, 46.55647f, 106.0448f, 45.993317f, 106.92f, 46.0f),
                    PathNode.LineTo(149.08f, 46.0f),
                    PathNode.CurveTo(149.9552f, 45.993317f, 150.73308f, 46.55647f, 151.0f, 47.39f),
                    PathNode.LineTo(171.36f, 111.39f),
                    PathNode.LineTo(125.36f, 162.0f),
                    PathNode.LineTo(68.55f, 162.0f),
                    PathNode.Close,
                    PathNode.MoveTo(201.6f, 209.18f),
                    PathNode.CurveTo(201.23315f, 209.69888f, 200.63544f, 210.00522f, 200.0f, 210.0f),
                    PathNode.LineTo(56.0f, 210.0f),
                    PathNode.CurveTo(55.362106f, 209.9985f, 54.763195f, 209.69281f, 54.387768f, 209.17708f),
                    PathNode.CurveTo(54.01234f, 208.66136f, 53.90544f, 207.9975f, 54.1f, 207.39f),
                    PathNode.LineTo(64.73f, 174.0f),
                    PathNode.LineTo(191.27f, 174.0f),
                    PathNode.LineTo(201.89f, 207.39f),
                    PathNode.CurveTo(202.09529f, 207.99791f, 201.98674f, 208.668f, 201.6f, 209.18f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 12.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _metronome!!
    }

private var _metronome: ImageVector? = null
