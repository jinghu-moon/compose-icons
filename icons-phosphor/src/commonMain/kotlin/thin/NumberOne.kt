package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.NumberOne: ImageVector
    get() {
        if (_numberOne != null) return _numberOne!!
        _numberOne = phosphorThinIcon(
            name = "NumberOne",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(140.0f, 48.0f),
                    PathNode.LineTo(140.0f, 208.0f),
                    PathNode.CurveTo(140.0f, 210.20914f, 138.20914f, 212.0f, 136.0f, 212.0f),
                    PathNode.CurveTo(133.79086f, 212.0f, 132.0f, 210.20914f, 132.0f, 208.0f),
                    PathNode.LineTo(132.0f, 55.06f),
                    PathNode.LineTo(98.06f, 75.43f),
                    PathNode.CurveTo(96.165665f, 76.5677f, 93.70771f, 75.95434f, 92.57f, 74.06f),
                    PathNode.CurveTo(91.4323f, 72.165665f, 92.04566f, 69.70771f, 93.94f, 68.57f),
                    PathNode.LineTo(133.94f, 44.57f),
                    PathNode.CurveTo(135.17584f, 43.827507f, 136.71562f, 43.80752f, 137.9703f, 44.517685f),
                    PathNode.CurveTo(139.225f, 45.22785f, 140.00044f, 46.55827f, 140.0f, 48.0f),
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
        return _numberOne!!
    }

private var _numberOne: ImageVector? = null
