package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.PencilSimple: ImageVector
    get() {
        if (_pencilSimple != null) return _pencilSimple!!
        _pencilSimple = phosphorThinIcon(
            name = "PencilSimple",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(224.49f, 76.2f),
                    PathNode.LineTo(179.8f, 31.51f),
                    PathNode.CurveTo(177.54837f, 29.250546f, 174.48982f, 27.980537f, 171.3f, 27.980537f),
                    PathNode.CurveTo(168.11017f, 27.980537f, 165.05162f, 29.250546f, 162.8f, 31.51f),
                    PathNode.LineTo(133.17f, 61.17f),
                    PathNode.LineTo(133.17f, 61.17f),
                    PathNode.LineTo(39.52f, 154.83f),
                    PathNode.CurveTo(37.259533f, 157.07199f, 35.99172f, 160.12627f, 36.0f, 163.31f),
                    PathNode.LineTo(36.0f, 208.0f),
                    PathNode.CurveTo(36.0f, 214.62741f, 41.37258f, 220.0f, 48.0f, 220.0f),
                    PathNode.LineTo(92.69f, 220.0f),
                    PathNode.CurveTo(95.870094f, 219.99985f, 98.92008f, 218.73741f, 101.17f, 216.49f),
                    PathNode.LineTo(224.48f, 93.17f),
                    PathNode.CurveTo(226.73946f, 90.91838f, 228.00946f, 87.85982f, 228.00946f, 84.67f),
                    PathNode.CurveTo(228.00946f, 81.48018f, 226.73946f, 78.42162f, 224.48f, 76.17f),
                    PathNode.Close,
                    PathNode.MoveTo(95.49f, 210.83f),
                    PathNode.CurveTo(94.74658f, 211.57265f, 93.74078f, 211.9929f, 92.69f, 212.0f),
                    PathNode.LineTo(48.0f, 212.0f),
                    PathNode.CurveTo(45.79086f, 212.0f, 44.0f, 210.20914f, 44.0f, 208.0f),
                    PathNode.LineTo(44.0f, 163.31f),
                    PathNode.CurveTo(43.999165f, 162.24881f, 44.420044f, 161.23079f, 45.17f, 160.48f),
                    PathNode.LineTo(136.0f, 69.65f),
                    PathNode.LineTo(186.34f, 120.0f),
                    PathNode.Close,
                    PathNode.MoveTo(218.83f, 87.51f),
                    PathNode.LineTo(192.0f, 114.34f),
                    PathNode.LineTo(141.66f, 64.0f),
                    PathNode.LineTo(168.48f, 37.17f),
                    PathNode.CurveTo(169.23027f, 36.41889f, 170.24837f, 35.996853f, 171.31f, 35.996853f),
                    PathNode.CurveTo(172.37164f, 35.996853f, 173.38972f, 36.41889f, 174.14f, 37.17f),
                    PathNode.LineTo(218.83f, 81.85f),
                    PathNode.CurveTo(219.58112f, 82.60027f, 220.00314f, 83.61836f, 220.00314f, 84.68f),
                    PathNode.CurveTo(220.00314f, 85.74164f, 219.58112f, 86.75973f, 218.83f, 87.51f),
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
        return _pencilSimple!!
    }

private var _pencilSimple: ImageVector? = null
