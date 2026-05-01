package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Towel: ImageVector
    get() {
        if (_towel != null) return _towel!!
        _towel = phosphorBoldIcon(
            name = "Towel",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(197.16f, 20.0f),
                    PathNode.CurveTo(196.69f, 20.0f, 196.23f, 20.0f, 195.77f, 20.0f),
                    PathNode.LineTo(72.0f, 20.0f),
                    PathNode.CurveTo(56.53603f, 20.0f, 44.0f, 32.536026f, 44.0f, 48.0f),
                    PathNode.LineTo(44.0f, 216.0f),
                    PathNode.CurveTo(44.0f, 227.0457f, 52.954304f, 236.0f, 64.0f, 236.0f),
                    PathNode.LineTo(168.0f, 236.0f),
                    PathNode.CurveTo(179.0457f, 236.0f, 188.0f, 227.0457f, 188.0f, 216.0f),
                    PathNode.LineTo(188.0f, 52.0f),
                    PathNode.CurveTo(188.0f, 47.581722f, 191.58173f, 44.0f, 196.0f, 44.0f),
                    PathNode.LineTo(196.35f, 44.0f),
                    PathNode.CurveTo(200.76122f, 44.33361f, 204.14226f, 48.05715f, 204.05f, 52.48f),
                    PathNode.LineTo(204.05f, 148.0f),
                    PathNode.CurveTo(204.05f, 154.62741f, 209.42258f, 160.0f, 216.05f, 160.0f),
                    PathNode.CurveTo(222.67741f, 160.0f, 228.05f, 154.62741f, 228.05f, 148.0f),
                    PathNode.LineTo(228.05f, 52.48f),
                    PathNode.CurveTo(228.25256f, 35.072857f, 214.5554f, 20.670664f, 197.16f, 20.0f),
                    PathNode.Close,
                    PathNode.MoveTo(72.0f, 44.0f),
                    PathNode.LineTo(165.0f, 44.0f),
                    PathNode.CurveTo(164.33324f, 46.61432f, 163.99728f, 49.301994f, 164.0f, 52.0f),
                    PathNode.LineTo(164.0f, 172.0f),
                    PathNode.LineTo(68.0f, 172.0f),
                    PathNode.LineTo(68.0f, 48.0f),
                    PathNode.CurveTo(68.0f, 45.79086f, 69.79086f, 44.0f, 72.0f, 44.0f),
                    PathNode.Close,
                    PathNode.MoveTo(68.0f, 212.0f),
                    PathNode.LineTo(68.0f, 196.0f),
                    PathNode.LineTo(164.0f, 196.0f),
                    PathNode.LineTo(164.0f, 212.0f),
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
        return _towel!!
    }

private var _towel: ImageVector? = null
