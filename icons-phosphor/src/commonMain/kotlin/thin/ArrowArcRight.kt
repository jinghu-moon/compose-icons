package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.ArrowArcRight: ImageVector
    get() {
        if (_arrowArcRight != null) return _arrowArcRight!!
        _arrowArcRight = phosphorThinIcon(
            name = "ArrowArcRight",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(236.0f, 88.0f),
                    PathNode.LineTo(236.0f, 152.0f),
                    PathNode.CurveTo(236.0f, 154.20914f, 234.20914f, 156.0f, 232.0f, 156.0f),
                    PathNode.LineTo(168.0f, 156.0f),
                    PathNode.CurveTo(165.79086f, 156.0f, 164.0f, 154.20914f, 164.0f, 152.0f),
                    PathNode.CurveTo(164.0f, 149.79086f, 165.79086f, 148.0f, 168.0f, 148.0f),
                    PathNode.LineTo(222.3f, 148.0f),
                    PathNode.LineTo(193.06f, 119.0f),
                    PathNode.CurveTo(166.75569f, 92.69069f, 127.19503f, 84.81332f, 92.81916f, 99.03993f),
                    PathNode.CurveTo(58.443295f, 113.26654f, 36.019264f, 146.79655f, 36.0f, 184.0f),
                    PathNode.CurveTo(36.0f, 186.20914f, 34.20914f, 188.0f, 32.0f, 188.0f),
                    PathNode.CurveTo(29.790861f, 188.0f, 28.0f, 186.20914f, 28.0f, 184.0f),
                    PathNode.CurveTo(28.00055f, 143.5542f, 52.36476f, 107.091194f, 89.73184f, 91.61333f),
                    PathNode.CurveTo(127.09892f, 76.13545f, 170.11023f, 84.69077f, 198.71f, 113.29f),
                    PathNode.LineTo(228.0f, 142.39f),
                    PathNode.LineTo(228.0f, 88.0f),
                    PathNode.CurveTo(228.0f, 85.79086f, 229.79086f, 84.0f, 232.0f, 84.0f),
                    PathNode.CurveTo(234.20914f, 84.0f, 236.0f, 85.79086f, 236.0f, 88.0f),
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
        return _arrowArcRight!!
    }

private var _arrowArcRight: ImageVector? = null
