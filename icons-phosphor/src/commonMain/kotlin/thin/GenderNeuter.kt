package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.GenderNeuter: ImageVector
    get() {
        if (_genderNeuter != null) return _genderNeuter!!
        _genderNeuter = phosphorThinIcon(
            name = "GenderNeuter",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(204.0f, 104.0f),
                    PathNode.CurveTo(204.00255f, 62.545753f, 170.78482f, 28.736359f, 129.33699f, 28.007097f),
                    PathNode.CurveTo(87.88916f, 27.277836f, 53.502632f, 59.89775f, 52.046875f, 101.32643f),
                    PathNode.CurveTo(50.59112f, 142.7551f, 82.60321f, 177.70819f, 124.0f, 179.89f),
                    PathNode.LineTo(124.0f, 232.0f),
                    PathNode.CurveTo(124.0f, 234.20914f, 125.79086f, 236.0f, 128.0f, 236.0f),
                    PathNode.CurveTo(130.20914f, 236.0f, 132.0f, 234.20914f, 132.0f, 232.0f),
                    PathNode.LineTo(132.0f, 179.89f),
                    PathNode.CurveTo(172.34094f, 177.71848f, 203.95221f, 144.39932f, 204.0f, 104.0f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 172.0f),
                    PathNode.CurveTo(90.44463f, 172.0f, 60.0f, 141.55536f, 60.0f, 104.0f),
                    PathNode.CurveTo(60.0f, 66.44463f, 90.44463f, 36.0f, 128.0f, 36.0f),
                    PathNode.CurveTo(165.55536f, 36.0f, 196.0f, 66.44463f, 196.0f, 104.0f),
                    PathNode.CurveTo(195.96141f, 141.53935f, 165.53935f, 171.96141f, 128.0f, 172.0f),
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
        return _genderNeuter!!
    }

private var _genderNeuter: ImageVector? = null
