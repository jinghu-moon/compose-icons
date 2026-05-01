package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.GenderNonbinary: ImageVector
    get() {
        if (_genderNonbinary != null) return _genderNonbinary!!
        _genderNonbinary = phosphorThinIcon(
            name = "GenderNonbinary",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(132.0f, 100.13f),
                    PathNode.LineTo(132.0f, 55.07f),
                    PathNode.LineTo(165.94f, 75.43f),
                    PathNode.CurveTo(167.83434f, 76.5677f, 170.2923f, 75.95434f, 171.43f, 74.06f),
                    PathNode.CurveTo(172.5677f, 72.165665f, 171.95433f, 69.70771f, 170.06f, 68.57f),
                    PathNode.LineTo(135.77f, 48.0f),
                    PathNode.LineTo(170.06f, 27.43f),
                    PathNode.CurveTo(171.95433f, 26.292294f, 172.5677f, 23.834337f, 171.43f, 21.94f),
                    PathNode.CurveTo(170.2923f, 20.045664f, 167.83434f, 19.432293f, 165.94f, 20.57f),
                    PathNode.LineTo(128.0f, 43.34f),
                    PathNode.LineTo(90.06f, 20.57f),
                    PathNode.CurveTo(88.165665f, 19.432293f, 85.70771f, 20.045664f, 84.57f, 21.94f),
                    PathNode.CurveTo(83.4323f, 23.834337f, 84.04566f, 26.292294f, 85.94f, 27.43f),
                    PathNode.LineTo(120.23f, 48.0f),
                    PathNode.LineTo(85.94f, 68.57f),
                    PathNode.CurveTo(84.04566f, 69.70771f, 83.4323f, 72.165665f, 84.57f, 74.06f),
                    PathNode.CurveTo(85.70771f, 75.95434f, 88.165665f, 76.5677f, 90.06f, 75.43f),
                    PathNode.LineTo(124.0f, 55.07f),
                    PathNode.LineTo(124.0f, 100.13f),
                    PathNode.CurveTo(87.28746f, 102.293304f, 58.947323f, 133.25282f, 60.02944f, 170.01312f),
                    PathNode.CurveTo(61.111565f, 206.77342f, 91.22378f, 236.01225f, 128.0f, 236.01225f),
                    PathNode.CurveTo(164.77623f, 236.01225f, 194.88843f, 206.77342f, 195.97055f, 170.01312f),
                    PathNode.CurveTo(197.05267f, 133.25282f, 168.71254f, 102.293304f, 132.0f, 100.13f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 228.0f),
                    PathNode.CurveTo(94.862915f, 228.0f, 68.0f, 201.13708f, 68.0f, 168.0f),
                    PathNode.CurveTo(68.0f, 134.86292f, 94.862915f, 108.0f, 128.0f, 108.0f),
                    PathNode.CurveTo(161.13708f, 108.0f, 188.0f, 134.86292f, 188.0f, 168.0f),
                    PathNode.CurveTo(187.96143f, 201.1211f, 161.1211f, 227.96143f, 128.0f, 228.0f),
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
        return _genderNonbinary!!
    }

private var _genderNonbinary: ImageVector? = null
