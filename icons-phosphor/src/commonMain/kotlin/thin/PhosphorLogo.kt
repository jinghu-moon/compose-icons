package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.PhosphorLogo: ImageVector
    get() {
        if (_phosphorLogo != null) return _phosphorLogo!!
        _phosphorLogo = phosphorThinIcon(
            name = "PhosphorLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(152.0f, 36.0f),
                    PathNode.LineTo(72.0f, 36.0f),
                    PathNode.CurveTo(69.79086f, 36.0f, 68.0f, 37.79086f, 68.0f, 40.0f),
                    PathNode.LineTo(68.0f, 168.0f),
                    PathNode.CurveTo(68.04409f, 209.95538f, 102.04464f, 243.9559f, 144.0f, 244.0f),
                    PathNode.CurveTo(146.20914f, 244.0f, 148.0f, 242.20914f, 148.0f, 240.0f),
                    PathNode.LineTo(148.0f, 172.0f),
                    PathNode.LineTo(152.0f, 172.0f),
                    PathNode.CurveTo(189.55536f, 172.0f, 220.0f, 141.55536f, 220.0f, 104.0f),
                    PathNode.CurveTo(220.0f, 66.44463f, 189.55536f, 36.0f, 152.0f, 36.0f),
                    PathNode.Close,
                    PathNode.MoveTo(76.0f, 55.27f),
                    PathNode.LineTo(137.16f, 164.0f),
                    PathNode.LineTo(76.0f, 164.0f),
                    PathNode.Close,
                    PathNode.MoveTo(140.0f, 152.73f),
                    PathNode.LineTo(78.84f, 44.0f),
                    PathNode.LineTo(140.0f, 44.0f),
                    PathNode.Close,
                    PathNode.MoveTo(76.13f, 172.0f),
                    PathNode.LineTo(140.0f, 172.0f),
                    PathNode.LineTo(140.0f, 235.88f),
                    PathNode.CurveTo(105.61885f, 233.8029f, 78.20172f, 206.38147f, 76.13f, 172.0f),
                    PathNode.Close,
                    PathNode.MoveTo(152.0f, 164.0f),
                    PathNode.LineTo(148.0f, 164.0f),
                    PathNode.LineTo(148.0f, 44.0f),
                    PathNode.LineTo(152.0f, 44.0f),
                    PathNode.CurveTo(185.13708f, 44.0f, 212.0f, 70.862915f, 212.0f, 104.0f),
                    PathNode.CurveTo(212.0f, 137.13708f, 185.13708f, 164.0f, 152.0f, 164.0f),
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
        return _phosphorLogo!!
    }

private var _phosphorLogo: ImageVector? = null
