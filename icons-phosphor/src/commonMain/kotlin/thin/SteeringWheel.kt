package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.SteeringWheel: ImageVector
    get() {
        if (_steeringWheel != null) return _steeringWheel!!
        _steeringWheel = phosphorThinIcon(
            name = "SteeringWheel",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(128.0f, 148.0f),
                    PathNode.CurveTo(123.58172f, 148.0f, 120.0f, 144.41827f, 120.0f, 140.0f),
                    PathNode.CurveTo(120.0f, 135.58173f, 123.58172f, 132.0f, 128.0f, 132.0f),
                    PathNode.CurveTo(132.41827f, 132.0f, 136.0f, 135.58173f, 136.0f, 140.0f),
                    PathNode.CurveTo(136.0f, 144.41827f, 132.41827f, 148.0f, 128.0f, 148.0f),
                    PathNode.Close,
                    PathNode.MoveTo(228.0f, 128.0f),
                    PathNode.CurveTo(228.0f, 183.22847f, 183.22847f, 228.0f, 128.0f, 228.0f),
                    PathNode.CurveTo(72.77152f, 228.0f, 28.0f, 183.22847f, 28.0f, 128.0f),
                    PathNode.CurveTo(28.0f, 72.77152f, 72.77152f, 28.0f, 128.0f, 28.0f),
                    PathNode.CurveTo(183.20334f, 28.060623f, 227.93938f, 72.79665f, 228.0f, 128.0f),
                    PathNode.Close,
                    PathNode.MoveTo(36.0f, 128.0f),
                    PathNode.QuadTo(36.0f, 132.53f, 36.44f, 136.94f),
                    PathNode.CurveTo(87.54414f, 87.68617f, 168.45586f, 87.68617f, 219.56f, 136.94f),
                    PathNode.QuadTo(220.0f, 132.53f, 220.0f, 128.0f),
                    PathNode.CurveTo(220.0f, 77.18981f, 178.8102f, 36.0f, 128.0f, 36.0f),
                    PathNode.CurveTo(77.18981f, 36.0f, 36.0f, 77.18981f, 36.0f, 128.0f),
                    PathNode.Close,
                    PathNode.MoveTo(113.75f, 218.9f),
                    PathNode.LineTo(94.2f, 166.6f),
                    PathNode.CurveTo(93.61542f, 165.0354f, 92.12023f, 163.99875f, 90.45f, 164.0f),
                    PathNode.LineTo(43.34f, 164.0f),
                    PathNode.CurveTo(55.810543f, 193.1881f, 82.402275f, 213.92216f, 113.75f, 218.9f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 220.0f),
                    PathNode.CurveTo(129.78f, 220.0f, 131.55f, 219.94f, 133.3f, 219.84f),
                    PathNode.LineTo(154.3f, 163.79f),
                    PathNode.CurveTo(156.05702f, 159.10017f, 160.54184f, 155.99467f, 165.55f, 156.0f),
                    PathNode.LineTo(215.64f, 156.0f),
                    PathNode.CurveTo(216.60916f, 152.97421f, 217.42026f, 149.90005f, 218.07f, 146.79f),
                    PathNode.CurveTo(194.64969f, 122.03842f, 162.07567f, 108.01556f, 128.0f, 108.01556f),
                    PathNode.CurveTo(93.92433f, 108.01556f, 61.350307f, 122.03842f, 37.93f, 146.79f),
                    PathNode.CurveTo(38.579742f, 149.90005f, 39.39084f, 152.97421f, 40.36f, 156.0f),
                    PathNode.LineTo(90.45f, 156.0f),
                    PathNode.CurveTo(95.45704f, 156.00041f, 99.93754f, 159.10966f, 101.69f, 163.8f),
                    PathNode.LineTo(122.69f, 219.8f),
                    PathNode.CurveTo(124.42f, 219.94f, 126.2f, 220.0f, 128.0f, 220.0f),
                    PathNode.Close,
                    PathNode.MoveTo(212.66f, 164.0f),
                    PathNode.LineTo(165.55f, 164.0f),
                    PathNode.CurveTo(163.87976f, 163.99875f, 162.38458f, 165.0354f, 161.8f, 166.6f),
                    PathNode.LineTo(142.2f, 218.9f),
                    PathNode.CurveTo(173.57039f, 213.94711f, 200.18803f, 193.20757f, 212.66f, 164.0f),
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
        return _steeringWheel!!
    }

private var _steeringWheel: ImageVector? = null
