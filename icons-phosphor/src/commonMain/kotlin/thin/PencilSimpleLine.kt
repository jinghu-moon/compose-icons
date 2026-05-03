package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.PencilSimpleLine: ImageVector
    get() {
        if (_pencilSimpleLine != null) return _pencilSimpleLine!!
        _pencilSimpleLine = phosphorThinIcon(
            name = "PencilSimpleLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(224.49f, 76.2f),
                    PathNode.LineTo(179.8f, 31.51f),
                    PathNode.CurveTo(177.54837f, 29.250546f, 174.48982f, 27.980537f, 171.3f, 27.980537f),
                    PathNode.CurveTo(168.11017f, 27.980537f, 165.05162f, 29.250546f, 162.8f, 31.51f),
                    PathNode.LineTo(39.51f, 154.83f),
                    PathNode.CurveTo(37.26259f, 157.07991f, 36.00015f, 160.12991f, 36.0f, 163.31f),
                    PathNode.LineTo(36.0f, 208.0f),
                    PathNode.CurveTo(36.0f, 214.62741f, 41.37258f, 220.0f, 48.0f, 220.0f),
                    PathNode.LineTo(216.0f, 220.0f),
                    PathNode.CurveTo(218.20914f, 220.0f, 220.0f, 218.20914f, 220.0f, 216.0f),
                    PathNode.CurveTo(220.0f, 213.79086f, 218.20914f, 212.0f, 216.0f, 212.0f),
                    PathNode.LineTo(105.66f, 212.0f),
                    PathNode.LineTo(224.49f, 93.17f),
                    PathNode.CurveTo(229.17592f, 88.48377f, 229.17592f, 80.88623f, 224.49f, 76.2f),
                    PathNode.Close,
                    PathNode.MoveTo(94.34f, 212.0f),
                    PathNode.LineTo(48.0f, 212.0f),
                    PathNode.CurveTo(45.79086f, 212.0f, 44.0f, 210.20914f, 44.0f, 208.0f),
                    PathNode.LineTo(44.0f, 163.31f),
                    PathNode.CurveTo(44.001812f, 162.25227f, 44.422493f, 161.23834f, 45.17f, 160.49f),
                    PathNode.LineTo(136.0f, 69.66f),
                    PathNode.LineTo(186.35f, 120.0f),
                    PathNode.Close,
                    PathNode.MoveTo(218.83f, 87.51f),
                    PathNode.LineTo(192.0f, 114.34f),
                    PathNode.LineTo(141.66f, 64.0f),
                    PathNode.LineTo(168.49f, 37.17f),
                    PathNode.CurveTo(169.2403f, 36.41889f, 170.25836f, 35.996853f, 171.32f, 35.996853f),
                    PathNode.CurveTo(172.38164f, 35.996853f, 173.39973f, 36.41889f, 174.15f, 37.17f),
                    PathNode.LineTo(218.83f, 81.86f),
                    PathNode.CurveTo(220.38753f, 83.42131f, 220.38753f, 85.94869f, 218.83f, 87.51f),
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
        return _pencilSimpleLine!!
    }

private var _pencilSimpleLine: ImageVector? = null
