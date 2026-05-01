package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.FootballHelmet: ImageVector
    get() {
        if (_footballHelmet != null) return _footballHelmet!!
        _footballHelmet = phosphorBoldIcon(
            name = "FootballHelmet",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(216.0f, 156.0f),
                    PathNode.LineTo(168.79f, 156.0f),
                    PathNode.LineTo(164.06f, 140.0f),
                    PathNode.LineTo(216.0f, 140.0f),
                    PathNode.CurveTo(222.62741f, 140.0f, 228.0f, 134.62741f, 228.0f, 128.0f),
                    PathNode.LineTo(228.0f, 124.0f),
                    PathNode.CurveTo(228.00282f, 96.159134f, 216.84277f, 69.47954f, 197.01772f, 49.932648f),
                    PathNode.CurveTo(177.19266f, 30.38576f, 150.35805f, 19.603804f, 122.52f, 20.0f),
                    PathNode.CurveTo(66.0f, 20.8f, 20.0f, 67.43f, 20.0f, 124.0f),
                    PathNode.CurveTo(19.986225f, 158.38551f, 36.969437f, 190.55516f, 65.37f, 209.94f),
                    PathNode.CurveTo(67.36829f, 211.29156f, 69.72757f, 212.00946f, 72.14f, 212.0f),
                    PathNode.LineTo(116.0f, 212.0f),
                    PathNode.CurveTo(122.06605f, 211.99896f, 127.80381f, 209.2449f, 131.59892f, 204.51265f),
                    PathNode.CurveTo(135.39404f, 199.78043f, 136.83633f, 193.5815f, 135.52f, 187.66f),
                    PathNode.QuadTo(135.43f, 187.25f, 135.31f, 186.85f),
                    PathNode.LineTo(133.31f, 180.0f),
                    PathNode.LineTo(150.89f, 180.0f),
                    PathNode.LineTo(160.89f, 213.67f),
                    PathNode.CurveTo(163.42604f, 222.12209f, 171.17589f, 227.93347f, 180.0f, 228.0f),
                    PathNode.LineTo(216.0f, 228.0f),
                    PathNode.CurveTo(227.0457f, 228.0f, 236.0f, 219.0457f, 236.0f, 208.0f),
                    PathNode.LineTo(236.0f, 176.0f),
                    PathNode.CurveTo(236.0f, 164.9543f, 227.0457f, 156.0f, 216.0f, 156.0f),
                    PathNode.Close,
                    PathNode.MoveTo(100.4f, 123.48f),
                    PathNode.CurveTo(96.59494f, 128.21027f, 95.15202f, 134.41629f, 96.48f, 140.34f),
                    PathNode.QuadTo(96.57f, 140.75f, 96.69f, 141.15f),
                    PathNode.LineTo(110.61f, 188.0f),
                    PathNode.LineTo(76.0f, 188.0f),
                    PathNode.CurveTo(55.855534f, 172.89165f, 44.0f, 149.18059f, 44.0f, 124.0f),
                    PathNode.CurveTo(44.0f, 80.52f, 79.39f, 44.64f, 122.86f, 44.0f),
                    PathNode.LineTo(124.0f, 44.0f),
                    PathNode.CurveTo(165.08905f, 43.994347f, 199.5011f, 75.116905f, 203.61f, 116.0f),
                    PathNode.LineTo(116.0f, 116.0f),
                    PathNode.CurveTo(109.93282f, 115.990166f, 104.19122f, 118.74319f, 100.4f, 123.48f),
                    PathNode.Close,
                    PathNode.MoveTo(126.14f, 156.0f),
                    PathNode.LineTo(121.39f, 140.0f),
                    PathNode.LineTo(139.0f, 140.0f),
                    PathNode.LineTo(143.73f, 156.0f),
                    PathNode.Close,
                    PathNode.MoveTo(212.0f, 204.0f),
                    PathNode.LineTo(183.0f, 204.0f),
                    PathNode.LineTo(175.91f, 180.0f),
                    PathNode.LineTo(212.0f, 180.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 24.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _footballHelmet!!
    }

private var _footballHelmet: ImageVector? = null
