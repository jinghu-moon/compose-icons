package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Visor: ImageVector
    get() {
        if (_visor != null) return _visor!!
        _visor = phosphorFillIcon(
            name = "Visor",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(183.05f, 56.0f),
                    PathNode.LineTo(72.0f, 56.0f),
                    PathNode.CurveTo(52.31435f, 55.999912f, 33.487137f, 64.06011f, 19.899885f, 78.30481f),
                    PathNode.CurveTo(6.312634f, 92.549515f, -0.8496f, 111.73631f, 0.08f, 131.4f),
                    PathNode.CurveTo(1.77f, 168.09f, 31.84f, 198.19f, 68.53f, 199.92f),
                    PathNode.CurveTo(84.37f, 200.64f, 100.53f, 194.02f, 117.91f, 179.62f),
                    PathNode.CurveTo(123.78127f, 174.75955f, 132.27873f, 174.75955f, 138.15f, 179.62f),
                    PathNode.CurveTo(148.72f, 188.39f, 165.0f, 200.0f, 184.0f, 200.0f),
                    PathNode.CurveTo(203.26134f, 200.00168f, 221.72026f, 192.28572f, 235.25053f, 178.57693f),
                    PathNode.CurveTo(248.7808f, 164.86813f, 256.25415f, 146.30965f, 256.0f, 127.05f),
                    PathNode.CurveTo(255.49f, 87.87f, 222.76f, 56.0f, 183.05f, 56.0f),
                    PathNode.Close,
                    PathNode.MoveTo(176.0f, 104.0f),
                    PathNode.LineTo(80.0f, 104.0f),
                    PathNode.CurveTo(75.58172f, 104.0f, 72.0f, 100.41828f, 72.0f, 96.0f),
                    PathNode.CurveTo(72.0f, 91.58172f, 75.58172f, 88.0f, 80.0f, 88.0f),
                    PathNode.LineTo(176.0f, 88.0f),
                    PathNode.CurveTo(180.41827f, 88.0f, 184.0f, 91.58172f, 184.0f, 96.0f),
                    PathNode.CurveTo(184.0f, 100.41828f, 180.41827f, 104.0f, 176.0f, 104.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 4f,
            )
        }
        return _visor!!
    }

private var _visor: ImageVector? = null
