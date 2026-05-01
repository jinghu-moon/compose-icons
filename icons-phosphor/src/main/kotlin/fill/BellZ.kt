package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.BellZ: ImageVector
    get() {
        if (_bellZ != null) return _bellZ!!
        _bellZ = phosphorFillIcon(
            name = "BellZ",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(221.8f, 175.94f),
                    PathNode.CurveTo(216.25f, 166.38f, 208.0f, 139.33f, 208.0f, 104.0f),
                    PathNode.CurveTo(208.0f, 59.81722f, 172.18279f, 24.0f, 128.0f, 24.0f),
                    PathNode.CurveTo(83.81722f, 24.0f, 48.0f, 59.81722f, 48.0f, 104.0f),
                    PathNode.CurveTo(48.0f, 139.34f, 39.74f, 166.38f, 34.19f, 175.94f),
                    PathNode.CurveTo(31.305237f, 180.8869f, 31.284256f, 186.99834f, 34.134987f, 191.96494f),
                    PathNode.CurveTo(36.985718f, 196.9315f, 42.27343f, 199.99585f, 48.0f, 200.0f),
                    PathNode.LineTo(88.81f, 200.0f),
                    PathNode.CurveTo(92.61512f, 218.61942f, 108.995766f, 231.99101f, 128.0f, 231.99101f),
                    PathNode.CurveTo(147.00423f, 231.99101f, 163.38487f, 218.61942f, 167.19f, 200.0f),
                    PathNode.LineTo(208.0f, 200.0f),
                    PathNode.CurveTo(213.72478f, 199.99228f, 219.00922f, 196.92653f, 221.85751f, 191.96059f),
                    PathNode.CurveTo(224.7058f, 186.99466f, 224.68387f, 180.88536f, 221.8f, 175.94f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 216.0f),
                    PathNode.CurveTo(117.83194f, 215.99686f, 108.769356f, 209.58655f, 105.38f, 200.0f),
                    PathNode.LineTo(150.62f, 200.0f),
                    PathNode.CurveTo(147.23064f, 209.58655f, 138.16808f, 215.99686f, 128.0f, 216.0f),
                    PathNode.Close,
                    PathNode.MoveTo(144.0f, 152.0f),
                    PathNode.LineTo(112.0f, 152.0f),
                    PathNode.CurveTo(109.04999f, 151.99823f, 106.34034f, 150.37311f, 104.94959f, 147.77147f),
                    PathNode.CurveTo(103.55885f, 145.16985f, 103.71274f, 142.01398f, 105.35f, 139.56f),
                    PathNode.LineTo(129.05f, 104.0f),
                    PathNode.LineTo(112.0f, 104.0f),
                    PathNode.CurveTo(107.58172f, 104.0f, 104.0f, 100.41828f, 104.0f, 96.0f),
                    PathNode.CurveTo(104.0f, 91.58172f, 107.58172f, 88.0f, 112.0f, 88.0f),
                    PathNode.LineTo(144.0f, 88.0f),
                    PathNode.CurveTo(146.95001f, 88.00177f, 149.65967f, 89.6269f, 151.05042f, 92.22852f),
                    PathNode.CurveTo(152.44115f, 94.83015f, 152.28726f, 97.98602f, 150.65f, 100.44f),
                    PathNode.LineTo(127.0f, 136.0f),
                    PathNode.LineTo(144.0f, 136.0f),
                    PathNode.CurveTo(148.41827f, 136.0f, 152.0f, 139.58173f, 152.0f, 144.0f),
                    PathNode.CurveTo(152.0f, 148.41827f, 148.41827f, 152.0f, 144.0f, 152.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 4f,
            )
        }
        return _bellZ!!
    }

private var _bellZ: ImageVector? = null
