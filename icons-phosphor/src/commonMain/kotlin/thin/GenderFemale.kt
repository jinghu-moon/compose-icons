package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.GenderFemale: ImageVector
    get() {
        if (_genderFemale != null) return _genderFemale!!
        _genderFemale = phosphorThinIcon(
            name = "GenderFemale",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(204.0f, 96.0f),
                    PathNode.CurveTo(204.00255f, 54.545753f, 170.78482f, 20.736359f, 129.33699f, 20.007097f),
                    PathNode.CurveTo(87.88916f, 19.277836f, 53.502632f, 51.89775f, 52.046875f, 93.32643f),
                    PathNode.CurveTo(50.59112f, 134.7551f, 82.60321f, 169.70819f, 124.0f, 171.89f),
                    PathNode.LineTo(124.0f, 204.0f),
                    PathNode.LineTo(88.0f, 204.0f),
                    PathNode.CurveTo(85.79086f, 204.0f, 84.0f, 205.79086f, 84.0f, 208.0f),
                    PathNode.CurveTo(84.0f, 210.20914f, 85.79086f, 212.0f, 88.0f, 212.0f),
                    PathNode.LineTo(124.0f, 212.0f),
                    PathNode.LineTo(124.0f, 240.0f),
                    PathNode.CurveTo(124.0f, 242.20914f, 125.79086f, 244.0f, 128.0f, 244.0f),
                    PathNode.CurveTo(130.20914f, 244.0f, 132.0f, 242.20914f, 132.0f, 240.0f),
                    PathNode.LineTo(132.0f, 212.0f),
                    PathNode.LineTo(168.0f, 212.0f),
                    PathNode.CurveTo(170.20914f, 212.0f, 172.0f, 210.20914f, 172.0f, 208.0f),
                    PathNode.CurveTo(172.0f, 205.79086f, 170.20914f, 204.0f, 168.0f, 204.0f),
                    PathNode.LineTo(132.0f, 204.0f),
                    PathNode.LineTo(132.0f, 171.89f),
                    PathNode.CurveTo(172.34094f, 169.71848f, 203.95221f, 136.39932f, 204.0f, 96.0f),
                    PathNode.Close,
                    PathNode.MoveTo(60.0f, 96.0f),
                    PathNode.CurveTo(60.0f, 58.444637f, 90.44463f, 28.0f, 128.0f, 28.0f),
                    PathNode.CurveTo(165.55536f, 28.0f, 196.0f, 58.444637f, 196.0f, 96.0f),
                    PathNode.CurveTo(196.0f, 133.55536f, 165.55536f, 164.0f, 128.0f, 164.0f),
                    PathNode.CurveTo(90.46063f, 163.96141f, 60.038586f, 133.53937f, 60.0f, 96.0f),
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
        return _genderFemale!!
    }

private var _genderFemale: ImageVector? = null
