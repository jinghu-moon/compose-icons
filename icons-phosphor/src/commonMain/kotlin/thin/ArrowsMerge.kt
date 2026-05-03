package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.ArrowsMerge: ImageVector
    get() {
        if (_arrowsMerge != null) return _arrowsMerge!!
        _arrowsMerge = phosphorThinIcon(
            name = "ArrowsMerge",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(188.0f, 40.0f),
                    PathNode.LineTo(188.0f, 104.0f),
                    PathNode.CurveTo(188.00084f, 105.06119f, 187.57996f, 106.07921f, 186.83f, 106.83f),
                    PathNode.LineTo(132.0f, 161.66f),
                    PathNode.LineTo(132.0f, 222.34f),
                    PathNode.LineTo(157.17f, 197.17f),
                    PathNode.CurveTo(158.73297f, 195.60704f, 161.26703f, 195.60704f, 162.83f, 197.17f),
                    PathNode.CurveTo(164.39296f, 198.73297f, 164.39296f, 201.26703f, 162.83f, 202.83f),
                    PathNode.LineTo(130.83f, 234.83f),
                    PathNode.CurveTo(130.07973f, 235.58112f, 129.06163f, 236.00314f, 128.0f, 236.00314f),
                    PathNode.CurveTo(126.93836f, 236.00314f, 125.92027f, 235.58112f, 125.17f, 234.83f),
                    PathNode.LineTo(93.17f, 202.83f),
                    PathNode.CurveTo(91.60703f, 201.26703f, 91.60703f, 198.73297f, 93.17f, 197.17f),
                    PathNode.CurveTo(94.73296f, 195.60704f, 97.26704f, 195.60704f, 98.83f, 197.17f),
                    PathNode.LineTo(124.0f, 222.34f),
                    PathNode.LineTo(124.0f, 161.66f),
                    PathNode.LineTo(69.17f, 106.83f),
                    PathNode.CurveTo(68.42004f, 106.07921f, 67.99917f, 105.06119f, 68.0f, 104.0f),
                    PathNode.LineTo(68.0f, 40.0f),
                    PathNode.CurveTo(68.0f, 37.79086f, 69.79086f, 36.0f, 72.0f, 36.0f),
                    PathNode.CurveTo(74.20914f, 36.0f, 76.0f, 37.79086f, 76.0f, 40.0f),
                    PathNode.LineTo(76.0f, 102.34f),
                    PathNode.LineTo(128.0f, 154.34f),
                    PathNode.LineTo(180.0f, 102.34f),
                    PathNode.LineTo(180.0f, 40.0f),
                    PathNode.CurveTo(180.0f, 37.79086f, 181.79086f, 36.0f, 184.0f, 36.0f),
                    PathNode.CurveTo(186.20914f, 36.0f, 188.0f, 37.79086f, 188.0f, 40.0f),
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
        return _arrowsMerge!!
    }

private var _arrowsMerge: ImageVector? = null
