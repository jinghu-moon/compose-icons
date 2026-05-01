package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.TagChevron: ImageVector
    get() {
        if (_tagChevron != null) return _tagChevron!!
        _tagChevron = phosphorBoldIcon(
            name = "TagChevron",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(250.0f, 121.34f),
                    PathNode.LineTo(204.36f, 52.91f),
                    PathNode.CurveTo(200.6518f, 47.3448f, 194.40747f, 44.00123f, 187.72f, 44.0f),
                    PathNode.LineTo(32.0f, 44.0f),
                    PathNode.CurveTo(27.570488f, 43.993427f, 23.497572f, 46.427536f, 21.40528f, 50.331757f),
                    PathNode.CurveTo(19.312984f, 54.235977f, 19.541613f, 58.975307f, 22.0f, 62.66f),
                    PathNode.LineTo(65.58f, 128.0f),
                    PathNode.LineTo(22.0f, 193.34f),
                    PathNode.CurveTo(19.541613f, 197.02469f, 19.312984f, 201.76402f, 21.40528f, 205.66824f),
                    PathNode.CurveTo(23.497572f, 209.57246f, 27.570488f, 212.00658f, 32.0f, 212.0f),
                    PathNode.LineTo(187.72f, 212.0f),
                    PathNode.CurveTo(194.40747f, 211.99876f, 200.6518f, 208.6552f, 204.36f, 203.09f),
                    PathNode.LineTo(250.0f, 134.66f),
                    PathNode.CurveTo(252.6904f, 130.62756f, 252.6904f, 125.37245f, 250.0f, 121.34f),
                    PathNode.Close,
                    PathNode.MoveTo(185.58f, 188.0f),
                    PathNode.LineTo(54.42f, 188.0f),
                    PathNode.LineTo(90.0f, 134.66f),
                    PathNode.CurveTo(92.69039f, 130.62756f, 92.69039f, 125.37245f, 90.0f, 121.34f),
                    PathNode.LineTo(54.42f, 68.0f),
                    PathNode.LineTo(185.58f, 68.0f),
                    PathNode.LineTo(225.58f, 128.0f),
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
        return _tagChevron!!
    }

private var _tagChevron: ImageVector? = null
