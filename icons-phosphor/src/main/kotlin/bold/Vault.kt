package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Vault: ImageVector
    get() {
        if (_vault != null) return _vault!!
        _vault = phosphorBoldIcon(
            name = "Vault",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(216.0f, 36.0f),
                    PathNode.LineTo(40.0f, 36.0f),
                    PathNode.CurveTo(28.954306f, 36.0f, 20.0f, 44.954304f, 20.0f, 56.0f),
                    PathNode.LineTo(20.0f, 192.0f),
                    PathNode.CurveTo(20.0f, 203.0457f, 28.954306f, 212.0f, 40.0f, 212.0f),
                    PathNode.LineTo(52.0f, 212.0f),
                    PathNode.LineTo(52.0f, 224.0f),
                    PathNode.CurveTo(52.0f, 230.62741f, 57.37258f, 236.0f, 64.0f, 236.0f),
                    PathNode.CurveTo(70.62742f, 236.0f, 76.0f, 230.62741f, 76.0f, 224.0f),
                    PathNode.LineTo(76.0f, 212.0f),
                    PathNode.LineTo(180.0f, 212.0f),
                    PathNode.LineTo(180.0f, 224.0f),
                    PathNode.CurveTo(180.0f, 230.62741f, 185.37259f, 236.0f, 192.0f, 236.0f),
                    PathNode.CurveTo(198.62741f, 236.0f, 204.0f, 230.62741f, 204.0f, 224.0f),
                    PathNode.LineTo(204.0f, 212.0f),
                    PathNode.LineTo(216.0f, 212.0f),
                    PathNode.CurveTo(227.0457f, 212.0f, 236.0f, 203.0457f, 236.0f, 192.0f),
                    PathNode.LineTo(236.0f, 56.0f),
                    PathNode.CurveTo(236.0f, 44.954304f, 227.0457f, 36.0f, 216.0f, 36.0f),
                    PathNode.Close,
                    PathNode.MoveTo(44.0f, 188.0f),
                    PathNode.LineTo(44.0f, 60.0f),
                    PathNode.LineTo(212.0f, 60.0f),
                    PathNode.LineTo(212.0f, 112.0f),
                    PathNode.LineTo(190.32f, 112.0f),
                    PathNode.CurveTo(184.33095f, 90.872604f, 163.68105f, 77.395676f, 141.9303f, 80.41899f),
                    PathNode.CurveTo(120.17954f, 83.44231f, 103.987976f, 102.04014f, 103.987976f, 124.0f),
                    PathNode.CurveTo(103.987976f, 145.95987f, 120.17954f, 164.5577f, 141.9303f, 167.58101f),
                    PathNode.CurveTo(163.68105f, 170.60432f, 184.33095f, 157.1274f, 190.32f, 136.0f),
                    PathNode.LineTo(212.0f, 136.0f),
                    PathNode.LineTo(212.0f, 188.0f),
                    PathNode.Close,
                    PathNode.MoveTo(168.0f, 124.0f),
                    PathNode.CurveTo(168.0f, 135.0457f, 159.0457f, 144.0f, 148.0f, 144.0f),
                    PathNode.CurveTo(136.9543f, 144.0f, 128.0f, 135.0457f, 128.0f, 124.0f),
                    PathNode.CurveTo(128.0f, 112.95431f, 136.9543f, 104.0f, 148.0f, 104.0f),
                    PathNode.CurveTo(159.0457f, 104.0f, 168.0f, 112.95431f, 168.0f, 124.0f),
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
        return _vault!!
    }

private var _vault: ImageVector? = null
